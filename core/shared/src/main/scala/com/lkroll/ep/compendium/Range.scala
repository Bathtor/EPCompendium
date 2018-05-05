package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }
import scalatags.Text.all._

sealed trait Range extends ChatRenderable {
}
object Range {

  implicit def rw: RW[Range] = RW.merge(
    macroRW[Melee.type],
    Thrown.rw,
    Ranged.rw);

  import Math.ceil;
  @upickle.key("Melee")
  case object Melee extends Range {
    override def templateKV: Map[String, String] = Map("Range" -> "Melee");
  }
  @upickle.key("Ranged")
  case class Ranged(shortUpper: Int, mediumUpper: Int, longUpper: Int, extremeUpper: Int) extends Range {
    override def templateKV: Map[String, String] = Map(
      "Range 1-Short" -> s"2-${shortUpper}m",
      "Range 2-Medium" -> s"${shortUpper + 1}-${mediumUpper}m",
      "Range 3-Long" -> s"${mediumUpper + 1}-${longUpper}m",
      "Range 4-Extreme" -> s"${longUpper + 1}-${extremeUpper}m");

    def *(d: Double): Ranged = Ranged(
      shortUpper = Math.round(this.shortUpper.toDouble * d).toInt,
      mediumUpper = Math.round(this.mediumUpper.toDouble * d).toInt,
      longUpper = Math.round(this.longUpper.toDouble * d).toInt,
      extremeUpper = Math.round(this.extremeUpper.toDouble * d).toInt);
    def *(i: Int): Ranged = Ranged(
      shortUpper = this.shortUpper * i,
      mediumUpper = this.mediumUpper * i,
      longUpper = this.longUpper * i,
      extremeUpper = this.extremeUpper * i);
    def +(i: Int): Ranged = Ranged(
      shortUpper = this.shortUpper + i,
      mediumUpper = this.mediumUpper + i,
      longUpper = this.longUpper + i,
      extremeUpper = this.extremeUpper + i);
  }
  object Ranged {
    implicit def rw: RW[Ranged] = macroRW;
  }
  sealed trait Thrown extends Range {
    def variant: String;
    def shortUpper(som: Int): Int;
    def mediumUpper(som: Int): Int;
    def longUpper(som: Int): Int;
    def extremeUpperUpper(som: Int): Int;
    override def templateKV: Map[String, String] = Map("Range" -> s"Thrown (${variant})"); // TODO make nice maybe
  }
  object Thrown {
    implicit def rw: RW[Thrown] = RW.merge(
      macroRW[ThrownBlades.type],
      macroRW[ThrownMinigrenades.type],
      macroRW[ThrownGrenades.type]);
  }
  @upickle.key("ThrownBlades")
  case object ThrownBlades extends Thrown {
    override def variant: String = "Blades";
    override def shortUpper(som: Int): Int = ceilDiv(som, 5);
    override def mediumUpper(som: Int): Int = ceilDiv(som, 2);
    override def longUpper(som: Int): Int = som;
    override def extremeUpperUpper(som: Int): Int = som * 2;
    override def templateKV: Map[String, String] = Map(
      "Range 1-Short" -> s"2 - SOM%5m",
      "Range 2-Medium" -> s"SOM%5 + 1 - SOM%2m",
      "Range 3-Long" -> s"SOM%2 + 1 - SOMm",
      "Range 4-Extreme" -> s"SOM + 1 - SOMx2m");
  }
  @upickle.key("ThrownMinigrenades")
  case object ThrownMinigrenades extends Thrown {
    override def variant: String = "Minigrenades";
    override def shortUpper(som: Int): Int = ceilDiv(som, 2);
    override def mediumUpper(som: Int): Int = som;
    override def longUpper(som: Int): Int = som * 2;
    override def extremeUpperUpper(som: Int): Int = som * 3;
    override def templateKV: Map[String, String] = Map(
      "Range 1-Short" -> s"2 - SOM%2 meters",
      "Range 2-Medium" -> s"SOM%2 + 1 - SOM meters",
      "Range 3-Long" -> s"SOM + 1 - SOMx2 meters",
      "Range 4-Extreme" -> s"SOMx2 + 1 - SOMx3 meters");
  }
  @upickle.key("ThrownGrenades")
  case object ThrownGrenades extends Thrown {
    override def variant: String = "Grenades";
    override def shortUpper(som: Int): Int = ceilDiv(som, 5);
    override def mediumUpper(som: Int): Int = ceilDiv(som, 2);
    override def longUpper(som: Int): Int = som;
    override def extremeUpperUpper(som: Int): Int = som * 3;
    override def templateKV: Map[String, String] = Map(
      "Range 1-Short" -> s"2 - SOM%5m",
      "Range 2-Medium" -> s"SOM%5 + 1 - SOM%2m",
      "Range 3-Long" -> s"SOM%2 + 1 - SOMm",
      "Range 4-Extreme" -> s"SOM + 1 - SOMx3m");
  }
}
