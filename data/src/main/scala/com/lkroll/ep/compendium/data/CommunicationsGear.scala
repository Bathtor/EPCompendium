package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object CommunicationsGear {

  val c = "Communications";

  val fiberopticCable = Gear(
    name = "Fiberoptic Cable",
    category = c,
    descr =
      "Fiberoptic cables are used to establish wired connections between two devices. Given the ubiquity of radios and the tangled mess wires cause, they are typically only used for privacy (unlike radio communication, fiberoptic signals may not be intercepted) or in areas with heavy radio interference.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 313
  );

  val laserLink = Gear(
    name = "Laser/Microwave Link",
    category = c,
    descr =
      "These portable devices are used to establish a tight-beam, line-of-sight communications channel with another laser or microwave link. The range of these transceivers varies widely with environmental factors, but approximates 50 kilometers in atmosphere and 500 kilometers in space (though horizon limits must be kept in mind, being 5 kilometers at ground level on Earth and less on smaller bodies). Lasers are subject to interference from fog, dirt, smoke, and similar visual chaff, while microwaves may be hindered by metallic obstructions. These links may only be intercepted by getting directly in between the beams. Some teams carry a micro version of this system, worn on their person, allowing line of sight intra-team communications that cannot be intercepted like radio.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 313
  );

  val radioBooster = Gear(
    name = "Radio Booster",
    category = c,
    descr =
      "This device boosts the range and sensitivity of short-range radios, like those from implants, ectos, or microbugs. The booster must be with the shorter-ranged device’s range (or directly linked via fiberoptic cable). It will repeat any transmissions received from that device, but at its extended range of 25 kilometers in urban areas (250 kilometers remote areas). Broadcasts from a radio booster are easy to receive by anyone looking for broadcasts (see Wireless Scanning, p. 251), though transmissions may be stealthed (p. 252). Boosters are commonly used by characters traveling far from habitats or other civilized regions.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 314
  );

  val neutrinoTransceiver = Gear(
    name = "Neutrino Transceiver",
    category = c,
    descr =
      "This transceiver is capable of generating and receiving neutrino signals at a range of at least 100 astronomical units. It is large, with a size of 8 cubic meters (in a cube 2 meters on a side), but they can be loaded onto large vehicles. To function, it must be connected to a large power plant, such as one found in habitats or large spacecraft. The cost and size of this device includes the computer necessary for quantum farcasting.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 314
  );

  val minRadioFarcaster = Gear(
    name = "Miniature Radio Farcaster",
    category = c,
    descr =
      "Miniature farcasters communicate with each other using standard radio transceivers. As noted above, they may only securely communicate with the other farcasters with which they are entangled. Most miniature farcasters are worn as jewelry or fitted into clothing or other equipment.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 315
  );

  val portableQEComm = Gear(
    name = "Portable QE Comm",
    category = c,
    descr =
      "This is a handheld FTL communications device. The actual communications unit can be made as small as desired, but must be large enough to connect to or hold a qubit reservoir. Because qubit reservoirs are relatively large and must be replaced, they are rarely implanted. Some miniature farcasters are designed so that users can also attach qubit reservoirs to enable them to be used for both light speed and FTL communication.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 315
  );

  val lowCapQBReservoir = Gear(
    name = "Low-Capacity Qubit Reservoir",
    category = c,
    descr =
      "Low-capacity qubit reservoirs can be used for 10 hours of high-resolution video conferencing or meshbrowsing and 100 hours of voice or text only communications.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 315
  );

  val highCapQBReservoir = Gear(
    name = "High-Capacity Qubit Reservoir",
    category = c,
    descr =
      "High-capacity qubit reservoirs can be used for 100 hours of high-resolution video conferencing or meshbrowsing and 1,000 hours of voice or text only communications.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 315
  );

  // Gatecrashing
  val missionRecorder = Gear(
    name = "Mission Recorder",
    category = c,
    descr =
      "A mission recorder is a simple mini-sized spime designed to record live lifelog, XP-cast, or other sensor feeds from gatecrashing teams. Standard protocol is to leave mission recorders at an easy-to-find location on or next to a Pandora gate, so that search-and-rescue teams can find and analyze the recordings. Mission recorders are often hooked up to radio boosters, laser links or other tools for increasing their reception range for gatecrashing teams that stray far afield.",
    price = Cost.Trivial,
    source = Sources.gatecrashing,
    sourcePage = 154
  );

  val motes = Gear(
    name = "Motes",
    category = c,
    descr =
      "Motes are lightweight, micro-sized computers that come in packages of 500 (or more). They are designed to be spread around an area, whether manually, by airburst mote “grenade,” or scattered by aerial drone. Individual motes have grip pads that enable them to stick to almost any surface with which they come into contact. Once they blanket an area, the motes link together, establishing an ad hoc mesh network. Though each individual mote only has a range of 50 to 500 meters, en masse they can provide coverage over a significant region (see also Sky Motes, p. 163). Mote meshes are often the first networks a colony will have, with main outposts saturated and motes spread along main trails and thoroughfares. Motes can also be equipped with sensors; cameras are a common choice.",
    price = Cost.Low,
    source = Sources.gatecrashing,
    sourcePage = 154
  );

  val motesSE = Gear(
    name = "Motes (Sensor-Equipped)",
    category = c,
    descr =
      "Motes are lightweight, micro-sized computers that come in packages of 500 (or more). They are designed to be spread around an area, whether manually, by airburst mote “grenade,” or scattered by aerial drone. Individual motes have grip pads that enable them to stick to almost any surface with which they come into contact. Once they blanket an area, the motes link together, establishing an ad hoc mesh network. Though each individual mote only has a range of 50 to 500 meters, en masse they can provide coverage over a significant region (see also Sky Motes, p. 163). Mote meshes are often the first networks a colony will have, with main outposts saturated and motes spread along main trails and thoroughfares. Motes can also be equipped with sensors; cameras are a common choice.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 154
  );

  val neutrinoRetreat = Gear(
    name = "Neutrino Retreat",
    category = c,
    descr =
      "This highly specialized piece of equipment is designed specifically for gatecrashers who use emergency farcasters (p. 306, EP). This device includes a powerful radio transceiver and a specialized neutrino receiver, both of which are quantum entangled with one or more emergency farcasters. This device uses its radio transceiver to make daily backups of the owner’s ego and is also capable of receiving the pulsed ego broadcast made when an emergency farcaster sends out its single destructive neutrino broadcast. This device can remain in radio contact with an emergency farcaster at a range of 500km and can receive the neutrino pulse from emergency farcasters up to 100AU away. Most gatecrashers place this device within a few yards of the gate so rescue teams can easily find and access it. This device is also popular with criminals and freelance covert operatives who wish to have a carefully hidden safe haven for their egos.\nNeutrino retreats cannot broadcast neutrino communications and so are considerably smaller and less expensive than standard neutrino transceivers. Each neutrino retreat is able to communicate with up to 10 different emergency farcasters and can store up to 10 egos. This device is a medium-sized cube one meter on a side, weighting 400 kilograms. It contains its own nuclear battery, capable of running the device for up to 10 years.",
    price = Cost.High,
    source = Sources.gatecrashing,
    sourcePage = 154
  );

  val radioBeacon = Gear(
    name = "Radio Beacon",
    category = c,
    descr =
      "This portable, medium-sized radio transmitter has an open range of 250km. It can be programmed with any message(s) the user desires and set to repeat, alternate, or broadcast according to schedule. It can also be set to only broadcast after it receives a preprogrammed signal. Radio beacons are used as claim markers for resource or archeological finds, as planted messages to follow-up teams or rescuers, and for automatically warning people away from dangerous or secured areas.",
    price = Cost.Low,
    source = Sources.gatecrashing,
    sourcePage = 154
  );

  val satnetInACan = Gear(
    name = "Satnet-in-a-can",
    category = c,
    descr =
      "One of the first steps to establishing an outpost on any exoplanet is to install a a basic satellite network. A satnet-in-a-can is a large metallic hydrogen-fueled missile that carries 32 small satellites. Each of the 32 satellites is a 1kg sphere only 10cm in diameter. The missile itself is 40cm in diameter, 2m long, and 300kg in weight. This rocket can be used on any world with a gravity of 1.8g or less. It includes a smart material launch tube that extends struts and supports to automatically aim the missile in the correct trajectory. To use it, all the owner needs to do is set it up in a roughly vertical position, turn it on, and stand back. The missile will then automatically aim and launch. Once it reaches the proper altitude, it will deploy the satellites into intermediate circular orbit. Between 1 and 2 days later, the satellites will be in position and the satnet will come fully online.\nThe satellites provide GPS data to anyone on the planet’s surface as well as continuous low-resolution observation of the entire surface using the ultra- violet, visual, and infrared spectrums. These satellites provide a top resolution of only 100m on 1g planets; around lower-gravity planets the satellites are closer to the ground and get better resolution, around higher-gravity exoplanets their altitude is higher and so they can only see larger details.\nThis satnet can provide a rough map of the planet in just under a day. It can also provide continuous real-time imagery of the entire surface, allowing anyone linked to the network to instantly learn of volcanic eruptions, large earthquakes, spaceship launches, meteor strikes, the detonation of any atomic weapons or similar large bombs, or any other large- scale events. The network’s software can both analyze weather patterns and do limited weather prediction for any location on the planet’s surface (Academics: Meteorology skill of 60).\nThese satellites also provide a network of communications relays so that anyone with a radio booster can communicate with anyone else with a radio booster, anywhere on the planet. This effectively facilitates a global mesh for anyone with a radio booster. The satnet transmissions are also boosted, so anyone with basic mesh inserts or an ecto can receive its broadcasts.\nThough this is a large and pricey piece of gear, the advantages it provides are great enough to justify the cost and difficulty of transport.",
    price = Cost.High,
    source = Sources.gatecrashing,
    sourcePage = 154
  );

  // Panopticon
  val neocetTranslator = Gear(
    name = "Neo-cetacean Translation Device",
    category = c,
    descr =
      "This dime-sized device is worn behind the left ear. It perceives ultrasonic frequencies and translates the whistles, clicks, and bursts of neo-cetacean into the transhuman language of the user’s choice and transmits it directly through the skull to the inner ear. The device is, of course, waterproof and works out to the range of normal neo-cetacean hearing. A linked ultrasonic emitter, usually worn on the belt, allows for translation in the other direction. Neo-cetacean is a primitive language, and translations are often muddy at best. This device has Exotic Language: Neo-Cetacean at 50.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 150
  );

  val hypersonicCommunicator = Gear(
    name = "Hypersonic Communicator",
    category = c,
    descr =
      "This device allows the user to transmit audio in a beam, so that the directed sound is only audible at the targeted position. When pointed at a person, the target will hear the transmission as if the sound were in their own head. Used commonly for advertising, museum displays, art galleries, and similar purposes, portable hypersonic beam devices also enable people to communicate without fear of eavesdropping and without having to rely on insecure mesh transmissions. The drawback to hypersonic beams is that they are line of sight and will be disrupted by anyone or anything passing through them, so they are ideal for close quarters or non-busy environments. Hypersonic communicators are small devices. They do not work in vacuum, but in atmosphere the beam is unaffected by nearby loud noises.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 150
  );

  val list: List[Gear] = Macros.memberList[Gear];
}
