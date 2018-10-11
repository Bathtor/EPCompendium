package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object MorphsOR {
  import MorphImplicits._;
  import MorphType._;
  import Cost._;
  import Sources._;
  import Effect._;

  val observer = MorphModel(
    name = "Observer",
    morphType = Biomorph,
    descr = "Observers have their minds enhanced to bolster intuitive, analytical, and investigative capabilities. They are favored by detectives and others with a mind towards details, puzzles, and thin-slicing.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 10, cog = 5, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 40,
    price = Expensive,
    movement = Seq("Walker 4/20"),
    source = mrg);

  val octomorph = MorphModel(
    name = "Octomorph",
    morphType = Biomorph,
    descr = "These uplifted octopi sleeves have proven quite useful in zero-gravity environments. They retain eight arms, their chameleon ability to change skin color, ink sacs, and a sharp beak. They also have increased brain mass and longevity, can breathe both air and water, and lack a skeletal structure so they can squeeze through tight spaces. Octomorphs typically crawl along in zero gravity using their arm suckers and expelling air for propulsion and can even walk on two of their arms in low gravity. Their eyes have been enhanced with color vision, provide a 360-degree field of vision, and rotationally adjust to keep the slit-shaped pupil aligned with up. A transgenic vocal system allows them to speak.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Chameleon Skin", "Polarization Vision", "8 arms", "360-degree vision"),
    aptitudeMax = 30,
    movement = Seq("Walker 2/12", "Swim 4/24", "Thrust Vector 2/12"),
    durability = 30,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.octomorphBeak, MorphAttacks.octomorphInk),
    otherEffects = List(SkillMod(skill = "Swimming", mod = 30), SkillMod(skill = "Climbing", mod = 10)),
    traits = Seq("Non-Mammalian Biochemistry"),
    cpCost = 50,
    price = ExpensivePlus(30000),
    source = mrg);

  val olympian = MorphModel(
    name = "Olympian",
    morphType = Biomorph,
    descr = "Olympians are human upgrades with improved athletic capabilities like endurance, eye-hand coordination, and cardiovascular functions. Olympians are common among athletes, dancers, freerunners, and soldiers.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10, coo = 5, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val opteryx = MorphModel(
    name = "Opteryx",
    morphType = Synthmorph,
    descr = "This recon morph is designed to be a fast, light- weight runner, climber, and flyer. The opteryx looks like a one-meter-tall winged, synthetic dinosaur and adopts an almost horizontal body posture when running, its tail held out for balance. Its wings are fully functional arms equipped with claws. This morph is a favorite for gatecrashers and neo-avians in the dinosaur identity subculture. It comes equipped with cartography package (p. 199,Transhuman) software.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Claws", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Grip Pads", "Mnemonic Augmentation", "Pneumatic Limbs (Legs)", "Prehensile Tail", "Wings"),
    movement = Seq("Walker 8/40", "Winged 8/40"),
    aptitudeMax = 30, //TODO 25 SOM ???
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    otherEffects = List(SkillMod(skill = "Flight", mod = 10), SkillMod(skill = "Climbing", mod = 10)),
    traits = Seq("Small size"),
    armour = (2, 2),
    durability = 25,
    cpCost = 40,
    price = ExpensivePlus(40000),
    source = mrg);

  val pleasurePod = MorphModel(
    name = "Pleasure Pod",
    morphType = Pod,
    descr = "Pleasure pods are exactly what they seem—faux humans designed purely for intimate entertain- ment purposes. Pleasure pods have extra nerve clusters in their erogenous zones, fine motor control over certain muscle groups, enhanced pheromones, sanitized metabolisms, and the genetics for purring. Naturally, they are crafted for good looks and charisma and enhanced in other areas as well. Pleasure pods are capable of switching their sex at will to male, female, hermaphrodite, neuter, or other intersex variations.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Clean Metabolism", "Cortical Stack", "Cyberbrain", "Enhanced Pheromones", "Mnemonic Augmentation", "Puppet Sock", "Sex Switch"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, sav = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    traits = Seq("Social Stigma (Pleasure Pod)"),
    durability = 30,
    cpCost = 20,
    price = High,
    source = mrg);

  val qMorph = MorphModel(
    name = "Q-Morph",
    morphType = Synthmorph,
    descr = "Quartz morphs, commonly called Q-morphs, are the primary shell design used for Venusian surface mining. Constructed from quartz and extremely durable alloys, Q-morphs look like four-legged crabs with two pairs of arms. The lower pair of arms is designed for strength, the upper pair for precision and dexterity. This morph is squat, exceptionally tough, and completely unable to function in temperatures below 250 C.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Direction Sense", "Echolocation, Enhanced Vision", "Extreme Heat Shielding", "Extreme Pressure Adaptation", "Mnemonic Augmentation", "Radar", "T-Ray Emitter", "Wrist-Mounted Tools", "8 limbs"),
    movement = Seq("Walker 2/4"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = -5, som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    traits = Seq("High-Temperature Operation", "Large size"),
    attacks = Seq(MorphAttacks.qmorphClaw),
    durability = 120,
    armour = (18, 18),
    cpCost = 100,
    price = ExpensivePlus(60000),
    source = mrg);

  val reaper = MorphModel(
    name = "Reaper",
    morphType = Synthmorph,
    descr = "The reaper is a common combat bot, used in place of biomorph soldiers and typically operated via teleoper- ation or by autonomous AI. The reaper’s core form is an armored disc, so that it can turn and present a thin profile to an enemy. It uses vector-thrust nozzles to maneuver in microgravity and also takes advantage of an ionic drive for fast movement over distance. Four legs/manipulating arms and four weapon pods are folded inside its frame. The reaper’s shell is made of smart materials, allowing these limbs and weapon mounts to extrude in any direction desired and even to change shape and length. In gravity environments, the reaper walks or hops on two or four of these limbs. Reapers are infamous due to numerous war XPs, and bringing one into most habitats will undoubtedly raise eyebrows if not get you arrested.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Anti-Glare", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Cyber Claws", "Extra Limbs (4)", "Magnetic System", "Mnemonic Augmentation", "Pneumatic Limbs", "Puppet Sock", "Radar", "Reflex Booster", "Shape Adjusting", "Structural Enhancement", "T-Ray Emitter", "Weapon Mount (Articulated, 4)"), //TODO speed+1
    movement = Seq("Walker 4/20", "Hopper 4/20", "Ionic 12/40", "Vectored Thrust 4/20"),
    aptitudeMax = 40,
    aptitudeBonus = AptitudeValues(coo = 5, ref = 10, som = 10),
    otherEffects = List(SpeedMod(1)),
    durability = 60,
    armour = (16, 16),
    cpCost = 100,
    price = ExpensivePlus(50000),
    source = mrg);

  val remade = MorphModel(
    name = "Remade",
    morphType = Biomorph,
    descr = "The remade are completely redesigned humans: humans 2.0. Their cardiovascular systems are stronger, the digestive tract has been sani- tized and restructured to eliminate flaws, and they have otherwise been optimized for good health, smarts, and longevity with numerous transgenic mods. The remade are popular with the ultimates faction. The remade look close to human, but are different in very noticeable and sometimes eerie ways: taller, lack of hair, slightly larger craniums, wider eyes, smaller noses, smaller teeth, and elongated digits.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Circadian Regulation", "Clean Metabolism", "Cortical Stack", "Eidetic Memory", "Enhanced Respiration", "Temperature Tolerance", "Toxin Filters"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 40,
    aptitudeBonus = AptitudeValues(cog = 10, sav = 5, som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    traits = Seq("Uncanny Valley"),
    durability = 40,
    cpCost = 60,
    price = ExpensivePlus(40000),
    source = mrg);

  val ringFlyer = MorphModel(
    name = "RingFlyer",
    morphType = Biomorph,
    descr = "Designed for use in Saturn’s magnetic field, this exotic biomorph is also occasionally used around Jupiter, Uranus, and Neptune, as well as having limited use in the Jovian Trojans and Main Belt. Easily recognizable with its slender limbs and round-backed torso, this morph can survive indefinitely in space, acquiring oxygen, water, and trace organic materials from the particles of Saturn’s rings. It can also maneuver around any planet with a magnetic field, flying swiftly and easily in any of these environments.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light, 2/3)", "Cortical Stack", "Enhanced Respiration", "Enhanced Vision", "Gas Jet System", "Grip Pads", "Hibernation", "Long-Term Life Support", "Medichines", "Oxygen Reserve", "Plasma Sail Implant", "Prehensile Feet", "Radiation Tolerance", "Temperature Tolerance (Cryonic)", "Vacuum Sealing"),
    movement = Seq("Walker 4/20", "Thrust Vector 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 5, coo = 5, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    traits = Seq("Limber (Level 1)"),
    durability = 30,
    cpCost = 70,
    price = ExpensivePlus(40000),
    source = mrg);

  val ripwing = MorphModel(
    name = "Ripwing",
    morphType = Pod,
    descr = "Developed by the genehackers of Fortean, ripwings are neogenetic avians, incorporating genetics from a range of flying creatures, some of them prehistoric ptero-saur genes acquired from Sky Ark researchers, along with some original genetic traits. These transgenic amalgamations are larger and sturdier than standard neo-avian morphs. They are popular among both neo-avian mercurials who want a more robust form and gatecrashers looking for a quick and stealthy flyer for recon missions. The ripwing morph makes more extensive use of the chiroptera genestocks used to give the first avian uplifts functional hands. Instead of feathers, ripwings feature tough leathery skin or even scales. The morphs are usually a uniform matte black in color, though they are able to change color at will due to their chameleon skin enhancements.",
    enhancements = Seq("Access Jacks", "Basic Biomods", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Mnemonic Augmentation", "Prehensile Feet", "Puppet Sock", "Wings"),
    movement = Seq("Walker 4/20", "Winged 4/20"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, coo = 5, ref = 5),
    traits = Seq("Social Stigma (Neogenetic)", "Social Stigma (Pod)", "Non-Mammalian Biochemistry"),
    attacks = Seq(MorphAttacks.ripwingAttack),
    durability = 35,
    cpCost = 40,
    price = ExpensivePlus(30000),
    source = mrg);

  val rover = MorphModel(
    name = "Rover",
    morphType = Synthmorph,
    descr = "Rover morphs are a smaller, defense-oriented version of the sphere morph. Each rover is 0.6 meters in diameter and, with its limbs retracted, has the ominous appearance of a reflective, shiny, black globe. It can extrude three arms, each with a built-in weapon: extendable claws, a small laser, and a heavy rail pistol loaded with 200 rounds of ammunition. Rovers are stealthy and highly maneuverable and so favored for bodyguard and police purposes in some areas. They are often deployed via remote control.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Chameleon Skin", "Cyberclaws", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Extra Limbs (3 Arms)", "Gas-Jet System", "Hand Laser", "Mnemonic Augmentation", "Neurachem (Level 1)", "Puppet Sock", "Radar Absorbent", "Reduced Signature", "T-Ray Emitter", "Telescoping Limbs", "Weapon Mount (Articulated, Heavy Rail Pistol)"), // TODO speed+1
    movement = Seq("Roller 8/32", "Thrust Vector 12/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, coo = 5, ref = 5),
    traits = Seq("Small size"),
    durability = 25,
    armour = (10, 10),
    cpCost = 60,
    price = ExpensivePlus(60000),
    source = mrg);

  val roverSpaceFighter = MorphModel(
    name = "Rover (Space Fighter Variant))",
    morphType = Synthmorph,
    descr = """Rover morphs are a smaller, defense-oriented version of the sphere morph. Each rover is 0.6 meters in diameter and, with its limbs retracted, has the ominous appearance of a reflective, shiny, black globe. It can extrude three arms, each with a built-in weapon: extendable claws, a small laser, and a heavy rail pistol loaded with 200 rounds of ammunition. Rovers are stealthy and highly maneuverable and so favored for bodyguard and police purposes in some areas. They are often deployed via remote control.
===
This version of the rover is fitted with a miniature metallic-hydrogen rocket with an acceleration up to 0.25 g, so that it is useful in short-range space battles. Several of these morphs can be launched from a spaceship to attack another ship or a habitat.""",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Chameleon Skin", "Cyberclaws", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Extra Limbs (3 Arms)", "Gas-Jet System", "Hand Laser", "Internal Rocket", "Mnemonic Augmentation", "Neurachem (Level 1)", "Puppet Sock", "Radar Absorbent", "Reduced Signature", "T-Ray Emitter", "Telescoping Limbs", "Weapon Mount (Articulated, Heavy Rail Pistol)"), // TODO speed+1
    movement = Seq("Roller 8/32", "Thrust Vector 12/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, coo = 5, ref = 5),
    traits = Seq("Small size"),
    durability = 25,
    armour = (10, 10),
    cpCost = 60,
    price = ExpensivePlus(60000),
    source = mrg);

  val ruster = MorphModel(
    name = "Ruster",
    morphType = Biomorph,
    descr = "Adapted for survival with minimum gear in the not-yet-terraformed Martian environment, these transgenic morphs feature insulated skin for more effective thermoregulation and respiratory system improvements to require less oxygen and filter carbon dioxyde, among other mods. Many rusters come with the Planned Obsolescence trait, as noted on p. 166, Sunward.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Enhanced Respiration", "Temperature Tolerance"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(som = 5),
    durability = 35,
    cpCost = 25,
    price = Expensive,
    source = mrg);

  val list: List[MorphModel] = Macros.memberList[MorphModel];
}
