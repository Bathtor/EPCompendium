package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;
import com.lkroll.common.macros.Macros

object Firewall {
  import ClassPathImageSource._;
  import utils.Implicits.instance2Option;
  import data._;

  val src = "Firewall";
  val auth = "Posthuman Studios";
  val lic = "Creative Commons Attribution-Noncommercial-Share Alike 3.0 Unported License";
  def metaWithCaption(c: String): ImageMetadata =
    ImageMetadata(caption = c, source = src, author = auth, license = lic);

  val bouncer = Image(key = MorphsAC.bouncer,
                      source = "IMG/Bouncer2.jpg".toCPSource,
                      metadata = metaWithCaption("A Bouncer Morph.")
  );

  val crasher = Image(key = MorphsAC.crasher,
                      source = "IMG/Crasher2.jpg".toCPSource,
                      metadata = metaWithCaption("A Crasher Morph.")
  );

  val exalt = multiImage(source = "IMG/Exalt2.jpg", caption = "An Exalt Morph holding a Plasma Blade.")(
    MorphsDF.exalt,
    Blades.plasmaBlade
  );

  val flat =
    Image(key = MorphsDF.flat, source = "IMG/Flat2.jpg".toCPSource, metadata = metaWithCaption("A Flat Morph."));

  val fury =
    Image(key = MorphsDF.fury, source = "IMG/Fury2.jpg".toCPSource, metadata = metaWithCaption("A Fury Morph."));

  val menton =
    Image(key = MorphsMN.menton, source = "IMG/Menton2.jpg".toCPSource, metadata = metaWithCaption("A Menton Morph."));

  val neoNeanderthal = Image(key = MorphsMN.neoNeanderthal,
                             source = "IMG/Neo-Neanderthal2.jpg".toCPSource,
                             metadata = metaWithCaption("A Neo-Neanderthal Morph.")
  );

  val observer = Image(key = MorphsOR.observer,
                       source = "IMG/Observer2.jpg".toCPSource,
                       metadata = metaWithCaption("A Observer Morph.")
  );

  val remade =
    Image(key = MorphsOR.remade, source = "IMG/Remade2.jpg".toCPSource, metadata = metaWithCaption("A Remade Morph."));

  val remade2 =
    Image(key = MorphsOR.remade, source = "IMG/Remade3.jpg".toCPSource, metadata = metaWithCaption("A Remade Morph."));

  val ruster =
    Image(key = MorphsOR.ruster, source = "IMG/Ruster3.jpg".toCPSource, metadata = metaWithCaption("A Ruster Morph."));

  val slitheroid = Image(key = MorphsS.slitheroid,
                         source = "IMG/Slitheroid2.jpg".toCPSource,
                         metadata = metaWithCaption("A Slitheroid Morph.")
  );

  val synth =
    Image(key = MorphsS.synth, source = "IMG/Synth2.jpg".toCPSource, metadata = metaWithCaption("A Synth Morph."));

  val takko =
    Image(key = MorphsTX.takko, source = "IMG/Takko2.jpg".toCPSource, metadata = metaWithCaption("A Takko Morph."));

  val torch = Image(key = SprayWeapons.torch,
                    source = "IMG/Flamethrower.jpg".toCPSource,
                    metadata = metaWithCaption("A Sentinel holding a Torch.")
  );

  private val fieldList: List[Image[ClassPathImageSource]] = Macros.memberList[Image[ClassPathImageSource]];

  val list: List[Image[ClassPathImageSource]] = fieldList;

  private def multiImage(source: String, caption: String)(data: Data*): List[Image[ClassPathImageSource]] = {
    data.map(d => Image(key = d, source = source.toCPSource, metadata = metaWithCaption(caption))).toList
  }
}
