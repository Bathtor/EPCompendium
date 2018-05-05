package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Exoskeletons {

  val battlesuit = Armour(
    name = "Battlesuit",
    descr = "The battlesuit powered exoskeleton features a military-grade fullerene armor shell with flexible aerogel for thermal insulation and a diamond-hardened exterior designed to resist even potent ballistic and energy-based weapons. The suit also enhances the wearer’s strength and mobility, applying a +10 bonus to strength-based tests, inflicting an extra +1d10 damage and AP of –2 on melee attacks, and doubling the distance by which the character may jump. Battlesuits are completely sealed to protect the wearer from environmental factors and temperatures from –175º to 140ºC. Battlesuit helmets are equipped with an ecto (p. 325), a radio booster (p. 314), and sensors equal to specs (p. 326). They are fitted with life support features and a maker (p. 328) capable of recycling all wastes and producing air for up to 48 hours and food and water indefinitely. These suits have an Armor Value of 21/21. Occupants may only wear armor with an Armor rating (Energy or Kinetic) of 4 or less; this worn armor is cumulative without layering penalties.",
    armour = (21, 21),
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 344);

  val exowalker = Armour(
    name = "Exowalker",
    descr = "Exowalkers are minimal framework exoskeletons, primarily designed to bolster the wearer’s strength and movement. They provide a an Armor Value of 2/4, a +10 modifier to strength-based tests, and double the distance by which the character may jump.",
    armour = (2, 4),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 344);

  val hyperdenseExoskeleton = Armour(
    name = "Hyperdense Exoskeleton",
    descr = "These powered exoskel- etons are larger (roughly twice human-sized) and built for heavy-use industrial purposes, such as handling heavy/large objects. The wearer is partially encapsulated to protect them from debris and industrial accidents. Hyperdense exoskeletons provide no movement bonus, but provide a +30 bonus to strength-based tests and inflict an extra +3d10 damage and –5 AP on physical attacks. They have an Armor Value of 6/12.",
    armour = (6, 12),
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 344);

  val transporter = Armour(
    name = "Transporter",
    descr = "This exoskeleton framework includes a pair of vector-thrust turbofan engines, giving the user flight capabilities in gravity and increased maneuverability in zero g. It provides partial protection to the wearer with an Armor Value of 2/4. Piloted with Pilot: Aircraft skill.",
    armour = (2, 4),
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 344);

  val trike = Armour(
    name = "Trike",
    descr = "The trike exoskeleton is a three-wheeled personal motorcycle design, rather than a walker. It provides partial protection to the wearer with an Armor Value of 2/4. Piloted with Pilot: Groundrcraft skill.",
    armour = (2, 4),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 344);

  val list: List[Armour] = Macros.memberList[Armour];

}

