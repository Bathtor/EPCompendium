package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

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

  val list: List[Substance] = Macros.memberList[Substance];
}
