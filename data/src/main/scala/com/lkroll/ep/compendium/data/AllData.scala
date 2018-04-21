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
    Grenades.standard);
  val morphModels: List[List[MorphModel]] = List(
    MorphsAC.list,
    MorphsDF.list,
    MorphsGL.list);
  val morphInstances: List[List[MorphInstance]] = List(MorphExamples.list);
  val ammo: List[List[Ammo]] = List(
    KineticAmmo.list,
    Missiles.micro,
    Missiles.mini,
    Missiles.standard);
  val traits: List[List[EPTrait]] = List(
    TraitsPositiveEP.list,
    TraitsRimward.list,
    TraitsSunward.list);
  val derangements: List[List[Derangement]] = List(Derangements.list);
  val disorders: List[List[Disorder]] = List(Disorders.list);
  val armour: List[List[Armour]] = List(ArmourEP.list);
  val gear: List[List[Gear]] = List(CommunicationsGear.list);
  val software: List[List[Software]] = List(SoftwareEP.list);

  val authors: Map[String, String] = Map(
    "Lars Kroll" -> "bathtor@googlemail.com",
    "Liroth" -> "liroth@gmx.net", 
    "Alex Ormenisan" -> "ormenisan.adrian@gmail.com");
}
