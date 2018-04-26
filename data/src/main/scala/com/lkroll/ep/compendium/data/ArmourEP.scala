package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

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

  val bodyArmourLight = Armour(
    name = "Body Armour (Light)",
    descr = "These high performance armor outfits protect the wearer from head to toe. An integrated armor vest is supplemented with increased protection on the limbs and joints, while still managing to be flexible and non-restrictive. Body armor is typically worn by security and police forces, and supplemented with a helmet. It provides an Armor Value of 10/10.",
    armour = (10, 10),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312);

  val bodyArmourHeavy = Armour(
    name = "Body Armour (Heavy)",
    descr = "Similar to light body armor, but with extra protective layers, often ergonomically manufactured to conform to a specific character’s body, and an environmental seal with climate control to protect the wearer from hostile environments. It provides an Armor Value of 13/13.",
    armour = (13, 13),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 312);

  val crashSuitI = Armour(
    name = "Crash Suit (Inactive)",
    descr = "Designed for both industrial work-site safety and protection from accidental zero-G collisions, crash suits are also favored by sports enthusiasts and explorers. The basic jumpsuit offers comfortable protection equal to that of armor cloth- ing. When activated with an electronic signal, however, elastic polymers within the suit stiffen and form rigid impact protection for vital areas. Crash suits provide an Armor Value of 3/4 when inactive.",
    armour = (3, 4),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312);

  val crashSuitA = Armour(
    name = "Crash Suit (Active)",
    descr = "Designed for both industrial work-site safety and protection from accidental zero-G collisions, crash suits are also favored by sports enthusiasts and explorers. The basic jumpsuit offers comfortable protection equal to that of armor cloth- ing. When activated with an electronic signal, however, elastic polymers within the suit stiffen and form rigid impact protection for vital areas. Crash suits provide an Armor Value of 4/6 when activated.",
    armour = (4, 6),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312);

  val helmetLight = Armour(
    name = "Helmet (Light)",
    descr = "This armor accessory is usually worn with body armor. Light helmets are open, whereas full helmets latch on and provide an environmental seal with a 12 hour supply of air. Light helmets provide an Armor Value bonus of +2/+2. Helmets are often equipped with an ecto (p. 325), a radio booster (p. 314), and sensors equal to specs (p. 326).",
    accessory = true,
    armour = (2, 2),
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 312);

  val helmetFull = Armour(
    name = "Helmet (Full)",
    descr = "This armor accessory is usually worn with body armor. Light helmets are open, whereas full helmets latch on and provide an environmental seal with a 12 hour supply of air. Full helmets add +3/+3. Helmets are often equipped with an ecto (p. 325), a radio booster (p. 314), and sensors equal to specs (p. 326).",
    accessory = true,
    armour = (3, 3),
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 312);

  val riotShield = Armour(
    name = "Riot Shield",
    descr = "Used for mob suppression, riots shields are light-weight, tough, and may be set to electrify on command, stunning anyone who comes into contact with the outer surface (treat as a see shock attack, p. 204). Riot shields provide an Armor Value bonus of +3/+2.",
    accessory = true,
    armour = (3, 2),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312);

  val secondSkin = Armour(
    name = "Second Skin",
    descr = "This lightweight bodysuit, woven from spider silks and fullerenes, is typically worn as an underlayer, though some athletes use it as a uniform. It provides minimal protection, but may be worn with other armor without penalty. It provides an Armor Value of 1/3.",
    accessory = true,
    armour = (1, 3),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312);

  val smartSkin = Armour(
    name = "Smart Skin",
    descr = "Smart skin is an advanced nanofluid that covers the wearer’s skin. It resembles liquid mercury but retains the texture and flexibility of normal skin until activated, at which point the material becomes rigid enough to protect the wearer and distribute the kinetic energy (though still flexible enough at the joints not to impede movement). A specialized hive, worn by the character, replenishes the nanobots and stores them when not in use. Deploying the nanobots across the body takes a full Action Turn. Smart skin has an Armor Value of 3/2, and may be worn with other armor without penalty.",
    accessory = true,
    armour = (3, 2),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312);

  val sprayArmour = Armour(
    name = "Spray Armour",
    descr = "This fast armor application comes in a spray can and disperses a smart chemical polymer that sticks to bare flesh (but does not adhere to hair and eyes). The polymer solidifies into a form fitting body armor fabric when exposed to body temperature with the look and feel of a latex suit. Spray armor does not work on synthetic morphs or on clothing or other armor. The color and feel of the armor can be adjusted with electric currents and additional polymers, making it popular among some socialite and nightlife scenes. The spray-on armor does not wash off, but degrades 1 point of armor (both energy and kinetic) every 12 hours. It may be removed with a special nanotech solvent. Spray armor has an Armor Value of 2/2.",
    //accessory = true, UNCLEAR
    armour = (2, 2),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 313);

  // from EverydayTech
  val smartVacClothing = Armour(
    name = "Smart Vac Clothing",
    descr = "Like regular smart clothing, this outfit can also transform into a light vacsuit (p. 333). It also functions as armor, rating 2/4.",
    armour = (2, 4),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 325);

  val list: List[Armour] = Macros.memberList[Armour];
}
