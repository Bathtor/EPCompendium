package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

sealed trait MorphType extends EnumEntry with ChatRenderable {
  def label: String = this.entryName;
  override def templateKV: Map[String, String] = Map("Morph Type" -> label);
}
object MorphType extends Enum[MorphType] with UPickleEnum[MorphType] {
  case object Biomorph extends MorphType;
  case object Infomorph extends MorphType;
  case object Pod extends MorphType;
  case object Synthmorph extends MorphType;

  val values = findValues;
}

case class MorphModel(name: String, morphType: MorphType, descr: String,
                      enhancements: Seq[String], traits: Seq[String] = Seq.empty,
                      movement: Seq[String] = Seq("Walker 4/20"), aptitudeMax: AptitudeValues,
                      aptitudeBonus: AptitudeValues = AptitudeValues.none, skillBonus: Seq[SkillMod] = Seq.empty,
                      playerDecisions: Option[String] = None, attacks: Seq[Weapon] = Seq.empty,
                      durability: Int, armour: Option[(Int, Int)] = None, cpCost: Int, price: Cost, source: String) extends ChatRenderable {

  override def templateTitle: String = name;
  override def templateSubTitle: String = morphType.label
  override def templateKV: Map[String, String] =
    Map(
      "Enhancements/Implants" -> enhancements.mkString(", "),
      "Traits" -> traits.mkString(", "),
      "Movement" -> movement.mkString(", "),
      "Aptitude Maximum" -> aptitudeMax.maxString,
      "Aptitude Boni" -> aptitudeBonus.boniString,
      "Skill Boni" -> skillBonus.map(b => b.bonusString).mkString(", "),
      "Player Decisions" -> playerDecisions.getOrElse("none"),
      "Attacks" -> attacks.map(a => a.summaryString).mkString(", "),
      "Durability" -> durability.toString(),
      "Armour" -> armour.map(t => s"${t._1}/${t._2}").getOrElse("0/0"),
      "CP" -> cpCost.toString(),
      "Source" -> source) ++
      price.templateKV;
  override def templateDescr: String = descr;
}
object MorphModel {
  implicit def rw: RW[MorphModel] = macroRW;

  val dataType = "morphmodel";
}

case class MorphInstance(label: String, model: String, morphType: MorphType, descr: String,
                         visibleGender: Option[String] = None, visibleAge: Option[Int] = None, location: Option[String] = None,
                         enhancements: Seq[String], traits: Seq[String] = Seq.empty,
                         movement: Seq[String] = Seq("Walker 4/20"), aptitudeMax: AptitudeValues,
                         aptitudeBonus: AptitudeValues = AptitudeValues.none, skillBonus: Seq[SkillMod] = Seq.empty,
                         attacks: Seq[Weapon] = Seq.empty, durability: Int, armour: Option[(Int, Int)] = None) extends ChatRenderable {

  override def templateTitle: String = s"$label ($model)";
  override def templateSubTitle: String = morphType.label
  override def templateKV: Map[String, String] =
    Map(
      "Based on" -> model,
      "Visible Gender" -> visibleGender.getOrElse("none"),
      "Visible Age" -> visibleAge.map(_.toString).getOrElse("none"),
      "Location" -> location.getOrElse("unkown"),
      "Enhancements/Implants" -> enhancements.mkString(", "),
      "Traits" -> traits.mkString(", "),
      "Movement" -> movement.mkString(", "),
      "Aptitude Maximum" -> aptitudeMax.maxString,
      "Aptitude Boni" -> aptitudeBonus.boniString,
      "Skill Boni" -> skillBonus.map(b => b.bonusString).mkString(", "),
      "Attacks" -> attacks.map(a => a.summaryString).mkString(", "),
      "Durability" -> durability.toString(),
      "Armour" -> armour.map(t => s"${t._1}/${t._2}").getOrElse("0/0"));
  override def templateDescr: String = descr;
}
object MorphInstance {
  implicit def rw: RW[MorphInstance] = macroRW;

  val dataType = "morphinstance";

  def fromModel(model: MorphModel, label: String): MorphInstance = {
    MorphInstance(
      label = label,
      model = model.name,
      morphType = model.morphType,
      descr = model.descr,
      enhancements = model.enhancements,
      traits = model.traits,
      movement = model.movement,
      aptitudeMax = model.aptitudeMax,
      aptitudeBonus = model.aptitudeBonus,
      skillBonus = model.skillBonus,
      attacks = model.attacks,
      durability = model.durability,
      armour = model.armour)
  }
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

case class SkillMod(skill: String, field: Option[String] = None, mod: Int) {
  def bonusString: String = field match {
    case Some(f) if mod > 0  => s"+$mod $skill ($f) skill"
    case Some(f) if mod <= 0 => s"$mod $skill ($f) skill"
    case None if mod > 0     => s"+$mod $skill skill"
    case None if mod <= 0    => s"$mod $skill skill"
  }
}
object SkillMod {
  implicit def rw: RW[SkillMod] = macroRW;
}
