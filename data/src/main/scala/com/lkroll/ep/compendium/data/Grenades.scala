package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object Grenades {
  import WeaponType.{ Grenade, StandardGrenade, Microgrenade };
  import DamageType.{ Energy, Kinetic }
  import DamageArea.{ UniformBlast }
  import KineticAmmo.{ int2ap, int2dmg, inttup2dmg };
  import Missiles.{ dt2dtm, da2dam, str2dm };

  type GrenadeTemplate = (Grenade) => Weapon;

  def template(name: String, descr: String, apMod: APMod = APMod.Id,
               dmgMod: DamageMod = DamageMod.Id, typeMod: DamageTypeMod = DamageTypeMod.Id,
               areaMod: DamageAreaMod = DamageAreaMod.Id, price: Cost,
               source: String): GrenadeTemplate = (g: Grenade) => {
    val adjDmgMod = g.adjust(dmgMod);
    Weapon(
      s"$name ${g.label}",
      g,
      descr,
      adjDmgMod.modifyD10(0),
      adjDmgMod.modifyDiv(0, 1),
      adjDmgMod.modifyConst(0),
      typeMod.modify(DamageType.Energy),
      adjDmgMod.modifyEffect(None),
      apMod.modifyAP(0),
      g.adjust(areaMod).modify(DamageArea.Blast),
      price,
      g.range,
      None,
      source)
  };

  val d10half = DamageMod.Const(1, 0) ++ DamageMod.Half;

  val concussion = template(
    name = "Concussion",
    descr = "These devices emit a concussive blast designed to knock opponents off their feet and stun them. Any character caught within a base blast radius of 10 meters must make a SOM × 2 Test. If they fail, they are knocked down. If their MoF is 30+, they are additionally stunned until the end of the next Action Turn. Anyone caught in the blast radius suffers a –10 action modifier for the rest of that Action Turn.",
    dmgMod = d10half,
    typeMod = Energy,
    areaMod = UniformBlast(10),
    price = Cost.Moderate,
    source = Sources.ep);

  val emp = template(
    name = "EMP",
    descr = "EMP munitions fire off a strong electromagnetic pulse when they “detonate”. Since most electronics in Eclipse Phase are built with optical technology, and power supplies and sensitive microcircuits are shielded and surge-protected, this has no major damaging effect. Antennas, however, are vulnerable, especially finer wires like those used with mesh inserts. As a result, the primary effect of EMP is to disable radio communications—every radio within range of the blast is reduced to 1/10th the normal range. The base blast radius for EMP is 50 meters.",
    dmgMod = "EMP burst",
    areaMod = UniformBlast(50),
    price = Cost.High,
    source = Sources.ep);

  val frag = template(
    name = "Frag",
    descr = "Fragmentation explosives spread a cloud of lethal flechettes over the area of effect. They are resisted with kinetic armor.",
    apMod = -4,
    dmgMod = (3, 6),
    typeMod = Kinetic,
    price = Cost.Moderate,
    source = Sources.ep);

  val gas = template(
    name = "Gas/Smoke",
    descr = "Gas/smoke munitions emit a cloud of their contained substance. Smoke impedes sight by releasing thick fumes upon ignition of the seeker. The smoke can be of any color and is often heated (called thermal smoke) to obfuscate heat signatures moving through the smoke as cover. Note that gases dissipate much more quickly under certain environmental conditions (wind, rain, etc.)",
    price = Cost.Low,
    source = Sources.ep);

  val he = template(
    name = "High-Explosive",
    descr = "High-explosive seekers and grenades are designed to create a very destructive shock and heat wave. This damage is resisted with energy armor.",
    dmgMod = (3, 10),
    typeMod = Energy,
    price = Cost.Moderate,
    source = Sources.ep);

  val overload = template(
    name = "Overload",
    descr = "Overload grenades and seekers launch an all-out assault on the target’s sensory spectrum. This attack includes blinding by intense flashing light, a deafening thunderclap followed by intense ultra-sonic screaming, nausea-inducing malodorants, and infrasonic frequencies that can trigger unpleasant emotional responses (anxiety, uneasiness, extreme sorrow, nervous feelings of revulsion or fear). For an extra kick, overloads are also packed with 'stingballs' – rubber pellets that inflict pain when detonated near an under-armored target. Anyone caught in the base 10-meter blast radius must make a SOM + WIL Test. If they fail, they must immediately leave the area of effect. If they fail with an MoF of 30+, they are incapacitated for 3 Action Turns with disorientation and/or vomiting, after which they must roll again. Overload munitions remain in effect for 1 full minute. Anyone in the area of effect suffers a –30 action modifier, which reduces by 10 per Action Turn after they leave the area. Additionally, anyone facing the direction of the overload round suffers a –10 glare modifier (neutralized by anti-glare systems). Apply AVx2",
    dmgMod = d10half,
    typeMod = Kinetic,
    areaMod = UniformBlast(10),
    price = Cost.Moderate,
    source = Sources.ep);

  val plasmaburst = template(
    name = "Plasmaburst",
    descr = "Also called “hellballs,” these munitions release a burst of plasma upon detonation that causes searing heat and fire damage across the area of effect without the devastating shockwaves of explosions that might rebound in an enclosed environment and/or breach a habitat’s infrastructure.",
    apMod = -6,
    dmgMod = (3, 10),
    typeMod = Energy,
    price = Cost.High,
    source = Sources.ep);

  val splash = template(
    name = "Splash",
    descr = "Splash rounds spread a contained substance (drug, chemical, nanoswarm, paint) over a base 10-meter blast radius when they detonate.",
    areaMod = UniformBlast(10),
    price = Cost.Low,
    source = Sources.ep);

  val thermobaric = template(
    name = "Thermobaric",
    descr = "Thermobaric grenades and seekers utilize a more deadly form of explosion. When they detonate, they disperse a cloud of aerosol explosive over an area and then ignite, literally setting the air on fire, generating a devastating pressure wave, and sucking the oxygen out of the area. Thermobarics use the rules for uniform blast (p. 194) with an area of effect blast radius of 10 meters.",
    apMod = -10,
    dmgMod = (3, 5),
    typeMod = Energy,
    areaMod = UniformBlast(10),
    price = Cost.High,
    source = Sources.ep);

  val list: List[GrenadeTemplate] = Macros.memberList[GrenadeTemplate];

  val micro: List[Weapon] = list.map(t => t(Microgrenade));
  val standard: List[Weapon] = list.map(t => t(StandardGrenade));
}
