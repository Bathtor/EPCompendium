package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object Cyberware {
  import MorphType._;
  import CompendiumRefImplicits._;

  val c = "Cyberware";

  val antiGlare = Augmentation(
    name = "Anti-Glare",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This visual mod eliminates penalties for glare.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 306);

  val electricalSense = Augmentation(
    name = "Electrical Sense",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The character can sense electric fields. Within 5 meters, the character can instantly tell if an electrical device is on or off and can see the precise location of electrical wiring behind a wall or inside a device. This sense gives the character a +10 modifier on any test involving analyzing, repairing, or modifying electrical equipment.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 306);

  val radiationSense = Augmentation(
    name = "Radiation Sense",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The character can sense the presence and approximate source of all forms of dangerous radiation, including neutrons, charged particles, and cosmic rays.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 306);

  val tRayEmitter = Augmentation(
    name = "T-Ray Emitter",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Mounted under the skin of the user’s forehead, this implant generates low-powered beams of terahertz radiation (T-rays) that allow the character to see using reflected T-rays. As discussed in Using Enhanced Senses, p. 302, this implant combined with the enhanced vision enhancement (or a terahertz sensor) allows the user to effectively see through cloth, plastic, wood, masonry, composites, and ceramics as well as being able to determine the composition of various materials. This implant allows the user to see using reflected T-rays for 20 meters in a normal atmosphere and for 100 meters in vacuum.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 306);

  val accessJacks = Augmentation(
    name = "Access Jacks",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Usually located in the base of the skull or neck, this implant is an external socket with a direct neural interface. It allows the character to establish a direct wired connection using a fiberoptic cable to external devices or other characters, which can be useful in places where wireless links are unreliable or complete privacy is required. Two characters linked via access jack can “speak” mind-to-mind and transfer information between their mesh inserts and other implants. All synthmorphs have these by default.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 306);

  val deadSwitch = Augmentation(
    name = "Dead Switch",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This cortical stack (p. 300) accessory is designed to keep the stack from falling into the wrong hands. If the morph is killed, the dead switch wipes and melts the cortical stack completely, so that the ego cannot be recovered. This option is generally only used by covert operatives with recent backups.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 306);

  val emergencyFarcaster = Augmentation(
    name = "Emergency Farcaster",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr =
      """Only characters with cortical stacks can possess this augmentation. The morph has an implanted quantum farcaster (p. 314) linked to a highly secure storage facility. The high cost of this implant also covers the cost of this storage. Using standard radio and quantum encryption, the farcaster broadcasts full backups of the character’s ego (pulled from the cortical stack) once every 48 hours. At the gamemaster’s discretion, the backup interval may be scheduled more or less frequently, keeping in mind that ego broadcasts are generally limited for security purposes and because they hog bandwidth. These broadcasts only work when the character is in radio contact with the storage facility and is typically only used inside a habitat to broadcast backups back to a nearby space ship. If the radio broadcasts are blocked or jammed, this device cannot make backups.
        |In the event of a farcaster failure, this augmentation also includes a single-use emergency neutrino broadcaster (p. 314) as well. This broadcaster contains approximately 10 nanograms of antimatter stored in an orange-sized triply redundant magnetic containment vessel. If the character is dying or urgently wishes to depart the morph, this tiny amount of antimatter is brought into contact with a similarly tiny amount of matter in a controlled fashion that generates a single brief and carefully coded neutrino pulse of the ego’s most recent backup. However, the heat generated by this process literally cooks the entire morph, killing it and destroying all implants and electronics in or on it.
        |This entire process takes less than 0.1 second and the broadcast can be received as long as the neutrino receiver is within 100 astronomical units of the character. Within the solar system, this implant effectively guarantees the character’s backup. It is less useful on exoplanets where the character is out of neutrino range of their backup facility. The amount of antimatter carried by this implant is sufficiently small enough that it does not produce an explosion and will not damage any surrounding objects. Most habitats carefully scan all visitors to determine if they have this implant and if the amounts of antimatter involved are sufficiently low as not to pose a danger to the habitat and its inhabitants, and some ban this implant entirely.""".stripMargin,
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 306);

  val ghostriderModule = Augmentation(
    name = "Ghostrider Module",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This implant allows the character to carry another infomorph inside their head. This infomorph could be another muse, an AI, a backed-up ego, or a fork. The module is linked to the character’s mesh inserts, so the ghost-rider can access the mesh. The character may limit the ghostrider’s access, or may allow them direct access to their sensory information, thoughts, communications, and other implants.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 307);

  val mnemonicAugmentation = Augmentation(
    name = "Mnemonic Augmentation",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "A character with this augmentation and a cortical stack can access digital recordings of all of the sensory data they have experienced in XP format (and they may share these recordings with others). Mnemonic augmentation differs from the eidetic memory bioware because it allows characters to digitally share all of their sensory data with others. It also allows them to closely examine sensory data they did not initially look at. For example, If the character glanced at a note but did not read it, they can later use image enhancement software to enhance this image and in most cases actually read what the note said. Mnemonic augmentation allows the character to clearly hear all background noises, like a conversation at a nearby table that the character only initially heard a few words of. Using mnemonic augmentation to retrieve a specific piece of information is quite easy, but usually requires between 2 and 20 minutes of concentration.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 307);

  val multiTasking = Augmentation(
    name = "Multi-Tasking",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Only characters with cortical stacks can possess this augmentation. The character has an advanced computer installed in their brain that uses the data in the cortical stack to create several simultaneous short-term forks to handle various mental tasks. By design, this computer automatically reintegrates all of these forks into the character’s core personality after a maximum of 4 hours, earlier if desired. This augmentation allows the character to both plan a speech and engage in intensive meshbrowsing while simultaneously fighting a gun battle or running from pursuit, since each of the forks operates independently. However, these forks can only perform purely mental or on-line interactions. This augmentation can produce a maximum of two forks at a time, giving the character an extra two Complex Actions on every Action Phase for mental or on-line actions. This implant cannot be used simultaneously with any other augmentation that allows for extra actions, or with the mental speed augmentation (p. 308).",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 307);

  val puppetSock = Augmentation(
    name = "Puppet Sock",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This implanted computer allows the biomorph’s body (the “puppet”) to be controlled by another character (the “puppeteer”). While active, the puppet has no control over their body and is simply along for the ride (at the gamemaster’s discretion, puppets who are tormented by repeated or extensive loss of control may suffer mental stress). The puppeteer may directly “jam” the puppet or remote control it in the same way that robots and pods are teleoperated (p. 196). The puppeteer must either be ghostriding the puppet (see the Ghostrider Module, p. 307) or have a direct communications link (via mesh, radio, laser, etc.).",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 307);

  val cyberclaws = Augmentation(
    name = "Cyberclaws",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The bones on the back of the morph’s hand are bonded to smart material claws. These claws can extend through concealed ports in the morph’s skin and extend 6 inches past the morph’s knuckles. These razor-sharp weapons inflict 1d10+3+(SOM ÷10)damage and have an AP of –2. If combined with eelware (p. 304), they can also inflict electric shocks. Likewise, cyberclaws can also deliver poison or nanotoxins secreted from a poison gland (p. 305) or implanted nanotoxins.",
    related = List(MorphAttacks.cyberClaw),
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 307);

  val cyberlimb = Augmentation(
    name = "Cyberlimb",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "In an age when arms and legs can easily be regrown, many people consider cybernetic prostheses to be vulgar and distasteful. The Scum and others, however, treat them as iconic symbols of self-expression. Standard replacement cyberlimbs function the same as their biological equivalents, though that particular limb receives a +3/+3 Armor bonus when targeted specifically (this bonus does not apply to synthmorphs). Cyberlimbs may be masked to look real (see Synthetic Mask, p. 311), and may also feature small compartments for hiding/storing small objects.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 307);

  val cyberlimbPlus = Augmentation(
    name = "Cyberlimb Plus",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "More extravagant cyberlimb models are also available, though they require more severe body alteration to accommodate. These limbs apply a +5 SOM bonus per limb (maximum +10). They may be replacement limbs or “extra” limbs anchored in the body’s skeletal frame. These cyberlimbs may not be masked.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 308);

  val handLaser = Augmentation(
    name = "Hand Laser",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The morph has a weapon-grade laser implanted in its forearm, with a flexible waveguide leading to a lens located between the first two knuckles on the morph’s dominant hand. The laser fires from this waveguide, inflicting 2d10 damage with 0 AP. The laser is powered by a small nuclear battery located in the morph’s torso, good for 50 shots before it must be recharged like other beam weapon batteries (p. 339).",
    related = List(MorphAttacks.handLaser),
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 308);

  val hardenedSkeleton = Augmentation(
    name = "Hardened Skeleton",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The morph’s skeleton has been laced with strengthening materials. Apply a +5 DUR and +5 SOM bonus.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 308);

  val oxygenReserve = Augmentation(
    name = "Oxygen Reserve",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The morph has a miniature oxygen tank and rebreather installed in its torso. This implant provides the equivalent of the life support system in a light vacsuit (p. 333), allowing the character to breathe comfortably for up to 3 hours. It feeds oxygen directly to the morph’s blood stream, avoiding problems with pressure changes. Implanted sensors automatically cause the character to use the stored oxygen if they detect poisonous or insufficient atmosphere. Without vacuum sealing, the character can only survive in vacuum for 5 minutes, but remains conscious and active for the entire time, giving them far more time to find shelter or a vacsuit than characters without this implant. For every hour the character is in a breathable atmosphere, this implant recovers one hour of oxygen storage. The implant can be fully recharged within 15 minutes if the character is in a high-pressure mostly oxygen atmosphere.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 308);

  val reflexBoosters = Augmentation(
    name = "Reflex Boosters",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "The morph’s spinal column and nervous system is rewired with superconducting materials, boosting transmission speed. This raises the character’s REF by +10 and improves Speed by +1.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 308);

  // Firewall
  val failsafe = Augmentation(
    name = "Failsafe",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = """This augmentation must be used in combination with the nanophages nanoware (p. 309, EP) and cortical stack (p. 300, EP). This implant is specifically designed for users who regularly risk exsurgent infection and do not want to be a danger to others. If a strain of the exsurgent virus manages to overcome the nanophages, the failsafe goes into action. As soon as the nanophage defenses reach a point where they are certain to be overwhelmed, the failsafe discon- nects the user’s cortical stack and isolates it, keeping it free from any exsurgent infection. It then physi- cally ejects the cortical stack from the user’s body for easy retrieval (ejected stacks typically fall 1d10 ÷ 2 meters away). The failsafe also immediately triggers a swift and potent neurotoxin, killing the user’s body and destroying their brain. The synthmorph equivalent shuts down the body and securely erases the cyberbrain. In either case, the result is a swift and painless death.
If the user has the emergency farcaster augmentation installed in this morph, the failsafe triggers it instead of ejecting the stack and activating the neurotoxin/cyberbrain erasure.""",
    price = Cost.Low,
    source = Sources.firewall,
    sourcePage = 174);

  val qecomm = Augmentation(
    name = "QE Comm",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This is an implanted version of the portable QE comm (p. 315, EP) with a low-capacity qubit reservor. Due to the size of the qubit reservoir, it must usually be implanted in the thoracic cavity. Though uncommon, this implant is sometimes used by moles that require a covert method of communication.",
    price = Cost.Expensive,
    source = Sources.firewall,
    sourcePage = 174);

  val truthFilters = Augmentation(
    name = "Truth Fitlters",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Truth filters can only be used with a cyberbrain or mesh inserts. This module scrambles the signals read from subject’s brain in such a way as to make digital deception scanners (p. 176) worthless. A character with this implant will automatically succeed on Deception Tests against such scanners.\nTruth filters offer no protection against analog deception scanners.",
    price = Cost.Trivial,
    source = Sources.firewall,
    sourcePage = 174);

  // Panopticon
  val cybercortex = Augmentation(
    name = "Cybercortex",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Similar but less sophisticated than a cyberbrain, a cybercortex is a limited artificial version of the neo- cortex for smart animals. A cybercortex is not sufficient to raise an animal to sapience, but it does boost the animal’s ability to learn, comprehend instructions/commands, and reason. Apply a +10 modifier to Animal Handling Tests with this animal. The cybercortex also overrides many instinctive behaviors that would be undesirable in a service animal.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 148);

  val implantMasking = Augmentation(
    name = "Implant Masking",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "Implant masking is not a separate implant, but a modification to an existing one. Masked cybernetic implants are composed of electromagnetic- and acoustic-absorbent smart materials that are less likely to be detected by surveillance and security systems using radar, x-rays, or ultrasound. Apply a −30 modifier to any attempts to detect the implant. [Increase the masked implant's cost by one category]",
    price = Cost.None,
    source = Sources.panopticon,
    sourcePage = 148);

  val lifeRecorder = Augmentation(
    name = "Life Recorder",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = """Not everyone wants to broadcast their lifelog, whether for public viewing or for private storage elsewhere on the mesh. Some people want to retain a lifelog, but prefer to avoid possible interception of the contents online. Certain security, spy, political, and diplomatic professions may mandate this. Others may commonly find themselves in situations where they are cut off from regular mesh access (such as gatecrashers or remote asteroid herders). Most people also don’t want to be bothered with carrying a storage device on their person at all time. In these cases, a life recorder serves the purpose. The life recorder is a micro-sized memory diamond storage device, typically implanted in the head (though occasionally elsewhere in the body). This implant records all sensory input as experienced by the brain to which it is linked. Life recorders are designed as one-way information receivers, simply storing data until they are removed; they are not meant to be accessed, much like cortical stacks.""",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 148);

  val memoryLock = Augmentation(
    name = "Memory Lock",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph, Infomorph),
    descr = "This implant, when activated, prevents information from being stored in the subject’s long-term memory or from being recorded via lifelog, mnemonic augmentation, or other sensory link. It also temporarily blocks up-to-the second cortical stack backups. The individual will retain short-term memories, but for no more than a few minutes. This implant is usually a requirement for personal aides, consultants, and other underlings of powerful people. The implants can be remotely activated by the superior during confidential meetings or other secret affairs to ensure privacy and deniability. This implant is also a popular option among some personal couriers who intentionally retain no memories of the party that hired them in case they are intercepted.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 149);

  val senseFilter = Augmentation(
    name = "Sendse Filter",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This implant enables a character with a biological hyper- spectral enhanced sense (enhanced hearing, smell, or vision) to filter out certain wavelengths and inputs like an equivalent technological sensor device. Normally a person with enhanced vision would experience terahertz, infrared, standard visual, ultraviolet, and gamma ray frequencies all at once. With this implant, however, they can tune out some wavelengths, ignoring them while still seeing the others. The same effect applies to audio or olfactory input, and the filter also allows the user to isolate specific noises or smells, canceling out sensory clutter or focusing on a specific source. This implant must be acquired separately for each sense.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 149);

  // Rimward
  val parallelProcessor = Augmentation(
    name = "Parallel Processor",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph, Infomorph),
    descr = "A modified derivative of the neo-syngergist hypermesh link, this augmentation allows users to link their minds together together in a manner similar to parallel processing computers, allowing them to borrow processing power from other linked egos to solve intellectual problems. In addition to automatically providing the appropriate teamwork bonus for the problem (to a maximum of +30) without the others needing to take any actions, as long as three or more users are linked together, each user also gains a +5 COG bonus for the duration of the linkage. These bonuses only apply when the users are linked. Users must possess the mental speed augmentation to use this implant. While the implant is active, the character’s Trauma Threshold is reduced by 1. To avoid possible personality bleed-over, users are advised to use this augmentation for no more than six hours per day.",
    price = Cost.High,
    source = Sources.rimward,
    sourcePage = 189);

  val plasmaSailImplant = Augmentation(
    name = "Plasma Sail Implant",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This augmentation installs a miniature plasma sail in the morph. This implant includes a potent battery-powered superconducting magnet and a tank holding sufficient compressed hydrogen to allow the plasma sail to operate for three months. This implant allows the user to fly through space with an acceleration of up to 0.01 g, though beyond the orbit of Saturn the solar wind becomes too faint to provide any acceleration. In open space, this sail can achieve a maximum velocity of 80 kilometers per second, but can only be used to accelerate away from the sun (tacking can be used to sail toward the sun, but at a maximum of 10 kps). It can be used to maneuver in any direction, however, as long as the user is within a planet’s strong magnetic field. Within 70,000 km of Earth, 3,000,000 km of Jupiter, 1,500,000 km of Saturn, 450,000 km of Uranus, or 500,000 km from Neptune, the plasma sail allows the user to maneuver freely and to land on and take off from any moon with a surface gravity of less than 0.05 g. Using it requires Flight skill. This is a relatively large implant and produces a characteristic humpback shape on almost all morphs.",
    price = Cost.Expensive,
    source = Sources.rimward,
    sourcePage = 189);

  // Sunward
  val gasJetSystem = Augmentation(
    name = "Gas Jet System",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "This cybernetic system implants nozzles in the morph’s chest, back, and limbs, allowing it to maneuver in microgravity using vectored bursts of gas. It either inputs atmospheric gases through implanted intakes or draws gas from an oxygen reserve implant. This mod applies a +10 modifier to Free Fall Tests.",
    price = Cost.Moderate,
    source = Sources.sunward,
    sourcePage = 166);

  val list: List[Augmentation] = Macros.memberList[Augmentation];
}
