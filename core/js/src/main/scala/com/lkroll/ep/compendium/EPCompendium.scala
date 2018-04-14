package com.lkroll.ep.compendium

import collection.mutable
import scalajs.js
import scalajs.js.annotation._
import com.lkroll.ep.compendium.utils.{ SemanticVersion, EditDistance }
import com.lkroll.roll20.api.facade.Roll20API
import com.lkroll.ep.compendium.utils.OptionPickler._

@JSExportTopLevel("EPCompendium")
object EPCompendium {

  val version: String = BuildInfo.version;

  private val weapons = mutable.Map.empty[String, Weapon];
  private val ammo = mutable.Map.empty[String, Ammo];
  private val morphModels = mutable.Map.empty[String, MorphModel];
  private val morphInstances = mutable.Map.empty[String, MorphInstance];
  private val traits = mutable.Map.empty[String, EPTrait];

  @JSExport
  def addData(version: String, dataType: String, data: js.Any): Unit = {
    checkCompatibility(version);
    val dataS = js.JSON.stringify(data);
    dataType match {
      case Weapon.dataType        => addWeapons(dataS)
      case Ammo.dataType          => addAmmo(dataS)
      case MorphModel.dataType    => addMorphModels(dataS)
      case MorphInstance.dataType => addMorphInstances(dataS)
      case EPTrait.dataType       => addTraits(dataS)
      case _                      => throw new RuntimeException(s"Unkown datatype $dataType")
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
      searchIn(lowNeedle, traits)).flatten;
    matches.sortBy(_._1).reverse.map(_._2)
  }

  private def searchIn[D](needle: String, m: scala.collection.Map[String, D]): List[(WordMatch, D)] = {
    m.flatMap {
      case (name, data) => {
        val m = WordMatch.matchFor(needle, name);
        if (m.isSignificant()) {
          Some((m -> data))
        } else {
          None
        }
      }
    }.toList
  }

  private def closestMatch[D](ranked: List[(WordMatch, D)]): Option[D] = {
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

  private def closestMatch[D](needle: String, m: scala.collection.Map[String, D]): Option[D] = closestMatch(rank(needle, m));

  private def rank[D](needle: String, m: scala.collection.Map[String, D]): List[(WordMatch, D)] = {
    val lowNeedle = needle.toLowerCase();
    val matches = m.map(t => (WordMatch.matchFor(lowNeedle, t._1) -> t._2)).toList;
    matches.sortBy(_._1).reverse
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

  private def checkCompatibility(version: String): Unit = {
    for {
      thisV <- SemanticVersion.fromString(this.version);
      thatV <- SemanticVersion.fromString(version)
    } yield {
      if (thisV >= thatV) {
        val diff = thisV - thatV;
        if (diff.major != 0) {
          throw new RuntimeException(s"Data version ($version) is invalid! Must be same major as script version ($this.version)");
        }
      } else {
        throw new RuntimeException(s"Data version ($version) may not be greater than script version ($this.version)");
      }
    }
  }
}
