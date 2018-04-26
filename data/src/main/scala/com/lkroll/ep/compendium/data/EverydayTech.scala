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

  val list: List[Gear] = Macros.memberList[Gear];
}
