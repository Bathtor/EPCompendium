package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}

sealed trait WeaponType extends ChatRenderable {
  def skill: String;
  def label: String;
  override def templateKV: Map[String, String] = Map("Weapon Type" -> label, "Skill" -> skill);
}
object WeaponType {

  implicit def rw: RW[WeaponType] = RW.merge(Ranged.rw, Melee.rw, Thrown.rw);

  sealed trait Melee extends WeaponType;
  object Melee {
    implicit def rw: RW[Melee] =
      RW.merge(macroRW[Blades.type], macroRW[Clubs.type], macroRW[Unarmed.type], macroRW[ExoticMeleeWeapon]);
  }

  @upickle.implicits.key("Blades")
  case object Blades extends Melee {
    override def skill: String = "Blades";
    override def label: String = "Blades";
  }
  @upickle.implicits.key("Clubs")
  case object Clubs extends Melee {
    override def skill: String = "Clubs";
    override def label: String = "Clubs";
  }
  @upickle.implicits.key("ExoticMeleeWeapon")
  case class ExoticMeleeWeapon(weapon: String) extends Melee {
    override def skill: String = s"Exotic Melee Weapons (${weapon})";
    override def label: String = s"Exotic Melee Weapons";
  }
  //  object ExoticMeleeWeapon {
  //    implicit def rw: RW[ExoticMeleeWeapon] = macroRW;
  //  }
  @upickle.implicits.key("Unarmed")
  case object Unarmed extends Melee {
    override def skill: String = "Unarmed Combat";
    override def label: String = "Unarmed";
  }

  sealed trait Ranged extends WeaponType;
  object Ranged {
    implicit def rw: RW[Ranged] =
      RW.merge(macroRW[Kinetic.type],
               macroRW[Railgun.type],
               macroRW[Beam.type],
               macroRW[Seeker],
               macroRW[Spray.type],
               macroRW[ExoticRangedWeapon]);
  }

  @upickle.implicits.key("Kinetic")
  case object Kinetic extends Ranged {
    override def skill: String = "Kinetic Weapons";
    override def label: String = "Firearms";
  }
  @upickle.implicits.key("Railgun")
  case object Railgun extends Ranged {
    override def skill: String = "Kinetic Weapons";
    override def label: String = "Railguns";
  }
  @upickle.implicits.key("Beam")
  case object Beam extends Ranged {
    override def skill: String = "Beam Weapons";
    override def label: String = "Beam Weapons";
  }
  @upickle.implicits.key("Seeker")
  case class Seeker(size: MissileSize) extends Ranged {
    override def skill: String = "Seeker Weapons";
    override def label: String = s"Seekers (${size.label})";
  }

  @upickle.implicits.key("Spray")
  case object Spray extends Ranged {
    override def skill: String = "Spray Weapons";
    override def label: String = "Spray Weapons";
  }
  @upickle.implicits.key("ExoticRangedWeapon")
  case class ExoticRangedWeapon(weapon: String) extends Ranged {
    override def skill: String = s"Exotic Ranged Weapons (${weapon})";
    override def label: String = "Exotic Ranged Weapons";
  }

  sealed trait Thrown extends WeaponType;
  object Thrown {
    implicit def rw: RW[Thrown] = RW.merge(Grenade.rw);
  }
  sealed trait Grenade extends Thrown {
    def adjust(dmgMod: DamageMod): DamageMod;
    def adjust(areaMod: DamageAreaMod): DamageAreaMod;
    def range: Range;
  }
  object Grenade {
    implicit def rw: RW[Grenade] = RW.merge(macroRW[StandardGrenade.type], macroRW[Microgrenade.type]);
  }

  @upickle.implicits.key("StandardGrenade")
  case object StandardGrenade extends Grenade {
    override def skill: String = "Throwing Weapons";
    override def label: String = "Standard Grenade";
    override def adjust(dmgMod: DamageMod): DamageMod = dmgMod;
    override def adjust(areaMod: DamageAreaMod): DamageAreaMod = areaMod;
    override def range: Range = Range.ThrownGrenades;
  }
  @upickle.implicits.key("Microgrenade")
  case object Microgrenade extends Grenade {
    override def skill: String = "Throwing Weapons";
    override def label: String = "Microgrenade";
    override def adjust(dmgMod: DamageMod): DamageMod = dmgMod ++ DamageMod.Const(-1, 0);
    override def adjust(areaMod: DamageAreaMod): DamageAreaMod = areaMod match {
      case DamageAreaMod.Replace(area) => DamageAreaMod.Replace(area / 2)
      case DamageAreaMod.MultRadius(r) => DamageAreaMod.MultRadius(r / 2) // eh fractions
      case DamageAreaMod.DivRadius(r)  => DamageAreaMod.DivRadius(2 * r)
      case DamageAreaMod.AddRadius(r)  => DamageAreaMod.Replace(DamageArea.UniformBlast(r / 2)) // eh whatever
      case DamageAreaMod.Id            => DamageAreaMod.DivRadius(2)
    };
    override def range: Range = Range.ThrownMinigrenades;
  }
}

sealed trait MissileSize extends EnumEntry {
  def label: String;
  def adjust(dmgMod: DamageMod): DamageMod;
  def adjust(areaMod: DamageAreaMod): DamageAreaMod;
}
object MissileSize extends Enum[MissileSize] with UPickleEnum[MissileSize] {
  case object StandardMissile extends MissileSize {
    override def label: String = "Standard Missile";
    override def adjust(dmgMod: DamageMod): DamageMod = dmgMod ++ DamageMod.Double;
    override def adjust(areaMod: DamageAreaMod): DamageAreaMod = areaMod match {
      case DamageAreaMod.Replace(area) => DamageAreaMod.Replace(area * 2)
      case DamageAreaMod.MultRadius(r) => DamageAreaMod.MultRadius(r * 2)
      case DamageAreaMod.DivRadius(r)  => DamageAreaMod.MultRadius(2 / r) // eh fractions
      case DamageAreaMod.AddRadius(r)  => DamageAreaMod.Replace(DamageArea.UniformBlast(r * 2)) // eh whatever
      case DamageAreaMod.Id            => DamageAreaMod.MultRadius(2)
    };
  }

  case object Minimissile extends MissileSize {
    override def label: String = "Minimissile";
    override def adjust(dmgMod: DamageMod): DamageMod = dmgMod;
    override def adjust(areaMod: DamageAreaMod): DamageAreaMod = areaMod;
  }

  case object Micromissile extends MissileSize {
    override def label: String = "Micromissile";
    override def adjust(dmgMod: DamageMod): DamageMod = dmgMod ++ DamageMod.Const(-1, 0);
    override def adjust(areaMod: DamageAreaMod): DamageAreaMod = areaMod match {
      case DamageAreaMod.Replace(area) => DamageAreaMod.Replace(area / 2)
      case DamageAreaMod.MultRadius(r) => DamageAreaMod.MultRadius(r / 2) // eh fractions
      case DamageAreaMod.DivRadius(r)  => DamageAreaMod.DivRadius(2 * r)
      case DamageAreaMod.AddRadius(r)  => DamageAreaMod.Replace(DamageArea.UniformBlast(r / 2)) // eh whatever
      case DamageAreaMod.Id            => DamageAreaMod.DivRadius(2)
    };
  }

  val values = findValues;
}
