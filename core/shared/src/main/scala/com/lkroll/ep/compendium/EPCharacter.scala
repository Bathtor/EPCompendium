package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}

case class EPCharacter(name: String,
                       gender: GenderIdentity,
                       age: Int = -1,
                       motivations: List[Motivation] = Nil,
                       faction: String = "None",
                       aptitudes: Aptitudes,
                       moxie: Int = 0,
                       skills: List[CharacterSkill],
                       background: String,
                       startingMorph: MorphModel,
                       activeMorph: MorphInstance,
                       traits: List[EPTrait] = Nil,
                       history: List[String] = Nil,
                       startingCredit: Int = 0,
                       rep: Map[RepNetwork, Int] = Map.empty,
                       isAsync: Boolean = false,
                       psiChiSleights: List[PsiSleight] = Nil,
                       psiGammaSleights: List[PsiSleight] = Nil,
                       gear: List[GearEntry] = Nil,
                       weapons: List[Either[Weapon, WeaponWithAmmo]] = Nil,
                       armour: List[Either[Armour, ModdedArmour]] = Nil,
                       software: List[Software] = Nil)
    extends Data {

  override def templateTitle: String = name;
  override def templateSubTitle: String = s"${gender.entryName} character";
  override def templateKV: Map[String, String] =
    Map(
      "Age" -> age.toString,
      "Background" -> background,
      "Motivations" -> motivations.map(_.text).mkString(", "),
      "Faction" -> faction,
      "Starting Morph" -> startingMorph.name,
      "Active Morph" -> activeMorph.model,
      "Async?" -> isAsync.toString(),
      "Traits" -> traits.map(_.templateTitle).mkString(", ")
    );
  override def templateDescr: String = history.map(entry => s"- $entry").mkString("\n");
  override def described: DescribedData = DescribedData.CharacterD(this, BuildInfo.version);
}

object EPCharacter {
  implicit def rw: RW[EPCharacter] = macroRW;
}

case class GearEntry(item: Gear, count: Int)
object GearEntry {
  implicit def rw: RW[GearEntry] = macroRW;
}

case class Aptitudes(base: AptitudeValues, morphBoni: AptitudeValues, morphMax: AptitudeValues) {
  def cog: Int = total(Aptitude.COG);
  def coo: Int = total(Aptitude.COO);
  def int: Int = total(Aptitude.INT);
  def ref: Int = total(Aptitude.REF);
  def sav: Int = total(Aptitude.SAV);
  def som: Int = total(Aptitude.SOM);
  def wil: Int = total(Aptitude.WIL);

  def total: AptitudeValues =
    AptitudeValues(cog = Some(cog),
                   coo = Some(coo),
                   int = Some(int),
                   ref = Some(ref),
                   sav = Some(sav),
                   som = Some(som),
                   wil = Some(wil));

  private def total(apt: Aptitude): Int = {
    Math.min(morphMax.getValueFor(apt).getOrElse(20), base.valueFor(apt) + morphBoni.valueFor(apt))
  }
}
object Aptitudes {
  implicit def rw: RW[Aptitudes] = macroRW;
}

sealed trait GenderIdentity extends EnumEntry;
object GenderIdentity extends Enum[GenderIdentity] with UPickleEnum[GenderIdentity] {

  case object Male extends GenderIdentity;
  case object Female extends GenderIdentity;
  case object Genderless extends GenderIdentity;
  case object Plurality extends GenderIdentity;
  case object Other extends GenderIdentity;

  val values = findValues;
}

case class RepNetwork(name: String, networkingField: String)
object RepNetwork {
  implicit def rw: RW[RepNetwork] = macroRW;
}

case class Motivation(kind: MotivationKind, descr: String) {
  lazy val text: String = kind match {
    case MotivationKind.Like    => s"+$descr"
    case MotivationKind.Dislike => s"-$descr"
    case MotivationKind.Either  => s"+/-$descr"
  }
}
object Motivation {
  implicit def rw: RW[Motivation] = macroRW;
}

sealed trait MotivationKind extends EnumEntry;
object MotivationKind extends Enum[MotivationKind] with UPickleEnum[MotivationKind] {
  case object Like extends MotivationKind
  case object Dislike extends MotivationKind
  case object Either extends MotivationKind

  val values = findValues;
}
