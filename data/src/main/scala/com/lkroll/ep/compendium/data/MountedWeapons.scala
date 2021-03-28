package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object MountedWeapons {
  import FiringMode._;

  val pointDefenceCannon = Weapon(
    name = "Point Defence Cannon",
    `type` = WeaponType.Mounted,
    descr = """PDCs are ship (or habitat) mounted very-high-rate kinetic weapons, with the primary purpose to scatter incoming objects, in particular missiles, before impact.
      While a station would still take damage from the impact of the scattered parts, a ship will usually try to move out of the way of the incoming debris cloud.
      In Close Quarter Battle (CQB), PDCs can also be used offensively to cripple enemy vessels and their crew.
      PDCs fire in bursts of 9 or full automatic of 30 high-velocity tungsten rounds. Such bursts are much more difficult to avoid than a single bullet from a large railgun, as they can lay out patterns that close escape vectors.""",
    damage = (4.d10 + 12).kinetic,
    effect = None,
    ap = -12,
    price = Cost.High,
    range = Range.Ranged(60000L, 240000L, 500000L, 1000000L),
    gun = GunExtras(modes = Set(BF, FA), magazineSize = 3000),
    source = "Homebrew"
  );
  val pointDefenceCannonRail = pointDefenceCannon.toRailgun;

  val mountedRailgun = Weapon(
    name = "Mounted Railgun",
    `type` = WeaponType.Mounted,
    descr = """These large kinetic weapons are the deadliest designs for Close Quarter Battle conditions. With their extremely high acceleration of 3kg tungsten rounds, and correspondingly extremely short time-to-target, no known countermeasures exist, except not being in the line of fire in the first place.
      On smaller ships, like frigates and corvettes, these weapons often come in keel-mounted versions, while larger vessels, like destroyers or carriers, may have multiple railgun emplacements, with variable vectors of fire.
      Due to their high impulse in firing direction, railguns can only be fired safely when main drives are running (on smaller vessels) or with full thruster capacity on the opposite side (on larger vessels), to balance out the imparted momentum.
      While railgun bullets in vacuum simply continue travelling until they impact on something, of course, the maximum range of a railgun is indicative of when a projectile becomes trivial to avoid. Given 10s of reaction time, even the largest carrier can move out of the projectile's way before impact. This may, of course, not hold true for a large habitat, which is much more difficult to move.""",
    damage = (12.d10 + 40).kinetic,
    effect = None,
    ap = -120,
    price = Cost.ExpensivePlus(1000000),
    range = Range.Ranged(100000L, 200000L, 300000L, 1000000L),
    gun = GunExtras(modes = Set(SS), magazineSize = 1),
    source = "Homebrew"
  );

  val shortRangeGuidedMissile = Weapon(
    name = "Guided Missile (Short Range)",
    `type` = WeaponType.Mounted,
    descr = """Short Range Guided Missiles are extremely high acceleration (around 1500g) guided weapons systems, that carry medium-sized warheads. These missiles are typically passively-guided, relying on active painting for target acquisition.
      While this makes them susceptible to certain kinds of jamming, their short time-to-target makes them deadly nonetheless.
      The maximum (guided) range of these missiles is somewhere around 100k km, based on a maximum burn time of 120s, after which they simply go ballistic, or self destruct, depending on the settings.
      The launch systems for most versions of these missiles allows the whole magazine to be emptied in a single burst. Burst launches can be spread across targets, at the usual -20 per additional target. Alternatively, they can be focused on a single target for a +20 modifier on the attack, as the swarm pattern of the approaching missiles confuses the enemy's PDC targeting systems. A critical failure by the defender, or critical success by the attacker each allows an extra missile to pass through the defences and apply its damage.""",
    damage = (24.d10 + 80).energy,
    area = DamageArea.UniformBlast(5),
    effect = None,
    ap = 0,
    price = Cost.Expensive,
    range = Range.Ranged(60000L, 250000L, 600000, 100000000L),
    gun = GunExtras(modes = Set(SS, BF), magazineSize = 3),
    source = "Homebrew"
  );

  val longRangeGuidedMissile = Weapon(
    name = "Guided Missile (Long Range)",
    `type` = WeaponType.Mounted,
    descr =
      """Long Range Guided Missiles are high acceleration (around 15g sustained) guided weapons systems, that carry large warheads. These missiles are typically self-guided, which sophisticated targeting systems that rely on a mix of lidar, radar, and heat signature tracking. This combination of sensor systems makes them very resistant to jamming.
      The maximum (guided) range of these missiles is somewhere around 500mio km, based on a maximum burn time of 24h, after which they simply go ballistic, or self destruct, depending on the settings.""",
    damage = (48.d10 + 160).energy,
    area = DamageArea.UniformBlast(10),
    effect = None,
    ap = 0,
    price = Cost.ExpensivePlus(200000),
    range = Range.Ranged(60000L, 250000L, 7000000L, 500000000000L),
    gun = GunExtras(modes = Set(SS), magazineSize = 1),
    source = "Homebrew"
  );

  val list: List[Weapon] = Macros.memberList[Weapon];
}
