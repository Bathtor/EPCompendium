package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

sealed trait TraitType extends EnumEntry {
  def modifyName(name: String): String;
}
object TraitType extends Enum[TraitType] with UPickleEnum[TraitType] {

  case object Positive extends TraitType {
    override def modifyName(name: String): String = s"+ $name";
  }
  case object Negative extends TraitType {
    override def modifyName(name: String): String = s"- $name";
  }
  case object Neutral extends TraitType {
    override def modifyName(name: String): String = s"· $name";
  }

  val values = findValues;
}

sealed trait TraitApplicability extends EnumEntry {
  def label: String;
}
object TraitApplicability extends Enum[TraitApplicability] with UPickleEnum[TraitApplicability] {
  case object Ego extends TraitApplicability {
    override def label: String = "Ego trait";
  }
  case object Morph extends TraitApplicability {
    override def label: String = "Morph trait";
  }
  case object Both extends TraitApplicability {
    override def label: String = "Ego or Morph trait";
  }

  val values = findValues;
}

case class EPTrait(name: String, traitType: TraitType, applicability: TraitApplicability,
                   descr: String, cp: Int, source: String, sourcePage: Int) extends ChatRenderable {
  override def lookupName: String = name;
  override def templateTitle: String = traitType.modifyName(name);
  override def templateSubTitle: String = applicability.label;
  override def templateKV: Map[String, String] = Map("CP" -> cp.toString, "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;
}
object EPTrait {
  implicit def rw: RW[EPTrait] = macroRW;
  val dataType: String = "trait";
}
