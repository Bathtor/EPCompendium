package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object TraitsSunward {
  import TraitType.{ Positive, Negative, Neutral };
  import TraitApplicability.{ Ego, Morph, Both };

  val coronal = EPTrait(
    name = "Coronal Adaptation",
    traitType = Positive,
    applicability = Morph,
    descr = "For biomorphs, this radical alteration enables the subject’s metabolism to live off solar energy, using medichines to repair radiation damage. This same metabolism also generates powerful electromagnetic fields that protect the character from the intense temperatures and radiation in the coronal environment and even enable the character to sail the solar winds. Morphs with this adaptation cannot survive outside the coronal environment (or similar environments) for more than a few days without extensive medical support. Coronal adaptation can only be applied to morphs that also have medichines (p. 308, EP). For synthmorphs, this adaptation restructures the morph’s composition with heat-resistant materials capable of surviving superheated plasma and shielded against radiation. The shell is also equipped with refractive metamaterials and a perfectly mirrored surface, giving it an albedo of nearly one. The reflective surface protects the wearer from well over 99% of the radiant energy that falls upon it, but a powerful cooling system and extensive radiation shielding are required for the minuscule percentage of energy that slips through. Generated electromagnetic fields also protect the morph and enable propulsion along solar magnetic lines. This adaptation provides a +10 modifier to the biomorph’s Free Fall skill tests in the presence of strong electromagnetic fields. It also provides 10 points of Energy armor against heat and electromagnetic-based attacks (such as lasers, microwaves, and plasma weapons, but not explosions).",
    cp = 30,
    source = Sources.sunward,
    sourcePage = 164);

  val highTemp = EPTrait(
    name = "High-Temperature Operation",
    traitType = Positive,
    applicability = Morph,
    descr = "This morph has been designed to operate only in high-temperature environments, enabling them to withstand temperatures up to 1,000ºC. This morph loses 1 point of COO for every 5 minutes it spends at temperatures lower than 250ºC, and 1 point of COO for every minute that it spends below 150ºC. When its COO equals zero the morph becomes completely immobile. This same penalty is applied to all COO-based skill rolls. The morph’s cyberbrain and mesh access still work in these circumstances, but the morph cannot physically move under its own power. Even if placed back in higher temperatures, if it was previously reduced to total immobility, the morph halves its COO and SOM (round down) until it has been serviced. This trait may only be applied to synthmorphs. It provides 5 points of Energy armor against heat-based attacks (such as lasers, microwaves, and plasma weapons, but not explosions).",
    cp = 10,
    source = Sources.sunward,
    sourcePage = 165);

  val fastMetabolism = EPTrait(
    name = "Fast Metabolism",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph’s metabolism runs hot, requiring the character to eat two to three times as much food as a normal character with similar body mass. Food tends to be plentiful and cheap in most transhuman settlements, but this trait can pose a problem in remote areas or when visiting settlements with limited resources. The character must plan ahead and pack enough food on expeditions. If the character is eating off their rep, they must expend two trivial favors each day for the additional food they require. If the character is unable to obtain enough food, they lose SOM at the rate of one point per day until they resume their usual caloric intake. This trait is only available for biomorphs (including uplifts and pods).",
    cp = 5,
    source = Sources.sunward,
    sourcePage = 165);

  val obsolescence = EPTrait(
    name = "Planned Obsolescence",
    traitType = Negative,
    applicability = Morph,
    descr = "The morph is a hypercorp model that requires periodic GSP (Genetic Service Pack) therapy. For every three months of game time, the character must spend credits equal to 10% the cost of the morph on GSP “upgrades.” If they fail to do so, the morph’s SOM is reduced by 5 until the character gets their GSP therapy. These penalties are cumulative over time (at 6 months, 9 months, etc.), but getting GSP therapy once removes all penalties. The character suffers no SOM loss if the majority of a given 3 month period was spent in hibernation, in a healing vat, or in some other form of metabolic suspension. The SOM reduction is due to low level neural degradation, minor tumors, joint pain, and other problems that crop up and express later as hypercorp genetic designers working on tight budgets and tighter deadlines race to release morph models with extra value-added features. While theoretically over many years this trait would lead to the early death of the morph, in game terms the morph stops accruing penalties when its SOM is reduced to 5. The character regains their normal SOM score if they resleeve. This trait is only available to biomorphs (including uplifts and pods).",
    cp = 5,
    source = Sources.sunward,
    sourcePage = 165);

  val list: List[EPTrait] = Macros.memberList[EPTrait];

}
