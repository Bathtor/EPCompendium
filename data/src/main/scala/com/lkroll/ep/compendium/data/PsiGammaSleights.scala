package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object PsiGammaSleights {
  import PsiType.{Active, Passive};
  import PsiRange.{Close, Self, Touch};
  import PsiDuration.{Constant, Instant, Sustained, Temp};
  import PsiSkill._;
  import MorphImplicits.{int2opt, str2opt};

  val st = SleightType.Gamma;

  val alienation = PsiSleight(
    name = "Alienation",
    sleightType = st,
    psiType =
      Active(action = "Complex", range = Touch, duration = Temp("Action Turns"), strainMod = 0, skill = psiAssault),
    descr =
      "Alienation is an offensive sleight that create a sense of disconnection between an ego and its morph—similar to that experienced when resleeved into a new body. The ego finds their body cumbersome, strange, and alien, almost like they are a prisoner within it. If the async beats the target in an Opposed Test, treat the result as a failed Integration Test (p. 271) for the target. This effect lasts for the sleight’s duration.",
    source = Sources.ep,
    sourcePage = 226
  );

  val charisma = PsiSleight(
    name = "Charisma",
    sleightType = st,
    psiType = Active(action = "Quick", range = Touch, duration = Temp("Minutes"), strainMod = 1, skill = control),
    descr =
      "The async uses this sleight to influence the target’s mind on a subconscious level so that the target perceives them to be charming, magnetic, and persuasive. If the async beats the target in an Opposed Test, they gain a +30 modifier on all subsequent Social Skill Tests for the chosen duration.",
    source = Sources.ep,
    sourcePage = 226
  );

  val cloudMemory = PsiSleight(
    name = "Cloud Memory",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Temp("Minutes"), strainMod = -1, skill = control),
    descr =
      "Cloud Memory allows the async to temporarily disrupt the target’s ability to form long-term memo- ries. If the async wins the Opposed Test, the target’s memory-saving ability is negated for the duration. The target will retain short-term memories during this time, but will soon forget anything that occurred while this sleight was in effect.",
    source = Sources.ep,
    sourcePage = 226
  );

  val deepScan = PsiSleight(
    name = "Deep Scan",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Sustained, strainMod = +1, skill = sense),
    descr =
      "Deep Scan is a more intrusive version of Thought Browse (p. 228), made to extract information from the targeted individual. If the Opposed Test succeeds, the async telepathically invades the target’s mind and can probe it for information. For every 10 full points of MoS the async achieves on their test, they retrieve one piece of information. Each item takes one full Action Turn to retrieve, during which the sleight must be sustained. The target is aware of this mental probing, though they will not know what information the async acquired.",
    source = Sources.ep,
    sourcePage = 226
  );

  val driveEmotion = PsiSleight(
    name = "Drive Emotion",
    sleightType = st,
    psiType =
      Active(action = "Complex", range = Touch, duration = Temp("Action Turns"), strainMod = -1, skill = control),
    descr =
      "This sleight allows the async to stimulate cortical areas of the target’s brain related to emotion. This allows the async to induce, amplify, or tone down specific emotions, thereby manipulating the target. If the async beats the target in an Opposed Test, they will act in accordance with the emotion for the duration and under certain circumstances may suffer from certain penalties (up to +/–30), as determined by the gamemaster. For example, an async might receive a +30 Intimidation Test modifier against a target imbued withe fear.",
    source = Sources.ep,
    sourcePage = 226
  );

  val egoSense = PsiSleight(
    name = "Ego Sense",
    sleightType = st,
    psiType = Active(action = "Complex", range = Close, duration = Temp("Action Turns"), strainMod = -1, skill = sense),
    descr =
      "Ego Sense can be used to detect the presence and location of other sentient and biological life forms (i.e., egos) within the async’s range. To detect these life forms, the async makes a single Sense Test, opposed by each life form within range. The async may suffer a modifier for detecting small animals and insects, similar to the modifier applied for targeting them in ranged combat (Combat Modifiers table, p. 193); likewise, a modifier for detecting larger life forms may also be applied. If successful, the async detects that the life form is nearby. Every 10 full points of MoS will ascertain another piece of information regarding the detected life: direction from async, approximate size, type of creature, distance from async, etc. The async will know if the target moves, if they do so during the sleight’s duration.",
    source = Sources.ep,
    sourcePage = 226
  );

  val empathicScan = PsiSleight(
    name = "Empathic Scan",
    sleightType = st,
    psiType = Active(action = "Quick", range = Close, duration = Sustained, strainMod = -2, skill = sense),
    descr =
      "Empathic Scan enables the async to sense the target's base emotions. If the async wins the Opposed Test, they intuitively feel the target’s current emotional state for as long as the sleight is sustained. At the gamemaster’s discretion, this knowledge may provide a modifier (up to +30) for certain Social skill tests.",
    source = Sources.ep,
    sourcePage = 226
  );

  val implantMemory = PsiSleight(
    name = "Implant Memory",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Instant, strainMod = 0, skill = control),
    descr =
      "An async using this sleight can implant a memory of up to an hour’s length inside the target’s mind. This memory very obviously does not belong to the target—there is no way they will confuse it for one of their own. The intent is not to fake memories, but to place one of the async’s memories in the target’s mind so that the target can access it just like any other memory. This can be useful for “archiving” important data with an ally, providing a literal alternate perspective, or simply making a “data dump” for the target to peruse. Implant Memory requires an Opposed Test against unwilling participants. At the gamemaster’s discretion, particularly traumatic memories might inflict mental stress on the recipient (p. 214).",
    source = Sources.ep,
    sourcePage = 226
  );

  val implantSkill = PsiSleight(
    name = "Implant Skill",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Temp("Action Turns"), strainMod = 0, skill = control),
    descr =
      "Similar to Implant Memory, this sleight allows the async to impart some of their expertise and implant it into the target’s mind. For the duration of the sleight, the target benefits when using that skill. If the async’s skill is between 31 and 60, the target receives a +10 bonus. If the async’s skill is 61+, the target receives a +20 bonus. Implant Skill requires an Opposed Test against unwilling participants. In some cases, the target has been known to use the skill with the async’s flair and mannerisms.",
    source = Sources.ep,
    sourcePage = 227
  );

  val mimic = PsiSleight(
    name = "Mimic (Sleight)",
    sleightType = st,
    psiType = Active(action = "Quick", range = Close, duration = Instant, strainMod = 0, skill = sense),
    descr =
      "In a setting where changing your body and face is not unusual, people learn to recognize habits and personality quirks more often. The async must use this sleight on a target and succeed in a Success Test. If successful, the async acquires an “imprint” of the target’s mind that they can take advantage of when impersonating that ego. The async then receives a +30 bonus on Impersonation Tests when mimicking the target’s behavior and social cues.",
    source = Sources.ep,
    sourcePage = 227
  );

  val mindlink = PsiSleight(
    name = "Mindlink",
    sleightType = st,
    psiType = Active(action = "Quick", range = Touch, duration = Sustained, strainMod = 0, skill = control),
    descr =
      """Mindlink allows two-way mental communication with a target. This may be used on more than one target simultaneously, in which case the async can act as a telepathic “server” so that everyone mindlinked with the async may also telepathically communicate with each other (via the async, however, who overhears). Language is still a factor in mindlinked communications, but this barrier may be overcome by transmitting sounds, images, emotions, and other sensations. Mindlink requires an Opposed Test against unwilling participants.
---
Strain Mod increases by +1 for every target after the first.""",
    source = Sources.ep,
    sourcePage = 227
  );

  val omniAwareness = PsiSleight(
    name = "Omni Awareness",
    sleightType = st,
    psiType = Active(action = "Quick", range = Close, duration = Temp("Minutes"), strainMod = -1, skill = sense),
    descr =
      "An async with Omni Awareness is hypersensitive to other biological life that is observing them. During this sleight’s duration, the async makes a Sense Test that is opposed by any life that has focused their attention on them within the sleight’s range; if successful, the async knows they are being watched, but not by whom or what. It does, however, apply a +30 Perception bonus to spot the observer. This sleight does not register partial or fleeting attention, it only notices targets who are actively observing (even if they are concealing their observation). This sleight is effective in spotting a tail, as well as finding potential mates in a bar.",
    source = Sources.ep,
    sourcePage = 227
  );

  val penetration = PsiSleight(
    name = "Penetration",
    sleightType = st,
    psiType = Active(action = "Quick", range = Touch, duration = Instant, strainMod = 1, skill = psiAssault),
    descr =
      """Penetration is a sleight that works in conjunction with any offensive sleight that involves the Psi Assault skill. It allows the async to penetrate the Psi Shield of an opponent by concentrating their psi attack. Every point of Armor Penetration applied to a psi attack inflicts 1 point of strain. The maximum AP that may be applied equals the async’s Psi Assault skill divided by 10 (round down).
---
The Strain Mod is 1/AP point.
""",
    source = Sources.ep,
    sourcePage = 228
  );

  val psiShield = PsiSleight(
    name = "Psi Shield",
    sleightType = st,
    psiType = Passive(),
    descr =
      "Psi Shield bolsters the async’s mind to psi attack and manipulation. If the async is hit by a psi attack, they receive WIL ÷ 5 (round up) points of armor, reducing the amount of damage inflicted. They also receive a +10 modifier when resisting any other sleights.",
    source = Sources.ep,
    sourcePage = 228
  );

  val psychicStab = PsiSleight(
    name = "Psychic Stab",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Instant, strainMod = 0, skill = psiAssault),
    descr =
      "Psychic Stab is an offensive sleight that seeks to inflict physical damage on the target’s brain and nervous system. Each successful attack inflicts 1d10 + (WIL ÷ 10, round up) damage. Increase the damage by +5 if an Excellent Success (MoS of 30+) is scored.",
    source = Sources.ep,
    sourcePage = 228
  );

  val scramble = PsiSleight(
    name = "Scramble",
    sleightType = st,
    psiType = Passive(),
    descr =
      "Scramble allows the async using the sleight to hide from another async using the Ego Sense or Omni Awareness sleights. Apply a +30 modifier to the defending async’s Opposed Test.",
    source = Sources.ep,
    sourcePage = 228
  );

  val senseBlock = PsiSleight(
    name = "Sense Block",
    sleightType = st,
    psiType =
      Active(action = "Complex", range = Touch, duration = Temp("Action Turns"), strainMod = -1, skill = psiAssault),
    descr =
      "Sense Block disables and short circuits one of the target’s sensory cortices (chosen by the async), interfering with and possibly negating a specific source of sensory input for the chosen duration. If the async beats the target in the Opposed Test, the target suffers a –30 modifier to Perception Tests with that sense (doubled to –60 if the async scores an Excellent Success).",
    source = Sources.ep,
    sourcePage = 228
  );

  val spam = PsiSleight(
    name = "Spam",
    sleightType = st,
    psiType =
      Active(action = "Complex", range = Touch, duration = Temp("Action Turns"), strainMod = 0, skill = psiAssault),
    descr =
      "This sleight allows the async to overload and flood one of the target’s sensory cortices (chosen by the async), spamming them with confusing and distracting sensory input and thereby impairing them. If the async wins the Opposed Test, the target suffers a –10 modifier to all tests the duration of the sleight (doubled to –20 if the async scores an Excellent Success).",
    source = Sources.ep,
    sourcePage = 228
  );

  val static = PsiSleight(
    name = "Static",
    sleightType = st,
    psiType = Active(action = "Complex", range = Close, duration = Sustained, strainMod = 0, skill = None),
    descr =
      "The async generates an anti-psi jamming field, impeding any use of ranged sleights within their range. All such ranged sleights suffer a –30 modifier. This sleight has no effect on self or touch-range sleights.",
    source = Sources.ep,
    sourcePage = 228
  );

  val subliminal = PsiSleight(
    name = "Subliminal",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Instant, strainMod = +2, skill = control),
    descr =
      "The Subliminal sleight allows the async to influence another person by implementing a single post-hypnotic suggestion into the mind of the target. If the async wins the Opposed Test, the recipient will carry out this suggestion as if it was their own idea. Implanted suggestions must be short and simple; the gamemaster may require suggestions be encompassed in a short sentence (for example: “open the airlock,” or “hand over the weapon”). The target may receive a bonus for resisting suggestions that are immediately life threatening (“jump off the bridge”) or that violate their motivations or personal strictures. Suggestions may be implanted with a short trigger condition (“when the alarm goes off, ignore it”).",
    source = Sources.ep,
    sourcePage = 228
  );

  val thoughtBrowse = PsiSleight(
    name = "Thought Browse",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Sustained, strainMod = -1, skill = sense),
    descr =
      "Thought Browse is a less-intrusive form of mind reading that scans the target’s surface thoughts for certain “keywords” like a particular word, phrase, sound, or image chosen by the async. Rather than digging through the target’s ego as with the Deep Scan sleight, Thought Browse merely verifies whether a target has a particular person, place, event, or thing in mind, which can be used by a savvy investigator to draw conclusions without the need to invade the mind directly. Thought Browse may be sustained, allowing the async to continue scanning the target’s thoughts over time. The async must beat the target in an Opposed Test for each scanned item.",
    source = Sources.ep,
    sourcePage = 228
  );

  /*
   * Transhuman
   */

  val aphasicTouch = PsiSleight(
    name = "Aphasic Touch",
    sleightType = st,
    psiType = Active(action = "Complex", range = Touch, duration = Temp("Minutes"), strainMod = 0, skill = control),
    descr =
      "With a touch attack, the async temporarily blocks or scrambles the language-processing centers in the target’s brain. For the duration of the effect, the target cannot speak, initiate mesh actions, or otherwise communicate or read.",
    source = Sources.transhuman,
    sourcePage = 154
  );

  val senseInfection = PsiSleight(
    name = "Sense Infection",
    sleightType = st,
    psiType = Active(action = "Complex", range = Close, duration = Instant, strainMod = -1, skill = sense),
    descr =
      "The async may determine whether a target is infected with a biological nanovirus or nanoplague strain of the exsurgent virus with a Sense Test. If successful, the character automatically knows if the target is an async. Other strains of the virus may, at the gamemaster’s discretion, provide a foreboding of their modus operandi. In no case is the name of the strain revealed (strains are named by Firewall, not by themselves), but research or inquiries with the Eye might allow the character to identify the feeling they get with a known, named strain.",
    source = Sources.transhuman,
    sourcePage = 154
  );

  val list: List[PsiSleight] = Macros.memberList[PsiSleight];
}
