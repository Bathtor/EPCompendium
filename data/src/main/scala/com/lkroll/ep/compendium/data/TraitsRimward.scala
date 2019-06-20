package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsRimward {
  import TraitType.{Negative, Neutral, Positive};
  import TraitApplicability.{Both, Ego, Morph};

  val temperatureIntoleranceWarm = EPTrait(
    name = "Temperature Intolerance (Warm)",
    traitType = Negative,
    applicability = Morph,
    descr =
      "The morph is adapted for extreme cold and has difficulty dissipating body heat in temperatures tolerated by normal transhumans. When exposed to vacuum or temperatures above 5ºC for more than 10 minutes, the character suffers a –10 modifier to all actions. At 10ºC, increase the modifier to –20. At temperatures above 25ºC, the character may suffer 1d10 DV per hour exposed from overheating, at the gamemaster’s discretion. These effects can be nullified by wearing a vacsuit, the application of some sort of cooling system, or returning to a suitably cold environment.",
    cp = 10,
    source = Sources.rimward,
    sourcePage = 188
  );

  val apoptosis = EPTrait(
    name = "Whole Body Apoptosis",
    traitType = Negative,
    applicability = Morph,
    descr =
      "This morph has been genetically programmed to suffer a sudden and lethal massive cellular failure at some point in the future, usually within a given 10 year period, though it is possible to target a specific date, give or take a few months. This modification is favored by bioconservatives that wish to live healthy and die quickly and “naturally.” The cellular failure takes about 10 minutes to complete, giving the character time to stop what they are doing, send any final messages, or commit any other final acts. This trait may only be applied to biomorphs (including pods). Apoptosis may not be initiated voluntarily.",
    cp = 0,
    source = Sources.rimward,
    sourcePage = 188
  );

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
