package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object KineticWeapons {
  import FiringMode._;

  val lightPistol = Weapon(
    name = "Light Pistol",
    `type` = WeaponType.Kinetic,
    descr = "Pistols are small-sized (Gear Sizes, p. 297) and designed for one-hand use. Light pistols sacrifice penetrating ability for concealability. Heavy pistols focus on stopping power, with medium pistols occupying a middle ground. All versions fire in semi-automatic, burst-fire, and full-auto modes.",
    damage = (2.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.Low,
    range = Range.Ranged(10, 25, 40, 60),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 16),
    source = "Eclipse Phase");

  val mediumPistol = Weapon(
    name = "Medium Pistol",
    `type` = WeaponType.Kinetic,
    descr = "Pistols are small-sized (Gear Sizes, p. 297) and designed for one-hand use. Light pistols sacrifice penetrating ability for concealability. Heavy pistols focus on stopping power, with medium pistols occupying a middle ground. All versions fire in semi-automatic, burst-fire, and full-auto modes.",
    damage = (2.d10 + 2).kinetic,
    effect = None,
    ap = -2,
    price = Cost.Low,
    range = Range.Ranged(10, 30, 50, 70),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 12),
    source = "Eclipse Phase");

  val heavyPistol = Weapon(
    name = "Heavy Pistol",
    `type` = WeaponType.Kinetic,
    descr = "Pistols are small-sized (Gear Sizes, p. 297) and designed for one-hand use. Light pistols sacrifice penetrating ability for concealability. Heavy pistols focus on stopping power, with medium pistols occupying a middle ground. All versions fire in semi-automatic, burst-fire, and full-auto modes.",
    damage = (2.d10 + 4).kinetic,
    effect = None,
    ap = -4,
    price = Cost.Low,
    range = Range.Ranged(10, 35, 60, 80),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 10),
    source = "Eclipse Phase");

  val submachineGun = Weapon(
    name = "Submachine Gun",
    `type` = WeaponType.Kinetic,
    descr = "SMGs use pistol ammunition, but are medium-sized (Gear Sizes, p. 297) and may fire in semi-auto, burst fire, or full auto modes. They typically are designed in a bullpup confguration for close quarters operations and are ideal for tactical and strike teams.",
    damage = (2.d10 + 5).kinetic,
    effect = None,
    ap = -2,
    price = Cost.Moderate,
    range = Range.Ranged(30, 80, 125, 230),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 20),
    source = "Eclipse Phase");

  val auomaticRifle = Weapon(
    name = "Automatic Rifle",
    `type` = WeaponType.Kinetic,
    descr = "Automatic rifles use rifle ammunition and have greater range and penetration than SMGs. They fire in semi-auto, burst fire, or full auto modes. They are two-handed weapons.",
    damage = (2.d10 + 6).kinetic,
    effect = None,
    ap = -6,
    price = Cost.Moderate,
    range = Range.Ranged(150, 250, 500, 900),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 30),
    source = "Eclipse Phase");

  val sniperRifle = Weapon(
    name = "Sniper Rifle",
    `type` = WeaponType.Kinetic,
    descr = "Sniper rifles are optimized for range, accuracy, penetration, and stopping power. They fire in semiauto mode only and are two-handed weapons.",
    damage = (2.d10 + 10).kinetic,
    effect = None,
    ap = -12,
    price = Cost.High,
    range = Range.Ranged(180, 400, 1100, 2300),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 12),
    source = "Eclipse Phase");

  val machineGun = Weapon(
    name = "Machine Gun",
    `type` = WeaponType.Kinetic,
    descr = "Machine guns are heavy weapons, typically mounted, and intended to provide continuous fire for support or suppressive purposes. They fire in burst fire or full auto modes, and are two-handed weapons.",
    damage = (2.d10 + 6).kinetic,
    effect = None,
    ap = -6,
    price = Cost.High,
    range = Range.Ranged(100, 400, 1000, 2000),
    gun = GunExtras(
      modes = Set(BF, FA),
      magazineSize = 50),
    source = "Eclipse Phase");

  val list: List[Weapon] = Macros.memberList[Weapon];
  lazy val railguns = list.map(w => w.toRailgun);
}
