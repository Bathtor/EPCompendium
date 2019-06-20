package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object CosmeticMods {
  import MorphType._;
  import CompendiumRefImplicits._;

  val c = "Cosmetic Mods";

  val bodySculpting = Augmentation(
    name = "Body Sculpting",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "If your morph’s enhanced physique isn’t enough, you can take it further with custom bodysculpting such as as elongated ears or fingers, nose alteration, hair addition/removal, feathers, exotic eyes, snakeskin, endowed genitalia, and more unusual physical alterations.",
    source = Sources.ep,
    sourcePage = 309
  );

  val nanotats = Augmentation(
    name = "Nanotats",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr =
      "Tattoos created with nanobots can move around the body, change shape/color/brightness, texture, alternate text and images, and/or even create minor holographic effects on the skin’s surface, all controllable via mesh inserts.",
    source = Sources.ep,
    sourcePage = 310
  );

  val piercings = Augmentation(
    name = "Piercings",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Trivial,
    descr =
      "Name any part of the body and some- one’s figured out a way to pierce it, probably mul- tiple times. Hoops, barbells, plugs, and chains are extremely common, often made of shapechanging smart materials.",
    source = Sources.ep,
    sourcePage = 310
  );

  val scarification = Augmentation(
    name = "Scarification",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Trivial,
    descr = "Given modern medical abilities, scars of any sort are purely an affectation.",
    source = Sources.ep,
    sourcePage = 310
  );

  val scentAlteration = Augmentation(
    name = "Scent Alteration",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Low,
    descr = "Minor changes to a body’s biochemistry can alter a character’s natural smell or constantly perfume them.",
    source = Sources.ep,
    sourcePage = 310
  );

  val skindyes = Augmentation(
    name = "Skindyes",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Trivial,
    descr = "Dye jobs are available in all conceivable colors and patterns.",
    source = Sources.ep,
    sourcePage = 310
  );

  val subdermalImplants = Augmentation(
    name = "Subdermal Implants",
    category = c,
    appliesTo = List(Biomorph, Pod),
    price = Cost.Trivial,
    descr =
      "Adding small implants under the skin can create bumps, ridges, piercing anchors, and similar textures and alterations.",
    source = Sources.ep,
    sourcePage = 310
  );

  val list: List[Augmentation] = Macros.memberList[Augmentation];
}
