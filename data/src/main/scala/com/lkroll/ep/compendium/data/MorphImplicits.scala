package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object MorphImplicits {

  implicit def int2aptv(i: Int): AptitudeValues = AptitudeValues.max(i);
  implicit def int2opt(i: Int): Option[Int] = Some(i);
  implicit def tuple2toopt(t: (Int, Int)): Option[(Int, Int)] = Some(t);
  implicit def str2opt(s: String): Option[String] = Some(s);
}
