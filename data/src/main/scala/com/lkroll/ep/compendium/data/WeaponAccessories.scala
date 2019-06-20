package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object WeaponAccessories {

  val armSlide = WeaponAccessory(
    name = "Arm Slide",
    descr =
      "This slide-mount can hold a pistol-sized weapon under a character’s sleeve, pushing the weapon into the character’s hand with an electronic signal or specific sequence of arm movements.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 342
  );

  val extendedMagazine = WeaponAccessory(
    name = "Extended Magazine",
    descr =
      "This ammunition case has an increased capacity. Increase the weapon’s ammo capacity by +50%. Only available for firearms and seekers.",
    magazineFactor = 1.5f,
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 342
  );

  val gyroMount = WeaponAccessory(
    name = "Gyro Mount",
    descr =
      "This weapon harness features a gyro-stabilized weapon mount that keeps the weapon steady. Negates all modifiers from movement.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 342
  );

  val imagingScope = WeaponAccessory(
    name = "Imaging Scope",
    descr =
      "Imaging scopes attach to the top of the weapon and act like specs (p. 326). Scopes may also bend like a periscope, along a character to point the weapon and target around corners without leaving cover.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 342
  );

  val flashSuppressor = WeaponAccessory(
    name = "Flash Suppressor",
    descr =
      "This device obscures the muzzle flash on firearms, applying a –10 modifier on Perception Tests to locate a firing weapon by its flash.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 342
  );

  val laserSight = WeaponAccessory(
    name = "Laser Sight",
    descr =
      "This underbarrel laser emits a beam that places a glowing red dot on the target to assist targeting. Apply a +10 modifier to Attack Tests (not cumulative with a smartlink modifier). Laser sights may also be used to paint a target for laser-guided smart ammo or seekers. Infrared and ultraviolet lasers are also available, so that the dot is only visible to characters able to see in those spectrums.",
    attackBonus = 10,
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 342
  );

  val safetySystem = WeaponAccessory(
    name = "Safety System",
    descr =
      "A biometric (palmprint or voiceprint) or ego ID (p. 279) sensor is embedded in the weapon, disabling it if anyone other than an authorized user attempts to fire it.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 342
  );

  val shockSafety = WeaponAccessory(
    name = "Shock Safety",
    descr =
      "Just like a safety system, except that an unauthorized user is zapped with an electric shock. Treat as a shock baton (p. 335).",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 342
  );

  val silencer = WeaponAccessory(
    name = "Silencer/Sound Suppressor",
    descr =
      "This barrel-mounted accessory reduces the sound of a firearm’s discharge (they may not be used on railguns). Apply a –10 modifier on hearing-based Perception Tests to hear or locate the gun’s firing.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 342
  );

  val smartlink = WeaponAccessory(
    name = "Smartlink",
    descr =
      "A smartlink system connects the weapon to the user’s mesh inserts, placing a targeting bracket in the character’s field of vision and providing range and targeting information. Apply a +10 modifier to the Attack Test. Smartlinks also incorporate a microcamera that allows the user to see what the weapon is pointed at, fire around corners, etc. Smartlinks also allow certain other types of weapon system control, such as changing flux ammo (p. 338) or programming seeker trigger conditions (p. 199).",
    attackBonus = 10,
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 342
  );

  val smartmag = WeaponAccessory(
    name = "Smart Magazine",
    descr =
      "A smart magazine allows the character to pick and choose what ammo round will be fired with each shot. This system leaves less room for bullets, however, so reduce the weapon’s ammunition capacity by half (round up).",
    magazineFactor = 0.5f,
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 342
  );

  val extsmartmag = WeaponAccessory(
    name = "Extended Smart Magazine",
    descr =
      "A smart magazine allows the character to pick and choose what ammo round will be fired with each shot. This system leaves less room for bullets, however, so combined with the extended magazine, the ammo capacity is normal.",
    price = Cost.Moderate, // + Low
    source = Sources.ep,
    sourcePage = 342
  );

  val list: List[WeaponAccessory] = Macros.memberList[WeaponAccessory];
}
