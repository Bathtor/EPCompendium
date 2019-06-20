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

object PathogensEP {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Nanotoxins";

  val degen = Substance(
    name = "Degen",
    category = c,
    classification = Nanodrugs,
    application = List.empty,
    addiction = None,
    onset = "immediate",
    duration = 8.hours,
    effects = List.empty,
    descr =
      "Characters exposed to this degenerative neurological disease must make a DUR × 2 Test or become infected. Medichines will defeat the disease, but others will not show signs of infection for 1 week, when the symptoms of a rapidly progressing dementia will become clear: memory loss, personality changes, and hallucinations. If untreated, Degen will progress for another week with more serious symptoms, including speech impediments, jerky movements, loss of balance and coordination, and even seizures. This is reflected by a 5 point loss in all aptitudes per day (after the first week). When any aptitude reaches 0, the character dies. Degen is notorious for its effect in corrupting cortical stack backups before infection symptoms manifest.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 324
  );

  val trigger = Substance(
    name = "Trigger",
    category = c,
    classification = Nanodrugs,
    application = List.empty,
    addiction = None,
    onset = "immediate",
    duration = 8.hours,
    effects = List.empty,
    descr =
      "Trigger is a designer virus that selectively targets and infects mast cells to trigger a hyper-allergic reaction. The resulting anaphylactic shock due to sys- temic vasodilatation (associated with a sudden drop in blood pressure) and bronchial swelling (resulting in constriction and difficulty breathing) usually leads to death in a matter of minutes after onset, if not treated. Infected characters must succeed in a DUR Test (using their current Durability score minus damage) or die quickly. Even medichines have difficulty reacting in time against this virus; characters with medichines must make a DUR × 2 Test to survive.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 324
  );

  val list: List[Substance] = Macros.memberList[Substance];
}
