package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object CovertTech {
  val c = "Covert and Espionage Tech";

  val chameleonCloak = Gear(
    name = "Chameleon Cloak",
    category = c,
    descr = "This loose, poncho-like cloak contains a network of sensors that perceive wavelengths from microwave to ultra-violet. A similar network of miniature emitters precisely replicate the information its sensors receive, making the wearer seem transparent to those wavelengths. A chameleon cloak allows a character to effectively become invisible as long as they are stationary or not moving faster than a slow walk. When worn by someone moving faster, the cloak still provides a +30 modifier to Infiltration Tests to avoid being seen or noticed.\nChameleon cloaks are not effective against radar, x-ray, or gamma-ray sensors. They do hide the character from thermal infrared, however, by absorbing the character’s body heat into its heat sink. The cloak can only absorb a character’s body heat for one hour before it must emit this heat. Heat emission also requires one hour, during which time the character is easily visible in the thermal infrared spectrum.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 315);

  val cot = Gear(
    name = "Covert Operations Tool (COT)",
    category = c,
    descr = "This handheld device is the ultimate in infiltration technology. It contains both smart matter micromanipulators, cutting tools, and an advanced nanotechnology generator capable of producing nanobots that can bore or cut through almost any material and disable or open almost any electronic lock.\nCutting out a lock or boring a 1-millimeter hole in a wall with a COT requires ((Durability + Armor) ÷ 10) seconds. Cutting out a 1-meter diameter hole in a wall requires ((Durability + Armor) ÷ 10) minutes. These same nanobots can later be used to repair this damage so that it is invisible to any but the most careful and detailed examination.\nA COT can easily open any old-fashioned mechanical lock simply by analyzing it and shaping an appropriate key, though this takes a full Action Turn. It can also open electronic locks by infiltrating them with nanobots that influence the lock's electronics, no matter what authentication system the lock uses. Opening electronic locks takes a full Action Turn, but success is practically guaranteed. Opening an electronic lock in this manner will, however, trigger an alarm and/or be logged as an event. For more details, see Electronic Locks, p. 291.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 315);

  val cuffband = Gear(
    name = "Cuffband",
    category = c,
    descr = "This smart plastic loop restricts around a prisoner’s limbs when activated. If the prisoner struggles, it will tighten more. Cuffbands will inform the user if they are cut or loosened and are electronically controlled, so the user can release the prisoner remotely. Some cuffband variants including a shock system (treat as a shock attack, p. 204.) to zap and restrain unruly prisoners.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 316);

  val dazzler = Gear(
    name = "Dazzler",
    category = c,
    descr = "The dazzler is a tiny laser system set on a rotating ball. When activated, it consistently spins and emits laser pulses in all directions. These laser pulses are not dangerous, but they detect the lenses of camera systems (including specs, viewers, and bot/synthmorph sensors) and repeatedly zap them with laser pulses of varying strength to overload and dazzle them. For as long as a dazzler is active, any camera system (visual, infrared, and ultraviolet) within line of sight and within 200 meters is blinded.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316);

  val disabler = Gear(
    name = "Disabler",
    category = c,
    descr = "This handy device emits an overloading surge that completely incapacitates and disables a synthetic morph or pod (anything with a cyberbrain) when it is plugged into an access jack and activated. The affected cyberbrain will be unable to function until the signal is deactivated, effectively shutting down the ego (or AI). In order to plug a disabler into an unwilling target, the target must first be grappled or a called shot must be successfully made in melee combat. This device does not work on larger synthetic morphs (like vehicles) or on cyberbrainless robots.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 316);

  val fiberEye = Gear(
    name = "Fiber Eye",
    category = c,
    descr = "This is a flexible and electronically controllable length of fiberoptic cable and viewer, which can be worked through cracks, under doors, and around corners to peep unobtrusively.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 316);

  val invisibilityCloak = Gear(
    name = "Invisibility Cloak",
    category = c,
    descr = "This cloak is made of metamaterials with a negative refractive index, so that light actually bends around it, making it and anything it covers invisible. This invisibility works from the microwave to ultraviolet spectrums, but not against radar or x-rays. The drawback is that anything concealed within the cloak can’t see out. This is easily overcome by using external sensor feeds (if available) and entoptics to navigate. Alternately, a small piece of anti-cloak, which cancels the cloak’s invisibility properties when touched together, can be used to create a small window to peep out of, though this increases the chance of being spotted. Noticing such a window requires a Perception Test with a –30 modifier.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 316);

  val microbug = Gear(
    name = "Microbug",
    category = c,
    descr = "This device is a tiny camera and microphone 1 millimeter across. It has the visual capabilities of a set of specs (p. 326). It can hear everything within 20 meters and see everything within the same range that is in its line of sight. A microbug can record up to 100 hours of information. Microbugs can be set to broadcast continuously, at set intervals, or only when they receive a special signal. If desired, they can also be set to only record if there is movement or voices in the room they are in. Microbugs have adhesive backs and can stick to almost any surface. Microbugs can also establish their location via mesh positioning or GPS, and so double as tracking devices.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 316);

  val microbugQF = Gear(
    name = "Microbug with Quantum Farcaster",
    category = c,
    descr = "This device is a tiny camera and microphone. It has the visual capabilities of a set of specs (p. 326). It can hear everything within 20 meters and see everything within the same range that is in its line of sight. A microbug can record up to 100 hours of information. Microbugs can be set to broadcast continuously, at set intervals, or only when they receive a special signal. If desired, they can also be set to only record if there is movement or voices in the room they are in. Microbugs have adhesive backs and can stick to almost any surface. Microbugs can also establish their location via mesh positioning or GPS, and so double as tracking devices. To avoid being detected by their radio transmissions, these microbugs are attached to miniature quantum farcasters (p. 315). They are much larger (1 centimeter) and easy to see, but their transmissions cannot be detected or blocked.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 316);

  val prisonerMask = Gear(
    name = "Prisoner Mask",
    category = c,
    descr = "This hood tightens around the head of a prisoner, blocks all vision frequencies, and engages in low-level jamming in order to prevent any wireless communication via mesh inserts.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316);

  val psiJammer = Gear(
    name = "Psi Jammer",
    category = c,
    descr = "This device jams frequencies used by brainwaves within a 20-meter radius. This has no effect on brain functions, but it does prevent any ranged used of psi sleights within this area of effect.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316);

  val quantumComputer = Gear(
    name = "Quantum Computer",
    category = c,
    descr = "These advanced devices make use of quantum computation, allowing them to handle extremely large numbers with ease. This makes them especially useful for codebreaking, as noted on p. 254.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 316);

  val smartDust = Gear(
    name = "Smart Dust",
    category = c,
    descr = "This device is a walnut-sized specialized nanobot generator that creates tiny sensor nanobots, each one of which is a tiny sphere the diameter of a human hair. A packet of smart dust nanobots is sufficient to perform detailed surveillance on a large room like an auditorium has a volume of 1 cubic centimeter and contains 3 million nanobots. Each nanobot contains tiny cameras, microphones, a tiny computer, a radio, and chemical sensors, as well as short legs that allow them to walk and climb at a rate of 5 cm per second.\nWhen a character dumps a packet of smart dust in a room, it will cover every surface in the room within 20 minutes, including all furniture and the insides of every drawer and other space that is not airtight. At this point, the smart dust has recorded all data about the room that can be obtained by exceedingly detailed observation, including the DNA of everyone who has visited the room in the last week or two. The smart dust can then either broadcast a brief, highly compressed signal, or it can send all of its information to a few hundred nanobots that then walk to a pre-arranged destination for pickup and downloading by their user. The user need only find a single nanobot with a nanodetector to acquire the information obtained by the smart dust. If ordered to do so, the remaining nanobots can either power down and await further orders or self-destruct in a fashion that turns them into a tiny amount of dust made mostly of metal and silicon.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316);

  val tractionPads = Gear(
    name = "Traction Pads",
    category = c,
    descr = "This set of specialized fingerless gloves, shoes, and kneepads is designed to emulate the pads on geckos’ feet. Characters can support themselves on a wall or ceiling by placing any two of these pads against any surface not made from a material specially designed to resist such devices. Characters can climb any surface and move easily across walls and ceilings that can support their weight (+30 to Climbing Tests). In addition to climbing, these devices are also very popular in zero-g environments. Wearing this item does not impair the user’s agility or manual dexterity.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 317);

  val whiteNoiseMachine = Gear(
    name = "White Noise Machine",
    category = c,
    descr = "This small and wearable device generates masking sounds that protect a conversation from being audibly recorded or overheard by anyone not in the immediate vicinity.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 317);

  val xrayEmitter = Gear(
    name = "X-Ray Emitter",
    category = c,
    descr = "This device is designed to be used with either the enhanced vision augmentation (p. 301) or specs (p. 326). It emits a focused beam of low-powered x-rays that allows the user of either device to both see and see through most objects using backscatter x-ray radiation (p. 303). This allows the character to literally see through walls and into containers, including ones made of metal.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 317);

  val list: List[Gear] = Macros.memberList[Gear];
}
