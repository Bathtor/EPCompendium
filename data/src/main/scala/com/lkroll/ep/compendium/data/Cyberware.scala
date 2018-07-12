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

  // TODO Add morph field for MOA
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

  val list: List[Augmentation] = Macros.memberList[Augmentation]
}
