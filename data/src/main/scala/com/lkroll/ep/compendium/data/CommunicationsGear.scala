package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object CommunicationsGear {

  val c = "Communications";

  val fiberopticCable = Gear(
    name = "Fiberoptic Cable",
    category = c,
    descr = "Fiberoptic cables are used to establish wired connections between two devices. Given the ubiquity of radios and the tangled mess wires cause, they are typically only used for privacy (unlike radio communication, fiberoptic signals may not be intercepted) or in areas with heavy radio interference.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 313);

  val laserLink = Gear(
    name = "Laser/Microwave Link",
    category = c,
    descr = "These portable devices are used to establish a tight-beam, line-of-sight communications channel with another laser or microwave link. The range of these transceivers varies widely with environmental factors, but approximates 50 kilometers in atmosphere and 500 kilometers in space (though horizon limits must be kept in mind, being 5 kilometers at ground level on Earth and less on smaller bodies). Lasers are subject to interference from fog, dirt, smoke, and similar visual chaff, while microwaves may be hindered by metallic obstructions. These links may only be intercepted by getting directly in between the beams. Some teams carry a micro version of this system, worn on their person, allowing line of sight intra-team communications that cannot be intercepted like radio.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 313);

  val radioBooster = Gear(
    name = "Radio Booster",
    category = c,
    descr = "This device boosts the range and sensitivity of short-range radios, like those from implants, ectos, or microbugs. The booster must be with the shorter-ranged device’s range (or directly linked via fiberoptic cable). It will repeat any transmissions received from that device, but at its extended range of 25 kilometers in urban areas (250 kilometers remote areas). Broadcasts from a radio booster are easy to receive by anyone looking for broadcasts (see Wireless Scanning, p. 251), though transmissions may be stealthed (p. 252). Boosters are commonly used by characters traveling far from habitats or other civilized regions.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 314);

  val neutrinoTransceiver = Gear(
    name = "Neutrino Transceiver",
    category = c,
    descr = "This transceiver is capable of generating and receiving neutrino signals at a range of at least 100 astronomical units. It is large, with a size of 8 cubic meters (in a cube 2 meters on a side), but they can be loaded onto large vehicles. To function, it must be connected to a large power plant, such as one found in habitats or large spacecraft. The cost and size of this device includes the computer necessary for quantum farcasting.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 314);

  val minRadioFarcaster = Gear(
    name = "Miniature Radio Farcaster",
    category = c,
    descr = "Miniature farcasters communicate with each other using standard radio transceivers. As noted above, they may only securely communicate with the other farcasters with which they are entangled. Most miniature farcasters are worn as jewelry or fitted into clothing or other equipment.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 315);

  val portableQEComm = Gear(
    name = "Portable QE Comm",
    category = c,
    descr = "This is a handheld FTL communications device. The actual communications unit can be made as small as desired, but must be large enough to connect to or hold a qubit reservoir. Because qubit reservoirs are relatively large and must be replaced, they are rarely implanted. Some miniature farcasters are designed so that users can also attach qubit reservoirs to enable them to be used for both light speed and FTL communication.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 315);

  val lowCapQBReservoir = Gear(
    name = "Low-Capacity Qubit Reservoir",
    category = c,
    descr = "Low-capacity qubit reservoirs can be used for 10 hours of high-resolution video conferencing or meshbrowsing and 100 hours of voice or text only communications.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 315);

  val highCapQBReservoir = Gear(
    name = "High-Capacity Qubit Reservoir",
    category = c,
    descr = "High-capacity qubit reservoirs can be used for 100 hours of high-resolution video conferencing or meshbrowsing and 1,000 hours of voice or text only communications.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 315);

  val list: List[Gear] = Macros.memberList[Gear];
}
