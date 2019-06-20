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

object PsyDrugsEP {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "PsyDrugsEP";

  val inhibitor = Substance(
    name = "Disruption",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = None,
    onset = 3.turns,
    duration = 6.hours,
    effects = List.empty,
    descr =
      "Inhibitor is a cocktail of neurochemicals that block some brain receptor and transmitter func- tions in an attempt to reduce psi-waves and block or impair sleights. This drug is commonly used to restrain async prisoners from using their abilities. A drugged character must make a WIL × 2 Test. If they fail, they lose all psi abilities for the drug’s duration. If they succeed, they suffer a –30 impairment on Psi skills and all strain is doubled. Inhibitor has an unfortunate side effect of doping the character down, however; apply a –10 modifier to their COG. Inhibitor-influenced characters tend to have a glazed, dopey expression and have difficulty getting excited or emotional.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 325
  );

  val psiOpener = Substance(
    name = "Psi-Opener",
    category = c,
    classification = Biologicals,
    application = List(Injection, Oral),
    addiction = None,
    onset = 20.mins,
    duration = 1.hours,
    effects = List.empty,
    descr =
      "Psi-opener drugs are variants of the Watts-MacLeod strain with a temporary effect and which do not permanently alter the user’s brain. Psi-opener temporarily imbues the user with the ability to use one particular sleight, regardless of whether or not they have the Psi trait. Each type of Psi-opener is customized for a particular sleight. While primarily intended for non-asyncs, non-asyncs may not possess Psi skills, so they must default to WIL. For this reason, Psi-Opener is often doubled up with Psike-out. Using Psi-opener is a mind-wrenching experience. Users are occasionally subject to hallucinations (gamemaster discretion). When the drug wears off, it inflicts 1d10 points of mental stress, +2 if the drug imbues a psi-gamma sleight.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 325
  );

  val psikeOut = Substance(
    name = "Psike-Out",
    category = c,
    classification = Chemicals,
    application = List(Dermal, Injection, Oral),
    addiction = None,
    onset = 1.mins,
    duration = 1.hours,
    effects = List.empty,
    descr =
      "Psike-out bolsters an async’s psi abilities. Apply a +20 modifier to the async’s Psi skill tests for the drug’s duration. However, also apply +2 to all strain DVs for the drug’s duration. Psike-out is mentally addictive, with an Addiction Modifier of –10.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 325
  );

  val list: List[Substance] = Macros.memberList[Substance];
}
