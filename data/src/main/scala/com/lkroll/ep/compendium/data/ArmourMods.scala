package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object ArmourMods {

  val ablativePatches = ArmourMod(
    name = "Ablative Pacthes",
    armour = (4, 2),
    descr =
      "These thin and light slap-on patches of stick to armor and are designed to absorb heat and energy from beams and explosions, safely vaporizing and blowing hot gas away. Ablative patches increases the Armor Value by +4/+2, but each hit reduces both the energy and kinetic value of the ablative armor by 1.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 313
  );

  val chameleonCoating = ArmourMod(
    name = "Chameleon Coating",
    descr = "This provides the armor with the same effect as the chameleon cloak (p. 315).",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 313
  );

  val fireproofing = ArmourMod(
    name = "Fireproofing",
    armour = (2, 0),
    descr =
      "Fireproofing includes the addition of heat-resistant ceramic or fire-resistant layers, both capable of withstanding extremely high temperatures. Fireproofing increases the Armor Value by +2/+0, and provides an additional 10 points of armor against heat or fire specifically.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 313
  );

  val immunogenic = ArmourMod(
    name = "Immunogenic System",
    descr =
      "The immunogenic mod adds an active nanobot swarm, maintained by a specialized hive, that coats the outer layer of armor and also the non-armored parts of the wearer’s morph. It acts as an outer immune system designed to neutralize toxic agents and nanotoxins with which it comes into contact. This provides immunity to drugs, toxins, and nanotoxins applied dermally, such as with a slap patch or splash grenade. It has no effect on inhaled, oral, or injected drugs (including coated weapons).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 313
  );

  val lotusCoating = ArmourMod(
    name = "Lotus Coating",
    descr =
      "The armor has been impregnated with a superhydrophic coating (contact angle of around 170°) that repels all water-like liquids. If the armor is splashed by liquid toxins or chemicals, the effect is reduced since the liquids starts to roll off the armor. Apply a +30 modifier when defending against liquid-based attacks.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 313
  );

  val offensiveArmor = ArmourMod(
    name = "Offensive Armor",
    descr =
      "When activated, the outer layer of this armor is rigged to shock anyone or anything that contacts it with electricity. Treat as a shock attack, p. 204.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 313
  );

  val reactiveCoating = ArmourMod(
    name = "Reactive Coating",
    armour = (5, 5),
    descr =
      "A thick layer of advanced nanotech is applied to the armor, protecting it with a colony of nanobots designed to sense incoming attacks. When an attack strikes the coating, it deto- nates to disrupt the attack. Bursts and full autofire are treated as a single attack. A reactive coating increases the Armor Value by +5/+5, but each detonation automatically inflicts 1 point of damage on the wearer. Reactive armor also works against melee attacks, but the attacker also suffers 1d10 ÷ 2 (round up) points of damage per attack (armor protects) from the microexplosion. Reactive coating only works against 5 attacks, after which the specialized nanobot hive replenishes the coating at the rate of 1 use per hour.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 313
  );

  val refractiveGlazing = ArmourMod(
    name = "Refractive Glazing",
    armour = (3, 0),
    descr =
      "A combination of reflectors, refractive metamaterials, and an energy transfer system with heat radiators provides extra protection against energy weapons. Increase the Armor Value by +3/+0. ",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 313
  );

  val selfHealing = ArmourMod(
    name = "Self Healing",
    descr = "The armor is equipped with a nanohive that acts like repair spray (p. 333).",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 313
  );

  val shockProof = ArmourMod(
    name = "Shock Proof",
    descr =
      "Shock proof armor is electronically insulated to discharge and reduce the effect of shock weapons. Apply an additional +10 modifier when resisting the effects of shock batons (p. 335).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 313
  );

  val thermalDampening = ArmourMod(
    name = "Thermal Dampening",
    descr =
      "Thermal dampening obfus- cates heat signatures by converting body heat into electric energy. It makes the target more difficult to spot with thermal sensors; apply a –30 modifier for Perception Tests.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 313
  );

  // Rimward Mods
  val stasisModule = ArmourMod(
    name = "Stasis Module",
    descr =
      "This modification may be applied to any type of vacsuit or other fully enclosed suit of armor. When activated, it places the wearer in a medical stasis, preserving the body and mind. Characters in stasis cannot act and are considered unconscious. This module may be linked to the user's mesh insert medical sensors, triggered to activate if the wearer's Durability drop below a pre-set threshold.",
    price = Cost.Low,
    source = Sources.rimward,
    sourcePage = 191
  );

  val list: List[ArmourMod] = Macros.memberList[ArmourMod];
}
