package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object ExplorationGear {
  val c = "Exploration Gear";

  val blueBox = Gear(
    name = "Blue Box",
    category = c,
    descr =
      "Named for the distinct cobalt blue color they were originally manufactured in, blue boxes are portable gate control units (see The Gate Interface, p. 142). These are specifically designed for interfacing with extrasolar gates and are the most common gate interface found on extrasolar colonies. They are rarely allowed on first-in missions or any missions where signs of sapient life have been detected, in order to keep these devices out of the hands of aliens. Because these devices only allow a pared-down version of the full gate interface, they are more challenging to use than complete stationary models; apply a –10 modifier to all gate operation actions conducted via blue box.",
    price = Cost.Expensive,
    source = Sources.gatecrashing,
    sourcePage = 155
  );

  val gateProbe = Gear(
    name = "Gate Probe",
    category = c,
    descr =
      "Gate probes are portable medium-sized self-deploying sensor packages. When a small wormhole is opened to a new location, a gate probe stationed in front of the wormhole can be instructed to stick a micro-sized sensor probe through the opening and take readings of the other side. This probe provides a live audiovisual feed, uses a radiation sensor to detect the local radiation level, and uses a chem sniffer and thermometer to measure the atmospheric pressure, temperature, and composition. This probe emits no active signals and is shielded from electromagnetic signals in a protective Faraday cage mesh. Taking a simple measurement requires only 1 Action Turn, though probes are usually stationed for a minute or longer to get more accurate and detailed readings. Gate probes can withstand pressures from 0 to 250 atmospheres and temperatures from –250ºC to 600ºC. They have Perception 40 and Academics: Chemistry 60.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 156
  );

  val mappingMissile = Gear(
    name = "Mapping Missile",
    category = c,
    descr =
      "A mapping missile is a small metallic-hydrogen rocket capable of attaining low orbit on any world with a gravity of less than 1.8g. It is designed to launch a single small satellite into a relatively low polar orbit that is equipped with a variety of sensors, including visual and infrared cameras, radar, spectrographs, as well as simple mass sensors. Within 25–40 hours (depending on the size of the world) this satellite beams back a map of the planet, including data on mass concentrations, all artificial lights (or significant forest fires) on the night side, and any large structures. The resolution of this map is fairly low and does not reveal any details that are less than approximately 100m across (though better resolution is possible on worlds with less than 1g gravity, and worse is likely on planets with more than 1g). However, cities, mountains, islands, and anything else that is huge can all be clearly seen. The satellite also provides data on the rotation rate of the planet as well as its gravity and atmospheric composition. It includes a radio booster so that anyone with basic mesh inserts or an ecto can receive the mapping broadcasts.\nMapping missiles are medium-sized gear, approximately 1m long, 15cm in diameter, and a mass of 10kg. The satellite payload is a smooth 12cm sphere before it deploys its antennas and lenses. The missile comes packed inside a smart material launch tube that extends struts and supports to automatically aim the missile in the correct trajectory. This tube is mounted on an electric cart with smart material wheels. To use this device, all the owner need do is send it through the gate and let it launch. The missile automatically moves from the gate to a good launching position, aims, and launches. The only time the owner will need to move it is if the gate opens underground or in some other location where the missile’s sensors cannot see the sky. The satellite also includes a tiny payload of disassembler nanobots that can be activated by its user, to destroy the satellite without leaving debris in orbit. Mapping missiles have Perception 40 and Academics: Chemistry 60.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 156
  );

  val portableSolarchive = Gear(
    name = "Portable Solarchive",
    category = c,
    descr =
      "One common frustration among transhuman gatecrashers is being cut off from the mesh and the vast knowledge base of transhumanity. To compensate for this, they bring along portable SolArchives. These are small data storage units that hold impressive data archives on a particular subject of interest. Each library unit focus on a different subject (one specific Knowledge skill at 60). The user can query the library for information or use it to make a Research Test related to that subject as if they were searching the mesh. Portable SolArchives automatically update their data whenever they are in contact with the mesh. These units are also popular among brinkers and others who spend long periods isolated from major outposts of transhumanity. ",
    price = Cost.Low,
    source = Sources.gatecrashing,
    sourcePage = 156
  );

  val scoutMissile = Gear(
    name = "Scout Missile",
    category = c,
    descr =
      "Scout missiles are sensor-equipped standard missiles that come pre-packaged in a disposable launcher tube. Scout missiles are designed to map out the region in a 5-kilometer radius from the launch point in just 20 minutes. They carry visual and infrared cameras, radar, and lidar. Their primary function is to map terrain, locate structures, and identify other features of interest. Scouts are valued by gatecrashers for their ability to map a small area quickly.\nScout missiles are incredibly easy to use; simply point up and launch, and the missile does the rest. The missile transmits a feed of its sensor data, position, and telemetry in real-time, and will transmit a full recording of its findings once its run is completed. Scout missiles may be programmed to search in a specific direction rather than a radius around the launch point, increasing their effective range in the chosen direction out to 10km. The missiles may also be instructed to search for specific features or signs (such as tracks or a missing explorer); treat the missiles as if they have a Perception of 40. Scout missiles usually travel at a height of 100m and can provide high-resolution images of ground-based objects (down to the centimeter scale).",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 156
  );

  val list: List[Gear] = Macros.memberList[Gear];
}
