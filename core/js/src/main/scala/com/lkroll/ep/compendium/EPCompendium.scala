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
  private val morphModels = mutable.Map.empty[String, MorphModel];
  private val morphInstances = mutable.Map.empty[String, MorphInstance];

  @JSExport
  def addData(version: String, dataType: String, data: js.Any): Unit = {
    checkCompatibility(version);
    val dataS = js.JSON.stringify(data);
    dataType match {
      case Weapon.dataType        => addWeapons(dataS)
      case MorphModel.dataType    => addMorphModels(dataS)
      case MorphInstance.dataType => addMorphInstances(dataS)
      case _                      => throw new RuntimeException(s"Unkown datatype $dataType")
    }
  }

  def findAnything(needle: String): List[ChatRenderable] = {
    val lowNeedle = needle.toLowerCase();
    //val searchSpace: List[(String, ChatRenderable)] = weapons.toList ++ morphModels.toList ++ morphModels.toList;
    val matches: List[(WordMatch, ChatRenderable)] = List(
      searchIn(lowNeedle, weapons),
      searchIn(lowNeedle, morphModels),
      searchIn(lowNeedle, morphInstances)).flatten;
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

  private def addWeapons(s: String): Unit = {
    val data = read[List[Weapon]](s);
    data.foreach { w =>
      weapons += (w.name -> w)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} weapons.");
  }
  def getWeapon(name: String): Option[Weapon] = weapons.get(name);
  def findWeapon(needle: String): Option[String] = closestMatch(needle, weapons.keysIterator);
  def findWeapons(needle: String): List[WordMatch] = rank(needle, weapons.keysIterator);

  private def addMorphModels(s: String): Unit = {
    val data = read[List[MorphModel]](s);
    data.foreach { m =>
      morphModels += (m.name -> m)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} morph models.");
  }

  def getMorphModel(name: String): Option[MorphModel] = morphModels.get(name);
  def findMorphModel(needle: String): Option[String] = closestMatch(findMorphModels(needle));
  def findMorphModels(needle: String): List[WordMatch] = rank(needle, morphModels.keysIterator);

  private def addMorphInstances(s: String): Unit = {
    val data = read[List[MorphInstance]](s);
    data.foreach { m =>
      morphInstances += (m.label -> m)
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} morph instances.");
  }

  def getMorphCustom(name: String): Option[MorphInstance] = morphInstances.get(name);
  def findMorphInstance(needle: String): Option[String] = closestMatch(findMorphInstances(needle));
  def findMorphInstances(needle: String): List[WordMatch] = rank(needle, morphInstances.keysIterator);

  private def closestMatch(ranked: List[WordMatch]): Option[String] = {
    if (ranked.isEmpty) {
      return None;
    }
    val first = ranked.head;
    if (first.isSignificant()) {
      Some(first.word)
    } else {
      None
    }
  }

  private def closestMatch(needle: String, set: Iterator[String]): Option[String] = {
    if (set.isEmpty) {
      return None;
    }
    val ranked = rank(needle, set);
    closestMatch(ranked)
  }

  private def rank(needle: String, set: Iterator[String]): List[WordMatch] = {
    val lowNeedle = needle.toLowerCase();
    val matches = set.map(WordMatch.matchFor(lowNeedle, _)).toList;
    matches.sorted.reverse
  }
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
