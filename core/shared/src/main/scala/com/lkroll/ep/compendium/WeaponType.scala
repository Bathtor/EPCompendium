package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

sealed trait WeaponType extends ChatRenderable {
  def skill: String;
  def label: String;
  override def templateKV: Map[String, String] = Map("Weapon Type" -> label, "Skill" -> skill);
}
object WeaponType {

  implicit def rw: RW[WeaponType] = RW.merge(Ranged.rw, Melee.rw, Thrown.rw);

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
    override def label: String = "Blades";
  }
  @upickle.key("Clubs")
  case object Clubs extends Melee {
    override def skill: String = "Clubs";
    override def label: String = "Clubs";
  }
  @upickle.key("ExoticMeleeWeapon")
  case class ExoticMeleeWeapon(weapon: String) extends Melee {
    override def skill: String = s"Exotic Melee Weapons (${weapon})";
    override def label: String = s"Exotic Melee Weapons";
  }
  //  object ExoticMeleeWeapon {
  //    implicit def rw: RW[ExoticMeleeWeapon] = macroRW;
  //  }
  @upickle.key("Unarmed")
  case object Unarmed extends Melee {
    override def skill: String = "Unarmed Combat";
    override def label: String = "Unarmed";
  }

  sealed trait Ranged extends WeaponType;
  object Ranged {
    implicit def rw: RW[Ranged] = RW.merge(
      macroRW[Kinetic.type],
      macroRW[Railgun.type],
      macroRW[Beam.type],
      macroRW[Seeker.type],
      macroRW[Spray.type],
      macroRW[ExoticRangedWeapon]);
  }

  @upickle.key("Kinetic")
  case object Kinetic extends Ranged {
    override def skill: String = "Kinetic Weapons";
    override def label: String = "Firearms";
  }
  @upickle.key("Railgun")
  case object Railgun extends Ranged {
    override def skill: String = "Kinetic Weapons";
    override def label: String = "Railguns";
  }
  @upickle.key("Beam")
  case object Beam extends Ranged {
    override def skill: String = "Beam Weapons";
    override def label: String = "Beam Weapons";
  }
  @upickle.key("Seeker")
  case object Seeker extends Ranged {
    override def skill: String = "Seeker Weapons";
    override def label: String = "Seekers";
  }

  @upickle.key("Spray")
  case object Spray extends Ranged {
    override def skill: String = "Spray Weapons";
    override def label: String = "Spray Weapons";
  }
  @upickle.key("ExoticRangedWeapon")
  case class ExoticRangedWeapon(weapon: String) extends Ranged {
    override def skill: String = s"Exotic Ranged Weapons (${weapon})";
    override def label: String = "Exotic Ranged Weapons";
  }

  sealed trait Thrown extends WeaponType;
  object Thrown {
    implicit def rw: RW[Thrown] = RW.merge(
      macroRW[Grenades.type]);
  }

  @upickle.key("Grenades")
  case object Grenades extends Thrown {
    override def skill: String = "Throwing Weapons";
    override def label: String = "Grenades";
  }
  //  object ExoticRangedWeapon {
  //    implicit def rw: RW[ExoticRangedWeapon] = macroRW;
  //  }
}
