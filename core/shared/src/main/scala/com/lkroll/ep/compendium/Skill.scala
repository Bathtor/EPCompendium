package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

case class SkillDef(
  name:         String,
  field:        Option[String]       = None,
  cls:          SkillClass,
  category:     SkillCategory,
  apt:          Aptitude,
  noDefaulting: Boolean              = false,
  sampleFields: Option[List[String]] = None,
  sampleSpecs:  List[String]         = List("N/A"),
  descr:        String) extends ChatRenderable with Data {

  override def lookupName: String = name;

  override def templateTitle: String = if (field.isDefined) {
    if (field.get == "???") s"$name: [Field]" else s"$name: ${field.get}"
  } else name;

  override def templateSubTitle: String = cls match {
    case SkillClass.Active    => s"${category.entryName} Skill"
    case SkillClass.Knowledge => s"Knowledge Skill"
  };
  override def templateKV: Map[String, String] = Map(
    "Linked Aptitude" -> (if (noDefaulting) s"${apt.label} (no defaulting)" else apt.label),
    "Sample Specs" -> sampleSpecs.mkString(", ")) ++
    sampleFields.map(sf => ("Sample Fields" -> sf.mkString(", "))).toMap;
  override def templateDescr: String = descr;
  override def described: DescribedData = DescribedData.SkillDefD(this, BuildInfo.version);

  def matches(other: SkillDef): Boolean = {
    if (this.name == other.name) {
      (this.field, other.field) match {
        case (None, None)                      => true
        case (Some(_), None) | (None, Some(_)) => false
        case (Some(f1), Some(f2))              => f1 == f2
      }
    } else {
      false
    }
  }
}

object SkillDef {
  implicit def rw: RW[SkillDef] = macroRW;
  val dataType: String = "skilldef";
}

sealed trait SkillClass extends EnumEntry;
object SkillClass extends Enum[SkillClass] with UPickleEnum[SkillClass] {

  case object Active extends SkillClass;
  case object Knowledge extends SkillClass;

  val values = findValues;
}

sealed trait SkillCategory extends EnumEntry;
object SkillCategory extends Enum[SkillCategory] with UPickleEnum[SkillCategory] {

  case object Combat extends SkillCategory;
  case object Mental extends SkillCategory;
  case object Physical extends SkillCategory;
  case object Psi extends SkillCategory;
  case object Social extends SkillCategory;
  case object Technical extends SkillCategory;
  case object Vehicle extends SkillCategory;
  case object NA extends SkillCategory;

  val values = findValues;
}

case class CharacterSkill(
  name:         String,
  field:        Option[String] = None,
  cls:          SkillClass,
  category:     SkillCategory,
  apt:          Aptitude,
  noDefaulting: Boolean        = false,
  ranks:        Int            = 0,
  specs:        List[String]   = Nil)

object CharacterSkill {
  implicit def rw: RW[CharacterSkill] = macroRW;
}

