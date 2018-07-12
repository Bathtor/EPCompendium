package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsNeutralTranshuman {
  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  val emotive = EPTrait(
    name = "Emotive (Synth Only)",
    traitType = Neutral,
    applicability = Morph,
    descr = "The emotive circuits for this morph are exceptional. Kinesics Tests made against the morph suffer only a −10 modifier, rather than the usual −30 for synthmorphs. This is useful when non-vocally emoting to friends, and not so great when trying to hide your intentions from others.",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 94);

  val largeSize = EPTrait(
    name = "Large Size",
    traitType = Neutral,
    applicability = Morph,
    descr = "The morph is significantly larger than a normal transhuman, which has its advantages and disadvantages. The character counts as a large target in combat, granting all enemies a +10 bonus on attack rolls against the character. Their mass works against them; double the damage from falling or collisions after armor is applied. The character gains the reach advantage (p. 204, EP) against standard-size targets (double this against small targets) and can also wield two-handed weapons in one hand without penalty. At the gamemaster’s discretion, the character may suffer a −20 modifier when handling small items, assuming they come equipped with no fine manipulators. Naturally, they may also have difficulty with armor, clothing, and other gear manufactured for smaller morphs, as well as the cramped confines of many habitats. This trait applies to morphs that are inherently large. To apply it to existing morphs with a smaller baseline, use the Enlarged Size trait (p. 83). The following existing morphs are considered to have the Large Size trait: fenrir, neo-beluga, neo-orca, q-morph, sundiver. The following existing bots and vehicles are also considered large: dwarf, flux car, flying car, ground car, hyperdense exoskeleton, Mars buggy, portable plane, rocket buggy, skimmer.",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 94);

  val nonHumanBiochemistry = EPTrait(
    name = "Non Human Biochemistry",
    traitType = Neutral,
    applicability = Morph,
    descr = "Biomorphs (including pods) with this trait are developed from non-human (but still mammalian) species or have been genetically modified enough that they are substantially different from humans. Though they are often medically similar to humans, there may be notable differences, and certain common drugs and medical treatments may not work on the morph or may have drastically different results. Though most non-human morphs are developed without allergies, some are occasionally overlooked. Common augmentations may not be available for this morph or may need extra time to prepare. Medicine: Uplift or Medicine: Exotic Biomorph is used to medically treat these morphs. Apply a −10 modifier to any other Medicine skills used to heal or augment the morph; gamemasters should also feel free to increase this modifier to −20 or −30 and/or adjust the timeframe based on the character’s condition and resources available to the medical staff. Non-anthropomorphic morphs with this trait count as exotic and inflict −30 modifiers to Alienation and Integration Tests (p. 272, EP). This trait is only available to morphs created from non-human biochemistries. The following existing morphs are considered to have the Non-Human Biochemistry trait: aquanaut, hypergibbon, neanderthal, neo-beluga, neo-dolphin, neo-hominid (bonobo, chimp, orangutan, and gorilla), neo-orca, neo-pig, neo-porpoise, neo-whale, selkie, surya",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 94);

  val nonMammalianBiochemistry = EPTrait(
    name = "Non Mammalian Biochemistry",
    traitType = Neutral,
    applicability = Morph,
    descr = "Biomorphs (including pods) with this trait are developed from non-mammalian biologies. The state of medicine for these morphs is often not quite as advanced as it is for humans, and certain common drugs and medical treatments may not work on the morph or may have drastically different results. Though most non-mammalian morphs are developed without allergies, some are occasionally overlooked. Common augmentations may not be available for this morph or may need extra time to prepare. Medicine: Uplift or Medicine: Exotic Biomorph is used to medically treat these morphs. Apply a −20 modifier to any other Medicine skills used to heal or augment the morph; gamemasters should also feel free to increase this modifier to −30 and/or adjust the timeframe based on the resources available to the medical staff. Morphs with this trait count as exotic and inflict −30 modifiers to Alienation and Integration Tests (p. 272, EP). This trait is only available to morphs created from non-mammalian biochemistries. The following existing morphs are considered to have the Non-Mammalian Biochemistry trait: chickcharnie, hulder, neo-avian, novacrab, octomorph, ripwing, salamander.",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 94);

  val smallSize = EPTrait(
    name = "Small Size",
    traitType = Neutral,
    applicability = Morph,
    descr = "The morph is significantly smaller than a normal transhuman, roughly child-sized. The character counts as a small target in combat; apply a −10 modifier to attacks against the character. Standard-size opponents have a reach advantage against the character and large and very large opponents will have double this advantage. The character may also, at the gamemaster’s discretion, suffer a −20 modifier when handling medium-sized gear or two-handed weapons that have not been modified for their size. They may also have difficulty with armor, gear, and so on manufactured for larger morphs. Small morphs have an aptitude maximum for SOM of 25. This trait applies to morphs that are inherently small. To apply it to existing morphs with a larger baseline, use the Reduced Size trait (p. 93). The following existing morphs are considered to have the Small Size trait: dragonfly, flexbot modules, hypergibbon, kite, neo-avian, neotenic, scurrier, spare. The following existing bots/vehicles are considered to have the Small Size trait: bughunter, caretaker, creepy, explorenaut, gnat, manipulator cuff, saucer, spider hand, thumper. The following existing smart animals are considered to have the Small Size trait: aquarium pet, guard dog, police baboon, rust hound, smart cat/dog/hawk/monkey/racoon/rat/wolf, space roach, squidling, swarm cat.",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 95);

  val uniqueLook = EPTrait(
    name = "Unique Look",
    traitType = Neutral,
    applicability = Morph,
    descr = "The morph is engineered to stand out in a society with sophisticated cloning and fabrication technology. The exact nature of the unique look varies based on the morph. Some employ proprietary technology secured by DRM in order to prevent others from copying the exact look of the morph. Others are secured by reputation alone—the look of an infamous triad crime boss would never be copied for fear of retribution. Whatever the reason, no one will mistake this morph for someone else. Any attempt to impersonate a morph with this trait suffers a −30 penalty. Characters with this trait tend to cause extremely positive or negative reactions in social situations. Characters with this trait may gain a positive modifier of up to +30 in certain Social Skill Tests or suffer up to a −30 penalty on Social Skill Tests, depending on the circumstance. In general, morphs with the Unique Look trait are strongly associated with a particular element of transhuman society, so characters with this trait will become de facto representatives of that element of society and others will treat them accordingly.",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 95);

  val veryLargeSize = EPTrait(
    name = "Very Large Size",
    traitType = Neutral,
    applicability = Morph,
    descr = "The morph is huge in size, bigger than many vehicles. It counts as a very large target in combat, providing opponents with a +20 modifier to hit. Their mass works against them; triple the damage from falling or collisions after armor is applied. The morph gains the reach advantage (p. 204, EP) against large-sized targets; double this bonus against medium and small targets. It can wield two-handed weapons in one hand, but suffers a –20 modifier with medium-sized objects and cannot use small items or smaller, unless they come equipped with fine manipulators. Very large morphs are too big to wear standard clothing and armor and do not fit within the confines of cramped habitats. This trait only applies to morphs that are inherently very large. The following existing morphs are considered to have the Very Large Size trait: neo-whales and surya. The following existing bots and vehicles are considered to have the Very Large Size trait: cargo hauler, crasher truck, deep sea submarine, defense platform, fighter, GEV, interceptor, large jet, lifeboat, maglev train, Martian rover, methane skiff, mobile base, outsystem hover/skimmer, scorcher, siftrunner, small jet, SLOTV, Titanian cargo copter, utility helicopter, Venusian hauler.",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 95);

  val verySmallSize = EPTrait(
    name = "Very Small Size (Bots/Creatures Only)",
    traitType = Neutral,
    applicability = Morph,
    descr = "The bot or creature is roughly mouse- or insect-sized. It counts as a very small target in combat; apply a −30 modifier to attacks against it. Halve the damage from falling or collisions after armor is applied. Small-size opponents have a reach advantage against it and larger opponents will have double this advantage. The bot/critter suffers a −20 modifier when handling small-sized gear and cannot use any gear that is larger. It cannolt use standard clothing or armor and is too small to fit a cyberbrain. Very small bots and animals have an aptitude maximum for SOM of 5. This trait only applies to bots and creatures that are inherently very small. The following existing bots and creatures are considered to have the Very Small Size trait: bees/ wasps, recon flyer/hopper/snake, sky mote, speck.",
    cp = 0,
    source = Sources.transhuman,
    sourcePage = 96);

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
