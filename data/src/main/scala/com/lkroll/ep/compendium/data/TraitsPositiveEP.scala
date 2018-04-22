package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsPositiveEP {
  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  val adaptabilityLevel1 = EPTrait(
    name = "Adaptability Level 1",
    traitType = Positive,
    applicability = Ego,
    descr = "Resleeving is a breeze for this character. They adjust to new morphs much more quickly than most other people. Apply a +10 modifier for Integration Tests (p. 271) and Alienation Tests (p. 272).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 145);

  val adaptabilityLevel2 = EPTrait(
    name = "Adaptability Level 2",
    traitType = Positive,
    applicability = Ego,
    descr = "Resleeving is a breeze for this character. They adjust to new morphs much more quickly than most other people. Apply a +20 modifier for Integration Tests (p. 271) and Alienation Tests (p. 272).",
    cp = 20,
    source = Sources.ep,
    sourcePage = 145);

  val allies = EPTrait(
    name = "Allies",
    traitType = Positive,
    applicability = Ego,
    descr = "The character is part of or has a relationship with some influential group that they can occasionally call on for support. For example, this could be their old gatecrashing crew, former research lab co-workers, a criminal cartel they are part of, or an elite social clique. The gamemaster and player should work out what the character’s relationship is with this group, and why the character can call on them for aid. Gamemaster’s should take care that these allies are not abused, such as calling on them more than once per game session. The character’s ties to this group are also a two-way street—they will be expected to perform duties for the group on occasion as well (a potential plot seed for scenarios).",
    cp = 30,
    source = Sources.ep,
    sourcePage = 145);

  val ambidextrous = EPTrait(
    name = "Ambidextrous",
    traitType = Positive,
    applicability = Ego,
    descr = "The character can use and manipulate objects equally well with both hands (they do not suffer the off-hand modifier, as noted under Wielding Two or More Weapons, p. 206). If the character has other prehensile limbs (feet, tail, tentacles, etc.), this trait may be applied to a limb other than the hand. This trait may be taken multiple times for multiple limbs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 145);

  val animalEmpathy = EPTrait(
    name = "Animal Empathy",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has an instinctive feel for handling and working with non-sapient animals of all kinds. Apply a +10 modifier to Animal Handling skill tests or whenever the character makes a test to influence or interact with an animal.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 145);

  val brave = EPTrait(
    name = "Brave",
    traitType = Positive,
    applicability = Ego,
    descr = "This character does not scare easily and will face threats, intimidation, and certain bodily harm without flinching. As a side effect, the character is not always the best at gauging risks, especially when it comes to factoring in danger to others. The character receives a +10 modifier on all tests to resist fear or intimidation.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 145);

  val commonSense = EPTrait(
    name = "Common Sense",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has an innate sense of judgment that cuts through other distractions and factors that might cloud a decision. Once per game session, the player may ask the gamemaster what choice they should make or what course of action they should take, and the gamemaster should give them solid advice based on what the character knows. Alternatively, if the character is about to make a disastrous decision, the gamemaster can use the character’s free hint and warn the player they are making a mistake.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 145);

  val dangerSense = EPTrait(
    name = "Danger Sense",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has an intuitive sixth sense that warns them of imminent threats. They receive a +10 modifier on Surprise Tests (p. 204).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 145);

  val directionSense = EPTrait(
    name = "Direction Sense",
    traitType = Positive,
    applicability = Ego,
    descr = "Somehow the character always knows which way is up, north, etc., even when blinded. The character receives a +10 modifier for figuring out complex directions, reading maps, and remembering or retracing a path they have taken.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 145);

  val eideticMemory = EPTrait(
    name = "Eidetic Memory",
    traitType = Positive,
    applicability = Both,
    descr = "Much like a computer, the character has perfect memory recall. They can remember anything they have sensed, often even from a single glance. This works the same as the eidetic memory implant (p. 301).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val exceptionalAptEgo = EPTrait(
    name = "Exceptional Aptitude (Ego)",
    traitType = Positive,
    applicability = Ego,
    descr = "The character may raise the maximum for a particular chosen aptitude to 40 rather than 30 (p. 122). Note that this trait just raises the maximum, it does not give the character 10 more aptitude points. This trait may only be taken once.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 146);

  val exceptionalAptMorph = EPTrait(
    name = "Exceptional Aptitude (Morph)",
    traitType = Positive,
    applicability = Morph,
    descr = "As a morph trait, it raises the morph aptitude maximum (p. 124) for a particular chosen aptitude by 10 (30 for flats, 35 for splicers, 40 for all others). Note that this trait just raises the maximum, it does not give the character 10 more aptitude points. This trait may only be taken once.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 146);

  val expert = EPTrait(
    name = "Expert",
    traitType = Positive,
    applicability = Ego,
    descr = "The character is a legend in the use of one particular skill. The character may raise one learned skill over 80, to a maximum of 90, during character creation. This trait does not actually increase the skill, it just raises the maximum. This trait may only be taken once.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val fastLearner = EPTrait(
    name = "Fast Learner",
    traitType = Positive,
    applicability = Ego,
    descr = "The character improves skills and learns new ones in half the time it normally takes (see Improving Skills, p. 152).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val firstImpression = EPTrait(
    name = "First Impression",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has a way of charming or otherwise making a good impression the first time they interact with someone. This innate social lubricant allows them to more readily deal with new contacts and slip right into new social environments. Apply a +10 modifier on social skill tests when the character is interacting with another character for the first time only.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val hyperLinguist = EPTrait(
    name = "Hyper Linguist",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has an intuitive understanding of linguistic structures that facilitates learning new languages easily. The character requires one-third the normal amount of time to learn any language (see Improving Skills, p. 152). The character can also learn any human language in one day simply by constant immersive exposure to it. Additionally, the character receives a +10 modifier when attempting to interpret languages they don’t know.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val improvedImmune1 = EPTrait(
    name = "Improved Immune System (Level 1)",
    traitType = Positive,
    applicability = Morph,
    descr = "The morph’s immune system is robust and more resistant to diseases, drugs, and toxins—even more than basic biomods. Apply a +10 modifier whenever making a test to resist infection or the effects of a toxin or drug. This trait is only available to biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val improvedImmune2 = EPTrait(
    name = "Improved Immune System (Level 2)",
    traitType = Positive,
    applicability = Morph,
    descr = "The morph’s immune system is robust and more resistant to diseases, drugs, and toxins—even more than basic biomods. Apply a +20 modifier whenever making a test to resist infection or the effects of a toxin or drug. This trait is only available to biomorphs.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 146);

  val innocuous = EPTrait(
    name = "Innocuous",
    traitType = Positive,
    applicability = Morph,
    descr = "In an age when exotic appearances and good looks are commonplace, the morph’s look is surprisingly bland and undistinguished, in that cookie cutter sort of way. The character’s physical looks are so mundane that others have a hard time picking them out of a crowd, describing their appearance, or otherwise remembering physical details. Apply a –10 modifier to all tests made to spot, describe, or remember the character. This modifier does not apply to psi or mesh searches.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val limber1 = EPTrait(
    name = "Limber (Level 1)",
    traitType = Positive,
    applicability = Morph,
    descr = "The morph is especially flexible and supple, capable of graceful contortions and interesting positions. Character can smoke with their toes, do the splits, and squeeze into small, cramped spaces. This provides a +10 modifier to escaping from bonds, fitting into narrow confines, and other acts relying on contortion or flexibility. This trait is only available to biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val limber2 = EPTrait(
    name = "Limber (Level 2)",
    traitType = Positive,
    applicability = Morph,
    descr = "The morph is especially flexible and supple, capable of graceful contortions and interesting positions. The character can smoke with their toes, do the splits, and squeeze into small, cramped spaces. They are also double-jointed escape artists. This provides a +20 modifier to escaping from bonds, fitting into narrow confines, and other acts relying on contortion or flexibility. This trait is only available to biomorphs.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 146);

  val mathWiz = EPTrait(
    name = "Math Wiz",
    traitType = Positive,
    applicability = Ego,
    descr = "The character can perform any feat of calculation, including the most complex and advanced mathematics, instantly and with great precision, with the same ease an unmodified human can add 2 + 3. The character can calculate odds, find correlations in numerical data, and perform similar tasks with great ease. Apply a +30 modifier on tests involving math calculations.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val naturalImmunity = EPTrait(
    name = "Natural Immunity",
    traitType = Positive,
    applicability = Morph,
    descr = "The morph has a natural immunity to a specific drug, disease, or toxin. When afflicted with that specific chemical, poison, or pathogen, the character remains unaffected. This immunity may not be applied to nanodrugs or nanotoxins and at the game-master’s discretion may not be applied to other specific agents. This trait is only available to biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val painTolerance1 = EPTrait(
    name = "Pain Tolerance (Level 1)",
    traitType = Positive,
    applicability = Both,
    descr = "The character has a high threshold for pain tolerance and is better at ignoring the effects of pain on their abilities and concentration. This allows them to ignore the –10 modifier from 1 wound. This trait is only available for biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 146);

  val painTolerance2 = EPTrait(
    name = "Pain Tolerance (Level 2)",
    traitType = Positive,
    applicability = Both,
    descr = "The character has a high threshold for pain tolerance and is better at ignoring the effects of pain on their abilities and concentration. This allows them to ignore both the –10 modifiers from 2 wounds. This trait is only available for biomorphs.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 146);

  val patron = EPTrait(
    name = "Patron",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has an influential person in their life who can be relied on for occasional support. This could be a wealthy hyperelite family member, a high-ranking triad boss, or an anarchist networker with an unbeatable reputation. When called upon, this patron can pull strings on the character’s behalf, supply resources, introduce them to people they need to know, and bail them out of trouble. The player and gamemaster should work together to define exactly who this NPC is and what their relationship with the player character is. Specifically, the question of why this patron is supporting the character should be answered (familial obligation? childhood buddies? the character saved their life once?). Gamemasters should be careful that this trait does not get abused. The patron should be an occasional help (probably no more than once per game session at most) but is not always at the character’s beck-and-call. If the character asks for too much, too often, they should find the patron’s support drying up. Additionally, the character may need to take action to maintain the relationship, such as undertaking a mission on the patron’s behalf. In fact, the character may only have their patronage because they are on-call or of use to the NPC in some way.",
    cp = 30,
    source = Sources.ep,
    sourcePage = 146);

  val psi1 = EPTrait(
    name = "Psi (Level 1)",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has been infected with the Watts-MacLeod strain of the exsurgent virus, which altered their brain structure and opened the potential for their mind to enhance their cognitive abilities and read and manipulate the biological minds of others (see Psi, p. 220). The character may purchase and learn (see Psi-Chi Sleights, p. 223). The character may only use psi-chi sleights. Though this trait is not very expensive, game-masters should not allow it to be abused. There are a number of negative side effects to Watts-MacLeod infection, noted under Psi Drawbacks, p. 220.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 147);

  val psi2 = EPTrait(
    name = "Psi (Level 2)",
    traitType = Positive,
    applicability = Ego,
    descr = "The character has been infected with the Watts-MacLeod strain of the exsurgent virus, which altered their brain structure and opened the potential for their mind to enhance their cognitive abilities and read and manipulate the biological minds of others (see Psi, p. 220). The character may purchase and learn (see Psi-Chi Sleights, p. 223). The character may use both psi-chi and psi-gamma sleights. Though this trait is not very expensive, game-masters should not allow it to be abused. There are a number of negative side effects to Watts-MacLeod infection, noted under Psi Drawbacks, p. 220.",
    cp = 25,
    source = Sources.ep,
    sourcePage = 147);

  val psiChameleon = EPTrait(
    name = "Psi Chameleon",
    traitType = Positive,
    applicability = Both,
    descr = "The character’s mental state is naturally resistant to psi sensing. Apply a –10 modifier to any attempts to locate or detect the character via psi sleights.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 147);

  val psiDefense1 = EPTrait(
    name = "Psi Defense (Level 1)",
    traitType = Positive,
    applicability = Both,
    descr = "The character’s mind is inherently resistant to mental attacks. Apply a +10 modifier to all defense tests made against psi attacks.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 147);

  val psiDefense2 = EPTrait(
    name = "Psi Defense (Level 2)",
    traitType = Positive,
    applicability = Both,
    descr = "The character’s mind is inherently resistant to mental attacks. Apply a +20 modifier to all defense tests made against psi attacks.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 147);

  val rapidHealer = EPTrait(
    name = "Rapid Healer",
    traitType = Positive,
    applicability = Morph,
    descr = "The morph recovers from damage more quickly. Reduce the timeframes for healing by half, as noted on the Healing table, p. 208. This trait is only available to biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 147);

  val rightAtHome = EPTrait(
    name = "Right at Home",
    traitType = Positive,
    applicability = Ego,
    descr = "The character chooses one type of morph (splicer, neo-hominid, case, etc.). The character always feels right at home in morphs of this type. When resleeving into this type of morph, the character automatically adjusts to the new body, no Integration or Alienation Test needed, suffering no penalties and no mental stress.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 147);

  val secondSkin = EPTrait(
    name = "Second Skin",
    traitType = Positive,
    applicability = Ego,
    descr = "If your character background or faction enforces a restriction on your starting morph (for example, uplifts must start with an uplift morph), this trait allows you to ignore that restriction and purchase a starting morph of your choice.",
    cp = 15,
    source = Sources.ep,
    sourcePage = 147);

  val situationalAwareness = EPTrait(
    name = "Situational Awareness",
    traitType = Positive,
    applicability = Ego,
    descr = "The character is very good at maintaining continuous partial awareness of the goings-on in their immediate environment. In game terms, they do not suffer the Distracted modifier on Perception Tests to notice things even when their attention is focused elsewhere or when making Quick Perception Tests during combat.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 148);

  val strikingLooks1 = EPTrait(
    name = "Striking Looks (Level 1)",
    traitType = Positive,
    applicability = Morph,
    descr = "In an age where biosculpting is easy, good looks are both cheap and commonplace. This morph, however, possesses a physical look that can only be described as striking and unusual, but also somehow alluring and fascinating—even the gorgeous and chiseled glitterati take notice. On social skill tests where the character’s beauty may affect the outcome, they receive a +10 modifier. This modifier is ineffective against xenomorphs or those with the infolife or uplift backgrounds. This trait is only available to biomorphs.\nThis modifier may be purchased for uplift morphs, but at half the cost, and it is only effective against characters with that specific uplift background (i.e., neo-avians, neo-hominids, etc.).\nThe one drawback to this trait is that the character is more easily noticed and remembered.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 148);

  val strikingLooks2 = EPTrait(
    name = "Striking Looks (Level 2)",
    traitType = Positive,
    applicability = Morph,
    descr = "In an age where biosculpting is easy, good looks are both cheap and commonplace. This morph, however, possesses a physical look that can only be described as striking and unusual, but also somehow alluring and fascinating—even the gorgeous and chiseled glitterati take notice. On social skill tests where the character’s beauty may affect the outcome, they receive a +20 modifier. This modifier is ineffective against xenomorphs or those with the infolife or uplift backgrounds. This trait is only available to biomorphs.\nThis modifier may be purchased for uplift morphs, but at half the cost, and it is only effective against characters with that specific uplift background (i.e., neo-avians, neo-hominids, etc.).\nThe one drawback to this trait is that the character is more easily noticed and remembered.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 148);

  val tough1 = EPTrait(
    name = "Tough (Level 1)",
    traitType = Positive,
    applicability = Morph,
    descr = "This morph is resilient than others of its type and can take more physical abuse. Increase their Durability by +5. This also increases Wound Threshold by +1.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 148);

  val tough2 = EPTrait(
    name = "Tough (Level 2)",
    traitType = Positive,
    applicability = Morph,
    descr = "This morph is resilient than others of its type and can take more physical abuse. Increase their Durability by +10. This also increases Wound Threshold by +2.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 148);

  val tough3 = EPTrait(
    name = "Tough (Level 3)",
    traitType = Positive,
    applicability = Morph,
    descr = "This morph is resilient than others of its type and can take more physical abuse. Increase their Durability by +15. This also increases Wound Threshold by +3.",
    cp = 30,
    source = Sources.ep,
    sourcePage = 148);

  val zoosemiotics = EPTrait(
    name = "Zoosemiotics",
    traitType = Positive,
    applicability = Ego,
    descr = "A character with this trait and the Psi trait does not suffer a modifier when using psi sleights on non-sapient or partly sapient animal species.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 148);

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
