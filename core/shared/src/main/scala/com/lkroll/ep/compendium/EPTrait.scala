package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

sealed trait TraitType {
  def modifyName(name: String): String;
}
object TraitType {
  implicit def rw: RW[TraitType] = RW.merge(
    macroRW[Positive.type],
    macroRW[Negative.type],
    macroRW[Neutral.type]);

  @upickle.key("Positive")
  case object Positive extends TraitType {
    override def modifyName(name: String): String = s"+ $name";
  }
  @upickle.key("Negative")
  case object Negative extends TraitType {
    override def modifyName(name: String): String = s"- $name";
  }
  @upickle.key("Neutral")
  case object Neutral extends TraitType {
    override def modifyName(name: String): String = s"· $name";
  }
}

sealed trait TraitApplicability {
  def label: String;
}
object TraitApplicability {
  implicit def rw: RW[TraitApplicability] = RW.merge(
    macroRW[Ego.type],
    macroRW[Morph.type],
    macroRW[Both.type]);

  @upickle.key("Ego")
  case object Ego extends TraitApplicability {
    override def label: String = "Ego trait";
  }
  @upickle.key("Morph")
  case object Morph extends TraitApplicability {
    override def label: String = "Morph trait";
  }
  @upickle.key("Both")
  case object Both extends TraitApplicability {
    override def label: String = "Ego or Morph trait";
  }
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
