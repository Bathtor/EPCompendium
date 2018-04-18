package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

case class Derangement(name: String, severity: Severity, descr: String, upgradesTo: List[String] = List.empty,
                       source: String, sourcePage: Int) extends ChatRenderable {
  override def templateTitle: String = name;
  override def templateSubTitle: String = s"${severity.label} Derangement";
  override def templateKV: Map[String, String] = Map(
    "Lasts" -> "1d10 % 2 hours",
    "Upgrades" -> upgradesTo.mkString(", "),
    "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;
}
object Derangement {
  implicit def rw: RW[Derangement] = macroRW;
  val dataType: String = "derangement";
}

sealed trait Severity {
  def label: String;
}
object Severity {
  implicit def rw: RW[Severity] = RW.merge(
    macroRW[Minor.type],
    macroRW[Moderate.type],
    macroRW[Major.type]);

  @upickle.key("Minor")
  case object Minor extends Severity {
    override def label: String = "Minor";
  }

  @upickle.key("Moderate")
  case object Moderate extends Severity {
    override def label: String = "Moderate";
  }

  @upickle.key("Major")
  case object Major extends Severity {
    override def label: String = "Major";
  }
}
