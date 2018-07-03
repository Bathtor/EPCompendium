package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object SubstanceImplicits {
  implicit def tuple2toopt(t: (AddictionType, Int)): Option[Addiction] = Some(Addiction(t._1, t._2));
}
