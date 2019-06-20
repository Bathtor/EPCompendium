package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsPositiveTranshuman {
  import TraitType.{Negative, Neutral, Positive};
  import TraitApplicability.{Both, Ego, Morph};

  val agiAfinity = EPTrait(
    name = "Agi Affinity",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character has spent a significant amount of time around AGIs, to the point where socializing with an AGI is far easier. The character gains a +10 modifier on Social Skill Tests against AGIs as well as characters with the Real World Naiveté trait.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 82
  );

  val agiSocialization = EPTrait(
    name = "Agi Socialization",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Only AGI characters may take this trait and only during character generation. The character is more adept at interpreting social cues than the average infolife. The character gains a +10 bonus on all Kinesics Tests made against transhumans. This bonus does not apply to other AGIs, uplifts, aliens, or exsurgents.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val asyncFamiliarity = EPTrait(
    name = "Async Familiarity",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This character has a keen sense for the subtle behavioral clues and micro-expressions that many asyncs unconsciously adopt after their infection. As a result, they may make a Kinesics Test to identify an async as such on their behavior alone. Gamemasters are encouraged to make this test difficult (–30) at best, given that there is usually no outward sign of Watts-MacLeod infection or the use of psi sleights. This trait is most common among asyncs, but it may be allowed for characters that have studied asyncs or spent significant time in their presence.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val digitalGhost = EPTrait(
    name = "Digital Ghost",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character has an intuitive knack for keeping their computer intrusions out of the spotlight. Once per game session, the hacker may prevent a Severe Failure or Critical Failure from downgrading their status on a hacked system (see Failing Tests, p. 257, EP).",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val dominantStrain = EPTrait(
    name = "Dominant Strain (Async Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to asyncs. The Watts-MacLeod virus has a special hold on the async and aggressively resists attempts by other strains of the exsurgent virus to gain a foothold in the character. Instead of the usual –20 penalty to resist infection, the character gains a +10 bonus. Any time they must make such a test, however, they immediately suffer the effects of a derangement for 1d10 hours after the test is resolved as the Watts-MacLeod strain asserts itself. They incur no stress along with this derangement, but multiple tests to resist infection may, at the gamemaster’s discretion, incur additional derangements.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val drugException = EPTrait(
    name = "Drug Exception",
    traitType = Positive,
    applicability = Both,
    descr =
      "The character or morph has an unusual resistance to addiction for one particular biological or chemical drug (but not nanodrugs or narcoalgorithms). Addiction Tests for using that drug or resisting an addiction craving are made with a +20 modifier. Furthermore, the character halves the penalty for minor and moderate addiction to that drug, but still suffers full penalties from major addiction.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val egoPlasticityLevel1 = EPTrait(
    name = "Ego Plasticity Level1",
    traitType = Positive,
    applicability = Both,
    descr =
      "Merging forks can be stressful under the best of circumstances, but some people handle the process better than others. Per level, the character gains a +10 modifier on all Merging Tests and suffers −1 SV when merging forks.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val egoPlasticityLevel2 = EPTrait(
    name = "Ego Plasticity Level2",
    traitType = Positive,
    applicability = Both,
    descr =
      "Merging forks can be stressful under the best of circumstances, but some people handle the process better than others. Per level, the character gains a +10 modifier on all Merging Tests and suffers −1 SV when merging forks.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val egoPlasticityLevel3 = EPTrait(
    name = "Ego Plasticity Level3",
    traitType = Positive,
    applicability = Both,
    descr =
      "Merging forks can be stressful under the best of circumstances, but some people handle the process better than others. Per level, the character gains a +10 modifier on all Merging Tests and suffers −1 SV when merging forks.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val enlargedSize = EPTrait(
    name = "Enlarged Size",
    traitType = Positive,
    applicability = Morph,
    descr =
      "This trait increases the size of an existing morph model from either small to medium or medium to large (morphs may only be enlarged once). Morphs enlarged to a medium size lose the effects of the Small Size trait (p. 95) and gain 5 points of Durability. Morphs enlarged to a large size gain the effects of the Large Size trait (p. 94) and 10 points of Durability. Durability increases also effect Wound Threshold and Death Rating as normal. Enlarging a morph may affect other changes at the gamemaster’s discretion. For example, morphs that relied on their small size for flight may lose that capability or suffer modifiers.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val entrepreneurLevel1 = EPTrait(
    name = "Entrepreneur Level1",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This character is the owner or co-owner of their own small hypercorp, microcorp, or business franchise—or an active participant in an autonomist cooperative, collective, or work syndicate. This entity has its own reputation score in an appropriate social network; at the beginning of game play, this rep score equals the trait level x 20. As an owner/member, the character can call upon this rep score for favors, information, and goods, just as they would their own rep score. At the gamemster’s discretion, this venture can provide other benefits, such as enabling opportunities for smuggling, making official inquiries, or providing a cover for clandestine activities. Though a character can handle much of their management/participation in their businesses or cooperative work project via the mesh and forking, the gamemaster should ensure that the relationship is not strictly a one-way street and occasionally place obligations on the character to take care of business affairs. The gamemaster and player should work together to define the nature of the business/cooperative, such as what it focuses on, where it is based, and the other important participants. These ventures are more than just another resource for the character to call upon, as they can also be used to sew new plot seeds or create new role-playing opportunities. The reputation score of this venture should fluctuate during game play, much like a player character’s. This may be in part due to the character’s actions, but could also result from economic or political factors outside the character’s control.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val entrepreneurLevel2 = EPTrait(
    name = "Entrepreneur Level2",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This character is the owner or co-owner of their own small hypercorp, microcorp, or business franchise—or an active participant in an autonomist cooperative, collective, or work syndicate. This entity has its own reputation score in an appropriate social network; at the beginning of game play, this rep score equals the trait level x 20. As an owner/member, the character can call upon this rep score for favors, information, and goods, just as they would their own rep score. At the gamemster’s discretion, this venture can provide other benefits, such as enabling opportunities for smuggling, making official inquiries, or providing a cover for clandestine activities. Though a character can handle much of their management/participation in their businesses or cooperative work project via the mesh and forking, the gamemaster should ensure that the relationship is not strictly a one-way street and occasionally place obligations on the character to take care of business affairs. The gamemaster and player should work together to define the nature of the business/cooperative, such as what it focuses on, where it is based, and the other important participants. These ventures are more than just another resource for the character to call upon, as they can also be used to sew new plot seeds or create new role-playing opportunities. The reputation score of this venture should fluctuate during game play, much like a player character’s. This may be in part due to the character’s actions, but could also result from economic or political factors outside the character’s control.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val entrepreneurLevel3 = EPTrait(
    name = "Entrepreneur Level3",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This character is the owner or co-owner of their own small hypercorp, microcorp, or business franchise—or an active participant in an autonomist cooperative, collective, or work syndicate. This entity has its own reputation score in an appropriate social network; at the beginning of game play, this rep score equals the trait level x 20. As an owner/member, the character can call upon this rep score for favors, information, and goods, just as they would their own rep score. At the gamemster’s discretion, this venture can provide other benefits, such as enabling opportunities for smuggling, making official inquiries, or providing a cover for clandestine activities. Though a character can handle much of their management/participation in their businesses or cooperative work project via the mesh and forking, the gamemaster should ensure that the relationship is not strictly a one-way street and occasionally place obligations on the character to take care of business affairs. The gamemaster and player should work together to define the nature of the business/cooperative, such as what it focuses on, where it is based, and the other important participants. These ventures are more than just another resource for the character to call upon, as they can also be used to sew new plot seeds or create new role-playing opportunities. The reputation score of this venture should fluctuate during game play, much like a player character’s. This may be in part due to the character’s actions, but could also result from economic or political factors outside the character’s control.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 83
  );

  val establishedFork = EPTrait(
    name = "Established Fork",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character begins the game with a fully instanced fork of themselves, and the player can specify if it is an alpha, beta, or delta fork; beta and delta forks will have their stats adjusted according to the rules outlined on pp. 273–274, EP. Psychosurgical alterations that differentiate the fork from the character such as personality edits, mannerisms, and gender/sexual identity (but not traits) can be defined by the player and incorporated into the fork at no cost. Any other positive or negative mental traits taken for the fork must be purchased and applied to the fork exclusively. The fork’s morph and gear must be paid for and provided by expenditure of the character’s own CP and starting credits. This trait ensures the fork is established and recognized as legal in whatever habitat the character lives in when the game starts, but there is no guarantee that the fork would be recognized as legal elsewhere or that the legality will remain current once the game is underway. This trait can be taken more than once. Players should carefully coordinate with their gamemaster to ensure a common understanding of the fork’s place in the game and how they can be utilized.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 84
  );

  val goldStar = EPTrait(
    name = "Gold Star",
    traitType = Positive,
    applicability = Ego,
    descr =
      "At some point in their past, this character did something that permanently earned them a place in the historical annals of a particular faction. Choose one faction. Each time the character interacts with that faction (such as with Networking Tests) or with an NPC from this faction who knows the character, they gain a +10 modifier. This trait is incompatible with the Black Mark trait (p. 149, EP) for the same faction.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 84
  );

  val hardening = EPTrait(
    name = "Hardening",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Either through repeated exposure or simply due to a willful aspect of the character’s personality, the character is desensitized to one particular type of stressful experience. The player may choose one entry from the Stressful Experiences table (p. 215, EP), the Continuity Stress table (p. 233, EP), or any other specific experience that causes stress, such as specific psychosurgery procedures or Alienation Tests with a particular type of morph, with game-master approval. They are immune to stress from this source. This trait may be taken more than once, for hardening to different experiences. Each time it is taken, the character’s maximum Moxie score is reduced by 1. Characters may not become hardened to the merging of forks. Characters that become hardened through repeat exposure (p. 214, EP) gain this trait for free.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 84
  );

  val heighenedInstinct = EPTrait(
    name = "Heightened Instinct (Uplift Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to uplifts. Though the character is fully sapient and normally socialized, the uplift process left much of their unconscious instinct intact, and they are able to synthesize a great deal of contextual information instinctively. This provides a marked advantage when dealing with confusing or tense situations, as the character’s subconscious drives their actions and responses faster than conscious decision-making. The character receives a +1 bonus to Initiative and ignores up to −10 of any modifiers for distraction when making skill tests.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 84
  );

  val indentureHolder = EPTrait(
    name = "Indenture Holder",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character currently owns the indenture contract of another ego. The person subject to indenture could be anyone from a Fall infugee to a criminal working off the damages of an assault charge. The indenture itself could have been voluntarily arranged with the character, awarded by a court, or the character could have bought it through IndEX (p. 162). The terms and conditions that will end the indenture should be clearly determined as a set credit amount, levels of favors expended, or provision of specific services. It is recommended that the contractual services are reasonably likely to be completed within 6 months. Players and gamemasters should collaborate to establish the relationship the character has with the indenture and the exact skills and reputations of the NPC. Gamemasters should be very careful that this trait is not abused, and remember that, as the indenture holder, the character also has some responsibilities to the NPC. Physical harm, mental trauma, and illegal activities could negate the terms of indenture and may have serious repercussions for the character. Should the character treat their indenture well, they could become a trusted ally, but ill treatment could make them into an enemy (p. 149, EP).",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 84
  );

  val intuitiveCrackerLevel1 = EPTrait(
    name = "Intuitive Cracker Level1",
    traitType = Positive,
    applicability = Ego,
    descr =
      "When it comes to brute-force hacking, this character has an intuitive sense for finding and deploying the right exploit tool for the job. Reduce the base timeframe for brute-force hacking (p. 257, EP) by 20% per level. Since brute-forcing a system is normally a Task Action with a 20 Action Turn timeframe, at Level 1 this timeframe is reduced to 16 Action Turns and at Level 2 it is reduced to 12 Action Turns. As usual, every 10 points of MoS on the Infosec Test may reduce this another 10%; these and other reductions (such as from Speed and extra actions; p. 96) are added together before they are applied to the timeframe.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 84
  );

  val intuitiveCrackerLevel2 = EPTrait(
    name = "Intuitive Cracker Level2",
    traitType = Positive,
    applicability = Ego,
    descr =
      "When it comes to brute-force hacking, this character has an intuitive sense for finding and deploying the right exploit tool for the job. Reduce the base timeframe for brute-force hacking (p. 257, EP) by 20% per level. Since brute-forcing a system is normally a Task Action with a 20 Action Turn timeframe, at Level 1 this timeframe is reduced to 16 Action Turns and at Level 2 it is reduced to 12 Action Turns. As usual, every 10 points of MoS on the Infosec Test may reduce this another 10%; these and other reductions (such as from Speed and extra actions; p. 96) are added together before they are applied to the timeframe.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 84
  );

  val killerInstinct = EPTrait(
    name = "Killer Instinct (Uplift Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to uplifts, and is most common in those from octopus or orca genestock. During uplift the most predatory aspect of the character’s psyche was left largely intact, and this has left them comfortable with bloodletting. The character does not take stress from committing extreme violence in situations they feel are justified and necessary, and they receive a +30 modifier on Stress Tests when witnessing extreme violence committed by others.",
    cp = 15,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val machineIntuition = EPTrait(
    name = "Machine Intuition (AGI Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to AGIs. The AGI is so attuned to dealing with machines that it has an intuitive knack for discovering the actual source of electronic or programming problems. Apply a +10 modifier to Interfacing, Hardware, or Programming Tests that involve diagnosing a technical problem or repairing it.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val malleableMindLevel1 = EPTrait(
    name = "Malleable Mind Level1",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Either through a natural quirk or psychosurgical conditioning, the character’s neural architecture is especially malleable and more readily accepts psychosurgical changes. Apply a −10 modifier per level to the character’s WIL x 3 Test when receiving voluntary psychosurgery (including neural pruning of forks). This modifier does not apply to involuntary psychosurgery.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val malleableMindLevel2 = EPTrait(
    name = "Malleable Mind Level2",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Either through a natural quirk or psychosurgical conditioning, the character’s neural architecture is especially malleable and more readily accepts psychosurgical changes. Apply a −10 modifier per level to the character’s WIL x 3 Test when receiving voluntary psychosurgery (including neural pruning of forks). This modifier does not apply to involuntary psychosurgery.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val malleableMindLevel3 = EPTrait(
    name = "Malleable Mind Level3",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Either through a natural quirk or psychosurgical conditioning, the character’s neural architecture is especially malleable and more readily accepts psychosurgical changes. Apply a −10 modifier per level to the character’s WIL x 3 Test when receiving voluntary psychosurgery (including neural pruning of forks). This modifier does not apply to involuntary psychosurgery.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val minionPartner = EPTrait(
    name = "Minion/Partner",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character has a personal employee, assistant, intern, or other form of retainer on hand to help them out. This could range from a hired bodyguard to a personal secretary to a solo socialite entourage. The relationship also does not need to be hierarchical; the character could have a partner or other collaborator. This minion/partner should be developed in conjunction between the player and gamemaster and fully drawn up using the character creation rules, with their role and motivations spelled out. While most minions are in it for the money, and most partners share an interest or goal with the character, this NPC might also be motivated by loyalty, friendship, personal career interest, fandom, or to repay a debt or obligation. For the most part, the player should be allowed to run this NPC as a secondary character. The minion/ partner is an NPC, however, and the gamemaster may take control of the NPC at any time. The relationship must be maintained, else the minion/partner will part ways with the character. The character should occasionally have to address the minion’s or partner’s own needs, which can be exploited for roleplaying and plot purposes.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val morphFeverResistance = EPTrait(
    name = "Morph Fever Resistence(Async Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to asyncs. The async does not suffer stress effects from extended periods sleeved in a pod, synth, or infomorph.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val murderSimulatorAddict = EPTrait(
    name = "Murder Simulator Addict",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Thousands of hours spent in various simulspace combat games have sharpened the character’s aim and reflexes—or they’ve simply spent an inordinate amount of time at the range practicing headshots. When making called shots in ranged combat to target an opponent’s head, this character does not suffer the usual −10 called shot modifier. They still suffer the −10 modifier for other called shots, however.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val personalConnection = EPTrait(
    name = "Personal Connection",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character has some sort of personal connection that often allows them to get one particular category of goods or services at a discount in most major habitats. Perhaps an old friend owns a body bank corp, their family is in the shipping business, they won a lifetime membership discount for a common retail chain, or someone in a criminal cartel owes them a life-long obligation. The player chooses one particular type of goods or services, such as morphs, cargo shipping, weapons, robots, software, implants, and so on. The character can usually acquire these goods or services at one cost category cheaper. This does not apply to Expensive goods. The player may use this trait as often as they wish, but the gamemaster may rule that is simply not available in certain settlements—their connection may not have a presence there or may be too strained for resources to offer the discount. Also at the gamemaster’s discretion, if the character takes actions that would substantially compromise the relationship that enables this discount, they may be temporarily unable to use this trait or may even lose it for good. This trait does not reduce the cost of goods and services acquired during character creation, nor may it be taken in conjunction with the Tenure trait.",
    cp = 15,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val phoenixLevel1 = EPTrait(
    name = "Phoenix Level1",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Transhumans who die and resleeve frequently are nicknamed “phoenixes.” Death holds little sway over these daring characters, so the trauma of lost continuity has lost much of its sting. The character gains a +20 bonus on Continuity Tests at Level 1, and a +30 bonus at Level 2.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val phoenixLevel2 = EPTrait(
    name = "Phoenix Level2",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Transhumans who die and resleeve frequently are nicknamed “phoenixes.” Death holds little sway over these daring characters, so the trauma of lost continuity has lost much of its sting. The character gains a +20 bonus on Continuity Tests at Level 1, and a +30 bonus at Level 2.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val potentMind = EPTrait(
    name = "Potent Mind (Async Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to characters that also have the Psi trait and the Psychic Stab sleight. The character’s mind is especially invasive and damaging when used against others. Inflict an extra 1d10 DV when using the Psychic Stab sleight.",
    cp = 5,
    source = Sources.transhuman,
    sourcePage = 85
  );

  val predator = EPTrait(
    name = "Predator (Uplifts Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to uplifts, and is most common in those from octopus or orca genestock. The uplift retains the thrill of the hunt from its predatory ancestry. The character receives a +10 modifier on Infiltration Tests when stalking a target and a +10 bonus on the first attack against a surprised opponent.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val skillArtifactLevel1 = EPTrait(
    name = "Skill Artifact Level1",
    traitType = Positive,
    applicability = Morph,
    descr =
      "The morph has latent skills stored in muscle memory or as higher-level data that refuses to be erased. This is especially common for exotic or alien morphs. At level 1, the morph has a single Active skill at a rating of 30 (plus aptitude) or a single Knowledge skill at 40 (plus aptitude). Level 2 adds a second skill. This new skill suppresses the ego’s pre-existing rating in that skill, similar to a skillware system. These skills cannot be changed or turned off as long as the ego is sleeved in that morph. This does not reduce the number of skills that can be used as part of a skillware system. This trait may not be bought more than once.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val skillArtifactLevel2 = EPTrait(
    name = "Skill Artifact Level2",
    traitType = Positive,
    applicability = Morph,
    descr =
      "The morph has latent skills stored in muscle memory or as higher-level data that refuses to be erased. This is especially common for exotic or alien morphs. At level 1, the morph has a single Active skill at a rating of 30 (plus aptitude) or a single Knowledge skill at 40 (plus aptitude). Level 2 adds a second skill. This new skill suppresses the ego’s pre-existing rating in that skill, similar to a skillware system. These skills cannot be changed or turned off as long as the ego is sleeved in that morph. This does not reduce the number of skills that can be used as part of a skillware system. This trait may not be bought more than once.",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val socialAnimal = EPTrait(
    name = "Social Animal (Hominid/Cetacean Uplifts Only)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait is only available to hominid and cetacean uplifts. The species of origin for these uplifts naturally forms tightly bonded social groups, and that characteristic has been enhanced along with their intelligence. Whenever characters with this background are around family or close associates, they feel a strong sense of security and purpose that grants a +10 bonus on all Stress Tests.",
    cp = 15,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val spacecraft = EPTrait(
    name = "Spacecraft",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Buying a personal spacecraft is far beyond the means of most characters. This trait, however, puts a spacecraft in the character’s hands, with certain conditions. This trait may only be taken with game-master approval and it is best only considered for campaigns where regular space travel is likely to be a major element. Somehow, the character is responsible for a bulk carrier, GEV, LLOTV, scum barge, SLOTV, or standard transport. How and why this occurred— and what strings are attached—should be worked out between the player and gamemaster. The character could be an employed pilot or captain, placed in charge of a hypercorp-owned vessel. Perhaps they are borrowing a ship belonging to a criminal cartel, hyperelite dynasty, or anarchist collective. Maybe they built the ship on their own, but placed themselves permanently in the debt of an esoteric brinker group or smuggling crew to get the materials they needed. The ship may even be stolen, with a bounty out for its recapture. Whatever the circumstances, the character should occasionally be obligated to meet or avoid the needs and demands of the ships’ rightful owners, its passengers, and its crew. For example, the character may have salvaged a derelict vessel and converted it into a refugee barge during the Fall, but must now deal with the scum squatters that have effectively taken it over. Operating a ship also comes with a host of logistical issues, from acquiring reaction mass to making deals for passengers and cargo to somehow funding an inexhaustible list of critical repairs. Keeping the ship operational could become a campaign unto itself.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val tacnetSniper = EPTrait(
    name = "Tacnet Sniper",
    traitType = Positive,
    applicability = Ego,
    descr =
      "If they have eyes on the target through an ally’s tacnet link, the character can make indirect fire attacks with only a −10 modifier rather than the usual −30. This only applies if the character uses tacnet, not through any other means.",
    cp = 30,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val tenure = EPTrait(
    name = "Tenure",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character holds a tenured professorship at a university such as Titan Autonomous University or the University of Mars. This position gives them privileged access to the university’s resources, funds, and grad assistants. The character receives a +20 bonus on Networking Tests involving the university and its staff. Additionally, favors such as goods, services, and information acquired via those university network connections are one favor level lower. These bonuses do not extend outside the university’s influence. The tenured character will, of course, be expected to occasionally produce research results or other findings or pieces of work to validate their exploitation of university resources.",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val traumaToleranceLevel1 = EPTrait(
    name = "Trauma Tolerance Level1",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This character has a higher threshold for handling traumatic experiences and is better at ignoring the effects of stress on their abilities and concentration. Level 1 allows them to ignore the −10 modifier from 1 trauma. Level 2 allows them to ignore the −10 modifiers from 2 traumas. Initiative modifiers still apply. In both cases, the character is also not immediately inflicted with any derangements as a result of these traumas. Any additional traumas affect the character as normal; postponed derangements don’t count for the purpose of raising derangement effects, but they do count towards determining when a disorder is applied. Blocking out traumatically stressful experiences is a temporary measure, however, as the experience still lingers and festers in the dark recesses of the character’s mind. A short period of time later (1d10 ÷ 2 hours, round down), the character’s facade of mental fortitude will crack",
    cp = 10,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val traumaToleranceLevel2 = EPTrait(
    name = "Trauma Tolerance Level2",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This character has a higher threshold for handling traumatic experiences and is better at ignoring the effects of stress on their abilities and concentration. Level 1 allows them to ignore the −10 modifier from 1 trauma. Level 2 allows them to ignore the −10 modifiers from 2 traumas. Initiative modifiers still apply. In both cases, the character is also not immediately inflicted with any derangements as a result of these traumas. Any additional traumas affect the character as normal; postponed derangements don’t count for the purpose of raising derangement effects, but they do count towards determining when a disorder is applied. Blocking out traumatically stressful experiences is a temporary measure, however, as the experience still lingers and festers in the dark recesses of the character’s mind. A short period of time later (1d10 ÷ 2 hours, round down), the character’s facade of mental fortitude will crack",
    cp = 20,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val untarnishedReputation = EPTrait(
    name = "Untarnished Reputation",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Through fame, a lifetime of achievement, or some lucky quirk, the character’s reputation in one particular social network is very difficult to assail. Choose one reputation network. Any test to attack the character’s reputation in that network suffers a −30 modifier, and any rep losses in that network are automatically halved. This does not apply if the character burns their own rep.",
    cp = 15,
    source = Sources.transhuman,
    sourcePage = 86
  );

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
