package com.lkroll.ep.compendium

import collection.mutable
import scalajs.js
import scalajs.js.annotation._
import com.lkroll.common.data.{ WordMatch, EditDistance }
import com.lkroll.ep.compendium.utils.SemanticVersion
import com.lkroll.roll20.api.facade.Roll20API
import com.lkroll.ep.compendium.utils.OptionPickler._
import util.{ Try, Success, Failure }

@JSExportTopLevel("EPCompendium")
object EPCompendium {

  lazy val version: String = BuildInfo.version;

  private val weapons = mutable.Map.empty[String, Weapon];
  private val ammo = mutable.Map.empty[String, Ammo];
  private val morphModels = mutable.Map.empty[String, MorphModel];
  private val morphInstances = mutable.Map.empty[String, MorphInstance];
  private val traits = mutable.Map.empty[String, EPTrait];
  private val derangements = mutable.Map.empty[String, Derangement];
  private val disorders = mutable.Map.empty[String, Disorder];
  private val armour = mutable.Map.empty[String, Armour];
  private val gear = mutable.Map.empty[String, Gear];
  private val software = mutable.Map.empty[String, Software];
  private val substances = mutable.Map.empty[String, Substance];
  private val augmentations = mutable.Map.empty[String, Augmentation];
  private val armourMods = mutable.Map.empty[String, ArmourMod];
  private val weaponAccessories = mutable.Map.empty[String, WeaponAccessory];

  @JSExport
  def addData(version: String, dataType: String, data: js.Any): Unit = {
    checkCompatibility(version);
    val dataS = js.JSON.stringify(data);
    dataType match {
      case Weapon.dataType          => addWeapons(dataS)
      case Ammo.dataType            => addAmmo(dataS)
      case MorphModel.dataType      => addMorphModels(dataS)
      case MorphInstance.dataType   => addMorphInstances(dataS)
      case EPTrait.dataType         => addTraits(dataS)
      case Derangement.dataType     => addDerangements(dataS)
      case Disorder.dataType        => addDisorders(dataS)
      case Armour.dataType          => addArmour(dataS)
      case Gear.dataType            => addGear(dataS)
      case Software.dataType        => addSoftware(dataS)
      case Substance.dataType       => addSubstances(dataS)
      case Augmentation.dataType    => addAugmentations(dataS)
      case ArmourMod.dataType       => addArmourMods(dataS)
      case WeaponAccessory.dataType => addWeaponAccessories(dataS)
      case _                        => throw new RuntimeException(s"Unkown datatype $dataType")
    }
  }

  def readData(s: String): Try[Data] = {
    Try {
      val dd = read[DescribedData](s);
      dd.value
    }
  }

  def findAnything(needle: String): List[ChatRenderable] = {
    val lowNeedle = needle.toLowerCase();
    //val searchSpace: List[(String, ChatRenderable)] = weapons.toList ++ morphModels.toList ++ morphModels.toList;
    val matches: List[(WordMatch, ChatRenderable)] = List(
      searchIn(lowNeedle, weapons),
      searchIn(lowNeedle, ammo),
      searchIn(lowNeedle, morphModels),
      searchIn(lowNeedle, morphInstances),
      searchIn(lowNeedle, traits),
      searchIn(lowNeedle, derangements),
      searchIn(lowNeedle, disorders),
      searchIn(lowNeedle, armour),
      searchIn(lowNeedle, gear),
      searchIn(lowNeedle, software),
      searchIn(lowNeedle, substances),
      searchIn(lowNeedle, augmentations),
      searchIn(lowNeedle, armourMods),
      searchIn(lowNeedle, weaponAccessories)).flatten;
    matches.sortBy(_._1).reverse.map(_._2)
  }

  private def searchIn[D <: ChatRenderable](needle: String, m: scala.collection.Map[String, D]): List[(WordMatch, D)] = {
    m.flatMap {
      case (name, data) => {
        val m = WordMatch.matchForIgnoreCase(needle, name);
        if (m.isSignificant()) {
          Some((m -> data))
        } else {
          None
        }
      }
    }.toList
  }

  private def closestMatch[D <: ChatRenderable](ranked: List[(WordMatch, D)]): Option[D] = {
    if (ranked.isEmpty) {
      return None;
    }
    val first = ranked.head;
    if (first._1.isSignificant()) {
      Some(first._2)
    } else {
      None
    }
  }

  private def closestMatch[D <: ChatRenderable](needle: String, m: scala.collection.Map[String, D]): Option[D] = closestMatch(rank(needle, m));

  private def rank[D <: ChatRenderable](needle: String, m: scala.collection.Map[String, D]): List[(WordMatch, D)] = {
    if (needle == "*") { // pick a random object
      val l = m.values.toList;
      val r = util.Random.nextInt(l.length);
      val d = l(r);
      val wm = WordMatch.perfect(d.templateTitle);
      List((wm, d))
    } else {
      val lowNeedle = needle.toLowerCase();
      val matches = m.map(t => (WordMatch.matchForIgnoreCase(lowNeedle, t._1) -> t._2)).filter(_._1.isSignificant()).toList;
      matches.sortBy(_._1).reverse
    }
  }

  private def addWeapons(s: String): Unit = {
    val data = read[List[Weapon]](s);
    data.foreach { w =>
      weapons += (w.name -> w)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} weapons.");
  }
  def getWeapon(name: String): Option[Weapon] = weapons.get(name);
  def findWeapon(needle: String): Option[Weapon] = closestMatch(needle, weapons);
  def findWeapons(needle: String): List[Weapon] = rank(needle, weapons).map(_._2);

  private def addAmmo(s: String): Unit = {
    val data = read[List[Ammo]](s);
    data.foreach { w =>
      ammo += (w.name -> w)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} ammo.");
  }
  def getAmmo(name: String): Option[Ammo] = ammo.get(name);
  def findAmmo(needle: String): Option[Ammo] = closestMatch(needle, ammo);
  def findAmmos(needle: String): List[Ammo] = rank(needle, ammo).map(_._2);

  private def addMorphModels(s: String): Unit = {
    val data = read[List[MorphModel]](s);
    data.foreach { m =>
      morphModels += (m.name -> m)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} morph models.");
  }

  def getMorphModel(name: String): Option[MorphModel] = morphModels.get(name);
  def findMorphModel(needle: String): Option[MorphModel] = closestMatch(needle, morphModels);
  def findMorphModels(needle: String): List[MorphModel] = rank(needle, morphModels).map(_._2);

  private def addMorphInstances(s: String): Unit = {
    val data = read[List[MorphInstance]](s);
    data.foreach { m =>
      morphInstances += (m.label -> m)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} morph instances.");
  }

  def getMorphCustom(name: String): Option[MorphInstance] = morphInstances.get(name);
  def findMorphInstance(needle: String): Option[MorphInstance] = closestMatch(needle, morphInstances);
  def findMorphInstances(needle: String): List[MorphInstance] = rank(needle, morphInstances).map(_._2);

  private def addTraits(s: String): Unit = {
    val data = read[List[EPTrait]](s);
    data.foreach { t =>
      traits += (t.name -> t)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} traits.");
  }

  def getTrait(name: String): Option[EPTrait] = traits.get(name);
  def findTrait(needle: String): Option[EPTrait] = closestMatch(needle, traits);
  def findTraits(needle: String): List[EPTrait] = rank(needle, traits).map(_._2);

  private def addDerangements(s: String): Unit = {
    val data = read[List[Derangement]](s);
    data.foreach { d =>
      derangements += (d.name -> d)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} derangements.");
  }

  def getDerangement(name: String): Option[Derangement] = {
    if (name == "*") { // pick randomly
      closestMatch(name, derangements)
    } else {
      derangements.get(name)
    }
  }
  def findDerangement(needle: String): Option[Derangement] = closestMatch(needle, derangements);
  def findDerangements(needle: String): List[Derangement] = rank(needle, derangements).map(_._2);

  private def addDisorders(s: String): Unit = {
    val data = read[List[Disorder]](s);
    data.foreach { d =>
      disorders += (d.name -> d)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} disorders.");
  }
  def getDisorder(name: String): Option[Disorder] = disorders.get(name);
  def findDisorder(needle: String): Option[Disorder] = closestMatch(needle, disorders);
  def findDisorders(needle: String): List[Disorder] = rank(needle, disorders).map(_._2);

  private def addArmour(s: String): Unit = {
    val data = read[List[Armour]](s);
    data.foreach { a =>
      armour += (a.name -> a)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} armour items.");
  }
  def getArmour(name: String): Option[Armour] = armour.get(name);
  def findArmour(needle: String): Option[Armour] = closestMatch(needle, armour);
  def findArmourItems(needle: String): List[Armour] = rank(needle, armour).map(_._2);

  private def addGear(s: String): Unit = {
    val data = read[List[Gear]](s);
    data.foreach { g =>
      gear += (g.name -> g)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} gear items.");
  }
  def getGear(name: String): Option[Gear] = gear.get(name);
  def findGear(needle: String): Option[Gear] = closestMatch(needle, gear);
  def findGearItems(needle: String): List[Gear] = rank(needle, gear).map(_._2);

  private def addSoftware(s: String): Unit = {
    val data = read[List[Software]](s);
    data.foreach { s =>
      software += (s.name -> s)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} programs.");
  }
  def getSoftware(name: String): Option[Software] = software.get(name);
  def findSoftware(needle: String): Option[Software] = closestMatch(needle, software);
  def findSoftwarePrograms(needle: String): List[Software] = rank(needle, software).map(_._2);

  private def addSubstances(s: String): Unit = {
    val data = read[List[Substance]](s);
    data.foreach { s =>
      substances += (s.name -> s)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} substances.");
  }
  def getSubstance(name: String): Option[Substance] = substances.get(name);
  def findSubstance(needle: String): Option[Substance] = closestMatch(needle, substances);
  def findSubstances(needle: String): List[Substance] = rank(needle, substances).map(_._2);

  private def addAugmentations(s: String): Unit = {
    val data = read[List[Augmentation]](s);
    data.foreach { s =>
      augmentations += (s.name -> s)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} augmentations.");
  }
  def getAugmentation(name: String): Option[Augmentation] = augmentations.get(name);
  def findAugmentation(needle: String): Option[Augmentation] = closestMatch(needle, augmentations);
  def findAugmentations(needle: String): List[Augmentation] = rank(needle, augmentations).map(_._2);

  private def addArmourMods(s: String): Unit = {
    val data = read[List[ArmourMod]](s);
    data.foreach { s =>
      armourMods += (s.name -> s)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} armour mods.");
  }
  def getArmourMod(name: String): Option[ArmourMod] = armourMods.get(name);
  def findArmourMod(needle: String): Option[ArmourMod] = closestMatch(needle, armourMods);
  def findArmourMods(needle: String): List[ArmourMod] = rank(needle, armourMods).map(_._2);

  private def addWeaponAccessories(s: String): Unit = {
    val data = read[List[WeaponAccessory]](s);
    data.foreach { s =>
      weaponAccessories += (s.name -> s)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} weapon accessories.");
  }
  def getWeaponAccessory(name: String): Option[WeaponAccessory] = weaponAccessories.get(name);
  def findWeaponAccessory(needle: String): Option[WeaponAccessory] = closestMatch(needle, weaponAccessories);
  def findWeaponAccessories(needle: String): List[WeaponAccessory] = rank(needle, weaponAccessories).map(_._2);

  private def checkCompatibility(version: String): Unit = {
    val r = for {
      thisV <- SemanticVersion.fromString(this.version);
      thatV <- SemanticVersion.fromString(version)
    } yield {
      if (thisV >= thatV) {
        val diff = thisV - thatV;
        if (diff.major != 0) {
          throw new RuntimeException(s"Data version ($version) is invalid! Must be same major as script version (${this.version})");
        }
      } else {
        throw new RuntimeException(s"Data version ($version) may not be greater than script version (${this.version})");
      }
    };
    r match {
      case Success(_) => // ok
      case Failure(e) => throw e
    }
  }
}
