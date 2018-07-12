package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsNegativeTranshuman {
  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  val aggresiveGrm = EPTrait(
    name = "Aggresive GRM",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is generally only found on uplift biomorphs, but might be included on any unusual high-end or custom biomorphs. A much more aggressive version of the genetic rights management used in rusters and other morphs that require maintenance through GSPs (see Planned Obsolescence, p. 165, Sunward), the genehacking used in creating this morph is atypical and includes many sections of suppressed effects and potential problems that make it difficult for anyone not familiar with the initial design to modify the morph. Unless “unlocked” by the designer through further genehacking, this morph is sterile, and will reject any biomods not listed as standard for the morph. Worse, due to the extensive and limiting manipulation of the morph’s DNA, it is much more prone to cancers and longevity issues than other morphs and has an average life expectancy of only 30–40 years. At the gamemaster’s discretion, Medicine Tests to modify or even heal this morph may suffer modifiers ranging from −10 to −30.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 87);

  val anomalousMind = EPTrait(
    name = "Anomalous Mind",
    traitType = Negative,
    applicability = Ego,
    descr = "Found almost exclusively in AGIs, uplifts, and the subjects of highly experimental pyschosurgical procedures, your mental patterns are dramatically outside the norm of transhumanity. The uniqueness of their mental map makes psychosurgery, routine backup, and resleeving difficult and risky. Any attempts to perform psychosurgery on the character suffer a −10 penalty and automatically cause 1 SV in addition to any other results and regardless of the success or failure of a procedure. Also, backing up and resleeving are not automatic (pp. 268–271, EP) and require active management of the process. Any technician operating the ego bridge during such procedures must succeed on a Psychosurgery Test or the backup/ sleeving attempt will fail.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 87);

  val beta = EPTrait(
    name = "Beta",
    traitType = Negative,
    applicability = Ego,
    descr = "This character is a beta fork of their original self, which for some reason is no longer alive (most likely lost during the Fall). They were created some time ago, so they have grown and overcome most of their original aptitude deficiencies. This character may not have a Moxie higher than 1 and no Active skills higher than 60, nor may they possess the Psi trait. They also have only a limited set of their original self’s memories—much of their previous life is simply lost to them. They automatically receive the Edited Memories trait (p. 149, EP), without gaining the bonus CP. Beta forks are, of course, illegal in many jurisdictions, and some consider them less than human (the gamemaster may apply a Social Stigma: Beta trait in appropriate circumstances; again no bonus CP are gained).",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 87);

  val botchedMerge = EPTrait(
    name = "Botched Merge",
    traitType = Negative,
    applicability = Ego,
    descr = "In the past, the character suffered a serious complication during an attempt to merge a fork that caused irreparable damage to their ego map, leaving them with a weaker grip on their memories and own identity. For some reason—perhaps due to irreproducible memories or information that would otherwise be lost, moral conviction, or the lack of any prior backup states to reinstance—the decision was made to carry on with a damaged mind. Now, high-stress situations can cause periods of dissociation, amnesia, and body alienation. Whenever the character takes stress damage, they must succeed on an INT x 3 Test or immediately enter a dissociative state where they feel disconnected from their body, lose some awareness of the events around them, and/ or forget certain information, memories, or skills. In this state they suffer a −10 penalty on all tests. The dissociative state persists for one minute or for the duration of a derangement if one is acquired due to trauma.",
    cp = 15,
    source = Sources.transhuman,
    sourcePage = 87);

  val botchedUplift = EPTrait(
    name = "Botched Uplift",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to uplifts. Although possessed of a rough self-awareness and the trappings of sapience, your mental development is flawed. Despite the best efforts of your creators and teachers, you cannot ever fully overcome your mental limitations and serious social awkwardness. Even psychosurgery is unlikely to fix you. You have an aptitude maximum of 10 for both COG or SAV. You have difficulty keeping up with others in complex social situations and are likely highly reliant on your muse to organize your life and coach you through your daily affairs. Whoever does interact with you likely treats you with either contempt or pity, as your difficulties are apparent to anyone who has more than the briefest exchanges with you.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 87);

  val curbedIntelligence = EPTrait(
    name = "Curbed Intelligence",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to AGIs. Fearful of AGIs that might develop into seed AIs like the TITANs, some developers have programmed extra safeguards and precautions into AGI mind-states to limit their intelligence. The aptitude maximum for COG for this AGI character is 15.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 88);

  val debtLevel1 = EPTrait(
    name = "Debt (Level 1)",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is in debt to a loan shark or powerful organization that demands regular payments. The debt may be the result of a legitimate loan or the character may be a victim of extortion. Either way, the character is expected to pay, with an interest rate that is far above standard (and possibly illegal), and the creditor organization will not take no for an answer. The approximate level of debt is equal to the following amount: Level 1: 20,000 credits (plus 1d10 x 500 credits in weekly interest) Level 2: 40,000 credits (plus 2d10 x 500 credits in weekly interest) Level 3: 60,000 credits (plus 3d10 x 500 credits in weekly interest) Each week the character is expected to make a payment on the debt equal to the weekly interest. Failure to do so will cause the creditor organization to retaliate, which can take any number of forms. Hypercorp creditors may lower the character’s rep by publicly declaring them a deadbeat while criminal syndicates may send ego hunters to extract full payment. Many organizations employ debt collectors that know how to get money from reluctant debtors one way or the other. If the character completely reneges on this debt, they gain the Black Mark (Level 2) and Enemy traits. Characters may be given the option of working off their weekly interest payment—or even their entire debt—by performing a job or other favor for the creditor organization. Generally, this will be a high risk mission for which the organization does not want to use its own personnel, such as retrieval of data from an exsurgent-infested abandoned habitat or assassinating the head of a Martian crime syndicate. The higher the debt is, the more dangerous or difficult the mission will be.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 88);

  val debtLevel2 = EPTrait(
    name = "Debt (Level 2)",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is in debt to a loan shark or powerful organization that demands regular payments. The debt may be the result of a legitimate loan or the character may be a victim of extortion. Either way, the character is expected to pay, with an interest rate that is far above standard (and possibly illegal), and the creditor organization will not take no for an answer. The approximate level of debt is equal to the following amount: Level 1: 20,000 credits (plus 1d10 x 500 credits in weekly interest) Level 2: 40,000 credits (plus 2d10 x 500 credits in weekly interest) Level 3: 60,000 credits (plus 3d10 x 500 credits in weekly interest) Each week the character is expected to make a payment on the debt equal to the weekly interest. Failure to do so will cause the creditor organization to retaliate, which can take any number of forms. Hypercorp creditors may lower the character’s rep by publicly declaring them a deadbeat while criminal syndicates may send ego hunters to extract full payment. Many organizations employ debt collectors that know how to get money from reluctant debtors one way or the other. If the character completely reneges on this debt, they gain the Black Mark (Level 2) and Enemy traits. Characters may be given the option of working off their weekly interest payment—or even their entire debt—by performing a job or other favor for the creditor organization. Generally, this will be a high risk mission for which the organization does not want to use its own personnel, such as retrieval of data from an exsurgent-infested abandoned habitat or assassinating the head of a Martian crime syndicate. The higher the debt is, the more dangerous or difficult the mission will be.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 88);

  val debtLevel3 = EPTrait(
    name = "Debt (Level 3)",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is in debt to a loan shark or powerful organization that demands regular payments. The debt may be the result of a legitimate loan or the character may be a victim of extortion. Either way, the character is expected to pay, with an interest rate that is far above standard (and possibly illegal), and the creditor organization will not take no for an answer. The approximate level of debt is equal to the following amount: Level 1: 20,000 credits (plus 1d10 x 500 credits in weekly interest) Level 2: 40,000 credits (plus 2d10 x 500 credits in weekly interest) Level 3: 60,000 credits (plus 3d10 x 500 credits in weekly interest) Each week the character is expected to make a payment on the debt equal to the weekly interest. Failure to do so will cause the creditor organization to retaliate, which can take any number of forms. Hypercorp creditors may lower the character’s rep by publicly declaring them a deadbeat while criminal syndicates may send ego hunters to extract full payment. Many organizations employ debt collectors that know how to get money from reluctant debtors one way or the other. If the character completely reneges on this debt, they gain the Black Mark (Level 2) and Enemy traits. Characters may be given the option of working off their weekly interest payment—or even their entire debt—by performing a job or other favor for the creditor organization. Generally, this will be a high risk mission for which the organization does not want to use its own personnel, such as retrieval of data from an exsurgent-infested abandoned habitat or assassinating the head of a Martian crime syndicate. The higher the debt is, the more dangerous or difficult the mission will be.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 88);

  val defferedIndentureLevel1 = EPTrait(
    name = "Deferred Indenture (Level 1)",
    traitType = Negative,
    applicability = Ego,
    descr = "Due to a prior contract or sentence, this character has a pending indenture that has yet to be redeemed. The character is legally obligated to perform whatever work is asked of them to repay their debt. At Level 1, the value of the indenture is equivalent to 5,000 credits or a Level 4 favor. At Level 2, it is worth 20,000 credits or a Level 5 favor. At Level 3, the indenture is worth 40,000 credits or two Level 5 favors. If the indenture is not honored when called in, the character will be subject to the legal consequences, up to and including pursuit by law enforcement and additional criminal penalties from the originating jurisdiction. Gamemasters and players should outline the circumstances that led to the establishment of the indenture.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 88);

  val defferedIndentureLevel2 = EPTrait(
    name = "Deferred Indenture (Level 2)",
    traitType = Negative,
    applicability = Ego,
    descr = "Due to a prior contract or sentence, this character has a pending indenture that has yet to be redeemed. The character is legally obligated to perform whatever work is asked of them to repay their debt. At Level 1, the value of the indenture is equivalent to 5,000 credits or a Level 4 favor. At Level 2, it is worth 20,000 credits or a Level 5 favor. At Level 3, the indenture is worth 40,000 credits or two Level 5 favors. If the indenture is not honored when called in, the character will be subject to the legal consequences, up to and including pursuit by law enforcement and additional criminal penalties from the originating jurisdiction. Gamemasters and players should outline the circumstances that led to the establishment of the indenture.",
    cp = 15,
    source = Sources.transhuman,
    sourcePage = 88);

  val defferedIndentureLevel3 = EPTrait(
    name = "Deferred Indenture (Level 3)",
    traitType = Negative,
    applicability = Ego,
    descr = "Due to a prior contract or sentence, this character has a pending indenture that has yet to be redeemed. The character is legally obligated to perform whatever work is asked of them to repay their debt. At Level 1, the value of the indenture is equivalent to 5,000 credits or a Level 4 favor. At Level 2, it is worth 20,000 credits or a Level 5 favor. At Level 3, the indenture is worth 40,000 credits or two Level 5 favors. If the indenture is not honored when called in, the character will be subject to the legal consequences, up to and including pursuit by law enforcement and additional criminal penalties from the originating jurisdiction. Gamemasters and players should outline the circumstances that led to the establishment of the indenture.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 88);

  val dependent = EPTrait(
    name = "Dependent",
    traitType = Negative,
    applicability = Ego,
    descr = "This character has a dependent—a child, a disabled family member, or even a much-loved but needy smart animal pet. Though the character can leave their ward’s care in the hands of a fork or others, they must occasionally attend to the dependent’s needs and may sometimes be forced to bring the dependent with them. The player and gamemaster should work out the specifics of the dependent NPC together; this NPC should have no skills or abilities of value to the player character. The dependent should be a potential vulnerability for the character that enemies or rivals could exploit.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 88);

  val divergentPersonality = EPTrait(
    name = "Divergent Personality",
    traitType = Negative,
    applicability = Ego,
    descr = "Something about this character makes their forks diverge from their core personality more quickly than usual. When attempting a merge, treat the fork’s time apart as if it were one step lower on the Merging table (p. 275, EP). For example, a fork that is absent under an hour is treated as if it were away for 1–4 hours. Characters with this trait may not take the multitasking implant; the continual forking and merging is too stressful on their mind.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 88);

  val domineering = EPTrait(
    name = "Domineering",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to uplifts and is most common among neo-hominids. The character retains pre-sapient neurological urges to gain social status via dominance. The character must make a WIL x 2 Test to use Persuasion skill in any situation where they can safely deploy Intimidation skill instead. Additionally, they must make a WIL x 3 Test to avoid responding to acts of intimidation with threat displays or violence, though such violence need not be lethal (note that they will still back down if someone successfully uses Intimidation skill on them). Since the evolutionary purpose of dominance structures is to minimize conflict, domineering uplifts prefer to surround themselves with submissives and will avoid entering situations where they know their dominance might be challenged. Such domineering characters often suffer poor reputations in modern transhuman reputation networks. They may not start with a rep score higher than 40 in any rep network other than Guanxi.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 88);

  val drugFiend = EPTrait(
    name = "Drug Fiend",
    traitType = Negative,
    applicability = Both,
    descr = "The character or morph has a weak resistance to addiction. Addiction Tests (including attempts to resist addiction cravings) are made with a −20 modifier.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 89);

  val emotiveBlindness = EPTrait(
    name = "Emotive Blindness",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to AGIs and uplifts. This character has difficulty reading the finer points of social cues, body language, expressions, emoting, and so forth for any transhuman outside of its own species. Apply a −10 modifier to Kinesics Tests used against anyone not of the same species as the character.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 89);

  val errantFork = EPTrait(
    name = "Errant Fork",
    traitType = Negative,
    applicability = Ego,
    descr = "Whether through conscious action or a freak occurrence, you are not the only you out there. An alpha fork of yourself exists and has decided to pursue its own path. Though this fork is not necessarily an enemy, it does have its own agenda and interests that sometimes run counter to your own. There may be legal issues involved, such as competing claims over who is the original alpha and therefore has rights to any property (or in some jurisdictions, the right to exist). There may be social awkwardness, as the division between you and your alpha forced you to compete over your friends, family, or even lovers. Though the alpha fork began with the same aptitudes, skills, traits, rep, and so on as yourself, it has diverged and begun to develop as a separate character, controlled by the gamemaster. Other complications in the relationship between these alphas should exist, enough that the other alpha should serve as an occasional hindrance or surprise. The alphas may, for example, have a strong rivalry going over their shared field of expertise or may simply feel a need to prove themselves better than the other.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 89);

  val faultyEducation = EPTrait(
    name = "Faulty Education",
    traitType = Negative,
    applicability = Ego,
    descr = "Not everyone receives the same quality of education and many are taught incorrect things. Some children, for example, are raised with an ideologically driven system that prizes obedience over truth and accuracy—something still common in certain Jovian, brinker, and religious communities. Others, like many infugees, isolates, and zeroed indentures, only have access to substandard or obsolete reference material. No matter the cause, the character thinks they know far more than they really do. Once per session, the gamemaster may intentionally mislead the character when giving them the results of a Knowledge Skill Test or otherwise detailing some aspect of the setting or a social interaction, depending on the character’s background. This misinformation represents the character’s faulty understanding of the topic at hand and should be roleplayed appropriately, even if the player knows that their character is mistaken.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 89);

  val frailSanityLevel1 = EPTrait(
    name = "Frail Sanity Level1",
    traitType = Negative,
    applicability = Ego,
    descr = "This ego’s mind is not as resilient as others. Its Lucidity is reduced by 5 per level. This also reduces Trauma Threshold by 1 or 2, respectively.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 90);

  val frailSanityLevel2 = EPTrait(
    name = "Frail Sanity Level2",
    traitType = Negative,
    applicability = Ego,
    descr = "This ego’s mind is not as resilient as others. Its Lucidity is reduced by 5 per level. This also reduces Trauma Threshold by 1 or 2, respectively.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 90);

  val hoarder = EPTrait(
    name = "Hoarder",
    traitType = Negative,
    applicability = Ego,
    descr = "With the limitations on living space and need for resource management in all but the wealthiest habs, most transhumans are used to living with a minimal number of personal possessions. The flexibility and multi-purpose nature of most objects and availability of information, entertainment, and communication over digital or VR services all allow this to work well, but hoarders have a psychological compulsion to keep things that they don’t need and serve no purpose. Particularly common among corvid uplifts and some Fall survivors that lost everything, characters with this trait have a hard time giving away or disposing of things. Unless their behavior is somehow managed, they will accumulate overwhelming collections of junk. Each day, the character must make a WIL x 3 Test to keep their compulsion under control. If they fail, they will keep any objects they would normally throw away or recycle (food packaging, drink bulbs, broken or useless objects like dead ectos, ammunition clips, and the like) and must acquire one new item that day; all of those items will be added to their hoard. Hoarders can force themselves to ignore this compulsion for a day by taking one point of stress damage. If they ever attempt to clean out their hoard voluntarily, or if the hoard is significantly reduced (by catastrophe or by hab maintenance workers forcibly removing it), the character takes (1d10 ÷ 2) + 2 SV.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 90);

  val identifiablyQuirk = EPTrait(
    name = "Identifiable Quirk",
    traitType = Negative,
    applicability = Ego,
    descr = "Transhumans may be able to switch bodies and travel the entire solar system to start a new life, but some things can’t be left behind. The character has a unique behavioral quirk that makes identification easy, no matter the morph in which they are sleeved. Attempts to identify this character through Kinesics or similar skills gain a +10 bonus. This quirk could be a nervous twitch of the lips, distinct accent, noticeable laugh, or unusual gait. The character suffers a −30 modifier to all Impersonation Tests against targets aware of the character’s quirk.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 90);

  val impairedProprioception = EPTrait(
    name = "Impaired Proprioception",
    traitType = Negative,
    applicability = Morph,
    descr = "This trait is only available to octomorphs and flying squid morphs. Baseline cephalopods lack a sense of proprioception in their arms and tentacles, meaning they only know where their limbs are by looking at them. Though a standard proprioceptive sense was added to most octomorph and flying squid models, a number of germlines lack the proper neural structure. A morph with this trait suffers a −10 modifier on Fray Tests to avoid attacks or get out of the way and gains no benefits from the Ambidextrous trait.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 90);

  val intenseRelationship = EPTrait(
    name = "Intense Relationship",
    traitType = Negative,
    applicability = Ego,
    descr = "Many characters retain close relationships with family, friends, and lovers. Sometimes, however, the interpersonal connection in these relationships becomes so intense as to be a detriment. The character is emotionally dependent on their relationship with a particular NPC to the point that being separated from the NPC is taxing. Each week the character goes without meaningful communication with the NPC, they suffer 1 point of stress. If cut off for more than two weeks, they also suffer a −10 modifier to all Task Actions until they are able to reconnect, as they are too distracted to focus. The character also suffers double the stress from witnessing the NPC being hurt or killed. Basic operational security dictates that the character cannot tell the NPC anything about Firewall nor can they communicate with the NPC during a Firewall mission. Characters breaking these rules put the lives of their friends and family at risk. Gamemasters should have enemies of Firewall use friends and family against characters who break these rules.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 90);

  val lacksManipulators = EPTrait(
    name = "Lacks Manipulators",
    traitType = Negative,
    applicability = Morph,
    descr = "This morph lacks hands or other limbs with a fine manipulation capability. It is a common trait with quadrupeds (as well as certain smart animals). A morph with this trait may not be able to manipulate objects at all or may only be able to do so with a very limited capacity. Some morphs can hold small-sized or smaller tools, weapons, and other objects between their paws or in their mouths, for example, but unless these items have been specifically designed to operate with this morphology, the character will suffer a −30 modifier to use or may not be able to use them at all (gamemaster discretion). Objects that don’t require physical manipulation, such as tools controlled by wireless commands, may be used normally. Some morphs with this trait— particularly quadrupeds—may be unable to hold an object between their paws and move at the same time or may require a SOM x 3 Test to retain their balance while standing upright to hold something.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 90);

  val lostFork = EPTrait(
    name = "Lost Fork",
    traitType = Negative,
    applicability = Ego,
    descr = "A fork of the character has gone missing without a trace. The fork was legal and in compliance with all relevant laws and standards—then it vanished. The version that disappeared was an alpha fork, a complete recent copy of the character’s ego that possesses sensitive knowledge about all aspects of the character’s life. Players and gamemasters should discuss this trait before using it in their game and address the following questions: When did the disappearance occur? Why was the fork created? What was the fork doing just before the disappearance? What leads, if any, does the player possess at the start of the game? This trait is often taken in combination with the Edited Memories, Enemy, and/or On the Run traits.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 91);

  val lowGravityAdaptation = EPTrait(
    name = "Low Gravity Adaptation",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is adapted to live in low gravity (0.15 g or less) and struggles in higher-gravity environments. Treat the character as suffering the effects of high gravity (p. 199, EP) for every full 0.2 g over 0.15. For example, while the character would operate fine on Luna or Titan, on Mars or Mercury (both 0.38 g) the character would be treated as if suffering the effects of 1 wound. On Venus (0.9 g), the character would be treated as if suffering the effects of 3 wounds. For each of these high gravity increments, also reduce the character’s Walking Rate by 1 and their Running Rate by 4. While even low-gravity-adapted bodies can sustain the stress of high gravity (over 1 g) for temporary periods, the gamemaster may rule that long-term exposure to higher gravity may result in the accumulation of actual wounds, not just wound effects. This trait may not be applied to morphs with the High-G Adaptation trait.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 91);

  val memoryArtifact = EPTrait(
    name = "Memory Artifact",
    traitType = Negative,
    applicability = Morph,
    descr = "This particular morph has an anomalous neural structure. As a result, sometimes not all aspects of an ego are properly erased after it has been uploaded and the mind is customarily wiped. This morph has memories from a previous ego that continue to resurface. Once per week, the ego sleeved in the morph must make a MOX x 10 Test. If it fails, certain memories will manifest in the current occupant’s mind. This memories are likely to be from emotionally charged or otherwise memorable events in a previous ego’s life. The first time the latent memories activate, the ego suffers (1d10 ÷ 2) SV. Additional incidents of memory recall may or may not inflict stress, depending on the memory in question (traumatic ones certainly will), how drastically the memories conflict with the character’s personality, and whether or not the character is aware of the source of these memories. The character naturally integrates these memories in with their own, making them a long-term or possibly permanent change that can only be removed with psychotherapy. These memories may of course be useful for plot purposes, as they may include sensitive data, secrets hidden from the public, or information the previous ego does not want spread. Gamemasters should not allow this trait for morphs that will be sleeved for less than a week unless they increase the test frequency from weekly to daily.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 91);

  val neurochemicalImbalance = EPTrait(
    name = "Neurochemical Imbalance",
    traitType = Negative,
    applicability = Morph,
    descr = "Something about this morph’s neurochemistry (or its neurochemical simulators, in the case of pods and synthmorphs) is unbalanced. Egos that sleeve into this morph struggle with a strong, almost overwhelming emotion: sadness, despair, frustration, loneliness, manic intensity, anxiety, euphoria, and so on. The strength of this emotion may ebb and wane, but it is omnipresent enough to have a consistent impact on the character’s mood and personality. This imposed emotion does not affect the character’s abilities, but it should be taken into effect for roleplaying purposes. The emotion may be quelled with endocrine control implants (but not emotional dampers) or temporarily overcome via a Psychosurgery Test (for biomorphs) or Hardware: Robotics Test (for synthmorphs). Specific drugs may also reduce the effect, based on the particular aptitude affected. Despite these efforts, the emotion will return in 1d10 days.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 91);

  val notATeamPlayer = EPTrait(
    name = "Not A Team Player",
    traitType = Negative,
    applicability = Morph,
    descr = "This character is socially awkward, self-centered, or has such low self esteem that they simply do not work well others. The character does not benefit from teamwork bonuses when others try to aid them, and if they attempt to aid someone else (whether voluntarily or forced), they will apply a −10 modifier to the test rather than aiding with a +10.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 91);

  val overwhelmedByEmotions = EPTrait(
    name = "Overwhelmed By Emotions (AGIs Only)",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to AGIs. The character has a particularly difficult time adjusting to hormonal urges and emotions when sleeved in biomorphs. The character suffers a −10 modifier when resisting any form of emotional manipulation, including Intimidation and most Persuasion Tests. Additionally the character suffers a −10 modifier to Stress Tests involving emotions, fear, or pain. At the gamemaster’s discretion, certain intense emotions or rushes may temporarily overwhelm the character; if they fail a WIL x 3 Test, they are disoriented and must spend a Complex Action to regain their wits. Gamemasters should not allow this trait for characters that are unlikely to ever sleeve into biomorphs—or should at least occasionally put them in situations that force them into one. Endocrine control does not completely mitigate these effects, though some of the modifiers may cancel out.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 91);

  val personalityArtifact = EPTrait(
    name = "Personality Artifact",
    traitType = Negative,
    applicability = Morph,
    descr = "Minor but occasionally intrusive echoes of previous egos that have inhabited the morph still remain as mental artifacts. Once per week, the ego sleeved in the morph must make a MOX x 10 Test. If it fails, certain character traits manifest in the current occupant’s mind, causing personality or behavior modification. Roll on the Personality Artifact table and apply the result; the effect lasts for (1d10 ÷ 2) days. With a successful INT x 3 Test, the character will recognize the manifesting behavior as foreign and suffer (1d10 ÷ 2) SV. Additional incidents may or may not inflict stress, depending on the change in question, how drastically the changes conflict with the character’s personality, and whether or not the character is aware of the source of these memories. These personality changes are not permanent and will not transfer with the character’s ego when they resleeve. Gamemasters should not allow this trait for morphs that will be sleeved for less than a week, unless they increase the test frequency from weekly to daily.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 92);

  val phobiaDisorder = EPTrait(
    name = "Phobia Disorder",
    traitType = Negative,
    applicability = Ego,
    descr = "Phobias are a minor type of mental anxiety disorder based on an irrational fear of a particular situation or thing. Phobic characters will go to great lengths to avoid their particular fear—they must make a WIL x 3 Test to even stay within proximity, otherwise they will flee the area. If forced into close proximity with their fear, they will suffer 1 SV per hour and take a −10 modifier to all of their actions. If they are trapped in close proximity to the source of their fear, they will suffer (1d10 ÷ 2) SV per hour and take a −30 modifier to all actions. Luckily, phobias are easier to treat than other disorders. The base timeframe for psychotherapy treatment of a phobia is 20 hours. Phobia disorders may be inflicted on characters that suffer too many traumas in place of other mental disorders. Gamemasters should keep in mind, however, that phobias are easier to treat; though the possibility of taking more mental stress from the phobia may offset this. At the gamemaster’s discretion, temporary phobias can be used as derangements inflicted with mental trauma (p. 209, EP). In these situations, the phobia should be linked to the particular source of trauma. For example, a character who suffers a trauma from remembering their death after vacuum exposure might pick up a derangement phobia of vacuum environments. Pg92 for Phobia Examples.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 92);

  val poorlySocialized = EPTrait(
    name = "Poorly Socialized",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is most common among AGIs and uplifts, but can be taken by anyone. The character’s early life experience left them poorly prepared for interacting with the general public, and they come off as boorish, distant, or strange until they get to know someone well. Due to the difficult nature of the character’s behavior, they suffer a −10 modifier on all Social Skill Tests whenever the character is interacting with another character for the first time only.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 93);

  val proprietaryTech = EPTrait(
    name = "Proprietary Tech (Synthmorphs Only)",
    traitType = Negative,
    applicability = Morph,
    descr = "This trait is only available to synthmorphs. This morph was built to non-standard specifications, so that normal tools and software do not properly work on this morph. This is a conscious design decision by the manufacturer of the morph and is often used as a means of control. By limiting access to repair and modifications, the morph is dependent on the manufacturer. Highly skilled technicians can work around these barriers, but it impedes work. Standard repair and diagnostic tools like repair spray and fixer nanoswarms do not work on this morph, except for manufacturer-approved brands. Characters with Hardware: Robotics can repair or modify the morph but at a −20 modifier.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 93);

  val reducedSize = EPTrait(
    name = "Reduced Size",
    traitType = Negative,
    applicability = Morph,
    descr = "This trait reduces the size of an existing morph model from either large to medium or medium to small (morphs may only be reduced once). Morphs shrunk to a medium size lose the effects of the Large Size trait (next page) and 10 points of Durability. Morphs reduced to a small size gain the effects of the Small Size trait (p. 95) and lose 5 points of Durability. Durability reductions also effect Wound Threshold and Death Rating per normal. Reducing a morph may affect other changes at the gamemaster’s discretion.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 93);

  val sociallyGraceless = EPTrait(
    name = "Socially Graceless",
    traitType = Negative,
    applicability = Ego,
    descr = "Something about the character makes them a walking social disaster. While the character can be charming and confident, they forget basic social etiquette, overlook customs and rules, miss social cues, and overstep their bounds. Once per game session, the gamemaster can treat one social interaction (preferably where a Social Skill Test by the character was involved) as a critical failure. Usually this results in someone being offended, becoming hostile, or refusing to work with the character. Protocol may not be used to wipe away this social gaffe, nor may Moxie negate it.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 93);

  val solitary = EPTrait(
    name = "Solitary",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to neo-octopi uplifts. Like its pre-sapient kin, this uplift prefers solitude and has not been fully socialized. As a result, they can only tolerate 2 hours of direct interaction (physical or virtual) with others before they need a break and some alone time (at least 2 hours). If forced into a situation where they must interact or exist in close proximity to others for more than 2 hours, they suffer a cumulative −10 modifier to all Social Skill Tests per 2-hour period, up to a maximum of −30. After 6 hours, they must a WIL x 3 Test to keep their composure and not react towards those around them with aggression, hostility, or even violence. This trait is usually taken in conjunction with the Hardening (Isolation) trait.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 93);

  val submissive = EPTrait(
    name = "Submissive",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to uplifts. This character retains a tendency to submit to displays of dominance, inherited from their pre-sapient forebears. The character suffers a −20 modifier in Opposed Tests against Intimidation from NPCs with perceived social status.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 93);

  val subvertedMind = EPTrait(
    name = "Subverted Mind",
    traitType = Negative,
    applicability = Ego,
    descr = "Similar to the Modified Behavior trait (p. 150, EP), the character has been conditioned by behavioral control psychosurgery—in this case, an expunged or enforced behavior. The character is unaware of this mind editing, however, as the procedure also included an awareness block (p. 170). This means the character could be a secret spy, courier, or saboteur, possibly even regularly engaging in behavior of which they are completely unaware. Alternatively, they could simply be an enemy’s secret ace in the hole, a trump card to exploit when the time is right. Keep in mind that, due to the awareness block, even when the character’s hidden programming becomes apparent to others, they will be cognitively incapable of recognizing it themselves, which is certain to be an incredibly stressful experience all around.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 93);

  val trustingHeart = EPTrait(
    name = "Trusting Heart",
    traitType = Negative,
    applicability = Ego,
    descr = "The character has a tendency to trust others far too quickly and is devastated when betrayed. Stress loss from betrayal is doubled and the character suffers a −10 modifier when using Kinesics in Opposed Tests against Deception or Impersonation skills.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 94);

  val uncontrollableUrge = EPTrait(
    name = "Uncontrolable Urge",
    traitType = Negative,
    applicability = Both,
    descr = "The ego or morph has an overwhelming primal drive that is not properly filtered by the brain, such as the urge for hunting, hiding food, mating, marking territory, driving off competitors (or, for the rare synthmorph, cleaning, serving, or shutting down when not in use), and so on. When presented with triggering stimuli, the character must pass a WIL x 3 Test to resist acting out the compulsion immediately. While resisting the compulsion, the character suffers a −10 to all actions. Uncontrollable drives are poorly received in most circles. This trait is most common among uplifts.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 94);

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
