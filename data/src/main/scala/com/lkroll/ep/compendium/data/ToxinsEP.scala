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

object ToxinsEP {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Toxins";

  val btx2 = Substance(
    name = "BTX2",
    category = c,
    classification = Chemicals,
    application = List(Dermal, Injection, Oral),
    addiction = None,
    onset = 1.turns,
    duration = 3.turns,
    effects = List(
      FreeForm("2d10 + 10 damage a turn for 3 Action Turns; medichines reduce this damage by half."),
      FreeForm("SOM × 2 Test (+30 with medichines) or be paralyzed for 1 hour")
    ),
    descr =
      "BTX-squared (also called Frog Bite) is a genetically enhanced variant of the extremely potent cardiotoxic and neurotoxic batrachotoxin. It leads to fast paralysis and cardiac arrest that usually kills the target within a few Action Turns. Affected characters suffer 2d10 + 10 damage a turn for 3 Action Turns; medichines reduce this damage by half. They must also make a SOM × 2 Test (+30 with medichines) or be paralyzed for 1 hour.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 323
  );

  val crGas = Substance(
    name = "CR Gas",
    category = c,
    classification = Chemicals,
    application = List(Dermal, Inhalation),
    addiction = None,
    onset = 1.turns,
    duration = 20.mins,
    effects = List.empty,
    descr =
      "This potent incapacitating agent causes eye twitching and temporary blindness, severe coughing and breathing difficulty, skin irritation, and panic. Affected characters suffer 1d10 ÷ 2 damage, a –30 modifier to sight-based Perception Tests, and a –20 modifier to all other actions for 20 minutes (5 minutes if the character has medichines).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 324
  );

  val flight = Substance(
    name = "Flight (Toxin)",
    category = c,
    classification = Biologicals,
    application = Inhalation,
    addiction = None,
    onset = 3.turns,
    duration = 1.hours,
    effects = List.empty,
    descr =
      "This drug is derived from human pheromones released due to fear, and is intended to instill alarm or even terror in the character. Affected characters must make a WIL × 3 Test (+30 with medichines) or suffer a panic attack, inflicting 1d10 stress. Dosed characters also suffer a –30 modifier for resisting intimidation or fear-based emotional manipulations. Flight affects last for 1 hour (5 minutes with medichines).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 324
  );

  val nervex = Substance(
    name = "Nervex",
    category = c,
    classification = Chemicals,
    application = List(Dermal, Inhalation, Injection, Oral),
    addiction = None,
    onset = 1.mins,
    duration = "death",
    effects = List.empty,
    descr =
      "Derived from deadly nerve agents like cyclosarin, VX, and novichok, this genetically modified toxin is deployed as a colorless, odorless gas that turns safely inert 10 minutes after deployment. It causes involuntary contraction of the muscles, seizures, and death by respiratory failure. One minute after exposure, the character must make a SOM Test or be incapacitated by seizures, paralysis, or nausea and vomiting; unaffected characters still suffer a –20 modifier to all actions. After 10 minutes, the character will die unless an antidote (such as atropine, p. 323) is applied. Characters with medichines suffer the initial effects, but recover after 5 minutes.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 324
  );

  val oxytocinA = Substance(
    name = "Oxytocin A",
    category = c,
    classification = Biologicals,
    application = List(Inhalation, Injection),
    addiction = None,
    onset = 2.mins,
    duration = 2.hours,
    effects = List.empty,
    descr =
      "A genetically improved variant of oxytocin, this drug induces trust in the recipient. Drugged characters suffer a –30 modifier on all WIL and Kinesics Tests where trust is a factor. Medichines provide immunity.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 324
  );

  val twitch = Substance(
    name = "Twitch",
    category = c,
    classification = Chemicals,
    application = List(Dermal, Inhalation, Injection, Oral),
    addiction = None,
    onset = 1.turns,
    duration = 10.mins,
    effects = List.empty,
    descr =
      "Twitch is a convulsive agent, a nonlethal nerve gas. Affected characters must succeed in a SOM Test (+30 with medichines) or become incapacitated with severe muscle tremors. Unaffected characters still suffer a –20 on all actions. The effects of Twitch last for 10 minutes, 5 if the character has medichines.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 324
  );

  val list: List[Substance] = Macros.memberList[Substance];
}
