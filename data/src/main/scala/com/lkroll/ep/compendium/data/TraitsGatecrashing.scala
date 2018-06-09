package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsGatecrashing {

  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  val alienBiochemistry = EPTrait(
    name = "Alien Biochemistry",
    traitType = Neutral,
    applicability = Morph,
    descr = "It is an impressive feat that creatures that evolved on separate worlds with different biochemistries are now being transformed into pods by transhuman geneticists. In fact, the biochemistries of these creatures are far less understood than that of transhumans. What this means is that drugs, chemicals, bioware augmentations, and cybernetic implants may have unpredictable effects on the pod. Drug treatments beneficial to transhumans may not function at all, for example, while something that transhumans regularly eat or handle may in fact be toxic to the pod and trigger an anaphylactic response. The gamemaster decides when this factor will play a role, based on the pod biochemistry’s similarity to that of transhumans and numerous other factors. Certain augmentations may simply not be available, having not yet been invented for the alien physiology in question. While efforts have been made to provide these pods with their equivalent of basic biomods, the full protections offered by those enhancements may simply not be available. This means that the pod may or may not be vulnerable to such things as disease, aging, lack of sleep, long-term exposure to microgravity, shock from injuries, allergies, or other biological problems that transhumanity has attempted to eradicate. Likewise, the pod might not be able to heal quickly or regenerate limbs. It is also possible that the pod may be burdened with unusual biological problems inherent to its species, such as bizarre gastrointestinal issues, hacking up hairballs, respiratory distress, or an alien version of leukemia. Gamemasters are encouraged to be inventive. Morphs with alien biochemistry count as exotic and inflict –30 modifiers to Alienation and Integrity Tests (p. 272, EP). This trait is only available to pods created from alien life.",
    cp = 0,
    source = Sources.gatecrashing,
    sourcePage = 153);

  val list: List[EPTrait] = Macros.memberList[EPTrait];
}
