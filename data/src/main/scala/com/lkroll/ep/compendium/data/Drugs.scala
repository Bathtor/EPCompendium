package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros
import com.lkroll.ep.compendium.Cost.Moderate
import com.lkroll.ep.compendium.SubstanceClassification.Biologicals
import com.lkroll.ep.compendium.ApplicationMethod.Inhalation
import com.lkroll.ep.compendium.ApplicationMethod.Injection
import com.lkroll.ep.compendium.ApplicationMethod.Oral
import com.lkroll.ep.compendium.AddictionType.Physical
import com.lkroll.ep.compendium.SubstanceClassification.Biologicals
import com.lkroll.ep.compendium.ApplicationMethod.Inhalation
import com.lkroll.ep.compendium.ApplicationMethod.Inhalation
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.ApplicationMethod.Dermal
import com.lkroll.ep.compendium.AddictionType.Physical

object Drugs {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Drugs";

  val drive = Substance(
    name = "Drive",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = (Mental, 0),
    onset = 20.mins,
    duration = 8.hours,
    effects = List(COG + 5),
    descr = "This nootropic speeds up left-right brain hemisphere communication, stimulates idea production, and improves concentration, with no usual side effects. Users receive a +5 bonus to COG while the drug lasts.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 318);

  val klar = Substance(
    name = "Klar",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = (Mental, 0),
    onset = 20.mins,
    duration = 8.hours,
    effects = List(INT + 5),
    descr = "Klar boosts alertness and enhances clarity and perception. Users report a feeling of being “elevated” to a higher level. They receive +5 INT while the drug lasts.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 318);

  val neem = Substance(
    name = "Neem",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = (Mental, 0),
    onset = 20.mins,
    duration = 12.hours,
    effects = List(FreeForm("+20 to COG Tests to recall information learned while on Neem")),
    descr = "Neem is a mnemonic drug that works by “tagging” experiences and mental input with a set of unique sensations that contribute to the formation of state-based memories. Neem gummy chews come in a variety of fruit flavors shaped like extinct old Earth animals. Neem gives characters a +20 bonus on COG Tests to recall information they learned while on Neem (see Memorizing and Remembering, p. 175). The drawback to Neem is that memories they accumulate while under the drug’s influence have no emotional association. For example, a character who witnessed something horrible happening to a friend or who had a fight with a romantic partner while on Neem would feel no emotional connection whatsoever to what happened.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 318);

  val bringIt = Substance(
    name = "BringIt",
    category = c,
    classification = Biologicals,
    application = List(Inhalation, Injection, Oral),
    addiction = (Physical, 10),
    onset = 1.mins,
    duration = 15.mins,
    effects = List(FreeForm("taunt WILLx3 on 3 metter round on you or ally within 1m"), FreeForm("-20 on social skill tests")),
    descr = "In some respects more a social than a combat drug, BringIt stimulates massive bursts of aggression pheromones designed to make the user the center of attention in a fight. In combat, opponents within 3 meters of the character not already in unarmed or melee combat with another character must pass a WIL × 3 Test or attack the character using BringIt. The nature of airborne pheromones is imprecise, however, so if the character using BringIt is within 1 meter of another character hostile to the character affected, the affected character may opt to attack the proximate character instead of the BringIt user. Characters using this drug suffer a –20 modifier on social skill tests.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 318);

  val grin = Substance(
    name = "Grin",
    category = c,
    classification = Chemicals,
    application = List(Inhalation, Injection, Oral),
    addiction = (Physical, -10),
    onset = 3.turns,
    duration = 3.hours,
    effects = List(IgnoreWounds(2), SkillMod(skill = "Perception", mod = (-10))),
    descr = "Grin is an effective opiate and pain suppressant. Users may ignore the modifiers from 2 wounds (not cumulative with similar effects) and in fact may not even be aware they are injured. Grin users suffer from tunnel vision, however, and so suffer a –10 modifier on Perception Tests.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 319);

  val kick = Substance(
    name = "Kick",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = (Physical, -10),
    onset = 3.turns,
    duration = 2.hours,
    effects = List(REF + 10, SpeedMod(1), FreeForm("WIL × 2 Test or react to unexpected noises or surprises"), FreeForm("Long-term -5 COG")),
    descr = "Kick is a strong stimulant that increases the user’s response time and puts them on edge. The character gains +10 REF and +1 Speed for the duration of the drug. Characters under the influence of Kick are twitchy, however, reacting in a jumpy, cat-like fashion to sudden or unexpected stimuli. At the gamemaster’s discretion, they must make a WIL × 2 Test or react without thinking towards unexpected noises or other surprises. Long-term users suffer –5 COO.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 319);

  val mrdr = Substance(
    name = "MRDR",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = (Physical, -10),
    onset = 20.mins,
    duration = 1.hours,
    effects = List(SOM + 10, SpeedMod(1), DurMod(10), IgnoreWounds(1), FreeForm("Long-term –5 SOM")),
    descr = "MRDR is a straightforward and brutal combat drug. It increases pain tolerance, speed, and strength. The character receives +10 SOM, +1 Speed, +10 Durability, and may ignore the modifier from one wound. Any damage incurred while under the effects of the drug is taken from the bonus Durability first. MRDR users are easily identifiable by the broken blood vessels in their eyes, tense posture, and visible tension in the muscles of the face, arms, and legs. Long-term users suffer –5 SOM.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 319);

  val phlo = Substance(
    name = "Phlo",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = (Physical, -10),
    onset = 20.mins,
    duration = 1.hours,
    effects = List(COO + 5, SkillMod(skill = "Perception", mod = 10), FreeForm("-10 to social skills (goading)")),
    descr = "Phlo increases alertness and coordination, making the user more graceful and nimble in a fray. The character gains +5 COO and +10 on Perception Tests for the duration of the drug. Everything feels possible to a character on Phlo, and so they are vul- nerable to being goaded into actions that might be foolish or dangerous (apply a –10 modifier to appro- priate Social Skill Tests).",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 319);

  val bananasFuriosas = Substance(
    name = "BananasFuriosas",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = None,
    onset = 20.mins,
    duration = 1.days,
    effects = List(),
    descr = "This drug reverses some of the effects of de-ionizing radiation on the cells of the body. Although a pill form is available, it most commonly comes in large bunches of bright orange-red bananas. Bananas reduce the severity of a radiation dosage (gamemaster determines effect).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 319);

  val comfurt = Substance(
    name = "Comfurt",
    category = c,
    classification = Biologicals,
    application = Oral,
    addiction = (Mental, -10),
    onset = 20.mins,
    duration = 12.hours,
    effects = List(LucMod(5), IgnoreTraumas(1)),
    descr = "This tasty yogurt treat blocks stress hormones, stabilizes mood, and relieves anxiety, allowing them to ignore the effect of 1 trauma and temporarily boosting Lucidity by +5. Any stress suffered while the drug is in effect is taken from the bonus Lucidity first. Comfurt also provides a +10 bonus when resisting attempts to manipulate the user’s emotions. Excessive use of Comfurt can lead to chronic itchiness caused by histamine release.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 319);

  val buzz = Substance(
    name = "Buzz",
    category = c,
    classification = Chemicals,
    application = List(Inhalation, Oral),
    addiction = (Mental, 0),
    onset = 1.hours,
    duration = 36.hours,
    effects = List(LucMod(5), IgnoreTraumas(1)),
    descr = "This gene-modified variant of BZ is an odorless,invisible,extremely powerful hallucinogen. Users or affected characters will undergo extremely realistic hallucinations for the duration, and may even ``share'' hallucinations with other affected characters. Characters will suffer a –30 modifier to any tests to remember what occurred while under the influence.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 320);

  val monoNoAware = Substance(
    name = "Mono No Aware",
    category = c,
    classification = Chemicals,
    application = Oral,
    addiction = (Mental, -10),
    onset = 20.mins,
    duration = 8.hours,
    effects = List(FreeForm("+10 on Art and Sense tests")),
    descr = "Taken from the Japanese term for sadness at the ephemerality of worldly things, this drug, typically ingested as a tea, is a depressant that induces a meditative state. Mono No Aware gives the character a +10 bonus on Art and Sense Tests. With frequent use, Mono No Aware reacts with pigments in the skin to create a pallor with a slight bluish tinge, even in darker-skinned morphs.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 320);

  val orbitalHash = Substance(
    name = "Orbital Hash",
    category = c,
    classification = Chemicals,
    application = Inhalation,
    addiction = (Mental, 0),
    onset = 3.mins,
    duration = 3.hours,
    effects = List(FreeForm("+10 on Art and Sense tests")),
    descr = "Good ol’ reefer—but grown in space using powerful lighting and post-singularity hydroponics. Because space is at a premium in habitats and scum barges, blocks of hashish are the preferred mode of transport and delivery. However, for the wealthy and on planets, buds in leaf form are not uncommon. Hash allows the character to ignore the effects of 1 trauma, but inflicts a –10 penalty on all memory-related tests and Knowledge Skill Tests. Hash users exhibit bloodshot eyes, lethargic behaviors, and the munchies.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 320);

  val alpha = Substance(
    name = "Alpha",
    category = c,
    classification = Biologicals,
    application = Inhalation,
    addiction = (Mental, -10),
    onset = 1.mins,
    duration = 2.hours,
    effects = List(SkillMod(skill = "Intimidation", mod = 20), SkillMod(skill = "Persuasion", mod = 20), FreeForm("+10 on Networking Tests where attitude is a factor"), FreeForm("No sleep 4days/4h"), FreeForm("–10 on COG  tests related to memory and coherent or logical thinkin")),
    descr = "Alpha is a more subtle version of BringIt, popular with hypercorp execs, street thugs, and anyone else who wants to come across as a domineering asshole. The pharm designer who invented it had a retro sensibility (and maybe a sick sense of humor); Alpha is typically synthesized as a sparkling white powder designed to be snorted. Alpha stimulates production of threat pheromones, but less bluntly than BringIt. Alpha imparts confidence, a feeling of power, and alertness. Users can function without sleep for 4 days, after which point they need to catch up with at least 4 hours of sleep (remember morphs with basic biomods require less sleep). Dosed characters receive a +20 modifier on Intimidation Tests and +10 on Persuasion and Networking Tests where attitude is a factor (gamemaster discretion). These bonuses only apply to characters within 2 meters of the Alpha user. On the downside, alpha users are impatient, unfocused assholes. At the gamemaster’s discretion, Social skill modifiers may be reversed to penalties with certain types of people. Additionally, Alpha users suffer –10 on all COG skill tests related to memory and coherent or logical thinking. Long-term users may suffer the COG penalty even when not on the drug; on it, they may be worse.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 320);

  val hither = Substance(
    name = "Hither",
    category = c,
    classification = Biologicals,
    application = Dermal,
    addiction = (Physical, -10),
    onset = 1.mins,
    duration = 6.hours,
    effects = List(FreeForm("+10 bonus on Persuasion, Deception, Impersonate, and Networking Tests(seduce based)")),
    descr = "Want to ooze sexy like a pleasure morph on a hot tin roof? For those desiring that slinky je-ne-sais-quoi, Hither is the tool. Hither is a clear, slippery gel, sometimes with a faint, musky, floral scent. Hither is applied to parts of the body with large concentrations of sweat glands, where the skin quickly absorbs it. Hither is a mild euphoriant, imparting a feeling of confidence and you-know-you-want-it-ness to the user. It also stimulates abundant production of lust pheromones. The character gains a +10 bonus on Persuasion Tests against targets who are possible to seduce. At the gamemaster’s discretion, this extends to Deception, Impersonate, and Networking Tests.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 320);

  val juice = Substance(
    name = "Juice",
    category = c,
    classification = Chemicals,
    application = List(Oral, Inhalation),
    addiction = (Mental, 0),
    onset = 20.mins,
    duration = 8.hours,
    effects = List(FreeForm("+30 bonus against fear or attempts to manipulate their emotions in a negative direction")),
    descr = "This potent anti-depressant makes it almost impossible to have bad feelings or negative thoughts. The character is unnaturally happy—often irritatingly or strangely so. The character receives a +30 bonus against fear or attempts to manipulate their emotions in a negative direction, but is also likely to act inappropriately, like giggling over the massive amount of spilled blood or cheerfully changing the subject to inane topics when someone else is freaking out.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 320);

  // Panopticon
  val hydra = Substance(
    name = "Hydra",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 20.mins,
    duration = 3.hours,
    effects = List.empty,
    descr = "Hydra only affects neo-octopi physiology. Specifically, it provides a euphoric sense of detachment to the ego while also boosting the autonomous activity and unconscious reflexiveness of neo-octopi arms, which already tend to act on their own accord. Though it does not (usually) impact the ego’s control over their arms, any arms that are idle simply do their own thing. The gamemaster decides if and when these arms act and what they do (or, for more fun, you can assign an arm to each other player). The arms mostly act reflex- ively—recoiling from danger, grasping on to nearby objects—but sometimes act as if with intelligent direc- tion, striking opponents, snatching forgotten objects, opening doors, etc. The arms use the octomorph’s Initiative and skills. ",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 151);

  val kong = Substance(
    name = "Kong",
    category = c,
    classification = Chemicals,
    application = List(Inhalation, Injection, Oral),
    addiction = (Physical, -10),
    onset = 3.turns,
    duration = 1.hours,
    effects = List(IgnoreWounds(1), SOM + 5, INT - 5, FreeForm("+10 bonus on melee attacks")),
    descr = "Kong is a potent drug cocktail that boosts the aggressiveness of non-human primates. Uplifts and smart animals under the influence of kong must make a WIL x 3 Test or automatically attack anyone that exhibits threatening behavior. Kong users can ignore the effects of 1 wound, receive a +5 SOM bonus and a +10 bonus on melee attacks, but suffer a −5 INT modifier. Once engaged in violence, the affected primate must make a WIL x 3 Test to not automatically attack the next nearest target. Attempts to control primates under the influence of kong suffer a −30 modifier to their Animal Handling Tests. Once the effects of this drug wear off, the user suffers −5 SOM for an equivalent duration.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 151);

  val kongAftereffect = Substance(
    name = "Kong Aftereffect",
    category = c,
    classification = Chemicals,
    application = List(Inhalation, Injection, Oral),
    addiction = (Physical, -10),
    onset = 3.turns,
    duration = 1.hours,
    effects = List(SOM - 5),
    descr = "Kong is a potent drug cocktail that boosts the aggressiveness of non-human primates. Uplifts and smart animals under the influence of kong must make a WIL x 3 Test or automatically attack anyone that exhibits threatening behavior. Kong users can ignore the effects of 1 wound, receive a +5 SOM bonus and a +10 bonus on melee attacks, but suffer a −5 INT modifier. Once engaged in violence, the affected primate must make a WIL x 3 Test to not automatically attack the next nearest target. Attempts to control primates under the influence of kong suffer a −30 modifier to their Animal Handling Tests. Once the effects of this drug wear off, the user suffers −5 SOM for an equivalent duration.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 151);

  val raptor = Substance(
    name = "Raptor",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 20.mins,
    duration = 1.hours,
    effects = List(SOM + 5, FreeForm("+20 modifier to Flight Tests to increase movement")),
    descr = "Raptor is a strength-boosting drug that only affects neo-avians. It increases their wing power and speed, as well as boosting the grip of their talons. Apply a +5 SOM bonus and a +20 modifier to Flight Tests to increase movement (like Sprinting, p. 190, EP). ",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 152);

  val staste = Substance(
    name = "Staste",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, 10),
    onset = 20.mins,
    duration = 3.hours,
    effects = List(FreeForm("+30 modifier to Perception, Investigation, or similar skill tests based on smell.")),
    descr = "This drug increases an octomorph brain’s ability to process sensory input from the chemoreceptors in their suckers. This gives an octomorph an enhanced ability to “taste” things akin to a bloodhound’s sense of smell, only tactile-based. Apply a +30 modifier to Perception, Investigation, or similar skill tests based on smell.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 152);

  // Firewall
  val greyRanks = Substance(
    name = "Grey Ranks",
    category = c,
    classification = Chemicals, // Narcoalgorithm
    application = List(Oral), // TODO Code
    addiction = (Mental, 10),
    onset = 1.hours,
    duration = 12.hours,
    effects = List(FreeForm("No memory retention during the period.")),
    descr = "Grey ranks is a long-term memory suppression drug also available as a narcoalgorithm. It disrupts the user’s memory formation processes without otherwise affecting their mental faculties. The Titanian intelligence services uses it on both field agents and in so-called “zero-retention briefings.”",
    price = Cost.Moderate,
    source = Sources.firewall,
    sourcePage = 175);

  val laughingPoliceman = Substance(
    name = "Laughing Policeman",
    category = c,
    classification = Chemicals,
    application = List(Injection),
    addiction = (Physical, 10),
    onset = 20.mins,
    duration = 4.hours,
    effects = List(FreeForm("+20 to Deception and Persuasion test AGAINST you")),
    descr = "This drug is a potent euphoriant used by Titanian intelligence for interrogations. It stimulates feelings of trust and well-being in the user, giving their interrogators a +20 bonus on Deception and Persuasion Tests to extract information.",
    price = Cost.Moderate,
    source = Sources.firewall,
    sourcePage = 175);

  // Homebrew
  val sweetbo = Substance(
    name = "Sweet Bo",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 1.mins,
    duration = 3.hours,
    effects = List(SOM + 5, WIL - 5, FreeForm("Massive Libido Boost")),
    descr = "Sweet Bo is a rather uncommon drug cocktail that boosts the natural libido of non-human primates, especially Bonobos. Primate Uplifts, Hominids/Humans, and smart animals under the influence of Sweet Bo must make a WIL x 3 Test or automatically attempt to have sex with the next best compatible individual, sexual preferences not withstanding. Sweet Bo users receive a +5 SOM bonus (extra stamina, yay!), but suffer a −5 WIL modifier (no self-control). Attempts to control primates under the influence of Sweet Bo suffer a −30 modifier to their Animal Handling Tests. Once the effects of this drug wear off, the user suffers −5 SOM for an equivalent duration.",
    price = Cost.Moderate,
    source = "Homebrew",
    sourcePage = 0);

  val sweetboAftereffect = Substance(
    name = "Sweet Bo Aftereffect",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 1.mins,
    duration = 3.hours,
    effects = List(SOM - 5),
    descr = "Sweet Bo is a rather uncommon drug cocktail that boosts the natural libido of non-human primates, especially Bonobos. Primate Uplifts, Hominids/Humans, and smart animals under the influence of Sweet Bo must make a WIL x 3 Test or automatically attempt to have sex with the next best compatible individual, sexual preferences not withstanding. Sweet Bo users receive a +5 SOM bonus (extra stamina, yay!), but suffer a −5 WIL modifier (no self-control). Attempts to control primates under the influence of Sweet Bo suffer a −30 modifier to their Animal Handling Tests. Once the effects of this drug wear off, the user suffers −5 SOM for an equivalent duration.",
    price = Cost.Moderate,
    source = "Homebrew",
    sourcePage = 0);

  val flyingWallabyPrimary = Substance(
    name = "Flying Wallaby (Primary Effect)",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 1.mins,
    duration = 2.hours,
    effects = List(REF + 10, SkillMod(skill = "Climbing", mod = 20), SkillMod(skill = "Freerunning", mod = 20), FreeForm("+20 to SOMx3 tests for jumping")),
    descr = """Flying Wallaby is a strange cocktail mixing effects of Opium with those of Kick, for a truly fascinating result. After 1 minute users suddenly become increasingly nervous, bordering on hyperactive. Many experience the sudden urge to jump, climb, and dance in a barely controlled manner. Characters under the influence of Flying Wallaby are just as twitchy as Kick users, though, and react in a jumpy fashion to sudden or unexpected stimuli. At the gamemaster's discretion, they must make a WIL x 2 Test or react without thinking towards unexpected noises or other surprises.
    After about 2 hours the effects suddenly reverse and a deep fatigue and relaxation sets in. At this point the user is hard pressed to move or react to anything, but nothing really bothers them either.""",
    price = Cost.Moderate,
    source = "Homebrew",
    sourcePage = 0);

  val flyingWallabySecondary = Substance(
    name = "Flying Wallaby (Secondary Effect)",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 2.hours,
    duration = 6.hours,
    effects = List(REF - 5, SOM - 5, LucMod(10), IgnoreTraumas(2)),
    descr = """Flying Wallaby is a strange cocktail mixing effects of Opium with those of Kick, for a truly fascinating result. After 1 minute users suddenly become increasingly nervous, bordering on hyperactive. Many experience the sudden urge to jump, climb, and dance in a barely controlled manner. Characters under the influence of Flying Wallaby are just as twitchy as Kick users, though, and react in a jumpy fashion to sudden or unexpected stimuli. At the gamemaster's discretion, they must make a WIL x 2 Test or react without thinking towards unexpected noises or other surprises.
    After about 2 hours the effects suddenly reverse and a deep fatigue and relaxation sets in. At this point the user is hard pressed to move or react to anything, but nothing really bothers them either. This effect slowly tapers off over the next 6 hours.""",
    price = Cost.Low,
    source = "Homebrew",
    sourcePage = 0);

  val list: List[Substance] = Macros.memberList[Substance];
}
