package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object MorphExamples {
  import MorphImplicits._

  val combatBlackbird = {
    val m = MorphInstance.fromModel(MorphsAC.blackbird, "Combat Blackbird");
    m.copy(
      location = "Chat Noir",
      enhancements = m.enhancements ++ List("Hand Laser", "Hardened Skeleton", "Light Combat Armour"),
      traits = List.empty, // this variant isn't small size
      aptitudeBonus = m.aptitudeBonus.copy(som = 5),
      attacks = m.attacks ++ List(MorphAttacks.beakLaser),
      durability = 30,
      armour = (16, 14))
  };

  val list: List[MorphInstance] = Macros.memberList[MorphInstance];
}
