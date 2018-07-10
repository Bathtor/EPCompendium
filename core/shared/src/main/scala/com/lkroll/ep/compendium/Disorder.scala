package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

case class Disorder(name: String, descr: String, gameEffect: String,
                    source: String, sourcePage: Int) extends ChatRenderable with Data {
  override def templateTitle: String = name;
  override def templateSubTitle: String = "Disorder";
  override def templateKV: Map[String, String] = Map("Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr ++ "<br />--- Suggested Game Effect ---<br />" ++ gameEffect;
  override def described: DescribedData = DescribedData.DisorderD(this);
}
object Disorder {
  implicit def rw: RW[Disorder] = macroRW;
  val dataType: String = "disorder";
}
