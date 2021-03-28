package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}

sealed trait SleightType extends EnumEntry {
  def label: String = s"Psi-${this.toString()}";
}
object SleightType extends Enum[SleightType] with UPickleEnum[SleightType] {

  case object Chi extends SleightType;
  case object Gamma extends SleightType;
  case object Epsilon extends SleightType;

  val values = findValues;
}

case class PsiSleight(name: String,
                      sleightType: SleightType,
                      psiType: PsiType,
                      descr: String,
                      source: String,
                      sourcePage: Int
) extends ChatRenderable
    with Data {
  override def lookupName: String = name;
  override def templateTitle: String = name;
  override def templateSubTitle: String = s"${sleightType} Sleight";
  override def templateKV: Map[String, String] =
    psiType.templateKV ++
      Map("Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;
  override def described: DescribedData = DescribedData.PsiSleightD(this, BuildInfo.version);
}
object PsiSleight {
  implicit def rw: RW[PsiSleight] = macroRW;
  val dataType: String = "psisleight";
}

sealed trait PsiType extends ChatRenderable {
  def label: String;
  def action: String;
  def range: PsiRange;
  def duration: PsiDuration;
  def strainMod: Option[Int];
  def skill: Option[String];

  override def templateKV: Map[String, String] =
    Map(
      "Psi Type" -> label,
      "Action" -> action,
      "Range" -> range.label,
      "Duration" -> duration.label,
      "Strain Mod" -> strainMod.map(_.toString).getOrElse("–"),
      "Skill" -> skill.getOrElse("–")
    );
}
object PsiType {
  implicit def rw: RW[PsiType] = RW.merge(macroRW[Active], macroRW[Passive])

  @upickle.implicits.key("Active")
  case class Active(action: String,
                    range: PsiRange,
                    duration: PsiDuration,
                    strainMod: Option[Int],
                    skill: Option[String] = None
  ) extends PsiType {
    override def label: String = "Active";
  }

  @upickle.implicits.key("Passive")
  case class Passive(action: String = "Automatic",
                     range: PsiRange = PsiRange.Self,
                     duration: PsiDuration = PsiDuration.Constant
  ) extends PsiType {
    override def label: String = "Passive";

    override def strainMod: Option[Int] = None;
    override def skill: Option[String] = None;
  }
}

sealed trait PsiRange extends EnumEntry {
  def label: String = this.toString();
}
object PsiRange extends Enum[PsiRange] with UPickleEnum[PsiRange] {

  case object Self extends PsiRange;
  case object Touch extends PsiRange;
  case object Close extends PsiRange;

  val values = findValues;
}

sealed trait PsiDuration { self =>
  def label: String = self.toString();
}
object PsiDuration {
  implicit val rw: RW[PsiDuration] =
    RW.merge(macroRW[Constant.type], macroRW[Instant.type], macroRW[Sustained.type], macroRW[Temp]);

  @upickle.implicits.key("Constant")
  case object Constant extends PsiDuration;
  @upickle.implicits.key("Instant")
  case object Instant extends PsiDuration;
  @upickle.implicits.key("Sustained")
  case object Sustained extends PsiDuration;
  @upickle.implicits.key("Temp")
  case class Temp(units: String) extends PsiDuration {
    override def label: String = s"Temp ($units)";
  }
}

object PsiSkill {
  val sense = "Sense";
  val control = "Control";
  val psiAssault = "Psi Assault";
}
