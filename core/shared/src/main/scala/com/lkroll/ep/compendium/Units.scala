package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

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
  implicit def rw: RW[Time] = RW.merge(
    macroRW[SpecialTime],
    macroRW[TimeNum])

  @upickle.key("SpecialTime")
  final case class SpecialTime(s: String) extends Time {
    override def renderShort: String = s;
    override def renderLong: String = s;
  }
  @upickle.key("TimeNum")
  final case class TimeNum(scalar: Int, unit: TimeUnit) extends Time {
    override def renderShort: String = s"$scalar${unit.symbol}";
    override def renderLong: String = if (scalar == 1) {
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
