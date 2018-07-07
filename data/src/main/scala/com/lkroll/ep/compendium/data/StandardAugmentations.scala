package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object StandardAugmentations {
  import MorphType._;
  import CompendiumRefImplicits._;

  val c = "Standard Augmentations";

  val basicBiomods = Augmentation(
    name = "Basic Biomods",
    category = c,
    appliesTo = List(Biomorph, Pod),
    descr = "Almost universal in biomorphs, many habitats will not allow individuals to visit/immigrate if their biomorph does not possess these biomods in order to preserve public health. Basic biomods consists of a series of genetic tweaks, tailored viruses, and bacteria that speed healing, greatly increase disease resistance, and impede aging. A morph with basic biomods heals twice as fast as an early 21st century human, gradually regrows lost body parts, is immune to all normal diseases (from cancer to the flu), and is largely immune to aging. In addition, the morph requires no more than 3–4 hours of sleep per night, is immune to ill effects from long-term exposure to low or zero gravity, and does not naturally suffer from biological problems like depression, shock reactions after being injured, or allergies.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 300);

  val basicMeshInserts = Augmentation(
    name = "Basic Mesh Inserts",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = """Mesh inserts are ubiquitous among modern morphs. This network of cybernetic brain implants is essential equipment for anyone who wants to stay connected and make full use of the wireless mesh. The interconnected components of this system include:
• Cranial Computer: This computer serves as the hub for the character’s personal area network and is home to their muse (p. 264). It has all of the functions of a smartphone and PDA, acting as a media player, meshbrowser, alarm clock/calendar, positioning and map system, address book, advanced calculator, file storage system, search engine, social networking client, messaging program, and note pad. It manages the user’s augmented reality input and can run any software the character desires (see Software, p. 331). It also processes XP data, allowing the user to experience other people’s recorded memories, and also allowing the user to share their own XP sensory input with others in real-time. Facial/image recognition and encryption software (p. 331) are included by default.
• Radio Transceiver: This transceiver connects the user to the mesh and other characters/devices within range. It has an effective range of 20 kilometers in deep space or other locations far from radio interference and 1 kilometer in crowded habitats.
• Medical Sensors: This array of implants monitors the user’s medical status, including heart rate, respiration, blood pressure, temperature, neural activity, and much more. A sophisticated medical diagnostic system interprets the data and warns the user of any concerns or dangers.""",
    related = List(SoftwareEP.encryption, SoftwareEP.fiRecognition),
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 300);

  val corticalStack = Augmentation(
    name = "Cortical Stack",
    category = c,
    appliesTo = List(Biomorph, Pod, Synthmorph),
    descr = "A cortical stack is a tiny cyberware data storage unit protected within a synthdiamond case the size of a grape, implanted at the base of the skull where the brain stem and spinal cord connect. It contains a digital backup of that character’s ego. Part nanoware, the implant maintains a network of nanobots that monitor synaptic connections and brain architecture, noting any changes and updating the ego backup in real time, right up to the moment of death. If the character dies, the cortical stack can be recovered and they may be restored from the backup (see Resleeving, p. 270). Cortical stacks do not have external or wireless access (for security), they must be surgically removed (see Retrieving a Cortical Stack, p. 268). Cortical stacks are extremely durable, requiring special effort to damage or destroy. They are commonly recovered from bodies that have otherwise been pulped or mangled. Cortical stacks are intentionally isolated from mesh inserts and other implants, as a security measure to prevent hacking or external tampering.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 300);

  val cyberbrain = Augmentation(
    name = "Cyberbrain",
    category = c,
    appliesTo = List(Pod, Synthmorph),
    descr = "Cybernetic brains are where the ego (or controlling AI) resides in synthmorphs and pods. Modeled on biological brains, cyberbrains have a holistic architecture and serve as the command node and central processing point for sensory input and decision-making. Only one ego or AI may “inhabit” a cyberbrain at a time; to accommodate extras, mesh inserts (p. 300) or a ghostrider module (p. 307) must be used. Since cyberbrains store memories digitally, they have the equivalent of mnemonic augmentation (p. 307). They also have a built-in puppet sock (p. 307) and may be remote-controlled, though this option may be removed by those who value their security. Cyberbrains are vulnerable to cyberbrain hacking (p. 261) and other forms of electronic infiltration/attack. Cyberbrains come equipped with two or more pairs of external access jacks (p. 306), usually located at the base of the skull, which allow for direct wired connections.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 300);

  val list: List[Augmentation] = Macros.memberList[Augmentation];
}
