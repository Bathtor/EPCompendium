package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

case class Augmentation(name: String, category: String,
                        appliesTo: List[MorphType], descr: String,
                        price: Cost, source: String, sourcePage: Int) extends ChatRenderable {
  override def templateTitle: String = name;
  override def templateSubTitle: String = category;
  override def templateKV: Map[String, String] = price.templateKV ++
    Map(
      "Applies To" -> appliesTo.map(_.label).mkString(","),
      "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;
}

object Augmentation {
  implicit def rw: RW[Augmentation] = macroRW;
  val dataType: String = "augmentation";
}
