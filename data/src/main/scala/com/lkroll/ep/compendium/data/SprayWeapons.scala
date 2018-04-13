package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object SprayWeapons {
  import FiringMode._;

  val buzzer = Weapon(
    name = "Buzzer",
    `type` = WeaponType.Spray,
    descr = "Equipped with a specialized nanobot hive, Buzzers are used to spray a nanoswarm (p. 328) on a target or area. They have a limited capacity of swarms, though the nanohive can construct one new swarm each hour. This weapon is two-handed.",
    dmgD10 = 0,
    dmgConst = 0,
    dmgType = DamageType.Energy, // NA
    effect = Some("Nanoswarm"),
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(5, 15, 30, 50),
    gun = GunExtras(
      modes = Set(SS),
      magazineSize = 3),
    source = Sources.ep);

  val freezer = Weapon(
    name = "Freezer",
    `type` = WeaponType.Spray,
    descr = "Freezers spew out a fast-hardening foam that immediately begins to harden. They are primarily used as a non-lethal method of immobilizing or securing a target. Struck characters must immediately make a REF × 3 Test or become trapped. Apply a –30 modifier to this test if the attacker scored an Excellent Success (MoS 30+). The foam allows characters to breath even if their mouth and nose are covered, but it may impede sight. Freezer foam can be spiked with contact toxins or drugs to additionally sedate the target. It can also be used to construct temporary barricades or cover. Hardened foam has an Armor of 10 and Durability of 20. It slowly breaks down and degrades over a 12 hour period. Freezers are two-handed.",
    dmgD10 = 0,
    dmgConst = 0,
    dmgType = DamageType.Kinetic, // NA
    effect = Some("Incapacitation"),
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(5, 15, 30, 50),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 20),
    source = Sources.ep);

  val shardPistol = Weapon(
    name = "Shard Pistol",
    `type` = WeaponType.Spray,
    descr = "The shard pistol is a flechette weapon, firing a stream of of diamondoid monomolecular shards at high velocities. These micro flechettes are very good at penetrating armor, but they do not disperse kinetic energy well and so do not cause as much tissue damage as kinetic weapons. Shard ammunition is often coated with drugs or toxins for extra efficiency.",
    dmgD10 = 1,
    dmgConst = 6,
    dmgType = DamageType.Kinetic, // NA
    effect = None,
    ap = -10,
    price = Cost.Low,
    range = Range.Ranged(10, 30, 50, 70),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 100),
    source = Sources.ep);

  val shredder = Weapon(
    name = "Shredder",
    `type` = WeaponType.Spray,
    descr = "A heavier version of the shard pistol, the shredder fires a larger cloud of lethal flechettes, enough to shred a portion of the target into a fine mist.",
    dmgD10 = 2,
    dmgConst = 5,
    dmgType = DamageType.Kinetic, // NA
    effect = None,
    ap = -10,
    price = Cost.Moderate,
    range = Range.Ranged(10, 40, 70, 100),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 100),
    source = Sources.ep);

  val sprayer = Weapon(
    name = "Sprayer",
    `type` = WeaponType.Spray,
    descr = "This is a general-purpose two-handed squirtgun, loaded with tanks filled with the chemical or drug of the wielder’s choice.",
    dmgD10 = 0,
    dmgConst = 0,
    dmgType = DamageType.Kinetic, // NA
    effect = Some("Chemical/Drug"),
    ap = 0,
    price = Cost.Low,
    range = Range.Ranged(5, 15, 30, 50),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 20),
    source = Sources.ep);

  val torch = Weapon(
    name = "Torch",
    `type` = WeaponType.Spray,
    descr = "This modern flamethrower uses condensed ammunition capsules rather than fuel tanks, scorching targets and setting them on fire. Any hit that is an Excellent Success (MoS 30+) sets the target on fire, where they will continue to take 2d10 damage per Action Turn. These chemical fires are particularly difficult to put out unless they are deprived of oxygen. Torches are two-handed.",
    dmgD10 = 3,
    dmgConst = 0,
    dmgType = DamageType.Energy, // NA
    effect = Some("Burn"),
    ap = -4,
    price = Cost.Moderate,
    range = Range.Ranged(5, 15, 30, 50),
    gun = GunExtras(
      modes = Set(SS),
      magazineSize = 20),
    source = Sources.ep);

  val list: List[Weapon] = Macros.memberList[Weapon];
}
