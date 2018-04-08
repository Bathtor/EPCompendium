package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object KineticWeapons {
  import FiringMode._;

  val lightPistol = Weapon(
    name = "Light Pistol",
    `type` = WeaponType.Kinetic,
    descr = "Pistols are small-sized (Gear Sizes, p. 297) and designed for one-hand use. Light pistols sacrifice penetrating ability for concealability. Heavy pistols focus on stopping power, with medium pistols occupying a middle ground. All versions fire in semi-automatic, burst-fire, and full-auto modes.",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.Low,
    range = Range.Ranged(10, 25, 40, 60),
    gun = GunExtras(
      modes = Set(SA, BF, FA),
      magazineSize = 16));

  val list: List[Weapon] = Macros.memberList[Weapon];
}
