package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import MorphImplicits._
import MorphType._
import Cost._
import Sources._

object MorphsAC {
  val aquanaut = MorphModel(
    name = "Aquanaut",
    morphType = Biomorph,
    descr = "Aquanauts are environmentally adapted for underwater activities. Their heart rate slows while underwater, their skin includes a layer of blubber that retains heat, they store oxygen in their muscle tissue, and they do not suffer negative health effects from pressure changes. Additionally, their eyes have nictitating membranes and their corneas adjust to counter underwater refraction. Their hands and feet are webbed and they possess a transgenic swim bladder for controlling buoyancy. Aquanauts can safely descend to about 200 meters depth (roughly 21 atmospheres of pressure at 1 g) without suffering narcotic effects or other diving problems.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Enhanced Respiration", "Gills", "Sonar", "Swim Bladder", "Temperature Tolerance (Improved Cold)", "Toxin Filters"),
    traits = Seq("Non-Human Biochemistry"),
    movement = Seq("Walker 4/20, Swimming 2/10"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, som = 10),
    skillBonus = Seq(("Swimming" -> 10)),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    cpCost = 50,
    price = Expensive,
    source = mrg);

  val arachnoid = MorphModel(
    name = "Arachnoid",
    morphType = Synthmorph,
    descr = "Arachnoid robotic shells are 1-meter in length, segmented into two parts, with a smaller head like a spider or termite. They feature four pairs of 1.5-meter-long retractable arms/legs, capable of rotating around the axis of the body, with built-in pneumatic systems for propelling the bot with small leaps. The manipulator claws on each arm/leg can be switched out with extendable mini-wheels for high-speed skating movement. A smaller pair of manipulator arms near the head allows for closer handling and tool use. In zero-g environments, arachnoids can retract their arms/legs and maneuver with vectored air thrusters.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Extra Limbs (10 Arms/Legs)", "Lidar", "Mnemonic Augmentation", "Pneumatic Limbs", "Rada"),
    movement = Seq("Walker 4/24", "Thrust Vector 8/40", "Wheeled 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, som = 10),
    durability = 40,
    armour = (8, 8),
    cpCost = 45,
    price = ExpensivePlus(40000),
    source = mrg);

  val arachnikoma = MorphModel(
    name = "Arachnikoma",
    morphType = Synthmorph,
    descr = "Arachnikomas are larger-sized arachnoids. Their body serves as a capsule/cockpit for one human-sized passenger/pilot (or cargo), with a hinged top. Otherwise they are similar to arachnoids in form and function.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Extra Limbs (10 Arms/Legs)", "Lidar", "Mnemonic Augmentation", "Pneumatic Limbs", "Rada"),
    movement = Seq("Walker 4/24", "Thrust Vector 8/40", "Wheeled 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, som = 10),
    durability = 60,
    armour = (12, 12),
    cpCost = 55,
    price = ExpensivePlus(55000),
    source = mrg);

  val ariel = MorphModel(
    name = "Ariel",
    morphType = Biomorph,
    descr = "The surprising number of transhumans who chose to sleeve in Titan-adapted hulder morphs encouraged designers on Profunda to develop a Titan-adapted flyer. While the sturdy hulder morph is designed for nomadic herders, the ariel morph is designed by people who wish to survive by hunting. Individuals sleeved in the ariel morph can hunt and eat Titanian caribou, but they most often eat the smaller rabbit-like creatures that Profunda designers have also recently designed to live on Titan. Ariel morphs have exotic-looking heads similar to those of hulder morphs, but they also possess sleek and streamlined humanoid bodies with four limbs and a pair of bat-like wings. These morphs have also been used by a few daring transhumans to explore the upper cloud layers of both Saturn and Uranus.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Claws", "Cortical Stack", "Direction Sense", "Enhanced Vision", "Long-Term Life Support", "Low Pressure Tolerance", "Oxygen Reserve", "Prehensile Feet", "Radiation Sense", "T-Ray Emitter", "Temperature Tolerance (Cryonic)", "Wings"),
    traits = Seq("Temerature Intolerance (Warm)", "Non-Mammalian Biochemistry"),
    movement = Seq("Walker 4/20", "Winged 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 5, ref = 5),
    playerDecisions = Some("+5 to two other aptitudes"),
    durability = 30,
    cpCost = 50,
    price = ExpensivePlus(50000),
    source = mrg);

  val ayah = MorphModel(
    name = "Ayah",
    morphType = Pod,
    descr = "The ayah pod morph is designed to fulfill nurse and caretaker functions. Many hyperelites prefer AGI servants sleeved into ayah morphs, especially in polities where AGIs have few, if any, legal rights. Ayahs are almost always female with pleasant but not stunningly beautiful features. Most of the enhanced features of an ayah are built under the hood, so to speak. Their enhanced olfactory capabilities help them monitor the health and emotional state of their wards, as well as alert them to potential environmental dangers. Their ability to withstand temperature extremes and survive without air for short periods helps them protect and rescue their charges in an emergency, such as a hull breach or a fire. Ayahs are often modified with bioweave armor and implanted weapons so they can act as a last line of defense against potential attackers.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Enhanced Smell", "Mnemonic Augmentation", "Oxygen Reserve", "Puppet Sock", "Temperature Tolerance", "Wrist-Mounted Tools"),
    traits = Seq("Social Stigma (Pod)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(sav = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 25,
    price = Expensive,
    source = mrg);

  val basicPod = MorphModel(
    name = "Basic Pod",
    morphType = Pod,
    descr = "Basic pods are essentially lowercost pod versions of a splicer morph. To keep expenses down, this pod has slightly more mechanical parts than most other pods. As a result, it has more obvious cybernetic components.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Puppet Sock"),
    traits = Seq("Social Stigma (Pod)"),
    aptitudeMax = 25,
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 30,
    cpCost = 5,
    price = Moderate,
    source = mrg);

  val biocore = MorphModel(
    name = "Biocore",
    morphType = Synthmorph,
    descr = "The biocore is a synthmorph with a biological brain. This design is favored by those who wish to enjoy the advantages of sleeving in a synthmorph without the risk of brainhacking or who simply dislike the idea of using a cyberbrain (including some asyncs). Most models feature a stylized but transparent braincase, to show off the biocore’s main feature, but others appear to be ordinary synthmorphs from the outside; only a detailed physical examination can determine that it actually contains a living brain.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Brain Box", "Cortical Stack", "Eidetic Memory"),
    traits = Seq("Social Stigma (Clanking Masses)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 5),
    playerDecisions = Some("+5 to two other aptitudes"),
    durability = 40,
    armour = (6, 6),
    cpCost = 50,
    price = ExpensivePlus(60000),
    source = mrg);

  val blackbird = MorphModel(
    name = "Blackbird",
    morphType = Synthmorph,
    descr = "When they’re seen at all, these morphs resemble a matte gray neo-corvid with many odd, sharp angles. Blackbirds are consummate stealth morphs, designed to evade visual observation and radar during recon or infiltration. In part due to aesthetics, they’re a favorite of neo-ravens.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Enhanced Hearing", "Enhanced Vision", "Invisibility", "Mnemonic Augmentation", "Puppet Sock", "Reduced Signature", "Wings"),
    traits = Seq("Small Size"),
    movement = Seq("Walker 2/16", "Hopper 4/20", "Winged 8/40"),
    aptitudeMax = 30.copy(som = Some(20)),
    aptitudeBonus = AptitudeValues(coo = 5, ref = 5),
    skillBonus = Seq(("Flight" -> 10), ("Infiltration" -> 10)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.beakAttack),
    durability = 25,
    armour = (2, 2),
    cpCost = 45,
    price = ExpensivePlus(45000),
    source = mrg);

  val bouncer = MorphModel(
    name = "Bouncer",
    morphType = Biomorph,
    descr = "Bouncers are humans genetically adapted for zero-g and microgravity environments. Their legs are more limber, and their feet can grasp as well as their hands.",
    enhancements = Seq( "Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Grip Pads", "Oxygen Reserve", "Prehensile Feet"),
    traits = Seq("Limber (Level 1)"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val bruiser = MorphModel(
    name = "Bruiser",
    morphType = Biomorph,
    descr = "This morph is specifcally designed to be large, strong, and physically intimidating. Adopted early on by some sports performers, it quickly became a favorite among criminal cartels and thugs. At 2.5 meters tall, the morph may have diffculty moving comfortably in all but the most open and uncrowded of habitats. This morph’s “claws” extend from its knuckles and are more like reinforced bone brass knuckles",
    enhancements = Seq("Adrenal Boost", "Basic Biomods", "Basic Mesh Inserts", "Claws", "Cortical Stack", "Hardened Skeleton"),
    traits = Seq("Unattractive (Level 1)", "Large Size"),
    aptitudeMax = 30.copy(som = Some(40)),
    aptitudeBonus = AptitudeValues(som = 15, ref = 5),
    skillBonus = Seq(("Intimidation" -> 10)),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 60,
    cpCost = 60,
    price = ExpensivePlus(60000),
    source = mrg);

  val `case` = MorphModel(
    name = "Case",
    morphType = Synthmorph,
    descr = "Cases are mass-produced robotic shells, an affordable remorphing option for infugees. They are available in many varieties to suit a client’s taste. Most case morphs are vaguely anthropomorphic, with a thin framework body standing just shorter than an average human.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation"),
    traits = Seq("Lemon", "Social Stigma (Clanking Masses)"),
    movement = Seq("Walker 4/16"),
    aptitudeMax = 20,
    playerDecisions = Some("-5 to one other aptitude"),
    durability = 20,
    armour = (4, 4),
    cpCost = 5,
    price = Moderate,
    source = mrg);

  val cetus = MorphModel(
    name = "Cetus",
    morphType = Synthmorph,
    descr = "The cetus, named after a mythological sea monster, was designed for deep sea activity and is capable of operating under extreme pressure and cold. It is a favored morph for use in the undersea domains of Ceres and Europa. Capable of moving quickly underwater, the morph can also operate outside of water in the atmospheric portion of habitats. Cetus morphs usually feature a body slightly under one-meter wide, with a limb-span of over three meters at full extension.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Chemical Sniffer", "Cortical Stack", "Cyberbrain", "Direction Sense", "Echolocation", "Enhanced Hearing", "Enhanced Vision", "Extra Limbs (8)", "Headlights", "Hydrostatic Pressure Adaptation"),
    movement = Seq("Submarine 4/36", "Walker 4/20"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    armour = (8, 8),
    cpCost = 45,
    price = ExpensivePlus(40000),
    source = mrg);

  val chickcharnie = MorphModel(
    name = "Chickcharnie",
    morphType = Pod,
    descr = "The extinct Tyto Pollens was a large pre-Columbian ﬂightless ground owl species in the Caribbean. The chickcharnie was rumored to be a supernatural variant of this bird that haunted the forests bestowing boons or curses upon travelers depending on how they treated it. The Fortean version of the chickcharnie is best described as a humanoid owl. Over one meter in height, it is bipedal but stands shorter than humans. Though winged, it is ﬂightless except in very low grav environments and microgravity. Its wing design, however, incorporates a functional set of clawed hands. The chickcharnie is growing in popularity among neo-avians who don’t mind sacrifcing ﬂight for physical resilience, more functional hands, and a stature closely approximating transhuman standards.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Prehensile Feet", "Puppet Sock", "Wings"),
    traits = Seq("Non-Mammalian Biochemistry"),
    movement = Seq("Walker 4/20", "Winged 4/20 (low/microgravity only)"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, ref = 10),
    attacks = Seq(MorphAttacks.beakAttack),
    durability = 35,
    cpCost = 35,
    price = Expensive,
    source = mrg);

  val cloudSkate = MorphModel(
    name = "Cloud Skate",
    morphType = Biomorph,
    descr = "Like the surya and hulder, the cloud skate is another biomorph that pushes the edge of what is possible. It is designed to be able to live in the atmospheres of gas giants, including Jupiter. This morph is shaped roughly like a tailless stingray with a pair of slender arms. The version of the swim bladder used by this morph provides neutral buoyancy in dense atmospheres, preventing it from sinking below a safe depth.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Cortical Stack", "Direction Sense", "Enhanced Vision", "High-G Adaptation", "Hydrostatic Pressure Adaptation", "Long-Term Life Support", "Oxygen Reserve", "Radiation Sense", "Radar", "Swim Bladder", "T-Ray Emitter", "Temperature Tolerance (Cryonic)", "Wings"),
    traits = Seq("Temperature Intollerance (Warm)"),
    movement = Seq("Winged 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 5, ref = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 55,
    price = ExpensivePlus(60000),
    source = mrg);

  val cloudSkimmer = MorphModel(
    name = "Cloud Skimmer",
    morphType = Synthmorph,
    descr = "This streamlined synthmorph is designed for exploring the atmospheres of gas giants, but its internal rocket also allows it to operate in vacuum. It can travel to and from a ship in orbit around a gas giant into the planet’s atmosphere on its own. The morph is a ﬂattened oval that can extend up to four ﬂexible arms. The swim bladder acts much like a high-pressure balloon to help keep the morph aloft in a gas giant’s dense atmosphere.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cryonic Protection", "Cyberbrain", "Direction Sense", "Enhanced Vision", "Extra Limbs (4 Arms)", " Hydrostatic Pressure Adaptation", "Internal Rocket", "Mnemonic Augmentation", "Puppet Sock", "Radar", "Swim Bladder", "Telescoping Limbs"),
    movement = Seq("Thrust Vector 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    armour = (10, 10),
    cpCost = 65,
    price = ExpensivePlus(70000),
    source = mrg);

  val courier = MorphModel(
    name = "Courier",
    morphType = Synthmorph,
    descr = "This synthmorph was specifcally designed to ﬂy between themany moons and habitats in the Saturnian system—carrying goods throughout the outer system. This morph appears to be a roughly humanoid head and torso set on a conical base, with a total height of 1.5 meters, that makes it look rather like a four-armed chess piece. This base contains both the morph’s ionic propulsion system, which doubles as a plasma sail in space, and an internal rocket. This miniature metallic-hydrogen rocket is specifcally designed for low thrust. It provides an acceleration of up to 0.25 g, allowing the morph to take off and land on all moons and other small bodies in the solar system. This engine can operate for a total of one and a half hours before it requires refueling. The morph’s four slender arms fold ﬂat against its torso when it is in ﬂight. Its extensive sensor suit is useful for both navigation and various covert purposes.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Chemical Sniffer", "Cortical Stack", "Cryonic Protection", "Cyberbrain", "Direction Sense", "Enhanced Vision", "Extra Limbs (4)", "Grip Pads", "Headlights", "Hidden Compartment", "Internal Rocket", "Lidar", "Magnetic System", "Mnemonic Augmentation", "Plasma Sail Implant", "Radar", "Retracting/Telescoping Limbs", "T-ray Emitter"),
    movement = Seq("Ionic 12/40", "Thrust Vector 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 30,
    armour = (6, 6),
    cpCost = 70,
    price = ExpensivePlus(40000),
    source = mrg);

  val crasher = MorphModel(
    name = "Crasher",
    morphType = Biomorph,
    descr = "An enhanced version of ruster morphs, crashers are rugged and durable designs capable of weathering a range of harsh environments. They are the ideal biomorph for gatecrashing assignments and are popular among frst-in teams. Though pricey compared to other biomorph options, many gatecrashers traveling to less habitable and dangerous environments have found the investment worth it.",
    enhancements = Seq( "Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Circadian Regulation", "Clean Metabolism", "Cortical Stack", "Direction Sense", "Eidetic Memory", "Enhanced Respiration", "Enhanced Vision", "Grip Pads", "Hibernation", "Medichines", "Oxygen Reserve", "Toxin Filters", "Vacuum Sealing"), 
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 5, som = 10),
    playerDecisions = Some("+5 to three other aptitude"),
    durability = 40,
    armour = (2, 3),
    cpCost = 70,
    price = ExpensivePlus(40000),
    source = mrg);

  val critter = MorphModel(
    name = "Critter",
    morphType = Pod,
    descr = "Critters are pods either genetically blended from multiple animal species or simply biosculpted to appear as such. Originally popular among those looking for smarter and distinctive AI-operated pets, they’ve since expanded to patrol duty and beyond. Critter pods come in almost every conceivable type of animal shape, from cats to skunks to chimerical lizard-hyena hybrids. The vast majority are quadruped and stick close to the animal type’s body plan, though anthropomorphic models are also available and there is a great deal of bodysculpted variety. Currently popular in the inner system is the bastet, a composite of several wild cat species that resembles a tawny panther or lion, often with intricate patterns based on Egyptian hieroglyphs in their fur. Some users prefer smaller models of this morph with the Reduced Size trait (p. 93, Transhuman).",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Claws", "Cortical Stack", "Cyberbrain", "Enhanced Hearing", "Enhanced Smell", "Mnemonic Augmentation", "Puppet Sock"),
    traits = Seq("Lacks Manipulators", "quadrupeds have a diffcult time in microgravity (–30 to Free Fall Tests)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(ref = 5, coo = 5),
    durability = 35,
    cpCost = 15,
    price = Expensive,
    source = mrg);

  val list: List[MorphModel] = Macros.memberList[MorphModel];
}