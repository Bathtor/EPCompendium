package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsPanopticon {
  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  // Positive
  val homeTurf = EPTrait(
    name = "Home Turf",
    traitType = Positive,
    applicability = Ego,
    descr = "This character knows a particular habitat like the back of their hand, paw, or tentacle, having grown up there or spent years familiarizing themselves. They receive an extra point of Moxie that may only be used for tests that apply to that habitat, such as navigating the best route, bypassing airlock controls, or hacking its infrastructure.",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 145);

  val informationControl = EPTrait(
    name = "Information Control",
    traitType = Positive,
    applicability = Ego,
    descr = "This character has a knack for diligence and caution in their daily living, online, and social networking interactions, reducing the amount of extraneous or sensitive information about themselves that leaks out in the public eye. Apply a −10 modifier to any Research Tests to gather information on the character or track them online (see Scanning, Tracking, and Monitoring, p. 251, EP) and any Networking Tests to ascertain the character’s networking interactions (see Keeping It Quiet, p. 288, EP).",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 145);

  val socialButterfly = EPTrait(
    name = "Social Butterfly",
    traitType = Positive,
    applicability = Ego,
    descr = "This character is a promiscuous abuser of online social networks. Because they go out of their way to make new connections and interact with people, they find it slightly easier to get what they need. Apply a +10 modifier to Networking Tests.",
    cp = 15,
    source = Sources.panopticon,
    sourcePage = 145);

  val fiveMinFame = EPTrait(
    name = "Five Minutes of Fame",
    traitType = Positive,
    applicability = Ego,
    descr = "a.k.a. “You're that Guy!” Sometime in the past, this character got their 5 minutes of mesh fame in a funny viral meme that swept the solar system. To this day, strangers who access the character’s social profile are likely to connect them to that meme. Though tedious for the character, there is a positive side effect, as these strangers remember the meme fondly and are more likely to help the character out. Once per game session, the gamemaster may decide that a stranger with whom the character is interacting and who has access to the character’s online public profile recognizes the char- acter. The character receives a one-time +20 bonus to any social skill or Networking Test with that stranger.",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 145);

  // Negative
  val dataFootprint = EPTrait(
    name = "Data Footprint",
    traitType = Negative,
    applicability = Ego,
    descr = "The character is particularly sloppy about keeping a lid on their daily living, online, and social networking interactions, leaving a larger data footprint than usual in the public eye. Apply a +10 modifier to any Research Tests to gather information on the character or track them online (see Scanning, Tracking, and Monitoring, p. 251, EP) and any Networking Tests to ascertain the character’s networking interactions (see Keeping It Quiet, p. 288, EP).",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 145);

  val impairedBalance1 = EPTrait(
    name = "Impaired Balance (Level 1)",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to neo-pigs. This uplift’s brain has not been fully adapted to the neo-pig’s bipedal stance and still suffers occasional difficulties with balance. The character suffers a −10 modifier to any Climbing, Freerunning, or similar test involving balance or upright movement.",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 145);

  val impairedBalance2 = EPTrait(
    name = "Impaired Balance (Level 2)",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to neo-pigs. This uplift’s brain has not been fully adapted to the neo-pig’s bipedal stance and still suffers occasional difficulties with balance. The character suffers a −20 modifier to any Climbing, Freerunning, or similar test involving balance or upright movement.",
    cp = 20,
    source = Sources.panopticon,
    sourcePage = 145);

  val impairedBalance3 = EPTrait(
    name = "Impaired Balance (Level 3)",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to neo-pigs. This uplift’s brain has not been fully adapted to the neo-pig’s bipedal stance and still suffers occasional difficulties with balance. The character suffers a −30 modifier to any Climbing, Freerunning, or similar test involving balance or upright movement.",
    cp = 30,
    source = Sources.panopticon,
    sourcePage = 145);

  val impairedHearing = EPTrait(
    name = "Impaired Hearing",
    traitType = Negative,
    applicability = Morph,
    descr = "low sounds in the 400–1,000 Hertz range (as opposed to the 20–20,000 Hertz range enjoyed by most transhumans) and hears poorly when not underwater. Apply a −30 modifier to any hearing-based Perception Tests. At the gamemaster's discretion, certain medium and high-frequency sounds may be inaudible as they are outside the morph's range. This lack of hearing may be compensated for with audio implants or microphones and mesh inserts.",
    cp = 5,
    source = Sources.panopticon,
    sourcePage = 145);

  val impairedLinguistics1 = EPTrait(
    name = "Impaired Linguistics (Level 1)",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to uplifts. This uplift’s particular brain structure has difficulty processing language. The uplift loses some of their ability to speak, read, and comprehend things spoken by others when they suffer from stress. Each time the uplift suffers a trauma, they must make a Language Test at −10 to speak (both verbal and via mesh inserts) or comprehend (reading or listening) anything above the most basic words and information. This test only needs to be made once for each language, but for each additional trauma suffered, the test must be made again, with an additional cumulative −10 modifier. If the uplift loses their language abilities, they will recover them when that particular trauma is healed. In the meantime, they can only convey and understand basic, one-word, one-syllable concepts, such as “eat” or “run.”",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 147);

  val impairedLinguistics2 = EPTrait(
    name = "Impaired Linguistics (Level 2)",
    traitType = Negative,
    applicability = Ego,
    descr = "This trait is only available to uplifts. This uplift’s particular brain structure has difficulty processing language. The uplift’s language centers are perma- nently hobbled. Their free natural Language skill at character creation is 40 + INT, and no Language skill may be raised above 60. Additionally, they must make make a Language Test to convey or comprehend particularly complex information or sentences at a −10 modifier. At the gamemaster’s discretion, this may also impair other skill tests, particularly Knowledge skills when dealing with detailed data or specialist terminology.",
    cp = 20,
    source = Sources.panopticon,
    sourcePage = 147);

  val shutIn = EPTrait(
    name = "Shut-In",
    traitType = Negative,
    applicability = Ego,
    descr = "This character is a social hermit or went through a period of self-imposed isolation, limiting the amount of interactions they have via online social networks. Because the character is out of touch, their ability to network with others is impaired. Apply a −10 modifier to Networking Tests.",
    cp = 15,
    source = Sources.panopticon,
    sourcePage = 147);

  val stalker = EPTrait(
    name = "Stalker",
    traitType = Negative,
    applicability = Ego,
    descr = "A voyeur obsessively stalks this character’s actions online. The gamemaster and player should work out details of the stalker together, and the gamemaster should use the stalker as a plot element to create occasional nuisances and challenges. The stalker could, for example, be a fan who over-appreciates the character’s work and pesters them or a unknown entity that follows the character’s actions religiously and posts the details to an online log.",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 147);

  val stolenIdentity = EPTrait(
    name = "Stolen Identity",
    traitType = Negative,
    applicability = Ego,
    descr = "Someone stole this character’s identity and took advantage of their name, reputation, background—the works. Though this happened in the past, the situation was never fully resolved and the character is plagued with collateral difficulties from the theft. The gamemaster and player should work out details of the incident together, and the gamemaster should use this to occasionally hinder the character or create complications. For example, the character may have to deal with criminal charges against them in one habitat, angry thugs looking for payback on another, and so on.",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 147);

  val fiveMinInfamy = EPTrait(
    name = "Five Minutes of Infamy",
    traitType = Negative,
    applicability = Ego,
    descr = "a.k.a “Wait. That was you?”. This character was the unfortunate star of a viral meme that swept through the solar system’s mesh networks—provoking anger, disgust, or mockery towards them. To this day, strangers who access the character’s social profile are likely to connect them to that meme, coloring their perception of the character. Once per game session, the gamemaster may decide that a stranger with whom the character is interacting and who has access to the character’s online public profile makes the connection. The character suffers a one-time −20 modifier to any social skill or Networking Test with that stranger.",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 147);

  val weakGrip = EPTrait(
    name = "Weak Grip",
    traitType = Negative,
    applicability = Morph,
    descr = "This trait is only available to neo-avian and neo-pig morphs. The physiology of this particular morph is flawed in that the opposable digits on the hands are not fully formed or operational. A character in this morph loses their damage bonus in melee attacks and suffers a −10 modifier on subdual tests (p. 204, EP) and any other tests involving their grip, hand strength, or ability to hold on.",
    cp = 10,
    source = Sources.panopticon,
    sourcePage = 148);

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
