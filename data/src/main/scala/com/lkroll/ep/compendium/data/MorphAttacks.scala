package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object MorphAttacks {
  val beakAttack = Weapon(
    name = "Beak/Claw Attack",
    `type` = WeaponType.Unarmed,
    descr = "Beak/Claw Attack",
    dmgD10 = 1,
    dmgConst = 1,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg);

  val beakLaser = Weapon(
    name = "Beak Laser",
    `type` = WeaponType.Beam,
    descr = "Custom Hand Laser mounted on top of the Blackbird's beak. Makes it look a bit like a Toucan.",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Energy,
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(30, 80, 125, 230),
    source = Sources.ep);

  val bite = Weapon(
    name = "Bite",
    `type` = WeaponType.Unarmed,
    descr = "Bite",
    dmgD10 = 1,
    dmgConst = 1,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep  
    );

  val claw = Weapon(
    name = "Claw",
    `type` = WeaponType.Unarmed,
    descr = "Claw Attack",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep  
    );

  val disassemblyTools = Weapon(
    name = "Disassembly Tools",
    `type` = WeaponType.Unarmed,
    descr = "Melee attacks with the large-size frame or disassembly tools",
    dmgD10 = 3,
    dmgConst = 0, //TODO insert calculation: (SOM / 10)
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -5,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep  
    );

  val neoAvianBeak = Weapon(
    name = "Beak/Claw Attack",
    `type` = WeaponType.Unarmed,
    descr = "Beak/Claw Attack",
    dmgD10 = 1,
    dmgConst = 1,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg);

  val neoOrcaBite = Weapon(
    name = "Bite",
    `type` = WeaponType.Unarmed,
    descr = "Bite",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep  
    );

  val ramming = Weapon(
    name = "Ramming Attack",
    `type` = WeaponType.Unarmed,
    descr = "Ramming Attack",
    dmgD10 = 1,
    dmgConst = 0,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg);

  val neoWhaleRamming = Weapon(
    name = "Bite",
    `type` = WeaponType.Unarmed,
    descr = "Bite",
    dmgD10 = 4,
    dmgConst = 0,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg);

  val neoWhaleBite = Weapon(
    name = "Ramming Attack",
    `type` = WeaponType.Unarmed,
    descr = "Ramming Attack",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg);
}
