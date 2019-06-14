package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Nanotechnology {
  val c = "Nanotechnology";

  val healingVat = Gear(
    name = "Healing Vat",
    category = c,
    descr = "Healing vats were the first type of nanotech medicine developed and remain the most powerful medical devices in common use. With the exception of a few exceptionally deadly nanoplagues, a healing vat can cure any disease and heal any injury. As long as the patient is alive when they are place in the healing vat, they will not only survive, but emerge without a scratch. A healing vat can even take a severed head (as long as it has been stabilized by medichines or nanotech first aid) and regrow an entire body based on the head’s genetics. If the patient’s body or medical records contain information about their implants, bioware, or advanced nanotechnology, all of these modifications are also fully restored.\nFew people suffer injuries serious enough to require a healing vat. Most are used as a safe and easy way to perform bodysculpting or to install implants or bioware. Healing vats use specialized nanomachines to either alter the patient’s body or integrate implants or bioware. One advantage of using a healing vat is that no additional healing time is needed, the patient leaves the vat fully recovered from the augmentation and ready to go. Every hospital, clinic, bodyshop, and augmentation parlor has several healing vats. The time required by a healing vat varies with the severity of the damage it is healing or the extent of the modification being made, as noted on the Healing Vat table, (p. 327).",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 326);

  val nanodetector = Gear(
    name = "Nanodetector",
    category = c,
    descr = "Nanodetectors are small devices that suck in air and micro debris in order to scan for and detect nano- bots. Given that nanobots are so small, the density of nanobots in the area has a large impact on its success. The nanodetector has a base skill of 30 for detecting nanobots, modified by +30 if an active nanoswarm or hive is present, +0 if a nanoswarm or hive was active recently, and –10 for the presence of nanobots outside of a swarm or hive. Once a nanobot is detected it may be analyzed either by the user or the nanodetector’s AI, using Academics: Nanotechnology 30 skill. Nanodetectors are often worn and left on, set to alert the user if a hostile nanoswarm is detected.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 327);

  val desktopCornucopiaMachine = Gear(
    name = "Desktop Cornucopia Machine",
    category = c,
    descr = "Cornucopia machines (CMs) are general-purpose nanofabricators. The smallest CMs are desk-sized cubes approximately half a meter on a side with a volume of at least 40 liters. They can produce any small object, from tools to well-folded suits of clothing to handguns or a bowl of cereal. It is sometimes possible to assemble larger items, but they must be manufactured in smaller pieces and then assembled (likely requiring an appropriate Hardware Test).\nWhile users can purchase bulk raw materials, CMs also come equipped with a disassembler. The user loads garbage and other objects into the disassembler so that they can be turned into raw materials for the CM. All legally available disassemblers only deconstruct non-living material.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 327);

  val fabber = Gear(
    name = "Fabber",
    category = c,
    descr = "Fabbers are specialized nanofabricators, portable and considerably smaller than CMs. There are a wide variety of portable fabbers, including ones that can make any hand tool or small piece of personal electronics, ones that can turn any organic material into food and drink, and ones that can create any drug or medicine as well as bandages and specialized dressings. The most common fabbers have a volume of 4 liters. Larger hand tools and devices are produced as 2 or 3 separate parts that must be fitted together. Like CMs, fabbers also contain miniature disposal units.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 328);

  val maker = Gear(
    name = "Maker",
    category = c,
    descr = "Makers are specially designed to produce food and drink for the user. Raw materials can be pro- vided by the addition of any water-containing liquid and collected biomass like leftover food, grass, dirt, dead animals, or transhuman waste. Some models are built into standard vacsuits. Makers can produce water and various flavored beverages, as well as ration bars or thick pudding-like edible gels. With adequate raw material, a maker can indefinitely provide food and drink for up to three transhumans. Most units, however, have a very limited range of flavors and textures that are widely considered to be fairly bad. Models with a wider and better range of flavors and textures are more expensive, but produce food that is considered adequate or occasionally good.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 328);

  val makerBetter = Gear(
    name = "Better Maker",
    category = c,
    descr = "Makers are specially designed to produce food and drink for the user. Raw materials can be pro- vided by the addition of any water-containing liquid and collected biomass like leftover food, grass, dirt, dead animals, or transhuman waste. Some models are built into standard vacsuits. Makers can produce water and various flavored beverages, as well as ration bars or thick pudding-like edible gels. With adequate raw material, a maker can indefinitely provide food and drink for up to three transhumans. Most units, however, have a very limited range of flavors and textures that are widely considered to be fairly bad. Models with a wider and better range of flavors and textures are more expensive, but produce food that is considered adequate or occasionally good.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 328);

  val generalHive = Gear(
    name = "General Hive",
    category = c,
    descr = "General hives are capable of producing any conceivable type of nanobot with the right blueprints and/or programming. Even at their smallest size they are not really portable, with a minimum size being cubes 30 centimeters on a side and a volume of 25 liters.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 328);

  val specialisedHive = Gear(
    name = "Specialised Hive",
    category = c,
    descr = "Specialized hives are far more common than general hives, though they can produce only one type of nanomachines (i.e., choose one type of nanoswarm per hive). The smallest specialized hives are approximately the size of a 12-gauge shotgun shell or a large cherry tomato. Add the cost of the programmed nanoswarm to the hive cost.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 328);

  val egoBridge = Gear(
    name = "Ego Bridge",
    category = c,
    descr = "Ego bridges are vat devices used for uploading and downloading minds. see Backups and Uploading, p. 268, and Resleeving, p. 270.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 328);

  val cleanerSwarm = Gear(
    name = "Cleaner Nanoswarm",
    category = c,
    descr = "This nanoswarm cleans, polishes, and removes dirt and stains. It may be used on an area, specific objects, or people. Some facilities employ permanent cleaner swarms to keep their area spotless. Cleaners may also be programmed to remove specific toxins, chemicals, or other hazardous substances in order to decontaminate an area. Covert operatives and criminals sometimes use cleaners to eliminate any evidence they may have left at a scene usable for forensics purposes, such as blood, hair, or anything that could be DNA-typed.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 329);

  val disassemblerSwarm = Gear(
    name = "Disassembler Nanoswarm",
    category = c,
    descr = "Also known as smart corrosives, these nanobots break down any matter. Their advantage over common acids is that not only are they able to break down any material by using energy to disrupt chemical bonds, but that they can be programmed to take apart certain components while ignoring others, leaving them intact. Disassemblers are a common weapon used against synthmorphs, eating away their components without having to worry about accidentally splashing biomorphs. Upon contact, these nanobots inflict 1d10 ÷ 2 damage (round up) per Action Turn. Accumulated damage counts as a wound when the Wound Threshold is reached. Both Energy and Kinetic armor protect against this damage, but these armors are eaten away as well, so the Armor Value is reduced by the soaked DV.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 329);

  val engineerSwarm = Gear(
    name = "Engineer Nanoswarm",
    category = c,
    descr = "Engineer microswarms are used for various construction purposes: erecting walls, digging tunnels, sealing holes, reinforcing foundations, and so on.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 329);

  val fixerSwarm = Gear(
    name = "Fixer Nanoswarm",
    category = c,
    descr = "This is the nanoswarm version of repair spray (p. 333).",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 329);

  val injectorSwarm = Gear(
    name = "Injector Nanoswarm",
    category = c,
    descr = "Injector microswarms are equipped with tiny needles and a drug payload. A biological target affected by an injector swarm suffers 1 point of damage and the effects of the carried drug, chemical, or toxin. ",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 329);

  val gardenerSwarm = Gear(
    name = "Gardener Nanoswarm",
    category = c,
    descr = "This microswarm is useful for a number of agricultural purposes: killing weeds, planting seeds, trimming plants, pollinating, and even harvesting small items. It may also be programmed to simply defoliate an area.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 329);

  val guardianSwarm = Gear(
    name = "Guardian Nanoswarm",
    category = c,
    descr = "Guardians watch for and attack other unauthorized swarms. Guardians inflict 1d10 ÷ 2 damage (round up) on other swarms they come into contact with per Action Turn.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 329);

  val proteanSwarm = Gear(
    name = "Protean Nanoswarm",
    category = c,
    descr = "This nanoswarm is designed to disassemble other materials and objects and to create a single specific, pre-programmed device from the components (much like a specialized nanofabricator). The proteans must be able to scavenge appropriate raw materials (for example, to create a metallic device the nanobots must transform something else made of metal). The construction time takes 1 hour per cost category of the item (1 hour for a Trivial cost item, 2 hours for Low, etc.).",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 329);

  val saboteurSwarm = Gear(
    name = "Saboteur Nanoswarm",
    category = c,
    descr = "Sab nanobots are designed to infiltrate electronics or machinery and sabotage them in small but difficult to discern ways: severing connections, disabling components, gumming up moving parts, etc. Saboteurs inflict damage on devices similar to disassemblers, but the target is not destroyed and such damage is not immediately obvious. They inflict 1d10 ÷ 2 points of damage to synthmorphs, bots, and other devices every Action Turn. Armor has no effect, but accumulated damage counts as a wound when the Wound Threshold is reached.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 329);

  val scoutSwarm = Gear(
    name = "Scout Nanoswarm",
    category = c,
    descr = "A scout nanoswarm will systematically map and explore an area, collecting samples of all materials and substances it encounters. The samples are carried back to the hive or canister and chemically analyzed. Scouts can also be used for forensic purposes, collecting DNA samples, analyzing chemical residues, and examining other evidence.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 329);

  val taggantSwarm = Gear(
    name = "Taggant Nanoswarm",
    category = c,
    descr = "Taggants seek to lodge themselves onto everything in their area of dispersal. Each carries a unique identifier, so that if it is found later, the tagged person or object can be linked back to the point they were tagged. Taggants can be programmed to remain silent, only responding to query broadcasts made with the proper crypto codes, or they can be programmed to broadcast their location back to the deployer via the mesh.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 329);

  // Firewall
  val nanomask = Gear(
    name = "Nanomask",
    category = c,
    descr = "This makeup nanobot application decorates the character’s face in changing artistic and aesthetic styles that also happen to deter the capabilities of facial recognition software. It provides a –30 modifier to attempts to identify the subject using facial recognition. Some habitats ban this accessory.",
    price = Cost.Low,
    source = Sources.firewall,
    sourcePage = 175);

  val suborningSwarm = Gear(
    name = "Suborning Swarm",
    category = c,
    descr = "This nanotechnology is highly restricted in most of the solar system, including on all worlds and habitats controlled by the Planetary Consortium. The nanobots in this swarm are programmed to identify all sensors and devices that transmit any signal in the electromagnetic spectrum. This includes radios, ectos, communication links, microbugs, x-ray emitters, etc. Once identified, the swarm’s operator can order the nanobots to suborn these sensors and transmitters. Nanomachines in the swarm then attach themselves to all of these devices in the area and can attempt to either disable or tap into them.\nDisabling sensors and transmitters is rather easy; the swarm simply creates enough electromagnetic interference in and around the device to make it unusable. Make a Simple Test using the swarm’s Hardware: Electronics skill of 40. Success indicates all devices have been temporarily disabled. Failure means that a small portion of devices remain active or semi-functional. Large devices may not be disabled. Each swarm can disable sensors and transmitters for up to 1 hour before it must be recharged. Temporary disablement has no long-term damaging effects on the devices. Operators of the devices may attempt to overrride the jamming; in this case the operator must succeed in an Variable Opposed Interfacing Test against the swarm’s skill of 40, per the rules for Radio Jamming, p. 262, EP.\nTapping into devices is more difficult. In this case, make a regular test using the swarm’s Hardware: Electronics skill of 40. It is recommended the gamemaster apply a single roll to determine the swarm’s general effectiveness, and handle individual devices on a case-by-case basis as needed. If successful, the swarm siphons sensor and communication feeds through physical taps in the devices’ internal electronics. Note that encrypted transmissions are not decoded, though the operator (or their muse) can attempt to decrypt them on an individual basis.\nSuborning swarms are ineffective against other nanoswarms (including smart dust) and the sensory and communication implants and enhancements of biomorphs. They are, however, effective against the sensors and communications of robots and synthmorphs, and are especially dangerous to swarmanoids (including skulkers and smart swarms), as they inhibit the ability of the swarmanoid components to communicate. If the Hardware: Electronics Test to disable is successful against a swarmanoid, that morph suffers a negative modifier equal to the suborning swarm’s MoS for as long as it remains in the swarm’s area of effect.",
    price = Cost.High,
    source = Sources.firewall,
    sourcePage = 175);

  val subverbeeSwarm = Gear(
    name = "Subverbee Swarm",
    category = c,
    descr = "Subverbees create a distributed processing network hidden in a hab’s gardener wasp swarms, cleaner nanoswarms, or other systems. The subverbees “inoculate” the targeted system with tiny processors that piggyback onto the mesh connections of their hosts. The resulting processing network doesn’t have enough power to run AIs or simulspaces, but it can host a VPN, store data, and act as a concealed router for other mesh traffic.",
    price = Cost.Expensive,
    source = Sources.firewall,
    sourcePage = 175);

  // Panopticon
  val nanotatEraser = Gear(
    name = "Nanotat Eraser",
    category = c,
    descr = "This illegal nanoswarm treatment is specifically designed to penetrate the fingertips of morphs and eradicate all signs of the nanotat ID it carries. Erasing a nanotat ID takes about 5 minutes and itches like crazy. Though usually applied to a specific person as a treatment, criminals and terrorists have sometimes deployed nanotat-erasing nanoswarms in public areas, surreptitiously erasing the IDs from unsuspecting people as a means of confusing security forces engaged in an ego hunt.",
    price = Cost.Expensive,
    source = Sources.panopticon,
    sourcePage = 152);

  val smartPlankton = Gear(
    name = "Smart Plankton",
    category = c,
    descr = "Smart plankton is a nanoswarm variant of smart dust (p. 316, EP) designed for underwater use. The plankton nanobots are designed for aquatic movement and can communicate via flashing lights and infrasound. Like smart dust, smart plankton can record video, audio (including infrasound and ultra-sound), water temperature, chemical traces, as well as movement and other data.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 152);

  val list: List[Gear] = Macros.memberList[Gear];
}
