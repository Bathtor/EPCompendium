package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros
import com.lkroll.ep.compendium.Cost.ExpensivePlus

object MorphsTX {
  import MorphImplicits._
  import MorphType._
  import Cost._
  import Sources._

  val takko = MorphModel(
    name = "Takko",
    morphType = Synthmorph,
    descr = "The first synthetic octopus design from the engineers at Feral Robot is a hardy shell custom-designed to make octopi uplifts feel more at home in a synthetic body with eight functioning appendages. Though it lacks ink sacs, the takko features vectored-thrust jets for micro-gravity propulsion.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Extra Limbs (8 Arms)", "Grip Pads", "Mnemonic Augmentation", "Polarization Vision"),
    movement = Seq("Walker 4/24", "Thrust Vector 8/40"),
    aptitudeMax = 30,
    durability = 40,
    attacks = Seq(MorphAttacks.takkoBeak),
    skillBonus = Seq(("Free Fall" -> 10), ("Climbing" -> 10)),
    aptitudeBonus = AptitudeValues(int = 5, coo = 5, som = 5),
    armour = (8, 8),
    cpCost = 60,
    price = ExpensivePlus(45000),
    source = mrg);

  val theseus = MorphModel(
    name = "Theseus",
    morphType = Biomorph,
    descr = "While there are no sanctioned explorations of Earth, a few daring or greedy transhumans defy the laws to salvage there. Some scavengers and explorers still scour the ruins of habitats that were destroyed during the Fall. Others look for wealth and secrets in the quarantined zones on Luna and Mars. Some simply seek out remaining TITAN machines to destroy, wherever they may be found. The theseus is a popular biomorph for this type of work. Its medichines and nanophages keep the morph protected from most attacks by exsurgent nanotech, and the lack of a cyberbrain makes it less vulnerable to mind hacking. An emergency farcaster allows the user to safely return from situ- ations where both their morph and their cortical stack might be destroyed or corrupted.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Cortical Stack", "Direction Sense", "Emergency Farcaster", "Enhanced Vision", "Low Pressure Tolerance", "Medichines", "Nanophages", "Oxygen Reserve", "Radiation Sense", "T-Ray Emitter", "Temperature Tolerance (Cold)", "Toxin Filters"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 40,
    aptitudeBonus = AptitudeValues(wil = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val vacuumPod = MorphModel(
    name = "Vacuum Pod",
    morphType = Pod,
    descr = "Optimized for vacwork, this pod is preferred in situations where novacrabs or synths don’t fare as well socially. The vacuum pod is based on the bouncer morph and looks superficially identical to one.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Cortical Stack", "Cyberbrain", "Enhanced Respiration", "Grip Pads", "Mnemonic Augmentation", "Oxygen Reserve", "Prehensile Feet", "Puppet Sock", "Vacuum Sealing"),
    traits = Seq("Limber (Level 1)", "Social Stigma (Pod)"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 35,
    aptitudeBonus = AptitudeValues(coo = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val venusianGlider = MorphModel(
    name = "Venusian Glider",
    morphType = Biomorph,
    descr = "The glider is designed to survive for many hours in Venus’s unbreathable atmosphere. Tall and thin, with long, strong limbs and a lightweight build, this morph also features gliding membranes (p. 166, Sunward) that allow it to soar through the upper Venusian atmosphere. It can even gain altitude by riding thermals (which it can see using its enhanced vision). Once Venusian terraforming efforts are complete, an upgraded version of this morph will be able to breathe normally.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Enhanced Respiration", "Enhanced Vision", "Gliding Membranes", "Grip Pads", "Prehensile Feet", "Respirocytes"),
    traits = Seq("Limber (Level 1)"),
    movement = Seq("Walker 4/20", "Gliding"),
    aptitudeMax = 30,
    durability = 30,
    aptitudeBonus = AptitudeValues(ref = 5, som = 5),
    playerDecisions = Some("+5 to two other aptitudes"),
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val whiplash = MorphModel(
    name = "Whiplash",
    morphType = Pod,
    descr = "Designed by autonomist xenobotanists as an experiment in developing a cyberbrain/planimal interface, whiplash pods are bioengineered from planimal stock found on Sunrise (see Exotic Life, p. 130, Gatecrashing), with other transgenic features (see Whiplash, p. 173, Gatecrashing). Whiplash pods are gaining some traction among gatecrashers due to their ability to blend in to arboreal environments. The primary modification made to the whiplash stock was to turn the entire organism upside down and orient the digestive portion of the organism horizontally, so that the whiplash’s tri-lobed orifice faces forward. The whiplash’s grasping roots were also converted into even more motile “walking tentacles” borrowed from other Sunrise planimals. Other adjustments include the addition of a pair of grasping limbs, each with four universally opposable digits; artificial sensing mods (providing transhuman-standard sensing ability); and a general toughening of the internal structure for rigidity and support. The barrel-like body remains very similar to the original planimal stock and, reorientation notwith- standing, the digestive system remains mostly unchanged. The ability to extend and retract the whiplash’s feeding tendril was heavily enhanced, so now the tendril acts more like a two-meter-long chameleon-like tongue than a hanging food-trap.",
    enhancements = Seq("Access Jack", "Basic Biomods", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Puppet Sock"),
    traits = Seq("Alien Biochemistry", "Social Stigma (Alien)", "Social Stigma (Pod)"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 40,
    attacks = Seq(MorphAttacks.whiplashTendril),
    aptitudeBonus = AptitudeValues(coo = 5, som = 10),
    playerDecisions = Some("+5 to two other aptitudes"),
    cpCost = 50,
    price = ExpensivePlus(50000),
    source = mrg);

  val workerPod = MorphModel(
    name = "Worker Pod",
    morphType = Pod,
    descr = "Part exalt human, part machine, these basic pods are virtually indistinguishable from humans. Worker pods are often used in menial labor jobs where interaction with humans is necessary.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Puppet Sock"),
    traits = Seq("Social Stigma (Pod)"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 35,
    aptitudeBonus = AptitudeValues(som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    cpCost = 20,
    price = High,
    source = mrg);

  val xuFu = MorphModel(
    name = "Xu Fu",
    morphType = Synthmorph,
    descr = "Named after a historical Chinese explorer, many gatecrashers consider xu fus the ideal exoplanet exploration synthmorph. Its main body sits atop 6 legs (up to 2 meters long, though retractable) that end in multidirectional smart wheels for quick travel, capable of rolling in any direction and over rough terrain. For exceptionally difficult terrain, the wheels can be retracted and the xu fu can maneuver as a walker. In addition to two standard arms, it features a third 2-meter long sensor-equipped limb for reaching far distances, overseeing obstacles, etc. Xu fus have an impressive sensor package and are ideal for surface-based scouting as well as investigating tunnels, collecting samples, and so on.",
    enhancements = Seq("360° Vision", "Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Direction Sense", "Echolocation", "Electrical Sense", "Enhanced Hearing", "Enhanced Vision", "Extra Limbs (3 Arms/6 Legs)", "Grip Pads", "Lidar", "Mnemonic Augmentation", "Pneumatic Limbs", "Radar", "Puppet Sock", "Radiation Sense", "Telescoping Limbs (Legs, 1 Arm)", "T-Ray Emitter"),
    movement = Seq("Walker 4/20", "Wheeled 4/32"),
    aptitudeMax = 30,
    durability = 40,
    aptitudeBonus = AptitudeValues(coo = 5, som = 5),
    armour = (8, 8),
    cpCost = 60,
    price = ExpensivePlus(50000),
    source = mrg);

  val list: List[MorphModel] = Macros.memberList[MorphModel];
}
