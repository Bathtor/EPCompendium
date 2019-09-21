package com.lkroll.ep.compendium

import utils.OptionPickler.{ReadWriter => RW, macroRW}
import com.lkroll.ep.compendium.Distance.DistanceNum

sealed trait Range extends ChatRenderable {}
object Range {

  implicit def rw: RW[Range] = RW.merge(macroRW[Melee.type], Thrown.rw, Ranged.rw);

  import Math.ceil;
  @upickle.implicits.key("Melee")
  case object Melee extends Range {
    override def templateKV: Map[String, String] = Map("Range" -> "Melee");
  }
  @upickle.implicits.key("Ranged")
  case class Ranged(shortUpper: Long, mediumUpper: Long, longUpper: Long, extremeUpper: Long) extends Range {

    private def norm(n: Long): String = DistanceNum(n, DistanceUnit.Meters).renderNormalised;

    override def templateKV: Map[String, String] =
      Map(
        "Range 1-Short" -> s"2m-${norm(shortUpper)}",
        "Range 2-Medium" -> s"${norm(shortUpper + 1L)}-${norm(mediumUpper)}",
        "Range 3-Long" -> s"${norm(mediumUpper + 1L)}-${norm(longUpper)}",
        "Range 4-Extreme" -> s"${norm(longUpper + 1L)}-${norm(extremeUpper)}"
      );

    def *(d: Double): Ranged =
      Ranged(
        shortUpper = Math.round(this.shortUpper.toDouble * d).toLong,
        mediumUpper = Math.round(this.mediumUpper.toDouble * d).toLong,
        longUpper = Math.round(this.longUpper.toDouble * d).toLong,
        extremeUpper = Math.round(this.extremeUpper.toDouble * d).toLong
      );
    def *(i: Int): Ranged =
      Ranged(shortUpper = this.shortUpper * i,
             mediumUpper = this.mediumUpper * i,
             longUpper = this.longUpper * i,
             extremeUpper = this.extremeUpper * i);
    def +(i: Int): Ranged =
      Ranged(shortUpper = this.shortUpper + i,
             mediumUpper = this.mediumUpper + i,
             longUpper = this.longUpper + i,
             extremeUpper = this.extremeUpper + i);
  }
  object Ranged {
    implicit def rw: RW[Ranged] = macroRW;
  }
  sealed trait Thrown extends Range {
    def variant: String;
    def shortUpper(som: Long): Long;
    def shortFactor: Double;
    def mediumUpper(som: Long): Long;
    def mediumFactor: Double;
    def longUpper(som: Long): Long;
    def longFactor: Double;
    def extremeUpperUpper(som: Long): Long;
    def extremeFactor: Double;
    override def templateKV: Map[String, String] = Map("Range" -> s"Thrown (${variant})"); // TODO make nice maybe
  }
  object Thrown {
    implicit def rw: RW[Thrown] =
      RW.merge(macroRW[ThrownBlades.type], macroRW[ThrownMinigrenades.type], macroRW[ThrownGrenades.type]);
  }
  @upickle.implicits.key("ThrownBlades")
  case object ThrownBlades extends Thrown {
    override def variant: String = "Blades";
    override def shortUpper(som: Long): Long = ceilDiv(som, 5);
    override def shortFactor: Double = 0.2;
    override def mediumUpper(som: Long): Long = ceilDiv(som, 2);
    override def mediumFactor: Double = 0.5;
    override def longUpper(som: Long): Long = som;
    override def longFactor: Double = 1.0;
    override def extremeUpperUpper(som: Long): Long = som * 2;
    override def extremeFactor: Double = 2;
    override def templateKV: Map[String, String] =
      Map("Range 1-Short" -> s"2 - SOM%5m",
          "Range 2-Medium" -> s"SOM%5 + 1 - SOM%2m",
          "Range 3-Long" -> s"SOM%2 + 1 - SOMm",
          "Range 4-Extreme" -> s"SOM + 1 - SOMx2m");
  }
  @upickle.implicits.key("ThrownMinigrenades")
  case object ThrownMinigrenades extends Thrown {
    override def variant: String = "Minigrenades";
    override def shortUpper(som: Long): Long = ceilDiv(som, 2);
    override def shortFactor: Double = 0.5;
    override def mediumUpper(som: Long): Long = som;
    override def mediumFactor: Double = 1.0;
    override def longUpper(som: Long): Long = som * 2;
    override def longFactor: Double = 2.0;
    override def extremeUpperUpper(som: Long): Long = som * 3;
    override def extremeFactor: Double = 3.0;
    override def templateKV: Map[String, String] =
      Map(
        "Range 1-Short" -> s"2 - SOM%2 meters",
        "Range 2-Medium" -> s"SOM%2 + 1 - SOM meters",
        "Range 3-Long" -> s"SOM + 1 - SOMx2 meters",
        "Range 4-Extreme" -> s"SOMx2 + 1 - SOMx3 meters"
      );
  }
  @upickle.implicits.key("ThrownGrenades")
  case object ThrownGrenades extends Thrown {
    override def variant: String = "Grenades";
    override def shortUpper(som: Long): Long = ceilDiv(som, 5);
    override def shortFactor: Double = 0.2;
    override def mediumUpper(som: Long): Long = ceilDiv(som, 2);
    override def mediumFactor: Double = 0.5;
    override def longUpper(som: Long): Long = som;
    override def longFactor: Double = 1.0;
    override def extremeUpperUpper(som: Long): Long = som * 3;
    override def extremeFactor: Double = 3.0;
    override def templateKV: Map[String, String] =
      Map("Range 1-Short" -> s"2 - SOM%5m",
          "Range 2-Medium" -> s"SOM%5 + 1 - SOM%2m",
          "Range 3-Long" -> s"SOM%2 + 1 - SOMm",
          "Range 4-Extreme" -> s"SOM + 1 - SOMx3m");
  }
}
