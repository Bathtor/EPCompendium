package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object AllData {
  val weapons: List[List[Weapon]] = List(
    Blades.list,
    Clubs.list,
    Unarmed.list,
    KineticWeapons.list,
    KineticWeapons.railguns,
    BeamWeapons.list,
    Seekers.list,
    SprayWeapons.list,
    ExoticWeapons.list,
    Grenades.micro,
    Grenades.standard,
    MountedWeapons.list
  );
  val weaponAccessories: List[List[WeaponAccessory]] = List(WeaponAccessories.list);
  val morphModels: List[List[MorphModel]] =
    List(MorphsAC.list, MorphsDF.list, MorphsGL.list, MorphsMN.list, MorphsOR.list, MorphsS.list, MorphsTX.list);

  val morphInstances: List[List[MorphInstance]] = List(MorphExamples.list);
  val ammo: List[List[Ammo]] = List(KineticAmmo.list, Missiles.micro, Missiles.mini, Missiles.standard);
  val traits: List[List[EPTrait]] = List(
    TraitsPositiveEP.list,
    TraitsNegativeEP.list,
    TraitsPositiveTranshuman.list,
    TraitsNegativeTranshuman.list,
    TraitsNeutralTranshuman.list,
    TraitsFirewall.list,
    TraitsGatecrashing.list,
    TraitsPanopticon.list,
    TraitsRimward.list,
    TraitsSunward.list
  );
  val derangements: List[List[Derangement]] = List(Derangements.list);
  val disorders: List[List[Disorder]] = List(Disorders.list);
  val armour: List[List[Armour]] = List(ArmourEP.list, Exoskeletons.list);
  val armourMods: List[List[ArmourMod]] = List(ArmourMods.list);
  val gear: List[List[Gear]] = List(
    CommunicationsGear.list,
    CovertTech.list,
    EverydayTech.list,
    Nanotechnology.list,
    ScavengerTech.list,
    SurvivalGear.list,
    Sensors.list,
    ExplorationGear.list,
    XenoarcheologyGear.list
  );
  val augmentations: List[List[Augmentation]] = List(StandardAugmentations.list,
                                                     Bioware.list,
                                                     Cyberware.list,
                                                     Nanoware.list,
                                                     CosmeticMods.list,
                                                     RoboticEnhancements.list,
                                                     SoftwareUpgrades.list
  );
  val skills: List[List[SkillDef]] = List(DefaultSkills.list);
  val substances: List[List[Substance]] = List(
    Drugs.list,
    NanodrugsEP.list,
    NarcoalgorithmsEP.list,
    ChemicalsEP.list,
    ToxinsEP.list,
    NanotoxinsEP.list,
    PathogensEP.list,
    PsyDrugsEP.list,
    SpecialSubstances.list
  );
  val software: List[List[Software]] = List(SoftwareEP.list, SoftwarePlugins.list, SoftwareOther.list);
  val psiSleights: List[List[PsiSleight]] = List(PsiChiSleights.list, PsiGammaSleights.list);

  val described: List[DescribedData] = List(
    flatDescribed(weapons),
    flatDescribed(weaponAccessories),
    flatDescribed(morphModels),
    flatDescribed(morphInstances),
    flatDescribed(ammo),
    flatDescribed(traits),
    flatDescribed(derangements),
    flatDescribed(disorders),
    flatDescribed(armour),
    flatDescribed(armourMods),
    flatDescribed(gear),
    flatDescribed(augmentations),
    flatDescribed(skills),
    flatDescribed(substances),
    flatDescribed(software),
    flatDescribed(psiSleights)
  ).flatten;

  val authors: Map[String, String] = Map(
    "Lars Kroll" -> "bathtor@googlemail.com",
    "Liroth" -> "liroth@gmx.net",
    "Alex Ormenisan" -> "ormenisan.adrian@gmail.com",
    "Jakob Oesinghaus" -> "jakob.oesinghaus@gmail.com"
  );

  private def flatDescribed[D <: Data](l: List[List[D]]): List[DescribedData] = l.flatten.map(_.described);
}
