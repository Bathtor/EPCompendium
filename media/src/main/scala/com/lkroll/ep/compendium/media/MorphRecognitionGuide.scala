package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;
import com.lkroll.common.macros.Macros

object MorphRecognitionGuide {
  import ClassPathImageSource._;
  import utils.Implicits.instance2Option;
  import data.{MorphsAC, MorphsDF, MorphsGL, MorphsMN, MorphsOR, MorphsS, MorphsTX};

  val src = "Morph Recognition Guide";
  val auth = "Posthuman Studios";
  val lic = "Creative Commons Attribution-Noncommercial-Share Alike 3.0 Unported License";
  def metaWithCaption(c: String): ImageMetadata =
    ImageMetadata(caption = c, source = src, author = auth, license = lic);

  val aquanaut = Image(key = MorphsAC.aquanaut,
                       source = "IMG/Aquanaut.jpg".toCPSource,
                       metadata = metaWithCaption("An Aquanaut Morph."));

  val arachnoid = Image(key = MorphsAC.arachnoid,
                        source = "IMG/Arachnoid.jpg".toCPSource,
                        metadata = metaWithCaption("An Arachnoid Morph."));

  val ariel =
    Image(key = MorphsAC.ariel, source = "IMG/Ariel.jpg".toCPSource, metadata = metaWithCaption("An Ariel Morph."));

  val ayah =
    Image(key = MorphsAC.ayah, source = "IMG/Ayah.jpg".toCPSource, metadata = metaWithCaption("An Ayah Morph."));

  val basicPod = Image(key = MorphsAC.basicPod,
                       source = "IMG/Basic Pod.jpg".toCPSource,
                       metadata = metaWithCaption("A Basic Pod Morph."));

  val biocore = Image(key = MorphsAC.biocore,
                      source = "IMG/Biocore.jpg".toCPSource,
                      metadata = metaWithCaption("A Biocore Morph."));

  val blackbird = Image(key = MorphsAC.blackbird,
                        source = "IMG/Blackbird.jpg".toCPSource,
                        metadata = metaWithCaption("A Blackbird Morph."));

  val bouncer = Image(key = MorphsAC.bouncer,
                      source = "IMG/Bouncer.jpg".toCPSource,
                      metadata = metaWithCaption("A Bouncer Morph."));

  val bruiser = Image(key = MorphsAC.bruiser,
                      source = "IMG/Bruiser.jpg".toCPSource,
                      metadata = metaWithCaption("A Bruiser Morph."));

  val `case` =
    Image(key = MorphsAC.`case`, source = "IMG/Case.jpg".toCPSource, metadata = metaWithCaption("A Case Morph."));

  val cetus =
    Image(key = MorphsAC.cetus, source = "IMG/Cetus.jpg".toCPSource, metadata = metaWithCaption("A Cetus Morph."));

  val chickcharnie = Image(key = MorphsAC.chickcharnie,
                           source = "IMG/Chickcharnie.jpg".toCPSource,
                           metadata = metaWithCaption("A Chickcharnie Morph."));

  val cloudSkate = Image(key = MorphsAC.cloudSkate,
                         source = "IMG/Cloud Skate.jpg".toCPSource,
                         metadata = metaWithCaption("A Cloud Skate Morph."));

  val cloudSkimmer = Image(key = MorphsAC.cloudSkimmer,
                           source = "IMG/Cloud Skimmer.jpg".toCPSource,
                           metadata = metaWithCaption("A Cloud Skimmer Morph."));

  val courier = Image(key = MorphsAC.courier,
                      source = "IMG/Courier.jpg".toCPSource,
                      metadata = metaWithCaption("A Courier Morph."));

  val crasher = Image(key = MorphsAC.crasher,
                      source = "IMG/Crasher.jpg".toCPSource,
                      metadata = metaWithCaption("A Crasher Morph."));

  val critter = Image(key = MorphsAC.critter,
                      source = "IMG/Critter.jpg".toCPSource,
                      metadata = metaWithCaption("A Critter Morph."));

  val daitya =
    Image(key = MorphsDF.daitya, source = "IMG/Daitya.jpg".toCPSource, metadata = metaWithCaption("A Daitya Morph."));

  val digger =
    Image(key = MorphsDF.digger, source = "IMG/Digger.jpg".toCPSource, metadata = metaWithCaption("A Digger Morph."));

  val dragonfly = Image(key = MorphsDF.dragonfly,
                        source = "IMG/Dragonfly.jpg".toCPSource,
                        metadata = metaWithCaption("A Dragonfly Morph."));

  val dvergr =
    Image(key = MorphsDF.dvergr, source = "IMG/Dvergr.jpg".toCPSource, metadata = metaWithCaption("A Dvergr Morph."));

  val exalt =
    Image(key = MorphsDF.exalt, source = "IMG/Exalt.jpg".toCPSource, metadata = metaWithCaption("A Exalt Morph."));

  val faust =
    Image(key = MorphsDF.faust, source = "IMG/Faust.jpg".toCPSource, metadata = metaWithCaption("A Faust Morph."));

  val fenrir =
    Image(key = MorphsDF.fenrir, source = "IMG/Fenrir.jpg".toCPSource, metadata = metaWithCaption("A Fenrir Morph."));

  val fightningKite = Image(key = MorphsDF.fightingKite,
                            source = "IMG/Fighting Kite.jpg".toCPSource,
                            metadata = metaWithCaption("A Fighting/Fiting Kite Morph."));

  val fierceKite = Image(key = MorphsDF.fierceKite,
                         source = "IMG/Fighting Kite.jpg".toCPSource,
                         metadata = metaWithCaption("A Fierce/Fightning Kite Morph."));

  val fightingKites = multiImage(source = "IMG/Fighting Kite.jpg", caption = "A Fierce/Fightning Kite Morph.")(
    MorphsDF.fightingKite,
    MorphsDF.fierceKite
  );

  val flat = Image(key = MorphsDF.flat, source = "IMG/Flat.jpg".toCPSource, metadata = metaWithCaption("A Flat Morph."));

  val flexbot = Image(key = MorphsDF.flexbot,
                      source = "IMG/Flexbot.jpg".toCPSource,
                      metadata = metaWithCaption("A Flexbot Morph."));

  val flyingSquid = Image(key = MorphsDF.flyingSquid,
                          source = "IMG/Flying Squid.jpg".toCPSource,
                          metadata = metaWithCaption("A Flying Squid Morph."));

  val freeman = Image(key = MorphsDF.freeman,
                      source = "IMG/Freeman.jpg".toCPSource,
                      metadata = metaWithCaption("A Freeman Morph."));

  val fury = Image(key = MorphsDF.fury, source = "IMG/Fury.jpg".toCPSource, metadata = metaWithCaption("A Fury Morph."));

  val futura =
    Image(key = MorphsDF.futura, source = "IMG/Futura.jpg".toCPSource, metadata = metaWithCaption("A Futura Morph."));

  val galatea = Image(key = MorphsGL.galatea,
                      source = "IMG/Galatea.jpg".toCPSource,
                      metadata = metaWithCaption("A Galatea Morph."));

  val gargoyle = Image(key = MorphsGL.gargoyle,
                       source = "IMG/Gargoyle.jpg".toCPSource,
                       metadata = metaWithCaption("A Gargoyle Morph."));

  val ghost =
    Image(key = MorphsGL.ghost, source = "IMG/Ghost.jpg".toCPSource, metadata = metaWithCaption("A Ghost Morph."));

  val grey = Image(key = MorphsGL.grey, source = "IMG/Grey.jpg".toCPSource, metadata = metaWithCaption("A Grey Morph."));

  val griefer = Image(key = MorphsGL.griefer,
                      source = "IMG/Griefer.jpg".toCPSource,
                      metadata = metaWithCaption("A Griefer Morph."));

  val guard =
    Image(key = MorphsGL.guard, source = "IMG/Guard.jpg".toCPSource, metadata = metaWithCaption("A Guard Morph."));

  val hazer =
    Image(key = MorphsGL.hazer, source = "IMG/Hazer.jpg".toCPSource, metadata = metaWithCaption("A Hazer Morph."));

  val hibernoid = Image(key = MorphsGL.hibernoid,
                        source = "IMG/Hibernoid.jpg".toCPSource,
                        metadata = metaWithCaption("A Hibernoid Morph."));

  val hulder =
    Image(key = MorphsGL.hulder, source = "IMG/Hulder.jpg".toCPSource, metadata = metaWithCaption("A Hulder Morph."));

  val hyperbright = Image(key = MorphsGL.hyperbright,
                          source = "IMG/Hyperbright.jpg".toCPSource,
                          metadata = metaWithCaption("A Hyperbright Morph."));

  val hypergibbon = Image(key = MorphsGL.hypergibbon,
                          source = "IMG/Hypergibbon.jpg".toCPSource,
                          metadata = metaWithCaption("A Hypergibbon Morph."));

  val eidolons = multiImage(source = "IMG/Infomorph.jpg", caption = "An Infomorph (Eidolon).")(MorphsGL.infomorph,
                                                                                               MorphsGL.agent,
                                                                                               MorphsGL.digimorph,
                                                                                               MorphsGL.elite,
                                                                                               MorphsGL.hotShot,
                                                                                               MorphsGL.sage,
                                                                                               MorphsGL.scholar,
                                                                                               MorphsGL.slave,
                                                                                               MorphsGL.wirehead);

  val jenkin =
    Image(key = MorphsGL.jenkin, source = "IMG/Jenkin.jpg".toCPSource, metadata = metaWithCaption("A Jenkin Morph."));

  val kites = multiImage(source = "IMG/Kite.jpg", caption = "An Ultra-/Kite Morph.")(MorphsGL.kite, MorphsGL.ultraKite);

  val lunarFlyer = Image(key = MorphsGL.lunarFlyer,
                         source = "IMG/Lunar Flyer.jpg".toCPSource,
                         metadata = metaWithCaption("A Lunar Flyer Morph."));

  val martianAlpiner = Image(key = MorphsMN.martianAlpiner,
                             source = "IMG/Martian Alpiner.jpg".toCPSource,
                             metadata = metaWithCaption("A Martian Alpiner Morph."));

  val menton =
    Image(key = MorphsMN.menton, source = "IMG/Menton.jpg".toCPSource, metadata = metaWithCaption("A Menton Morph."));

  val mimic =
    Image(key = MorphsMN.mimic, source = "IMG/Mimic.jpg".toCPSource, metadata = metaWithCaption("A Mimic Morph."));

  val nautiloid = Image(key = MorphsMN.nautiloid,
                        source = "IMG/Nautiloid.jpg".toCPSource,
                        metadata = metaWithCaption("A Nautiloid Morph."));

  val neoRaven = Image(key = MorphsMN.neoAvian,
                       source = "IMG/Neo-Raven.jpg".toCPSource,
                       metadata = metaWithCaption("A Neo-Raven Morph."));

  val neoParrot = Image(key = MorphsMN.neoAvian,
                        source = "IMG/Neo-Parrot.jpg".toCPSource,
                        metadata = metaWithCaption("A Neo-Parrot Morph."));

  val neoBeluga = Image(key = MorphsMN.neoBeluga,
                        source = "IMG/Neo-Beluga.jpg".toCPSource,
                        metadata = metaWithCaption("A Neo-Beluga Morph."));

  val neoDolphin = Image(key = MorphsMN.neoDolphin,
                         source = "IMG/Neo-Dolphin.jpg".toCPSource,
                         metadata = metaWithCaption("A Neo-Dolphin Morph."));

  val neoGorilla = Image(key = MorphsMN.neoGorilla,
                         source = "IMG/Neo-Gorilla.jpg".toCPSource,
                         metadata = metaWithCaption("A Neo-Gorilla Morph."));

  val neoChimp = Image(key = MorphsMN.neoHominid,
                       source = "IMG/Neo-Chimp.jpg".toCPSource,
                       metadata = metaWithCaption("A Neo-Chimp Morph."));

  val neoNeanderthal = Image(key = MorphsMN.neoNeanderthal,
                             source = "IMG/Neo-Neanderthal.jpg".toCPSource,
                             metadata = metaWithCaption("A Neo-Neanderthal Morph."));

  val neoOrca = Image(key = MorphsMN.neoOrca,
                      source = "IMG/Neo-Orca.jpg".toCPSource,
                      metadata = metaWithCaption("A Neo-Orca Morph."));

  val neoPig =
    Image(key = MorphsMN.neoPig, source = "IMG/Neo-Pig.jpg".toCPSource, metadata = metaWithCaption("A Neo-Pig Morph."));

  val neoPorpoise = Image(key = MorphsMN.neoPorpoise,
                          source = "IMG/Neo-Porpoise.jpg".toCPSource,
                          metadata = metaWithCaption("A Neo-Porpoise Morph."));

  val neotenic = Image(key = MorphsMN.neotenic,
                       source = "IMG/Neotenic.jpg".toCPSource,
                       metadata = metaWithCaption("A Neotenic Morph."));

  val neoWhale = Image(key = MorphsMN.neoWhale,
                       source = "IMG/Neo-Whale.jpg".toCPSource,
                       metadata = metaWithCaption("A Neo-Whale Morph."));

  val nomad =
    Image(key = MorphsMN.nomad, source = "IMG/Nomad.jpg".toCPSource, metadata = metaWithCaption("A Nomad Morph."));

  val novacrab = Image(key = MorphsMN.novacrab,
                       source = "IMG/Novacrab.jpg".toCPSource,
                       metadata = metaWithCaption("A Novacrab Morph."));

  val observer = Image(key = MorphsOR.observer,
                       source = "IMG/Observer.jpg".toCPSource,
                       metadata = metaWithCaption("A Observer Morph."));

  val octomorph = Image(key = MorphsOR.octomorph,
                        source = "IMG/Octomorph.jpg".toCPSource,
                        metadata = metaWithCaption("A Octomorph."));

  val olympian = Image(key = MorphsOR.olympian,
                       source = "IMG/Olympian.jpg".toCPSource,
                       metadata = metaWithCaption("A Olympian Morph."));

  val opteryx = Image(key = MorphsOR.opteryx,
                      source = "IMG/Opteryx.jpg".toCPSource,
                      metadata = metaWithCaption("A Opteryx Morph."));

  val pleasurePod = Image(key = MorphsOR.pleasurePod,
                          source = "IMG/Pleasure Pod.jpg".toCPSource,
                          metadata = metaWithCaption("A Pleasure Pod Morph."));

  val qMorph =
    Image(key = MorphsOR.qMorph, source = "IMG/Q-Morph.jpg".toCPSource, metadata = metaWithCaption("A Q-Morph."));

  val reaper =
    Image(key = MorphsOR.reaper, source = "IMG/Reaper.jpg".toCPSource, metadata = metaWithCaption("A Reaper Morph."));

  val remade =
    Image(key = MorphsOR.remade, source = "IMG/Remade.jpg".toCPSource, metadata = metaWithCaption("A Remade Morph."));

  val ringFlyer = Image(key = MorphsOR.ringFlyer,
                        source = "IMG/Ring Flyer.jpg".toCPSource,
                        metadata = metaWithCaption("A Ring Flyer Morph."));

  val ripwing = Image(key = MorphsOR.ripwing,
                      source = "IMG/Ripwing.jpg".toCPSource,
                      metadata = metaWithCaption("A Ripwing Morph."));

  val rovers =
    multiImage(source = "IMG/Rover.jpg", caption = "A Rover Morph.")(MorphsOR.rover, MorphsOR.roverSpaceFighter);

  val ruster =
    Image(key = MorphsOR.ruster, source = "IMG/Ruster.jpg".toCPSource, metadata = metaWithCaption("A Ruster Morph."));

  val salamander = Image(key = MorphsS.salamander,
                         source = "IMG/Salamander.jpg".toCPSource,
                         metadata = metaWithCaption("A Salamander Morph."));

  val samsa =
    Image(key = MorphsS.samsa, source = "IMG/Samsa.jpg".toCPSource, metadata = metaWithCaption("A Samsa Morph."));

  val savant =
    Image(key = MorphsS.savant, source = "IMG/Savant.jpg".toCPSource, metadata = metaWithCaption("A Savant Morph."));

  val scurrier = Image(key = MorphsS.scurrier,
                       source = "IMG/Scurrier.jpg".toCPSource,
                       metadata = metaWithCaption("A Scurrier Morph."));

  val securityPod = Image(key = MorphsS.securityPod,
                          source = "IMG/Security Pod.jpg".toCPSource,
                          metadata = metaWithCaption("A Security Pod Morph."));

  val selkie =
    Image(key = MorphsS.selkie, source = "IMG/Selkie.jpg".toCPSource, metadata = metaWithCaption("A Selkie Morph."));

  val shaper =
    Image(key = MorphsS.shaper, source = "IMG/Shaper.jpg".toCPSource, metadata = metaWithCaption("A Shaper Morph."));

  val slitheroid = Image(key = MorphsS.slitheroid,
                         source = "IMG/Slitheroid.jpg".toCPSource,
                         metadata = metaWithCaption("A Slitheroid Morph."));

  val spare =
    Image(key = MorphsS.spare, source = "IMG/Spare.jpg".toCPSource, metadata = metaWithCaption("A Spare Morph."));

  val specialistPod = Image(key = MorphsS.specialistPod,
                            source = "IMG/Specialist Pod.jpg".toCPSource,
                            metadata = metaWithCaption("A Specialist Pod Morph."));

  val sphere =
    Image(key = MorphsS.sphere, source = "IMG/Sphere.jpg".toCPSource, metadata = metaWithCaption("A Sphere Morph."));

  val splicer =
    Image(key = MorphsS.splicer, source = "IMG/Splicer.jpg".toCPSource, metadata = metaWithCaption("A Splicer Morph."));

  val steelMorph = Image(key = MorphsS.steelMorph,
                         source = "IMG/Steel Morph.jpg".toCPSource,
                         metadata = metaWithCaption("A Steel Morph."));

  val steelMorphLiquidSilver = Image(
    key = MorphsS.steelLiquidSilverMorph,
    source = "IMG/Steel Morph Liquid Silver.jpg".toCPSource,
    metadata = metaWithCaption("A Steel Morph (Liquid Silver Variant).")
  );

  val sundiver = Image(key = MorphsS.sundiver,
                       source = "IMG/Sundiver.jpg".toCPSource,
                       metadata = metaWithCaption("A Sundiver Morph."));

  val surya =
    Image(key = MorphsS.surya, source = "IMG/Surya.jpg".toCPSource, metadata = metaWithCaption("A Surya Morph."));

  val swarmanoids = multiImage(source = "IMG/Swarmanoid.jpg", caption = "A Swarmanoid Morph.")(
    MorphsS.swarmanoid,
    MorphsS.skulkerSwarmanoid,
    MorphsS.smartSwarmanoid
  );

  val sylph =
    Image(key = MorphsS.sylph, source = "IMG/Sylph.jpg".toCPSource, metadata = metaWithCaption("A Sylph Morph."));

  val synth =
    Image(key = MorphsS.synth, source = "IMG/Synth.jpg".toCPSource, metadata = metaWithCaption("A Synth Morph."));

  val synthtaur = Image(key = MorphsS.synthtaur,
                        source = "IMG/Synthtaur.jpg".toCPSource,
                        metadata = metaWithCaption("A Synthtaur Morph."));

  val takko =
    Image(key = MorphsTX.takko, source = "IMG/Takko.jpg".toCPSource, metadata = metaWithCaption("A Takko Morph."));

  val theseus = Image(key = MorphsTX.theseus,
                      source = "IMG/Theseus.jpg".toCPSource,
                      metadata = metaWithCaption("A Theseus Morph."));

  val vacuumPod = Image(key = MorphsTX.vacuumPod,
                        source = "IMG/Vacuum Pod.jpg".toCPSource,
                        metadata = metaWithCaption("A Vacuum Pod Morph."));

  val venusianGlider = Image(key = MorphsTX.venusianGlider,
                             source = "IMG/Venusian Glider.jpg".toCPSource,
                             metadata = metaWithCaption("A Venusian Glider Morph."));

  val whiplash = Image(key = MorphsTX.whiplash,
                       source = "IMG/Whiplash.jpg".toCPSource,
                       metadata = metaWithCaption("A Whiplash Morph."));

  val workerPod = Image(key = MorphsTX.workerPod,
                        source = "IMG/Worker Pod.jpg".toCPSource,
                        metadata = metaWithCaption("A Worker Pod Morph."));

  val xuFu =
    Image(key = MorphsTX.xuFu, source = "IMG/Xu Fu.jpg".toCPSource, metadata = metaWithCaption("A Xu Fu Morph."));

  private val fieldList: List[Image[ClassPathImageSource]] = Macros.memberList[Image[ClassPathImageSource]];

  val list
      : List[Image[ClassPathImageSource]] = fieldList ++ fightingKites ++ eidolons ++ kites ++ rovers ++ swarmanoids;

  private def multiImage(source: String, caption: String)(morphs: MorphModel*): List[Image[ClassPathImageSource]] = {
    morphs.map(m => Image(key = m, source = source.toCPSource, metadata = metaWithCaption(caption))).toList
  }
}
