package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object Clubs {
  val club = Weapon(
    name = "Club",
    `type` = WeaponType.Clubs,
    descr = "Clubs encompasses a wide range of one-handed blunt objects, from saps to sticks to pipes.",
    dmgD10 = 1,
    dmgConst = 2,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.Trivial,
    range = Range.Melee,
    source = Sources.ep);

  val extendableBaton = Weapon(
    name = "Extendable Baton",
    `type` = WeaponType.Clubs,
    descr = "This hardened composite baton retracts into its handle for easy carrying, storage, or concealment. Extending it simply requires a flick or an electronic signal.",
    dmgD10 = 1,
    dmgConst = 2,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = 0,
    price = Cost.Trivial,
    range = Range.Melee,
    source = Sources.ep);

  val shockBaton = Weapon(
    name = "Shock Baton",
    `type` = WeaponType.Clubs,
    descr = "Shock batons are standard clubs used for policing duties, but when activated they also deliver an electric shock to struck targets.",
    dmgD10 = 1,
    dmgConst = 2,
    dmgType = DamageType.Kinetic,
    effect = Some("Shock"),
    ap = 0,
    price = Cost.Low,
    range = Range.Melee,
    source = Sources.ep);

  val list: List[Weapon] = Macros.memberList[Weapon];
}
