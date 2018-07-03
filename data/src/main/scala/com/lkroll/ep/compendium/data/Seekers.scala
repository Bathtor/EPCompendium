package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Seekers {
  import FiringMode._;
  import MissileSize._

  val disposableLauncher = Weapon(
    name = "Disposable Launcher",
    `type` = WeaponType.Seeker(StandardMissile),
    descr = "This launcher is pre-packed with one standard missile (included in price).",
    damage = (0.d10 + 0),
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(300, 1000, 3000, 10000),
    gun = GunExtras(
      modes = Set(SS),
      magazineSize = 1),
    source = Sources.ep);

  val seekerArmband = Weapon(
    name = "Seeker Armband",
    `type` = WeaponType.Seeker(Micromissile),
    descr = "This weapons unit is worn on the arm, allowing the user to point and fire using an entoptic smartlink system. Though highly portable, the armband’s micromissile supply is low. It fires in single-shot mode.",
    damage = (0.d10 + 0),
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(70, 180, 600, 2000),
    gun = GunExtras(
      modes = Set(SS),
      magazineSize = 4),
    source = Sources.ep);

  val seekerPistol = Weapon(
    name = "Seeker Pistol",
    `type` = WeaponType.Seeker(Micromissile),
    descr = "This pistol-sized seeker launcher fires micromissiles in semi-auto mode.",
    damage = (0.d10 + 0),
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(70, 180, 600, 2000),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 8),
    source = Sources.ep);

  val seekerRifleMicro = Weapon(
    name = "Seeker Rifle for Micromissiles",
    `type` = WeaponType.Seeker(Micromissile),
    descr = "The seeker rifle comes in a bullpup configuration and fires either micromissiles or minimissiles in semi-auto mode. It is a two-handed weapons.",
    damage = (0.d10 + 0),
    effect = None,
    ap = 0,
    price = Cost.High,
    range = Range.Ranged(70, 180, 600, 2000),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 12),
    source = Sources.ep);

  val seekerRifleMini = Weapon(
    name = "Seeker Rifle for Minimissiles",
    `type` = WeaponType.Seeker(Minimissile),
    descr = "The seeker rifle comes in a bullpup configuration and fires either micromissiles or minimissiles in semi-auto mode. It is a two-handed weapons.",
    damage = (0.d10 + 0),
    effect = None,
    ap = 0,
    price = Cost.High,
    range = Range.Ranged(150, 300, 1000, 3000),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 6),
    source = Sources.ep);

  val underbarrelSeeker = Weapon(
    name = "Underbarrel Seeker",
    `type` = WeaponType.Seeker(Micromissile),
    descr = "This seeker micromissile launcher is commonly attached to the underbarrel of SMGs or assault rifles. It fires in semi- auto mode.",
    damage = (0.d10 + 0),
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(70, 180, 600, 2000),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 6),
    source = Sources.ep);

  val list: List[Weapon] = Macros.memberList[Weapon];
}
