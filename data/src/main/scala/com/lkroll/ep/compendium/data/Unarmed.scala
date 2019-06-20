package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Unarmed {
  val biowareClaws = Weapon(
    name = "Bioware Claws",
    `type` = WeaponType.Unarmed,
    descr =
      "The morph has retractable claws like those of a cat. These claws do not interfere with the character’s manual dexterity and are razor sharp. However, they are relatively small and only do 1d10 + 1 + (SOM ÷ 10) damage, with an AP of –1. As a result, they are legal in almost all habitats and are considered tools as much as weapons.",
    damage = (1.d10 + 1).kinetic,
    effect = None,
    ap = -1,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase"
  );

  val cyberclaws = Weapon(
    name = "Cyberclaw",
    `type` = WeaponType.Unarmed,
    descr =
      "The bones on the back of the morph’s hand are bonded to smart material claws. These claws can extend through concealed ports in the morph’s skin and extend 6 inches past the morph’s knuckles. These razor-sharp weapons inﬂict 1d10 + 3 + (SOM ÷ 10) damage and have an AP of –2. If combined with eelware (p. 304), they can also inﬂict electric shocks. Likewise, cyberclaws can also deliver poison or nanotoxins secreted from a poison gland (p. 305) or implanted nanotoxins.",
    damage = (1.d10 + 3).kinetic,
    effect = None,
    ap = -2,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase"
  );

  val densiplastGloves = Weapon(
    name = "Densiplast Gloves",
    `type` = WeaponType.Unarmed,
    descr = "These gloves extra-harden when activated, for extra punch.",
    damage = (1.d10 + 2).kinetic,
    effect = None,
    ap = 0,
    price = Cost.Trivial,
    range = Range.Melee,
    source = "Eclipse Phase"
  );

  val eelware = Weapon(
    name = "Eelware",
    `type` = WeaponType.Unarmed,
    descr =
      "Derived from electric eel genetics, a character can have eelware implanted so that it connects to a network of bioconductors in the hands and feet (or other limbs), allowing the character to generate stunning shocks with a touch. Eelware inﬂicts shock damage (p. 204) exactly like a pair of shock gloves. Eelware can also be used to power implants and specially designed handheld devices by touch. ",
    damage = (0.d10 + 0),
    effect = Some("Shock"),
    ap = 0,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase"
  );

  val shockGloves = Weapon(
    name = "Shock Gloves",
    `type` = WeaponType.Unarmed,
    descr =
      "When activated, these gloves deliver an incapacitating shock along with every punch or grab. Note that the effect is the same whether wearing one glove or two.",
    damage = (1.d10 + 0).kinetic,
    effect = Some("Shock"),
    ap = 0,
    price = Cost.Low,
    range = Range.Melee,
    source = "Eclipse Phase"
  );

  val unarmed = Weapon(
    name = "Unarmed",
    `type` = WeaponType.Unarmed,
    descr = "Hitting people with your fists and feet using Unarmed Combat skill.",
    damage = (1.d10 + 0).kinetic,
    effect = None,
    ap = 0,
    price = Cost.None,
    range = Range.Melee,
    source = "Eclipse Phase"
  );

  val list: List[Weapon] = Macros.memberList[Weapon];
}
