package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object XenoarcheologyGear {
  val c = "Xenoarcheology Gear";

  // Gatecrashing
  val adaptiveInterface = Gear(
    name = "Adaptive Interface",
    category = c,
    descr = "One of the most hoped-for finds on any gatecrashing expedition is any piece of functional alien elec- tronics—especially any alien data storage medium still containing data. In the rare circumstances that such a relic is found, the adaptive interface is the tool designed to enable transhumans to understand, activate, and potentially interact with it.\nThis medium-sized device includes a series of smart-material connectors that allow this unit to be connected to almost any conceivable piece of tech- nology. It is also equipped with sensors and a small nanoswarm that can analyze the device’s structure and otherwise try to discern its inner workings. Once connected, the adaptive interface sends minute amounts of power into the alien device, monitors all outputs, and systematically attempts to identify and map the circuitry and logic patterns in the device as well as the safe amount and type of current used to power it. The interface’s AI compares the scans and any detected data structures to databases of known and speculated designs (Academics: Computer Science 80, Academics: Electrical Engineering 80,Academics: Xenodata 60, Infosec 40, Interfacing 40, Programming 40).\nAn adaptive interface can be set up to analyze on its own (use the AI’s skills) or a character can take advantage of it to conduct their own study (with the AI providing teamwork). Attempts to figure out how to activate or use an alien device, read data on a relic, figure out an item’s purpose, etc. are Task Actions with a suggested timeframe of at least 1 hour and quite possibly longer. The alien nature of most devices applies a –30 modifier to such tests. The gamemaster should adjust this timeframe and apply additional modifiers as appropriate to the device.\nWhile engaged in probing an alien device, the adaptive interface enters into an offline mode, severing all wireless connections; this is safety feature to prevent the interface from spreading an infection to other devices.\nThe primary limit on this unit is that it is not designed to work with biological technology or with nanotechnology considerably in advance of those available to transhumanity. As a result, this unit cannot be used on bluetrees, myst trees, or any similar non-standard devices.",
    price = Cost.High,
    source = Sources.gatecrashing,
    sourcePage = 160);

  val faradayContainer = Gear(
    name = "Faraday Container",
    category = c,
    descr = "This is a specimen container (p. 330, EP) that is encased in a superconductive charged wire mesh, blocking all radio signals, electrical charges, and electromagnetic radiation from getting in or out. It is commonly used to isolate unknown alien devices.",
    price = Cost.Low,
    source = Sources.gatecrashing,
    sourcePage = 160);

  val scourers = Gear(
    name = "Scourers",
    category = c,
    descr = "Scourers are a type of nanoswarm/microswarm (p.328, EP) and follow all of the normal rules for such. Scourers are used for xenoarcheological digs. They are programmed to analyze the dirt, regolith, ice, or other ground covering in a particular area and then to systematically remove it, layer by layer. Anything that is found that does not match this matter has its location tagged, then the swarm uses ultrasound to clear the item and clean it. Uncovered items are imaged, tagged again, and their data uploaded to a three-dimensional map of the dig site and all objects found.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 160);

  val list: List[Gear] = Macros.memberList[Gear];
}
