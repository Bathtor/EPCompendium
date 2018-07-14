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

object DrugsPanoptycon {
  import SubstanceClassification._;
  import ApplicationMethod._;
  import AddictionType._;
  import Units._;
  import SubstanceImplicits._;
  import Aptitude._;
  import Effect._

  val c = "Drugs";

  val hydra = Substance(
    name = "Hydra",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 20.mins,
    duration = 3.hours,
    effects = List.empty,
    descr = "Hydra only affects neo-octopi physiology. Specifically, it provides a euphoric sense of detachment to the ego while also boosting the autonomous activity and unconscious reflexiveness of neo-octopi arms, which already tend to act on their own accord. Though it does not (usually) impact the ego’s control over their arms, any arms that are idle simply do their own thing. The gamemaster decides if and when these arms act and what they do (or, for more fun, you can assign an arm to each other player). The arms mostly act reflex- ively—recoiling from danger, grasping on to nearby objects—but sometimes act as if with intelligent direc- tion, striking opponents, snatching forgotten objects, opening doors, etc. The arms use the octomorph’s Initiative and skills. ",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 151);

  val kong = Substance(
    name = "Kong",
    category = c,
    classification = Chemicals,
    application = List(Inhalation, Injection, Oral),
    addiction = (Physical, -10),
    onset = 3.turns,
    duration = 1.hours,
    effects = List(IgnoreWounds(1), SOM + 5, INT - 5, FreeForm("+10 bonus on melee attacks")),
    descr = "Kong is a potent drug cocktail that boosts the aggressiveness of non-human primates. Uplifts and smart animals under the influence of kong must make a WIL x 3 Test or automatically attack anyone that exhibits threatening behavior. Kong users can ignore the effects of 1 wound, receive a +5 SOM bonus and a +10 bonus on melee attacks, but suffer a −5 INT modifier. Once engaged in violence, the affected primate must make a WIL x 3 Test to not automatically attack the next nearest target. Attempts to control primates under the influence of kong suffer a −30 modifier to their Animal Handling Tests. Once the effects of this drug wear off, the user suffers −5 SOM for an equivalent duration.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 151);

  val kongAfterEffect = Substance(
    name = "Kong After Effect",
    category = c,
    classification = Chemicals,
    application = List(Inhalation, Injection, Oral),
    addiction = (Physical, -10),
    onset = 3.turns,
    duration = 1.hours,
    effects = List(SOM - 5),
    descr = "Kong is a potent drug cocktail that boosts the aggressiveness of non-human primates. Uplifts and smart animals under the influence of kong must make a WIL x 3 Test or automatically attack anyone that exhibits threatening behavior. Kong users can ignore the effects of 1 wound, receive a +5 SOM bonus and a +10 bonus on melee attacks, but suffer a −5 INT modifier. Once engaged in violence, the affected primate must make a WIL x 3 Test to not automatically attack the next nearest target. Attempts to control primates under the influence of kong suffer a −30 modifier to their Animal Handling Tests. Once the effects of this drug wear off, the user suffers −5 SOM for an equivalent duration.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 151);

  val raptor = Substance(
    name = "Raptor",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, -10),
    onset = 20.mins,
    duration = 1.hours,
    effects = List(SOM + 5, FreeForm("+20 modifier to Flight Tests to increase movement")),
    descr = "Raptor is a strength-boosting drug that only affects neo-avians. It increases their wing power and speed, as well as boosting the grip of their talons. Apply a +5 SOM bonus and a +20 modifier to Flight Tests to increase movement (like Sprinting, p. 190, EP). ",
    price = Cost.Moderate,
    source = Sources.ep,
    sourcePage = 152);

  val staste = Substance(
    name = "Staste",
    category = c,
    classification = Chemicals,
    application = List(Injection, Oral),
    addiction = (Physical, 10),
    onset = 20.mins,
    duration = 3.hours,
    effects = List(FreeForm("+30 modifier to Perception, Investigation, or similar skill tests based on smell.")),
    descr = "This drug increases an octomorph brain’s ability to process sensory input from the chemoreceptors in their suckers. This gives an octomorph an enhanced ability to “taste” things akin to a bloodhound’s sense of smell, only tactile-based. Apply a +30 modifier to Perception, Investigation, or similar skill tests based on smell.",
    price = Cost.Low,
    source = Sources.ep,
    sourcePage = 152);

  val list: List[Substance] = Macros.memberList[Substance];
}
