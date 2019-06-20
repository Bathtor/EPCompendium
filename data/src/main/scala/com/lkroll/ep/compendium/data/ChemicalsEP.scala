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

object ChemicalsEP {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Chemicals";

  val atropine = Substance(
    name = "Atropine",
    category = c,
    classification = Chemicals,
    application = List.empty,
    addiction = (Mental, 0),
    onset = "immediate",
    duration = "immediate",
    effects = List.empty,
    descr =
      "Though poisonous in large doses, atropine is an effective antidote against nerve agents like BTX2 and Nervex. Easily synthesized in a maker, atropine will avert the effect whether taken soon before or after dosage by a nerve agent.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 323
  );

  val dmso = Substance(
    name = "DMSO",
    category = c,
    classification = Chemicals,
    application = List(Dermal),
    addiction = None,
    onset = "immediate",
    duration = "immediate",
    effects = List.empty,
    descr =
      "This chemical acts as a carrier, allowing other chemicals to be absorbed through the skin. It allows any chemical agent to be applied dermally.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 323
  );

  val liquidThermite = Substance(
    name = "Liquid Thermite",
    category = c,
    classification = Chemicals,
    application = List.empty,
    addiction = None,
    onset = "immediate",
    duration = "immediate",
    effects =
      List(FreeForm("Liquid thermite inflicts 3d10 + 5 DV per Action Turn to whatever it is touching for 3 turns.")),
    descr =
      "Similar to scrapper’s gel, liquid thermite comes in a gel form that is easily applied under all environmental conditions (by the nature of its chemical reaction, thermite is oxygenated and will burn underwater or in space). It is ignited with an electric charge, burning at temperatures exceeding 2,500 degrees Celsius and melting through whatever it is touching. Liquid thermite inflicts 3d10 + 5 DV per Action Turn to whatever it is touching for 3 turns. Armor will also be burnt through, offering no protection once the full Armor rating has been reached.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 323
  );

  val notWater = Substance(
    name = "Not Water",
    category = c,
    classification = Chemicals,
    application = List.empty,
    addiction = None,
    onset = "immediate",
    duration = "immediate",
    effects = List.empty,
    descr =
      "NotWater is an effective liquid fire retardant that does not get objects wet, no matter how absorbent they are—it simply beads up and slides right off.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 323
  );

  val scrapersGel = Substance(
    name = "Scraper's Gel",
    category = c,
    classification = Chemicals,
    application = List.empty,
    addiction = (Mental, 0),
    onset = "immediate",
    duration = "immediate",
    effects = List(FreeForm("1d10 + 5 DV per Action Turn to anything it touches for 3 turns")),
    descr =
      "This goo turns into a potent acid when given an electrical charge. It comes in a gel-like state and may be smeared like jelly, and may even be used in space. In acid form, scrapper’s gel does 1d10 + 5 DV per Action Turn to anything it touches for 3 turns, unless the material has been treated against acid. Armor will protect against this acid at first, but the acid will eat through the armor, so that it will no longer protect after its full armor value has been reached.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 323
  );

  val slip = Substance(
    name = "Slip",
    category = c,
    classification = Chemicals,
    application = List.empty,
    addiction = None,
    onset = "immediate",
    duration = "immediate",
    effects = List.empty,
    descr =
      "This liquid is almost entirely frictionless. When spread around an area (commonly used in splash grenades), anyone attempting to walk or run on the affected surface must make a COO Test or fall down. Likewise, any coated surface becomes extremely hard to grip onto, requiring a SOM Test to hang on. Anyone attempting to grapple a slip-soaked character suffers a –30 modifier. ",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 323
  );

  val trackerDye = Substance(
    name = "Tracker Dye",
    category = c,
    classification = Chemicals,
    application = List.empty,
    addiction = None,
    onset = "immediate",
    duration = "immediate",
    effects = List.empty,
    descr =
      "This liquid is almost entirely frictionless. When spread around an area (commonly used in splash grenades), anyone attempting to walk or run on the affected surface must make a COO Test or fall down. Likewise, any coated surface becomes extremely hard to grip onto, requiring a SOM Test to hang on. Anyone attempting to grapple a slip-soaked character suffers a –30 modifier. ",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 323
  );

  val list: List[Substance] = Macros.memberList[Substance];
}
