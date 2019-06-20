package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;
import com.lkroll.common.macros.Macros

object Rimward {
  import ClassPathImageSource._;
  import utils.Implicits.instance2Option;
  import data._;

  val src = "Rimward";
  val auth = "Posthuman Studios";
  val lic = "Creative Commons Attribution-Noncommercial-Share Alike 3.0 Unported License";
  def metaWithCaption(c: String): ImageMetadata =
    ImageMetadata(caption = c, source = src, author = auth, license = lic);

  val hulder = Image(
    key = MorphsGL.hulder,
    source = "IMG/Hulder Habitat.jpg".toCPSource,
    metadata = metaWithCaption("A Hulder with Titanian Caribou in their natural habitat on Titan.")
  );

  private val fieldList: List[Image[ClassPathImageSource]] = Macros.memberList[Image[ClassPathImageSource]];

  val list: List[Image[ClassPathImageSource]] = fieldList;

  private def multiImage(source: String, caption: String)(morphs: MorphModel*): List[Image[ClassPathImageSource]] = {
    morphs.map(m => Image(key = m, source = source.toCPSource, metadata = metaWithCaption(caption))).toList
  }
}
