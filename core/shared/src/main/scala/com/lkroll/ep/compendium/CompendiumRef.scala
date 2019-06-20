package com.lkroll.ep.compendium

import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}

case class CompendiumRef(dataType: String, name: String) {}
object CompendiumRef {
  implicit def rw: RW[CompendiumRef] = macroRW;
}

object CompendiumRefImplicits {
  implicit def weapon2ref(w: Weapon): CompendiumRef = CompendiumRef(Weapon.dataType, w.name);
  implicit def substance2ref(s: Substance): CompendiumRef = CompendiumRef(Substance.dataType, s.name);
  implicit def software2ref(s: Software): CompendiumRef = CompendiumRef(Software.dataType, s.name);
  implicit def trait2ref(t: EPTrait): CompendiumRef = CompendiumRef(EPTrait.dataType, t.name);
}
