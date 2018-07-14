package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros
import com.lkroll.ep.compendium.Cost.Moderate
import com.lkroll.ep.compendium.SubstanceClassification.Biologicals
import com.lkroll.ep.compendium.ApplicationMethod.Inhalation
import com.lkroll.ep.compendium.ApplicationMethod.Injection
import com.lkroll.ep.compendium.ApplicationMethod.Oral
import com.lkroll.ep.compendium.AddictionType.Physical
import com.lkroll.ep.compendium.SubstanceClassification.Biologicals
import com.lkroll.ep.compendium.ApplicationMethod.Inhalation
import com.lkroll.ep.compendium.ApplicationMethod.Inhalation
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.SubstanceClassification.Chemicals
import com.lkroll.ep.compendium.ApplicationMethod.Dermal
import com.lkroll.ep.compendium.AddictionType.Physical

object NanodrugsEP {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Nanodrugs";

  val frequency = Substance(
    name = "Frequency",
    category = c,
    classification = Nanodrugs,
    application = List(Injection, Oral),
    addiction = (Mental, 0),
    onset = "immediate",
    duration = 8.hours,
    effects = List.empty,
    descr = "Frequency (or Freeq) is a nanodrug designed as a tool for scientific visualization. It releases a small swarm of nanobots into the character’s bloodstream that settle in the epidermis, where they act as sensors of electromagnetic radiation. This sensory input is then injected into the character’s visual and tactile sensoria, hitting the user with a sequence of novel stimuli, typically a light show or weird tactile sensations. Aside from its recreational uses, Frequency is good at picking up on localized field radiation with a standard Perception Test. A character can take advantage of this to spot sensors and hidden electronics. Similar to now-obsolete 20th-century hallucinogens like LSD and psilocybin, however, a Frequency trip can be disorienting and upsetting (the gamemaster should apply any modifiers, mental stress, or even trauma as they feel appropriate). Characters typically experience a period about 1/3 of the way through their trip in which sensory input is extremely intense; during this period, which usually lasts about 2 hours, they are unable to read.",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 321);

  val gravy = Substance(
    name = "Gravy",
    category = c,
    classification = Nanodrugs,
    application = List(Injection, Oral),
    addiction = None,
    onset = "immediate",
    duration = "immediate",
    effects = List.empty,
    descr = "Gravy assists characters in acclimating to high gravity environments. It comes in a variety of flavors and is often added as a sauce to food. For Gravy to be 100% effective, the character must begin using it in advance. Reduce penalties for high-gravity acclimation by 20. ",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 321);

  val schizo = Substance(
    name = "Schizo",
    category = c,
    classification = Nanodrugs,
    application = Injection,
    addiction = (Mental, 0),
    onset = "immediate",
    duration = 1.days,
    effects = List.empty,
    descr = "Schizo is a nanodrug that mirrors the effects of paranoid schizophrenia. It is popular in some hyperelite social circles as a truly daring and intriguing experience. A dose of schizo looks like a disposable antique razor blade. Making an incision in the skin releases a swarm of nanobots that travel to the central nervous system and induce the effects of the drug. While in effect, the character is severely paranoid and hears voices. How this plays out is at the discretion of the gamemaster, but should include irrational fears, unusual compulsions based on the instructions of the voice or voices, and a strong possibility that the character will behave in a violent or destructive fashion. The character may make WIL × 3 Tests to avoid violent acts against objects or strangers. Friends and trusted acquaintances are probably less likely to be targets of violence (+30 modifier to avoid hurting people the character cares about or destroying important possessions). Note that the character’s muse is unaffected by Schizo and can make efforts to babysit the character. Characters who take Schizo suffer 1d10 mental stress. ",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 321);

  val petals = Substance(
    name = "Petals",
    category = c,
    classification = Nanodrugs,
    application = Oral,
    addiction = (Mental, 0),
    onset = "immediate",
    duration = 1.days,
    effects = List.empty,
    descr = "Petals is a term for a type of narrative hallucinogen, a nanodrug that hijacks the senses and takes the user on a game-like, highly immersive trip. Known by a myriad of intriguing names—Forgotten Hand, Darkly Selving, Inquisitive Green, to name a few—Petals are post-Fall society’s heroin—the drug of choice for the desperate and fucked. Petals almost always appear as nanopharmaceutical flowers, potted or with a nutrient pack attached to the stem. Plucking and swallowing the petals from the flower triggers the effects immediately. Flowers have 5–10 petals. Multiple users may share the experience if they take the Petals within 1 minute of the first one being plucked; after this all petals remaining on the flower fade to translucent white and become inert."
      + "Petal experiences are like entire scenarios in and of themselves. Some take place entirely in the user’s mesh inserts (the user must cede control of their implants voluntarily; if they do not, the drug has no effect other than producing very low-intensity LSD-like visual hallucinations), taking control of the character’s entoptic displays, linking to secretive mesh servers and other trippers, and invading the character’s sensorium with AR “hallucinations.” Others put the character into a near-comatose state during which they go on a head trip. Normally there is some kind of well-developed theme or plot to a Petal experience, although in some cases they just experience a stream of images."
      + "Though most societies seek to suppress Petals, new ones appear constantly, fueled by a persistent subculture of crafters and users. Petalcrafters view their work as an art form (or at least as really good entertainment), and the better Petals are lovingly crafted, hauntingly beautiful experiences—even if they’re also terrifying. The subculture of Petal use ranges from casual users who occasionally do an easy, short-duration flower to hardcore addicts who spend much of their time not on Petals trying to hunt down the most intense and esoteric varieties. From this subculture comes a lot of information on what various Petals look like and their effects. Because Petals combine custom nanobots with tailored chemical payloads and sometimes connections to mesh servers, duplicating them using fabricators is impossible, leading to an active market of crafters, dealers, and traders."
      + "Petals sometimes contain easter eggs and rewards, called “sweets” by petal users. Getting the sweets usually requires fulfilling certain conditions within the trip, such as correctly answering questions or fulfilling goals. Typical sweets include skillsofts, new clothing or product designs, and custom infomorph sleeves."
      + "On the negative side, some Petal trips go bad, inflicting 1d10 mental stress or more on the user. Perhaps worse, some Petals are loaded with malware that takes over the user’s mesh inserts and worse—some sentinels even whisper of Petals carrying strains of the exsurgent virus.",
    price = Cost.None,
    source = Sources.ep,
    sourcePage = 322);

  val list: List[Substance] = Macros.memberList[Substance];
}
