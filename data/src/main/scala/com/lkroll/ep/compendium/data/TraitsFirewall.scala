package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsFirewall {
  import TraitType.{Negative, Neutral, Positive};
  import TraitApplicability.{Both, Ego, Morph};

  val civilianAnalyst1 = EPTrait(
    name = "Civilian Analyst (Level 1)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character is a civilian analyst in a large intelligence agency such as the Titanian Ministry of State’s Civilian Intelligence Directorate or the Planetary Consortium’s Oversight. The character receives a +10 on all Networking Tests within their agency. The character is actively employed there and is expected to put in at least 6 hours of work four days a week (if Titanian) or 8 hours a day five days a week (if Jovian, Venusian, Lunar, or Martian). In some polities, the character may be able to work remotely. This trait may be a poor choice for Jovian characters, as most Jovian intel analysts are confined to the Castle, with very limited freedom of movement. Also note that characters making frequent requests for secret information not related to their job functions will draw scrutiny.",
    cp = 10,
    source = Sources.firewall,
    sourcePage = 172
  );

  val civilianAnalyst2 = EPTrait(
    name = "Civilian Analyst (Level 2)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character is a civilian analyst in a large intelligence agency such as the Titanian Ministry of State’s Civilian Intelligence Directorate or the Planetary Consortium’s Oversight. The character is a manager coordinating the work of 3–5 other analysts and a few dozen AIs, or a senior non-manager. The character receives a +20 on all Networking Tests within their agency. The character is actively employed there and is expected to put in at least 6 hours of work four days a week (if Titanian) or 8 hours a day five days a week (if Jovian, Venusian, Lunar, or Martian). In some polities, the character may be able to work remotely. This trait may be a poor choice for Jovian characters, as most Jovian intel analysts are confined to the Castle, with very limited freedom of movement. Also note that characters making frequent requests for secret information not related to their job functions will draw scrutiny.",
    cp = 20,
    source = Sources.firewall,
    sourcePage = 172
  );

  val militaryIntelligence = EPTrait(
    name = "Military Intelligence",
    traitType = Positive,
    applicability = Ego,
    descr =
      "This trait may only be taken by characters with the Military Rank trait. Since all members of JSFI are commissioned officers, Jovian characters must have Military Rank of at least Level 2. The character is posted to their military’s intelligence service. This makes it possible for the character to use reputation to garner classified information at one Favor level lower than normal, but it also immerses the character in the spook world, limiting their movements and greatly complicating their collaboration with Firewall. Players taking this trait should consult with the gamemaster as to how their character is able to operate as part of Firewall at all with other spies looking over their shoulder.",
    cp = 10,
    source = Sources.firewall,
    sourcePage = 172
  );

  val militaryRank1 = EPTrait(
    name = "Military Rank (Level 1)",
    traitType = Positive,
    applicability = Ego,
    descr =
      """Jovian: The character is an officer in the Jovian Space Force or Jovian Space Force Marines. Level 1 makes the character an NCO: a warrant officer, sergeant, or senior airman.
Titanian: The character is an officer in the Commonwealth Fleet, Marines, or Coast Guard. Level 1 makes the character an NCO: a warrant officer, sergeant, or petty officer.
The character receives a +10 on all Networking Tests within their service branch. The character is on active duty, with all of the attendant structure and responsibilities of military life. Usually this includes being stationed in a specific place or on a specific vessel. However, the character might also have a desk job or be support staff. Players taking this trait must seek gamemaster permission and develop a plausible story for how their character is able to participate in Firewall missions while on active duty. Also note that this trait affects only the character’s Networking Tests. Favors involving acquiring hardware, deploying military units, or the like still require plausible explanations as to how the character is manipulating the military command and logistics systems, and will have serious consequences if the character’s superiors judge them to be abusing their position. Rank-and-file grunts don’t need to take this trait.""",
    cp = 10,
    source = Sources.firewall,
    sourcePage = 173
  );

  val militaryRank12 = EPTrait(
    name = "Military Rank (Level 2)",
    traitType = Positive,
    applicability = Ego,
    descr =
      """Jovian: The character is an officer in the Jovian Space Force or Jovian Space Force Marines. Level 2 makes the character a low-ranking commissioned officer: a first or second lieutenant.
Titanian: The character is an officer in the Commonwealth Fleet, Marines, or Coast Guard. Level 2 makes the character a low-ranking commissioned officer: a pilot officer, lieutenant, or officer.
The character receives a +20 on all Networking Tests within their service branch. The character is on active duty, with all of the attendant structure and responsibilities of military life. Usually this includes being stationed in a specific place or on a specific vessel. However, the character might also have a desk job or be support staff. Players taking this trait must seek gamemaster permission and develop a plausible story for how their character is able to participate in Firewall missions while on active duty. Also note that this trait affects only the character’s Networking Tests. Favors involving acquiring hardware, deploying military units, or the like still require plausible explanations as to how the character is manipulating the military command and logistics systems, and will have serious consequences if the character’s superiors judge them to be abusing their position. Rank-and-file grunts don’t need to take this trait.""",
    cp = 20,
    source = Sources.firewall,
    sourcePage = 173
  );

  val militaryRank3 = EPTrait(
    name = "Military Rank (Level 3)",
    traitType = Positive,
    applicability = Ego,
    descr =
      """Jovian: The character is an officer in the Jovian Space Force or Jovian Space Force Marines. Level 3 makes the character a mid-ranked commissioned officer: a captain or major.
Titanian: The character is an officer in the Commonwealth Fleet, Marines, or Coast Guard. Level 3 makes the character a mid-ranked commissioned officer: a squadron leader, major, or commanding officer.
The character receives a +30 on all Networking Tests within their service branch. The character is on active duty, with all of the attendant structure and responsibilities of military life. Usually this includes being stationed in a specific place or on a specific vessel. However, the character might also have a desk job or be support staff. Players taking this trait must seek gamemaster permission and develop a plausible story for how their character is able to participate in Firewall missions while on active duty. Also note that this trait affects only the character’s Networking Tests. Favors involving acquiring hardware, deploying military units, or the like still require plausible explanations as to how the character is manipulating the military command and logistics systems, and will have serious consequences if the character’s superiors judge them to be abusing their position. Rank-and-file grunts don’t need to take this trait.""",
    cp = 30,
    source = Sources.firewall,
    sourcePage = 173
  );

  val policeOfficer1 = EPTrait(
    name = "Police Officer (Level 1)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character is a mid-ranking cop — a sergeant or detective — in the Martian Rangers, Titanian Science Police, or other police department. At Level 2, the character is a high-ranking officer: chief inspector, chief of single station or district, or high-ranking desk officer in a large department. The character receives a +10 on all Networking Tests within their department. The character is actively employed there and is expected to put in at least 6 hours of work four days a week (if Titanian) or 8 hours a day five days a week (if Jovian, Venusian, Lunar, or Martian). Rank-and-file officers don’t need to take this trait. Characters using favors to deploy other officers or use department resources may have to explain their actions to superiors.",
    cp = 10,
    source = Sources.firewall,
    sourcePage = 173
  );

  val policeOfficer2 = EPTrait(
    name = "Police Officer (Level 2)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character is a high-ranking officer — chief inspector, chief of single station or district -, or high-ranking desk officer in a large department in the Martian Rangers, Titanian Science Police, or other police department. The character receives a +20 on all Networking Tests within their department. The character is actively employed there and is expected to put in at least 6 hours of work four days a week (if Titanian) or 8 hours a day five days a week (if Jovian, Venusian, Lunar, or Martian). Rank-and-file officers don’t need to take this trait. Characters using favors to deploy other officers or use department resources may have to explain their actions to superiors.",
    cp = 20,
    source = Sources.firewall,
    sourcePage = 173
  );

  val professionalCourtesy = EPTrait(
    name = "Professional Courtesy",
    traitType = Positive,
    applicability = Ego,
    descr =
      "Although higher-ups in your organization probably aren’t thrilled about it, you’ve run into the operatives and field agents of another faction or conspiracy often enough that you’ve earned some leeway with them. Choose a group engaged in covert ops, intelligence work, or paramilitary actions: when encountering agents of that group in the context of a mission, you gain a +10 bonus on all social tests against them, as they treat you with grudging respect—or at least more tolerance than they otherwise would for a member of your organization. Discuss with your gamemaster to detail what your character did to gain the respect of this other group.\nThis trait does not guarantee safety or cooperation between you and members of the chosen organization, only some additional consideration between professionals. Depending on the particulars of an encounter, it may provide some shared information, a moment of détente to face a common foe, or the chance to determine how to stay out of each others’ way.",
    cp = 5,
    source = Sources.firewall,
    sourcePage = 173
  );

  val specialAgent1 = EPTrait(
    name = "Special Agent (Level 1)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character is a field agent of the Titanian Security Police, the secret police of one of the Martian city-states, the Jovian CDC, or a similar organization. The character receives a +10 on all Networking Tests within their agency. The character is actively employed there and is expected to put in at least 6 hours of work four days a week (if Titanian) or 8 hours a day five days a week (if Jovian, Venusian, Lunar, or Martian). Players taking this trait must seek gamemaster permission and develop a plausible story for how their character is able to participate in Firewall missions while working for the agency. Their work requires them to be physically present, although whether they’re stationed in a specific place or are deployed more widely depends on their agency role. Characters using favors to deploy other agents or access secret information not related to their jobs will eventually have to explain their actions to superiors.",
    cp = 10,
    source = Sources.firewall,
    sourcePage = 173
  );

  val specialAgent2 = EPTrait(
    name = "Special Agent (Level 2)",
    traitType = Positive,
    applicability = Ego,
    descr =
      "The character is a supervising agent coordinating the work of 5–10 other agents of the Titanian Security Police, the secret police of one of the Martian city-states, the Jovian CDC, or a similar organization. The character receives a +20 on all Networking Tests within their agency. The character is actively employed there and is expected to put in at least 6 hours of work four days a week (if Titanian) or 8 hours a day five days a week (if Jovian, Venusian, Lunar, or Martian). Players taking this trait must seek gamemaster permission and develop a plausible story for how their character is able to participate in Firewall missions while working for the agency. Their work requires them to be physically present, although whether they’re stationed in a specific place or are deployed more widely depends on their agency role. Characters using favors to deploy other agents or access secret information not related to their jobs will eventually have to explain their actions to superiors.",
    cp = 20,
    source = Sources.firewall,
    sourcePage = 173
  );

  val uniqueContact = EPTrait(
    name = "Unique Contact",
    traitType = Positive,
    applicability = Ego,
    descr =
      "You have a personal tie to an individual with unique skills or resources of particular value to your clandestine activities. This connection may be be based on blood or family ties, shared history, or some other situation that permanently linked you together. Though the contact does not owe you, they are generally inclined to help you, presuming it does not greatly inconvenience them or put them at great risk. This contact could be a weapons dealer, a high-ranking government official, a major hypercorp exec, a scien- tist at the top of their field, a media icon, a deep-cover mole, a police lieutenant, or even a field agent from a rival group. Apply a +10 modifier on Networking and Social Skill Tests with this specific NPC.",
    cp = 10,
    source = Sources.firewall,
    sourcePage = 173
  );

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
