package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object MorphsDF {
  import MorphImplicits._
  import MorphType._
  import Cost._
  import Sources._

  val daitya = MorphModel(
    name = "Daitya",
    morphType = Synthmorph,
    descr = "This huge, vaguely anthropomorphic synthmorph is designed for large construction projects and similar heavy industrial uses, such as moving giant objects. At just under three-meters tall and with a mass of almost one ton, the daitya is essentially an industrial mech. Modifed versions have occasionally been deployed for combat purposes.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Grip Pads", "Hardened Skeleton", "Industrial Armor", "Mnemonic Augmentation", "Pneumatic Limbs (Arms)", "Puppet Sock", "Radar", "4 Weapon Mounts (Disassembly Tools; 2 fixed, 2 articulated)", "Wrist-Mounted Tools"),
    traits = Seq("Large Size"),
    movement = Seq("Walker 8/40"),
    aptitudeMax = 30.copy(som = Some(40)),
    aptitudeBonus = AptitudeValues(som = 15),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.disassemblyTools),
    durability = 100,
    armour = (10, 10),
    cpCost = 80,
    price = ExpensivePlus(80000),
    source = mrg);

  val digger = MorphModel(
    name = "Digger",
    morphType = Pod,
    descr = "Diggers are worker pods customized for archeological work. They are used for surface surveys, excavation, and general physical labor by xenoarcheological teams. Their hands are modifed digging claws, adapted from the genetics of hole-digging creatures like moles and aardvarks, though still ﬂexible and useful for grasping and fine manipulation",
    enhancements = Seq("Access Jacks", "Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Digging Claws", "Enhanced Vision", "Mnemonic Augmentation", "Puppet Sock", "Wrist-Mounted Tools"),
    traits = Seq("Social Stigma (Pod)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val dragonfly = MorphModel(
    name = "Dragonfly",
    morphType = Synthmorph,
    descr = "The dragonﬂy robotic morph takes the shape of a meter-long ﬂexible shell with multiple wings and manipulator arms. Capable of near-silent turbofan-aided ﬂight in Earth gravity, dragonﬂy bots fare even better in microgravity",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Wings"),
    traits = Seq("Small Size"),
    movement = Seq("Winged 8/32", "Walker 2/16"),
    aptitudeMax = 30.copy(som = Some(20)),
    aptitudeBonus = AptitudeValues(ref = 5),
    durability = 25,
    armour = (2, 2),
    cpCost = 20,
    price = High,
    source = mrg);

  val dverg = MorphModel(
    name = "Dverg",
    morphType = Biomorph,
    descr = "Dvergar (plural of dvergr) are biomorphs designed for comfortable operation in highgravity environments. They feature a reinforced skeletal structure and sturdier muscle masses. They are easily identifed by their slightly squat, thick-necked, tough appearances.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "High-G Adaptation"),
    aptitudeMax = 30.copy(som = Some(40)),
    aptitudeBonus = AptitudeValues(som = 15),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 45,
    cpCost = 50,
    price = Expensive,
    source = mrg);

  val exalt = MorphModel(
    name = "Exalt",
    morphType = Biomorph,
    descr = "Exalt morphs are genetically enhanced humans, designed to emphasize specifc traits. Their genetic code has been tweaked to make them healthier, smarter, and more attractive (based on ever-evolving beauty standards). Their metabolism is modifed to predispose them towards staying fit and athletic for the duration of an extended lifespan.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 5),
    playerDecisions = Some("+5 to three other aptitude"),
    durability = 35,
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val faust = MorphModel(
    name = "Faust",
    morphType = Biomorph,
    descr = "Developed in secret by a small group of unaffliated async genehackers, this morph is not a publicly known model. It is only available to individuals who discover a connection to this unnamed, underground async network and then download the template from one of several secret mesh sites. The faust is a modifed menton morph. Even under the most thorough scans, it appears to be nothing more than a mildly personalized version of that morph.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Circadian Regulation", "Cortical Stack", "Eidetic Memory", "Endocrine Control", "Hyper-Linguist", "Math Boost"),
    traits = Seq("Psi Chameleon", "Psi Defense (Level 1)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 10, wil = 10, int = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 85,
    price = ExpensivePlus(100000),
    source = mrg);

  val fenrir = MorphModel(
    name = "Fenrir",
    morphType = Synthmorph,
    descr = "Named for the monstrous wolf of Norse legend, the fenrir is one of the most imposing combat morphs ever developed. It is found only in the armed forces of the Hyoden city-state on Callisto (though black-market blueprints/copies are rumored to be available elsewhere). A massive, squat quadrupedal morph designed to be operated by up to six egos simultaneously, the fenrir is more akin to a super-heavy tank than a regular morph. It is possible that a single ego could fill all six ego slots at once through the use of alpha forks, but this has never been tested. The most common weapons mounted are linked HEAP and/or plasmaburst seeker launchers, exoatmospheric plasma beam bolters, and machine railguns loaded with AP rounds. Note: This morph is unique in that it allows more than one ego to use it at the same time. Ego Sharing may be purchased for this morph an additional four times, for a total of fve additional egos",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Anti-Glare", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Direction Sense", "Ego Sharing (1)", "Enhanced Hearing", "Enhanced Vision", "Extra Limbs (4)", "Heavy Combat Armor", "Lidar", "Mnemonic Augmentation", "Pneumatic Limbs", "Radar", "Structural Enhancement", "T-Ray Emitter", "Weapon Mount (External, Articulated, 8)"),
    traits = Seq("Large Size"),
    movement = Seq("Walker 4/20", "Thrust Vector 4/12"),
    aptitudeMax = 35,
    aptitudeBonus = AptitudeValues(ref = 5, coo = 5, som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 80,
    armour = (32, 32),
    cpCost = 0, //not available
    price = ExpensivePlus(100000),
    source = mrg);

  val fightingKite = MorphModel(
    name = "Fighting Kite",
    morphType = Synthmorph,
    descr = "Based on the kite morph (p. 53) popular with gatecrashers, this morph is somewhat more durable and better armored. It also includes a built-in laser as well as anti-detection measures. Its default mode is turbofan-driven rotorcraft; its light weight allows it to ﬂy and hover, even in thin atmospheres and heavy gravities. In streamlined ionic mode, it can travel at high speeds and maneuver in hurricane-force winds. In vacuum, it can drive itself with thrust-vector nozzles. It is occasionally used for aerial reconnaissance, but is most popular with spies, thieves, and discrete bodyguards.",
    enhancements = Seq("Access Jacks", "Anti-Glare", "Basic Mesh Inserts", "Chameleon Skin", "Chemical Sniffer", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Mnemonic Augmentation", "Neurachem (Level 1)", "Radar", "Radar Absorbent", "Shape Adjusting", "T-Ray Emitter", "Weapon Mount (Internal", "Articulated", "Laser Pulser)", "Wings"),
    traits = Seq("Small Size"),
    movement = Seq(" Ionic 12/40", "Thrust Vector 8/40", "Walker 2/8", "Winged 8/32"),
    aptitudeMax = 30.copy(som = Some(25)),
    playerDecisions = Some("+5 to two other aptitude"),
    durability = 30,
    armour = (4, 4),
    cpCost = 35,
    price = ExpensivePlus(40000),
    source = mrg);

  val fierceKite = MorphModel(
    name = "Fierce Kite",
    morphType = Synthmorph,
    descr = "Variant of Fighting Kite. Fierce kites are larger, humanoid-sized fghting kites.",
    enhancements = Seq("Access Jacks", "Anti-Glare", "Basic Mesh Inserts", "Chameleon Skin", "Chemical Sniffer", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Mnemonic Augmentation", "Neurachem (Level 1)", "Radar", "Radar Absorbent", "Shape Adjusting", "T-Ray Emitter", "Weapon Mount (Internal", "Articulated", "Laser Pulser)", "Wings"),
    movement = Seq(" Ionic 12/40", "Thrust Vector 8/40", "Walker 2/8", "Winged 8/32"),
    aptitudeMax = 30,
    playerDecisions = Some("+5 to two other aptitude"),
    durability = 50,
    armour = (8, 8),
    cpCost = 55,
    price = ExpensivePlus(55000),
    source = mrg);

  val flat = MorphModel(
    name = "Flat",
    morphType = Biomorph,
    descr = "Flats are baseline unmodifed humans, born with all of the natural defects, hereditary diseases, and other genetic mutations that evolution so lovingly applies. Flats are increasingly rare—most died off with the rest of humanity during the Fall. Most new children are splicers—screened and genefxed at the least—except in habitats where ﬂats are treated as second-class citizens and indentured labor.",
    enhancements = Seq(),
    traits = Seq("Genetic Defects"),
    aptitudeMax = 20,
    durability = 30,
    cpCost = 0,
    price = High,
    source = mrg);

  val flexbot = MorphModel(
    name = "Flexbot",
    morphType = Synthmorph,
    descr = "Designed for multipurpose functions, ﬂexbots can transform their shells to suit a range of situations and tasks. Their core frame consists of a half-dozen interlocking and shape-adjustable modules capable of auto-transforming into a variety of shapes: multi-legged walker, tentacle, hovercraft, and many others. Each module features its own sensor units and “bush robot” fractal-branching digits (capable of breaking into smaller digits, down to the micrometer scale, allowing for ultra-fine manipulation). The ﬂexbot control computer is also distributed between modules. Individual ﬂexbots are only the size of a large dog, but multiple ﬂexbots can join together for larger mass operations, even taking on heavy-duty tasks such as demolition, excavation, manufacturing, robotics assembly, and so on. The ﬂexbot detailed here is the standard yeoman module. For additional rules, see Flexbots, p. 200, Transhuman.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Fractal Digits", "Mnemonic Augmentation", "Modular Design", "Nanoscopic Vision", "Shape Adjusting"),
    traits = Seq("Small Size"),
    movement = Seq("Walker 4/16", "Hover 8/40"),
    aptitudeMax = 30.copy(som = Some(25)),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 25,
    armour = (4, 4),
    cpCost = 20,
    price = Expensive,
    source = mrg);
//TODO add and manage the different Modules

  val flyingSquid = MorphModel(
    name = "Flying Squid",
    morphType = Pod,
    descr = "Given the popularity of octomorphs even among non-mercurials, morph designers have sought out a similar morph that is operable in zero g and also designed for speed. Its streamlined form resembles a stylized squid and this morph can move swiftly in both water and air. It can suck either water or air into a cavity in its mantle and then expel it out a siphon in a chosen direction for fast, jet-like propulsion. While popular with neo-octopi, its speed and overall utility has made it an increasingly favorite option with others seeking an aquatic-adapted morph.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Extra Limbs (8 arms, 2 tentacles)", "Grip Pads", "Hydrostatic Pressure Adaptation", "Mnemonic Augmentation", "Polarization Vision", "Puppet Sock"),
    traits = Seq("Limber (Level 2)", "Social Stigma (Pod)", "Non-Mammalian Biochemistry"),
    movement = Seq("Submarine 4/36", "Thrust Vector 4/28"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, som = 5),
    skillBonus = Seq(("Swimming" -> 30)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.beakAttack),
    durability = 40,
    cpCost = 55,
    price = ExpensivePlus(60000),
    source = mrg);

  val freeman = MorphModel(
    name = "Freeman",
    morphType = Biomorph,
    descr = "Many leaders want to ensure loyalty or at least obedience from their citizens, especially recently sleeved infugees. The freeman biomorph offers rulers (some would say tyrants or dictators) a chance to offer citizens a new life without worrying about dissidence. Based on the splicer morph, the freeman is genetically modifed to be more obedient, which results in lower Willpower. More insidiously, freeman morphs are genetically modifed with a protein that makes their neurons sensitive to light. When combined with an optogenetics module implant, these neurons can be activated and deactivated remotely, enabling a monitoring muse or meshed overseer to control the ego’s behavior. (The specifc behavior affected is chosen with each optogenetics module implant.) The freeman comes with a specialized monitor AGI installed in a modifed ghostrider module. The monitor, usually a modifed fork of the tyrant’s muse, watches and reports all suspicious actions taken by the primary ego. The purpose of this implant is often concealed. Citizens who sleeve into a freeman morph are told the implant is a security measure that helps prevent infection from TITAN technology or some similar lie. The module is designed to resist tampering and will report to headquarters the instant it detects a hacker’s intrusion. The monitor muse can manipulate the ego’s behavior or even take control of the morph via its puppet sock, but avoids doing that unless absolutely necessary. Dictators do not want to reveal that their citizens have spies implanted in their skulls, watching them. Surprisingly, some people voluntarily sleeve into freeman morphs, preferring to hand responsibility and decision-making over to other parties, such as the Sendero Luminoso Benevolent Dictatorship habitat in the Neptunian Trojans.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Monitor Module", "Optogenetics Module", "Puppet Sock"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(sav = 5, wil = -5),
    playerDecisions = Some("+5 to one other aptitude except WIL"),
    durability = 30,
    cpCost = 10,
    price = High,
    source = mrg);

  val fury = MorphModel(
    name = "Fury",
    morphType = Biomorph,
    descr = "Furies are combat morphs. These transgenic human upgrades feature genetics tailored for endurance, strength, and reﬂexes, as well as behavioral modifcations for aggressiveness and cunning. To offset tendencies for unruliness and macho behavior patterns, furies feature gene sequences promoting pack mentalities and cooperation, and they tend to be biologically female.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Cortical Stack", "Enhanced Vision", "Neurachem (Level 1)", "Toxin Filters"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, ref = 5, som = 10, wil = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 50,
    armour = (2, 3),
    cpCost = 75,
    price = ExpensivePlus(40000),    
    source = mrg);

  val futura = MorphModel(
    name = "Futura",
    morphType = Biomorph,
    descr = "An exalt variant, futura morphs were specially crafted for the “Lost generation.” Tailor-made for accelerated growth and adjusted for confidence, self-reliance, and adaptability, futuras were intended to help transhumanity regain its foothold. These programs proved disastrous and the line was discontinued, but some models remain, viewed by some with distaste and others as collectibles or exotic oddities.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Eidetic Memory", "Emotional Dampers"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 5, sav = 5, wil = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 40,
    price = ExpensivePlus(50000),
    source = mrg);

  val list: List[MorphModel] = Macros.memberList[MorphModel];
}
