package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object ExoticWeapons {
  import FiringMode._;

  val monowireGarrote = Weapon(
    name = "Monowire Garrote",
    `type` = WeaponType.ExoticMeleeWeapon("Monowire Garrote"),
    descr =
      "This assassin’s weapon fea- tures a dangerous monomolecular wire wrapped around a contained spool with two handles. One handle grips the spool, while the other extends the wire so that it may be used to wrap around targets (typically necks or limbs) and slice through them when pulled. Monofilament tensile strength is weak, however, usually breaking after one use.",
    damage = (3.d10 + 0).kinetic,
    effect = None,
    ap = -8,
    price = Cost.Moderate,
    range = Range.Melee,
    source = Sources.ep
  );

  val vortex = Weapon(
    name = "Vortex Ring Gun",
    `type` = WeaponType.ExoticRangedWeapon("Vortex Ring Gun"),
    descr =
      "This less-lethal two-handed weapon detonates a blank cartridge and accelerates the explosive pressure down a widening barrel so that it develops into a high-speed vortex ring — a spinning, donut-shaped blast vortex. This concussive blast is used to knock down and incapacitate close-range targets. Struck targets suffer a –10 action modifier for the rest of that Action Turn and must must succeed in a SOM × 2 Test or fall down. If their MoF is 30+, they are additionally stunned and unable to act until the end of the next Action Turn. Drugs, chemicals, and similar agents may be loaded into the charge as well.",
    damage = (0.d10 + 0),
    effect = Some("Knockdown/Stun"),
    ap = 0,
    price = Cost.Moderate,
    range = Range.Ranged(5, 15, 30, 50),
    gun = GunExtras(modes = Set(SS), // doesn't bloody say -.-
                    magazineSize = 20), // doesn't bloody say -.-
    source = Sources.ep
  );

  val list: List[Weapon] = Macros.memberList[Weapon];
}
