package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object KineticAmmo {
  import WeaponType.{ Kinetic, Railgun }

  implicit def int2ap(i: Int): APMod = APMod.Const(i);
  implicit def int2dmg(i: Int): DamageMod = DamageMod.Const(0, i);
  implicit def inttup2dmg(t: (Int, Int)): DamageMod = DamageMod.Const(t._1, t._2);

  val shock = DamageMod.Effect("shock");

  val ap = Ammo(
    name = "Armour-Piercing",
    descr = "This tungsten-carbide ammunition penetrates armour effectively.",
    appliesTo = List(Kinetic, Railgun),
    apMod = -5,
    dmgMod = -2,
    price = Cost.Low,
    source = Sources.ep);

  val regular = Ammo(
    name = "Regular",
    descr = "This standard metal projectile is designed to put holes into morphs.",
    appliesTo = List(Kinetic, Railgun),
    price = Cost.Trivial,
    source = Sources.ep);

  val list: List[Ammo] = Macros.memberList[Ammo];
}
