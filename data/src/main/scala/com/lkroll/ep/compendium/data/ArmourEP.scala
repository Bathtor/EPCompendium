package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object ArmourEP {

  val armourClothing = Armour(
    name = "Armour Clothing",
    descr = "The extra-resilient organoweave fibers and fullerene materials that offer basic protection against kinetic and energy weapons can be woven in with normal smart materials to create a wide range of discreet armor clothing that provides a subtle level of security. Such protective garments are indistinguishable from regular clothing and come in all styles and designs. Armor clothing provides an Armor Value of 3/4.",
    armour = (3, 4),
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 312);

  val armourVest = Armour(
    name = "Armour Vest",
    descr = "Armor vests provide more thorough protection to a body’s vital areas, covering the abdomen and torso completely, protecting the neck with a rigid collar, and even providing wrap-under protection for the groin. Though armor vests are not bulky, they are obvious as armor. Armor vests may be worn with armor clothing without penalty. Armor vests provide an Armor Value of 6/6.",
    accessory = true,
    armour = (6, 6),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312);

  val list: List[Armour] = Macros.memberList[Armour];
}
