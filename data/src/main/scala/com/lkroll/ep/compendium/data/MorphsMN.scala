package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object MorphsMN {
  import MorphImplicits._
  import MorphType._
  import Cost._
  import Sources._
  import Effect._

  val martianAlpiner = MorphModel(
    name = "Martian Alpiner",
    morphType = Biomorph,
    descr = "Alpiners were a relatively common biomorph design on early frontier Mars, when temperatures and atmospheric pressure had not yet risen to present levels. Now they are found predominantly in the city of Olympus, where environmental conditions will always be incredibly harsh. Avid rock climbers and outdoor types also favor this morph, and in recent years it has enjoyed an unusual vogue among chic urbanites going for a rough-andready look without sleeving in the more de classe ruster morph.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Direction Sense", "Grip Pads", "Low Pressure Tolerance", "Oxygen Reserve", "Respirocytes", "Temperature Tolerance (Improved Cold)"),
    traits = Seq(" Fast Metabolism", "Planned Obsolescence"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(som = 5),
    otherEffects = List(SkillMod(skill = "Climbing", mod = 10)),
    durability = 40,
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val menton = MorphModel(
    name = "Menton",
    morphType = Biomorph,
    descr = "Mentons are genetically modifed to increase cognitive abilities, particularly learning ability, creativity, attentiveness, and memory. Rumors exist of super-enhanced mentons with more extreme intelligence mods, but brainhacking is notoriously diffcult, and many attempts to redesign mental faculties result in impaired functioning, instability, or insanity.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Eidetic Memory", "Hyper Linguist", "Math Boost"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 10, int = 5, wil = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val mimic = MorphModel(
    name = "Mimic",
    morphType = Synthmorph,
    descr = "In its basic form, with its limbs retracted, a mimic morph resembles a spare (p. 92) and is only a bit larger than a human head. With its four pencil-thin telescoping legs fully extended, it can stand up to two meters tall, and its arms can also each reach up to two meters from the morph. These limbs can all be fully retracted and the user can also alter the morph’s shape and appearance, causing it to look like almost any small object such as a briefcase, cleaning robot, or household appliance. This morph can easily fit through small spaces and hide itself with great ease and is ideal for infltration and sabotage missions.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Extra Limbs (4 Legs, 2 Arms)", "Grip Pads", "Mnemonic Augmentation", "Puppet Sock", "Shape Adjusting", "Skinﬂex", "Telescoping Limbs"),
    traits = Seq(" Social Stigma (Clanking Masses)"),
    movement = Seq("Walker 5/24", "2/8 with limbs mostly retracted"),
    aptitudeMax = 30.copy(som = Some(20)),
    aptitudeBonus = AptitudeValues(coo = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 25,
    armour = (4, 4),
    cpCost = 25,
    price = ExpensivePlus(30000),
    source = mrg);

  val nautiloid = MorphModel(
    name = "Nautiloid",
    morphType = Synthmorph,
    descr = "Nautiloids are a hybrid of short-range spacecraft and submersible capable of holding up to six passengers and their gear. The morph is shaped like a van-sized nautilus, with crew space in the head and shell. A cluster of tentacular limbs mounted under the observation ports in the head provide both fine and brute force manipulation. Originally created for comet and asteroid mining, the design also proved useful for oceanic exploration by gatecrashing teams and Europans. The morph’s interior includes a desktop cornucopia machine and a maker. It can deploy a pair of retractable pontoons for stability when ﬂoating on a liquid surface. A nautiloid’s life support system can support its occupants for up to three months before replenishing—indefnitely if it has a source of hydrogen and oxygen. Nautiloids include radiation shielding, a small airlock, and a healing vat. The nautiloid is also available as a bot with no cyberbrain for the same cost. The bot version has no aptitude bonuses",
    enhancements = Seq("Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Echolocation", "Extra Limbs (8 Arms, 2 Tentacles)", "Hydrostatic Pressure Adaptation", "Industrial Armor", "Internal Rocket", "Mnemonic Augmentation", "Pneumatic Limbs (2 of the Arms)", "Puppet Sock", "Radar", "Radiation Sense", "Swim Bladder", "Telescoping Limbs (2 of the Arms)", "T-Ray Emitter"),
    traits = Seq("Very Large Size"),
    movement = Seq(" Internal Rocket 8/40, Submarine 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 5),
    playerDecisions = Some("+5 to two other aptitude"),
    durability = 200,
    armour = (20, 20),
    cpCost = 155,
    price = ExpensivePlus(150000),
    source = mrg);

  val neoAvian = MorphModel(
    name = "Neo-Avian",
    morphType = Biomorph,
    descr = "Neo-avians include ravens, crows, and gray parrots uplifted to human-level intelligence. Their physical sizes are much larger than their non-uplifted cousins (to the size of a human child), with larger heads for their increased brain size. Numerous transgenic modifcations have been made to their wings, allowing them to retain limited ﬂight capabilities at 1 g, but giving them a more bat-like physiology so they can bend and fold better and adding primitive digits for basic tool manipulation. Their toes are also more articulated and now accompanied with an opposable thumb. Neo-avians have adapted well to microgravity environments, and are favored for their small size and reduced resource use.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Ultraviolet Vision", "Wings"),
    traits = Seq("Non-Mammalian Biochemistry", "Small Size"),
    movement = Seq("Walker 4/20", "Winged 8/40"),
    aptitudeMax = 25.copy(som = Some(20)),
    aptitudeBonus = AptitudeValues(int = 5, ref = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.neoAvianBeak),
    durability = 20,
    cpCost = 25,
    price = Expensive,
    source = mrg);

  val neoBeluga = MorphModel(
    name = "Neo-Beluga",
    morphType = Biomorph,
    descr = "Neo-belugas are the smallest and most numerous of the surviving whale uplifts, ranging 5.5 meters in length on average. They are white-skinned with no dorsal ridge, toothed, and have the distinction of being the only whale that can swim backwards.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Echolocation", "Enhanced Hearing", "Oxygen"),
    traits = Seq("Large Size", "Non-Human Biochemistry", "Lack of Smell"),
    movement = Seq("Swim 16/40"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, som = 5),
    otherEffects = List(SkillMod(skill = "Swimming", mod = 40)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.ramming),
    durability = 35,
    cpCost = 45,
    price = ExpensivePlus(40000),
    source = mrg);

  val neoDolphin = MorphModel(
    name = "Neo-Dolphin",
    morphType = Biomorph,
    descr = "The uplifted versions of various dolphin species are very similar to baseline dolphins physiologically. Thanks to the oxygen reserve implant, neo-dolphins can stay underwater for longer (Cerean dolphins have gills installed, as the subcrustal sea has no breathable atmosphere above it). Common neo-dolphin germlines lack hands or other limbs, though cybernetic arms or even bioware enhancements are not uncommon. Neo-dolphin morphs are very rare, since there are few habitats that can support them, and they are almost never found apart from aquatic environments.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Echolocation", "Enhanced Hearing", "Oxygen Reserve"),
    traits = Seq("Non-Human Biochemistry", "Lack of Smell"),
    movement = Seq("Swim 16/48"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, som = 5),
    otherEffects = List(SkillMod(skill = "Swimming", mod = 40)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.ramming),
    durability = 30,
    cpCost = 40,
    price = ExpensivePlus(35000),
    source = mrg);

  val neoGorilla = MorphModel(
    name = "Neo-Gorilla",
    morphType = Biomorph,
    descr = "Neo-gorillas were uplifted in the same manner as the other neo-hominids and share the same characteristics, though they are not quite as adept at climbing. They stand roughly as tall as humans, though they have stronger and larger frames.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Prehensile Feet"),
    traits = Seq("Non-Human Biochemistry"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    cpCost = 35,
    price = ExpensivePlus(30000),
    source = mrg);

  val neoHominid = MorphModel(
    name = "Neo-Hominid",
    morphType = Biomorph,
    descr = "Neo-hominids include both uplifted chimpanzees, bonobos, and orangutans. All feature enhanced intelligence and bipedal frames. They walk upright, though some (particularly neo-orangutans) are known to knuckle-walk or switch to all fours when injured or in times of stress. All are great climbers, and their prehensile feet help both with climbing and maneuvering in microgravity environments. They retain the body hair of their forebears, though it is a common cultural practice to dye, stylize, or otherwise manipulate their hair in certain communities. Transgenic vocal systems allow them to speak as humans do.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Prehensile Feet"),
    traits = Seq("Non-Human Biochemistry"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, som = 5),
    otherEffects = List(SkillMod(skill = "Climbing", mod = 10)),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 30,
    cpCost = 25,
    price = Expensive,
    source = mrg);

  val neoNeanderthal = MorphModel(
    name = "Neo-Neanderthal",
    morphType = Biomorph,
    descr = "This morph is based on fossilized Neanderthal DNA, uplifted and enhanced to transhuman equivalence. Neanderthal morphs look like muscular humans with a heavy bone structure, distinctively long skulls, heavy brow ridges, and weak chins. Pale complexions and red hair are common features",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack"),
    traits = Seq("Non-Human Biochemistry"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(cog = 5, int = 5, som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val neoOrca = MorphModel(
    name = "Neo-Orca",
    morphType = Biomorph,
    descr = "Though colloquially referred to as killer whales, orcas are actually members of the dolphin family. The average neo-orca length is 7 ",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Echolocation", "Enhanced Hearing", "Oxygen Reserve"),
    traits = Seq("Large Size", "Non-Human Biochemistry", "Lack of Smell"),
    movement = Seq("Swim 16/60"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, som = 10),
    otherEffects = List(SkillMod(skill = "Swimming", mod = 40), SkillMod(skill = "Unarmed Combat", mod = 20)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.neoOrcaBite),
    durability = 40,
    cpCost = 60,
    price = ExpensivePlus(50000),
    source = mrg);

  val neoPig = MorphModel(
    name = "Neo-Pig",
    morphType = Biomorph,
    descr = "Uplifted pig morphs are bipedal and feature transgenic hands, feet, and vocal systems. They tend to be slightly shorter than the average transhuman but much stockier. Males grow tusks from their lower jaws.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack"),
    traits = Seq("Non-Human Biochemistry "),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 20,
    price = High,
    source = mrg);

  val neoPorpoise = MorphModel(
    name = "Neo-Porpoise",
    morphType = Biomorph,
    descr = "Neo-porpoises are smaller but very similar to neo-dolphins and are much like their baseline relatives. They average 2.5 meters in length.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Echolocation", "Enhanced Hearing", "Oxygen Reserve"),
    traits = Seq("Non-Human Biochemistry", "Lack of Smell"),
    movement = Seq("Swim 16/56"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(int = 5, som = 5),
    otherEffects = List(SkillMod(skill = "Swimming", mod = 50)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.ramming),
    durability = 25,
    cpCost = 35,
    price = ExpensivePlus(30000),
    source = mrg);

  val neotenic = MorphModel(
    name = "Neotenic",
    morphType = Biomorph,
    descr = "Neotenics are transhumans modifed to retain a child-like form. They are smaller, more agile, inquisitive, and less resource-depleting, making them ideal for habitat living and spacecraft. Some people find neotenic sleeves distasteful, especially when employed in certain media and sex work capacities.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack"),
    traits = Seq("Social Stigma (Neotenic)", "Small Size"),
    aptitudeMax = 30.copy(som = Some(20)),
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 30,
    cpCost = 25,
    price = Expensive,
    source = mrg);

  val neoWhale = MorphModel(
    name = "Neo-Whale",
    morphType = Biomorph,
    descr = "Less than several hundred neo-whale morphs exist, and the majority remain occupied by their original egos. They are primarily found in Ceres and Atlantica. They are derived from humpback, blue, and sperm whale genetic stock. Humpbacks and blues are baleen whales and require large amounts of krill to survive. Sperm whales are toothed, feeding on fish and squid. Note: only Sperm Whales have Bite Attack (4d10 DV)",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Echolocation", "Enhanced Hearing", "Oxygen Reserve"),
    traits = Seq("Non-Human Biochemistry", "Very Large Size", "Lack of Smell"),
    movement = Seq("Swim 16/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, int = 5, som = 5),
    otherEffects = List(SkillMod(skill = "Swimming", mod = 40)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.neoWhaleRamming, MorphAttacks.neoWhaleBite),
    durability = 100,
    cpCost = 75,
    price = ExpensivePlus(75000),
    source = mrg);

  val nomad = MorphModel(
    name = "Nomad",
    morphType = Biomorph,
    descr = "While synthmorphs are the first choice for many gatecrashers, morph designers have made great headway in creating biomorphs suitable for hazardous exoplanets. The nomad biomorph is optimized for operating in desert environments and takes many of its traits from the camel, prompting some observers to mistake the nomad for a pod morph. With an elongated face designed like a camel to trap water vapor in the nostrils as the morph exhales, nomads are clearly off-putting to many bioconservatives. Some models also have camel feet for better travels in sandy dune environments. Nomads are actually quite hefty under normal circumstances, as they are designed to be able to carry large amounts of fat tissue. Their fat tissue can be moved around their body to adapt to high or low temperatures. When nomads are in the field, however, they can become quite skinny, as they survive for months on their fat tissue alone.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Effcient Digestion", "Enhanced Respiration", "Fat Storage", "Medichines", "Respirocytes", "Temperature Tolerance (Improved Cold)", "Toxin Filters"),
    traits = Seq("Uncanny Valley"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(ref = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 45,
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val novacrab = MorphModel(
    name = "Novacrab",
    morphType = Pod,
    descr = "Novacrabs are a pod design bioengineered from coconut crab and spider crab stock and grown to a larger (human) size. Novacrabs are ideal for hazardous work environments as well as vacworker, police, or bodyguard duties, given their ten 2-meter long legs, massive claws, and chitinous armor. They climb and handle microgravity well and can withstand a wide range of atmospheric pressure (and sudden pressure changes) from vacuum to deep sea. Novacrabs feature compound eyes (with human-equivalent image resolution), gills, dexterous manipulatory digits on their fifth set of limbs, and transgenic vocal cords.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Carapace Armor", "Cortical Stack", "Cyberbrain", "Enhanced Respiration", "Gills", "Mnemonic Augmentation", "Oxygen Reserve", "Puppet Sock", "Temperature Tolerance", "Vacuum Sealing"),
    traits = Seq("Non-Mammalian Biochemistry", "10 legs"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10),
    playerDecisions = Some("+5 to two other aptitudes"),
    attacks = Seq(MorphAttacks.claw),
    durability = 40,
    armour = (11, 11),
    cpCost = 60,
    price = ExpensivePlus(30000),
    source = mrg);

  val list: List[MorphModel] = Macros.memberList[MorphModel];
}
