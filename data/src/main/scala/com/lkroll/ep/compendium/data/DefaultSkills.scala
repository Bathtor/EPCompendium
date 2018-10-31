package com.lkroll.ep.compendium.data

import com.lkroll.common.macros.Macros
import com.lkroll.ep.compendium.{ Aptitude, Language, SkillCategory, SkillClass, SkillDef }
import com.lkroll.ep.compendium.Language

object DefaultSkills {
  import Aptitude._;
  import SkillClass._;
  import SkillCategory._;

  private val appr = List("As appropriate to the field");

  val academics = SkillDef(
    name = "Academics",
    field = Some("???"),
    cls = Knowledge,
    category = NA,
    apt = COG,
    sampleFields = Some(List("Archeology", "Astrobiology", "Astronomy", "Astrophysics", "Astrosociology", "Biochemistry", "Biology", "Botany", "Computer Science", "Cryptography", "Economics", "Engineering", "Genetics", "Geology", "Linguistics", "Mathematics", "Memetics", "Nanotechnology", "Old Earth History", "Physics", "Political Science", "Psychology", "Sociology", "Xeno-archeology", "Xenolinguistics", "Zoology")),
    sampleSpecs = appr,
    descr = """What it is: Academics covers any sort of specialized non-applied knowledge you can only get through intensive education. Most theoretical and applied sciences, social sciences, transhumanities, etc. are covered by this skill. Most of the other skills listed in this chapter could also be taken as an Academics field, reflecting a working theoretical knowledge of the skill—for example, Academics: Armorer or Academics: Interrogation. 
When you use it: Academics is used when a character wishes to call upon a specific body of knowledge. For example, Academics: Chemistry could be used to identify a particular substance, understand an unusual chemical reaction, or determine what elements are needed to nanofabricate something that requires exotic materials. At the gamemaster’s discretion, some Academics-related tests might not be defaultable, given that only someone who has been educated in that subject is likely to be able to tackle it.""");

  val animalHandling = SkillDef(
    name = "Animal Handling",
    field = None,
    cls = Active,
    category = Social,
    apt = SAV,
    sampleSpecs = List("smart dogs", "smart monkeys", "horses", "smart rats"),
    descr = """What it is: Skilled animal handlers are able to train and control a wide variety of natural and transgenic animals, including partial uplifts. Though many animal species went extinct during the Fall, a few ark and zoo habitats keep some species alive, and many others can be resurrected from genetic samples. Exotic animals are considered a sign of prestige among the hypercorp elites, and guard animals are occasionally used to protect high-security installations. Likewise, many habitats and settlements employ small armies of partially uplifted, genetically modified, and behavior-controlled creatures for sanitation or other purposes. Many new and strange breeds of animal are created daily to serve a variety of roles.
When you use it: Animal Handling is used whenever you are trying to manipulate an animal, whether your intent is to calm it down, keep it from attacking, intimidate it, acquire its trust, or goad it into attacking. Your Margin of Success determines how effective you are at convincing the creature. At the gamemaster’s discretion, modifiers may be applied to the test. Likewise, winning an animal over may sometimes take time and so could be handled as a Task Action with a timeframe of five minutes or more.""");

  val art = SkillDef(
    name = "Art",
    field = Some("???"),
    cls = Knowledge,
    category = NA,
    apt = INT,
    sampleFields = Some(List("Architecture", "Criticism", "Dance", "Drama", "Drawing", "Painting", "Performance", "Sculpture", "Simulspace Design", "Singing", "Speech", "Writing")),
    sampleSpecs = appr,
    descr = """What it is: Art confers the ability to create and evaluate artistic endeavors. This is a particularly useful skill in Eclipse Phase, especially in the post-scarcity economies where creativity and vision can be a key component to a character’s reputation.
When you use it: The Art skill can be used to either create a new work of art or to duplicate an existing piece of art in the hopes of passing it off as your own. The skill can also determine the approximate value of a piece of art either on the open market, for monetary exchange systems, or in terms of reputation for the artist.""");

  val beamWeapons = SkillDef(
    name = "Beam Weapons",
    field = None,
    cls = Active,
    category = Combat,
    apt = COO,
    sampleSpecs = List("Lasers", "Microwave Weapons", "Particle Beam Weapons", "Plasma Rifles"),
    descr = """What it is: The Beam Weapons skill covers the usage and maintenance of standard coherent beam energy weapons such as lasers, particle beam weapons, plasma rifles, and microwave weapons (p. 338).
When you use it: A player uses their Beam Weapons skill whenever attacking with a beam weapon in combat (p. 191). Beam Weapons may also be used for tests involving maintenance of the weapon, but not for repairing or modifying the weapon (that would be Hardware: Armorer skill).""");

  val blades = SkillDef(
    name = "Blades",
    field = None,
    cls = Active,
    category = Combat,
    apt = SOM,
    sampleSpecs = List("Axes", "Implant Blades", "Knives", "Swords"),
    descr = """What it is: The Blades skill covers the usage and maintenance of standard bladed weapons (p. 334).
When you use it: A player uses their Blades skill whenever attacking with a blade weapon in melee combat (p. 191). Blades may also be used for tests involving maintenance of the weapon, but not for repairing or modifying the weapon (that would be Hardware: Armorer skill). This skill is used for blade weapons implanted in the body at the end of an appendage (hands, forearms, feet, octomorph arms, etc.), but the Exotic Melee Weapon skill is used for blades implanted in other parts of the body.""");

  val climbing = SkillDef(
    name = "Climbing",
    field = None,
    cls = Active,
    category = Physical,
    apt = SOM,
    sampleSpecs = List("Assisted", "Freehand", "Rappelling"),
    descr = """What it is: Climbing is the skill of ascending and descending sheer surfaces with or without the aid of specialized equipment.
When you use it: This skill is used whenever a character wishes to scale a climbable surface. For heights greater than one story, climbing is handled as a Task Action with a timeframe equivalent to one meter per Combat Turn. For rappelling, the timeframe for descent is 50 meters per Action Turn. Climbing gear (Grip Pads, p. 305; Traction Pads, p. 317; Spindle Climber, p. 333) provides appropriate modifiers.""");

  val clubs = SkillDef(
    name = "Clubs",
    field = None,
    cls = Active,
    category = Combat,
    apt = SOM,
    sampleSpecs = List("Batons", "Hammers", "Staffs"),
    descr = """What it is: The Clubs skill covers the usage and maintenance of standard blunt melee weapons such as batons or sticks (see Clubs, p. 334).
When you use it: Players use their Clubs skill whenever they want to attack with a blunt weapon in melee combat (p. 191). The Clubs skill may also be used for tests involving maintenance of the weapon, but not for repairing or modifying the weapon (that would be Hardware: Armorer skill).""");

  val control = SkillDef(
    name = "Control",
    field = None,
    cls = Active,
    category = Psi,
    apt = WIL,
    noDefaulting = true,
    sampleSpecs = List("By sleight"),
    descr = """What it is: Control is the use of psi to manipulate individuals or actively penetrate their mental processes. This skill is only available to characters with the Psi trait, (p. 147).
When you use it: Use Control when taking a psionic tour through a foreign ego — messing around included. See Psi, p. 220""");

  val deception = SkillDef(
    name = "Deception",
    field = None,
    cls = Active,
    category = Social,
    apt = SAV,
    sampleSpecs = List("Acting", "Bluffing", "Fast Talk"),
    descr = """What it is: Deception is your ability to act, bluff, con, fast talk, lie, misrepresent, and pretend. Accomplished users of deception are able to convince anyone of nearly anything. This skill does not include using a physical disguise or passing yourself off as another person (the Disguise and Impersonate skills cover those areas).
When you use it: Use this skill whenever you want to deceive someone with words or gestures. A successful skill test means that you have passed off your deception convincingly. At the gamemaster’s discretion, someone who is actively alert for signs of deception may make an Opposed Test using the Kinesics skill.""");

  val demolitions = SkillDef(
    name = "Demolitions",
    field = None,
    cls = Active,
    category = Technical,
    apt = COG,
    noDefaulting = true,
    sampleSpecs = List("Commercial Explosives", "Disarming", "Improvised Explosives"),
    descr = """What it is: Demolitions covers the use of controlled explosives.
When you use it: Use it when making, placing, and disarming explosives and explosive devices. see Demolitions, p. 197""");

  val disguise = SkillDef(
    name = "Disguise",
    field = None,
    cls = Active,
    category = Physical,
    apt = INT,
    sampleSpecs = List("Cosmetic", "Theatrical"),
    descr = """What it is: Disguise is the art of physically altering your appearance so that you look like someone else. This includes both the use of props (wigs, contacts,skin pigments) and the altering of subtle physical characteristics (gait, posture, poise).
When you use it: Use Disguise to fool someone into thinking you’re someone you’re not. This can be used to hide your identity or to make yourself look like someone in particular. When used against someone who knows your true look or the appearance of the person you are imitating, this is handled as an Opposed Test against Perception or Investigation.""");

  val exoticMeleeWeapon = SkillDef(
    name = "Exotic Melee Weapon",
    field = Some("???"),
    cls = Active,
    category = Combat,
    apt = SOM,
    sampleFields = Some(List("Morning Star", "Spear", "Whip")),
    descr = """What it is: The Exotic Melee Weapon skill covers the use and maintenance of all melee weapons not covered by the Clubs or Blades skills (see p. 334).
When you use it: Use the Exotic Melee Weapon skill when attacking someone with an exotic melee weapon in melee combat (see p. 191).""");

  val exoticRangedWeapon = SkillDef(
    name = "Exotic Ranged Weapon",
    field = Some("???"),
    cls = Active,
    category = Combat,
    apt = COO,
    sampleFields = Some(List("Blowgun", "Crossbow", "Slingshot")),
    descr = """What it is: Exotic Ranged Weapon skill includes the use and maintenance of all ranged weapons not covered by the Beam, Kinetic, Seeker, Spray, or Throwing Weapons skills.
When you use it: Use this skill whenever attacking with an exotic ranged weapon in ranged combat (see p. 191)""");

  val flight = SkillDef(
    name = "Flight",
    field = None,
    cls = Active,
    category = Physical,
    apt = SOM,
    sampleSpecs = List("Diving", "Landing", "Takeoff"),
    descr = """What it is: Flight is the skill of using your body to fly. This skill is used when sleeved in or jamming a winged or otherwise flight-capable morph (manual and remote-control flight are handled using Pilot skill).
When you use it: Use this skill whenever you need to make an aerial maneuver, land in difficult conditions, maintain your course in steep winds, or otherwise keep from crashing or falling.""");

  val fray = SkillDef(
    name = "Fray",
    field = None,
    cls = Active,
    category = Combat,
    apt = REF,
    sampleSpecs = List("Blades", "Clubs", "Full Defense", "Unarmed"),
    descr = """What it is: Fray is the ability to get out of the way of incoming attacks, debris, or inconvenient passers-by. Characters that have a high Fray score are able to react quicker than others when dodging or maneuvering.
When you use it: Whenever a character is physically attacked by an opponent in melee combat, roll Fray to avoid getting hit (see Step 2: Declare Defense, p. 191). Fray may also be used to dodge other events that may harm the character, such as avoiding a charging vehicle or jumping out of the way of a collapsing stack of crates.""");

  val freeFall = SkillDef(
    name = "Free Fall",
    field = None,
    cls = Active,
    category = Physical,
    apt = REF,
    sampleSpecs = List("Microgravity", "Parachuting", "Vacsuits"),
    descr = """What it is: Free Fall is about moving in free-fall and microgravity environments.
When you use it: Use whenever you need to maneuver in a zero-g situation, such as propelling yourself across a large open space or making sure you don’t accidentally send yourself spinning off into space. Free Fall is also used when moving with spacesuit maneuvering jets and when parachuting.""");

  val freerunning = SkillDef(
    name = "Freerunning",
    field = None,
    cls = Active,
    category = Physical,
    apt = SOM,
    sampleSpecs = List("Balance", "Gymnastics", "Jumping", "Running"),
    descr = """What it is: Freerunning is part running, part gymnastics. It is about moving fast, maneuvering over/under/around/through obstacles, and placing your body where it needs to go. Freerunning/parkour is a popular pastime in habitats where open space is limited.
When you use it: Use Freerunning whenever you need to overcome an obstacle via movement, such as hurdling a railing, rolling across the hood of a car, jumping across a pit, or swinging around a pole. Freerunning is also used for sprinting (p. 191) and full defense against attacks (p. 198).""");

  val gunnery = SkillDef(
    name = "Gunnery",
    field = None,
    cls = Active,
    category = Combat,
    apt = INT,
    sampleSpecs = List("Artillery", "Missiles"),
    descr = """What it is: Gunnery skill covers the use and maintenance of large, vehicular, or non-portable weapons systems. Firing these weapons is more like playing a video game than firing a gun.
When you use it: Use Gunnery when attacking with a vehicle-mounted weapon or weapon emplacement in ranged combat (p. 191).""");

  val hardware = SkillDef(
    name = "Hardware",
    field = Some("???"),
    cls = Active,
    category = Technical,
    apt = COG,
    sampleFields = Some(List("Aerospace", "Armorer", "Electronics", "Groundcraft", "Implants", "Industrial", "Nautical", "Robotics")),
    sampleSpecs = appr,
    descr = """What it is: This skill encompasses the ability to build, repair, physically hack, and upgrade equipment of a specific type.
When you use it: Hardware is primarily used to repair devices, vehicles, habitat systems, or synthetic morphs. See Building, Repairing, and Modifying below.""");

  val impersonation = SkillDef(
    name = "Impersonation",
    field = None,
    cls = Active,
    category = Social,
    apt = SAV,
    sampleSpecs = List("Avatar", "Face-to-Face", "Verbal"),
    descr = """What it is: Impersonation is the skill of trying to pass yourself off as someone else in social situations, including virtual ones. This includes copying mannerisms and speech patterns and using accumulated information to convince others that you are that person. In a universe where appearance is highly variable, the question of identity is largely one of both trust and picking up on behavioral quirks and verbal cues to recognize a given individual.
When you use it: Sometimes it’s fun to pretend you’re someone else, and sometimes it’s profitable or lifesaving. Use this skill whenever you attempt to convince someone that you are actually someone else through some sort of social or online interaction. Forks use this skill when passing themselves off as their alpha ego. Impersonate is handled as an Opposed Test against the Kinesics skill.""");

  val infiltration = SkillDef(
    name = "Infiltration",
    field = None,
    cls = Active,
    category = Physical,
    apt = COO,
    sampleSpecs = List("Blending In", "Hiding", "Shadowing", "Sneaking"),
    descr = """What it is: The art of escaping detection.
When you use it: Use Infiltration whenever you need to physically hide or move with stealth to avoid someone sensing you, whether you are hiding behind a tree, sneaking past a guard, or blending into a crowd. Infiltration can also be used to follow people (shadowing) without them detecting you. Infiltration is an Opposed Test against the Perception of whomever you are hiding from. The gamemaster may wish to roll such tests in secret so the player does not know whether they have succeeded or failed.""");

  val infosec = SkillDef(
    name = "Infosec",
    field = None,
    cls = Active,
    category = Technical,
    apt = COG,
    noDefaulting = true,
    sampleSpecs = List("Brute-Force Hacking", "Decryption", "Probing", "Security", "Sniffing", "Spoofing"),
    descr = """What it is: Infosec is short for “information security.” It encompasses training in electronic intrusion and counterintrusion techniques as well as encryption and decryption.
When you use it: Infosec is used both for hacking into electronic devices and mesh networks and for protecting them. See The Mesh chapter, p. 234, for more details.""");

  val interest = SkillDef(
    name = "Interest",
    field = Some("???"),
    cls = Knowledge,
    category = NA,
    apt = COG,
    sampleFields = Some(List("Ancient Sports", "Celebrity Gossip", "Conspiracies", "Factor Trivia", "Gambling", "Hypercorp Politics", "Lunar Habitats", "Martian Beers", "Old Earth Nation-States", "Reclaimer Blogs", "Science Fiction", "Scum Drug Dealers", "Spaceship Models", "Triad Economics", "Underground XP")),
    sampleSpecs = appr,
    descr = """What it is: Interest includes just about any topic that captures your attention that isn’t covered by another skill. This includes hobbies, obsessions,causes, pastimes, and other recreational pursuits.
When you use it: Use the Interest skill whenever you need to recall or use knowledge related to the particular interest in question.""");

  val interfacing = SkillDef(
    name = "Interfacing",
    field = None,
    cls = Active,
    category = Technical,
    apt = COG,
    sampleSpecs = List("Forgery", "Scanning", "Stealthing"),
    descr = """What it is: Interfacing is about using computerized electronic devices and software.
When you use it: Use Interfacing to understand an electronic device you are not familiar with, use a program according to its normal operating parameters, manipulate electronic files of various types (including images, video, XP, and audio files), scan for wireless devices, and otherwise interact with and command your ecto, muse, and other computerized devices. Some Interfacing actions may be Task Actions with a timeframe determined by the gamemaster. For more detail, see The Mesh chapter, p. 234.""");

  val intimidation = SkillDef(
    name = "Intimidation",
    field = None,
    cls = Active,
    category = Social,
    apt = SAV,
    sampleSpecs = List("Interrogation", "Physical", "Verbal"),
    descr = """What it is: Intimidation is convincing someone to do what you want based on direct threats (implied or actual) or sheer force of personality.
When you use it: Use Intimidation to scare someone into submission, browbeat them into getting your way, command them to follow your orders, or berate them into giving up information. Influence is handled as an Opposed Test, pitted against the target’s WIL + WIL + SAV.""");

  val investigation = SkillDef(
    name = "Investigation",
    field = None,
    cls = Active,
    category = Mental,
    apt = INT,
    sampleSpecs = List("Evidence Analysis", "Logical Deductions", "Physical Investigation", "Physical Tracking"),
    descr = """What it is: Investigation is the art of analyzing evidence, piecing together clues, solving mysteries, and making logical deductions from groups of facts. Investigation differs from Perception in that it is the conscious search for clues or pieces of a puzzle.
When you use it: Use Investigation to draw conclusions from assorted details. For example, Investigation could be used to determine the likely sequence of events at a crime scene, determine a possible social connection between two people, or deduce how an enemy made their escape. Investigation is a great way to provide clues to players, especially when the subject matter is something their character might know well but the player does not.""");

  val kinesics = SkillDef(
    name = "Kinesics",
    field = None,
    cls = Active,
    category = Social,
    apt = SAV,
    sampleSpecs = List("Judge Intent", "Nonvocal Communication"),
    descr = """What it is: Kinesics is the art of empathy and non-vocal communication.
When you use it: Use Kinesics to read body language, tells, social cues, and other subconscious indicators. It can also be used to emote more effectively. Kinesics is used defensively whenever someone is trying to deceive you; make an Opposed Test against that person’s Deception or Impersonation skill.
Though synthetic morphs are also designed to emote, reading them is not as easy. Apply a –30 modifier when judging a synthetic morph inhabited by a character or AGI. Likewise, standard AIs are also difficult to read; apply a –60 modifier when judging a synthetic morph or pod operated by an AI.""");

  val kineticWeapons = SkillDef(
    name = "Kinetic Weapons",
    field = None,
    cls = Active,
    category = Combat,
    apt = COO,
    sampleSpecs = List("Assault Rifles", "Machine Guns", "Pistols", "Sniper Rifles", "Submachine Guns"),
    descr = """What it is: Kinetic Weapons covers the use and maintenance of standard kinetic projectile weapons like firearms and railguns (p. 335).
When you use it: Use this skill whenever attacking with a kinetic weapon in ranged combat (p. 191).""");

  val language = SkillDef(
    name = "Language",
    field = Some("???"),
    cls = Knowledge,
    category = NA,
    apt = INT,
    sampleFields = Some(Languages.list.map(_.toString)),
    sampleSpecs = List("As appropriate to the field, representing dialects, technical jargon, and subcultural slang"),
    descr = """What it is: Language covers the speaking and reading of languages other than the player’s native tongue. A speaker is considered fluent at a skill level of 50; anything above this indicates further refinement in technical vocabulary, accents, and knowledge of dialects.
When you use it: Use the Language skill whenever you want to speak, understand, or read something in a language at which you are skilled. Most speaking and reading comprehension tests can be considered Simple Success Tests if your skill is over 50, unless the gamemaster rules the subject is sufficiently complex that a non-native speaker would have trouble understanding it.""");

  val medicine = SkillDef(
    name = "Medicine",
    field = Some("???"),
    cls = Active,
    category = Technical,
    apt = COG,
    sampleFields = Some(List("Biosculpting", "Exotic Biomorphs", "Gene Therapy", "General Practice", "Implant Surgery", "Nanomedicine", "Paramedic", "Pods", "Psychiatry", "Remote Surgery", "Trauma Surgery", "Uplifts", "Veterinary")),
    sampleSpecs = appr,
    descr = """What it is: Medicine is the applied care and maintenance of biological beings and life.
When you use it: Use Medicine whenever you need to apply medical care beyond the immediate help provided by first responders. This includes conducting physical exams, diagnosing ailments, treating problems and illnesses, surgery, using biotech and nano-tech medical tools, and long-term care. see Healing and Repair, p. 208.""");

  val navigation = SkillDef(
    name = "Navigation",
    field = None,
    cls = Active,
    category = Mental,
    apt = INT,
    sampleSpecs = List("Astrogation", "Map Making", "Map Reading"),
    descr = """What it is: Navigation is the art of finding your way, whether using AR maps, a compass, the stars, or an astrogation AI.
When you use it: Use Navigation whenever you need to plot out a course, determine a direction, or otherwise keep from getting lost.""");

  val networking = SkillDef(
    name = "Networking",
    field = Some("???"),
    cls = Active,
    category = Social,
    apt = SAV,
    sampleFields = Some(List("Autonomists", "Criminals", "Ecologists", "Firewall", "Hypercorps", "Media", "Scientists", "Ultimates", "Gatecrashers")),
    sampleSpecs = appr,
    descr = """What it is: Networking is your skill at working your contacts, trading favors, and keeping your finger on the pulse of a particular faction or cultural grouping.
When you use it: Use Networking to gather information or call on services using your Reputation (see Reputation and Social Networks, p. 285).""");

  val palming = SkillDef(
    name = "Palming",
    field = None,
    cls = Active,
    category = Physical,
    apt = COO,
    sampleSpecs = List("Pickpocketing", "Shoplifting", "Tricks"),
    descr = """What it is: Palming is the skill of handling items quickly and nimbly without others noticing. Palming is not only about dexterous manipulation of objects but also relies heavily on obfuscation, timing, and misdirection.
When you use it: Use Palming any time you are trying to conceal an item on your person, shoplift, pick a pocket, surreptitiously discard something, or perform a magic trick. Palming is an Opposed Test against the Perception of any onlookers. The gamemaster may wish to make this roll secretly.""");

  val perception = SkillDef(
    name = "Perception",
    field = None,
    cls = Active,
    category = Mental,
    apt = INT,
    sampleSpecs = List("Aural", "Olfactory", "Tactile", "Taste", "Visual"),
    descr = """What it is: Perception is the use of your physical senses (including cybernetic) and awareness of the physical world around you. Perception differs from Investigation in that it is noticing things by chance, rather than actively searching for something.
When you use it: Use Perception whenever you want to take a detailed account of your surround- ings (see Detailed Perception, p. 190). Perception can also be considered an Automatic Action (see Basic Perception, p. 190) and so the gamemaster may call for a Perception Test to determine if you notice something; it is recommended that such tests be rolled secretly by the gamemaster. Perception is also used as an Opposed Test whenever someone around you is trying to be sneaky with Infiltration or Palming.""");

  val persuasion = SkillDef(
    name = "Persuasion",
    field = None,
    cls = Active,
    category = Social,
    apt = SAV,
    sampleSpecs = List("Diplomacy", "Morale Boosting", "Negotiating", "Seduction"),
    descr = """What it is: Persuasion is the art of convincing someone to do what you want through the use of words and gestures. This does not include persuasion through threats or force (that is covered by Intimidation) or by lying (covered by Deception).
When you use it: Use Persuasion any time you are trying to bargain with, convince, or manipulate someone. This can include motivating your subordinates or peers to take action, seducing a companion, winning a political debate, or negotiating a contract, among other things. Persuasion is handled as an Opposed Test against the target’s WIL + WIL + SAV when one person is simply trying to win over another. If both parties are trying to convince each other, make it an Opposed Test between Persuasion skills.""");

  val pilot = SkillDef(
    name = "Pilot",
    field = Some("???"),
    cls = Active,
    category = Vehicle,
    apt = REF,
    sampleFields = Some(List("Aircraft", "Anthroform", "Exotic Vehicle", "Groundcraft", "Spacecraft", "Watercraft")),
    sampleSpecs = appr,
    descr = """What it is: Pilot is your skill at driving/flying a vehicle of a particular type.
When you use it: You use Pilot skill whenever you need to maneuver, control, or avoid crashing a vehicle, whether you are in the pilot’s seat, remote controlling a robot, or directly jamming a vehicle with VR. Each vehicle has a Handling modifier that applies to this test, along with other situational modifiers (see Bots, Synthmorphs, and Vehicles, p. 195).""");

  val profession = SkillDef(
    name = "Profession",
    field = Some("???"),
    cls = Knowledge,
    category = NA,
    apt = COG,
    sampleFields = Some(List("Accounting", "Appraisal", "Asteroid Prospecting", "Banking", "Cool Hunting", "Con Schemes", "Distribution", "Forensics", "Lab Technician", "Mining", "Police Procedures", "Psychotherapy", "Security Ops", "Smuggling Tricks", "Social Engineering", "Squad Tactics", "Viral Marketing", "XP Production")),
    sampleSpecs = appr,
    descr = """What it is: Profession skills indicate training in a profession practiced in Eclipse Phase. This can indi- cate either formal training or informal, on-the-job type training and includes both legal and extralegal trades.
When you use it: Use Profession to perform work-related tasks for a specific trade (i.e. mining, balancing accounts, designing a security system, etc.) or to reference specialized knowledge that someone trained in that profession might have.""");

  val programming = SkillDef(
    name = "Programming",
    field = None,
    cls = Active,
    category = Technical,
    apt = COG,
    noDefaulting = true,
    sampleSpecs = List("AI Code", "Malware", "Nanofabrication", "Piracy", "Simulspace Code", "Nanofabrication (Art)", "Nanofabrication (Clothing)", "Nanofabrication (Electronics)", "Nanofabrication (Food)", "Nanofabrication (Forgery)", "Nanofabrication (Weapons)"),
    descr = """What it is: Programming is your talent at writing and modifying software code.
When you use it: Use Programming to write new programs, modify or patch existing software, break copy protection, find or introduce exploitable flaws, write viruses or worms, design virtual settings, and so on. See The Mesh chapter, p. 234. Programming is also applied when using nanofabrication devices.""");

  val protocol = SkillDef(
    name = "Protocol",
    field = None,
    cls = Active,
    category = Social,
    apt = SAV,
    sampleSpecs = List("Anarchist", "Brinker", "Criminal", "Factor", "Hypercorp", "Infomorph", "Mercurial", "Reclaimer", "Preservationist", "Scum", "Ultimate"),
    descr = """What it is: Protocol is the art of making a good impression in social settings. This includes keeping up with the latest memes, trends, gossip, interests and habits of various (sub)cultural groups.
When you use it: Use Protocol whenever you need to choose your words carefully, determine who is the appropriate person to speak to, impress someone with your grasp of customs, or otherwise fit into a specific social/cultural grouping. Part etiquette, part street-wise, Protocol allows you to navigate treacherous social waters and put people at ease. If the character is dealing with a suspicious or hostile audience, make this an Opposed Test against the target’s WIL + WIL + SAV.""");

  val psiAssault = SkillDef(
    name = "Psi Assault",
    field = None,
    cls = Active,
    category = Psi,
    apt = WIL,
    noDefaulting = true,
    sampleSpecs = List("By sleight"),
    descr = """What it is: Psi Assault is the skill of damaging another ego’s mind. It can only be purchased by characters with the Psi trait (p. 147).
What it does: Use Psi Assault when attacking another ego’s mind in psi combat.""");

  val psychosurgery = SkillDef(
    name = "Psychosurgery",
    field = None,
    cls = Active,
    category = Technical,
    apt = INT,
    sampleSpecs = List("Memory Manipulation", "Personality Editing", "Psychotherapy"),
    descr = """What it is: Psychosurgery is the use of machine-aided psychological techniques to repair, damage, or manipulate the psyche.
When you use it: Use Psychosurgery to attempt the tricky process of editing someone’s mind (see Psychosurgery, p. 229). Psychosurgery can be used beneficially to help patients who remember their deaths, feel disconnected after remorphing, or have experienced other sorts of mental traumas. This skill may also be used to interrogate, torture, or otherwise mess with captive minds in a VR environment.""");

  val research = SkillDef(
    name = "Research",
    field = None,
    cls = Active,
    category = Technical,
    apt = COG,
    sampleSpecs = List("Tracking"),
    descr = """What it is: Research is the skill for looking up information on the mesh: searching, sifting, mining, and interpreting data. This includes knowing where to look, what links to follow, and how to optimize your queries.
When you use it: Use the Research skill whenever you need to look up the answer to a question, find databases, search archives, or track down anything online. Research is typically a Task Action with the timeframe and difficulty modifier determined by the gamemaster. See Online Research, p. 249.""");

  val scrounging = SkillDef(
    name = "Scrounging",
    field = None,
    cls = Active,
    category = Mental,
    apt = INT,
    sampleSpecs = List("Bazaars", "Forests", "Habitats", "Ruins"),
    descr = """What it is: Scrounging is your ability to find things, particularly things of use or value that are concealed, buried, or hard to find. This includes knowing where to look and what to look for. Scrounging differs from both Perception and Investigation in that it is about finding items hidden among others, and in most cases about finding something in particular (food, valuables, etc.).
When you use it: Use Scrounging to dumpster-dive a meal, search ruins for relics, find bargains at a bazaar, forage berries in the forest, locate a spacesuit in an abandoned ship, etc. Scrounging is typically handled as a Task Action with a timeframe and difficulty modifier determined by the gamemaster.""");

  val seekerWeapons = SkillDef(
    name = "Seeker Weapons",
    field = None,
    cls = Active,
    category = Combat,
    apt = COO,
    sampleSpecs = List("Armband", "Pistol", "Rifle", "Underbarrel"),
    descr = """What it is: Seeker Weapons covers the use and main- tenance of seeker launchers and seeker missiles (p. 340).
When you use it: Use this skill when attacking with a seeker in ranged combat (p. 191).""");

  val sense = SkillDef(
    name = "Sense",
    field = None,
    cls = Active,
    category = Psi,
    apt = INT,
    noDefaulting = true,
    sampleSpecs = List("By sleight"),
    descr = """What it is: Sense is the use of psi to scan egos. Only characters with the Psi trait (p. 147) may purchase this skill.
What it does: see Psi, p. 220.""");

  val sprayWeapons = SkillDef(
    name = "Spray Weapons",
    field = None,
    cls = Active,
    category = Combat,
    apt = COO,
    sampleSpecs = List("Buzzer", "Freezer", "Shard", "Shredder", "Torch"),
    descr = """What it is: The Spray Weapons skill covers the use and maintenance of cone-effect ranged weapons (see Spray Weapons, p. 340).
When you use it: A player uses their Spray Weapons skill whenever they are attacking with a spray weapon in ranged combat (p. 191).""");

  val swimming = SkillDef(
    name = "Swimming",
    field = None,
    cls = Active,
    category = Physical,
    apt = SOM,
    sampleSpecs = List("Diving", "Freestyle", "Underwater Diving"),
    descr = """What it is: Swimming is the art of moving and not drowning within fluids. It includes floating, surface swimming, snorkeling, diving, and related equipment use.
When you use it: Use Swimming whenever you need to move and survive in water or another liquid environment. Swimming in a non-threatening environment can be handled as a Simple Success Test. Swimming over a long distance could be handled as a Task Action. Diving off a cliff into a lake, prevent- ing yourself from being swept away in a raging river current, or making sure you’ve set a proper gas mix for a deep-sea dive, among other things, requires a Success Test.""");

  val throwingWeapons = SkillDef(
    name = "Throwing Weapons",
    field = None,
    cls = Active,
    category = Combat,
    apt = COO,
    sampleSpecs = List("Grenades", "Knives", "Rocks"),
    descr = """What it is: Throwing Weapons skill covers the use and maintenance of standard throwing weapons, like grenades (p. 340).
When you use it: Use Throwing Weapons skill whenever you are attacking with a throwing weapon in ranged combat (p. 191).""");

  val unarmedCombat = SkillDef(
    name = "Unarmed Combat",
    field = None,
    cls = Active,
    category = Combat,
    apt = SOM,
    sampleSpecs = List("Implant Weaponry", "Kick", "Punch", "Subdual"),
    descr = """What it is: Unarmed Combat is your ability to attack and defend without using weapons.
When you use it: Use Unarmed Combat whenever you want to attack someone with your fists, feet, elbows, knees, or other body parts in melee combat (p. 191).""");

  val list: List[SkillDef] = Macros.memberList[SkillDef];
}

object Languages {
  import Language.LangName;

  case object Afrikaans extends LangName("Afrikaans")
  case object Arabic extends LangName("Arabic")
  case object Bengali extends LangName("Bengali")
  case object Burmese extends LangName("Burmese")
  case object Cantonese extends LangName("Cantonese")
  case object Czech extends LangName("Czech")
  case object Danish extends LangName("Danish")
  case object Dutch extends LangName("Dutch")
  case object English extends LangName("English")
  case object Estonian extends LangName("Estonian")
  case object Farsi extends LangName("Farsi")
  case object Finnish extends LangName("Finnish")
  case object French extends LangName("French")
  case object German extends LangName("German")
  case object Greek extends LangName("Greek")
  case object Hebrew extends LangName("Hebrew")
  case object Hindi extends LangName("Hindi")
  case object Icelandic extends LangName("Icelandic")
  case object Indonesian extends LangName("Indonesian")
  case object Italian extends LangName("Italian")
  case object Japanese extends LangName("Japanese")
  case object Javanese extends LangName("Javanese")
  case object Khmer extends LangName("Khmer")
  case object Korean extends LangName("Korean")
  case object Kurdish extends LangName("Kurdish")
  case object Latin extends LangName("Latin")
  case object Mandarin extends LangName("Mandarin")
  case object Malay extends LangName("Malay")
  case object Norwegian extends LangName("Norwegian")
  case object Polish extends LangName("Polish")
  case object Portuguese extends LangName("Portuguese")
  case object Punjabi extends LangName("Punjabi")
  case object Romanian extends LangName("Romanian")
  case object Russian extends LangName("Russian")
  case object Serbian extends LangName("Serbian")
  case object Skandinaviska extends LangName("Skandinaviska")
  case object Slovak extends LangName("Slovak")
  case object Spanish extends LangName("Spanish")
  case object Suryan extends LangName("Suryan")
  case object Swahili extends LangName("Swahili")
  case object Swedish extends LangName("Swedish")
  case object Tagalog extends LangName("Tagalog")
  case object Tamil extends LangName("Tamil")
  case object Thai extends LangName("Thai")
  case object Turkish extends LangName("Turkish")
  case object Urdu extends LangName("Urdu")
  case object Vietnamese extends LangName("Vietnamese")
  case object Wu extends LangName("Wu")
  case object Xhosa extends LangName("Xhosa");
  case object Zulu extends LangName("Zulu");

  val list: List[Language] = Macros.memberList[Language];

  def from(s: String): Option[Language] = {
    list.find(_.toString.equalsIgnoreCase(s))
  }

}
