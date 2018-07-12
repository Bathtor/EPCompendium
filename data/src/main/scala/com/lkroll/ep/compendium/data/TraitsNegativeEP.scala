package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsNegativeEP {
  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  val addictionMinor = EPTrait(
    name = "Addiction Minor",
    traitType = Negative,
    applicability = Both,
    descr = "Addiction comes in two forms: mental (affecting the ego) and physical (affecting the biomorph). The character or morph is addicted to a drug (p. 317), stimulus (XP), or activity (mesh use) to a degree that impacts the character’s physical or mental health. Players and gamemasters should work together to agree on addictions that are appropriate for their game. Addiction comes in three levels of severity: minor, moderate, or major. A minor addiction is largely kept under control—it does not ruin the character’s life, though it may create some difficulties. The character may not even recognize or admit they have a problem. The character must indulge the addiction at least once a week, though they can go for longer without too much difficulty. If they fail to get their weekly dose, they suffer a –10 modifier on all actions until they get their fix.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 148);

  val addictionModerate = EPTrait(
    name = "Addiction Moderate",
    traitType = Negative,
    applicability = Both,
    descr = "Addiction comes in two forms: mental (affecting the ego) and physical (affecting the biomorph). The character or morph is addicted to a drug (p. 317), stimulus (XP), or activity (mesh use) to a degree that impacts the character’s physical or mental health. Players and gamemasters should work together to agree on addictions that are appropriate for their game. Addiction comes in three levels of severity: minor, moderate, or major. A moderate addiction is in full swing. The character obviously has a problem, and must satisfy the addiction at least once a day. If they fail to do so, they may suffer mood swings, compulsive behavior, physical sickness, or other side effects until they indulge their craving. Apply a –20 modifier to all of the character’s actions until they get their fix. Additionally, a character with this level of addiction suffers a penalty of –5 DUR (physical addiction) or –10 to Willpower Stress Tests (mental addiction).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 148);

  val addictionMajor = EPTrait(
    name = "Addiction Major",
    traitType = Negative,
    applicability = Both,
    descr = "Addiction comes in two forms: mental (affecting the ego) and physical (affecting the biomorph). The character or morph is addicted to a drug (p. 317), stimulus (XP), or activity (mesh use) to a degree that impacts the character’s physical or mental health. Players and gamemasters should work together to agree on addictions that are appropriate for their game. Addiction comes in three levels of severity: minor, moderate, or major. A character with a major addiction is on the rapid road to ruin. They face cravings every 6 hours and suffer a penalty of –10 DUR (physical addiction) or –20 to Willpower Stress Tests (mental addiction). If they fail to get their regular dosage, they suffer a –30 modifier on all actions until they do. If their life hasn’t already been ruined by their obsession, it soon will be.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 148);

  val aged = EPTrait(
    name = "Aged",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is physically aged and has not been rejuvenated. Old morphs are increasingly uncommon, though some people adopt them hoping to gain an air of seniority and respectability. Reduce the character’s aptitude maximums by 5, and apply a –10 modifier on all physical actions. This trait may only be applied to flat and splicer morphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 148);

  val badLuck = EPTrait(
    name = "Bad Luck",
    traitType = Negative,
    applicability = Ego,
    descr = "Due to some inexplicable cosmic coincidence, things seem to go wrong around the character. The gamemaster is given a pool of Moxie points equal to the character’s Moxie stat, which also refreshes at the same rate as the character’s Moxie. Only the gamemaster may utilize this Moxie, however, and the purpose is to use it against the character. In other words, the gamemaster can use this bad Moxie to cause the character to automatically fail, flip-flop a roll, and so on. To reflect the black cloud that follows the character, the gamemaster can even use this bad Moxie against the character’s friends and allies, when they are doing something with or related to the character, though this should be used sparingly. Gamemasters who might be reluctant to sabotage the character should remember that the player asked for it by purchasing this trait.",
    cp = 30,
    source = Sources.ep,
    sourcePage = 148);

  val blacklistedOther = EPTrait(
    name = "Blacklisted Other Faction",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has managed to get themselves blacklisted in certain circles, whether they actually did something to deserve it or not. In game terms, the character is barred from having a Rep score higher than 0 in one particular reputation network. People within that network will refuse to help the character out of fear of reprisals and ruining their own reputation. The bonus for this trait is 20 CP if chosen for the rep network pertaining to the character’s own starting faction, and 5 CP if chosen for any other.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 149);

  val blacklistedOwn = EPTrait(
    name = "Blacklisted Own Faction",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has managed to get themselves blacklisted in certain circles, whether they actually did something to deserve it or not. In game terms, the character is barred from having a Rep score higher than 0 in one particular reputation network. People within that network will refuse to help the character out of fear of reprisals and ruining their own reputation. The bonus for this trait is 20 CP if chosen for the rep network pertaining to the character’s own starting faction, and 5 CP if chosen for any other.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 149);

  val blackMarkLevel1 = EPTrait(
    name = "Black Mark Level1",
    traitType = Negative,
    applicability = Ego,
    descr = "At some point in the character’s past, they managed to do something that earned a black mark on their reputation. For some reason, no matter what they do, this black mark cannot be shaken off and continues to haunt their interactions. In game terms, the character picks one faction. Every time they interact with this faction (such as a Networking Test) or with an NPC from this faction (Social Skill Tests) who knows the character, they suffer a –10 modifier per level.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val blackMarkLevel2 = EPTrait(
    name = "Black Mark Level2",
    traitType = Negative,
    applicability = Ego,
    descr = "At some point in the character’s past, they managed to do something that earned a black mark on their reputation. For some reason, no matter what they do, this black mark cannot be shaken off and continues to haunt their interactions. In game terms, the character picks one faction. Every time they interact with this faction (such as a Networking Test) or with an NPC from this faction (Social Skill Tests) who knows the character, they suffer a –10 modifier per level.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 149);

  val blackMarkLevel3 = EPTrait(
    name = "Black Mark Level3",
    traitType = Negative,
    applicability = Ego,
    descr = "At some point in the character’s past, they managed to do something that earned a black mark on their reputation. For some reason, no matter what they do, this black mark cannot be shaken off and continues to haunt their interactions. In game terms, the character picks one faction. Every time they interact with this faction (such as a Networking Test) or with an NPC from this faction (Social Skill Tests) who knows the character, they suffer a –10 modifier per level.",
    cp = 30,
    source = Sources.ep,
    sourcePage = 149);

  val combatParalysis = EPTrait(
    name = "Combat Paralysis",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has an unfortunate habit of freezing in combat or stressful situations, like a deer caught in headlights. Anytime violence breaks out around the character or they are surprised, the character must make a Willpower Test in order to act or respond in any way. If they fail the test, they lose their action and simply stand there, remaining incapable of reacting to the situation.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 149);

  val editedMemories = EPTrait(
    name = "Edited Memories",
    traitType = Negative,
    applicability = Ego,
    descr = "At some point in the character’s past, the character had certain memories strategically removed or otherwise lost to them. This may have been done to intentionally forget an unpleasant or shameful experience or to make a break with the past. The memory may also have been lost by an unexpected death (with no recent backup), or it may have been erased against the character’s will. Whatever the case, the memory should bear some importance, and there should exist either evidence of what happened or NPCs who know the full story. This is a tool the gamemaster can use to haunt the character at some future point with ghosts from their past.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val enemy = EPTrait(
    name = "Enemy",
    traitType = Negative,
    applicability = Ego,
    descr = "At some point in their past, the character made an enemy for life who continues to haunt them. The gamemaster and player should work out the details on this enmity, and the gamemaster should use the enemy as an occasional threat, surprise, and hindrance.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val feeble = EPTrait(
    name = "Feeble",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is particularly weak with one aptitude. That aptitude must be purchased at a rating lower than 5 and may never be upgraded during character advancement. The aptitude maximum is 10, no matter what morph the character is wearing.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 149);

  val frailLevel1 = EPTrait(
    name = "Frail Level1",
    traitType = Negative,
    applicability = Morph,
    descr = "This morph is not as resilient as others of its type. Its Durability is reduced by 5 per level. This also reduces Wound Threshold by 1 or 2, respectively.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val frailLevel2 = EPTrait(
    name = "Frail Level2",
    traitType = Negative,
    applicability = Morph,
    descr = "This morph is not as resilient as others of its type. Its Durability is reduced by 5 per level. This also reduces Wound Threshold by 1 or 2, respectively.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 149);

  val geneticDefectMinor = EPTrait(
    name = "Genetic Defect Minor",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is not genefixed, and in fact suffers from a genetic disorder or other impairing mutation. The player and gamemaster should agree on a defect appropriate to their game. Some possibilities include: heart disease, diabetes, cystic fibrosis, sickle-cell disease, hypertension, hemophilia, or color blindness. A genetic disorder that creates minor complications and/or occasional health problems would be worth 10 CP, a defect that significantly impairs the character’s regular functioning or that inflicts chronic health problems is worth 20 CP. The gamemaster must determine the exact effects of the disorder on gameplay, as appropriate. This trait is only available for flats.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val geneticDefectMajor = EPTrait(
    name = "Genetic Defect Major",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is not genefixed, and in fact suffers from a genetic disorder or other impairing mutation. The player and gamemaster should agree on a defect appropriate to their game. Some possibilities include: heart disease, diabetes, cystic fibrosis, sickle-cell disease, hypertension, hemophilia, or color blindness. A genetic disorder that creates minor complications and/or occasional health problems would be worth 10 CP, a defect that significantly impairs the character’s regular functioning or that inflicts chronic health problems is worth 20 CP. The gamemaster must determine the exact effects of the disorder on gameplay, as appropriate. This trait is only available for flats.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 149);

  val identityCrysis = EPTrait(
    name = "Identity Crysis",
    traitType = Negative,
    applicability = Ego,
    descr = "The character’s ego has trouble adapting itself to the changed look of a new morph—they are stuck with the mental image of their original body and simply do not grow accustomed to their new face(s). As a result, the character has difficulty identifying themselves in the mirror, photos, surveillance feeds, etc. They frequently forget the look and shape of their current morph, acting inappropriately, describing themselves by their original body, forgetting to duck when walking through doorways, etc. This is primarily a roleplaying trait, but the gamemaster may apply appropriate modifiers (usually –10) to tests affected by this inability to adapt.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val illiterate = EPTrait(
    name = "Illiterate",
    traitType = Negative,
    applicability = Ego,
    descr = "The character knows how to speak but has difficulty reading or writing. Due to the entoptic-saturated and icon-driven nature of transhuman society, they are able to get by quite comfortably with this handicap. Reduce the character’s Language skills by half (round down) whenever reading or writing.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val immortalityBlues = EPTrait(
    name = "Immortality Blues",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has lived so long—over 100 years— they’re bored with life and now have difficulty motivating themselves. They were old when longevity treatments first became available, survived the Fall, and continue to soldier onward—though they find it increasingly harder to care, take interest in things around them, or fear final death. The character only receives half the Moxie and Rez Points award for completing motivational goals. This trait may not be purchased by characters with the infolife, uplift, or lost backgrounds.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 149);

  val implantRejectionLevel1 = EPTrait(
    name = "Immortality Blues Level1",
    traitType = Negative,
    applicability = Morph,
    descr = "This morph does not accept implants well. At Level 1, any implants acquired are more expensive as they required specialized anti-rejection treatments. Increase the Cost category of the implant by one. At Level 2, the morph cannot accept implants of any kind.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 150);

  val implantRejectionLevel2 = EPTrait(
    name = "Immortality Blues Level2",
    traitType = Negative,
    applicability = Morph,
    descr = "This morph does not accept implants well. At Level 1, any implants acquired are more expensive as they required specialized anti-rejection treatments. Increase the Cost category of the implant by one. At Level 2, the morph cannot accept implants of any kind.",
    cp = 15,
    source = Sources.ep,
    sourcePage = 150);

  val incompetent = EPTrait(
    name = "Incompetent",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is completely incapable of performing a particular chosen active skill, no matter any training they may receive. They may not buy this skill during character creation or later advancement, and the modifier for defaulting to the linked aptitude of this particular skill is –10. This may not be used for exotic weapon skills, and should be used for a skill that could be of use to the character.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 150);

  val lemon = EPTrait(
    name = "Lemon",
    traitType = Negative,
    applicability = Morph,
    descr = "This trait is only available for synthetic morphs. This particular morph has some unfixable flaws. Once per game session (preferably at a time that will maximize drama or hilarity), the gamemaster can call for the character to make a MOX × 10 Test (using their current Moxie score). If the character fails, the morph immediately suffers 1 wound resulting from some mechanical failure, electrical glitch, or other breakdown. This wound may be repaired as normal.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 150);

  val lowPainTolerance = EPTrait(
    name = "Low Pain Tolerance",
    traitType = Negative,
    applicability = Both,
    descr = "Pain is the character’s enemy. The character has a very low threshold for pain tolerance and is more severely impaired when suffering. Increase the modifier for each wound take by an additional –10 (so the character suffers –20 with one wound, –40 with another, and –60 with a third). Additionally, the character suffers a –30 modifier on any test involving pain resistance. The morph version of this trait is only available for biomorphs.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 150);

  val mentalDisorder = EPTrait(
    name = "Mental Disorder",
    traitType = Negative,
    applicability = Ego,
    descr = "You have a psychological disorder from a previous traumatic experience in your life. Choose one of the disorders listed on p. 211.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 150);

  val mildAllergy = EPTrait(
    name = "Mild Allergy",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is allergic to a specific chosen allergen (dust, dander, plant pollen, certain chemicals) and suffers mild discomfort when exposed to it (eye irritation, sneezing, difficult breathing). Apply a –10 modifier to all tests while the character remains exposed. This trait is only available for biomorphs.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 150);

  val modifiedBehaviourLevel1 = EPTrait(
    name = "Modified Behaviour Level1",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has been conditioned via time-accelerated behavioral control psychosurgery. This is common among ex-felons, who have been conditioned to respond to a specific idea or activity with vehement horror and disgust, but may have occurred for some other reason or even been self-inflicted. At Level 1, the chosen behavior is either limited or boosted, at Level 2 it is either blocked or encouraged, and at Level 3 it is expunged or enforced (see p. 231 for details). This trait should only be allowed for behaviors that are either limited or, if encouraged, impact the character in a negative way.",
    cp = 5,
    source = Sources.ep,
    sourcePage = 150);

  val modifiedBehaviourLevel2 = EPTrait(
    name = "Modified Behaviour Level2",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has been conditioned via time-accelerated behavioral control psychosurgery. This is common among ex-felons, who have been conditioned to respond to a specific idea or activity with vehement horror and disgust, but may have occurred for some other reason or even been self-inflicted. At Level 1, the chosen behavior is either limited or boosted, at Level 2 it is either blocked or encouraged, and at Level 3 it is expunged or enforced (see p. 231 for details). This trait should only be allowed for behaviors that are either limited or, if encouraged, impact the character in a negative way.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 150);

  val modifiedBehaviourLevel3 = EPTrait(
    name = "Modified Behaviour Level3",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has been conditioned via time-accelerated behavioral control psychosurgery. This is common among ex-felons, who have been conditioned to respond to a specific idea or activity with vehement horror and disgust, but may have occurred for some other reason or even been self-inflicted. At Level 1, the chosen behavior is either limited or boosted, at Level 2 it is either blocked or encouraged, and at Level 3 it is expunged or enforced (see p. 231 for details). This trait should only be allowed for behaviors that are either limited or, if encouraged, impact the character in a negative way.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 150);

  val morphingDisorderLevel1 = EPTrait(
    name = "Morphing Disorder Level1",
    traitType = Negative,
    applicability = Ego,
    descr = "Adapting to new morphs is particularly challenging for this character. The character suffers a –10 modifier per level on Integration Tests (p. 271) and Alienation Tests (p. 272).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 150);

  val morphingDisorderLevel2 = EPTrait(
    name = "Morphing Disorder Level2",
    traitType = Negative,
    applicability = Ego,
    descr = "Adapting to new morphs is particularly challenging for this character. The character suffers a –10 modifier per level on Integration Tests (p. 271) and Alienation Tests (p. 272).",
    cp = 20,
    source = Sources.ep,
    sourcePage = 150);

  val morphingDisorderLevel3 = EPTrait(
    name = "Morphing Disorder Level3",
    traitType = Negative,
    applicability = Ego,
    descr = "Adapting to new morphs is particularly challenging for this character. The character suffers a –10 modifier per level on Integration Tests (p. 271) and Alienation Tests (p. 272).",
    cp = 30,
    source = Sources.ep,
    sourcePage = 150);

  val neuralDamage = EPTrait(
    name = "Neural Damage",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has suffered some type of neurological damage that simply cannot be cured. The affliction is now part of the character’s ego and remains with them even when remorphing. This damage may have been inherited, it may have resulted from a poorly designed morph or implant, or it may have been inflicted by one of the TITAN nanoviruses that targeted neural systems during the Fall (p. 384). The gamemaster and player should agree on a specific disorder appropriate to their game. Some possibilities are: Partial aphasia (difficulty communicating or using words), Color blindness, Amusica (inability to make or understand music), Synaesthesia, Logorrhoea (excessive use of words), Loss of face recognition, Loss of depth perception (double range modifiers), Repetitive behavior, Mood swings, The inability to shift attention quickly. The gamemaster may decide to inflict modifiers resulting from this affliction as appropriate.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 150);

  val noCorticalStack = EPTrait(
    name = "No Cortical Stack",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph lacks the cortical stack that is common to morphs of its type. This means the character cannot be resleeved from the cortical stack if the character dies, they can only be resleeved from a standard backup. This trait is not available for flats.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val oblivious = EPTrait(
    name = "Oblivious",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is particularly oblivious to events around them or anything other than what their attention is focused on. They suffer a –10 modifier to Surprise Tests and their modifier for being Distracted is –30 rather than the usual –20 (see Basic Perception, p. 190).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val onTheRun = EPTrait(
    name = "On The Run",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is wanted by the authorities of a particular habitat/station or faction, who continue to actively search for the character. They either committed a crime or somehow displeased someone in power. The character deals with that faction in question at their own risk and may occasionally be forced to deal with bounty hunters.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val psyVulnerability = EPTrait(
    name = "Psy Vulnerability",
    traitType = Negative,
    applicability = Both,
    descr = "Something about the character’s mind makes them particularly vulnerable to psi attack. They suffer a –10 modifier when resisting such attacks. The morph version of this trait may only be taken by biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val realWorldNaivete = EPTrait(
    name = "Real World Naivete",
    traitType = Negative,
    applicability = Ego,
    descr = "Due to their background, the character has very limited personal experience with the real (physical) world—or they have spent so much time in simulspace that their functioning in real life is impaired. They lack an understanding of many physical properties, social cues, and other factors that people with standard human upbringings take for granted. This lack of common sense may lead the character to misunderstand how a device works or to misinterpret someone’s body language. Once per game session, the gamemaster may intentionally mislead the character when giving them a description about some thing or some social interaction. This falsehood represents the character’s misunderstanding of the situation and should be roleplayed appropriately, even if the player realizes the character’s mistake. This trait should only be available to characters with the infolife or re-instantiated backgrounds, though the gamemaster may allow it for characters who have extensive virtual reality/XP use in their personal histories.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val severeAllergyUncommon = EPTrait(
    name = "Severe Allergy Uncommon",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph’s biochemistry suffers a severe allergic reaction (anaphylaxis) when it comes into contact (touched, inhaled, or ingested) with a specific allergen. The allergen may be common (dust, dander, plant pollen, certain foods, latex) or uncommon (certain drugs, insect stings). The player and gamemaster should agree on an allergen that fits the game. If exposed to the allergen, the character breaks into hives, has difficulty to breathing (–30 modifier to all actions), and must make a DUR Test or go into anaphylactic shock (dying of respiratory failure in 2d10 minutes unless medical care is applied). This trait is only available to biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val severeAllergyCommon = EPTrait(
    name = "Severe Allergy Common",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph’s biochemistry suffers a severe allergic reaction (anaphylaxis) when it comes into contact (touched, inhaled, or ingested) with a specific allergen. The allergen may be common (dust, dander, plant pollen, certain foods, latex) or uncommon (certain drugs, insect stings). The player and gamemaster should agree on an allergen that fits the game. If exposed to the allergen, the character breaks into hives, has difficulty to breathing (–30 modifier to all actions), and must make a DUR Test or go into anaphylactic shock (dying of respiratory failure in 2d10 minutes unless medical care is applied). This trait is only available to biomorphs.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 151);

  val slowLearner = EPTrait(
    name = "Slow Learner",
    traitType = Negative,
    applicability = Ego,
    descr = "New skills are not easy for this character to pick up. The character takes twice as long as normal to improve skills or learn new ones (p. 152).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val socialStigma = EPTrait(
    name = "Social Stigma",
    traitType = Negative,
    applicability = Both,
    descr = "An unfortunate aspect of the character’s background means that they suffer from a stigma in certain social situations. They may be sleeved in a morph viewed with repugnance, be a survivor of the infamous Lost generation, or may be an AGI in a post-Fall society plagued by fear of artificial intelligence. In social situations where the character’s nature is known to someone who view that nature with distaste, fear, or repugnance, they suffer a –10 to –30 modifier (gamemaster’s discretion) to social skill tests.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val timid = EPTrait(
    name = "Timid",
    traitType = Negative,
    applicability = Ego,
    descr = "This character frightens easily. They suffer a –10 modifier when resisting fear or intimidation.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val unattractiveLevel1 = EPTrait(
    name = "Unattractive Level1",
    traitType = Negative,
    applicability = Morph,
    descr = "In a time when good looks are easily purchased, this morph is conspicuously ugly. As unattractiveness is increasingly associated with being poor, backward, or genetically defective, responses to a lack of good looks range from distaste to horror. The character suffers a –10 modifier on social tests for Level 1, –20 for Level 2, and –30 for Level 3. Only biomorphs may take this trait. This modifier does not apply to interactions with xenomorphs or those with the infolife or uplift backgrounds. This modifier may be purchased for uplift morphs, but at half the bonus, and it is only effective against characters with that specific uplift background (i.e., neo-avians, neo-hominids, etc.).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val unattractiveLevel2 = EPTrait(
    name = "Unattractive Level2",
    traitType = Negative,
    applicability = Morph,
    descr = "In a time when good looks are easily purchased, this morph is conspicuously ugly. As unattractiveness is increasingly associated with being poor, backward, or genetically defective, responses to a lack of good looks range from distaste to horror. The character suffers a –10 modifier on social tests for Level 1, –20 for Level 2, and –30 for Level 3. Only biomorphs may take this trait. This modifier does not apply to interactions with xenomorphs or those with the infolife or uplift backgrounds. This modifier may be purchased for uplift morphs, but at half the bonus, and it is only effective against characters with that specific uplift background (i.e., neo-avians, neo-hominids, etc.).",
    cp = 20,
    source = Sources.ep,
    sourcePage = 151);

  val unattractiveLevel3 = EPTrait(
    name = "Unattractive Level3",
    traitType = Negative,
    applicability = Morph,
    descr = "In a time when good looks are easily purchased, this morph is conspicuously ugly. As unattractiveness is increasingly associated with being poor, backward, or genetically defective, responses to a lack of good looks range from distaste to horror. The character suffers a –10 modifier on social tests for Level 1, –20 for Level 2, and –30 for Level 3. Only biomorphs may take this trait. This modifier does not apply to interactions with xenomorphs or those with the infolife or uplift backgrounds. This modifier may be purchased for uplift morphs, but at half the bonus, and it is only effective against characters with that specific uplift background (i.e., neo-avians, neo-hominids, etc.).",
    cp = 30,
    source = Sources.ep,
    sourcePage = 151);

  val uncannyValley = EPTrait(
    name = "Unanny Valley",
    traitType = Negative,
    applicability = Morph,
    descr = "There is a point where synthetic human looks become uncannily realistic and human-seeming, but they remain just different enough that their looks seem creepy or even repulsive—a phenomenon called the “uncanny valley.” Morphs whose looks fall into this range suffer a –10 modifier on social skill tests when dealing with humans. This modifier does not apply to interactions with xenomorphs or those with the infolife or uplift backgrounds.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val unfitLevel1 = EPTrait(
    name = "Unfit Level1",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is either not optimized for health and/or just in bad shape. Reduce the aptitude maximums for Coordination, Reflexes, and Somatics by 5 (Level 1 ) or 10 (Level 2).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 151);

  val unfitLevel2 = EPTrait(
    name = "Unfit Level2",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is either not optimized for health and/or just in bad shape. Reduce the aptitude maximums for Coordination, Reflexes, and Somatics by 5 (Level 1 ) or 10 (Level 2).",
    cp = 20,
    source = Sources.ep,
    sourcePage = 152);

  val vrVertigo = EPTrait(
    name = "VR Vertigo",
    traitType = Negative,
    applicability = Ego,
    descr = "The character experiences intense vertigo and nausea when interfacing with any type of virtual reality, XP, or simulspace. Augmented reality has no effect, but VR inflicts a –30 modifier to all of the character’s actions. Prolonged use of VR (gamemaster’s discretion) may actually incapacitate the character should they fail a WIL × 2 Test.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 152);

  val weakImmuneSystemLevel1 = EPTrait(
    name = "Weak Immune System Level1",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph’s immune system is susceptible to diseases, drugs, and toxins. At Level 1, apply a –10 modifier whenever making a test to resist infection or the effects of a toxin or drug. At Level 2, increase this modifier to –20. This trait is only available to biomorphs.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 152);

  val weakImmuneSystemLevel2 = EPTrait(
    name = "Weak Immune System Level2",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph’s immune system is susceptible to diseases, drugs, and toxins. At Level 1, apply a –10 modifier whenever making a test to resist infection or the effects of a toxin or drug. At Level 2, increase this modifier to –20. This trait is only available to biomorphs.",
    cp = 20,
    source = Sources.ep,
    sourcePage = 152);

  val zerogNausea = EPTrait(
    name = "Zero-G Nausea",
    traitType = Negative,
    applicability = Morph,
    descr = "This morph suffers from space sickness and does not fair well in zero gravity. The character suffers a –10 modifier in any microgravity climate. Additionally, whenever the character is first getting acclimated or anytime they must endure excessive movement in microgravity, they must make a WIL Test or spend 1 hour incapacitated by nausea per 10 points of MoF.",
    cp = 10,
    source = Sources.ep,
    sourcePage = 152);

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
