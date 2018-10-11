package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object MorphsS {
  import MorphImplicits._
  import MorphType._
  import Cost._
  import Sources._
  import Effect._

  val salamander = MorphModel(
    name = "Salamander",
    morphType = Biomorph,
    descr = "Salamanders are a type of biomorph popular with Solarians. They share some of the physiological traits of suryas, but are unable to survive unprotected in the corona (requiring a solar survival suit, like other biomorphs), and are instead bio-engineered to survive in the protected vacuum of coronal habitats. Their skin is thick, hairless, vaguely reptilian, and mostly black in color, with gold and orange body patterning. Like suryas, salamanders communicate either via wireless transmissions or by “sunspotting”—using their chromatophores to shift light and dark patterns on their skin to form patterns easily comprehensible to other coronal morphs. Salamanders have a wiry, streamlined, swept-back sort of look, a combination of fey and monkey-like. Their heads are also somewhat reptilian, with reflective eyes, no nose, and no mouth. Their feet are prehensile, usable just like hands. They lack reproductive organs and capa- bilities and feature cyberware gas jets on their chest and back for maneuvering in zero g. Many Solarians who normally inhabit suryas will sleeve into salamanders if they need to use humanoid tools or interact with non-Solarians.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Chameleon Skin", "Enhanced Vision", "Gas-Jet System", "Medichines", "Oxygen Reserve", "Prehensile Feet", "Vacuum Sealing"),
    traits = Seq("Coronal Adaptation (solar metabolism only)", "Limber (Level 1)", "Non-Mammalian Biochemistry"),
    movement = Seq("Walker 4/20", "Thrust Vector 8/40"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, coo = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 60,
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val samsa = MorphModel(
    name = "Samsa",
    morphType = Pod,
    descr = "The samsa was the first attempt to create a combat pod model with a terrifying appearance. The samsa is an intimidating, two-meter-tall, four-armed, four-legged, humanoid insect. Samsas are an unsettling sight to many transhumans. They are most commonly used by mercenaries and enforcers in the rim. Their armored carapace provides protection and the extra limbs allow a character to dual wield rifles or other two-handed weapons.",
    enhancements = Seq("360-Degree Vision", "Basic Biomods", "Basic Mesh Inserts", "Carapace Armor", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Cyberclaws", "Enhanced Vision", "Extra Limbs (4 Arms, 4 Legs)", "Grip Pads", "Hardened Skeleton", "Mnemonic Augmentation", "Neurachem (Level 1)", "Puppet Sock", "Temperature Tolerance"), //TODO speed+1
    traits = Seq("Social Stigma (Pod)", "Unattractive (Level 2)"),
    otherEffects = List(SkillMod(skill = "Intimidation", mod = 20)),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10, coo = 5, ref = 5), //TODO with Hardened Skeleton
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 50, //TODO with Hardened Skeleton
    armour = (11, 11),
    cpCost = 60,
    price = ExpensivePlus(60000),
    source = mrg);

  val savant = MorphModel(
    name = "Savant",
    morphType = Synthmorph,
    descr = "This morph was developed on Ilmarinen as proof that synthmorphs can also be useful to scientists and engineers. This strangely elegant morph lacks the disturbing mimicry of humanity found in synth and steel morphs. Instead, the ovoid head with its elegantly minimalist face looks more like an artistic sculpture than a metal version of a real human head.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Eidetic Memory", "Hyper-Linguist", "Math Boost", "Mnemonic Augmentation"),
    traits = Seq("Social Stigma (Clanking Masses)"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30, //TODO 40 COG and INT
    aptitudeBonus = AptitudeValues(cog = 10, int = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    armour = (8, 8),
    cpCost = 65,
    price = ExpensivePlus(40000),
    source = mrg);

  val scurrier = MorphModel(
    name = "Scurrier",
    morphType = Pod,
    movement = Seq("Walker 4/20", "Gliding"),
    descr = "Scurriers are pods developed from the non-sapient extraterrestrials known as sciurids (p. 172, Gatecrashing). In appearance, scurrier pods are similar to raccoon-sized flying squirrels with a lash-like manipulator rather than a fluffy tail, though still regarded as highly cute. They make excellent climbers and are capable of gliding due to the membrane between their limbs. Scurriers are gaining popularity for their usefulness in exploring tunnels and small areas as well as high areas reached by climbing. They have also been used for maintenance and tech works tasks due to their nimbleness and manual dexterity.",
    enhancements = Seq("Access Jacks", "Basic Biomod", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Gliding Membrane", "Mnemonic Augmentation", "Prehensile Tail", "Puppet Sock", "6 limbs"),
    traits = Seq("Limber (Level 1)", "Alien Biochemistry", "Social Stigma (Alien)", "Social Stigma (Pod)", "Small size"),
    otherEffects = List(SkillMod(skill = "Freerunning", mod = 10), SkillMod(skill = "Climbing", mod = 10)),
    aptitudeMax = 25,
    aptitudeBonus = AptitudeValues(sav = 5, coo = 10, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 30,
    cpCost = 60,
    price = Expensive,
    source = mrg);

  val securityPod = MorphModel(
    name = "Security Pod",
    morphType = Pod,
    movement = Seq("Walker 4/20"),
    descr = "Originally developed for joint-nation peace-keeping missions and border/enclave security roles, security pods were essentially mass-produced AI-operated soldiers. For obvious reasons, they fell out of favor during the Fall, but they are slowly regaining acceptance. They are a favored morph by mercenaries for infiltration and guerrilla warfare purposes.",
    enhancements = Seq("Adrenal Boost", "Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Claws", "Cortical Stack", "Cyberbrain", "Eelware", "Enhanced Vision", "Grip Pads", "Mnemonic Augmentation", "Puppet Sock", "T-Ray Emitter"),
    traits = Seq("Social Stigma (Pod)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val selkie = MorphModel(
    name = "Selkie",
    morphType = Biomorph,
    movement = Seq("Walker 1/4", "Swim 4/20"),
    descr = "Selkies look like a human-seal hybrid, and in fact their genetics are aquanaut with heavy splices of seal traits. Their arms are standard human-shaped, but their legs are fused into a pair of hind flippers for powerful swimming. On land, they can stand but have difficulty moving, as they must flop, roll, or hop like a seal. They are adapted for the lack of air, deep cold, and crushing pressure of subcrustal seas.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Echolocation", "Enhanced Hearing", "Enhanced Vision", "Enhanced Respiration", "Gills", "Hydrostatic Pressure Adaptation", "Swim Bladder", "Temperature Tolerance (Improved Cold)", "Toxin Filters"),
    traits = Seq("Non-Human Biochemistry"),
    otherEffects = List(SkillMod(skill = "Swimming", mod = 10)),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10, coo = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 40,
    cpCost = 55,
    price = Expensive,
    source = mrg);

  val shaper = MorphModel(
    name = "Shaper",
    morphType = Pod,
    movement = Seq("Walker 4/20"),
    descr = "Shapers are the ultimate disguise morph. Constructed as pods, the default shaper look is intentionally generic, based on the computer-generated composite average look of the solar system’s residents. They lack the distinctive seam lines applied to most pod morph designs. The skinflex system allows the morph to quickly change its outward appearance. Additional modifications help the morph evade or fool sensor and biometric systems. Shapers are a favorite tool for spies and are excellent for infiltration or fooling surveillance. They are often remotely operated via puppet sock. Shapers are illegal in many habitats.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Chameleon Skin", "Clean Metabolism", "Cortical Stack", "Cyberbrain", "Emotional Dampers", "Gait Masking", "Mnemonic Augmentation", "Nanotat ID Flux", "Puppet Sock", "Sex Switch", "Skinflex"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(int = 5, sav = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 30,
    cpCost = 45,
    price = ExpensivePlus(40000),
    source = mrg);

  val slitheroid = MorphModel(
    name = "Slitheroid",
    morphType = Synthmorph,
    movement = Seq("Snake 4/16", "Roller 8/32"),
    descr = "Slitheroid bots are synthetic shells taking the form of a 2-meter-long segmented metallic snake, with two retractable arms for tool use. Snake bots can coil, twist, and roll their bodies into a ball or hoop, moving either by slithering, burrowing, rolling, or pulling themselves along by their arms. The sensor suite and control computer are housed in the head.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Mnemonic Augmentation"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(coo = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 45,
    armour = (8, 8),
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val spaceMarine = MorphModel(
    name = "Space Marine",
    morphType = Pod,
    movement = Seq("Walker 4/20"),
    descr = """Originally developed for joint-nation peace-keeping missions and border/enclave security roles, security pods were essentially mass-produced AI-operated soldiers. For obvious reasons, they fell out of favor during the Fall, but they are slowly regaining acceptance. They are a favored morph by mercenaries for infiltration and guerrilla warfare purposes.
===
The space marine variant of the security pod was optimized for orbital skirmishes, boarding actions, suppressing asteroid miner revolts, and other space-theater operations.""",
    enhancements = Seq("Adrenal Boost", "Basic Biomods", "Basic Mesh Inserts", "Bioweave Armor (Light)", "Claws", "Cortical Stack", "Cyberbrain", "Eelware", "Enhanced Vision", "Grip Pads", "Mnemonic Augmentation", "Oxygen Reserve", "Prehensile Feet", "Puppet Sock", "T-Ray Emitter", "Vacuum Sealing"),
    traits = Seq("Social Stigma (Pod)"),
    aptitudeMax = 30,
    aptitudeBonus = AptitudeValues(som = 10),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 35,
    cpCost = 30,
    price = Expensive,
    source = mrg);

  val spare = MorphModel(
    name = "Spare",
    morphType = Synthmorph,
    movement = Seq("Walker 2/8"),
    descr = "Spare morphs are small, cheap, lightweight, synthetic shells designed to be used as a replacement should someone’s original morph be killed or destroyed. A cortical stack (retrieved from the character’s previous morph; see p. 268, EP) can be easily plugged into the spare morph, effectively resleeving them (they must make Integration, Alienation, and Continuity Tests as normal; see pp. 270-272, EP). Once plugged in, it takes only 3 Action Turns for the cortical stack’s data to be read and checked for integrity and the ego to run inside the spare’s cyberbrain. Spares are designed for portability. Packed as a flat disc 15 centimeters in diameter and with a mass of 2 kilograms, when activated they pop into a spherical shape with 6 slender and retractable 20-centimeter limbs (3 arms and 3 legs). They are a common piece of equipment for gatecrashing teams.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cyberbrain", "Extra Limbs (3 Arms/3 Legs)", "Grip Pads", "Mnemonic Augmentation", "Puppet Sock"),
    traits = Seq("Social Stigma (Clanking Masses)", "Small size"),
    aptitudeMax = 20,
    aptitudeBonus = AptitudeValues(coo = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude"),
    durability = 15,
    armour = (2, 2),
    cpCost = 5,
    price = Moderate,
    source = mrg);

  val specialistPod = MorphModel(
    name = "Specialist Pod",
    morphType = Pod,
    movement = Seq("Walker 4/20"),
    descr = "Designed specifically to compete with popular mid-range morphs like the menton and olympian, the specialist pod is cheaper and faster to create than a biomorph. It also offers the user a high degree of customization.",
    enhancements = Seq("Access Jacks", "Basic Biomods", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Puppet Sock"),
    traits = Seq("Social Stigma (Pod)"),
    aptitudeMax = 30,
    playerDecisions = Some("+10 to one other aptitude, +5 to one other aptitude"),
    durability = 35,
    cpCost = 25,
    price = High,
    source = mrg);

  val sphere = MorphModel(
    name = "Sphere",
    morphType = Synthmorph,
    movement = Seq("Roller 8/32", "Thrust Vector 4/20"),
    descr = "Popular with AGIs and synthmorph activ- ists, this morph is a sphere approximately one meter in diameter. It can extend up to four flexible limbs as required, and typically hovers at approximately human eye level. The first tests of this morph revealed that the chameleon surface was necessary because it allows the user to display the image of a face, which made most transhumans both more comfortable talking with this morph and less likely to assume that it is a robot.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Extra Limbs (4 Arms)", "Gas-Jet System", "Mnemonic Augmentation", "Puppet Sock", "Telescoping Limbs"),
    aptitudeMax = 30,
    durability = 35,
    aptitudeBonus = AptitudeValues(cog = 10),
    playerDecisions = Some("+5 to three other aptitude"),
    armour = (6, 6),
    cpCost = 65,
    price = ExpensivePlus(70000),
    source = mrg);

  val splicer = MorphModel(
    name = "Splicer",
    morphType = Biomorph,
    descr = "Splicers are genefixed humans. Their genome has been cleansed of hereditary diseases and optimized for looks and health, but has not otherwise been substantially upgraded. Splicers make up the majority of transhumanity.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Cortical Stack"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 25,
    durability = 30,
    playerDecisions = Some("+5 to one other aptitude"),
    cpCost = 10,
    price = High,
    source = mrg);

  val steelMorph = MorphModel(
    name = "Steel Morph",
    morphType = Synthmorph,
    descr = "This morph was developed by technicians and designers who are members of the Lunar synthmorph rights movement, the Steel Liberators. Middle-class Lunars who came out of poverty and continue to actively support the Steel Liberators sometimes choose this morph, despite the fact that this choice often results in them experiencing significant prejudice from biochauvinists.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Eidetic Memory", "Mnemonic Augmentation"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 40,
    aptitudeBonus = AptitudeValues(som = 10, cog = 5),
    playerDecisions = Some("+5 to two other aptitude"),
    traits = Seq("Social Stigma (Clanking Masses)", "Uncanny Valley"),
    armour = (8, 8),
    cpCost = 50,
    price = ExpensivePlus(30000),
    source = mrg);

  val steelLiquidSilverMorph = MorphModel(
    name = "Steel Liquid Silver Morph",
    morphType = Synthmorph,
    descr = "Designed as a top-end version of the steel morph, this shell’s entire outer covering is composed of active nanomachines. A number of synthmorph performers use this shell’s shape- and color-altering capacities as part of their acts. However, the fact that this morph can disguise itself as any other humanoid synthmorph, including the ubiquitous case morph, means that a number of covert oper- atives and criminals also make use of this morph. This version of the steel morph cannot use a synthetic mask.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Eidetic Memory", "Mnemonic Augmentation", "Shape Adjusting", "Skinflex", "Wrist-Mounted Tools"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 40,
    aptitudeBonus = AptitudeValues(som = 10, cog = 5),
    playerDecisions = Some("+5 to three other aptitude"),
    traits = Seq("Social Stigma (Clanking Masses)", "Uncanny Valley"),
    armour = (8, 8),
    cpCost = 70,
    price = ExpensivePlus(40000),
    source = mrg);

  val steelMaskedMorph = MorphModel(
    name = "Steel Masked Morph",
    morphType = Synthmorph,
    descr = "This version of the steel morph is equipped with the synthetic mask enhancement, making the shell look like a human biomorph. This version is uncommon, as most Steel Liberators view biological masking as a form of <selling out>. It is used both by Lunars who are stuck sleeving into a synthmorph, but whom don’t want to suffer discrimination, and by Steel Liberator activists looking to infiltrate biochauvinists and other opponent groups.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Eidetic Memory", "Mnemonic Augmentation"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 40,
    aptitudeBonus = AptitudeValues(som = 10, cog = 5),
    playerDecisions = Some("+5 to two other aptitude"),
    traits = Seq("Synthetic Mask"),
    armour = (8, 8),
    cpCost = 55,
    price = ExpensivePlus(40000),
    source = mrg);

  val sundiver = MorphModel(
    name = "Sundiver",
    morphType = Synthmorph,
    descr = "The sundiver is a synthetic morph designed for solar research and emergency rescue operations. Sundivers are sleek mechanisms, about six meters long. They look a little like ramjets, except for a pair of articulated arms that extend forward from the morph’s pointed nose, allowing it to reach for and grasp objects. Because sundivers operate in the coronal environment, they are built to survive superheated plasma and shielded against radiation. Sundivers are equipped with a powerful electromagnetic propulsion system that allows them to skate along solar magnetic lines of force much like the surya do.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Enhanced Vision", "Heavy Combat Armor", "Internal Rocket", "Mnemonic Augmentation", "Radar", "Reflex Booster", "Coronal Adaptation"),
    movement = Seq("Thrust Vector 12/60"),
    aptitudeMax = 30,
    durability = 120,
    aptitudeBonus = AptitudeValues(ref = 20, coo = 5), //speed booster ref+10
    traits = Seq("Large size"),
    armour = (16, 16),
    otherEffects = List(SpeedMod(1)),
    cpCost = 70,
    price = ExpensivePlus(40000),
    source = mrg);

  val surya = MorphModel(
    name = "Surya",
    morphType = Biomorph,
    descr = "Named for a Hindu sun deity, suryas swim freely in the sun’s corona. Looking roughly like whales or orcas, suryas may reach lengths of ten meters or more. They generate powerful magnetic fields that shield them from solar radiation and heat, while allowing them to surf the solar wind and extract ionized particles. Strong bones and connective tissues protect against the crushing solar gravity. Beneath their thick hides are channels of liquid water interleaved with layers of fat which serve to shield the organism from harmful radiation. Engineered medichines repair tissue damaged by radiation and convert hydrogen ions into water. A surya’s skin is an extraordinary organ, embedded with chromatophores that allow them to transmit alternating patterns of light and dark for communication. In addition, a lateral line runs down their sides, allowing them to detect the long-period sound waves that reflect off the sun’s lower atmosphere and resonate through the corona’s gas and plasma. Suryas traveling through the transition zone between the corona and the chromosphere use these vibrations to predict and avoid heavy solar weather.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Chameleon Skin", "Cortical Stack", "Enhanced Hearing", "Enhanced Vision", "Lateral Line", "Medichines", "Vacuum Sealing"),
    movement = Seq("Thrust Vector 8/40"),
    aptitudeMax = 30,
    durability = 100,
    aptitudeBonus = AptitudeValues(coo = 10, ref = 5, som = 5),
    traits = Seq("Coronal Adaptation", "Non-Human Biochemistry", "Very Large Size"),
    otherEffects = List(SkillMod(skill = "Free Fall", mod = 10)),
    cpCost = 50,
    price = ExpensivePlus(50000),
    source = mrg);

  val swarmanoid = MorphModel(
    name = "Swarmanoid",
    morphType = Synthmorph,
    descr = "The swarmanoid is not a single shell per se, but rather a swarm of hundreds of insect-sized robotic microdrones. Each individual <bug> is capable of crawling, rolling, hopping several meters, or using nanocopter fan blades for airlift. The controlling computer, cortical stack, and sensor systems are distributed throughout the swarm. Though the swarm can <meld> together into a roughly child-sized shape, the swarm is incapable of tackling physical tasks like grabbing, lifting, or holding as a unit. Individual bugs are quite capable of interfacing with electronics. For additional rules on swarmanoids, see p. 311, EP, and p. 211, Transhuman.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Swarm Composition"),
    movement = Seq("Walker 2/8", "Hopper 4/20", "Rotor 4/32"),
    aptitudeMax = 30,
    durability = 30,
    cpCost = 25,
    price = Expensive,
    source = mrg);

  val skulkerSwarmanoid = MorphModel(
    name = "Skulker Swarmanoid",
    morphType = Synthmorph,
    descr = "Skulkers are a stealth swarmanoid designed to infiltrate sensitive areas and avoid detection by sensors. The swarmanoid is not a single shell per se, but rather a swarm of hundreds of insect-sized robotic microdrones. Each individual <bug> is capable of crawling, rolling, hopping several meters, or using nanocopter fan blades for airlift. The controlling computer, cortical stack, and sensor systems are distributed throughout the swarm. Though the swarm can <meld> together into a roughly child-sized shape, the swarm is incapable of tackling physical tasks like grabbing, lifting, or holding as a unit. Individual bugs are quite capable of interfacing with electronics. For additional rules on swarmanoids, see p. 311, EP, and p. 211, Transhuman.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Swarm Composition", "Chameleon Skin", "Radar Invisibility"),
    movement = Seq("Walker 2/8", "Hopper 4/20", "Rotor 4/32"),
    aptitudeMax = 30,
    durability = 30,
    cpCost = 35,
    price = ExpensivePlus(30000),
    source = mrg);

  val smartSwarmanoid = MorphModel(
    name = "Smart Swarmanoid",
    morphType = Synthmorph,
    descr = "The smart swarm is a robust attempt to get more utility out of the swarmanoid morph design. It makes use of larger modular minidrones (rather than microdrones) that can lock together into various shapes, enabling limited physical actions and tool use. The swarmanoid is not a single shell per se, but rather a swarm of hundreds of insect-sized robotic microdrones. Each individual <bug> is capable of crawling, rolling, hopping several meters, or using nanocopter fan blades for airlift. The controlling computer, cortical stack, and sensor systems are distributed throughout the swarm. Though the swarm can <meld> together into a roughly child-sized shape, the swarm is incapable of tackling physical tasks like grabbing, lifting, or holding as a unit. Individual bugs are quite capable of interfacing with electronics. For additional rules on swarmanoids, see p. 311, EP, and p. 211, Transhuman.",
    enhancements = Seq("360-Degree Vision", "Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation", "Swarm Composition", "Modular Design", "Smart Swarm"),
    movement = Seq("Walker 2/8", "Hopper 4/20", "Rotor 4/32", "Shaped Swarm 2/16"),
    aptitudeMax = 30,
    durability = 30,
    cpCost = 30,
    price = ExpensivePlus(30000),
    source = mrg);

  val sylph = MorphModel(
    name = "Sylph",
    morphType = Biomorph,
    descr = "Sylph morphs are tailor-made for media icons, elite socialites, XP stars, models, and narcissists. Sylph gene sequences are specifically designed for distinctive good looks. Ethereal and elfin features are common, with slim and lithe bodies. Their metabolism has also been sanitized to eliminate unpleasant bodily odors and their pheromones adjusted for universal appeal.",
    enhancements = Seq("Basic Biomods", "Basic Mesh Inserts", "Clean Metabolism", "Cortical Stack", "Enhanced Pheromones"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 35,
    aptitudeBonus = AptitudeValues(sav = 10, coo = 5, som = 5),
    playerDecisions = Some("+5 to one other aptitude of the player’s choice"),
    traits = Seq("Striking Looks (Level 1)"),
    cpCost = 40,
    price = Expensive,
    source = mrg);

  val synth = MorphModel(
    name = "Synth",
    morphType = Synthmorph,
    descr = "Synths are anthropomorphic robotic shells (androids and gynoids). They are typically used for menial labor jobs where pods are not as good of an option. Cheaper than many other morphs, they are commonly used for people who need a body quickly and cheaply or simply on a transient basis. Though they look humanoid, synths are easily recognizable as non-biological unless they have the synthetic mask option (p. 311, EP).",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Mnemonic Augmentation"),
    movement = Seq("Walker 4/20"),
    aptitudeMax = 30,
    durability = 40,
    aptitudeBonus = AptitudeValues(som = 5),
    playerDecisions = Some("+5 to one other aptitude of the player’s choice"),
    traits = Seq("Social Stigma (Clanking Masses)", "Uncanny Valley"),
    armour = (6, 6),
    cpCost = 30,
    price = High,
    source = mrg);

  val synthtaur = MorphModel(
    name = "Synthtaur",
    morphType = Synthmorph,
    descr = "The synthtaur resembles an elegant mechanical centaur, but is a versatile and extremely durable synthmorph. The shape adjusting enhancement allows it to switch between being a two-armed quadruped standing 1.7 meters tall or a four-armed biped standing 2.4 meters high, as well as allowing it to fit into small spaces. Its telescoping legs even allow it to reduce its height to become a 2-meter-tall bipedal humanoid. This morph is popular with gatecrashers, people exploring ruined habitats, and anyone going into dangerous and remote situations.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Extra Limbs (6 Arms/Legs)", "Grip Pads", "Mnemonic Augmentation", "Pneumatic Limbs (2 Hind Legs)", "Prehensile Feet", "Shape Adjusting", "Telescoping Limbs (4 Lower Arms/Legs)"),
    movement = Seq("Walker 6/40 quadruped", "Walker 4/20 biped"),
    aptitudeMax = 30.copy(som = Some(40)),
    durability = 60,
    aptitudeBonus = AptitudeValues(som = 10),
    playerDecisions = Some("+5 to two other aptitude of the player’s choice"),
    traits = Seq("Large Size"),
    armour = (8, 8),
    cpCost = 70,
    price = ExpensivePlus(80000),
    source = mrg);

  val list: List[MorphModel] = Macros.memberList[MorphModel];
}
