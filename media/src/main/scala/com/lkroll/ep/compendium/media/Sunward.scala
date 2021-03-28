package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;
import com.lkroll.common.macros.Macros

object Sunward {
  import ClassPathImageSource._;
  import utils.Implicits.instance2Option;
  import data._;

  val src = "Sunward";
  val auth = "Posthuman Studios";
  val lic = "Creative Commons Attribution-Noncommercial-Share Alike 3.0 Unported License";
  def metaWithCaption(c: String): ImageMetadata =
    ImageMetadata(caption = c, source = src, author = auth, license = lic);

  val highdiveSuit = Image(
    key = SurvivalGear.highdiveSuit,
    source = "IMG/High Dive Suit.jpg".toCPSource,
    metadata = metaWithCaption("Diving through the Venusian clouds in a High-Dive Suit.")
  );

  val pleasurePod = Image(key = MorphsOR.pleasurePod,
                          source = "IMG/Pleasure Pod2.jpg".toCPSource,
                          metadata = metaWithCaption("A Pleasure Pod Morph exiting a storage pod.")
  );

  val splicer = Image(key = MorphsS.splicer,
                      source = "IMG/Splicer2.jpg".toCPSource,
                      metadata = metaWithCaption("An Earth Survivor in a Splicer Morph.")
  );

  val steelMorph = Image(key = MorphsS.steelMorph,
                         source = "IMG/Steel Morph2.jpg".toCPSource,
                         metadata = metaWithCaption("A Steel Morph.")
  );

  private val fieldList: List[Image[ClassPathImageSource]] = Macros.memberList[Image[ClassPathImageSource]];

  val list: List[Image[ClassPathImageSource]] = fieldList;

  private def multiImage(source: String, caption: String)(morphs: MorphModel*): List[Image[ClassPathImageSource]] = {
    morphs.map(m => Image(key = m, source = source.toCPSource, metadata = metaWithCaption(caption))).toList
  }
}
