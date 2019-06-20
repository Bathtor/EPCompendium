package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object ScavengerTech {
  val c = "Scavenger Tech";

  val disassemblyTools = Gear(
    name = "Disassembly Tools",
    category = c,
    descr =
      "These tools are useful for salvage ops, breaking down wrecks, or dissembling anything from a habitat room to a vehicle or synthmorph. They include plasma torches, laser cutters, pneumatic jaws, and smart tools like spanners and wrenches that can be adapted to a wide array of connections and fittings.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 330
  );

  val mobileLab = Gear(
    name = "Mobile Lab",
    category = c,
    descr =
      "The mobile lab is a handheld device that contains all different types of sensors to investigate organic and inorganic liquid, gaseous, and solid components (from soil to tissue samples) and compositions. It performs material analysis using different methods of spectrometry and biochemical testing, comparing results to a built-in database of element and compound spectra. Its built in AI comes equipped with Academic: Chemistry 30.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 330
  );

  val specimenContainer = Gear(
    name = "Specimen Container",
    category = c,
    descr =
      "This capsule container is designed to hold samples of any sort (chemical, biological, etc.) in near stasis. It can be programmed to reproduce whatever conditions the user specifies, from cryogenic freezing to extreme heat, or even vacuum or high-pressure atmosphere.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 330
  );

  val superthermiteCharges = Gear(
    name = "Superthermite Charges",
    category = c,
    descr =
      "These powerful and highly stable demolition charges are made from a combination of nanometals and metal oxides. A single charge can be used to create an explosive blast inflicting 2d10+5 damage. This charge can be shaped with a successful Demolitions Test, focusing the blast in a particular 90º direction (for example, to blow through a door). This triples the damage of the blast in the focused direction; in all other directions, the damage is reduced to 1/3rd (round down). Multiple charges apply a cumulative effect.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 330
  );

  val list: List[Gear] = Macros.memberList[Gear];
}
