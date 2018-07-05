package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object WeaponAccessories {

  val armSlide = WeaponAccessory(
    name = "Arm Slide",
    descr = "This slide-mount can hold a pistol-sized weapon under a character’s sleeve, pushing the weapon into the character’s hand with an electronic signal or specific sequence of arm movements.",
    price = Cost.Low,
    source = Sources.ep, sourcePage = 342);

  val extendedMagazine = WeaponAccessory(
    name = "Extended Magazine",
    descr = "This ammunition case has an increased capacity. Increase the weapon’s ammo capacity by +50%. Only available for firearms and seekers.",
    magazineFactor = 1.5f,
    price = Cost.Low,
    source = Sources.ep, sourcePage = 342);

  // TODO missing stuff

  val laserSight = WeaponAccessory(
    name = "Laser Sight",
    descr = "This underbarrel laser emits a beam that places a glowing red dot on the target to assist targeting. Apply a +10 modifier to Attack Tests (not cumulative with a smartlink modifier). Laser sights may also be used to paint a target for laser-guided smart ammo or seekers. Infrared and ultraviolet lasers are also available, so that the dot is only visible to characters able to see in those spectrums.",
    attackBonus = 10,
    price = Cost.Low,
    source = Sources.ep, sourcePage = 342);

  // TODO missing stuff

  val smartlink = WeaponAccessory(
    name = "Smartlink",
    descr = "A smartlink system connects the weapon to the user’s mesh inserts, placing a targeting bracket in the character’s field of vision and providing range and targeting information. Apply a +10 modifier to the Attack Test. Smartlinks also incorporate a microcamera that allows the user to see what the weapon is pointed at, fire around corners, etc. Smartlinks also allow certain other types of weapon system control, such as changing flux ammo (p. 338) or programming seeker trigger conditions (p. 199).",
    attackBonus = 10,
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 342);

  // TODO missing stuff

  val list: List[WeaponAccessory] = Macros.memberList[WeaponAccessory];
}
