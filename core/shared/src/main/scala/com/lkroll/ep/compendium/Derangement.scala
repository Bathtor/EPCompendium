package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}

case class Derangement(name: String,
                       severity: Severity,
                       descr: String,
                       upgradesTo: List[String] = List.empty,
                       source: String,
                       sourcePage: Int)
    extends ChatRenderable
    with Data {
  override def templateTitle: String = name;
  override def templateSubTitle: String = s"${severity.label} Derangement";
  override def templateKV: Map[String, String] =
    Map("Lasts" -> "1d10 % 2 hours", "Upgrades" -> upgradesTo.mkString(", "), "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;

  override def described: DescribedData = DescribedData.DerangementD(this, BuildInfo.version);
}
object Derangement {
  implicit def rw: RW[Derangement] = macroRW;
  val dataType: String = "derangement";
}

sealed trait Severity extends EnumEntry {
  def label: String = this.entryName;
}
object Severity extends Enum[Severity] with UPickleEnum[Severity] {
  case object Minor extends Severity;
  case object Moderate extends Severity;
  case object Major extends Severity;

  val values = findValues;
}
