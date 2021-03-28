package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object MorphAttacks {
  import FiringMode._;

  val beakAttack = Weapon(
    name = "Beak/Claw Attack",
    `type` = WeaponType.Unarmed,
    descr = "Beak/Claw Attack",
    damage = (1.d10 + 1).kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val beakLaser = Weapon(
    name = "Beak Laser",
    `type` = WeaponType.Beam,
    descr = "Custom Hand Laser mounted on top of the Blackbird's beak. Makes it look a bit like a Toucan.",
    damage = (2.d10 + 0).energy,
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(30, 80, 125, 230),
    gun = GunExtras(modes = Set(SS), // doesn't really say
                    magazineSize = 50
    ),
    source = Sources.ep
  );

  val handLaser = Weapon(
    name = "Hand Laser",
    `type` = WeaponType.Beam,
    descr = "Weapon-grade Laser implanted into the morph's forearm.",
    damage = (2.d10 + 0).energy,
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(30, 80, 125, 230),
    gun = GunExtras(modes = Set(SS), // doesn't really say
                    magazineSize = 50
    ),
    source = Sources.ep
  );

  val bite = Weapon(name = "Bite",
                    `type` = WeaponType.Unarmed,
                    descr = "Bite",
                    damage = (1.d10 + 1).kinetic,
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
    damage = (2.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep
  );

  val bioClaw = Weapon(
    name = "Bioware Claw",
    `type` = WeaponType.Unarmed,
    descr = "Claw Attack",
    damage = (1.d10 + 1).kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep
  );

  val cyberClaw = Weapon(
    name = "Cyberclaw",
    `type` = WeaponType.Unarmed,
    descr = "Claw Attack",
    damage = (1.d10 + 3).kinetic,
    effect = None,
    ap = -2,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep
  );

  val diggingClaw = Weapon(
    name = "Digging Claw",
    `type` = WeaponType.Unarmed,
    descr = "Claw Attack",
    damage = (1.d10 + 2).kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.ep
  );

  val disassemblyTools = Weapon(
    name = "Disassembly Tools",
    `type` = WeaponType.Unarmed,
    descr = "Melee attacks with the large-size frame or disassembly tools",
    damage = (3.d10 + 0).kinetic,
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
    damage = (1.d10 + 1).kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val neoOrcaBite = Weapon(name = "Bite",
                           `type` = WeaponType.Unarmed,
                           descr = "Bite",
                           damage = (2.d10 + 0).kinetic,
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
    damage = (1.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val neoWhaleRamming = Weapon(name = "Bite",
                               `type` = WeaponType.Unarmed,
                               descr = "Bite",
                               damage = (4.d10 + 0).kinetic,
                               effect = None,
                               ap = 0,
                               price = Cost.None,
                               range = Range.Melee,
                               source = Sources.mrg
  );

  val neoWhaleBite = Weapon(
    name = "Ramming Attack",
    `type` = WeaponType.Unarmed,
    descr = "Ramming Attack",
    damage = (2.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val octomorphBeak = Weapon(
    name = "Beak Attack",
    `type` = WeaponType.Unarmed,
    descr = "Beak Attack",
    damage = (1.d10 + 0).kinetic,
    effect = None,
    ap = -1,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val octomorphInk = Weapon(
    name = "Ink Attack",
    `type` = WeaponType.ExoticRangedWeapon("Ink"),
    descr = "Ink Attack - blinding, use Exotic Ranged: Ink Attack skill",
    damage = (0.d10 + 0).kinetic,
    effect = Some("Blinding"),
    ap = 0,
    price = Cost.None,
    range = Range.Ranged(5, 15, 30, 50), //TODO - made up value - copy from spray weapon
    area = DamageArea.Cone,
    source = Sources.mrg
  );

  val qmorphClaw = Weapon(
    name = "Q-Morph Claw attack",
    `type` = WeaponType.Unarmed,
    descr = "Q-Morph Claw attack",
    damage = (2.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val ripwingAttack = Weapon(
    name = "Ripwing Beak/Claw attack",
    `type` = WeaponType.Unarmed,
    descr = "Ripwing Beak/Claw attack",
    damage = (1.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val takkoBeak = Weapon(
    name = "Takko Beak Attack",
    `type` = WeaponType.Unarmed,
    descr = "Takko Beak Attack",
    damage = (1.d10 + 2).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );

  val whiplashTendril = Weapon(
    name = "Whiplash Tendril Attack",
    `type` = WeaponType.Unarmed,
    descr = "Whiplash Tendril Attack - +10 to disarming called shot attacks",
    damage = (1.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = Sources.mrg
  );
}
