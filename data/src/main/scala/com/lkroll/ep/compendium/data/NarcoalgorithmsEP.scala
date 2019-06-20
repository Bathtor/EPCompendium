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

object NarcoalgorithmsEP {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Narcoalgorithms";

  val ddr = Substance(
    name = "DDR",
    category = c,
    classification = Electronic,
    application = Oral,
    addiction = (Mental, 0),
    onset = "immediate",
    duration = 3.hours,
    effects = List(
      FreeForm("–20 modifier on other actions while dancing, but the dancing may be overridden with a WIL × 3 Test")
    ),
    descr =
      "Originally crafted by prankster hackers and distributed as a virus, DDR (for “Dance Dance Robot”) triggers impulses in the target’s motor control circuits. Primary targeting robot AIs, the effect is that targets “dance” in jerky, automated movements. Pleasure receptors are also activated so that dancing—and movement of any kind—feels good. Different software variants invoke different motions and styles. The target suffers a –20 modifier on other actions while dancing, but the dancing may be overridden with a WIL × 3 Test.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 323
  );

  val linkstake = Substance(
    name = "Linkstake",
    category = c,
    classification = Electronic,
    application = Oral,
    addiction = (Mental, 0),
    onset = "immediate",
    duration = 3.hours,
    effects = List.empty,
    descr =
      "This software actually connects the user to a peer-to-peer network, where it randomly connects to other linkstate users and samples a bit of their XP feed and randomly accessed memories—typically just enough to provide context, but not enough to acquire private personal details. These inputs are spliced together, their emotional inputs amplified, and then the entire package is spiked with some hormonal circuit triggers and artificial synaesthesia. The effect is a mind-blowing mixed sampling of people’s lives, mashed together in a sensory soup, that hits the mind with a euphoric rush. Linkstate users are catatonic while under the effects (typical sessions run 3–4 hours), but afterwards they often report that they have flashbacks of events in other people’s lives. ",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 323
  );

  val list: List[Substance] = Macros.memberList[Substance];
}
