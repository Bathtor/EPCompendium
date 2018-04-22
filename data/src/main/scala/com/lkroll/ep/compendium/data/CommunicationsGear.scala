package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object CommunicationsGear {

  val fiberopticCable = Gear(
    name = "Fiberoptic Cable",
    category = "Communications",
    descr = "Fiberoptic cables are used to establish wired connections between two devices. Given the ubiquity of radios and the tangled mess wires cause, they are typically only used for privacy (unlike radio communication, fiberoptic signals may not be intercepted) or in areas with heavy radio interference.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 313);

  val list: List[Gear] = Macros.memberList[Gear];
}
