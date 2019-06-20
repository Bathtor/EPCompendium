package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object SurvivalGear {
  val c = "Survival Gear";

  val breadcrumbPositioningSystem = Gear(
    name = "Breadcrumb Positioning System",
    category = c,
    descr =
      "This worn device leaves micro “breadcrumbs” behind as the character moves. These devices interact with mesh inserts (or ectos) as long as they are within range (50 meters), allowing the user to map their position in relation to the breadcrumb trail. This is useful in derelict habitats, wilderness, and other areas where there is no local functioning mesh, and is helpful both for mapping and for finding one’s way back.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 332
  );

  val electrograviticsNet = Gear(
    name = "Electrogravitics Net",
    category = c,
    descr =
      "Also called a safety net, this failsafe system uses electric fields to counter gravity when falling. While the system is not able to actually levitate heavy objects, it will slow down a fall enough that the user can land safely if the gravitational force is not too high (the fall height is not greater than 50 meters in 1G). Generating these electric fields consumes a lot of energy, so the net is only charged for one use only and needs to be recharged afterwards.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 332
  );

  val electronicRope = Gear(
    name = "Electronic Rope",
    category = c,
    descr =
      "The fibers in this rope can be controlled electronically, making it move in a snake-like fashion, stiffen up, and even wrap around objects. Typically comes in a 50-meter length capable of supporting 250kg.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 332
  );

  val emergencyBubble = Gear(
    name = "Emergency Bubble",
    category = c,
    descr =
      "Commonly used as a last resort “life raft” on spaceships, an emergency bubble is made of advanced smart materials and comes in a portable package that can be quickly inflated (1 Action Turn) around the user, usually inside an airlock. The bubble has a 5-meter diameter and can comfortably accommodate 4 people. It maintains 1 atmosphere of pressure in a vacuum, protects the inhabitants from temperatures ranging from –175º to 140ºC, and provides light, breathable air and water and food recycling for up to four human-sized inhabitants, using its built in maker (p. 328). It features a simple airlock, carries an emergency distress beacon (below), and can be transparent, opaque, or polarized. It is powered by a small nuclear battery and also includes comfortable inflatable furniture.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 332
  );

  val emergencyDistressBeacon = Gear(
    name = "Emergency Distress Beacon",
    category = c,
    descr =
      "This small but powerful transmitter is powered by a nuclear battery and will broadcast any programmed distress call for years. Though portable and medium-sized, this beacon has a range of 500km in urban areas and 5,000km elsewhere.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 333
  );

  val flashlight = Gear(
    name = "Flashlight",
    category = c,
    descr =
      "These handheld, wearable, or portable lights can display light in the normal visual spectrum, infrared, or ultraviolet, as desired.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 333
  );

  val nanobandage = Gear(
    name = "Nanobandage",
    category = c,
    descr =
      "Characters without medichines must rely on external sources of healing. The most common option is the nanobandage – a plum-sized advanced nanotechnology generator built into a reusable, self-sterilizing bandage. It can treat all forms of injury and illness, from poisoning to burns to trauma. Characters simply apply the bandage to the wound and let the nanobots do the work. It removes pain and discomfort and speeds healing (see Biomorph Healing, p. 208). For especially severe injuries, physical first aid such as setting bones and removing projectiles may be necessary (gamemaster’s choice). If the wounds are too severe (the patient has suffered more than five wounds), the unit places the patient in medical stasis and radios for emergency services.",
    price = Cost.Trivial,
    source = Sources.ep,
    sourcePage = 333
  );

  val repairSpray = Gear(
    name = "Repair Spray",
    category = c,
    descr =
      "This nanobot generator creates nanobots designed to repair synthmorphs, vehicles, and other common objects. Repair spray contains the specifications and plans for almost all commonly used synthmorphs and devices and is a ubiquitous household item. If it does not contain the specifications for something it is being used to repair, it must query the object’s voice for these details, otherwise it cannot repair it. Simply touch it to the damaged area, push the button on top, and it sprays out a number of nanobots sufficient to make repairs. These nanobots repair 1d10 points of damage per 2 hours. Once all damage is restored, the nanobots repair wounds at the rate of 1 per day. Repair spray also cleans and polishes items and returns them to a pristine and new state. Repair spray is not effective on any object with more than 3 wounds, but it provides a +30 to all repair rolls on anything too badly damaged for it to fully repair (see Synthmorph and Object Repair, p.208).",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 333
  );

  val shelterDome = Gear(
    name = "Shelter Dome",
    category = c,
    descr =
      "A variant of the emergency bubble, this package unfolds into a dome with a 2.5-meter ceiling and a floor 4 meters across. To safely use this shelter, it must be staked down to the surface it is placed on.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 333
  );

  val spindle = Gear(
    name = "Spindle",
    category = c,
    descr =
      "A spindle is an advanced nanotechnology generator that produces a super-strong cable. It can produce up to 2km of 0.2mm diameter line than can support up to 250kg before it needs more raw materials. The spindle can produce up to 20m of cable every second. It can produce line in a continuous length or cut the cable it produces to any length. Spindles can also reabsorb their cable, retracting it at a rate of 5m/s. As long as it is recharged and has small amounts of additional material added every 1,000h of use, a spindle can keep producing and retracting cable indefinitely. By setting the maximum production speed at 10m/s a character with a spindle can safely jump off a building and land safely, using the cable to slow their descent.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 333
  );

  val spindleClimber = Gear(
    name = "Spindle Climber",
    category = c,
    descr =
      "This device attaches to a spindle and transforms it into a highly effective climbing device. The spindle climber has two functions. First, it attaches hardened tips to the spindle’s cable and fires it at high speed, up to 50m, with sufficient force to imbed the tip into almost any sufficiently durable surface. Second, the spindle climber can pull itself and up to 250kg up the cable at a speed of up to 2m/s. A spindle climber has enough power to shoot and pull up the cable 50 times before it must be recharged. A spindle fits inside a spindle climber.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 333
  );

  // Vacsuits in ArmourEP

  // Gatecrashing
  val biodefenseUnit = Gear(
    name = "Bio-defence Unit",
    category = c,
    descr =
      "Though it is unlikely that gatecrashers will catch an alien disease, they are more likely to suffer (sometimes severe) allergic reactions to alien compounds or encounter alien life or environments that are poisonous, acidic, or otherwise harmful. In order to create a safe zone for an encampment in an alien environment, gatecrashers may deploy a bio-defense unit (BDU). This device consists of an advanced nanotech hive that deploys a nanobot swarm over a small area, specifically designed to destroy and break down all life or other complex organic molecules that are alien or toxic/dangerous to transhumans. The nanobots produced by this unit have no effect on any Earth-derived life or on any safe compounds they produce. However, all known alien life possesses biochemistries that are highly distinctive and so a BDU can easily destroy all non-Earth life without risking any harm to gatecrashers or any pets, test animals, or biological compounds they bring with them from the solar system. The operator can also add specific alien life forms and compounds to the list of targets that the BDU will specifically not attack.\nThe BDU is a small 15cm hemisphere that contains the hive and a swarm of nanobots. When activated, the swarm deploys over an area 20m in diameter (or less if the operator desires). Users can combine multiple BDUs to clear larger areas. Within the designated area, the nanobots destroy and break down all alien life and remove every trace of alien biological activity, leaving behind only sterile soil, bare rock, and pure water. In addition to removing potential toxins, the BDU also clears an area of even the sturdiest alien plants that might interfere with setting up camp. Alien life that wanders into the protected area automatically suffers 1d10 ÷ 2 DV per Action Turn. If the creature has armor this will be eaten away first. This damage continues as long as the creature remains within the protected area. This process is sufficiently painful that almost all alien life swiftly flees the protected area. Outside of the safe zone, the nanobots deactivate and break down.",
    price = Cost.High,
    source = Sources.gatecrashing,
    sourcePage = 157
  );

  val biodefenseSwarm = Gear(
    name = "Bio-defence Swarm",
    category = c,
    descr =
      "A swarm of bio-defense nanobots may be purchased separately in simple canisters from which they can be programmed and released to cover a 10m radius area. Without the hive, this nanoswarm will deplete to ineffectiveness after 2 weeks.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 157
  );

  val defensiveBeacons = Gear(
    name = "Defensive Beacons",
    category = c,
    descr =
      "Gatecrashers usually have no idea what sort of hostile entities they may face on a new world. When making camp or investigating an area, defense beacons keep gatecrashers from being surprised by dangerous wildlife, rival parties of gatecrashers, or ancient automated defense systems. This set of defense beacons consists of a medium-sized portable pack containing four rods, each half a meter in length and 3cm in diameter. These rods telescope out to 3 meters in height and are designed to be hammered into or attached to any surface.\nEach rod contains a series of infrared, radar, and ultrasonic sensors as well as powerful miniature speakers, a stunner, and a microwave agonizer capable of firing in both normal and “roast” mode (p. 339, EP). To use this device, the operator places the four rods upright in a square or rectangle around the camp or other area that they wish to protect. Each rod can be as far as 30m from the two nearest rods. Additional defense beacon packs may be deployed to cover a larger perimeter. The operator then designates those individuals and devices that are allowed to freely cross the barrier created by these rods and also determines the minimum size of intruders that will be defended against and the level of defense. Once in place, defense beacons warn everyone inside the camp, using either speakers or radio, of any intruders either coming within 30m or attempting to cross the invisible fence created by the four rods. Also, defense beacons can be programmed to use the stunners or microwave agonizers against any intruders (they have Beam Weapons skill 40). Meanwhile, the inhabitants of the camp can walk in or out of the protected area without harm or annoyance.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 157
  );

  val emergencyRations = Gear(
    name = "Emergency Rations",
    category = c,
    descr =
      "Sometimes all technology fails. Even the best makers and life support systems can break down or be disabled by hostile actions. Since alien plants and animals are almost universally inedible, some gatecrashers carry along a supply of compressed emergency rations. The most common form of emergency food is a mini-sized package of 9 small bars that supply complete calories and nutrition for a total of 3 full days. Most people consider food created by even the cheapest maker to be gourmet cuisine when compared to these rations.",
    price = Cost.Trivial,
    source = Sources.gatecrashing,
    sourcePage = 158
  );

  val faradaySuit = Gear(
    name = "Faraday Suit",
    category = c,
    descr =
      "Originally designed for exploring habitats that had been attacked or largely destroyed by the TITANs, this device has also been adapted for use on high-risk gatecrashing missions where the gatecrashers suspect that they will encounter TITAN-created relics or aliens devices that might produce a variety of dangerous inputs. This suit covers the entire body in a climate-controlled garment with an outer surface that reflects all microwaves and radio waves (meaning they are +10 to detect with radar). The suit is lined with a superconductive charged wire mesh, effectively cocooning the user in a bubble from which they can neither send nor receive radio signals. This cuts the wearer off from the mesh and other data sources, but also protects them from hacking attacks and mesh – or radio-based basilisk hacks.\nIn addition, the suit’s helmet is opaque on the exterior and soundproofed, preventing the viewer from seeing out in the normal and near-visual spectrums or hearing noises around them. The helmet is mounted with an external camera (visual and infrared) and microphone, however, that feed input inside the helmet (though still outside the Faraday mesh). The helmet’s built-in speaker and screen are designed to deliberately degrade information they display/emit, however, to impede potential hostile sensory inputs (+30 to tests to resist basilisk hacks). As a result, while wearing this suit, all sounds are somewhat distorted and vision is fuzzy and indistinct. While these limitations can be problematic, they also render the wearer immune (or at least resistant) to all known forms of incapacitating or mentally affecting inputs.\nAll Faraday suits include radio links so that other team members can communicate with the wearer. However, these radios cannot be connected to the wearer’s basic implants. Instead, the wearer must use the deliberately low-grade microphone and speakers in the helmet to communicate with others. An actual old-fashioned keyboard mounted on the suit’s arm enables text messages in case audio signals are too degraded or full radio considered too dangerous. These measures minimize the chance that if one member of a team is affected by incapacitating inputs, they will be able to spread the memetic infection to the rest of the team.\nThe helmets of Faraday suits are designed to retract into a barely noticeable collar. They can go from this state to a fully activated helmet within 1 Action Turn. Except in obviously dangerous situations, most users wear the helmets open, thus permitting them to use basic implants and ectos normally. Many users instruct their muse to automatically activate the helmet if they detect any potentially dangerous inputs to protect the wearer.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 158
  );

  val filterStraw = Gear(
    name = "Filter Straw",
    category = c,
    descr =
      "Designed to function without power or the need for any active nanotechnology, filter straws contain a set of specially designed self-cleaning microfilters that allow the user to safely drink any liquid that contains even a small amount of water. Filtration straws filter out mud, salt, and all dissolved chemicals or suspended particles. They are the size of large drinking straws and are flexible.",
    price = Cost.Trivial,
    source = Sources.gatecrashing,
    sourcePage = 159
  );

  val healingPod = Gear(
    name = "Healing Pod",
    category = c,
    descr =
      "Healing vats are too expensive and bulky for most gatecrashers to carry with them. However, both medichines and nanobandages heal wounds at a much slower rate. Also, neither of these two types of medical technology can deal with the most severely wounded morphs. Instead, both place such morphs in medical stasis. Since gatecrashers can rarely afford to either wait several days to heal or to carry around a comrade in medical stasis, a disposable healing pod was developed. This small-sized device contains a wide variety of advanced medical repair and life support nanotechnology.\nTo use this device, the patient must either be in a functional vacsuit or the healing pod must be connected to a Life-Support Pack (p. 159) and the patient placed into a morph-sized sack that is included with the device. When the healing pod is activated, the unit’s compressed nanobots swarm out, envelop the patient, and thoroughly infiltrate their body. These nanobots heal the patient with the same speed and effectiveness as a healing vat (p. 326, EP).\nA version of the healing pod exists that is designed to repair synthmorphs. It does not require a working vacsuit or an LSP and comes with a limited supply of the raw materials needed for synthmorph repair. A single healing pod can heal either biomorphs or synthmorphs, not both.\nHealing pods can be re-used, but their nanotech is only able to heal a total of 10 wounds. Once a healing pod has healed that many wounds, the medical nanobots have been used up and a new healing pod must be acquired.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 159
  );

  val lifesupportPack = Gear(
    name = "Life-support Pack",
    category = c,
    descr =
      "Ordinary vacsuits are only designed for relatively short term use, but gatecrashers might stay on uninhabitable worlds for many weeks. A life-support pack (LSP) is a thick belt that contains a small nuclear battery as well as advanced filters and a specialized maker that allow it to supply the wearer with pure air for up to 30 days. If the wearer periodically adds water or ice or spends time in an atmosphere containing oxygen, even if this oxygen is part of carbon dioxide or some other gas, then the LSP automatically replenishes its oxygen supply and can continue to provide air for the wearer for the next two years. The LSP’s nuclear battery is also designed to interface with the vacsuit it is attached to, allowing it to power that suit for a similar length of time. LSPs can be worn with either light or standard vacsuits, but are most useful when used with standard vacsuits, since they also provide the wearer with food and water.",
    price = Cost.Moderate,
    source = Sources.gatecrashing,
    sourcePage = 159
  );

  val plasmaCutter = Gear(
    name = "Plasma Cutter",
    category = c,
    descr =
      "Plasma cutters are useful cutting and excavation tools that also work as short-range weapons. They are devices that are halfway in use and power between a plasma torch and a plasma rifle and are designed to cut rock, refractory alloys, and similar substances. They have a maximum range of 15 meters and can be fired continuously to cut away large segments of even the thickest rock wall very rapidly. Plasma cutters consist of a hand-held unit the size of a small, thick rifle that is connected to a small backpack unit by a flexible cable.",
    price = Cost.High,
    source = Sources.gatecrashing,
    sourcePage = 159
  );

  // Panopticon
  val airMask = Gear(
    name = "Air Mask",
    category = c,
    descr =
      "This simple face-covering breathing mask comes with a small-sized air tank with enough air for 2 hours. A medium-sized air tank version, good for 12 hours, is also available.",
    price = Cost.Trivial,
    source = Sources.panopticon,
    sourcePage = 157
  );

  val airMaskLarge = Gear(
    name = "Air Mask (Large Tank)",
    category = c,
    descr =
      "This simple face-covering breathing mask comes with a small-sized air tank with enough air for 2 hours. A medium-sized air tank version, good for 12 hours, is also available.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 157
  );

  val oxygenCandlesS = Gear(
    name = "Oxygen Candles (Small)",
    category = c,
    descr =
      "In the event of a life support failure, a breathable atmosphere can be created in a pressurized space by using a solid-fuel oxygen generator. A standard portable medium-sized version produces 75 man-hours of oxygen once ignited. A smaller pocket-sized version produces 15 man-hours.",
    price = Cost.Low,
    source = Sources.panopticon,
    sourcePage = 157
  );

  val oxygenCandlesM = Gear(
    name = "Oxygen Candles (Medium)",
    category = c,
    descr =
      "In the event of a life support failure, a breathable atmosphere can be created in a pressurized space by using a solid-fuel oxygen generator. A standard portable medium-sized version produces 75 man-hours of oxygen once ignited. A smaller pocket-sized version produces 15 man-hours.",
    price = Cost.Moderate,
    source = Sources.panopticon,
    sourcePage = 157
  );

  // Rimward
  val hibernationPod = Gear(
    name = "Hibernation Pod",
    category = c,
    descr =
      "In the outer system, distances are long and conditions are harsh. In emergencies, individuals may be isolated for weeks or months. To avoiding running out of life support or suffering the effects of extreme cold and severe boredom, users can rely on this device. Before it is activated, this pod comes in a small pouch containing a miniature nuclear battery, a supply of medical stasis nanobots, life support foam, and an emergency broadcast transmitter. This pouch has a mass of 3 kg and is approximately the size of a thick hardback novel. To active it, users open it, pull the smart material fabric around themselves, and activate the nanobots and the foam. Within 2 minutes, the device becomes a rigid pod 1 meter wide and thick and 2.4 meters long, filled with both the now solid foam and the user. The user can choose to either become unconscious or radically slow down their thoughts. The pod automatically awakens the user within one minute of entering a habitable atmosphere or if they receive a message. This device works on all biomorphs and pods and keeps them safe for up to one decade. Lacking the need for food or air, synthmorphs do not require this device.",
    price = Cost.Moderate,
    source = Sources.rimward,
    sourcePage = 193
  );

  val smartAnchors = Gear(
    name = "Smart Anchors",
    category = c,
    descr =
      "This harness is worn by a user but operated by a built-in AI. When activated, the harness deploys up to six anchoring cables with a reach of ten meters. These cables are designed to either spike into dirt, rock, or ice or use grip pads to fasten to an appropriate surface, with the intention of keeping them anchored should they accidentally drift off into space or kick off with enough force to reach a terminal velocity. The cables shorten or lengthen as needed to give the wearer slack and the freedom to move around. If the user moves a distance farther than one cable can reach, it will retract that cable and immediately deploy another. The device always keeps at least three cables anchored at a time.",
    price = Cost.Low,
    source = Sources.rimward,
    sourcePage = 193
  );

  // Sunward
  val breather = Gear(
    name = "Breather",
    category = c,
    descr =
      "Martian breathers are the size of a small backpack and use solar cells, nanobots, and a water reservoir to turn atmospheric CO2 into O2 and methane (CH4). A CO2 scrubber also recycles the oxygen. As long as the character wearing the breather spends two hours a day in sunlight and feeds the unit a kilo of water a day (chunks of ice or even perma- frost work fine), they may subsist on the Martian atmosphere indefinitely. Another part of the unit continually extracts atmospheric nitrogen and adds it to the mix as a buffer gas. A backup power supply powers the unit for up to 24 hours in darkness or dust storms, and a backup tank holds up to 8 hours of breathable air.",
    price = Cost.Low,
    source = Sources.sunward,
    sourcePage = 167
  );

  val breatherLargerPS = Gear(
    name = "Breather (Larger Power Supply)",
    category = c,
    descr =
      "Martian breathers are the size of a small backpack and use solar cells, nanobots, and a water reservoir to turn atmospheric CO2 into O2 and methane (CH4). A CO2 scrubber also recycles the oxygen. As long as the character wearing the breather spends two hours a day in sunlight and feeds the unit a kilo of water a day (chunks of ice or even perma- frost work fine), they may subsist on the Martian atmosphere indefinitely. Another part of the unit continually extracts atmospheric nitrogen and adds it to the mix as a buffer gas. A backup power supply powers the unit for up to 1 week in darkness or dust storms, and a backup tank holds up to 8 hours of breathable air.",
    price = Cost.Moderate,
    source = Sources.sunward,
    sourcePage = 167
  );

  val breatherBladder = Gear(
    name = "Breather Collection Bladder",
    category = c,
    descr =
      "Recycling-conscious travelers can add a bladder to the Breather that fills up with methane for use in fueling vehicles. The output from a breather used by an average-sized person over the course of day is enough to fuel a mars buggy for an hour or two.",
    price = Cost.Trivial,
    source = Sources.sunward,
    sourcePage = 167
  );

  val coldWeatherGear = Gear(
    name = "Cold Weather Gear (Basic)",
    category = c,
    descr =
      "This is a full suit of clothing for extreme cold weather, including boots, jacket, pants, gloves, face mask, and goggles, with apertures and clips for breathing equip- ment. Much less bulky than its antique equivalents, these suits allow full maneuverability. They come in two versions: basic (for rusters and alpiners) which protects up to –50 C, and survival (for most other morphs), which protects up to –100ºC.",
    price = Cost.Trivial,
    source = Sources.sunward,
    sourcePage = 167
  );

  val coldWeatherGearSurvival = Gear(
    name = "Cold Weather Gear (Survival)",
    category = c,
    descr =
      "This is a full suit of clothing for extreme cold weather, including boots, jacket, pants, gloves, face mask, and goggles, with apertures and clips for breathing equip- ment. Much less bulky than its antique equivalents, these suits allow full maneuverability. They come in two versions: basic (for rusters and alpiners) which protects up to –50 C, and survival (for most other morphs), which protects up to –100ºC. The survival version is partially pressurized for morphs operating in the extreme low pressures of the Martian highlands.",
    price = Cost.Low,
    source = Sources.sunward,
    sourcePage = 167
  );

  val highdiveSuit = Gear(
    name = "High-dive Suit",
    category = c,
    descr =
      "High-dive suits are individual spacesuits specifically designed to withstand atmospheric re-entry and allow the occupant to reach a planet’s surface safely. They feature a liquid-cooled thermal regulation system, a closed-loop oxygen system with chemical scrubbers, small gas jets, a drogue chute, and a conventional parachute. High-dive suits are made of fullerene with a refractory metal coating and an opaque sapphire faceplate. A mini-oxygen tank and rebreather provide the wearer with 3 hours worth of breathing air. A high-dive suit compares to light body armor in terms of general protection, though its refractive glazing and heat-transfer systems provide extra protection against energy weapons (AV 13/10). Because of its thermal dampening systems (see p. 313, EP), a high-dive suit also makes its wearer difficult to spot with thermal sensors (–30 modifier to Perception Tests), unless they are entering atmosphere, in which case they are difficult to miss (+30). Note that high-dive suits were designed for (unpow- ered) descent only—they are not equipped for any sort of powered flight.",
    price = Cost.High,
    source = Sources.sunward,
    sourcePage = 167
  );

  val mercurySuit = Gear(
    name = "Mercury Suit",
    category = c,
    descr =
      "These modified hard suits feature extreme heat and radiation shielding, enabling an occupant to survive on Mercury’s surface under both day and night conditions. They have all of the standard features of hard suits (p. 334, EP) except that they can withstand temperatures of –200º to 500ºC. The extra protection hinders the wearer’s movement; reduce Movement rate by half and apply a –10 modifier to all COO-linked tests.",
    price = Cost.Expensive,
    source = Sources.sunward,
    sourcePage = 168
  );

  val pressureTent2 = Gear(
    name = "Pressure Tent (2P)",
    category = c,
    descr =
      "This is a collapsible shelter for two people, plus gear. Pressure tents contain heating and will inflate with a breathable atmosphere using a breather- like device.",
    price = Cost.Low,
    source = Sources.sunward,
    sourcePage = 168
  );

  val pressureTent4 = Gear(
    name = "Pressure Tent (4P)",
    category = c,
    descr =
      "This is a collapsible shelter for four people, plus gear. Pressure tents contain heating and will inflate with a breathable atmosphere using a breather- like device.",
    price = Cost.Moderate,
    source = Sources.sunward,
    sourcePage = 168
  );

  val solarSurvivalSuit = Gear(
    name = "Solar Survival Suit",
    category = c,
    descr =
      "Solar survival suits are hard suits with special modifications, equivalent to the coronal adaptation trait (p. 164). The survival suit also possesses an extremely powerful emergency beacon, strong enough to punch through the sun’s electromagnetic background roar. The built-in maker provides enough air, water, and food for the wearer to survive indefinitely. Solar survival suits provide armor of AV 20/15. In the event that a survivor is subjected to a coronal mass ejection, the suit’s effectiveness is drastically reduced. Subjected to high density plasma with temperatures reaching tens of millions Kelvins, the suit will only protect the wearer for a few seconds at best—just long enough for a survivor to access their cortical stack’s emergency farcaster before being vaporized.",
    price = Cost.Expensive,
    source = Sources.sunward,
    sourcePage = 168
  );

  val venusSuit = Gear(
    name = "Venus Suit",
    category = c,
    descr =
      "Venus suits have the same characteristics as Mercury suits, plus they are specially modified to protect a biomorph from the crushing pressure on Venus’s surface.",
    price = Cost.Expensive,
    source = Sources.sunward,
    sourcePage = 168
  );

  val list: List[Gear] = Macros.memberList[Gear];
}
