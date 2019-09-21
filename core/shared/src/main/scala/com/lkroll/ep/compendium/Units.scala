package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}

trait Units {
  import TimeUnit._;
  import Time._;

  implicit class UnitInt(val i: Int) {
    def sec: Time = TimeNum(i, Seconds);
    def turns: Time = TimeNum(i, ActionTurns);
    def mins: Time = TimeNum(i, Minutes);
    def hours: Time = TimeNum(i, Hours);
    def days: Time = TimeNum(i, Days);
  }
  implicit def str2time(s: String): Time = SpecialTime(s);
}

object Units extends Units;

trait AnyUnit {
  def symbol: String;
  def namePl: String;
  def nameSg: String;
}

case class D10(num: Int) {
  def +(constDmg: Int): Damage = Damage(num, 1, constDmg);
  def +(extraDice: D10): D10 = D10(num + extraDice.num);
  def /(dmgDiv: Int): Damage = Damage(num, dmgDiv, 0);
}

sealed trait Time {
  def renderShort: String;
  def renderLong: String;
}

object Time {
  implicit def rw: RW[Time] = RW.merge(macroRW[SpecialTime], macroRW[TimeNum])

  @upickle.implicits.key("SpecialTime")
  final case class SpecialTime(s: String) extends Time {
    override def renderShort: String = s;
    override def renderLong: String = s;
  }
  @upickle.implicits.key("TimeNum")
  final case class TimeNum(scalar: Int, unit: TimeUnit) extends Time {
    override def renderShort: String = s"$scalar${unit.symbol}";
    override def renderLong: String =
      if (scalar == 1) {
        s"$scalar ${unit.nameSg}"
      } else {
        s"$scalar ${unit.namePl}"
      };
  }
}
sealed trait TimeUnit extends EnumEntry with AnyUnit;

object TimeUnit extends Enum[TimeUnit] with UPickleEnum[TimeUnit] {

  case object Seconds extends TimeUnit {
    override def symbol: String = "s";
    override def namePl: String = "seconds";
    override def nameSg: String = "second";
  }

  case object ActionTurns extends TimeUnit {
    override def symbol: String = "AT";
    override def namePl: String = "Action Turns";
    override def nameSg: String = "Action Turn";
  }

  case object Minutes extends TimeUnit {
    override def symbol: String = "min";
    override def namePl: String = "minutes";
    override def nameSg: String = "minute";
  }

  case object Hours extends TimeUnit {
    override def symbol: String = "h";
    override def namePl: String = "hours";
    override def nameSg: String = "hour";
  }

  case object Days extends TimeUnit {
    override def symbol: String = "d";
    override def namePl: String = "days";
    override def nameSg: String = "day";
  }
  val values = findValues;
}

sealed trait Distance {
  def renderShort: String;
  def renderLong: String;
  def renderNormalised: String;
}
object Distance {

  implicit def rw: RW[Distance] = RW.merge(macroRW[DistanceNum])

  @upickle.implicits.key("DistanceNum")
  final case class DistanceNum(scalar: Long, unit: DistanceUnit) extends Distance {
    override def renderShort: String = s"$scalar${unit.symbol}";
    override def renderLong: String =
      if (scalar == 1) {
        f"$scalar%,d ${unit.nameSg}"
      } else {
        f"$scalar%,d ${unit.namePl}"
      };
    def renderNormalised: String = {
      var curnum = this;
      while (curnum.scalar > 1000L) {
        curnum.unit.increment((curnum)) match {
          case Some(newnum) => curnum = newnum
          case None         => return curnum.renderShort
        }
      }
      curnum.renderShort
    }
  }

}
sealed trait DistanceUnit extends EnumEntry with AnyUnit {
  import Distance._;

  def increment(num: DistanceNum): Option[DistanceNum];
  def decrement(num: DistanceNum): Option[DistanceNum];
}

object DistanceUnit extends Enum[DistanceUnit] with UPickleEnum[DistanceUnit] {
  import Distance._;

  case object Millimeters extends DistanceUnit {
    override def symbol: String = "mm";
    override def namePl: String = "millimeters";
    override def nameSg: String = "millimeter";
    def increment(num: DistanceNum): Option[DistanceNum] = {
      if (num.scalar > 1000L) {
        Some(DistanceNum(num.scalar / 1000, Meters))
      } else {
        None
      }
    }
    def decrement(num: DistanceNum): Option[DistanceNum] = {
      None // not implemented
    }
  }

  case object Meters extends DistanceUnit {
    override def symbol: String = "m";
    override def namePl: String = "meters";
    override def nameSg: String = "meter";
    def increment(num: DistanceNum): Option[DistanceNum] = {
      if (num.scalar > 1000L) {
        Some(DistanceNum(num.scalar / 1000L, Kilometers))
      } else {
        None
      }
    }
    def decrement(num: DistanceNum): Option[DistanceNum] = {
      Some(DistanceNum(num.scalar * 1000L, Millimeters))
    }
  }

  case object Kilometers extends DistanceUnit {
    override def symbol: String = "km";
    override def namePl: String = "kilometers";
    override def nameSg: String = "kilometer";
    def increment(num: DistanceNum): Option[DistanceNum] = {
      None // not implemented
    }
    def decrement(num: DistanceNum): Option[DistanceNum] = {
      Some(DistanceNum(num.scalar * 1000L, Meters))
    }
  }

  val values = findValues;
}
