package com.lkroll.ep.compendium

import upickle.default.{ ReadWriter => RW, macroRW }

sealed trait Range;
object Range {

  implicit def rw: RW[Range] = RW.merge(
    macroRW[Melee.type],
    Thrown.rw,
    Ranged.rw);

  import Math.ceil;
  @upickle.key("Melee")
  case object Melee extends Range;
  @upickle.key("Ranged")
  case class Ranged(shortUpper: Int, mediumUpper: Int, longUpper: Int, extremeUpper: Int) extends Range;
  object Ranged {
    implicit def rw: RW[Ranged] = macroRW;
  }
  sealed trait Thrown extends Range {
    def shortUpper(som: Int): Int;
    def mediumUpper(som: Int): Int;
    def longUpper(som: Int): Int;
    def extremeUpperUpper(som: Int): Int;
  }
  object Thrown {
    implicit def rw: RW[Thrown] = RW.merge(
      macroRW[ThrownBlades.type],
      macroRW[ThrownMinigrenades.type],
      macroRW[ThrownGrenades.type]);
  }
  @upickle.key("ThrownBlades")
  case object ThrownBlades extends Thrown {
    override def shortUpper(som: Int): Int = ceilDiv(som, 5);
    override def mediumUpper(som: Int): Int = ceilDiv(som, 2);
    override def longUpper(som: Int): Int = som;
    override def extremeUpperUpper(som: Int): Int = som * 2;
  }
  @upickle.key("ThrownMinigrenades")
  case object ThrownMinigrenades extends Thrown {
    override def shortUpper(som: Int): Int = ceilDiv(som, 2);
    override def mediumUpper(som: Int): Int = som;
    override def longUpper(som: Int): Int = som * 2;
    override def extremeUpperUpper(som: Int): Int = som * 3;
  }
  @upickle.key("ThrownGrenades")
  case object ThrownGrenades extends Thrown {
    override def shortUpper(som: Int): Int = ceilDiv(som, 5);
    override def mediumUpper(som: Int): Int = ceilDiv(som, 2);
    override def longUpper(som: Int): Int = som;
    override def extremeUpperUpper(som: Int): Int = som * 3;
  }
}
