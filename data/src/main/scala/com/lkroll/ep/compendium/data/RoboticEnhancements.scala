package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object RoboticEnhancements {
  import MorphType._;
  import CompendiumRefImplicits._;

  val c = "Robotic Enhancements";

  // Armor
  val heavyCombatArmour = Augmentation(
    name = "Heavy Combat Armor",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The synthmorph’s frame is loaded with armor that offers protection from heavy weapons for serious combat operations. This modification is bulky and noticeable; the bot frame is encased in a heavy-duty carapace. It increases the bot’s built-in Armor by +16/+16. The shell’s mobility systems and power output are also enhanced to deal with the extra load.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 310
  );

  val industrialArmour = Augmentation(
    name = "Industrial Armor",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell is equipped with protection against collisions, extreme weather, industrial accidents, and similar wear-and-tear. Increase the bot’s built-in Armor rating by +10/+10.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 310
  );

  val lightCombatArmour = Augmentation(
    name = "Light Combat Armor",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The synthmorph’s frame is protected by armor designed for policing and security duties. This increases the bot’s built-in Armor by +14/+12.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 310
  );

  // Mobility Systems
  val hopper = Augmentation(
    name = "Hopper",
    category = c,
    appliesTo = List(Synthmorph),
    descr = "Hoppers have two or more legs designed to propel the morph forward or up, much like a frog or grasshopper.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 310
  );

  val hovercraft = Augmentation(
    name = "Hovercraft",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell uses an impeller to blast a cushion of high-pressure air off the surface below, repelling the frame off the ground (modern hovercraft do not use rubber skirts). Most hovercraft travel a meter or so above the ground, but can temporarily levitate themselves higher for short periods.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  val ionic = Augmentation(
    name = "Ionic",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell uses principles of magnetohydrodynamics to levitate and fly, by ionizing surrounding air into plasma to create lift and momentum. The shell is also spun for stability. This system does not work in vacuum, but an underwater version uses the same mechanics for propulsion in liquid environments.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 310
  );

  val microlight = Augmentation(
    name = "Microlight",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Popular in low-grav and microgravity environments, microlights encompass several types of ultralight or lighter-than-air systems, such as powered paragliders, autogyros, balloons, aerostats, and blimps. These systems do not work in vacuum.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  val roller = Augmentation(
    name = "Roller",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Only for circular shells, this system allows the synthmorph to roll like a ball. The shell rolls around an interior axle, propelled by a motor-driven pendulum.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 310
  );

  val rotorcraft = Augmentation(
    name = "Rotorcraft",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Rotating blades create lift, allowing the shell to move and hover like a helicopter. Most models use tilt-rotors or tilt-wings so that the rotor-blades may be moved forward (for faster propeller-like propulsion) and for better maneuverability in zero-G. This system does not work in vacuum.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  val snake = Augmentation(
    name = "Snake",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Commonly used by slitheroids, these shells use lateral undulation, flexing their body from left to right and waving their frame forward. Such shells may also use sidewinding or a concertina motion (straightening forward, then retracting the rear) to move. They also featured gyroscope stabilization so that they may circle into a hoop and roll like a wheel.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 310
  );

  val submarine = Augmentation(
    name = "Submarine",
    category = c,
    appliesTo = List(Synthmorph),
    descr = "Designed for undersea mobility, subma- rine shells use propellers or pumpjets to push through water.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 310
  );

  val tracked = Augmentation(
    name = "Tracked",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Tracked shells use smart rotating treads to work their way across surfaces that would bog down other ground vehicles. They can prop themselves up in order to overcome taller obstacles or to lay themselves down to bridge across a ditch or crevice.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  val thrustVector = Augmentation(
    name = "Thrust Vector",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "These shells use either turbofans or turbojets to create atmospheric lift with a set of wings. The engines may be maneuvered to point and generate thrust in different directions for vertical takeoffs/landings and better maneuverability in zero-G.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 310
  );

  val walker = Augmentation(
    name = "Walker",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Walkers use two or more limbs to walk or crawl across a surface. Many use grip pads (p. 305) or magnetic systems (p. 311) to stick to surfaces.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  val wheeled = Augmentation(
    name = "Wheeled",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Most wheeled shells feature smart spokes that allow the wheels to conform their shape to obstacles and even climb stairs. Some low-grav shells feature puncture-resistant and self-repairing compressed-gas tires.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  val winged = Augmentation(
    name = "Winged",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Primarily used by smaller shells, this system of four independently controlled wings allows the shell to hover or move rapidly in any direction.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  // Physical Modifications
  val extraLimbs = Augmentation(
    name = "Extra Limbs",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell is equipped with one or more extra limbs. A character using these limbs suffers an off-hand modifier (see Wielding Two or More Weapons, p. 206. These limbs may be arms (with hand/grippers/etc.), legs, tentacle-like, or otherwise articulated and/or prehensile. Some shells have rotational frames that allow them to move limbs around their body.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 310
  );

  val fractalDigist = Augmentation(
    name = "Fractal Digits",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The synthmorph has “bush robot” digits that are capable of splitting into smaller digits, and those smaller digits into micro digits, and so on down to the micrometer scale, allowing for ultra-fine manipulation. Apply a +20 COO modifier where such fine manipulation is a factor (such as detailed repair work). The bot must have functioning nanoscopic vision (p. 311) to get this bonus.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 311
  );

  val hiddenCompartment = Augmentation(
    name = "Hidden Compartment",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell has a concealed aperture for a shielded interior compartment, ideal for storing valuables or smuggling contraband. Apply a –30 modifier to detect this compartment either manu- ally or with sensor scans.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  val magneticSystem = Augmentation(
    name = "Magnetic System",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "A magnetic system allows the shell to cling to most ferrous materials. This enables the character to walk in zero-G situations by magnetically adhering surfaces, hang upside down, and hold onto devices without letting them drop or drift away. The shell receives a +30 modifier whenever maintaining a magnetic hold on something.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  val modularDesign = Augmentation(
    name = "Modular Design",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This shell is designed to lock together with similar modular morphs in different architectural patterns to create larger gestalt forms.When united with other modules, the group is treated as a single unit/morph, with shared capabilities. If damaged and then separated, damage and wounds are distributed evenly between modules; uneven amounts are allocated randomly. The exact capabilities of different shapes depends on the composition, and is largely left in the gamemaster’s hands. ",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 311
  );

  val pneumaticLimbs = Augmentation(
    name = "Pneumatic Limbs",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The limbs are equipped with pneumatic cylinder systems that can generate up to 7,000 newtons of force. This allows the shell to push off and make impressive jumps (a synth of human size/weight can leap over 2 meters up). Apply a +20 to Freerunning Tests. A pneumatic limb used to strike an opponent in unarmed combat inflicts an extra 1d10 damage.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  val retractingLimbs = Augmentation(
    name = "Retracting/Telescoping Limbs",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell’s limbs can either be retracted completely inside it’s frame and/or extended for extra length (usually up to 1 or 2 meters extra). Telescoping limbs may give the shell a reach advantage in melee combat (p. 204).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  val shapeAdjusting = Augmentation(
    name = "Shape Adjusting",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This shell is made from smart materials that allow it to alter its shape, altering its height, width, circumference, and external features, while retaining the same mass. This modification is typically employed to reshape the morph into special configurations adapted to specific tasks (for example, lengthening to crawl through a tunnel, widening its base for stability, expanding to reach out and attach to multiple access point simultaneously, and so on). This mod also allows the morph to change its fea- tures for disguise purposes; apply a +30 modifier to Disguise Tests.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 311
  );

  val structuralEnhancement = Augmentation(
    name = "Structural Enhancement",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This modification bolsters the shell’s structural integrity, boosting its ability to take damage. Increase Durability by 10 and Wound Threshold by 2.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 311
  );

  val swarmComposition = Augmentation(
    name = "Swarm Composition",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell is not a single unit but a swarm of hundreds of insect-sized robotic microdrones. Each individual “bug” is capable of crawling, rolling, hopping several meters, or using nanocopter fan blades for airlift. The cyberbrain, sensor systems, and implants are distributed through- out the swarm. Though the swarm can “meld” together into a roughly child-sized shape, the swarm is incapable of tackling physical tasks like grabbing, lifting, or holding as a unit. Individual bugs, however, are quite capable of interfacing with electronics. Swarms cannot carry most gear or wear armor, and may not make strength-based SOM-linked skill tests. For combat purposes, use the same rules as given for nanoswarms (p. 328). Damage and wounds are reflected as damaged/massacred bugs. The swarm may be “healed” by manufacturing more bugs.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 311
  );

  val syntheticMask = Augmentation(
    name = "Synthetic Mask",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The synthmorph is equipped with a realistic outer casing of faux-skin and carefully sculpted to pass as a biomorph (perhaps even a particular person). The morph can cry, spit, have sex, and will even bleed if cut. Only a detailed physical examination or a radar, terahertz, or x-ray scan will detect the synthmorph’s true nature, and even then such exams/scans suffer a –30 modifier.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 311
  );

  val weaponMount = Augmentation(
    name = "Weapon Mount",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell carries a built-in (or built-on) weapon. This weapon mount may be either internal (concealed, only weapons small in relation to the shell may fit, –30 to Perception Tests to detect) or external (visible). It may be fixed (one direction only), swiveling (limited field of fire), or on an articulated mount (all directions).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  val weaponMountConc = Augmentation(
    name = "Weapon Mount (Concealed)",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell carries a built-in weapon. This weapon mount is internal (concealed, only weapons small in relation to the shell may fit, –30 to Perception Tests to detect). It may be fixed (one direction only), swiveling (limited field of fire), or on an articulated mount (all directions).",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 311
  );

  val weaponMountArt = Augmentation(
    name = "Weapon Mount (Articulated)",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell carries a built-in (or built-on) weapon. This weapon mount may be either internal (concealed, only weapons small in relation to the shell may fit, –30 to Perception Tests to detect) or external (visible). It is an articulated mount (all directions).",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 311
  );

  // Sensors
  val vision360 = Augmentation(
    name = "360º Vision",
    category = c,
    appliesTo = List(Synthmorph),
    descr = "The shell’s visual sensors are situated for a 360-degree field of vision.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  val chemicalSniffer = Augmentation(
    name = "Chemical Sniffer",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This sensor detects molecules in the air and analyzes their chemical composition. It enables Chemistry Tests to determine the presence of gases, including toxins and other fumes. It can also detect the presence of explosives and firearms.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 311
  );

  val lidar = Augmentation(
    name = "Lidar",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This sensor emits laser light and measures the reflections to judge range, speed, and image the target. See Using Enhanced Senses, p. 302.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  val nanoVision = Augmentation(
    name = "Nanoscopic Vision",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell’s visual sensors can focus like a microscope, using advanced superlens techniques to beat the optical diffraction limit and image objects as small as a nanometer. This allows the character to view and analyze objects as small as blood cells and even individual nanobots. The synthmorph must stay relatively steady to view objects at this scale.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 311
  );

  val radar = Augmentation(
    name = "Radar",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This sensor system bounces radio or micro- waves off targets and measures the reflected waves to judge size, composition, and motion. See Using Enhanced Senses, p. 302.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 311
  );

  // Panopticon
  val invisibility = Augmentation(
    name = "Invisibility",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This enhancement works much like the invisibility cloak (p. 316, EP). The shell is completely sealed within a layer of metamaterials with a negative refractive index, making it invisible to the microwave and ultraviolet wavelengths and everything in between. This modification can only be applied to shells on which the entire outer surface can be coated (ionic, roller, snake, thrust vector, walker, wheeled, winged). At the gamemaster’s discretion, this enhancement may not be applied to certain shells due to their configuration. Shells with this enhancement are effectively blinded, as they cannot use visual sensors (though they can view via meshed remote sensors), though they can also create temporary “windows” as with invisibility cloaks. This mod is not compatible with the radar absorbent, reduced signature, or radar invisibility mods.",
    price = Cost.Expensive,
    source = Sources.panopticon,
    sourcePage = 149
  );

  val radarAbsorbent = Augmentation(
    name = "Radar Absorbent",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "The shell is constructed with materials that either pass, absorb, or trap radar and terahertz waves, reducing its sensor signature. Though sensor processing has improved significantly, radar absorbent materials can still provide some protection from detection. Apply a −20 modifier to detect the shell with radar and terahertz frequencies. This mod is compatible with the reduced signature mod.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 149
  );

  val reducedSignature = Augmentation(
    name = "Reduced Signature",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This shell has been structurally modified to provide a much smaller radar cross-section. Shells with this modification have a very obvious streamlined, rounded and/or angular look, with no bulky pods or modules. External engines are instead incorporated into the frame. This enhancement is normally only applied to winged, rotorcraft, ionic, or thrust vector shells; apply a −30 modifier to detect these shells with radar and terahertz frequencies. For all other shells, a −10 modifier is applied. This modifier may not be applied to hoppers, tracked shells, or walkers while they are moving, as their mobility systems negate the advantage. The modifier from this enhancement is cumulative with the radar absorbent enhancement.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 149
  );

  val radarInvsibility = Augmentation(
    name = "Radar Invisibility",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This shell is coated with a layer of radar-transparent metamaterials with a negative refractive index. It is effectively invisible to radar waves; they simply bend around the shell as if it were not there. The shell cannot be detected by radar, but is visible at other frequencies. This mod is not compatible with the invisibility, radar absorbent, or reduced signature mods, nor may it be used in conjunction with an invisibility cloak. Shells with this mod cannot detect radar themselves.",
    price = Cost.Expensive,
    source = Sources.panopticon,
    sourcePage = 150
  );

  // Rimward
  val cryonicProtection = Augmentation(
    name = "Cryonic Protection",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Even synthmorphs can have difficulty with the cryonic temperatures found in the outer system. While almost any synthmorph can operate normally for at least an hour at these temperatures, longer exposure can cause materials to get brittle and joints to lock up, especially in an atmosphere thick enough to conduct heat away from the morph. This augmentation uses the morph’s nuclear battery to slightly warm its surface, while also coating the morph with a thin layer of insulation. Cryonic protection allows synthmorphs to operate indefinitely in the coldest temperatures found in the solar system.",
    price = Cost.Low,
    source = Sources.rimward,
    sourcePage = 190
  );

  val egoSharing = Augmentation(
    name = "Ego Sharing",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This enhancement allows more than one ego to access the internal systems and controlling functions of a single synthmorph, bot, or vehicle at one time. Each ego requires its own cyberbrain. Command responsibilities are usually divided into appropriate sectors of control. For example, one ego is responsible for physical movement, another handles data analysis, a third operates weapon controls, and so on. Each ego acts on its own Initiative; the morph may only move on one ego’s action and each weapon system and enhancement may only be actively used by one ego per Combat Turn, though other egos may passively access data from enhancements and systems used by others. Morph aptitude modifiers and bonuses from enhancements apply to all egos equally. No Speed-boosting enhancements may be used with this morph.",
    price = Cost.Expensive,
    source = Sources.rimward,
    sourcePage = 190
  );

  val smartWings = Augmentation(
    name = "Smart Wings",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This augmentation consists of a smart material coating on the morph’s arms. With a Quick Action, the synthmorph can extend or retract smart-material wings with a wingspan of 8 meters. In normal atmospheric pressure, the synthmorph can fly at speeds of up to 100 kph as long as the surface gravity is less than 0.15 g. They may also be used for gliding (see Gliding Membranes, p. 166, Sunward). When retracted, this augmentation is hidden. This mod is very common for synthmorphs on Titan and in various large low gravity habitats throughout the outer system. Large or heavy morphs may not use it.",
    price = Cost.Low,
    source = Sources.rimward,
    sourcePage = 190
  );

  // Sunward
  val extremeHeatShielding = Augmentation(
    name = "Extreme Heat Shielding",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This enhancement bolsters the synthmorph’s tolerance to extremely high temperatures with heat-resistant materials, heat sinks, and bulky coolant systems. This modification increases the morph’s Durability by 25% while reducing its Movement Rate by half and modifying COO by –10. Morphs with his augmentation can withstand temperatures up to 500ºC.",
    price = Cost.Expensive,
    source = Sources.sunward,
    sourcePage = 166
  );

  val extremePressureAdapation = Augmentation(
    name = "Extreme Pressure Adaptation",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "Morphs with this mod undergo serious structural reinforcement, enabling them to withstand pressure of up to 100 atmospheres. This modification increases the morph’s Durability by 50% while reducing its Movement Rate by half and modifying COO by –10.",
    price = Cost.Expensive,
    source = Sources.sunward,
    sourcePage = 167
  );

  val radiationShielding = Augmentation(
    name = "Radiation Shielding",
    category = c,
    appliesTo = List(Synthmorph),
    descr =
      "This enhancement hardens the morph to exposure from electromagnetic and ionizing radiation. This will protect the morph in most situations that would be harmful to others, but at the gamemaster’s discretion is only of limited effectiveness against extremely powerful sources of radiation (such as Jupiter’s elec- tromagnetic field) over prolonged periods.",
    price = Cost.High,
    source = Sources.sunward,
    sourcePage = 167
  );

  val list: List[Augmentation] = Macros.memberList[Augmentation];
}
