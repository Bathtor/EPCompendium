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

  val list: List[MorphModel] = Macros.memberList[MorphModel];
}
