package com.lkroll.ep.compendium

case class Ammo(name: String, descr: String, appliesTo: List[WeaponType],
                apMod: APMods.APMod, dmgMod: DamageMods.DamageMod, price: Cost) {
  def appliesTo(t: WeaponType): Boolean = appliesTo.contains(t);
}

case class WeaponWithAmmo(weapon: Weapon, ammo: Ammo) {
  def name: String = s"${weapon.name}≣${ammo.name}";
  def descr: String = weapon.descr + "\n---\n" + ammo.descr;
  def dmgD10: Int = ammo.dmgMod.modifyD10(weapon.dmgD10);
  def dmgConst: Int = ammo.dmgMod.modifyConst(weapon.dmgConst);
  def effect: Option[String] = ammo.dmgMod.modifyEffect(weapon.effect);
  def ap: Int = ammo.apMod.modifyAP(weapon.ap);
}

object APMods {
  sealed trait APMod {
    def modifyAP(ap: Int): Int;
  }

  case object Id extends APMod {
    override def modifyAP(ap: Int): Int = ap;
  }
  case class Const(apMod: Int) extends APMod {
    override def modifyAP(ap: Int): Int = ap + apMod;
  }
}

object DamageMods {
  sealed trait DamageMod {
    def modifyD10(dmg: Int): Int;
    def modifyConst(dmg: Int): Int;
    def modifyEffect(effect: Option[String]): Option[String];
    def ++(mod: DamageMod): Chain = mod match {
      case Chain(mods) => Chain(this :: mods)
      case _           => Chain(List(this, mod))
    }
  }
  case object NoDamage extends DamageMod {
    override def modifyD10(dmg: Int): Int = 0;
    override def modifyConst(dmg: Int): Int = 0;
    override def modifyEffect(effect: Option[String]): Option[String] = effect;
  }
  case object Id extends DamageMod {
    override def modifyD10(dmg: Int): Int = dmg;
    override def modifyConst(dmg: Int): Int = dmg;
    override def modifyEffect(effect: Option[String]): Option[String] = effect;
  }
  case object Half extends DamageMod {
    override def modifyD10(dmg: Int): Int = ceilDiv(dmg, 2);
    override def modifyConst(dmg: Int): Int = ceilDiv(dmg, 2);
    override def modifyEffect(effect: Option[String]): Option[String] = effect;
  }
  case class Const(d10Dmg: Int, constDmg: Int) extends DamageMod {
    override def modifyD10(dmg: Int): Int = dmg + d10Dmg;
    override def modifyConst(dmg: Int): Int = dmg + constDmg;
    override def modifyEffect(effect: Option[String]): Option[String] = effect;
  }
  case class Effect(addEffect: String) extends DamageMod {
    override def modifyD10(dmg: Int): Int = dmg;
    override def modifyConst(dmg: Int): Int = dmg;
    override def modifyEffect(effect: Option[String]): Option[String] = effect match {
      case Some(s) => Some(s + " + " + addEffect)
      case None    => Some(addEffect)
    }
  }
  val shock = Effect("shock");
  case class Chain(mods: List[DamageMod]) extends DamageMod {
    override def modifyD10(dmg: Int): Int = mods.foldLeft(dmg)((acc, mod) => mod.modifyD10(acc));
    override def modifyConst(dmg: Int): Int = mods.foldLeft(dmg)((acc, mod) => mod.modifyConst(acc));
    override def modifyEffect(effect: Option[String]): Option[String] =
      mods.foldLeft(effect)((acc, mod) => mod.modifyEffect(acc));
    override def ++(mod: DamageMod): Chain = mod match {
      case Chain(mods) => Chain(this.mods ++ mods)
      case _           => Chain(this.mods ++ List(mod))
    }
  }
}
