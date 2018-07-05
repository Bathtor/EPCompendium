package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object ArmourMods {

  val chameleonCoating = ArmourMod(
    name = "Chameleon Coating",
    descr = "This provides the armor with the same effect as the chameleon cloak (p. 315).",
    price = Cost.Trivial,
    source = Sources.ep, sourcePage = 313);

  val list: List[ArmourMod] = Macros.memberList[ArmourMod];
}
