package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object EverydayTech {
  val c = "Everyday Technology";

  val ecto = Gear(
    name = "Ecto",
    category = c,
    descr = "Ectos are the external version of basic mesh inserts (p. 300), minus the medical sensors. These colorful devices serve as a wearable mesh terminal, PDA, locator, and camera-phone. The devices are flexible (often worn as bracelets), dirt-resistant, self-cleaning, and may be stretched out to increase screen size. They may project holographic displays and are typically equipped with wireless-enabled glasses or contact lenses and decorative earpieces or earrings so that the user may access augmented reality. Given the ubiquity of mesh inserts, ectos are growing less common, but they are still used by bioconservatives, others without implants, and those who prefer to access the mesh via an external device for security concerns.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 325);

  val holoProjector = Gear(
    name = "Holographic Projector",
    category = c,
    descr = "These devices are capable of projecting high-definition, ultra-realistic three-dimensional images and movies. From a distance (20+ meters), such holograms can be difficult to distinguish as fake, but up close they are easier to see for what they are (+20 Perception Test modifier). Holograms do not appear in wavelengths other than visual light, and so are easily identified by anyone with enhanced vision.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 325);

  val microgravShoes = Gear(
    name = "Micrograv Shoes",
    category = c,
    descr = "These shoes are equipped with velcro and/or a magnetic system, allowing the wearer to walk normally on appropriate surfaces in micrograv and zero-G environments, rather than floating or bouncing.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 325);

  val portableSensor = Gear(
    name = "Portable Sensor",
    category = c,
    descr = "This is a small portable (possibly even wearable) sensor system. The type of sensor must be chosen (for example: infrared, lidar, radar, x-ray). Combined sensor systems are also available, at a cumulative cost. See Radio and Sensor Ranges, p. 299. and Using Enhanced Senses, p. 302.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 325);

  val smartClothing = Gear(
    name = "Smart Clothing",
    category = c,
    descr = "Smart clothing can change its color, texture, and even its cut, taking only a minute or two to transform from a solid color jumpsuit to a plaid party dress or a replica of a pinstriped, late 20th century business suit. It can also camouflage the wearer, providing a +20 bonus to Infiltration Tests to avoid being seen, as long as the wearer is stationary or not moving faster than a slow walk, and as long as the wearer is completely covered or also using chameleon skin (p. 303) of the same color/pattern. If incompletely camouflaged, or if moving faster, reduce the modifier to +10. Smart clothing also keeps the character warm or cool, allowing the character to exist comfortably in environments from –40º to 70ºC.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 325);

  // Moved to ArmourEP
  //  val smartVacClothing = Gear(
  //    name = "Smart Vac Clothing",
  //    category = c,
  //    descr = "Like regular smart clothing, this outfit can also transform into a light vacsuit (p. 333). It also functions as armor, rating 2/4.",
  //    price = Cost.Moderate,
  //    source = Sources.ep,
  //    sourcePage = 325);

  val toolKit = Gear(
    name = "Tool Kit",
    category = c,
    descr = "Tools come in kits (portable), shops (can fit into a large vehicle), and facilities (large, non-mobile). Each set of tools applies to a particular skill, such as Hardware: Electronics or Hardware: Groundraft.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 326);

  val toolShop = Gear(
    name = "Tool Shop",
    category = c,
    descr = "Tools come in kits (portable), shops (can fit into a large vehicle), and facilities (large, non-mobile). Each set of tools applies to a particular skill, such as Hardware: Electronics or Hardware: Groundraft.",
    price = Cost.High,
    source = Sources.ep,
    sourcePage = 326);

  val toolFacility = Gear(
    name = "Tool Facility",
    category = c,
    descr = "Tools come in kits (portable), shops (can fit into a large vehicle), and facilities (large, non-mobile). Each set of tools applies to a particular skill, such as Hardware: Electronics or Hardware: Groundraft.",
    price = Cost.Expensive,
    source = Sources.ep,
    sourcePage = 326);

  val utilitool = Gear(
    name = "Utilitool",
    category = c,
    descr = "This hand tool includes a specialized small nanobot generator. In its basic form, a utilitool is the size and shape of a large fountain pen. It can transform into almost any tool, however, from a wrench, knife, or powered screwdriver to a rotary grinder or pair of pliers. Some inexpensive utilitools are optimized for specialized tasks, like cooking or wilderness survival, but more expensive models become almost any imaginable hand tool. Utilitools are normally mentally controlled using the character’s basic mesh inserts. Characters without such implants can control the tool via voice commands and touch controls. Characters using a utilitool gain a +10 modi- fier to skills involving repairing or modifying devices with mechanical parts, opening locks, disarming alarm systems, or performing first aid.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 326);

  val viewers = Gear(
    name = "Viewers",
    category = c,
    descr = "These small and highly advanced binoculars possess all the visual enhancement of specs (p. 326), but also provide 50x magnification. They also include a directional microphone that magnifies sound from the direction the viewers are pointed by a factor of 50. Viewers provide the user with a +30 bonus to all Perception Tests involving vision or hearing for the target they are aimed at. This bonus is not cumulative with bonuses from any other device or augmentation.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 326);

  // Firewall
  val morphStoragePod = Gear(
    name = "Morph Storage Pod",
    category = c,
    descr = "This coffin-sized tank keeps a biomorph safely stored in medical stasis. They are routinely used in body banks and egocasting facilities, maintaining unused sleeves in a coma-like state within a nutrient bath. Some jurisdictions only allow morph storage pods to be operated by certified medical personnel and technicians.",
    price = Cost.Moderate,
    source = Sources.firewall,
    sourcePage = 175);

  // Gatecrashing
  val standardBatteries = Gear(
    name = "Standard Batteries",
    category = c,
    descr = "Standard batteries are micro- sized, high-density, ultra-capacity, room-temperature superconductors good for hundreds of hours of operation. They are adapted to receive power from wireless energy transmitters or they can be replenished rapidly by attaching them to a recharger.",
    price = Cost.Trivial,
    source = Sources.gatecrashing,
    sourcePage = 155);

  val nuclearBatteries = Gear(
    name = "Nuclear Batteries",
    category = c,
    descr = "These batteries actually generate their own power from radio-isotope decay, storing it up for use. They come in many sizes, from nano to small. Depending on their size and the needs of the device, these batteries can produce power for anywhere from 3 years to over a century (higher output batteries use isotopes with shorter half-lives and vice versa).\nGatecrashers rely upon a multitude of powered devices and recharging them on an alien world can be difficult. Since solar power may not exist on all worlds gatecrashers visit, many carry along a nuclear battery, using it to recharge their standard batteries and devices.The standard portable nuclear battery is designed to put out 1kW of power continuously for up to three years. This device can recharge low powered devices within a few minutes and larger higher powered devices within several hours.\nNuclear batteries are used in both railguns and energy weapons to recharge the standard batteries that power these weapons.\nThese nuclear batteries can regenerate their charge at a rate of 20 shots per hour. Changing a battery is a Simple Action.",
    price = Cost.Low,
    source = Sources.gatecrashing,
    sourcePage = 155);

  val gripTape = Gear(
    name = "Grip Tape",
    category = c,
    descr = "This sticky nanotape can be applied to almost any surface, allowing items to be stuck in place with the adhesive power of grip pads. Pulling in a parallel direction is very difficult, but items are easily released by pulling up (perpendicular) to the surface instead.",
    price = Cost.Trivial,
    source = Sources.gatecrashing,
    sourcePage = 155);

  val solarRecharger = Gear(
    name = "Solar Recharger",
    category = c,
    descr = "Designed using thin-film solar cells over a layer of smart materials, this lightweight unit comes in a small-sized portable that unfolds into a 1.5-square- meter panel. Like the nuclear recharger, it produces 1kW of power and can recharge low powered devices rapidly and larger higher powered devices within several hours. However, it requires sunlight or the equivalent to function.",
    price = Cost.Trivial,
    source = Sources.gatecrashing,
    sourcePage = 155);

  val wirelessEnergyTX = Gear(
    name = "Wireless Energy Transmitter",
    category = c,
    descr = "When attached to a power source like a nuclear battery, nuclear recharger, or solar recharger, the small-sized wireless energy transmitter will transfer power to devices within 20m via near field resonant inductive coupling. Though this technology is widespread in transhuman habitats, removing the need for power cords when a nearby power source is readily available, it is a useful device for gatecrashers to keep their gear charged without needing to worry about plugging in.",
    price = Cost.Trivial,
    source = Sources.gatecrashing,
    sourcePage = 155);

  val list: List[Gear] = Macros.memberList[Gear];
}
