package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object Blades {
  val diamondAx = Weapon(
    name = "Diamond Ax",
    `type` = WeaponType.Blades,
    descr = "Commonly found on many habitats for fire and emergency purposes, axes require two hands to wield. Their blades are diamond-coated for superior cutting ability.",
    dmgD10 = 2,
    dmgConst = 3,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -3,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase");

  val flexCutter = Weapon(
    name = "Flex Cutter",
    `type` = WeaponType.Blades,
    descr = "The blade of this machete-like weapon is made of a memory polymer. When deactivated, the blade is limp and flexible, and may even be rolled up or otherwise easily concealed. When activated, however, the blade stiffens and sharpens into a vicious slashing weapon.",
    dmgD10 = 1,
    dmgConst = 3,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -1,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase");

  val knife = Weapon(
    name = "Knife",
    `type` = WeaponType.Blades,
    descr = "A standard cutting implement, still carried by many.",
    dmgD10 = 1,
    dmgConst = 2,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -1,
    price = Cost.Trivial,
    range = Range.Melee,
    source = "Eclipse Phase");

  val monofilamentSword = Weapon(
    name = "Monofilament Sword",
    `type` = WeaponType.Blades,
    descr = "Though swords are rather archaic in the time of Eclipse Phase, a few eccentrics take advantage of modern versions with a self-sharpening near-monomolecular edge, easily capable of slicing through metal or limbs.",
    dmgD10 = 2,
    dmgConst = 2,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -4,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase");

  val vibroblade = Weapon(
    name = "Vibroblade",
    `type` = WeaponType.Blades,
    descr = "These buzzing electronic blades vibrate at a high frequency for extra cutting ability. This has little extra effect when stabbing or slashing, but provides an extra –3 AP and +2d10 damage when carefully sawing through something.",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -2,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase");

  val waspKnife = Weapon(
    name = "Wasp Knife",
    `type` = WeaponType.Blades,
    descr = "Wasp knives are equipped with a canister in their handle. The common use is to fill these canisters with pressured air, which inflates inside the target. This is potentially lethal in vacuum or pressurized environments (like underwater), as the gas bursts out of the body cavity to escape (+2d10 damage in such situations). Wasp knives may also be loaded with chemicals, drugs, or nanobots. The target must be damaged for the canister’s contents to affect them.",
    dmgD10 = 1,
    dmgConst = 2,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -1,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase");

  //val list = List(diamondAx, flexCutter, knife, monofilamentSword, vibroBlade, waspKnife);
  val list: List[Weapon] = Macros.memberList[Weapon];
}
