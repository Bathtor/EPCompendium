package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Derangements {
  import Severity._;

  // MAJOR

  val blackout = Derangement(
    name = "Blackout",
    severity = Major,
    descr =
      "You operate on auto-pilot in a temporary fugue state. Later, you will be incapable of recalling what happened during this period. (Synthetic shells and infomorphs may call up memory records from storage.)",
    source = Sources.ep,
    sourcePage = 211
  );

  val frenzy = Derangement(name = "Frenzy",
                           severity = Major,
                           descr = "You have a major freak out over the source of the stress and attack it.",
                           source = Sources.ep,
                           sourcePage = 211);

  val hallucinations = Derangement(name = "Hallucinations",
                                   severity = Major,
                                   descr = "You see, hear, or otherwise sense things that aren’t really there.",
                                   source = Sources.ep,
                                   sourcePage = 211);

  val hysteria = Derangement(
    name = "Hysteria",
    severity = Major,
    descr =
      "You lose control, panicking over the source of the stress. This typically results in an emotional outburst of crying, laughing, or irrational fear.",
    source = Sources.ep,
    sourcePage = 211
  );

  val irrationality = Derangement(
    name = "Irrationality",
    severity = Major,
    descr =
      "You are so jarred by the stress that your capacity for logical judgment breaks down. You are angered by imaginary offenses, hold unreasonable expectations, or otherwise accept things with unconvincing evidence.",
    source = Sources.ep,
    sourcePage = 211
  );

  val paralysis = Derangement(
    name = "Paralysis",
    severity = Major,
    descr =
      "You are so shocked by the trauma that you are effectively frozen, incapable of making decisions or taking action.",
    source = Sources.ep,
    sourcePage = 211
  );

  val psychosoma = Derangement(
    name = "Psychosomatic Crippling",
    severity = Major,
    descr =
      "The trauma overwhelms you, impairing some part of your physical functioning. You suffer from an inex- plicable blindness, deafness, or phantom pain or are suddenly incapable of using a limb or other extremity.",
    source = Sources.ep,
    sourcePage = 211
  );

  // MODERATE

  val chills = Derangement(
    name = "Chills",
    severity = Moderate,
    descr = "Your body temperature rises, making you feel cold, and shivering sets in. You just can’t get warm.",
    upgradesTo = List(paralysis.name, psychosoma.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val confusion = Derangement(
    name = "Confusion",
    severity = Moderate,
    descr =
      "The trauma scrambles your concentration, making you forget what you’re doing, mix up simple tasks, and falter over easy decisions.",
    upgradesTo = List(blackout.name, hallucinations.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val echopraxia = Derangement(
    name = "Echopraxia",
    severity = Moderate,
    descr = "You involuntarily repeat and mimic the actions of others around you.",
    upgradesTo = List(frenzy.name, hysteria.name, psychosoma.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val moodSwings = Derangement(
    name = "Mood Swings",
    severity = Moderate,
    descr = "You lose control of your emotions. You switch from ecstasy to tears and back to rage without warning.",
    upgradesTo = List(frenzy.name, hysteria.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val mute = Derangement(
    name = "Mute",
    severity = Moderate,
    descr = "The trauma shocks you into speechlessness and a complete inability to effectively communicate.",
    upgradesTo = List(paralysis.name, psychosoma.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val narcissism = Derangement(
    name = "Narcissism",
    severity = Moderate,
    descr =
      "In the wake of the mental shock, all you can think about is yourself. You cease caring about those around you.",
    upgradesTo = List(hysteria.name, irrationality.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val panic = Derangement(
    name = "Panic",
    severity = Moderate,
    descr =
      "You are overwhelmed by fear or anxiety and immediately seek to distance yourself from the cause of the stress.",
    upgradesTo = List(frenzy.name, paralysis.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val tremors = Derangement(
    name = "Tremors",
    severity = Moderate,
    descr = "You shake violently, making it difficult to hold things or stay still.",
    upgradesTo = List(blackout.name, paralysis.name),
    source = Sources.ep,
    sourcePage = 211
  );

  // MINOR

  val anxiety = Derangement(
    name = "Anxiety",
    severity = Minor,
    descr =
      "You suffer a panic attack, exhibiting the physiological conditions of fear and worry: sweatiness, racing heart, trembling, shortness of breath, headaches, and so on.",
    upgradesTo = List(chills.name, panic.name, tremors.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val avoidance = Derangement(
    name = "Avoidance",
    severity = Minor,
    descr =
      "You are psychologically incapable of dealing with the source of the stress or some circumstance related to it, so you avoid it – even covering your ears, curling up in a ball, or shutting off your sensors if you have to.",
    upgradesTo = List(mute.name, tremors.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val dizziness = Derangement(
    name = "Dizziness",
    severity = Minor,
    descr = "The stress makes you light-headed and disoriented.",
    upgradesTo = List(chills.name, confusion.name, tremors.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val echolalia = Derangement(
    name = "Echolalia",
    severity = Minor,
    descr = "You involuntarily repeat words and phrases spoken by others.",
    upgradesTo = List(echopraxia.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val fixation = Derangement(
    name = "Fixation",
    severity = Minor,
    descr =
      "You become fixated on something that you did wrong or some circumstance that led to your stress. You obsess over it, repeating the behavior, trying to fix it, running scenarios through your head and out loud, and so on.",
    upgradesTo = List(narcissism.name, moodSwings.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val hunger = Derangement(
    name = "Hunger",
    severity = Minor,
    descr =
      "You are suddenly consumed by an irrational yet overwhelming desire to eat something—perhaps even something unusual.",
    upgradesTo = List(chills.name, moodSwings.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val indecisiveness = Derangement(
    name = "Indecisiveness",
    severity = Minor,
    descr =
      "You are flustered by the cause of your stress, finding it difficult to make choices or select courses of action.",
    upgradesTo = List(mute.name, tremors.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val logorrhoea = Derangement(
    name = "Logorrhoea",
    severity = Minor,
    descr = "Your response to the trauma is to engage in excessive talking and babbling. You don’t shut up.",
    upgradesTo = List(echopraxia.name, panic.name),
    source = Sources.ep,
    sourcePage = 210
  );

  val nausea = Derangement(
    name = "Nausea",
    severity = Minor,
    descr = "The stress sickens you, forcing you to fight down queasiness.",
    upgradesTo = List(chills.name, tremors.name),
    source = Sources.ep,
    sourcePage = 211
  );

  val list: List[Derangement] = Macros.memberList[Derangement];
}
