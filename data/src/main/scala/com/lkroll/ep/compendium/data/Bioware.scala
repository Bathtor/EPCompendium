package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Bioware {
  import MorphType._;
  import CompendiumRefImplicits._;

  val c = "Bioware";
  val cCyber = "Bioware or Cyberware";

  val directionSense = Augmentation(
    name = "Direction Sense",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      "The character has an innate sense of direction and distance using advanced inertial navigation. The character can arbitrarily define any point as “north” and keep track of which direction that is, as well as knowing approximately how far they have come. Characters with this augmentation can always retrace any route they have taken, only experiencing difficulty with three-dimensional routes lacking navigational markers (such as deep space or undersea; apply a –30 modifier). Since positioning inside habitats by anyone with basic mesh inserts is an automatic affair, only characters venturing to remote locations require this augmentation.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val echolocation = Augmentation(
    name = "Echolocation",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      "The character possesses sonar similar to that of a bat or dolphin. The character bounces brief ultrasonic pulses off their surroundings and uses them to form an image of these surroundings through the pattern of reflections of these pulses received by the character’s ears. For more details, see Using Enhanced Senses, p. 302. This augmentation works in both air and water and has a range of 20 meters in air and 100 meters in water.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val enhancedHearing = Augmentation(
    name = "Enhanced Hearing",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      "The morph’s ears are enhanced to hear both higher and lower frequency sounds—the range of sounds they can hear is twice that of normal human ears see Using Enhanced Senses, p. 302. In addition, their hearing is considerably more sensitive, allowing them to hear sounds as if they were five times closer than they are. A character with this augmentation can easily overhear even a softly spoken conversation at another table in a small restaurant. This augmentation provides a +20 modifier to all Perception Tests involving hearing.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val enhancedSmell = Augmentation(
    name = "Enhanced Smell",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      "The morph’s sense of smell is equal to that of a bloodhound. The user can identify both chemicals and individuals by smell and can track people and chemically reactive objects by odor as long as the trail was made within the last several hours and has not been obscured. The character can also gain a general sense of the emotions and health of any character within 5 meters (+20 to Perception or Kinesics Tests to do so).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val enhancedVision = Augmentation(
    name = "Enhanced Vision",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      "The morph’s eyes have tetrachromatic vision capable of exceptional color differentiation. These eyes can also see the electromagnetic spectrum from terahertz wave frequencies to gamma rays, enabling them to see a total of several dozen colors, instead of the seven ordinary human eyes can perceive. In addition, these eyes have a variable focus equivalent to 5 power magnifiers or binoculars. This augmentation provides a +20 modifier to all Perception Tests involving vision. For further applications, see Using Enhanced Senses, p. 302.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val eideticMemory = Augmentation(
    name = "Eidetic Memory",
    category = c,
    appliesTo = List(Biomorph, Pod, Infomorph),
    descr =
      "The character can remember everything that ever happened to them, in detail, with no long term memory loss. For example, they can recite a page they read in a book a month ago, recall a string of 200 random characters they viewed a year ago, or even tell you what they had for breakfast on a particular date a decade ago. However, they can only remember things to which they paid attention. The character will not remember the contents of a note on someone’s desk if they merely glanced at it; they must specifically have read it. No effort is required to use this augmentation, the character merely needs toattempt to remember a specific fact.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val hyperLinguist = Augmentation(
    name = "Hyper Linguist",
    category = c,
    appliesTo = List(Biomorph, Pod, Infomorph),
    descr =
      "The morph’s brain maintains the linguistic flexibility of a small child, allowing the character to learn languages with great ease. This functions as the Hyper Linguist trait, p. 146.",
    related = List(TraitsPositiveEP.hyperLinguist),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val mathBoost = Augmentation(
    name = "Math Boost",
    category = c,
    appliesTo = List(Biomorph, Pod, Infomorph),
    descr =
      "The character can perform any feat of calculation, including the most complex and advanced mathematics, instantly and with great precision, with the same ease an unmodified human can add 2 + 3. The character can calculate odds, find correlations in numerical data, and perform similar tasks with great ease. Apply a +30 modifier on tests involving math calculations.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 301
  );

  val multiplePersonalities = Augmentation(
    name = "Multiple Personalities",
    category = c,
    appliesTo = List(Biomorph, Pod),
    descr =
      """The character’s brain is intentionally partitioned to accommodate an extra personality. This multiplicity is not viewed as a disorder, but as a cognitive tool to help people deal with their hypercomplex environments. This extra personality can be an NPC run by the game master, a separate character (in ego form only) made by the player, or the downloaded fork of another character. For all intents and purposes, the extra personality is treated as a separate ego (i.e., it may fork separately), except that both personalities are backed up in the same cortical stack and if downloaded they must be placed in separate morphs or in another morph with this implant.
        |Only one ego may be in control of the morph at a time. The other resides in the background, still active, but not on a surface level. Each ego is completely aware of what the other is doing, thinking, etc. If for some reason the subsumed personality wants to come to the fore, but the other personality won’t relinquish control, make an Opposed WIL × 3 Test. Each ego has its own Lucidity and Trauma Threshold, and they track stress and trauma separately. Any psi attacks or social/mental influences only affect the personality at the fore.
        |Having an extra ego in your head, working in the background, is helpful for multitasking. The character receives an extra Complex Action each turn that may only be used for mental or mesh actions.""".stripMargin,
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 301
  );

  val adrenalBoost = Augmentation(
    name = "Adrenal Boost",
    category = c,
    appliesTo = List(Biomorph, Pod),
    descr =
      "This adrenal gland enhancement supercharges the character’s adrenal response to situations that invoke stress, pain, or strong emotions (fear, anger, lust, hate). When activated, the concentrated burst of norepinephrine accelerates heart rate and blood flow and burns carbohydrates. In game terms, this allows the character to ignore the modifiers from 1 wound and temporarily increases REF by +10 (also boosting REF-linked skills and Initiative). These modifiers apply until the character has calmed down (if the character also has endocrine control, p. 304, then adrenal boosts can be activated and deactivated at will, and the negated wounds are cumulative).",
    related = List(SpecialSubstances.norepinephrineBoost),
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 302
  );

  val lightBioweaveArmor = Augmentation(
    name = "Bioweave Armor (Light)",
    category = c,
    appliesTo = List(Biomorph, Pod),
    descr =
      "Bioweave armor involves lacing the morph’s skin with artificial spider silk biological fibers. This provides an Armor rating of 2/3 without changing the appearance, texture, or sensitivity of the morph’s skin. This armor is cumulative with worn armor, but not heavy bioweave or carapace.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 302
  );

  val heavyBioweaveArmor = Augmentation(
    name = "Bioweave Armor (Heavy)",
    category = c,
    appliesTo = List(Biomorph, Pod),
    descr =
      "Heavy bioweave armor involves lacing the morph’s skin with a denser and thicker network of the same fibers. The morph’s skin becomes thicker and somewhat less flexible except at the joints. The morph’s skin also has an unusually smooth look, and a distinctively smooth and toughfeeling texture. This provides an Armor rating of 3/4 without decreasing the morph’s mobility. The character’s sense of touch, however, is significantly reduced (–20 modifier) except on their hands, feet, and face. This armor is cumulative with worn armor.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 303
  );

  val carapaceArmor = Augmentation(
    name = "Carapace Armor",
    category = c,
    appliesTo = List(Biomorph, Pod),
    descr =
      "Carapace armor combines bioweave armor with hard but flexible plates of a chitin-ceramic hybrid material modeled on the microscopic structure and texture of arthropod exoskeletons. This armor is obvious and has a somewhat crocodilian or insectoid appearance (character’s choice). The morph is completely hairless as well. This provides an Armor rating of 11/11. This armor is not cumulative with worn armor or bioweave.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 303
  );

  val chameleonSkin = Augmentation(
    name = "Chameleon Skin",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      "The morph’s skin is augmented with complex chromatophores so that it changes color like the skin of a chameleon or an octopus. The morph can match the appearance of almost any color and most patterns. This provides a +20 modifier to Infiltration Tests to avoid being seen or noticed, as long as the character is stationary or not moving faster than a slow walk. The character must be nude or wearing smart clothing (p. 325) of the same color/ pattern. If incompletely camouflaged, or if moving faster, reduce the modifier to +10. In addition to blending in, the character can also consciously change the color and pattern of their skin to deliberately stand out (+20 on Perception Tests to notice) or simply to produce attractive or interesting colors or patterns.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 303
  );

  val circadianRegulation = Augmentation(
    name = "Circadian Regulation",
    category = c,
    appliesTo = List(Biomorph, Pod),
    descr =
      "The morph only requires 2 hours of sleep to maintain health and function at peak mental capacity. The character dreams constantly while asleep and can both fall asleep and wake up almost instantly. In addition, the character can easily and with no ill-effects shift to a 2-day cycle, where they are awake for 44 hours and sleep for 4.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 304
  );

  val claws = Augmentation(
    name = "Claws",
    category = c,
    appliesTo = List(Biomorph, Pod),
    related = List(MorphAttacks.bioClaw),
    price = Cost.Low,
    descr =
      "The morph has retractable claws like those of a cat. These claws do not interfere with the character’s manual dexterity and are razor sharp. However, they are relatively small and only do 1d10 + 1 + (SOM ÷ 10) damage, with an AP of –1. As a result, they are legal in almost all habitats and are considered tools as much as weapons.",
    source = Sources.ep,
    sourcePage = 304
  );

  val cleanMetabolism = Augmentation(
    name = "Clean Metabolism",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Moderate,
    descr =
      "The morph’s symbiotic bacteria, gut flora, and glands have been genetically engineered to keep the morph “clean.” The morph also produces smart antibiotics that prevent the growth of any bacteria or yeasts in it or on its skin. As a result, the morph is completely immune to infections, dental cavities, and bad breath, its sweat has no scent, and the morph’s efficient digestion produces somewhat less solid waste and less odorous chemicals.",
    source = Sources.ep,
    sourcePage = 304
  );

  val drugGlands = Augmentation(
    name = "Drug Glands",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.None,
    descr =
      "The morph has specially tailored glands designed to produce specific hormones or chemicals and release them in the body. The character has control over these glands and can release the chemicals at will. Each type of drug gland is considered a separate enhancement. For potential drugs and chemicals, see p. 317. [Cost: One Cost Category Higher Than Drug Cost]",
    source = Sources.ep,
    sourcePage = 304
  );

  val eelware = Augmentation(
    name = "Eeelware",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Low,
    descr =
      "Derived from electric eel genetics, a character can have eelware implanted so that it connects to a network of bioconductors in the hands and feet (or other limbs), allowing the character to generate stunning shocks with a touch. Eelware inflicts shock damage (p. 204) exactly like a pair of shock gloves. Eelware can also be used to power implants and specially designed handheld devices by touch.",
    source = Sources.ep,
    sourcePage = 304
  );

  val emotionalDampers = Augmentation(
    name = "Emotional Dampers",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Low,
    descr =
      "This low-cost alternative to endocrine control (p. 304) allows the user to voluntarily damp their morph’s emotional responses and various non-verbal cues like pupil dilation, eye movement, or vocal tone. Using this augmentation allows the user to lie and conceal their emotions in such as way as to fool the keenest observer; apply a +30 modifier to Deception and Impersonation Tests. This modification does not affect methods of detecting lies and emotions that involve reading the character’s neural state, including psi-gamma sleights. However, this augmentation damps out all emotional responses and so causes the character to be less persuasive in real-time personal interactions, imposing a –10 modifier to other Social skill tests like Persuasion. Characters can turn this augmentation on or off at will.",
    source = Sources.ep,
    sourcePage = 304
  );

  val endocrineControl = Augmentation(
    name = "Endocrine Control",
    category = c,
    appliesTo = List(Biomorph, Pod, Infomorph),
    price = Cost.High,
    descr =
      "This augmentation modifies the morph’s endocrine system, giving the character fine control over their hormone output. This allows the character to completely control their appetite and emotions and to regulate pain. They receive a +30 modifier against the effects of hunger, fear, and any forms of emotional manipulation, such as the Drive Emotion sleight. This augmentation also allows character to lie with perfect conviction and to completely fool all methods of lie detection that do not rely on the target’s neural output; apply a +20 modifier to Deception Tests. It also allows the character to remain awake for 48 hours without penalty, but after this time the character begins experiencing normal fatigue. Finally, the ability to regulate pain reception allows the character to ignore the –10 modifier from 1 wound.",
    source = Sources.ep,
    sourcePage = 304
  );

  val enhancedPheromones = Augmentation(
    name = "Enhanced Pheromones",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "The morph’s biochemistry has been altered so that it produces enhanced pheromonal signals that subconsciously affect the behavior of other humans in the vicinity. These pheromones make the character more attractive and trustworthy to the target; apply a +10 modifier to appropriate Social skill tests, such as Persuasion. This augmentation only affects characters who can smell the pheromones, and it does not affect uplifts or xenomorphs.",
    source = Sources.ep,
    sourcePage = 305
  );

  val enhancedRespiration = Augmentation(
    name = "Enhanced Respiration",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "By boosting both lung efficiency and the blood’s oxygen-carrying capacity, the character can live comfortably in both high and low pressure environments, from 0.2 atmospheres to 5 atmospheres, with no dizziness or need for gradual decompression. In addition, the character can hold their breath for up to 30 minutes when performing minimal activity or for up to 10 minutes while performing highly strenuous activity.",
    source = Sources.ep,
    sourcePage = 305
  );

  val gills = Augmentation(
    name = "Gills",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "The morph’s lung tissue has been adapted to function as gills, allowing the morph to breathe both air and water, as long as the water is not toxic or too stagnant. Characters with this augmentation breathe in water and then expel the water through slits just underneath their lowest pair of ribs that seal when the character is not underwater.",
    source = Sources.ep,
    sourcePage = 305
  );

  val gripPads = Augmentation(
    name = "Grip Pads",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Low,
    descr =
      "The morph possesses specialized pads on its palms, lower arms, shins, and the bottoms of its feet. Designed to emulate the pads on gecko feet, characters can support themselves on a wall or ceiling by placing any two of these pads against any surface not made from a material specially designed to resist this augmentation. Characters can climb any surface and move easily across ceilings that can support their weight. Apply a +30 modifier to Climbing Tests. The pads must be free to touch the surface the character is climbing (no gloves). The nature of these pads is obvious to anyone looking at them, but they do not impair the character’s sense of touch or manual dexterity. If combined with the vacuum sealing augmentation, the character can even stick to surfaces in the vacuum of space.",
    source = Sources.ep,
    sourcePage = 305
  );

  val hibernation = Augmentation(
    name = "Hibernation",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "The character can voluntarily reduce the morph’s metabolism to the point that the morph requires only 5% of the normal amount of food, water, and air. The character appears to sink into a deep sleep, but can maintain a dim awareness of both touch and sound and so can be easily awakened. Entering or leaving this state requires 3 minutes where the character is relatively helpless. With sufficient air, characters can safely hibernate for up to 40 days without food or water.",
    source = Sources.ep,
    sourcePage = 305
  );

  val muscleAugmentation = Augmentation(
    name = "Muscle Augmentation",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.High,
    descr =
      "The morph’s muscle mass has been enhanced and toned and myofibers strengthened. Apply a +5 modifier to SOM.",
    source = Sources.ep,
    sourcePage = 305
  );

  val neurachem = Augmentation(
    name = "Neurachem",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    related = List(SpecialSubstances.neurachem1, SpecialSubstances.neurachem2),
    price = Cost.High,
    descr =
      "This bioware modification enhances the character’s chemical synapses and juices their neurotransmitters, drastically speeding up neural connections. Neurachem can be mentally activated or triggered by charged emotions. Level 1 neurachem increases the Speed stat by +1, with no side effect. Level 2 raises the Speed stat by +2, but the character suffers a nervous system fatigue hangover for 1 hour after the boost wears off (–20 modifier to all actions). The speed boost lasts for 30 minutes, though it may be triggered again. Level 2 may be used as Level 1 if desired. [Cost Level 2: Expensive]",
    source = Sources.ep,
    sourcePage = 305
  );

  val poisonGland = Augmentation(
    name = "Poison Gland",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.None,
    descr =
      "Similar to the drug gland, this morph has special glands that produce poisons, like the venom glands of a snake. The morph has poison glands in its fingers and mouth, so that it can deliver either poison by scratching someone with a fingernail, biting them hard enough to draw blood, or even by sharing a beverage with someone or spitting into their drink. The morph is immune to the poisons it produces. These glands may not produce nanotoxins. [One Cost Category Higher Than Toxin Cost]",
    source = Sources.ep,
    sourcePage = 305
  );

  val prehensileFeet = Augmentation(
    name = "Prehensile Feet",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Low,
    descr =
      "The morph’s feet and leg joints are altered so that its toes are longer and more dexterous and the big toe is transformed into an opposable thumb. Physically, the morph’s feet resemble a longer narrower hand or a human foot with finger (and thumb)-like toes. The character can walk normally but must wear specially designed shoes. However, this morph runs somewhat slower than a morph with unmodified feet (–1 meter per Action Turn). In addition, the morph’s hips are slightly modified to allow greater mobility. In a properly constructed chair, or when floating in zero-G, the character can use both their hands and their feet to manipulate the same object. Most morphs used by characters who live in zero-G possess this augmentation.",
    source = Sources.ep,
    sourcePage = 305
  );

  val prehensileTail = Augmentation(
    name = "Prehensile Tail",
    category = cCyber,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Low,
    descr =
      "A long (1.5 meters) prehensile tail is added to the morph’s backside, extending out from the tailbone. This tail is prehensile and may be used to grab, hold, and even manipulate objects. The character can control the tail’s movements with concentration, but it otherwise tends to move on its own. The tail also improves the character’s balance; apply a +10 to any Physical skill tests where balance is a factor.",
    source = Sources.ep,
    sourcePage = 305
  );

  val sexSwitch = Augmentation(
    name = "Sex Switch",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Moderate,
    descr =
      "A complex suite of alterations allows the character to switch their physical sex to male, female, hermaphrodite, or neuter. This change is mentally triggered but takes approximately 1 week to complete.",
    source = Sources.ep,
    sourcePage = 305
  );

  val skinPocket = Augmentation(
    name = "Skin Pocket",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Trivial,
    descr =
      "The morph has a pocket within its skin layer, capable of holding and providing concealment (+30) for small items.",
    source = Sources.ep,
    sourcePage = 305
  );

  val temperatureTolerance = Augmentation(
    name = "Temperature Tolerance",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "The morph’s temperature regulation and circulation are both substantially enhanced allowing the character to survive in temperatures as low as –30 degrees Celsius and as high as 60 degrees Celsius without discomfort or ill effects.",
    source = Sources.ep,
    sourcePage = 305
  );

  val toxinFilters = Augmentation(
    name = "Toxin Filters",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Moderate,
    descr =
      "The morph gains an improved liver and kidneys and biological filters in its lungs. Characters with this augmentation are immune to all chemical and biological toxins, including everything from recreational chemicals to nerve agents to spoiled food. In addition, the character can safely and comfortably breathe smoke and drink salt water. Unlike medichines, toxin immunity prevents the character from experiencing even brief harm or discomfort from a toxin (medichines merely rapidly repair damage caused by the toxin and then remove it from the morph). This augmentation provides no resistance to concentrated acid, nanotechnological attacks, or similar destructive agents. Some characters with this augmentation learn to enjoy the taste of various chemical toxins like cyanide or arsenic.",
    source = Sources.ep,
    sourcePage = 305
  );

  val vacuumSealing = Augmentation(
    name = "Vacuum Sealing",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.High,
    descr =
      "To possess this augmentation, the character must also possess some form of bioware armor or carapace armor. The morph has been specially designed to survive the effects of vacuum. The character’s skin resists vacuum as well as protecting the wearer from temperatures from –75 to 100 C. In addition, the character’s mouth, nose, and other orifices can seal sufficiently well to resist vacuum, and the morph possesses a special membrane that extends over their eyes, allowing the character to see in vacuum without risking any eye damage. This augmentation is usually combined with either the enhanced respiration or oxygen storage augmentation, or both together.",
    source = Sources.ep,
    sourcePage = 306
  );

  // Gatecrashing
  val diggingClaws = Augmentation(
    name = "Digging Claws",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "Adapted from the genetics of hole-digging creatures like moles and aardvarks, digging claws are lengthier, sturdier hands with hardy claws for loosening ground, cutting through hard surfaces, and shoveling dirt aside. Despite these changes, digging claws are still capable of grasping and fine manipulation like regular human hands. They can also be wielded offensively with Unarmed Combat skill, inflicting 1d10 + 2 + (SOM ÷ 10) DV with an AP of –1.",
    related = List(MorphAttacks.diggingClaw),
    source = Sources.gatecrashing,
    sourcePage = 152
  );

  val enhancedRespirationExo = Augmentation(
    name = "Enhanced Respiration (Specific)",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "The Enhanced Respiration bioware on p. 305 of the Eclipse Phase core rulebook is partly what allows rusters to breathe the atmosphere of Mars. There are many exoplanets with atmospheres that are not breathable by normal transhumans, but that are close enough that they would be with a bit of modification (see What Worlds Are Breathable?, p. 170). On some of these planets, rusters with standard enhanced respiration could breathe the air, but on others a different version of this biomod, specific to the atmosphere in question, may be called for. ",
    source = Sources.gatecrashing,
    sourcePage = 152
  );

  val highGAdaptation = Augmentation(
    name = "High-g Adaptation",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Moderate,
    descr =
      "This augmentation is specifically designed to allow a morph to operate in environments where gravity is significantly greater than Earth’s. The morph’s heart and circulatory system are strengthened and its skeleton altered in composition and proportion to be harder, slightly thicker, and considerably more durable. The morph’s muscle density is also increased and tendons and ligaments bolstered for improved efficiency in higher gravity. Apply a +5 Durability and +5 SOM bonus. In addition, the character suffers no negative modifiers from gravities up to 2g, and reduces all penalties for higher gravities by 1g.",
    source = Sources.gatecrashing,
    sourcePage = 152
  );

  val swimBladder = Augmentation(
    name = "Swim Bladder",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "This transgenic organ is a series of gas-filled sacs that allow the character to control their buoyancy underwater. This bladder is also linked to the inner ear, enabling the character to accurately gauge water pressure/depth and also improving their hearing underwater (+10 to hearing based Perception underwater).",
    source = Sources.gatecrashing,
    sourcePage = 152
  );

  // Panopticon
  val polarizationVision = Augmentation(
    name = "Polarization Vision",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      """Characters capable of seeing polarized light can view an aspect of light most humans only see weakly. Polarization reveals visual characteristics much in the way that color does for normal vision: it enhances contrast, foils camouflage, and helps to detect patterns and objects, particularly in light that is reflected off a shiny surface or scattered through the atmosphere or water. One major use of polarization is easier orien- tation in relation to polarized light sources (such as navigating underwater by the direction of sunlight). It also allows better detection of water surfaces, reflec- tive surfaces, and certain patterns made in the water or on skin (which can be created by chameleon skin). Polarization vision can discriminate watery surfaces from mirages and better detect transparent objects. In game terms, polarization vision allows the character to ignore negative visual Perception modifiers for camou- flage, transparency, or viewing underwater. At the game- master’s discretion, it may provide a bonus modifier for Perception Tests to detect patterns and Navigation Tests where orientation to light sources is beneficial.
Octomorphs have natural polarization vision by default.""",
    source = Sources.panopticon,
    sourcePage = 148
  );

  val scentAffinity = Augmentation(
    name = "Scent Affinity",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Trivial,
    descr =
      "This modification may only be applied to smart animals. This particular animal has been modified to identify and trust a particular scent or pheromonal signature. Anyone giving off this particular olfactory signature receives a +30 modifier to Animal Handling Tests against this creature, assuming the critter can smell them. Trainers, smart animal handlers, and wealthy owners use this bioware to maintain better control over their pets/investments.",
    source = Sources.panopticon,
    sourcePage = 148
  );

  val ultravioletVision = Augmentation(
    name = "Ultraviolet Vision",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Trivial,
    descr =
      "This is a minor enhancement, simply adding perception of ultraviolet frequencies (p. 303, EP) to the character’s visual capabilities. Neo-avians have natural ultraviolet vision by default.",
    source = Sources.panopticon,
    sourcePage = 148
  );

  // Rimward
  val hydrostaticPressureAdaptation = Augmentation(
    name = "Hydrostatic Pressure Adaptation",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Expensive,
    descr =
      "The morph is capable of operating under extreme pressure conditions. Biomorphs (including pods) with this mod can withstand up to 500 atmospheres; the synthmorph equivalent can handle up to 2,500 atmospheres. The morph can also acclimate to changing pressures more quickly and is immune to oxygen toxicity, nitrogen narcosis, and the bends.",
    source = Sources.rimward,
    sourcePage = 188
  );

  val radiationTolerance = Augmentation(
    name = "Radiation Tolerance",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Expensive,
    descr =
      "This mod may only be installed in morphs with medichines. The biomorph’s DNA is redundantly encoded and vital tissues are actively replaced. Additionally, vital systems are protected with special shielding sleeves and blood filters, and many chemical processes are reinforced against disruption. The morph can survive radiation exposure thirty times as effectively as if unaugmented.",
    source = Sources.rimward,
    sourcePage = 189
  );

  val temperatureToleranceCryonic = Augmentation(
    name = "Temperature Tolerance (Cryonic)",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.High,
    descr =
      "The morph is treated as having the Temperature Tolerance bioware (p. 305, EP), but the addition of both an integral nuclear battery and specially bioformed insulation allows this morph to indefinitely tolerate temperatures as low as –200ºC without harm as long as the morph is in an atmosphere with a pressure of less than 0.1 atmosphere. In a dense atmosphere, like that of Titan, the morph can endure temperatures as low as –120ºC.",
    source = Sources.rimward,
    sourcePage = 189
  );

  val winterist = Augmentation(
    name = "Winterist",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "The character has the androgynous appearance and non-sexual erogenous zones common to inhabitants of Winter hab (p. 64). The character has a monthly hormonal cycle driving their desire for erogenous contact. The character also produces fertile gametes once a month in accordance with this cycle, but these must be harvested through a medical procedure and placed in a Winterist exowomb in order to be fertilized. This augmentation can be added to any biomorph but may not be taken in combination with the sex switch augmentation or any other augmentation directly linked to the character’s sex. Characters with this augmentation are immune to the effects of tailored pheromones.",
    source = Sources.rimward,
    sourcePage = 189
  );

  // Sunward
  val glidingMembrane = Augmentation(
    name = "Gliding Membrane",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Low,
    descr =
      """Gliding membranes are thin, muscular sheets that stretch from wrist to ankle, that allow the character to glide through the air. For human-sized morphs in standard Earth or Venusian gravity (1 g), these gliding membranes allow the glider to maintain a glide ratio of 10:1, so it can glide 10 meters for every meter of altitude it loses. In low-gravity environments, this ratio doubles to 20:1 or more. Gliding membranes provide a +10 modifier to Free Fall Tests made to cross long distances. Gliding membranes can also be used to ride thermal updrafts, allowing the morph to ascend to higher altitudes. Use the Flight skill to make tests when using gliding membranes.
Gliding membranes can be wrapped around the morph’s arms, legs, and torso when not being used, allowing the morph to move and wear clothes normally when not gliding.""",
    source = Sources.sunward,
    sourcePage = 166
  );

  val lateralLine = Augmentation(
    name = "Lateral Line",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Low,
    descr =
      "A transgenic organ developed from aquatic creatures, a lateral line hears low-frequency sounds and can detect movement and vibrations through nearby liquids. Suryas use lateral lines to “hear” in the corona’s plasma atmosphere.",
    source = Sources.sunward,
    sourcePage = 166
  );

  val lowPressureTolerance = Augmentation(
    name = "Low Pressure Tolerance",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "The morph can tolerate extremely low atmospheric pressures, such as those found at high altitudes on Mars, with no ill effects. Morphs with this mod are also somewhat more resistant to vacuum exposure and are able to spend up to five minutes in hard vacuum without incurring damage. However, morphs without respirocytes or an oxygen reserve still suffer asphyxiation.",
    source = Sources.sunward,
    sourcePage = 166
  );

  val temperatureToleranceImpCold = Augmentation(
    name = "Temperature Tolerance (Improved Cold)",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Moderate,
    descr =
      "The morph is treated as having the Temperature Tolerance biomod (p. 305, EP), but with an even greater resistance to low temperatures. The morph can tolerate temperatures as low as –80ºC without ill effects.",
    source = Sources.sunward,
    sourcePage = 166
  );

  val wings = Augmentation(
    name = "Wings",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    price = Cost.Moderate,
    descr =
      """Wings enable the morph to fly at Earth/Venusian gravities if small (child-sized) and light, or at low gravities if human-sized or larger. Tests made while flying use the Flight skill. Most wing designs are transgenic and based on bat-wing physiology, so they may be easily folded when not in use. Though the Movement Rate depends on the morph in question and the particular design, a standard Movement Rate is 8/40.
Neo-avians have wings by default, as part of their physiology.""",
    source = Sources.sunward,
    sourcePage = 166
  );

  val list: List[Augmentation] = Macros.memberList[Augmentation]
}
