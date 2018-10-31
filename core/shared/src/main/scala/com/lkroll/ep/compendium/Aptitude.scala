package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

sealed trait Aptitude extends EnumEntry {
  def label: String = this.entryName;

  def +(mod: Int): Effect.AptitudeMod = Effect.AptitudeMod(this, mod);
  def -(mod: Int): Effect.AptitudeMod = Effect.AptitudeMod(this, -mod);
}
object Aptitude extends Enum[Aptitude] with UPickleEnum[Aptitude] {
  case object COG extends Aptitude;
  case object COO extends Aptitude;
  case object INT extends Aptitude;
  case object REF extends Aptitude;
  case object SAV extends Aptitude;
  case object SOM extends Aptitude;
  case object WIL extends Aptitude;

  val values = findValues;
}

case class AptitudeValues(cog: Option[Int] = None, coo: Option[Int] = None, int: Option[Int] = None,
                          ref: Option[Int] = None, sav: Option[Int] = None, som: Option[Int] = None,
                          wil: Option[Int] = None) {

  private def allEqual[T](params: T*): Boolean = {
    if (params.isEmpty) {
      true
    } else {
      val head = params.head;
      params.forall(p => p == head)
    }
  }

  def toKV: List[(String, String)] = this.labelledValues.map {
    case (k, v) => (k.toUpperCase() -> v.get.toString)
  };

  def getValueFor(apt: Aptitude): Option[Int] = {
    apt match {
      case Aptitude.COG => cog
      case Aptitude.COO => coo
      case Aptitude.INT => int
      case Aptitude.REF => ref
      case Aptitude.SAV => sav
      case Aptitude.SOM => som
      case Aptitude.WIL => wil
    }
  }
  def valueFor(apt: Aptitude): Int = {
    getValueFor(apt).getOrElse(0)
  }

  def labelledValues: List[(String, Option[Int])] = List(
    "COG" -> cog,
    "COO" -> coo,
    "INT" -> int,
    "REF" -> ref,
    "SAV" -> sav,
    "SOM" -> som,
    "WIL" -> wil);

  def maxString: String = {
    if (allEqual(cog, coo, int, ref, sav, som, wil)) {
      cog match {
        case Some(x) => x.toString()
        case None    => "0"
      }
    } else {
      labelledValues.map(t => s"${t._1} ${t._2.getOrElse(0)}").mkString(", ")
    }
  }

  def boniString: String = {
    if (allEqual(cog, coo, int, ref, sav, som, wil)) {
      cog match {
        case Some(x) if x > 0 => s"+$x"
        case Some(x) if x < 0 => s"$x"
        case None             => ""
      }
    } else {
      labelledValues.flatMap(t => t._2 match {
        case Some(i) if i > 0 => Some(s"+$i ${t._1}")
        case Some(i) if i < 0 => Some(s"$i ${t._1}")
        case _                => None
      }).mkString(", ")
    }
  }
}

object AptitudeValues {
  implicit def rw: RW[AptitudeValues] = macroRW;

  def max(all: Int): AptitudeValues = AptitudeValues(Some(all), Some(all), Some(all), Some(all), Some(all), Some(all), Some(all));
  def none: AptitudeValues = AptitudeValues();
}
