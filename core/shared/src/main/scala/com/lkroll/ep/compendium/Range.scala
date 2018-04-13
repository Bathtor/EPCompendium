package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }
import scalatags.Text.all._

sealed trait Range extends ChatRenderable {
}
object Range {

  implicit def rw: RW[Range] = RW.merge(
    macroRW[Melee.type],
    Thrown.rw,
    Ranged.rw);

  import Math.ceil;
  @upickle.key("Melee")
  case object Melee extends Range {
    override def templateKV: Map[String, String] = Map("Range" -> "Melee");
  }
  @upickle.key("Ranged")
  case class Ranged(shortUpper: Int, mediumUpper: Int, longUpper: Int, extremeUpper: Int) extends Range {
    override def templateKV: Map[String, String] = Map(
      "Short Range" -> s"2-$shortUpper",
      "Medium Range" -> s"${shortUpper + 1}-$mediumUpper",
      "Long Range" -> s"${mediumUpper + 1}-$longUpper",
      "Extreme Range" -> s"${longUpper + 1}-$extremeUpper");

    def *(d: Double): Ranged = Ranged(
      shortUpper = Math.round(this.shortUpper.toDouble * d).toInt,
      mediumUpper = Math.round(this.mediumUpper.toDouble * d).toInt,
      longUpper = Math.round(this.longUpper.toDouble * d).toInt,
      extremeUpper = Math.round(this.extremeUpper.toDouble * d).toInt);
    def *(i: Int): Ranged = Ranged(
      shortUpper = this.shortUpper * i,
      mediumUpper = this.mediumUpper * i,
      longUpper = this.longUpper * i,
      extremeUpper = this.extremeUpper * i);
    def +(i: Int): Ranged = Ranged(
      shortUpper = this.shortUpper + i,
      mediumUpper = this.mediumUpper + i,
      longUpper = this.longUpper + i,
      extremeUpper = this.extremeUpper + i);
  }
  object Ranged {
    implicit def rw: RW[Ranged] = macroRW;
  }
  sealed trait Thrown extends Range {
    def variant: String;
    def shortUpper(som: Int): Int;
    def mediumUpper(som: Int): Int;
    def longUpper(som: Int): Int;
    def extremeUpperUpper(som: Int): Int;
    override def templateKV: Map[String, String] = Map("Range" -> s"Thrown (${variant})"); // TODO make nice maybe
  }
  object Thrown {
    implicit def rw: RW[Thrown] = RW.merge(
      macroRW[ThrownBlades.type],
      macroRW[ThrownMinigrenades.type],
      macroRW[ThrownGrenades.type]);
  }
  @upickle.key("ThrownBlades")
  case object ThrownBlades extends Thrown {
    def variant: String = "Blades";
    override def shortUpper(som: Int): Int = ceilDiv(som, 5);
    override def mediumUpper(som: Int): Int = ceilDiv(som, 2);
    override def longUpper(som: Int): Int = som;
    override def extremeUpperUpper(som: Int): Int = som * 2;
  }
  @upickle.key("ThrownMinigrenades")
  case object ThrownMinigrenades extends Thrown {
    def variant: String = "Minigrenades";
    override def shortUpper(som: Int): Int = ceilDiv(som, 2);
    override def mediumUpper(som: Int): Int = som;
    override def longUpper(som: Int): Int = som * 2;
    override def extremeUpperUpper(som: Int): Int = som * 3;
  }
  @upickle.key("ThrownGrenades")
  case object ThrownGrenades extends Thrown {
    def variant: String = "Grenades";
    override def shortUpper(som: Int): Int = ceilDiv(som, 5);
    override def mediumUpper(som: Int): Int = ceilDiv(som, 2);
    override def longUpper(som: Int): Int = som;
    override def extremeUpperUpper(som: Int): Int = som * 3;
  }
}
