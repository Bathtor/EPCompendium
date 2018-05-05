package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

case class Armour(name: String, descr: String, accessory: Boolean = false, armour: (Int, Int),
                  price: Cost, source: String, sourcePage: Int) extends ChatRenderable {
  override def templateTitle: String = name;
  override def templateSubTitle: String = if (accessory) "Armour Accessory" else "Armour";
  override def templateKV: Map[String, String] = price.templateKV ++
    Map("Armour" -> s"${armour._1}/${armour._2}", "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;
}
object Armour {
  implicit def rw: RW[Armour] = macroRW;
  val dataType: String = "armour";
}
