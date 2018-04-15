package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object MorphsGL {
  import MorphImplicits._
  import MorphType._
  import Cost._
  import Sources._

  val galatea = MorphModel(
    name = "Galatea",
    morphType = Synthmorph,
    descr = "A group of Lunar morph designers created this high-end synthmorph in an attempt to increase the social acceptance of synthmorphs by showcasing how attractive and versatile they can be. This elegant morph looks expensive and is designed to allow the user to master any social situation. A few media icons and socialites have already found that this morph’s mixture of utility and novelty value has helped enhance their fame and reputation.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Enhanced Hearing", "Mnemonic Augmentation"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(sav = 10, coo = 5, int = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    armour = (6, 6),
    cpCost = 65,
    price = ExpensivePlus(70000),
    source = mrg);

  val gargoyle = MorphModel(
    name = "Gargoyle",
    morphType = Synthmorph,
    descr = "Gargoyles are an anthroform synthetic morph designed as a mobile sensor unit. They are used by media, freelance journalists, forensics teams, and anyone who is regularly required to document a situation thoroughly. Though humanoid in shape, gargoyles stand taller than average transhumans for better viewing. Much of their exterior surface is covered in quantum dot camera-displays.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Anti-Glare", "Basic Mesh Inserts", "Chemical Sniffer", "Cortical Stack", "Cyberbrain", "Enhanced Hearing", "Enhanced Smell", "Enhanced Vision", "Lidar", "Mnemonic Augmentation", "Nanoscopic Vision", "Oracles", "Radar", "T-Ray Emitter"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    armour = (6, 6),
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val ghost = MorphModel(
    name = "Ghost",
    morphType = Biomorph,
    descr = "Ghosts are partially designed for combat applications, but their primary focus is stealth and infltration. Their genetic profle encourages speed, agility, and reﬂexes, and their minds are modifed for patience and problem-solving",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Adrenal Boost", "Enhanced Vision", "Grip Pads"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 10, ref = 5, som = 5, wil = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 45,
    cpCost = 70,
    price = ExpensivePlus(40000),
    source = mrg);

  val grey = MorphModel(
    name = "Grey",
    morphType = Biomorph,
    descr = "Originally created as part of a fad based on 20th-century images of aliens, the grey morph soon became popular with eccentric scientists and engineers. This morph’s slender and weak-looking body stands only 1.5 meters tall, short compared to modern transhumans. Its distinctive large head and eyes strike many transhumans as disturbing.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Circadian Regulation", "Clean Metabolism", "Cortical Stack", "Eidetic Memory", "Emotional Dampers", "Enhanced Vision", "Math Boost"),
    traits = Seq("Uncanny Valley"),
    aptitudeMax = 30.copy(som = Some(20)),
    aptitudeBonus = AptitudeValues(cog = 5, wil = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 30,
    cpCost = 25,
    price = ExpensivePlus(30000),
    source = mrg);

  val griefer = MorphModel(
    name = "Griefer",
    morphType = Synthmorph,
    descr = "Based on the case synthmorph design, griefers are used by vandals, terrorists, and dedicated trolls to harass enemies and antagonize the masses. Griefers have embedded sound and holographic display systems so they can easily harass an individual or an entire crowd. They are also typically equipped with numerous hacking tools and software aids, though they do not come with these by default. Most importantly, they are built without cortical stacks, so if they are destroyed, the ego cannot be interrogated through psychosurgery. Griefers are illegal in many habitats, especially in the Planetary Consortium, but DRM-free blueprints are easy to fnd in many darknets, thus making them a persistent annoyance in some systems. A few habitats have passed laws mandating that killing a griefer is not considered murder, assault, or even destruction of property.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cyberbrain", "Holographic Projector", "Loudspeakers", "Mnemonic Augmentation", "Puppet Sock"),
    traits = Seq("Lemon", "No Cortical Stack", "Social Stigma (Griefer)"),
    movement = Seq("Walker 4/16"),
    aptitudeMax = 20,
    playerDecisions = Some("-5 to two other aptitudes"),
    durability = 20,
    armour = (4, 4),
    cpCost = 5,
    price = Moderate,
    source = mrg);

  val guard = MorphModel(
    name = "Guard",
    morphType = Synthmorph,
    descr = "Everyone knows that synthmorphs are tougher and better equipped for serious combat than biomorphs. However, many people in the inner system are not comfortable with using hulking synthmorphs as bodyguards or security personnel. Instead, some choose this subtle and extremely deadly alternative. This morph’s enhanced senses allow it to more easily detect any threats to the person the user is guarding, and the built-in weaponry and moderate armor make it highly resistant to damage. The synthetic mask disguises it quite effectively as an olympian or fury morph.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Chemical Sniffer", "Cortical Stack", "Cyberbrain", "Cyberclaws", "Enhanced Vision", "Hand Laser", "Lidar", "Mnemonic Augmentation", "Neurachem (Level 1)", "Puppet Sock", "Synthetic Mask", "T-Ray Emitter"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10, coo = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    armour = (12, 12),
    cpCost = 60,
    price = ExpensivePlus(60000),
    source = mrg);

  val deluxeGuard = MorphModel(
    name = "Deluxe Guard",
    morphType = Synthmorph,
    descr = "Variant of the Guard Morph. This morph is used by both top-of-the-line security personnel and wealthy and powerful people who worry about kidnapping and similar threats and wish to be able to personally respond to any problems.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Chemical Sniffer", "Cortical Stack", "Cyberbrain", "Cyberclaws", "Enhanced Vision", "Hand Laser", "Lidar", "Mnemonic Augmentation", "Nanophages", "Neurachem (Level 1)", "Puppet Sock", "Synthetic Mask", "T-Ray Emitter", "Weapon Mount (Microwave Agonizer, Concealed)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10, coo = 5, ref = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 50,
    armour = (12, 12),
    cpCost = 75,
    price = ExpensivePlus(80000),
    source = mrg);

  val hazer = MorphModel(
    name = "Hazer",
    morphType = Biomorph,
    descr = "Hazers are tall, fine-boned morphs, lightly muscled but heavily insulated against loss of body heat. Even with all of their augmentations, hazers can’t survive exposure to the frigid atmosphere of Titan—but they can handle it slightly longer than other morphs. Hazers tend to be fair and slender, with chiseled features. Some have features so angular or elfin that their beauty is alien and unsettling to other human phenotypes. Striking Looks and Uncanny Valley are both common morph traits.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Enhanced Vision", "Radiation Sense", "Respirocytes", "Temperature Tolerance (Improved Cold)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, wil = 5),
    playerDecisions = Some("+5 to two other aptitudes"),
    durability = 35,
    cpCost = 35,
    price = Expensive,
    source = mrg);

  val hibernoid = MorphModel(
    name = "Hibernoid",
    morphType = Biomorph,
    descr = "Hibernoids are transgenic-modifed humans with heavily altered sleep patterns and metabolic processes. Hibernoids have a decreased need for sleep, requiring only 1–2 hours a day on average. They also have the ability to trigger a form of voluntary hibernation, effectively stopping their metabolism and need for oxygen. Hibernoids make excellent long-duration space travelers and habtechs, but these morphs are also favored by personal aides and hypercapitalists with non-stop lifestyles.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Circadian Regulation", "Cortical Stack", "Hibernation"),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(int = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 25,
    price = Expensive,
    source = mrg);

  val hulder = MorphModel(
    name = "Hulder",
    morphType = Biomorph,
    descr = "Hulder are engineered for survival in the Titanian wilds. In silhouette, their bodies resemble a long-legged great auk, though viewed up close, the resemblance to a bird ends. Hulder have no feathers, but rather smooth, rubbery charcoal or black skin covering a thick layer of nano-augmented blubber. What resembles a thick bill from a distance is actually a seamless protrusion of the face, packed with sensory augmentations. Hulder stand 2 meters tall and weigh on average 135 kilograms. Their sensory organs, webbed feet, and fingers are all cybernetic. Hulder can only tolerate temperatures hospitable to baseline transhumans for short periods of time. In the open, they must balance their bodies’ chemical reservoirs with other hulder and caribou once per month or with a chemical reserve pack. A typical band of 2–6 hulder and 10–20 caribou can go about a year before having to visit a hab or a station like Huvudskär to replenish chemical reserves.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Cortical Stack", "Digging Claws", "Direction Sense", "Enhanced Vision", "Long-Term Life Support", "Oxygen Reserve", "Radiation Sense", "Swim Bladder", "T-Ray Emitter", "Temperature Tolerance (Cryonic)"),
    traits = Seq("Non-Mammalian Biochemistry", "Temperature Intolerance (Warm)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 5, wil = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    cpCost = 50,
    price = ExpensivePlus(40000),
    source = mrg);

  val hyperbright = MorphModel(
    name = "Hyperbright",
    morphType = Biomorph,
    descr = "This morph is an attempt by a research team on Bright to create a successor to the menton, making it the most intelligence-enhanced morph ever created. Work on the hyperbright morph has been plagued with diffculties, as the designers attempt to push technical limits, creating a morph that can work at peak effciency without distraction for long periods of time. In an effort to create a morph that proves their design and earns some positive reputation for their project, the creators took short cuts that caused the morph to have several distinctive and potentially annoying quirks, including an inherent need for drugs to stabilize its exotic neurochemistry. The result is a morph that is instantly recognizable by the brightly colored bony crest along the skull that helps cool its brain. Despite its quirks, the hyperbright has gained a small following among a number of scientists and engineers, especially since it has been optimized for use in the low-g environments of the outer system. When created or used on Bright, this morph is usually also ftted with parallel processor nanoware (p. 189, Rimward).",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Circadian Regulation", "Cortical Stack", "Eidetic Memory", "Endocrine Control", "Grip Pads", "Hyper-Linguist", "Math Boost", "Mental Speed", "Prehensile Feet"),
    traits = Seq("Addiction (minor, to comfurt)", "Fast Metabolism", "Uncanny Valley"),
    aptitudeMax = 30.copy(cog = Some(20), int = Some(40)),
    aptitudeBonus = AptitudeValues(cog = 15, int = 10, wil = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 70,
    price = ExpensivePlus(40000),
    source = mrg);

  val hypergibbon = MorphModel(
    name = "Hypergibbon",
    morphType = Pod,
    descr = "Built from siamang genestock, the largest of the lesser apes, hypergibbons are often mistaken for uplifts, although this is not the case. The gibbon was never a candidate for uplift due to a brain anatomy considerably more primitive than great apes. With the addition of a cyberbrain, though, they make excellent pods. Many primate uplifts choose hypergibbons in place of other pods or when they need something small like a neotenic. Hypergibbons stand about 1 meter tall, weigh 15 kilograms, and typically have black fur and skin (although bodysculpting permits many variations). They have inﬂatable throat sacks that allow melodious calls that carry great distances. Their wrists feature a ball-and-socket joint and also naturally dislocate to enable easier swinging by the arms.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Prehensile Feet", "Puppet Sock"),
    traits = Seq("Limber (Level 2)", "Social Stigma (Pod)", "Non-Human Biochemistry trait", "Small Size trait"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, ref = 5),
    skillBonus = Seq(("Climbing" -> 10), ("Freerunning" -> 20)),
    durability = 25,
    cpCost = 30,
    price = Expensive,
    source = mrg);

  /*
   val infomorph = MorphModel(
    name = "Infomorph",
    morphType = None, //TODO make that work
    descr = "Infomorphs are digital-only forms—they lack a physical body. Infomorphs are sometimes carried by other characters instead of (or in addition to) a muse in a ghostrider module. Full rules for infomorphs can be found on p. 265, EP, and p. 138, Transhuman.",
    enhancements = Seq("Mnemonic Augmentation"),
    traits = Seq("No physical form"),
    movement = Seq(),
    aptitudeMax = 40,
    //TODO Speed +2
    durability = 0,
    cpCost = 0,
    price = None,
    source = mrg); */

/*

  val  = MorphModel(
    name = "",
    morphType = ,
    descr = "",
    enhancements = Seq(""),
    traits = Seq(""),
    movement = Seq(""),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5),
    skillBonus = Seq(("" -> 10)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.),
    durability = ,
    armour = (, ),
    cpCost = ,
    price = ExpensivePlus(),
    source = mrg);

*/
  val list: List[MorphModel] = Macros.memberList[MorphModel];
}
