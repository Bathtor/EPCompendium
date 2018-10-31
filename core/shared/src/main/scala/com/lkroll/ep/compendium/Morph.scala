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
                      aptitudeBonus: AptitudeValues = AptitudeValues.none,
                      otherEffects:  List[Effect]   = List.empty, playerDecisions: Option[String] = None,
                      attacks: Seq[Weapon] = Seq.empty, durability: Int, armour: Option[(Int, Int)] = None,
                      cpCost: Int, price: Cost, source: String) extends ChatRenderable with Data {

  override def templateTitle: String = name;
  override def templateSubTitle: String = morphType.label
  override def templateKV: Map[String, String] =
    Map(
      "Enhancements/Implants" -> enhancements.mkString(", "),
      "Traits" -> traits.mkString(", "),
      "Movement" -> movement.mkString(", "),
      "Aptitude Maximum" -> aptitudeMax.maxString,
      "Aptitude Boni" -> aptitudeBonus.boniString,
      "Effects" -> otherEffects.map(b => b.text).mkString(", "),
      "Player Decisions" -> playerDecisions.getOrElse("none"),
      "Attacks" -> attacks.map(a => a.summaryString).mkString(", "),
      "Durability" -> durability.toString(),
      "Armour" -> armour.map(t => s"${t._1}/${t._2}").getOrElse("0/0"),
      "CP" -> cpCost.toString(),
      "Source" -> source) ++
      price.templateKV;
  override def templateDescr: String = descr;
  override def described: DescribedData = DescribedData.MorphModelD(this);
}
object MorphModel {
  implicit def rw: RW[MorphModel] = macroRW;

  val dataType = "morphmodel";
}

case class MorphInstance(label: String, model: String, morphType: MorphType, descr: String,
                         visibleGender: Option[String] = None, visibleAge: Option[Int] = None, location: Option[String] = None,
                         enhancements: Seq[String], traits: Seq[String] = Seq.empty,
                         movement: Seq[String] = Seq("Walker 4/20"), aptitudeMax: AptitudeValues,
                         aptitudeBonus: AptitudeValues = AptitudeValues.none, otherEffects: List[Effect] = List.empty,
                         attacks: Seq[Weapon] = Seq.empty, durability: Int, armour: Option[(Int, Int)] = None) extends ChatRenderable with Data {

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
      "Effects" -> otherEffects.map(b => b.text).mkString(", "),
      "Attacks" -> attacks.map(a => a.summaryString).mkString(", "),
      "Durability" -> durability.toString(),
      "Armour" -> armour.map(t => s"${t._1}/${t._2}").getOrElse("0/0"));
  override def templateDescr: String = descr;
  override def described: DescribedData = DescribedData.MorphInstanceD(this);
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
      otherEffects = model.otherEffects,
      attacks = model.attacks,
      durability = model.durability,
      armour = model.armour)
  }
}
