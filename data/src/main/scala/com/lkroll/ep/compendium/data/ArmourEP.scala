package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object ArmourEP {

  val armourClothing = Armour(
    name = "Armour Clothing",
    descr =
      "The extra-resilient organoweave fibers and fullerene materials that offer basic protection against kinetic and energy weapons can be woven in with normal smart materials to create a wide range of discreet armor clothing that provides a subtle level of security. Such protective garments are indistinguishable from regular clothing and come in all styles and designs. Armor clothing provides an Armor Value of 3/4.",
    armour = (3, 4),
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 312
  );

  val armourVest = Armour(
    name = "Armour Vest",
    descr =
      "Armor vests provide more thorough protection to a body’s vital areas, covering the abdomen and torso completely, protecting the neck with a rigid collar, and even providing wrap-under protection for the groin. Though armor vests are not bulky, they are obvious as armor. Armor vests may be worn with armor clothing without penalty. Armor vests provide an Armor Value of 6/6.",
    accessory = true,
    armour = (6, 6),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312
  );

  val bodyArmourLight = Armour(
    name = "Body Armour (Light)",
    descr =
      "These high performance armor outfits protect the wearer from head to toe. An integrated armor vest is supplemented with increased protection on the limbs and joints, while still managing to be flexible and non-restrictive. Body armor is typically worn by security and police forces, and supplemented with a helmet. It provides an Armor Value of 10/10.",
    armour = (10, 10),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312
  );

  val bodyArmourHeavy = Armour(
    name = "Body Armour (Heavy)",
    descr =
      "Similar to light body armor, but with extra protective layers, often ergonomically manufactured to conform to a specific character’s body, and an environmental seal with climate control to protect the wearer from hostile environments. It provides an Armor Value of 13/13.",
    armour = (13, 13),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 312
  );

  val crashSuitI = Armour(
    name = "Crash Suit (Inactive)",
    descr =
      "Designed for both industrial work-site safety and protection from accidental zero-G collisions, crash suits are also favored by sports enthusiasts and explorers. The basic jumpsuit offers comfortable protection equal to that of armor cloth- ing. When activated with an electronic signal, however, elastic polymers within the suit stiffen and form rigid impact protection for vital areas. Crash suits provide an Armor Value of 3/4 when inactive.",
    armour = (3, 4),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312
  );

  val crashSuitA = Armour(
    name = "Crash Suit (Active)",
    descr =
      "Designed for both industrial work-site safety and protection from accidental zero-G collisions, crash suits are also favored by sports enthusiasts and explorers. The basic jumpsuit offers comfortable protection equal to that of armor cloth- ing. When activated with an electronic signal, however, elastic polymers within the suit stiffen and form rigid impact protection for vital areas. Crash suits provide an Armor Value of 4/6 when activated.",
    armour = (4, 6),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312
  );

  val helmetLight = Armour(
    name = "Helmet (Light)",
    descr =
      "This armor accessory is usually worn with body armor. Light helmets are open, whereas full helmets latch on and provide an environmental seal with a 12 hour supply of air. Light helmets provide an Armor Value bonus of +2/+2. Helmets are often equipped with an ecto (p. 325), a radio booster (p. 314), and sensors equal to specs (p. 326).",
    accessory = true,
    armour = (2, 2),
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 312
  );

  val helmetFull = Armour(
    name = "Helmet (Full)",
    descr =
      "This armor accessory is usually worn with body armor. Light helmets are open, whereas full helmets latch on and provide an environmental seal with a 12 hour supply of air. Full helmets add +3/+3. Helmets are often equipped with an ecto (p. 325), a radio booster (p. 314), and sensors equal to specs (p. 326).",
    accessory = true,
    armour = (3, 3),
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 312
  );

  val riotShield = Armour(
    name = "Riot Shield",
    descr =
      "Used for mob suppression, riots shields are light-weight, tough, and may be set to electrify on command, stunning anyone who comes into contact with the outer surface (treat as a see shock attack, p. 204). Riot shields provide an Armor Value bonus of +3/+2.",
    accessory = true,
    armour = (3, 2),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312
  );

  val secondSkin = Armour(
    name = "Second Skin (Armour)",
    descr =
      "This lightweight bodysuit, woven from spider silks and fullerenes, is typically worn as an underlayer, though some athletes use it as a uniform. It provides minimal protection, but may be worn with other armor without penalty. It provides an Armor Value of 1/3.",
    accessory = true,
    armour = (1, 3),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312
  );

  val smartSkin = Armour(
    name = "Smart Skin",
    descr =
      "Smart skin is an advanced nanofluid that covers the wearer’s skin. It resembles liquid mercury but retains the texture and flexibility of normal skin until activated, at which point the material becomes rigid enough to protect the wearer and distribute the kinetic energy (though still flexible enough at the joints not to impede movement). A specialized hive, worn by the character, replenishes the nanobots and stores them when not in use. Deploying the nanobots across the body takes a full Action Turn. Smart skin has an Armor Value of 3/2, and may be worn with other armor without penalty.",
    accessory = true,
    armour = (3, 2),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 312
  );

  val sprayArmour = Armour(
    name = "Spray Armour",
    descr =
      "This fast armor application comes in a spray can and disperses a smart chemical polymer that sticks to bare flesh (but does not adhere to hair and eyes). The polymer solidifies into a form fitting body armor fabric when exposed to body temperature with the look and feel of a latex suit. Spray armor does not work on synthetic morphs or on clothing or other armor. The color and feel of the armor can be adjusted with electric currents and additional polymers, making it popular among some socialite and nightlife scenes. The spray-on armor does not wash off, but degrades 1 point of armor (both energy and kinetic) every 12 hours. It may be removed with a special nanotech solvent. Spray armor has an Armor Value of 2/2.",
    //accessory = true, UNCLEAR
    armour = (2, 2),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 313
  );

  // from EverydayTech
  val smartVacClothing = Armour(
    name = "Smart Vac Clothing",
    descr =
      "Like regular smart clothing, this outfit can also transform into a light vacsuit (p. 333). It also functions as armor, rating 2/4.",
    armour = (2, 4),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 325
  );

  // from Survival Gear
  val vacsuitLight = Armour(
    name = "Light Vacsuit",
    descr =
      "Everyone living in a sealed habitat owns at least one of these suits. They come in a variety of forms. Inexpensive versions are typically lightweight jumpsuits made of simple smart fabric that adjusts to fit and folds up small enough to fit into a coat pocket. The best models include suits of high-end smart clothing that can transform into a vacsuit and an advanced nanotech generator the size of a large orange that deploy nanobots that cover the user and fit together into a vacuum suit. Both can transform into a vacsuit in 2 full Action Turns and do so either on command or if their sensors reveal that life support is needed.\nAll models include a lightweight belt or torc containing a miniature oxygen tank and advanced rebreather unit that provides 3 hours of air. However, the suits contain no food or water recycling. All models include an ecto (p. 325) and a headlight, but typically little else beyond atmosphere sensors to let the wearer know when it is safe to take off the suit. They protect the wearer from temperatures from –75º to 100ºC. These vacuum suits also provide an Armor rating of 5/5 and instantly self-seal breaches unless more than 20 points of damage are inflicted at once.",
    armour = (5, 5),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 333
  );

  val vacsuitLightSmart = Armour(
    name = "Light Vacsuit (Smartfabric Suit)",
    descr =
      "Everyone living in a sealed habitat owns at least one of these suits. They come in a variety of forms. Inexpensive versions are typically lightweight jumpsuits made of simple smart fabric that adjusts to fit and folds up small enough to fit into a coat pocket. The best models include suits of high-end smart clothing that can transform into a vacsuit and an advanced nanotech generator the size of a large orange that deploy nanobots that cover the user and fit together into a vacuum suit. Both can transform into a vacsuit in 2 full Action Turns and do so either on command or if their sensors reveal that life support is needed.\nAll models include a lightweight belt or torc containing a miniature oxygen tank and advanced rebreather unit that provides 3 hours of air. However, the suits contain no food or water recycling. All models include an ecto (p. 325) and a headlight, but typically little else beyond atmosphere sensors to let the wearer know when it is safe to take off the suit. They protect the wearer from temperatures from –75º to 100ºC. These vacuum suits also provide an Armor rating of 5/5 and instantly self-seal breaches unless more than 20 points of damage are inflicted at once.",
    armour = (5, 5),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 333
  );

  val vacsuitStandard = Armour(
    name = "Standard Vacsuit",
    descr =
      "These suits resemble light vacsuits made from thicker and more durable materials that resist tearing and provides the wearer with light armor. They are fitted with more substantial life support belts that includes a maker (p. 328) capable of recycling all wastes and producing air for up to 48 hours and food and water indefinitely. The best suits are made of smart materials that can transform from standard clothing to vacuum suits in a single Action Turn, and will do so automatically if life support is needed. Each suit also contains an ecto (p. 325), a radio booster (p. 314), and sensors equal to specs (p. 326). These suits have an Armor rating of 7/7 and protect the wearer from temperatures from –175º to 140ºC. They can almost instantly seal any hole unless more than 30 points of damage are inflicted at once.",
    armour = (7, 7),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 333
  );

  val vacsuitStandardSmart = Armour(
    name = "Standard Vacsuit (Smartfabric Suit)",
    descr =
      "These suits resemble light vacsuits made from thicker and more durable materials that resist tearing and provides the wearer with light armor. They are fitted with more substantial life support belts that includes a maker (p. 328) capable of recycling all wastes and producing air for up to 48 hours and food and water indefinitely. The best suits are made of smart materials that can transform from standard clothing to vacuum suits in a single Action Turn, and will do so automatically if life support is needed. Each suit also contains an ecto (p. 325), a radio booster (p. 314), and sensors equal to specs (p. 326). These suits have an Armor rating of 7/7 and protect the wearer from temperatures from –175º to 140ºC. They can almost instantly seal any hole unless more than 30 points of damage are inflicted at once.",
    armour = (7, 7),
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 333
  );

  val hardsuit = Armour(
    name = "Hardsuit",
    descr =
      "This heavy-duty suit can almost be considered a miniature spaceship. Hardsuits look like large metallic ovals with jointed arms and legs. They are quite heavy, but the user can move relatively easily due to servo-assist motors in the major arm and leg joints. Unlike other vacsuits, they are solid and can resist both vacuum and up to 100 atmospheres of external pressure. Characters wearing hardsuits can safely explore the upper atmosphere of a gas giant. They are well armored against punctures and radiation and possess miniature plasma thrusters capable of delivering 0.01 g for 10 hours. A built-in high-quality maker produces sufficient food, air, and water for a user to remain in a hardsuit indefinitely. Explorers have used them continuously for up to 2 months. Their gloves incorporate smart materials that allow each hand to use the equivalent of a utilitool (p. 326). Hardsuits also contain radios and sensors equivalent to those on standard vacsuits. These suits are maintained by a fixer nanoswarm (p. 329), are instantly self-sealing of any breach unless more than 30 points of damage are inflicted at once, and protect the wearer from temperatures of –200º to 180ºC. Hardsuits have an Armor rating of 15/15. Occupants may only wear armor with an Armor rating (Energy or Kinetic) of 4 or less; this worn armor is cumulative without layering penalties.",
    armour = (15, 15),
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 334
  );

  // Gatecrashing
  val crasherSuit = Armour(
    name = "Crasher Suit",
    descr =
      "Recently developed by Omnicor, this is a high-end version of a standard vacsuit customized for a gatecrasher’s needs. It has all of the features of a standard smart fabric vacsuit (p. 333, EP) except that it provides 10/10 armor and is equipped with wrist-mounted tools (p. 309, EP) and a Life-Support Pack (p. 159). The suit’s gauntlets and boots are also hardened and provide an extra +1d10 DV on melee attacks.",
    armour = (10, 10),
    price = Cost.Expensive,
    source = Sources.gatecrashing,
    sourcePage = 157
  );

  val list: List[Armour] = Macros.memberList[Armour];
}
