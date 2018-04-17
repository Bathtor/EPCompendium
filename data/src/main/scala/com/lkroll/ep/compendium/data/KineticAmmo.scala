package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object KineticAmmo {
  import WeaponType.{ Kinetic, Railgun }

  implicit def int2ap(i: Int): APMod = APMod.Const(i);
  implicit def int2dmg(i: Int): DamageMod = DamageMod.Const(0, i);
  implicit def inttup2dmg(t: (Int, Int)): DamageMod = DamageMod.Const(t._1, t._2);

  val shock = DamageMod.Effect("shock");

  // DUMB AMMO

  val ap = Ammo(
    name = "Armour-Piercing",
    descr = "This tungsten-carbide ammunition penetrates armour effectively.",
    appliesTo = List(Kinetic, Railgun),
    apMod = -5,
    dmgMod = -2,
    price = Cost.Low,
    source = Sources.ep);

  val bug = Ammo(
    name = "Bug",
    descr = "Bug rounds are equipped with a microbug and medical sensor nanobots. They attempt to gather information on the target’s location (via standard mesh tracking), health (querying the target’s medichines), and surroundings (typically hindered by being inside the target’s body). They will transmit status reports in a pre-programmed manner via the mesh or a pre-chosen frequency band either continuously or in pre-set intervals.",
    appliesTo = List(Kinetic),
    apMod = 1,
    dmgMod = (-1, 0),
    price = Cost.Low,
    source = Sources.ep);

  val capsule = Ammo(
    name = "Capsule",
    descr = "Capsule ammo carries a payload (drug, toxin, nanobots) that is released inside the target after the round penetrates.",
    appliesTo = List(Kinetic),
    apMod = 1,
    dmgMod = DamageMod.Half,
    price = Cost.Trivial,
    source = Sources.ep);

  // skip flux as anyone it would have to be 2 imports, so you can just import regular and plastic separately

  val hollowPoint = Ammo(
    name = "Hollow-Point",
    descr = "Hollow-point bullets are designed to deform and widen once they penetrate a target, thus inflicting more damage.",
    appliesTo = List(Kinetic),
    apMod = 2,
    dmgMod = (1, 0),
    price = Cost.Trivial,
    source = Sources.ep);

  val jammer = Ammo(
    name = "Jammer",
    descr = "Jammers stick to the target and pulse out jamming electromagnetic signals, jamming the target’s wireless communications. If an Opposed Test is called for, these devices have an Interface of 30. See Radio Jamming, p. 262.",
    appliesTo = List(Kinetic),
    dmgMod = DamageMod.NoDamage,
    price = Cost.Low,
    source = Sources.ep);

  val plastic = Ammo(
    name = "Plastic",
    descr = "Plastic ammo is designed to hurt but not wound targets, and is commonly used for crowd control purposes. Note AV doubled!",
    appliesTo = List(Kinetic),
    dmgMod = DamageMod.Half,
    price = Cost.Trivial,
    source = Sources.ep);

  val reactive = Ammo(
    name = "Reactive",
    descr = "The casing on these projectiles is made of reactive materials that release a large amount of energy when subjected to a sudden shock or impact – such as striking a target. In other words, they explode or superheat when they hit. ",
    appliesTo = List(Kinetic),
    apMod = -2,
    dmgMod = +2,
    price = Cost.Low,
    source = Sources.ep);

  val reactiveAP = Ammo(
    name = "Reactive Armour-Piercing",
    descr = "This is a tungsten-carbide armor-piercing round with a reactive casing, allowing the ammunition to penetrate even further.",
    appliesTo = List(Kinetic),
    apMod = -6,
    dmgMod = -1,
    price = Cost.Moderate,
    source = Sources.ep);

  val regular = Ammo(
    name = "Regular",
    descr = "This standard metal projectile is designed to put holes into morphs.",
    appliesTo = List(Kinetic, Railgun),
    price = Cost.Trivial,
    source = Sources.ep);

  val splash = Ammo(
    name = "Splash",
    descr = "Splash rounds carry a payload like capsule ammo, but are designed to break upon impact rather than penetrating, splashing their contents on the target’s exterior. Splash rounds are typically loaded with paint, taggant nanobots, tracker dye, and similar substances.",
    appliesTo = List(Kinetic),
    dmgMod = DamageMod.NoDamage,
    price = Cost.Trivial,
    source = Sources.ep);

  val zap = Ammo(
    name = "Zap",
    descr = "Zap rounds are rubber or gel bullets that create an electric charge upon firing in a piezoelectric like manner to stun the target effectively with both the bullet and the electric shock.",
    appliesTo = List(Kinetic),
    apMod = +2,
    dmgMod = DamageMod.Half ++ shock,
    price = Cost.Trivial,
    source = Sources.ep);

  // SMART AMMO

  val accushot = Ammo(
    name = "Accushot",
    descr = "Accushot bullets change shape within flight to keep dead on course, countering the effects of wind, drag, and gravity over distance. Attacks made with accushot bullets ignore all range modifiers.",
    appliesTo = List(Kinetic),
    dmgMod = DamageMod.Effect("Ignore range mods."),
    price = Cost.Low,
    source = Sources.ep);

  val biter = Ammo(
    name = "Biter",
    descr = "Biters are specially designed to fragment in opposite proportion to the hardness of the target they strike. For hard targets (synthmorphs), they frag- ment very little, blasting a big hole. For soft targets (biomorphs), they fragment and tumble in multiple directions within the body.",
    appliesTo = List(Kinetic),
    dmgMod = (1, 0),
    price = Cost.Low,
    source = Sources.ep);

  val flayer = Ammo(
    name = "Flayer",
    descr = "Flayers have nanosensors to detect an oncoming impact, shooting out monomolecular barbs as they are about to strike a target. These monowires cut through the target along with the bullet, inflicting additional damage.",
    appliesTo = List(Kinetic),
    dmgMod = +2,
    price = Cost.Low,
    source = Sources.ep);

  val homing = Ammo(
    name = "Homing",
    descr = "When fired with a smartlink system, the bullet identifies the target and uses nanosensors to lock on, correcting the bullet’s trajectory with surface alterations and tiny vectored nozzles. Apply a +10 modifier to the Attack Test, cumulative with aiming and smartlink modifiers. Homing bullets may also be used for indirect fire (p. 195).",
    appliesTo = List(Kinetic),
    dmgMod = DamageMod.Effect("+10 Attack"),
    price = Cost.Low,
    source = Sources.ep);

  val laserGuided = Ammo(
    name = "Laser-Guided",
    descr = "These bullets function like homing smart rounds (apply the +10 attack modifier), except rather than requiring a smartlink system, they lock onto the reflection of the laser sight used to paint the target. Laser-guided bullets may also be used for indirect fire (p. 195).",
    appliesTo = List(Kinetic),
    dmgMod = DamageMod.Effect("+10 Attack"),
    price = Cost.Low,
    source = Sources.ep);

  val proximity = Ammo(
    name = "Proximity",
    descr = "Proximity is an explosive ammunition that identifies the target when fired via smartlink. If the round determines that it will miss the target, it will still explode if it reaches the close proximity of the target. If the attack misses with an MoF of 10 or less, the round explodes 1d10 meters away from the target and inflicts 1d10 area effect damage (see Blast Effect, p. 193) in the proximity of the target.",
    appliesTo = List(Kinetic),
    apMod = -1,
    dmgMod = DamageMod.Effect("Blast Effect on Miss") ++ +2,
    areaMod = DamageAreaMod.Replace(DamageArea.Blast),
    price = Cost.Moderate,
    source = Sources.ep);

  val zero = Ammo(
    name = "Zero",
    descr = "Similar to homing smart rounds, zero bullets identify the target when fired via smartlink. Whether the round hits or misses, however, it sends telem- etry data back to the next zero bullet, allowing it to course-correct and “zero in” to hit the target (or hit more accurately). Apply a +10 modifier to each shot (or burst) fired after the first against the same target in the same Action Turn.",
    appliesTo = List(Kinetic),
    dmgMod = DamageMod.Effect("+10 Attack after first"),
    price = Cost.Low,
    source = Sources.ep);

  val list: List[Ammo] = Macros.memberList[Ammo];
}
