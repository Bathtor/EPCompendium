package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

trait Data {
  def described: DescribedData;
}

sealed trait DescribedData {
  def value: Data;
}

object DescribedData {
  implicit def rw: RW[DescribedData] = RW.merge(
    macroRW[ArmourD],
    macroRW[ModdedArmourD],
    macroRW[WeaponWithAmmoD],
    macroRW[WeaponD],
    macroRW[DerangementD],
    macroRW[DisorderD],
    macroRW[EPTraitD],
    macroRW[GearD],
    macroRW[SoftwareD],
    macroRW[SubstanceD],
    macroRW[MorphModelD],
    macroRW[MorphInstanceD],
    macroRW[PsiSleightD]);

  @upickle.key("Armour")
  final case class ArmourD(value: Armour) extends DescribedData;
  @upickle.key("ModdedArmour")
  final case class ModdedArmourD(value: ModdedArmour) extends DescribedData;
  @upickle.key("WeaponWithAmmo")
  final case class WeaponWithAmmoD(value: WeaponWithAmmo) extends DescribedData;
  @upickle.key("Weapon")
  final case class WeaponD(value: Weapon) extends DescribedData;
  @upickle.key("Derangment")
  final case class DerangementD(value: Derangement) extends DescribedData;
  @upickle.key("Disorder")
  final case class DisorderD(value: Disorder) extends DescribedData;
  @upickle.key("EPTrait")
  final case class EPTraitD(value: EPTrait) extends DescribedData;
  @upickle.key("Gear")
  final case class GearD(value: Gear) extends DescribedData;
  @upickle.key("Software")
  final case class SoftwareD(value: Software) extends DescribedData;
  @upickle.key("Substance")
  final case class SubstanceD(value: Substance) extends DescribedData;
  @upickle.key("MorphModel")
  final case class MorphModelD(value: MorphModel) extends DescribedData;
  @upickle.key("MorphInstance")
  final case class MorphInstanceD(value: MorphInstance) extends DescribedData;
  @upickle.key("PsiSleight")
  final case class PsiSleightD(value: PsiSleight) extends DescribedData;
}
