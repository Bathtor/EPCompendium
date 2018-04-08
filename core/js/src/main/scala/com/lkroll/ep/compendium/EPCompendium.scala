package com.lkroll.ep.compendium

import collection.mutable
import scalajs.js
import scalajs.js.annotation._
import com.lkroll.ep.compendium.utils.{ SemanticVersion, EditDistance }
import com.lkroll.roll20.api.facade.Roll20API
import upickle._
import upickle.default._

@JSExportTopLevel("EPCompendium")
object EPCompendium {

  val version: String = BuildInfo.version;

  private val weapons = mutable.SortedMap.empty[String, Weapon];

  @JSExport
  def addData(version: String, dataType: String, data: js.Any): Unit = {
    checkCompatibility(version);
    val dataS = js.JSON.stringify(data);
    dataType match {
      case Weapon.dataType => addWeapons(dataS)
      case _               => throw new RuntimeException(s"Unkown datatype $dataType")
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
  def findWeapon(needle: String): Option[String] = closestMatch(needle, weapons.keysIterator);
  def findWeapons(needle: String): List[WordMatch] = rank(needle, weapons.keysIterator);

  private def closestMatch(needle: String, set: Iterator[String]): Option[String] = {
    if (set.isEmpty) {
      return None;
    }
    val ranked = rank(needle, set);
    val first = ranked.head;
    if (first.isSignificant()) {
      Some(first.word)
    } else {
      None
    }
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
