package com.lkroll.ep.compendium

import util.{ Try, Success, Failure }
import upickle.default.{ ReadWriter => RW, macroRW }

sealed trait WeaponType {
  def skill: String;
}
object WeaponType {

  implicit def rw: RW[WeaponType] = RW.merge(Ranged.rw, Melee.rw);

  sealed trait Melee extends WeaponType;
  object Melee {
    implicit def rw: RW[Melee] = RW.merge(
      macroRW[Blades.type],
      macroRW[Clubs.type],
      macroRW[Unarmed.type],
      macroRW[ExoticMeleeWeapon]);
  }

  @upickle.key("Blades")
  case object Blades extends Melee {
    override def skill: String = "Blades";
  }
  @upickle.key("Clubs")
  case object Clubs extends Melee {
    override def skill: String = "Clubs";
  }
  @upickle.key("ExoticMeleeWeapon")
  case class ExoticMeleeWeapon(weapon: String) extends Melee {
    override def skill: String = s"Exotic Melee Weapons (${weapon})";
  }
  //  object ExoticMeleeWeapon {
  //    implicit def rw: RW[ExoticMeleeWeapon] = macroRW;
  //  }
  @upickle.key("Unarmed")
  case object Unarmed extends Melee {
    override def skill: String = "Unarmed";
  }

  sealed trait Ranged extends WeaponType;
  object Ranged {
    implicit def rw: RW[Ranged] = RW.merge(
      macroRW[Kinetic.type],
      macroRW[Railgun.type],
      macroRW[Beam.type],
      macroRW[Seeker.type],
      macroRW[Grenades.type],
      macroRW[Spray.type],
      macroRW[ExoticRangedWeapon]);
  }

  @upickle.key("Kinetic")
  case object Kinetic extends Ranged {
    override def skill: String = "Kinetic Weapons";
  }
  @upickle.key("Railgun")
  case object Railgun extends Ranged {
    override def skill: String = "Kinetic Weapons";
  }
  @upickle.key("Beam")
  case object Beam extends Ranged {
    override def skill: String = "Beam Weapons";
  }
  @upickle.key("Seeker")
  case object Seeker extends Ranged {
    override def skill: String = "Seeker Weapons";
  }
  @upickle.key("Grenades")
  case object Grenades extends Ranged {
    override def skill: String = "Throwing Weapons";
  }
  @upickle.key("Spray")
  case object Spray extends Ranged {
    override def skill: String = "Spray Weapons";
  }
  @upickle.key("ExoticRangedWeapon")
  case class ExoticRangedWeapon(weapon: String) extends Ranged {
    override def skill: String = s"Exotic Ranged Weapons (${weapon})";
  }
  //  object ExoticRangedWeapon {
  //    implicit def rw: RW[ExoticRangedWeapon] = macroRW;
  //  }
}

sealed trait DamageType {
  def label: String;
}
object DamageType {
  implicit def rw: RW[DamageType] = RW.merge(
    macroRW[Kinetic.type],
    macroRW[Energy.type]);

  @upickle.key("Kinetic")
  case object Kinetic extends DamageType {
    override def label: String = "Kinetic";
  }
  @upickle.key("Energy")
  case object Energy extends DamageType {
    override def label: String = "Energy";
  }
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

case class Weapon(name: String, `type`: WeaponType, descr: String,
                  dmgD10: Int, dmgConst: Int, dmgType: DamageType, effect: Option[String], ap: Int,
                  price: Cost, range: Range, gun: Option[GunExtras] = None) {

  def load(ammo: Ammo): Try[WeaponWithAmmo] = {
    Try {
      assert(ammo.appliesTo(`type`), "Ammo does not work with this weapon!");
      WeaponWithAmmo(this, ammo)
    }
  }

}
object Weapon {
  implicit def rw: RW[Weapon] = macroRW;
  val dataType: String = "weapon";
}

case class GunExtras(modes: FiringModes, magazineSize: Int)
object GunExtras {
  implicit def rw: RW[GunExtras] = macroRW;
}

case class FiringModes(singleShot: Boolean, semiAutomatic: Boolean, burstFire: Boolean, fullAutomatic: Boolean)
object FiringModes {
  import FiringMode._;

  implicit def rw: RW[FiringModes] = macroRW;

  def fromSet(modes: FiringMode*): FiringModes = {
    FiringModes(modes.contains(SS), modes.contains(SA), modes.contains(BF), modes.contains(FA))
  }
}

object FiringMode extends Enumeration {
  type FiringMode = Value;

  val SS, SA, BF, FA = Value;
}

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
