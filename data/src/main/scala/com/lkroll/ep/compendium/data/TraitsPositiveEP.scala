package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object TraitsPositiveEP {
  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  val adaptabilityLevel1 = EPTrait(
    name = "Adaptability Level 1",
    traitType = Positive,
    applicability = Ego,
    descr = "Resleeving is a breeze for this character. They adjust to new morphs much more quickly than most other people. Apply a +10 modifier for Integration Tests (p. 271) and Alienation Tests (p. 272).",
    cp = 10,
    source = Sources.ep,
    sourcePage = 145);

  val adaptabilityLevel2 = EPTrait(
    name = "Adaptability Level 2",
    traitType = Positive,
    applicability = Ego,
    descr = "Resleeving is a breeze for this character. They adjust to new morphs much more quickly than most other people. Apply a +20 modifier for Integration Tests (p. 271) and Alienation Tests (p. 272).",
    cp = 20,
    source = Sources.ep,
    sourcePage = 145);

  // TODO complete

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
