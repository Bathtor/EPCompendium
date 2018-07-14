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

object NanotoxinsEP {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Nanotoxins";

  val disruption = Substance(
    name = "Disruption",
    category = c,
    classification = Nanodrugs,
    application = List(Injection, Oral),
    addiction = None,
    onset = "immediate",
    duration = 8.hours,
    effects = List.empty,
    descr = "This nanotoxin attacks the myelin sheath on nerves, disrupting nerve impulses and inflicting symptoms of multiple sclerosis. Every hour the morph suffers a –5 modifier to COO, REF, and COG. If any aptitudes are reduced to zero,the morph is effectively paralyzed and catatonic.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 324);

  val necrosis = Substance(
    name = "Necrosis",
    category = c,
    classification = Nanodrugs,
    application = List(Injection, Oral),
    addiction = None,
    onset = 3.turns,
    duration = 1.mins,
    effects = List(FreeForm("1d10 ÷ 2 damage per Action Turn for one minute")),
    descr = "Necrosis nanobots attack the walls of cells inside the body, killing tissue. This nanotoxin inflicts 1d10 ÷ 2 damage per Action Turn for one minute, after which the nanobots disable and flush from the body. Necrosis only affects biomorphs. ",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 324);

  val neuropath = Substance(
    name = "Neuropath",
    category = c,
    classification = Nanodrugs,
    application = List(Dermal, Injection, Oral),
    addiction = None,
    onset = 3.turns,
    duration = 8.hours,
    effects = List.empty,
    descr = "These nanobots are designed to stimulate the pain receptors of a morph on a systemic level to cause agony and impairment. While most neuropaths target biological receptors, variants are available that induce comparable (phantom) pain stimulations in the cyberbrains of synthmorphs to create an equivalent effect. The affected character must succeed in a WIL × 3 Test or become incapacitated. Even if they succeed, they suffer –30 from the inflicted agony. Any form of pain resistance that allows a character to ignore wound modifiers will negate the neuropath pain modifier by an appropriate amount. ",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 324);

  val nutcracker = Substance(
    name = "Nutcracker",
    category = c,
    classification = Nanodrugs,
    application = List(Injection, Oral),
    addiction = None,
    onset = "immediate",
    duration = 8.hours,
    effects = List.empty,
    descr = "Nutcrackers are nanobots designed to locate, migrate, and decompose the synthdiamond case of a cortical stack within a morph by attacking its crystal lattice. This process takes approximately 6 hours, after which the cortical stack is destroyed. These nanobots also attack the cortical stack’s connec- tions to the (cyber)brain and brain-mapping nanobots. After 1 hour, the victim will be aware that their corti- cal stack is threatened. After 3 hours, all connections will be severed and the cortical stack will no longer be able to back up the character.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 324);

  val list: List[Substance] = Macros.memberList[Substance];
}
