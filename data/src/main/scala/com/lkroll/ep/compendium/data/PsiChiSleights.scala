package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object PsiChiSleights {
  import PsiType.{Active, Passive};
  import PsiRange.{Close, Self, Touch};
  import PsiDuration.{Constant, Instant, Sustained, Temp};
  import PsiSkill._;
  import MorphImplicits.{int2opt, str2opt};

  val st = SleightType.Chi;

  val ambienceSense = PsiSleight(
    name = "Ambience Sense",
    sleightType = st,
    psiType = Passive(),
    descr =
      "This sleight provides the async with an instinctive sense about an area and any potential threats nearby. The async receives a +10 modifier to all Investigation, Perception, Scrounging, and Surprise Tests.",
    source = Sources.ep,
    sourcePage = 223
  );

  val cognitiveBoost = PsiSleight(
    name = "Cognitive Boost",
    sleightType = st,
    psiType = Active(action = "Quick", range = Self, duration = Temp("Action Turns"), strainMod = -1),
    descr =
      "The async can temporarily elevate their cognitive performance. In game terms, Cognition is raised by 5 for the chosen duration. This boost to Cognition also raises the rating of skills linked to that aptitude.",
    source = Sources.ep,
    sourcePage = 223
  );

  val downtime = PsiSleight(
    name = "Downtime",
    sleightType = st,
    psiType = Active(action = "Task (min. 4 hours)", range = Self, duration = Sustained, strainMod = 0),
    descr =
      "This sleight provides the async with the ability to send the mind into a fugue-state regenerative downtime, during which the character’s psyche is repaired. The async must enter the downtime for at least 4 hours; every 4 hours of downtime heals 1 point of stress damage. Traumas, derangements, and disorders are unaffected by this sleight. For all sensory purposes, the async is catatonic during downtime, completely oblivious to the outside world. Only severe disturbances or physical shock (such as being wounded or hit by a shock weapon) will bring the async out of it.",
    source = Sources.ep,
    sourcePage = 224
  );

  val emotionControl = PsiSleight(
    name = "Emotion Control",
    sleightType = st,
    psiType = Passive(),
    descr =
      "Emotion Control gives the async tight control over their emotional states. Unwanted emotions can be blocked out and others embraced. This has the benefit of protecting the async from emotional manipulation, such as the Drive Emotion sleight or Intimidation skill tests. The async receives a +30 modifier when defending against such tests.",
    source = Sources.ep,
    sourcePage = 224
  );

  val enhancedCreativity = PsiSleight(
    name = "Enhanced Creativity",
    sleightType = st,
    psiType = Passive(),
    descr =
      "An async with Enhanced Creativity is more imaginative and more inclined to think outside the box. Apply a +20 modifier to any tests where creativity plays a major role. This level of ingenuity can sometimes seem strange and different, manifesting in odd or creepy ways, especially with artwork.",
    source = Sources.ep,
    sourcePage = 224
  );

  val filter = PsiSleight(
    name = "Filter",
    sleightType = st,
    psiType = Passive(),
    descr =
      "Filter allows the async to filter out distractions and eliminate negative situational modifiers from distraction, up to the gamemaster’s discretion.",
    source = Sources.ep,
    sourcePage = 224
  );

  val grok = PsiSleight(
    name = "Grok",
    sleightType = st,
    psiType = Active(action = "Complex", range = Self, duration = Instant, strainMod = -1),
    descr =
      "By using the Grok sleight, the async is able to intuitively understand how any unfamiliar object, vehicle, or device is used simply by looking at and handling it. If the character succeeds in a COG × 2 Test, they achieve a basic ability to use the object, vehicle, or device, no matter how alien or bizarre. This sleight does not provide any understanding of the principles or technologies involved—the psi user simply grasps how to make it work. If a test is called for, the psi user receives a +20 modifier to use the device (this bonus only applies to unfamiliar devices, and/or tests the character is defaulting on—it does not apply to devices with which the character is familiar).",
    source = Sources.ep,
    sourcePage = 224
  );

  val highPainThreshold = PsiSleight(
    name = "High Pain Threshold",
    sleightType = st,
    psiType = Passive(),
    descr =
      "This sleight allows the async to block out, ignore, or otherwise isolate pain. The async reduces negative modifiers from wounds by 10.",
    source = Sources.ep,
    sourcePage = 224
  );

  val hyperthymesia = PsiSleight(
    name = "Hyperthymesia",
    sleightType = st,
    psiType = Passive(),
    descr =
      "Hyperthymesia grants the async a superior auto-biographical memory, allowing them to remember the most trivial of events. A hyperthymestic async can be asked a random date and recall the day of the week it was, the events that occurred that day, what the weather was like, and many seemingly trivial details that most people would not be able to recall.",
    source = Sources.ep,
    sourcePage = 224
  );

  val instinct = PsiSleight(
    name = "Instinct",
    sleightType = st,
    psiType = Passive(),
    descr =
      "Instinct bolsters the async’s subconscious ability to gauge a situation and make a snap judgment that is just as accurate as a careful, considered decision. For Task Actions that involve analysis or planning alone (typically Mental skill actions), the async may reduce the timeframe by 90% without suffering a modifier. For Task Actions that involve partial analysis/planning, they may reduce the timeframe by 30% without penalty.",
    source = Sources.ep,
    sourcePage = 224
  );

  val multitasking = PsiSleight(
    name = "Multitasking",
    sleightType = st,
    psiType = Passive(),
    descr =
      "The async can handle vast amounts of information without overload and can perform more than one mental task at once. The character receives an extra Complex Action each Action Phase that may only be used for mental or mesh actions.",
    source = Sources.ep,
    sourcePage = 224
  );

  val patternRecognition = PsiSleight(
    name = "Pattern Recognition",
    sleightType = st,
    psiType = Passive(),
    descr =
      "The character is adept at spotting patterns and correlating the non-random elements of a jumble—related items jump out at them. This is useful for translating languages, breaking codes, or finding clues hidden among massive amounts of data. The character must have a sufficiently large sample and time enough to study, as determined by the gamemaster. This might range from a few hours of listening to a spoken transhuman language to a few days of investigating inscriptions left by long-dead aliens or a week or more of researching a lengthy cipher. Languages may be comprehended by reading or listening to them spoken. Apply a +20 modifier to any appropriate Language, Investigation, Research, or codebreaking Tests (note that this does not apply to Infosec Tests made by software to decrypt a code). The async may also use this ability to more easily learn new languages, reducing the training time by half.",
    source = Sources.ep,
    sourcePage = 224
  );

  val predictiveBoost = PsiSleight(
    name = "Predictive Boost",
    sleightType = st,
    psiType = Passive(),
    descr =
      "The Bayesian probability machine features of the async’s brain are boosted by this sleight, enhancing their ability to estimate and predict outcomes of events around them as they unfold in real-time and update those predictions as information changes. In effect, the character has a more intuitive sense for which outcomes are most likely. This grants the character a +10 bonus on any skill tests that involve predicting the outcome of events. It also bolsters the async’s decision-making in combat situations by making the best course of action more clear and so provides a +1 bonus to Initiative and +10 to Fray Tests.",
    source = Sources.ep,
    sourcePage = 225
  );

  val qualia = PsiSleight(
    name = "Qualia",
    sleightType = st,
    psiType = Active(action = "Quick", range = Self, duration = Temp("Action Turns"), strainMod = -1),
    descr =
      "The async can temporarily increase their intuitive grasp of things. In game terms, Intuition is raised by 5 for the chosen duration. This boost to Intuition also raises the rating of skills linked to that aptitude.",
    source = Sources.ep,
    sourcePage = 225
  );

  val savantCalculation = PsiSleight(
    name = "Savant Calculation",
    sleightType = st,
    psiType = Passive(),
    descr =
      "The character possesses an incredible facility with intuitive mathematics. They can do everything from calculate the odds exactly when gambling to predicting precisely where a leaf falling from a tree will land by observing the landscape and local wind currents. The character specializes in calculation involving the activity of complex chaotic systems and so can calculate answers that even the fastest computers could not, including things like patterns of rubble distribution from an explosion. However, this mathematic facility is largely intuitive, so the character does not know the equations they are solving, they merely know the solution to the problem.\nThis sleight also provides a +30 modifier to any skill tests involving math (which the character is calculating, not a computer).",
    source = Sources.ep,
    sourcePage = 225
  );

  val sensoryBoost = PsiSleight(
    name = "Sensory Boost",
    sleightType = st,
    psiType = Active(action = "Quick", range = Self, duration = Temp("Action Turns"), strainMod = -2),
    descr =
      "An async uses this sleight to increase their natural or augmented sensory perception (visual, audio, olfactory, etc.) by enhanced cerebral processing, granting a +20 modifier to sensory-based Perception Tests.",
    source = Sources.ep,
    sourcePage = 225
  );

  val superiorKinesics = PsiSleight(
    name = "Superior Kinesics",
    sleightType = st,
    psiType = Passive(),
    descr =
      "The async acquires more insight into people’s emotive signals, gestures, facial expressions, and body language when it comes to predicting the person’s emotional state, intent, or reactions. Apply a +10 modifier to Kinesics Skill Tests.",
    source = Sources.ep,
    sourcePage = 225
  );

  val timeSense = PsiSleight(
    name = "Time Sense",
    sleightType = st,
    psiType = Active(action = "Automatic", range = Self, duration = Temp("Action Turns"), strainMod = -1),
    descr =
      "An async with this ability can slow down their perception of time, making everything appear to move in slow motion or at reduced speed. In game terms, this sleight grants the async a Speed of +1. This extra Action Phase, however, can only be spent on mental and mesh actions.",
    source = Sources.ep,
    sourcePage = 225
  );

  val unconsciousLead = PsiSleight(
    name = "Unconscious Lead",
    sleightType = st,
    psiType = Active(action = "Automatic", range = Self, duration = Temp("Action Turns"), strainMod = 0),
    descr =
      "This sleight allows the async to override their consciousness and let their unconscious mind take point. While in this state, the async’s conscious mind is only dimly aware of what is transgressing, and any memories of this period will be hazy at best. The advantage is that the unconscious mind acts more quickly, and so the async’s Speed is boosted by +1. The character remains aware and active, but is incapable of complex communication or other mental actions and is motivated by instinct and primitive urges more than conscious thought. Though it is recommended that the player retain control of their character while using Unconscious Lead, the gamemaster should feel free to direct the character’s actions as they see fit.",
    source = Sources.ep,
    sourcePage = 225
  );

  /*
   * Transhuman
   */

  val ecoEmpathy = PsiSleight(
    name = "Eco-Empathy",
    sleightType = st,
    psiType = Active(action = "Complex", range = Self, duration = Instant, strainMod = -1),
    descr =
      "An async with this sleight can attempt to gain an intuitive understanding of non-sentient, non-terrestrial organisms occupying a producer niche in the local ecosystem (e.g., alien plant and fungus analogues). If the character succeeds in a COG x 2 Test, they gain a basic understanding of the organism’s place in the local ecosystem, as well as whether it’s safe and nutritious for transhuman consumption. The information gained is of a general and qualitative nature and doesn’t include any data that would normally be gained by chemical or genetic analysis. For example, an eco-empathic async could tell that a given plant thrives only in riparian zones, relies on local insect analogs for pollination, and has tubers that become edible if well cooked. They would not be able to tell that the same plant has over a thousand chromosomes, that it exudes a chemical that is physically addicting to the insects, or that the tubers contain high concentrations of a toxic lectin that breaks down and becomes harmless if boiled.",
    source = Sources.transhuman,
    sourcePage = 154
  );

  val xenoEmpathy = PsiSleight(
    name = "Xeno-Empathy",
    sleightType = st,
    psiType = Active(action = "Complex", range = Self, duration = Instant, strainMod = -1),
    descr =
      "An async with this sleight can attempt to gain an intuitive understanding of any non-human, non-terrestrial organism. If the character succeeds in an INT x 2 Test, they gain insight into the target’s motivations, needs, and mental/emotional state (if sapient) or the target’s ecological niche, instinctual drives, and likely behav- ioral responses (if non-sapient). Apply a +20 modifier to any Animal Handling, Deception, Intimidation, Kinesics, or Persuasion Tests made by the character against that organism. This sleight does not work on animals or smart animals of terrestrial origin.",
    source = Sources.transhuman,
    sourcePage = 154
  );

  val list: List[PsiSleight] = Macros.memberList[PsiSleight];
}
