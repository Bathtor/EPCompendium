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

  private val weapons = mutable.SortedMap.empty[String, Weapon];
  private val morphsByModel = mutable.SortedMap.empty[String, Morph];
  private val morphsByLabel = mutable.SortedMap.empty[String, Morph];

  @JSExport
  def addData(version: String, dataType: String, data: js.Any): Unit = {
    checkCompatibility(version);
    val dataS = js.JSON.stringify(data);
    dataType match {
      case Weapon.dataType => addWeapons(dataS)
      case Morph.dataType  => addMorphs(dataS)
      case _               => throw new RuntimeException(s"Unkown datatype $dataType")
    }
  }

  def findAnything(needle: String): List[ChatRenderable] = {
    val lowNeedle = needle.toLowerCase();
    val searchSpace: List[(String, ChatRenderable)] = weapons.toList ++ morphsByModel.toList ++ morphsByLabel.toList;
    val matches = searchSpace.map(t => (WordMatch.matchFor(lowNeedle, t._1) -> t._2));
    matches.filter(_._1.isSignificant()).sortBy(_._1).reverse.map(_._2)
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

  private def addMorphs(s: String): Unit = {
    val data = read[List[Morph]](s);
    data.foreach { m =>
      morphsByModel += (m.model -> m)
      m.label match {
        case Some(l) => morphsByLabel += (l -> m)
        case None    => // nothing
      }
    };
    Roll20API.log(s"INFO: EPCompendium added ${data.size} morphs.");
  }

  def getMorph(name: String): Option[Morph] = morphsByLabel.get(name).orElse(morphsByModel.get(name));
  def getMorphModel(name: String): Option[Morph] = morphsByModel.get(name);
  def getMorphCustom(name: String): Option[Morph] = morphsByLabel.get(name);
  def findMorph(needle: String): Option[String] = closestMatch(findMorphs(needle));
  def findMorphs(needle: String): List[WordMatch] = {
    val byModel = rank(needle, morphsByModel.keysIterator);
    val byLabel = rank(needle, morphsByLabel.keysIterator);
    (byLabel ++ byModel).sorted.reverse
  }

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
