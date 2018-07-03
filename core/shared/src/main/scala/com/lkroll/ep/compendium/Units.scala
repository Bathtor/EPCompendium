package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

trait Units {
  import TimeUnit._;

  implicit class UnitInt(val i: Int) {
    def sec: Time = Time(i, Seconds);
    def turns: Time = Time(i, ActionTurns);
    def mins: Time = Time(i, Minutes);
    def hours: Time = Time(i, Hours);
    def days: Time = Time(i, Days);
  }
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

case class Time(scalar: Int, unit: TimeUnit) {
  def renderShort: String = s"$scalar${unit.symbol}";
  def renderLong: String = if (scalar == 1) {
    s"$scalar ${unit.nameSg}"
  } else {
    s"$scalar ${unit.namePl}"
  };
}
object Time {
  implicit def rw: RW[Time] = macroRW;
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
