package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;
import com.lkroll.common.macros.Macros

object Transhuman {
  import ClassPathImageSource._;
  import utils.Implicits.instance2Option;
  import data._;

  val src = "Transhuman";
  val auth = "Posthuman Studios";
  val lic = "Creative Commons Attribution-Noncommercial-Share Alike 3.0 Unported License";
  def metaWithCaption(c: String): ImageMetadata =
    ImageMetadata(caption = c, source = src, author = auth, license = lic);

  val eidolons = multiImage(source = "IMG/Portable Server.jpg",
                            caption = "An Infomorph (Eidolon) using a Portable Server for mobility."
  )(
    MorphsGL.infomorph,
    MorphsGL.agent,
    MorphsGL.digimorph,
    MorphsGL.elite,
    MorphsGL.hotShot,
    MorphsGL.sage,
    MorphsGL.scholar,
    MorphsGL.slave,
    MorphsGL.wirehead
  );

  val crasher = Image(key = MorphsAC.crasher,
                      source = "IMG/Crasher3.jpg".toCPSource,
                      metadata = metaWithCaption("A Crasher Morph.")
  );

  val neoRaven = Image(key = MorphsMN.neoAvian,
                       source = "IMG/Neo-Raven2.jpg".toCPSource,
                       metadata = metaWithCaption("A Neo-Raven with Neo-Pig body guards.")
  );

  val egoBridge = Image(
    key = Nanotechnology.egoBridge,
    source = "IMG/Ego Bridge.jpg".toCPSource,
    metadata = metaWithCaption("Transferring an Ego from one morph to another using an Ego Bridge.")
  );

  val flexbot = Image(key = MorphsDF.flexbot,
                      source = "IMG/Flexbot2.jpg".toCPSource,
                      metadata = metaWithCaption("A Flexbot Morph.")
  );

  val neoPig =
    Image(key = MorphsMN.neoPig,
          source = "IMG/Neo-Pig2.jpg".toCPSource,
          metadata = metaWithCaption("A Neo-Pig Morph.")
    );

  val octomorph = Image(key = MorphsOR.octomorph,
                        source = "IMG/Octomorph3.jpg".toCPSource,
                        metadata = metaWithCaption("A Octomorph.")
  );

  val steelMorphMasked = Image(key = MorphsS.steelMaskedMorph,
                               source = "IMG/Steel Morph Masked.jpg".toCPSource,
                               metadata = metaWithCaption("A Steel Morph (Masked Variant).")
  );

  private val fieldList: List[Image[ClassPathImageSource]] = Macros.memberList[Image[ClassPathImageSource]];

  val list: List[Image[ClassPathImageSource]] = fieldList ++ eidolons;

  private def multiImage(source: String, caption: String)(morphs: MorphModel*): List[Image[ClassPathImageSource]] = {
    morphs.map(m => Image(key = m, source = source.toCPSource, metadata = metaWithCaption(caption))).toList
  }
}
