package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Nanoware {
  import MorphType._;
  import CompendiumRefImplicits._;

  val c = "Nanoware";

  val implantedNanotoxins = Augmentation(
    name = "Implanted Nanotoxins",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The morph has an implanted nanobot hive that produces nanotoxins (p. 324). This implant is designed so that the character can deploy these nanobots instantly via a scratch with claws, spraying with saliva, or simply making continuous bare-skin contact. Characters can choose whether or not to deploy these nanobots. Each nanotoxin generator only produces a single variety of nanobots, with the most common types being ones designed to kill or incapacitate almost any living target or ones designed to destroy delicate machinery. Characters are immune to their own nanotoxins. Nanotoxins are highly restricted and many habitats will not allow anyone with this implant on board. [One Cost Category Higher Than Toxin Cost]",
    price = Cost.None,
    source = Sources.ep,
    sourcePage = 308);

  val medichines = Augmentation(
    name = "Medichines",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      """This is the most common form of nanoware. These nanobots monitor the user’s body at a cellular level and fix any problems that arise.
        |Medichines eliminate most diseases, drugs, and toxins (but not nanodrugs or nanotoxins) before they can do more than minor harm to the host (see Drug Effects, p. 318). If desired, the user can temporarily override this protection to permit intoxication or other effects, but unless the character activates a second specially labeled override, medichines prevent the toxins from accumulating to lethal or permanently harmful levels. In this case, they can also be activated at a later point to reduce a drug or toxin’s remaining duration by half.
        |Medichines allow the character to ignore the effects of 1 wound. They also speed normal healing as noted under see Biomorph Healing, p. 208. If the user suffers 5 or more wounds at once, or more than 6 wounds in an hour, the damage has exceeded the medichines’ ability to repair. In this case, the medichines place the character into a medical stasis, where their mind and body are perfectly preserved, but where the character cannot act in any way. Under these circumstances the medichines also send out a priority call for emergency services via the character’s mesh inserts.
        |Medichines for synthmorphs and bots consist of nanobots that monitor and repair the shell’s integrity and internal system functions. Note that the synthmorph version of medichines allows the synthmorph to self-repair in the same manner by which a biomorph with medichines would naturally heal (p. 208).""".stripMargin,
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 308);

  val mentalSpeed = Augmentation(
    name = "Mental Speed",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph, Infomorph),
    descr =
      """With this nanoware system, nanobots alter the character’s neural architecture and augment the functioning of their neurons. The character can deliberately speed up their mind to think and also receive and process sensory information far faster than ordinary humans. Time seems to subjectively slow down for the character, allowing them to carefully plan their next action, even if they only have a split second to do so. With this system active, the character can discern things occurring too fast for a normal human to perceive, such as the individual frames of an old analog film or understanding sounds that were accelerated to many times their normal speed. The character can also read 10 times faster than normal and can track the paths of bullets and similar fastmoving objects with a successful Perception Test.
        |When using this augmentation, the character gains two extra Complex Actions during each Action Phase that may only be used for mental actions. The character also receives a +3 Initiative bonus. The character thinks at normal speed whenever this nanoware is inactive. This nanoware is incompatible with any other augmentation that provides any form of extra actions, such as multi-tasking. This augmentation can be used as often as desired, but actively using it renders ordinary conversation and social interactions difficult and requires concentration to maintain.""".stripMargin,
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 308);

  val nanophages = Augmentation(
    name = "Nanophages",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "These nanobots patrol the body, alert for signs of intrusive nanodrugs or -toxins and destroying them before they have more than a minor effect. Nanophages provide automatic immunity against nanodrugs and nanotoxins unless they are specifically commanded to stand down by the user, via their mesh implants.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 309);

  val oracles = Augmentation(
    name = "Oracles",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph, Infomorph),
    descr = "These neural macrosensing nanobots pay attention to the sensory input on which the character is not focusing, alerting them about important things they might otherwise overlook. Oracles also act as a sort of memory buffer and search aid, extending short term memory, helping the character recall memories and details, and crosschecking them with other memories. Oracles negate Perception modifiers for distraction, apply a +10 modifier to Investigation Tests, and add a +30 bonus to memory-related tests.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 309);

  val respirocytes = Augmentation(
    name = "Respirocytes",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "These nanobots act as highly efficient artificial red blood cells, increasing the ability to transfer oxygen and carbon dioxide. This increases the morph’s ability to hold their breath to 4 hours and increases DUR by +5.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 309);

  val skillware = Augmentation(
    name = "Skillware",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph, Infomorph),
    descr = "The morph’s brain is laced with a network of artificial neurons that may be formatted with downloaded information. This allows the user to download skillsofts (p. 332) into their brains, gaining the use of those programmed skills until the skillsoft is erased or replaced. Skillware systems are only capable of handling 100 total skill points worth of skillsofts at a timeThe morph’s brain is laced with a network of artificial neurons that may be formatted with downloaded information. This allows the user to download skillsofts (p. 332) into their brains, gaining the use of those programmed skills until the skillsoft is erased or replaced. Skillware systems are only capable of handling 100 total skill points worth of skillsofts at a time.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 309);

  val skinflex = Augmentation(
    name = "Skinflex",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This disguise implant allows the user to restructure their facial features and musculature and alter skin tone and hair color. The entire process takes a mere 20 minutes. Skinflex adds +30 to Disguise Tests.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 309);

  val skinlink = Augmentation(
    name = "Skinlink",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Skinlink nanobots live on the morph’s external skin or shell, automatically swarming over and creating a physical connection with any electronics the user touches. They also take advantage of the electrical field in a biomorph’s skin for communication. They allow the user to communicate and mesh with any devices merely by touching them. This is considered a wired link, and so is not subject to wireless interception or interference. Two skinlinked characters can also communicate and mesh simply by touching.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 309);

  val wristMountedTools = Augmentation(
    name = "Wrist-Mounted Tools",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The morph has a 6 centimeter-wide metal band containing nanobot generators implanted around each wrist. These nanobots link together to duplicate the function of a utilitool (p. 326), creating narrow, highly flexible arms that each ends in a specialized tool. These nanobots can also produce tiny fiber optics to allow the character to see through small openings, as well as being able to create small weapons equal to bioware claws. The fact that these tool are mentally controlled gives the character a +20 modifier to skills involving repairing or modifying devices with mechanical parts, opening locks or disarming alarm systems, or performing first aid.",
    price = Cost.Moderate,
    related = List(MorphAttacks.bioClaw),
    source = Sources.ep,
    sourcePage = 309);

  // Gatecrashing
  val personalPowerPlant = Augmentation(
    name = "Personal Power Plant",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "For gatecrashers worried about being trapped on an exoplanet with no source of food, this nanoware system provides a solution. The nanobots in this system are powered by the isotope gadolinium-148. They transfer this nuclear energy to the body so that it is absorbed in a safe and consistent manner. This effectively fuels the body without the need to eat. With a half life of 78 years, the character can go for a century and possibly longer without regularly eating. A tiny bit of food consumption is still necessary to replace cells, though a small food stash could literally be stretched out for years. Likewise, vitamin and protein supplements would be necessary for long-term health, but as an alternative to starving to death, the personal power plant cannot be beat.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 153);

  // Panopticon
  val gaitMasking = Augmentation(
    name = "Gait Maskin",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Gait masking nanosystems alter the bone density, muscle tone, and shape of the user’s feet and legs in minute but effective ways, altering their gait pattern just enough to avoid detection. The process of reconfigura- tion takes 20 minutes. Gait masking is illegal in many habitats. Gait masking can also be used to mimic an existing gait profile; apply a +30 modifier on Disguise Tests to fool gait biometric scanners. ",
    price = Cost.Expensive,
    source = Sources.panopticon,
    sourcePage = 149);

  val nanotatIdFlux = Augmentation(
    name = "Nanotat ID Flux",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This highly illegal system is a programmable version of the nanotat ID. Any new (fake) ID may be programmed in, and the nanotat may be reconfigured in seconds (1 Action Turn) to switch to another ID pattern in storage. This nanoware may not be configured for legal IDs unless they are actually legal or their encryption has been cracked.",
    price = Cost.Expensive,
    source = Sources.panopticon,
    sourcePage = 149);

  val skeletalDisguise = Augmentation(
    name = "Skeletal Disguise",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This implanted nanobot system is designed to disguise a subject’s skeletal structure and create false sensor readings, either to avoid identification or to mimic an existing skeletal pattern. An existing pattern can only be mimicked if the character is of equivalent body mass and size. Altering the skeletal signature takes 20 minutes. Apply a −30 modifier to the scanner system’s Perception Test.",
    price = Cost.Expensive,
    source = Sources.panopticon,
    sourcePage = 149);

  // Rimward
  val longTermLifesupport = Augmentation(
    name = "Long-Term Life Support",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The biomorph is adapted for harsh environmental conditions and can survive for long periods of time as a closed system thanks to symbiotic bacteria and nanomachines. This augmentation allows any biomorph or pod to recycle air, food, and water for up to one year. This augmentation’s implanted miniature maker allows the morph to process ice and various simple organic chemicals into air, water, and food. The morph need not eat or breathe but must ingest about five kilograms of ice and carbon grit per day. It must also balance out or replenish chemical reserves once a month, either by exchanging with other similarly augmented morphs or applying a Low-cost chemical reserve pack.",
    price = Cost.Expensive,
    source = Sources.rimward,
    sourcePage = 189);

  val neuralEnhancers = Augmentation(
    name = "Neural Enhancers",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This active nanotechnology bonds with the morph’s neural structures, creating a series of specialized cognitive subprocessors that enhance the user’s intelligence. It provides users with a +5 modifier to COG. However, enhancing intelligence is a difficult process and this enhancement is based on techniques used on existing morphs. It has no effect if used on a morph that has a COG modifier of +10 or more. This augmentation can be used on biomorphs, pods, and synthmorphs.",
    price = Cost.Expensive,
    source = Sources.rimward,
    sourcePage = 189);

  val list: List[Augmentation] = Macros.memberList[Augmentation]
}
