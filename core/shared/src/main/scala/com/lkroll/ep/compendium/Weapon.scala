package com.lkroll.ep.compendium

import util.{ Try, Success, Failure }
import utils.OptionPickler.{ ReadWriter => RW, macroRW }

sealed trait DamageType extends ChatRenderable {
  def label: String;
  override def templateKV: Map[String, String] = Map("Damage Type" -> label);
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

case class Weapon(name: String, `type`: WeaponType, descr: String,
                  dmgD10: Int, dmgDiv: Int = 1, dmgConst: Int, dmgType: DamageType, effect: Option[String], ap: Int,
                  price: Cost, range: Range, gun: Option[GunExtras] = None, source: String) extends ChatRenderable {

  override def templateTitle: String = name;
  override def templateSubTitle: String = this.`type` match {
    case _: WeaponType.Melee  => "Melee Weapon"
    case _: WeaponType.Ranged => "Ranged Weapon"
    case _: WeaponType.Thrown => "Thrown Weapon"
  };
  override def templateKV: Map[String, String] = this.`type`.templateKV ++
    Map("Damage" -> (if (dmgDiv == 1) s"${dmgD10}d10+${dmgConst}" else s"${dmgD10}d10%${dmgDiv}+${dmgConst}")) ++
    dmgType.templateKV ++
    (effect.map(s => Map("Effect" -> s)).getOrElse(Map.empty)) ++
    Map("AP" -> ap.toString) ++
    price.templateKV ++
    range.templateKV ++
    (gun.map(g => g.templateKV).getOrElse(Map.empty)) ++
    Map("Source" -> source);
  override def templateDescr: String = descr;

  def summaryString: String = effect match {
    case Some(e) => s"$name (${dmgD10}d10 + $dmgConst DV, AP $ap, $e)"
    case None    => s"$name (${dmgD10}d10 + $dmgConst DV, AP $ap)"
  }

  def load(ammo: Ammo): Try[WeaponWithAmmo] = {
    Try {
      assert(ammo.appliesTo(`type`), "Ammo does not work with this weapon!");
      WeaponWithAmmo(this, ammo)
    }
  }

  def toRailgun: Weapon = {
    this.`type` match {
      case WeaponType.Kinetic => {
        Weapon(
          name = s"${this.name} (Railgun)",
          `type` = WeaponType.Railgun,
          descr = this.descr,
          dmgD10 = this.dmgD10,
          dmgConst = this.dmgConst + 2,
          dmgType = DamageType.Kinetic,
          effect = this.effect,
          ap = this.ap - 3,
          price = this.price.increment,
          range = this.range match {
            case r: Range.Ranged => r * 1.5
            case _               => ???
          },
          gun = this.gun,
          source = this.source)
      }
      case _ => throw new RuntimeException("Only kinetic firearms can be railguns")
    }

  }

}
object Weapon {
  implicit def rw: RW[Weapon] = macroRW;
  val dataType: String = "weapon";
}

case class GunExtras(modes: FiringModes, magazineSize: Int) extends ChatRenderable {
  override def templateKV: Map[String, String] = modes.templateKV ++ Map("Magazine Size" -> magazineSize.toString);
}
object GunExtras {
  implicit def rw: RW[GunExtras] = macroRW;
}

case class FiringModes(singleShot: Boolean, semiAutomatic: Boolean, burstFire: Boolean, fullAutomatic: Boolean) extends ChatRenderable {
  lazy val mkString: String =
    ((if (singleShot) "SS " else "") ++
      (if (semiAutomatic) "SA " else "") ++
      (if (burstFire) "BF " else "") ++
      (if (fullAutomatic) "FA " else "")).trim();
  override def templateKV: Map[String, String] = Map("Firing Modes" -> mkString);
}
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
