package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object SoftwareEP {

  val arIllusions = Software(
    name = "AR Illusions",
    descr = "These databases of AR clips can be used to create realistic illusions in someone’s entoptic display. see Augmented Reality Illusions, p. 259.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 331);

  // Just a test to see if the import works
  val oldARIllusions = Software(
    name = "Old AR Illusions",
    descr = "These databases of AR clips can be used to create realistic illusions in someone’s entoptic display. see Augmented Reality Illusions, p. 259.",
    quality = SoftwareQuality.EndOfLife,
    price = Cost.Low,
    source = Sources.ep, sourcePage = 331);

  val list: List[Software] = Macros.memberList[Software];
}
