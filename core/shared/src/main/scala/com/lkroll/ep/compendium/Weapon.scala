package com.lkroll.ep.compendium

import util.{ Try, Success, Failure }
import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

sealed trait DamageType extends EnumEntry with ChatRenderable {
  def label: String = this.entryName;
  override def templateKV: Map[String, String] = Map("Damage Type" -> label);
}
object DamageType extends Enum[DamageType] with UPickleEnum[DamageType] {
  case object Kinetic extends DamageType;
  case object Energy extends DamageType;
  case object Psychic extends DamageType;
  case object Untyped extends DamageType;

  val values = findValues;
}

case class Damage(dmgD10: Int, dmgDiv: Int = 1, dmgConst: Int, dmgType: DamageType = DamageType.Untyped) extends ChatRenderable {
  override def templateKV: Map[String, String] = Map("Damage" -> dmgString) ++
    dmgType.templateKV;
  def dmgString: String = if (dmgDiv == 1) s"${dmgD10}d10+${dmgConst}" else s"${dmgD10}d10÷${dmgDiv}+${dmgConst}";
  def +(extraConst: Int): Damage = this.copy(dmgConst = dmgConst + extraConst);
  def +(extraDice: D10): Damage = this.copy(dmgD10 = dmgD10 + extraDice.num);
  def kinetic: Damage = this.copy(dmgType = DamageType.Kinetic);
  def energy: Damage = this.copy(dmgType = DamageType.Energy);
  def psychic: Damage = this.copy(dmgType = DamageType.Psychic);
  //  def /(extraDiv: Int): Damage = this.copy(dmgDiv = dmgDiv * extraDiv);
  //  def *(factor: Int): Damage = this.copy(dmgDiv = dmgDiv * extraDiv);
}
object Damage {
  implicit def rw: RW[Damage] = macroRW;

  val none = Damage(0, 1, 0);
}

case class Weapon(name: String, `type`: WeaponType, descr: String,
                  damage: Damage, attackBonus: Int = 0,
                  effect: Option[String], ap: Int, area: DamageArea = DamageArea.Point,
                  price: Cost, range: Range, gun: Option[GunExtras] = None, source: String) extends ChatRenderable with Data {

  override def templateTitle: String = name;
  override def templateSubTitle: String = this.`type` match {
    case _: WeaponType.Melee  => "Melee Weapon"
    case _: WeaponType.Ranged => "Ranged Weapon"
    case _: WeaponType.Thrown => "Thrown Weapon"
  };
  override def templateKV: Map[String, String] = this.`type`.templateKV ++
    damage.templateKV ++
    (effect.map(s => Map("Effect" -> s)).getOrElse(Map.empty)) ++
    Map(
      "AP" -> ap.toString,
      "Area" -> area.text,
      "Attack Bonus" -> attackBonus.asMod) ++
      price.templateKV ++
      range.templateKV ++
      (gun.map(g => g.templateKV).getOrElse(Map.empty)) ++
      Map("Source" -> source);
  override def templateDescr: String = descr;

  override def described: DescribedData = DescribedData.WeaponD(this);

  def summaryString: String = effect match {
    case Some(e) => s"$name (${damage.dmgString} DV, AP $ap, $e)"
    case None    => s"$name (${damage.dmgString} DV, AP $ap)"
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
          damage = this.damage + 2,
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

sealed trait DamageArea {
  def text: String;
  def +(i: Int): DamageArea;
  def *(i: Int): DamageArea;
  def /(i: Int): DamageArea;
}
object DamageArea {
  implicit def rw: RW[DamageArea] = RW.merge(
    macroRW[Point.type],
    macroRW[Blast.type],
    macroRW[UniformBlast],
    macroRW[Cone.type]);

  @upickle.key("Point")
  case object Point extends DamageArea {
    override def text: String = "Point of Impact";
    override def +(i: Int): DamageArea = Math.max(0, i) match {
      case 0 => Blast
      case r => UniformBlast(r)
    };
    override def *(i: Int): DamageArea = this;
    override def /(i: Int): DamageArea = this;
  }

  @upickle.key("Blast")
  case object Blast extends DamageArea {
    override def text: String = "Blast";
    override def +(i: Int): DamageArea = Math.max(0, i) match {
      case 0 => Blast
      case r => UniformBlast(r)
    };
    override def *(i: Int): DamageArea = this;
    override def /(i: Int): DamageArea = this;
  }
  @upickle.key("UniformBlast")
  case class UniformBlast(radius: Int) extends DamageArea {
    override def text: String = s"Uniform Blast (r=${radius}m)";
    override def +(i: Int): DamageArea = Math.max(0, radius + i) match {
      case 0 => Blast
      case r => UniformBlast(r)
    };
    override def *(i: Int): DamageArea = (radius * i) match {
      case 0 => Blast
      case r => UniformBlast(r)
    };
    override def /(i: Int): DamageArea = (radius / i) match {
      case 0 => Blast
      case r => UniformBlast(r)
    };
  }
  @upickle.key("Cone")
  case object Cone extends DamageArea {
    override def text: String = "Cone";
    override def +(i: Int): DamageArea = this; // doesn't seem sensible to extend a cone
    override def *(i: Int): DamageArea = this;
    override def /(i: Int): DamageArea = this;
  }
}

case class WeaponAccessory(name: String, descr: String,
                           attackBonus: Int = 0, magazineFactor: Float = 1.0f,
                           price: Cost, source: String, sourcePage: Int) extends Data {
  override def templateTitle: String = name;
  override def templateSubTitle: String = "Weapon Accessory";
  override def templateKV: Map[String, String] = price.templateKV ++
    Map(
      "Attack Bonus" -> s"${attackBonus.asMod}",
      "Magazine" -> s"${magazineFactor.asFactor}",
      "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;

  override def described = DescribedData.WeaponAccessoryD(this);

  def mod(w: Weapon): Weapon = w.copy(
    name = s"${w.name} with ${this.name}",
    descr = s"""${w.descr}
---
${this.descr}""",
    attackBonus = w.attackBonus + this.attackBonus,
    gun = w.gun.map(g => g.copy(magazineSize = (g.magazineSize * magazineFactor).toInt)));
}
object WeaponAccessory {
  implicit def rw: RW[WeaponAccessory] = macroRW;
  val dataType: String = "weaponaccessory";
}
