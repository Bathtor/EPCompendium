package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object SpecialSubstances {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._;

  val norepinephrineBoost = Substance(
    name = "Norepinephrine Boost",
    category = "Bioware Substance",
    classification = Biologicals,
    application = Injection,
    addiction = None,
    onset = "Immediate",
    duration = "Until Calmed",
    effects = List(REF + 10, IgnoreWounds(1)),
    descr = "The concentrated burst of norepinephrine accelerates heart rate and blood flow and burns carbohydrates. In game terms, this allows the character to ignore the modifiers from 1 wound and temporarily increases REF by +10 (also boosting REF-linked skills and Initiative).",
    price = Cost.None,
    source = Sources.ep,
    sourcePage = 302);

  val neurachem1 = Substance(
    name = "Neurachem (Level 1)",
    category = "Bioware Substance",
    classification = Biologicals,
    application = Injection,
    addiction = None,
    onset = "Immediate",
    duration = 30.mins,
    effects = List(SpeedMod(1)),
    descr = "Neurachem increases the Speed stat by +1, with no side effect. The speed boost lasts for 30 minutes, though it may be triggered again.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 305);

  val neurachem2 = Substance(
    name = "Neurachem (Level 2)",
    category = "Bioware Substance",
    classification = Biologicals,
    application = Injection,
    addiction = None,
    onset = "Immediate",
    duration = 30.mins,
    effects = List(SpeedMod(2)),
    descr = "Raises the Speed stat by +2, but the character suffers a nervous system fatigue hangover for 1 hour after the boost wears off (–20 modifier to all actions). The speed boost lasts for 30 minutes, though it may be triggered again. Level 2 may be used as Level 1 if desired.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 305);

  val list: List[Substance] = Macros.memberList[Substance];
}
