package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

trait Data extends ChatRenderable {
  def described: DescribedData;
}

sealed trait DescribedData {
  def value: Data;
  def version: String;
}

object DescribedData {
  implicit def rw: RW[DescribedData] = RW.merge(
    macroRW[AmmoD],
    macroRW[ArmourD],
    macroRW[ArmourModD],
    macroRW[AugmentationD],
    macroRW[ModdedArmourD],
    macroRW[WeaponWithAmmoD],
    macroRW[WeaponD],
    macroRW[WeaponAccessoryD],
    macroRW[DerangementD],
    macroRW[DisorderD],
    macroRW[EPTraitD],
    macroRW[GearD],
    macroRW[SoftwareD],
    macroRW[SubstanceD],
    macroRW[MorphModelD],
    macroRW[MorphInstanceD],
    macroRW[PsiSleightD],
    macroRW[SkillDefD],
    macroRW[CharacterD]);

  @upickle.implicits.key("Ammo")
  final case class AmmoD(value: Ammo, version: String) extends DescribedData;
  @upickle.implicits.key("Armour")
  final case class ArmourD(value: Armour, version: String) extends DescribedData;
  @upickle.implicits.key("ArmourMod")
  final case class ArmourModD(value: ArmourMod, version: String) extends DescribedData;
  @upickle.implicits.key("Augmentation")
  final case class AugmentationD(value: Augmentation, version: String) extends DescribedData;
  @upickle.implicits.key("ModdedArmour")
  final case class ModdedArmourD(value: ModdedArmour, version: String) extends DescribedData;
  @upickle.implicits.key("WeaponWithAmmo")
  final case class WeaponWithAmmoD(value: WeaponWithAmmo, version: String) extends DescribedData;
  @upickle.implicits.key("Weapon")
  final case class WeaponD(value: Weapon, version: String) extends DescribedData;
  @upickle.implicits.key("WeaponAccessory")
  final case class WeaponAccessoryD(value: WeaponAccessory, version: String) extends DescribedData;
  @upickle.implicits.key("Derangment")
  final case class DerangementD(value: Derangement, version: String) extends DescribedData;
  @upickle.implicits.key("Disorder")
  final case class DisorderD(value: Disorder, version: String) extends DescribedData;
  @upickle.implicits.key("EPTrait")
  final case class EPTraitD(value: EPTrait, version: String) extends DescribedData;
  @upickle.implicits.key("Gear")
  final case class GearD(value: Gear, version: String) extends DescribedData;
  @upickle.implicits.key("Software")
  final case class SoftwareD(value: Software, version: String) extends DescribedData;
  @upickle.implicits.key("Substance")
  final case class SubstanceD(value: Substance, version: String) extends DescribedData;
  @upickle.implicits.key("MorphModel")
  final case class MorphModelD(value: MorphModel, version: String) extends DescribedData;
  @upickle.implicits.key("MorphInstance")
  final case class MorphInstanceD(value: MorphInstance, version: String) extends DescribedData;
  @upickle.implicits.key("PsiSleight")
  final case class PsiSleightD(value: PsiSleight, version: String) extends DescribedData;
  @upickle.implicits.key("SkillDef")
  final case class SkillDefD(value: SkillDef, version: String) extends DescribedData;

  @upickle.implicits.key("Character")
  final case class CharacterD(value: EPCharacter, version: String) extends DescribedData;
}
