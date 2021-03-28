package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;
import com.lkroll.common.macros.Macros

object Panopticon {
  import ClassPathImageSource._;
  import utils.Implicits.instance2Option;
  import data._;

  val src = "Panopticon";
  val auth = "Posthuman Studios";
  val lic = "Creative Commons Attribution-Noncommercial-Share Alike 3.0 Unported License";
  def metaWithCaption(c: String): ImageMetadata =
    ImageMetadata(caption = c, source = src, author = auth, license = lic);

  val neoParrot = Image(key = MorphsMN.neoAvian,
                        source = "IMG/Neo-Parrot2.jpg".toCPSource,
                        metadata = metaWithCaption("A Neo-Parrot Morph.")
  );

  private val fieldList: List[Image[ClassPathImageSource]] = Macros.memberList[Image[ClassPathImageSource]];

  val list: List[Image[ClassPathImageSource]] = fieldList;

  private def multiImage(source: String, caption: String)(morphs: MorphModel*): List[Image[ClassPathImageSource]] = {
    morphs.map(m => Image(key = m, source = source.toCPSource, metadata = metaWithCaption(caption))).toList
  }
}
