package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object CovertTech {
  val c = "Covert and Espionage Tech";

  val chameleonCloak = Gear(
    name = "Chameleon Cloak",
    category = c,
    descr =
      "This loose, poncho-like cloak contains a network of sensors that perceive wavelengths from microwave to ultra-violet. A similar network of miniature emitters precisely replicate the information its sensors receive, making the wearer seem transparent to those wavelengths. A chameleon cloak allows a character to effectively become invisible as long as they are stationary or not moving faster than a slow walk. When worn by someone moving faster, the cloak still provides a +30 modifier to Infiltration Tests to avoid being seen or noticed.\nChameleon cloaks are not effective against radar, x-ray, or gamma-ray sensors. They do hide the character from thermal infrared, however, by absorbing the character’s body heat into its heat sink. The cloak can only absorb a character’s body heat for one hour before it must emit this heat. Heat emission also requires one hour, during which time the character is easily visible in the thermal infrared spectrum.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 315
  );

  val cot = Gear(
    name = "Covert Operations Tool (COT)",
    category = c,
    descr =
      "This handheld device is the ultimate in infiltration technology. It contains both smart matter micromanipulators, cutting tools, and an advanced nanotechnology generator capable of producing nanobots that can bore or cut through almost any material and disable or open almost any electronic lock.\nCutting out a lock or boring a 1-millimeter hole in a wall with a COT requires ((Durability + Armor) ÷ 10) seconds. Cutting out a 1-meter diameter hole in a wall requires ((Durability + Armor) ÷ 10) minutes. These same nanobots can later be used to repair this damage so that it is invisible to any but the most careful and detailed examination.\nA COT can easily open any old-fashioned mechanical lock simply by analyzing it and shaping an appropriate key, though this takes a full Action Turn. It can also open electronic locks by infiltrating them with nanobots that influence the lock's electronics, no matter what authentication system the lock uses. Opening electronic locks takes a full Action Turn, but success is practically guaranteed. Opening an electronic lock in this manner will, however, trigger an alarm and/or be logged as an event. For more details, see Electronic Locks, p. 291.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 315
  );

  val cuffband = Gear(
    name = "Cuffband",
    category = c,
    descr =
      "This smart plastic loop restricts around a prisoner’s limbs when activated. If the prisoner struggles, it will tighten more. Cuffbands will inform the user if they are cut or loosened and are electronically controlled, so the user can release the prisoner remotely. Some cuffband variants including a shock system (treat as a shock attack, p. 204.) to zap and restrain unruly prisoners.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 316
  );

  val dazzler = Gear(
    name = "Dazzler",
    category = c,
    descr =
      "The dazzler is a tiny laser system set on a rotating ball. When activated, it consistently spins and emits laser pulses in all directions. These laser pulses are not dangerous, but they detect the lenses of camera systems (including specs, viewers, and bot/synthmorph sensors) and repeatedly zap them with laser pulses of varying strength to overload and dazzle them. For as long as a dazzler is active, any camera system (visual, infrared, and ultraviolet) within line of sight and within 200 meters is blinded.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316
  );

  val disabler = Gear(
    name = "Disabler",
    category = c,
    descr =
      "This handy device emits an overloading surge that completely incapacitates and disables a synthetic morph or pod (anything with a cyberbrain) when it is plugged into an access jack and activated. The affected cyberbrain will be unable to function until the signal is deactivated, effectively shutting down the ego (or AI). In order to plug a disabler into an unwilling target, the target must first be grappled or a called shot must be successfully made in melee combat. This device does not work on larger synthetic morphs (like vehicles) or on cyberbrainless robots.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 316
  );

  val fiberEye = Gear(
    name = "Fiber Eye",
    category = c,
    descr =
      "This is a flexible and electronically controllable length of fiberoptic cable and viewer, which can be worked through cracks, under doors, and around corners to peep unobtrusively.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 316
  );

  val invisibilityCloak = Gear(
    name = "Invisibility Cloak",
    category = c,
    descr =
      "This cloak is made of metamaterials with a negative refractive index, so that light actually bends around it, making it and anything it covers invisible. This invisibility works from the microwave to ultraviolet spectrums, but not against radar or x-rays. The drawback is that anything concealed within the cloak can’t see out. This is easily overcome by using external sensor feeds (if available) and entoptics to navigate. Alternately, a small piece of anti-cloak, which cancels the cloak’s invisibility properties when touched together, can be used to create a small window to peep out of, though this increases the chance of being spotted. Noticing such a window requires a Perception Test with a –30 modifier.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 316
  );

  val microbug = Gear(
    name = "Microbug",
    category = c,
    descr =
      "This device is a tiny camera and microphone 1 millimeter across. It has the visual capabilities of a set of specs (p. 326). It can hear everything within 20 meters and see everything within the same range that is in its line of sight. A microbug can record up to 100 hours of information. Microbugs can be set to broadcast continuously, at set intervals, or only when they receive a special signal. If desired, they can also be set to only record if there is movement or voices in the room they are in. Microbugs have adhesive backs and can stick to almost any surface. Microbugs can also establish their location via mesh positioning or GPS, and so double as tracking devices.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 316
  );

  val microbugQF = Gear(
    name = "Microbug with Quantum Farcaster",
    category = c,
    descr =
      "This device is a tiny camera and microphone. It has the visual capabilities of a set of specs (p. 326). It can hear everything within 20 meters and see everything within the same range that is in its line of sight. A microbug can record up to 100 hours of information. Microbugs can be set to broadcast continuously, at set intervals, or only when they receive a special signal. If desired, they can also be set to only record if there is movement or voices in the room they are in. Microbugs have adhesive backs and can stick to almost any surface. Microbugs can also establish their location via mesh positioning or GPS, and so double as tracking devices. To avoid being detected by their radio transmissions, these microbugs are attached to miniature quantum farcasters (p. 315). They are much larger (1 centimeter) and easy to see, but their transmissions cannot be detected or blocked.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 316
  );

  val prisonerMask = Gear(
    name = "Prisoner Mask",
    category = c,
    descr =
      "This hood tightens around the head of a prisoner, blocks all vision frequencies, and engages in low-level jamming in order to prevent any wireless communication via mesh inserts.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316
  );

  val psiJammer = Gear(
    name = "Psi Jammer",
    category = c,
    descr =
      "This device jams frequencies used by brainwaves within a 20-meter radius. This has no effect on brain functions, but it does prevent any ranged used of psi sleights within this area of effect.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316
  );

  val quantumComputer = Gear(
    name = "Quantum Computer",
    category = c,
    descr =
      "These advanced devices make use of quantum computation, allowing them to handle extremely large numbers with ease. This makes them especially useful for codebreaking, as noted on p. 254.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 316
  );

  val smartDust = Gear(
    name = "Smart Dust",
    category = c,
    descr =
      "This device is a walnut-sized specialized nanobot generator that creates tiny sensor nanobots, each one of which is a tiny sphere the diameter of a human hair. A packet of smart dust nanobots is sufficient to perform detailed surveillance on a large room like an auditorium has a volume of 1 cubic centimeter and contains 3 million nanobots. Each nanobot contains tiny cameras, microphones, a tiny computer, a radio, and chemical sensors, as well as short legs that allow them to walk and climb at a rate of 5 cm per second.\nWhen a character dumps a packet of smart dust in a room, it will cover every surface in the room within 20 minutes, including all furniture and the insides of every drawer and other space that is not airtight. At this point, the smart dust has recorded all data about the room that can be obtained by exceedingly detailed observation, including the DNA of everyone who has visited the room in the last week or two. The smart dust can then either broadcast a brief, highly compressed signal, or it can send all of its information to a few hundred nanobots that then walk to a pre-arranged destination for pickup and downloading by their user. The user need only find a single nanobot with a nanodetector to acquire the information obtained by the smart dust. If ordered to do so, the remaining nanobots can either power down and await further orders or self-destruct in a fashion that turns them into a tiny amount of dust made mostly of metal and silicon.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 316
  );

  val tractionPads = Gear(
    name = "Traction Pads",
    category = c,
    descr =
      "This set of specialized fingerless gloves, shoes, and kneepads is designed to emulate the pads on geckos’ feet. Characters can support themselves on a wall or ceiling by placing any two of these pads against any surface not made from a material specially designed to resist such devices. Characters can climb any surface and move easily across walls and ceilings that can support their weight (+30 to Climbing Tests). In addition to climbing, these devices are also very popular in zero-g environments. Wearing this item does not impair the user’s agility or manual dexterity.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 317
  );

  val whiteNoiseMachine = Gear(
    name = "White Noise Machine",
    category = c,
    descr =
      "This small and wearable device generates masking sounds that protect a conversation from being audibly recorded or overheard by anyone not in the immediate vicinity.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 317
  );

  val xrayEmitter = Gear(
    name = "X-Ray Emitter",
    category = c,
    descr =
      "This device is designed to be used with either the enhanced vision augmentation (p. 301) or specs (p. 326). It emits a focused beam of low-powered x-rays that allows the user of either device to both see and see through most objects using backscatter x-ray radiation (p. 303). This allows the character to literally see through walls and into containers, including ones made of metal.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 317
  );

  // Panopticon
  val acousticSpotter = Gear(
    name = "Acoustic Spotter",
    category = c,
    descr =
      "This medium-sized but portable sensor system features an array of microphones and a swivel-mounted camera and laser rangefinder. When activated, the system detects the audio signature of kinetic weapons fire (or another programmed sound signature) and attempts to focus the camera and rangefinder on the source. In the case of standard firearms (or seekers or similar projectiles), the system detects the muzzle blast, the shock wave of the incoming bullets, and the difference in timing between them in order to triangulate the originating position. The location of the detected source, including the camera visual feed and range data, are fed into a meshed tacnet. The spotter’s AI has Perception 40 and receives a +10 modifier for detecting sounds, +30 in the case of firearms (but not railguns), seekers, etc. The system can hone in on a repeating audio source; apply a +10 cumulative modifier for each additional emission/attack.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 150
  );

  val dnaChaff = Gear(
    name = "DNA Chaff",
    category = c,
    descr =
      "This small device is quite similar to a splash grenade (p. 341, EP), and may in fact be equipped and thrown like one. Its contents consist of nothing more than a mass of skin flakes and similar biological debris sampled from a thousand different biomorphs. The intent is to spread this material thoroughly over an area, effectively contaminating it for any purposes of collecting forensic DNA evidence.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 150
  );

  val greyBox = Gear(
    name = "Grey Box",
    category = c,
    descr =
      "A gray box is a simple wireless interface with its own power supply. It is micro-sized, about the size of a grape, with a set of smart universal ports and a nondescript, matte-gray housing. When attached to an existing device, it allows that device to be interfaced via a wireless connection. Gray boxes are used by infiltration specialists to add wireless interfaces to air-gapped wired networks or to objects, such as airlocks, that are designed to operate without them. Installing a gray box is a Task Action with a timeframe of 2 minutes (in addition to any Hardware Tests required to gain access to the target object) and requires appropriate tools.\nGray boxes normally operate in a passive mode, listening for signals from their operators but not emitting any signal of their own in order to avoid detection. Once a gray box has been activated, however, it will emit active signals until deactivated again. Gray boxes automatically stealth their signals (−30 on Interfacing Tests to detect them).\nHow hard a gray box is to discover is left to the gamemaster’s discretion and possibly the ingenuity of the person who placed it. Normal maintenance routines will usually turn them up over the course of time. Perception or Hardware: Electronics Tests should be given to technicians who regularly check up on a piece of gear in which a gray box has been installed. The size of the gray box, however, makes it difficult to visually spot (−30 modifier). In passive mode, they are not normally subject to detection, but in active mode, they may be found with Interfacing Tests (p. 251, EP). It is also possible that a security AI or hacker who is watching over an object or network may detect a gray box if someone uses it to intrude on the system and triggers an alert or if they happen to be auditing the system and detect an anomalous port connection.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 150
  );

  val lensCrazer = Gear(
    name = "Lens Crazer",
    category = c,
    descr =
      "A more offensive version of the dazzler (p. 316, EP), the crazer does not simply dazzle and overload the cameras it detects. It attempts to crater, pit, and scratch their lenses, effectively ruining their optic systems. Once activated, the crazer takes one Action Turn to detect lenses, then begins systematically zapping them. Stationary cameras are targeted first. For combat situations, treat the crazer as if it has Beam Weapons 40, Initiative 5, and a Speed of 3. It will use its actions to aim; modifiers for laser sights and called shots cancel out. Its laser fires in SA mode. Though it only inflicts 2 DV with its attacks, targeted optics will suffer −30 on Perception Tests after the first hit and will be blind after the second hit. These effects last until repaired.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 151
  );

  val lensSpotter = Gear(
    name = "Lens Spotter",
    category = c,
    descr =
      "The lens spotter is a less-intrusive version of the dazzler (p. 316, EP). It simply maps out all of the camera lenses in an area, noting their position and likely area of coverage, without blasting them with dazzling lasers. This system is used to unobtrusively detect the surveillance coverage in a given area so that a route map may be generated to avoid camera fields of view. It is also used by military and security forces to detect snipers or enemy spotters before they attack.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 151
  );

  val privacyPod = Gear(
    name = "Privacy Pod",
    category = c,
    descr =
      "Privacy pods are portable self-assembling tent-like structures used to create secure rooms protected from eavesdropping. Privacy pods are effectively sound- proofed Faraday cages, blocking all electromagnetic emissions. They feature a built-in guardian nanoswarm hive that watches for and counteracts any smart dust or other nanosurveillance systems. A privacy pod takes only 3 Action Turns to erect itself and supplies breathable air to the occupants. It features an airlock/scanning chamber with a built-in bug zapper (p. 291, EP). A repair nanohive monitors the pod’s perimeter for any attempts to penetrate the walls.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 151
  );

  val radarCloak = Gear(
    name = "Radar Cloak",
    category = c,
    descr =
      "This cloak works like the invisibility cloak (p.316, EP), except that it bends radar frequencies and makes the wearer invisible to radar sensors.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 151
  );

  val shroud = Gear(
    name = "Shroud",
    category = c,
    descr =
      "Also known as a privacy cloak or a “Gabby Coat,” after the designer, Kalim Ghabil, a shroud is a whole-body smart-fabric covering, similar to a burkha, designed to provide as much anonymity as possible to the wearer. Electrostatic elements randomly stiffen, mold, and relax to mask gait analysis, foot covers change shape and redistribute weight to throw biometric analysis, and the entire garment emits randomly shifting heat patterns, pheromones, and odorants and broadcasts white noise to mask sounds and conversations from eavesdropping. The person inside cannot be detected with normal vision; the shroud blocks t-ray, x-ray, and infrared scanners (note that the shroud does not hide from view like an invisibility cloak; these scanners detect the shroud’s presence quite easily, but they cannot get a reading on what is underneath). Gait analysis will also fail to recognize the shrouded person. An electrical field may be activated in the shroud’s surface to block all wireless radio signals; this cuts the wearer off from the mesh, but also defeats any attempts to wirelessly track them and silences any bugs or tracking devices they may unknowingly carry.\nShrouds are an acceptable form of personal privacy in some habitats, but are considered unusual or may even be illegal in others.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 151
  );

  val list: List[Gear] = Macros.memberList[Gear];
}
