package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object BeamWeapons {
  import FiringMode._;

  val laserPulser = Weapon(
    name = "Laser Pulser",
    `type` = WeaponType.Beam,
    descr = "Laser weapons use focused beams of light to inflict damage on the target by burning into it and causing its outer surface to vaporize and expand, creating an explosive effect. The laser beam is pulsed in order to bite into the target before the beam is diffused. Pulsers are vulnerable to atmospheric effects like dust, mist, smoke, or rain, however – the gamemaster should reduce their effective range categories as appropriate. Note that laser pulses are invisible in the normal visual spectrum (but are visible to characters with enhanced vision). Pulsers are medium-sized (see p. 297) and fire in semi-auto mode.",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Energy,
    effect = None,
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(30, 100, 150, 250),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 100),
    source = Sources.ep);

  val laserPulserStun = Weapon(
    name = "Laser Pulser (Stun Mode)",
    `type` = WeaponType.Beam,
    descr = "One advantage to the pulser is that it can be placed in less-lethal mode. In this case, it first fires a pulse at the target to create a ball of plasma, quickly fired by a second pulse that strikes the plasma and creates a flash-bang shockwave to stun and disorient the target. This blast has an area of effect with a 1-meter radius. Anyone caught in the blast must make a SOM × 2 Test (SOM × 3 for synthmorphs or biomorphs with any form of pain tolerance). Failure means the target is temporarily stunned and disoriented and loses their next action. A critical failure means the target is knocked down and paralyzed for 1 Action Turn per 10 points of MoF. In this stun setting, the pulser fires only in single-shot mode.",
    dmgD10 = 1,
    dmgConst = 0,
    dmgType = DamageType.Energy,
    effect = Some("Stun"),
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(30, 100, 150, 250),
    gun = GunExtras(
      modes = Set(SS),
      magazineSize = 100),
    source = Sources.ep);

  val agonizer = Weapon(
    name = "Microwave Agonizer",
    `type` = WeaponType.Beam,
    descr = "The agonizer fires millimeter-wave beams that create an unpleasant burning sensation in skin (even through armor) and to metals. Agonizers have two settings. The first is an active denial setting that causes extreme burning pain in the target, inflicting –20 to the target’s actions and forcing them to move away from the beam on their next action unless they succeed in a WIL Test (targets with Level 1 Pain Tolerance or the equivalent only suffer a –10 modifier and roll WIL × 2). Synthetic morphs and biomorphs with Level 2 Pain Tolerance (or the equivalent) are immune to this weapon. The second setting (colloquially known as the “roast” setting) has the same effect of the first, but also actually burns the target, inflicting the listed damage. Originally developed for crowd control, the agonizer is also useful for repelling animals. The agonizer is small-sized (p. 297) and fires in single-shot mode.",
    dmgD10 = 0,
    dmgConst = 0,
    dmgType = DamageType.Energy,
    effect = Some("Pain"),
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(5, 15, 30, 50),
    gun = GunExtras(
      modes = Set(SS),
      magazineSize = 100),
    source = Sources.ep);

  val agonizerRoast = Weapon(
    name = "Microwave Agonizer (Roast Mode)",
    `type` = WeaponType.Beam,
    descr = "The agonizer fires millimeter-wave beams that create an unpleasant burning sensation in skin (even through armor) and to metals. Agonizers have two settings. The first is an active denial setting that causes extreme burning pain in the target, inflicting –20 to the target’s actions and forcing them to move away from the beam on their next action unless they succeed in a WIL Test (targets with Level 1 Pain Tolerance or the equivalent only suffer a –10 modifier and roll WIL × 2). Synthetic morphs and biomorphs with Level 2 Pain Tolerance (or the equivalent) are immune to this weapon. The second setting (colloquially known as the “roast” setting) has the same effect of the first, but also actually burns the target, inflicting the listed damage. Originally developed for crowd control, the agonizer is also useful for repelling animals. The agonizer is small-sized (p. 297) and fires in single-shot mode.",
    dmgD10 = 2,
    dmgConst = 0,
    dmgType = DamageType.Energy,
    effect = Some("Pain"),
    ap = -5,
    price = Cost.Moderate,
    range = Range.Ranged(5, 15, 30, 50),
    gun = GunExtras(
      modes = Set(SS),
      magazineSize = 50),
    source = Sources.ep);

  val bolter = Weapon(
    name = "Particle Beam Bolder",
    `type` = WeaponType.Beam,
    descr = "This weapon shoots a bolt of accelerated particles at near light speed that transfer massive amounts of kinetic energy to the target, super-heating and creating an explosion when striking. The bolter’s beam is not diffused by the cloud that occurs when it strikes, and so it has greater penetration than the laser pulser. Likewise, the bolter is not affected by smoke, fog, or rain. The bolter’s beam is invisible (but visible in infrared). Bolters must be set for either atmospheric or exoatmospheric (vacuum) operation and will not function in the opposite environment, though it only takes a Complex Action to switch. Bolters fire in semi-auto mode and are rifle-sized two-handed weapons.",
    dmgD10 = 2,
    dmgConst = 4,
    dmgType = DamageType.Energy,
    effect = None,
    ap = -2,
    price = Cost.High,
    range = Range.Ranged(30, 100, 150, 300),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 50),
    source = Sources.ep);

  val plasmaRifle = Weapon(
    name = "Plasma Rifle",
    `type` = WeaponType.Beam,
    descr = "This bulky, heavy, two-handed weapon blasts a stream of nova-hot plasma at the target, inflicting severe burns and thermal damage, possibly melting or evaporating the target entirely. Plasma rifles are perhaps the deadliest man-portable weapons in use. Any hit that is an Excellent Success (MoS 30+) sets the target on fire (p. 198); they will continue to take 2d10 damage per Action Turn until extinguished. Plasma guns suffer from dangerous overheating in vacuum and require 1 full Action Turn of cool-down time after every 2 shots. Plasma rifles fire in semi-auto mode.",
    dmgD10 = 3,
    dmgConst = 20,
    dmgType = DamageType.Energy,
    effect = Some("Burn"),
    ap = -8,
    price = Cost.Expensive,
    range = Range.Ranged(20, 50, 100, 300),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 10),
    source = Sources.ep);

  val stunner = Weapon(
    name = "Stunner",
    `type` = WeaponType.Beam,
    descr = "The stunner is an electrolaser that creates an electrically conductive plasma channel to the target, down which it transmits a powerful electric current, shocking the target. Stunners do not work in vacuum. Stunners fire in semi-auto mode.",
    dmgD10 = 1,
    dmgDiv = 2,
    dmgConst = 0,
    dmgType = DamageType.Energy,
    effect = Some("Shock"),
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(10, 25, 40, 60),
    gun = GunExtras(
      modes = Set(SA),
      magazineSize = 200),
    source = Sources.ep);

  val list: List[Weapon] = Macros.memberList[Weapon];
}
