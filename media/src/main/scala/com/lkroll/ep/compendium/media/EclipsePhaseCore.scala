package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;
import com.lkroll.common.macros.Macros

object EclipsePhaseCore {
  import ClassPathImageSource._;
  import utils.Implicits.instance2Option;
  import data._;

  val src = "Eclipse Phase Core";
  val auth = "Posthuman Studios";
  val lic = "Creative Commons Attribution-Noncommercial-Share Alike 3.0 Unported License";
  def metaWithCaption(c: String): ImageMetadata = ImageMetadata(
    caption = c,
    source = src,
    author = auth,
    license = lic);

  val arachnoid = Image(
    key = MorphsAC.arachnoid,
    source = "IMG/Arachnoid2.jpg".toCPSource,
    metadata = metaWithCaption("An Arachnoid Morph."));

  val automaticRifles = multiImage(
    source = "IMG/Combat Rifle.jpg",
    caption = "An Automatic Rifle.")(
    KineticWeapons.automaticRifle, KineticWeapons.automaticRifle.toRailgun);

  val cyberlimbs = multiImage(
    source = "IMG/Cyberlimb.jpg",
    caption = "A Morph with extra Cyberlimbs.")(
    Cyberware.cyberlimb, Cyberware.cyberlimbPlus);

  val electronicRope = Image(
    key = SurvivalGear.electronicRope,
    source = "IMG/Electronic Rope.jpg".toCPSource,
    metadata = metaWithCaption("Electronic Rope wrapping around objects."));

  val lightPistols = multiImage(
    source = "IMG/Light Pistol.jpg",
    caption = "A Light Pistol.")(
    KineticWeapons.lightPistol, KineticWeapons.lightPistol.toRailgun);

  val limbers = multiImage(
    source = "IMG/Limber.jpg",
    caption = "A Morph with the Limber trait.")(
    TraitsPositiveEP.limber1, TraitsPositiveEP.limber2);

  val heavyPistols = multiImage(
    source = "IMG/Heavy Pistol.jpg",
    caption = "A Heavy Pistol.")(
    KineticWeapons.heavyPistol, KineticWeapons.heavyPistol.toRailgun);

  val injectorNanoswarm = Image(
    key = Nanotechnology.injectorSwarm,
    source = "IMG/Injector Nanoswarm.jpg".toCPSource,
    metadata = metaWithCaption("Magnification of a single bot in an Injector Nanoswarm."));

  val novacrab = Image(
    key = MorphsMN.novacrab,
    source = "IMG/Novacrab2.jpg".toCPSource,
    metadata = metaWithCaption("A Novacrab Morph."));

  val octomorph = Image(
    key = MorphsOR.octomorph,
    source = "IMG/Octomorph2.jpg".toCPSource,
    metadata = metaWithCaption("A Octomorph."));

  val ruster = Image(
    key = MorphsOR.ruster,
    source = "IMG/Ruster2.jpg".toCPSource,
    metadata = metaWithCaption("A Ruster Morph."));

  val smartClothing = Image(
    key = EverydayTech.smartClothing,
    source = "IMG/Smart Clothing.jpg".toCPSource,
    metadata = metaWithCaption("A person wearing Smart Clothing."));

  val sniperRifles = multiImage(
    source = "IMG/Sniper Rifle.jpg",
    caption = "A Railgun Sniper Rifle.")(
    KineticWeapons.sniperRifle, KineticWeapons.sniperRifle.toRailgun);

  val submachineGuns = multiImage(
    source = "IMG/Submachine Gun.jpg",
    caption = "A Submachine Gun.")(
    KineticWeapons.submachineGun, KineticWeapons.submachineGun.toRailgun);

  val neutrinoTransceiver = Image(
    key = CommunicationsGear.neutrinoTransceiver,
    source = "IMG/Neutrino Transceiver.jpg".toCPSource,
    metadata = metaWithCaption("A Neutrino Transceiver loaded onto a vehicle."));

  val weaponAccessories = multiImage(
    source = "IMG/Weapon Accessories.jpg",
    caption = "A selection of Weapon Accessories.")(
    WeaponAccessories.extendedMagazine, WeaponAccessories.imagingScope,
    WeaponAccessories.laserSight, WeaponAccessories.silencer,
    WeaponAccessories.smartmag, WeaponAccessories.extsmartmag);

  private val fieldList: List[Image[ClassPathImageSource]] = Macros.memberList[Image[ClassPathImageSource]];

  val list: List[Image[ClassPathImageSource]] = fieldList ++
    limbers ++ cyberlimbs ++ sniperRifles ++ submachineGuns ++
    lightPistols ++ heavyPistols ++ automaticRifles ++ weaponAccessories;

  private def multiImage(source: String, caption: String)(data: Data*): List[Image[ClassPathImageSource]] = {
    data.map(d => Image(
      key = d,
      source = source.toCPSource,
      metadata = metaWithCaption(caption))).toList
  }
}
