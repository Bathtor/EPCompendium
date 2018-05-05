package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Sensors {
  val c = "Sensors";

  val analog = Gear(
    name = "Analog Sensors",
    category = c,
    descr = "Given the digital characteristics of the exsurgent virus and the potential of sensory-based basilisk hacks, some agents and researchers have resorted to using archaic analog gear for specific missions and tasks deemed high-risk. Specific examples of analog gear include film-based cameras, tape-based audio recorders, VCRs, wired-based phone lines, analog radio devices, and low-resolution and filtered micro- phones, speakers, and video displays. While such gear is cheap and easily nanofabricated, it is clumsier, slower, more difficult to use, more prone to malfunc- tion, relies on physical media, and is generally a pain in the ass to work with. Characters using analog gear typically suffer –20 or –30 to skill tests. On the positive side, such methods usually provide +10 to +30 bonuses against basilisk hacks (gamemaster’s discretion), if not immunity.",
    price = Cost.Trivial,
    source = Sources.firewall,
    sourcePage = 176);

  val bloodScanner = Gear(
    name = "Blood Scanner",
    category = c,
    descr = "Blood scanners are used to detect infection by the biological nanovirus strain of the exsurgent virus. The scanner is simply pressed against the skin of a biomorph (or other living creature) so that microneedles can painlessly extract blood samples from capillaries. These samples are then analyzed and compared to a database of known nanoviral strains. See Exsurgent Virus Detection (p. 177), for details on handling scans.",
    price = Cost.Trivial,
    source = Sources.firewall,
    sourcePage = 176);

  val deceptionScanner = Gear(
    name = "Deception Scanner",
    category = c,
    descr = "This device is used to scan a subject’s brain activity for patterns indicating deception. There are two versions, digital and analog.\nThe digital scanner model plugs into the access jacks of a pod or synthmorph or establishes a wireless connection with the morph’s basic mesh inserts. With analog scanners, a band is placed around the subject’s head to measure brain activity with fMRI. The analog version only works on morphs with biological brains (meaning it doesn’t work on pods or cyberbrained biomorphs but does work on biocore morphs).\nThe subject’s responses to questioning are matched against a database of patterns known to indicate deception. In game terms, the scanner makes an Opposed Test, pitting its Perception 60 against the target’s Deception skill; success indicates it detects falsehoods. Deception scanners can be used to monitor a subject’s response patterns over time to increase their likelihood of spotting lies. For each hour a scanner is used on the same subject, apply a cumulative +10 modifier to its Perception Test, up to a maximum of +30. Note that subjects who are emotionally distressed, suffer from mental disorders, or have undergone physical exertion are harder to read; gamemasters should apply a –10 to –30 to the Perception Test as they feel appropriate. Subjects with edited memories may be unaware they are telling falsehoods and will not fail the test.\nIn many jurisdictions, failure on a deception scanner is not enough to gain a conviction and can’t be used in court, as they are known to be only partially reliable and sometimes return false positives. It is, however, used as a legal justification for engaging in psychosurgery to explore the subject’s memories.\nDigital detection scanners have no effect against targets with truth filter cyberware. However, the scanner can be used to detect the presence of truth filter cyberware with a successful Interfacing Test at –30.",
    price = Cost.Low,
    source = Sources.firewall,
    sourcePage = 176);

  val neuralVerifier = Gear(
    name = "Neural Verifier",
    category = c,
    descr = "This handheld device was designed by the argonauts to test subjects for exsurgent infection. It either is plugged into the access jacks of a pod or synthmorph or establishes a wireless connection with the target morph’s basic mesh inserts. Sensory input is fed to the subject while their brain patterns are analyzed and compared to a database of known exsurgent infection tells.\nThe verifier can be used to run quick or thorough tests. Quick scans take only 30 seconds, but are less accurate (50% detection rate). Thorough scans take 1 hour, but have a higher detection rate (80%). See Exsurgent Virus Detection (below), for details on handling scans.\nIf the verifier detects an exsurgent infection, it immediately disables its wireless capability, flashes a visible physical (not AR) warning (the entire device flashes a bright neon red color three times), and self-destructs so as to prevent it from being infected and used as an infection vector.",
    price = Cost.Low,
    source = Sources.firewall,
    sourcePage = 177);

  // Panopticon
  val brainprintScanner = Gear(
    name = "Brainprint Scanner",
    category = c,
    descr = "This portable skullcap extrudes ultra-sensitive nano-electrodes into the scalp, then plays media to the subject via a visor and ear plugs. It takes approximately 5 minutes to thoroughly scan a subject’s brain patterns in response to the media, producing a verifiable brainprint which can then be authenticated against a meshed database entry.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 152);

  val fiberCamera = Gear(
    name = "Fiber Camera",
    category = c,
    descr = "This camera system is composed of multilayered semi-conducting polymer fabrics that perceive visual wave-lengths much like a standard camera, only without the lens. This allows cameras to be built into clothing, drapes, carpets, etc. These camera systems lack lenses and so are immune to dazzlers, lens spotters, and similar systems.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 152);

  val fiberopticMic = Gear(
    name = "Fiberoptic Microphone",
    category = c,
    descr = "Similar to the fiber eye surveillance camera, the fiberoptic mic is a flexible and mesh-controllable length of fiberoptic cable that can fit through cracks, small holes, etc. This device measures the laser reflections off of a sound-sensitive reflective diaphragm, recording audio that is transmitted back through the fiberoptic cable. Unlike standard microphones, fiberoptic mics are not effected by environmental heat, moisture, or magnetic fields. They have effective noise-canceling functions, high fidelity, and can record infrasound and ultrasound. Apply a +10 modifier to hearing-based Perception Tests. Fiberoptic mics are sometimes strung throughout habitat infrastructure to monitor seismic vibrations in walls and other surfaces.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 152);

  val flatCamera = Gear(
    name = "Flat Camera",
    category = c,
    descr = "Flat cameras rely on an array of tiny, networked micro-lensed imagers. With no large lens, these systems are flat and so are easily mounted on walls, ceilings, shell exteriors, and other surfaces. They are difficult (−20 modifier) to visually spot, but are detectable with lens spotter systems. Flat cameras are available in standard visual, infrared, and ultra-violet wavelengths, or a pricier hyperspectral model.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 152);

  val flatCameraMS = Gear(
    name = "Flat Camera (Multi-Spectral)",
    category = c,
    descr = "Flat cameras rely on an array of tiny, networked micro-lensed imagers. With no large lens, these systems are flat and so are easily mounted on walls, ceilings, shell exteriors, and other surfaces. They are difficult (−20 modifier) to visually spot, but are detectable with lens spotter systems. Flat cameras are available in standard visual, infrared, and ultra-violet wavelengths, or a pricier hyperspectral model.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 152);

  val ghostImagers = Gear(
    name = "Ghost Imagers",
    category = c,
    descr = "Ghost imagers are special camera systems that rely on a paradoxical effect to construct images of objects that conventional cameras cannot see, such as targets obstructed by smoke, clouds, or other visual effects. Ghost imagers rely on two cameras. The first is pointed at a light source and the second at a target object or location illuminated by that source (but obstructed from the standard camera view). By exploiting a (quantum) correlation effect in the property of light, the ghost imaging system can build an image of the target based on photons that are scattered off of it, even though the view of the target is obstructed. Ghost imaging could thus be used to see targets on a battlefield obscured by heavy fog or smoke or on a planet surface below heavy cloud cover, simply by pointing a camera that way and another at the sun, moon, or other light source.\nIn game terms, ghost imagers ignore all visual modifiers. Ghost imagers can see in infrared as well as standard visual frequencies. Though they are passive sensors that use natural light, they can also be used in conjunction with active light sources.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 152);

  val hyperspectralImagerPassive = Gear(
    name = "Hyperspectral Imagers (Passive)",
    category = c,
    descr = "A hyperspectral imager views the electromagnetic spectrum much like enhanced vision bioware. The passive model perceives infrared to ultraviolet frequencies, while the active model incorporates terahertz and radar imaging as well. See the rules for hyperspectral sensors, p. 162.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 153);

  val hyperspectralImagerActive = Gear(
    name = "Hyperspectral Imagers (Active)",
    category = c,
    descr = "A hyperspectral imager views the electromagnetic spectrum much like enhanced vision bioware. The passive model perceives infrared to ultraviolet frequencies, while the active model incorporates terahertz and radar imaging as well. See the rules for hyperspectral sensors, p. 162.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 153);

  val hyperspectralMic = Gear(
    name = "Hyperspectral Microphone",
    category = c,
    descr = "A hyperspectral mic hears the entire audio spectrum, from infrasonic to ultrasonic frequencies, much like enhanced hearing bioware. See the rules for hyperspectral sensors, p. 162.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 153);

  val idScanner = Gear(
    name = "ID Scanner",
    category = c,
    descr = "This small hand-held device is used to read the nanotat IDs carried by most morphs (p. 279, EP). It scans the nanobots, decodes the data, and compares the information against linked online databases. To truly be effective, this device must have mesh access to ID databases.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 153);

  val metalDetector = Gear(
    name = "Metal Detector",
    category = c,
    descr = "Metal detectors use very-low frequency induction to detect metals that are not apparent. They can be used at security checkpoints to locate weapons, cyberware, or contraband. Available as hand-held wands, they are also often used as portal access systems, scanning anyone that passes through. Modern detectors are good enough to identify the type of metal. Gatecrashers and scavengers also use them to locate items buried in the ground or under debris. These devices have a very short range, just 2m, though larger masses of metal may be detectable from further away.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 153);

  val motionDetector = Gear(
    name = "Motion Detector",
    category = c,
    descr = "Modern motion detectors use a combination of sensor technologies to maximize accuracy and reduce false alarms. They can operate in passive and active modes. In passive mode, the detector relies on infrared sensors to detect body heat, without sending out any signals that might betray its presence. In active mode, it sends out ultrasonic pulses and/or microwaves, measuring the reflections that bounce off a moving target to measure speed, position, and direction. Often strategically mounted as a perimeter security system, motion detectors are typically set in passive mode first, which then triggers active mode when it gets a reading. These devices are small.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 153);

  val personalInteractionSensor = Gear(
    name = "Personal Interaction Sensor",
    category = c,
    descr = "These mini-sized combo sensors are worn on the body and use an infrared heat sensor, biolidar pulse rate measurement, pheromone and perspiration identification, and a camera and microphone to scan those with whom the wearer interacts. The sensor’s AI measures the readings and also applies voice analysis (stress factor and response spaces) and kinesics assessments to judge the honesty and forthrightness of a conversational partner. While originally designed for business and political negotiations, PI sensors are growing in popularity as a tool for regular personal interactions. The AI is equipped with Kinesics and Perception skills of 40. They apply a +20 modifier to Kinesics Tests.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 153);

  val qdcd = Gear(
    name = "Quantum Dot Camera-Display",
    category = c,
    descr = "These fullerene devices acts as both high-resolution display and camera. They can be painted on almost any surface. Because they do not have lenses, they cannot be detected by lens spotter systems. When not displaying images, they are also difficult to spot visually; apply a −20 modifier. They are hyperspectral, sensing from near-infrared to ultraviolet wave-lengths.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 153);

  val quantumRadar = Gear(
    name = "Quantum Radar",
    category = c,
    descr = "These advanced radar systems employ entangled emissions to acquire a higher resolution, similar to using a shorter wavelength. Quantum radar produces images with detail equivalent to terahertz or infrared, making it better for detecting concealed objects and targets. Apply a +20 modifier to Perception Tests made with quantum radar systems.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 153);

  val sensorConcealment = Gear(
    name = "Sensor Concealment",
    category = c,
    descr = "Many sensors are hidden within everyday objects or constructed to look like something different so as not to be an obvious surveillance tool. This modification to a sensor device applies a −30 modifier to Perception Tests made to spot it and identify it as a sensor.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 153);

  val superwideCameras = Gear(
    name = "Super-wide Cameras",
    category = c,
    descr = "Carried by aerial drones and orbital satellites or mounted at high infrastructure points like habitat domes or the axis points of cylinder habitats, these cameras can view an area up to 300 square kilometers in size down to 0.1m resolution. They can view in standard visual, near infrared, or ultraviolet; hyperspectral versions are also available.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 153);

  val superwideCamerasHS = Gear(
    name = "Super-wide Cameras (Hyperspectral)",
    category = c,
    descr = "Carried by aerial drones and orbital satellites or mounted at high infrastructure points like habitat domes or the axis points of cylinder habitats, these cameras can view an area up to 300 square kilometers in size down to 0.1m resolution. They can view in standard visual, near infrared, or ultraviolet; hyperspectral versions are also available.",
    price = Cost.High,
    source = Sources.panopticon,
    sourcePage = 153);

  val list: List[Gear] = Macros.memberList[Gear];
}
