package com.lkroll.ep.compendium

package object data {
  implicit def ge2Opt(ge: GunExtras): Option[GunExtras] = Some(ge);
  implicit def set2FMs(s: Set[FiringMode.FiringMode]): FiringModes = FiringModes.fromSet(s.toSeq: _*);
}
