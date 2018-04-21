package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

case class Gear(name: String, category: String, descr: String, price: Cost,
                source: String, sourcePage: Int) extends ChatRenderable {
  override def templateTitle: String = name;
  override def templateSubTitle: String = category;
  override def templateKV: Map[String, String] = price.templateKV ++ Map("Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;
}
object Gear {
  implicit def rw: RW[Gear] = macroRW;
  val dataType: String = "gear";
}

case class Software(name: String, descr: String, quality: SoftwareQuality = SoftwareQuality.Standard,
                    price: Cost, source: String, sourcePage: Int) extends ChatRenderable {
  override def templateTitle: String = name;
  override def templateSubTitle: String = "Software";
  override def templateKV: Map[String, String] = quality.templateKV ++
    price.templateKV ++
    Map("Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;
}
object Software {
  implicit def rw: RW[Software] = macroRW;
  val dataType: String = "software";
}

sealed trait SoftwareQuality extends ChatRenderable {
  def label: String;
  def modifier: Int;
  override def templateKV: Map[String, String] = Map("Quality" -> label, "Quality Modifier" -> modifier.toString);
}
object SoftwareQuality {
  implicit def rw: RW[SoftwareQuality] = RW.merge(
    macroRW[Standard.type],
    macroRW[Custom],
    macroRW[Relic.type],
    macroRW[EndOfLife.type],
    macroRW[Inferior.type],
    macroRW[Buggy.type],
    macroRW[PreFall.type],
    macroRW[Outdated.type],
    macroRW[LowQuality.type],
    macroRW[HighQuality.type],
    macroRW[SecurityGrade.type],
    macroRW[NextGen.type],
    macroRW[Advanced.type],
    macroRW[Sota.type],
    macroRW[TITAN],
    macroRW[Alien]);

  @upickle.key("Standard")
  case object Standard extends SoftwareQuality {
    override def label: String = "Standard";
    override def modifier: Int = 0;
  }

  @upickle.key("Custom")
  case class Custom(label: String, modifier: Int) extends SoftwareQuality {
  }

  @upickle.key("Relic")
  case object Relic extends SoftwareQuality {
    override def label: String = "Relic from the early expansion into space";
    override def modifier: Int = -30;
  }

  @upickle.key("EOL")
  case object EndOfLife extends SoftwareQuality {
    override def label: String = "End-of-Life/No-longer-supported";
    override def modifier: Int = -30;
  }

  @upickle.key("Inferior")
  case object Inferior extends SoftwareQuality {
    override def label: String = "Malfunctioning/Inferior";
    override def modifier: Int = -20;
  }

  @upickle.key("Buggy")
  case object Buggy extends SoftwareQuality {
    override def label: String = "Buggy";
    override def modifier: Int = -20;
  }

  @upickle.key("PreFall")
  case object PreFall extends SoftwareQuality {
    override def label: String = "Pre-Fall";
    override def modifier: Int = -20;
  }

  @upickle.key("Outdated")
  case object Outdated extends SoftwareQuality {
    override def label: String = "Outdated";
    override def modifier: Int = -10;
  }

  @upickle.key("Low")
  case object LowQuality extends SoftwareQuality {
    override def label: String = "Low Quality";
    override def modifier: Int = -10;
  }

  @upickle.key("High")
  case object HighQuality extends SoftwareQuality {
    override def label: String = "High Quality";
    override def modifier: Int = 10;
  }

  @upickle.key("Security")
  case object SecurityGrade extends SoftwareQuality {
    override def label: String = "Security Grade";
    override def modifier: Int = 10;
  }

  @upickle.key("NextGen")
  case object NextGen extends SoftwareQuality {
    override def label: String = "Next-Generation";
    override def modifier: Int = 20;
  }

  @upickle.key("Advanced")
  case object Advanced extends SoftwareQuality {
    override def label: String = "Advanced";
    override def modifier: Int = 20;
  }

  @upickle.key("Sota")
  case object Sota extends SoftwareQuality {
    override def label: String = "State-of-the-art";
    override def modifier: Int = 20;
  }

  @upickle.key("TITAN")
  case class TITAN(modifier: Int) extends SoftwareQuality {
    override def label: String = "TITAN";
  }

  @upickle.key("Alien")
  case class Alien(modifier: Int) extends SoftwareQuality {
    override def label: String = "Alien";
  }
}
