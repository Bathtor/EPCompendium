package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object SoftwareUpgrades {
  import MorphType._;
  import CompendiumRefImplicits._;

  val c = "Software Upgrades";

  val activeCountermeasures = Augmentation(
    name = "Active Countermeasures",
    category = c,
    appliesTo = List(Infomorph),
    descr =
      """This code helps an infomorph resist brainhacking (p. 148) by installing additional firewalls and layers of security applications within the infomorph’s digital mind. The infomorph (or anything else serve as active security for its mind-state) receives a +10 modifier on attempts to zero in on spotted intruders (p. 257, EP). 
Defensive Mode: The countermeasures may also be triggered into a more secure defensive mode with a Quick Action. While defensive mode is activated, the infomorph and its active security receive a +10 modifier on attempts to lockout intruders (p. 258, EP) or resist entrapment, puppeteering, or scorching (p. 261, EP). The defenses provided by this mode are sufficiently intensive, however, that they cause minor delays to any mesh actions undertaken by the user. As a result, the infomorph suffers a –1 reduction to Initiative.""",
    price = Cost.High,
    source = Sources.transhuman,
    sourcePage = 140
  );

  val impersonate = Augmentation(
    name = "Impersonate",
    category = c,
    appliesTo = List(Infomorph),
    descr =
      """This upgrade provides the user with a library of mannerisms, vocal patterns, and other social cues. This aids Impersonation Tests, even when communi- cating verbally or via avatars, providing a +10 bonus.
The processor in this upgrade can also help analyze a target’s mannerisms and duplicate them more effectively. To duplicate someone’s patterns, the char- acter must first observe their interactions and make a Kinesics Task Action Test with a timeframe of 1 hour. Success allows them to accumulate a sufficient quantity of data to allow this upgrade to duplicate this person’s phrasing and patterns of digital activity; increase the modifier for Impersonation Tests to +30 to impersonate the target. Note that this upgrade does not provide the character with the skills, memories, or other traits of the ego they are impersonating.
This upgrade can also be set to randomize the emotive patterns exhibited by the user, so their phrasing and mannerisms do not identify them as anyone. This applies a +30 modifier to the Deception or Impersonation rolls in Opposed Tests when someone else is trying to use Kinesics to identify the character’s true identity.""",
    price = Cost.High,
    source = Sources.transhuman,
    sourcePage = 140
  );

  val increasedSpeed = Augmentation(
    name = "Increased Speed",
    category = c,
    appliesTo = List(Infomorph),
    descr =
      """Infomorphs already have a higher innate speed than physical morphs, but some individuals need even more speed, and specially optimized code makes that possible. This upgrade increases the user’s Speed by +1. Since even basic infomorphs possess a Speed of 3, this upgrade increases the infomorph’s Speed to the maximum of 4. No other Speed modifiers may be used in conjunction with this upgrade.
This upgrade does not provide extra Speed for cyberbrained characters.""",
    price = Cost.Expensive,
    source = Sources.transhuman,
    sourcePage = 141
  );

  val mentalRepair = Augmentation(
    name = "Mental Repair",
    category = c,
    appliesTo = List(Infomorph),
    descr =
      "This upgrade continuously monitors and analyzes the user’s mental patterns, then corrects and adjusts the user’s mental processes to counter psychological stress. In effect, the character’s mind benefits from continuous unconscious psychotherapy and heals mental stress far more rapidly and easily than normal. The character automatically makes a Willpower x 3 Test once a day. Every success eliminates one point of stress. If the character has already benefited from psychotherapy (p. 215, EP) that day or any other effect that healed stress, trauma, or disorders, the test is not made. This upgrade has no effect on trauma or disorders.",
    price = Cost.High,
    source = Sources.transhuman,
    sourcePage = 141
  );

  // TODO Add LucMod to morphs
  val mentalStability = Augmentation(
    name = "Mental Stability",
    category = c,
    appliesTo = List(Infomorph),
    descr =
      "This upgrade bolsters the mind’s capacity to handle mental shocks and makes it less vulnerable to emotional distress. The user’s Lucidity increases by +5, which also increases Trauma Threshold by +1 and Insanity Rating by +10. This upgrade has no effect on the user’s WIL or their rolls to resist stress. The user is no more likely than before to be able to resist mental stress. However, they can now handle more mental stress before suffering any form of instability.",
    price = Cost.Expensive,
    source = Sources.transhuman,
    sourcePage = 141
  );

  val panopticon = Augmentation(
    name = "Panopticon",
    category = c,
    appliesTo = List(Infomorph),
    descr =
      """The ubiquity of sensor system found in almost all habitats and spaceships means that any trans- human could theoretically monitor a dozen or more different locations to see what is occurring there. Unfortunately, most transhuman minds are simply not adapted to process that much data or to deal with so many different sources of information all at once. As a result, even infomorphs must normally switch their attention between the various locations and vantage points they are observing. Watching multiple views of a single location is no problem and usually provides the character with between +10 to +30 to their Perception Tests. Viewing different loca- tions at one time, however, is far more difficult and taxing, requiring a Detailed Perception Quick Action (p. 190, EP) for each. Alternatively, the character can passively observe many locations/sensor feeds with automatic Basic Perception (p. 190, EP), but this imposes a –20 penalty to all of these Perception Tests due to distraction.
The panopticon upgrade mitigates this limitation with sophisticated algorithms that help the ego analyze and process sensory input. The infomorph can use Detailed Perception on three locations/ sensor feeds at once (increase this to 5 locations if the character also has multi-tasking) without any penalty. Alternatively, the infomorph only suffers a –10 distraction modifier when using Basic Perception to view multiple locations and feeds at once.
This upgrade is common among habitat cyber- brains, as each multi-tasking module beyond the first allows Detailed Perception to be used on another 2 areas at once.""",
    price = Cost.High,
    source = Sources.transhuman,
    sourcePage = 141
  );

  val list: List[Augmentation] = Macros.memberList[Augmentation];
}
