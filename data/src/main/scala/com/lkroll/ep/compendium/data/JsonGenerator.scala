package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium.utils.OptionPickler._
import com.lkroll.ep.compendium._
import java.io.{ File, PrintWriter }

object JsonGenerator {
<<<<<<< HEAD
  val blades = addWrapper(Weapon.dataType, write(Blades.list));
  val unarmed = addWrapper(Weapon.dataType, write(Unarmed.list));
  val kinetic = addWrapper(Weapon.dataType, write(KineticWeapons.list));
  val rail = addWrapper(Weapon.dataType, write(KineticWeapons.railguns));
  val beam = addWrapper(Weapon.dataType, write(BeamWeapons.list));
  val seekers = addWrapper(Weapon.dataType, write(Seekers.list));
  val spray = addWrapper(Weapon.dataType, write(SprayWeapons.list));
  val exotic = addWrapper(Weapon.dataType, write(ExoticWeapons.list));
  val morphsAC = addWrapper(MorphModel.dataType, write(MorphsAC.list));
  val morphsDF = addWrapper(MorphModel.dataType, write(MorphsDF.list));
  val morphsGL = addWrapper(MorphModel.dataType, write(MorphsGL.list));
  val morphsMN = addWrapper(MorphModel.dataType, write(MorphsMN.list));
  val morphExamples = addWrapper(MorphInstance.dataType, write(MorphExamples.list));
  val kineticAmmo = addWrapper(Ammo.dataType, write(KineticAmmo.list));
  val micromissiles = addWrapper(Ammo.dataType, write(Missiles.micro));
  val minimissiles = addWrapper(Ammo.dataType, write(Missiles.mini));
  val standardmissiles = addWrapper(Ammo.dataType, write(Missiles.standard));
  val microgrenades = addWrapper(Weapon.dataType, write(Grenades.micro));
  val grenades = addWrapper(Weapon.dataType, write(Grenades.standard));
  val posEPTraits = addWrapper(EPTrait.dataType, write(TraitsPositiveEP.list));
  val rimwardTraits = addWrapper(EPTrait.dataType, write(TraitsRimward.list));
  val sunwardTraits = addWrapper(EPTrait.dataType, write(TraitsSunward.list));
  val data = List(
    blades,
    unarmed,
    kinetic,
    rail,
    beam,
    seekers,
    spray,
    exotic,
    morphsAC,
    morphsDF,
    morphsGL,
    morphsMN,
    morphExamples,
    kineticAmmo,
    micromissiles,
    minimissiles,
    standardmissiles,
    microgrenades,
    grenades,
    posEPTraits,
    rimwardTraits,
    sunwardTraits).mkString("", ";\n  ", ";\n");
=======
  val weapons = AllData.weapons.map(w => addWrapper(Weapon.dataType, write(w)));
  val morphModels = AllData.morphModels.map(m => addWrapper(MorphModel.dataType, write(m)));
  val morphInstances = AllData.morphInstances.map(m => addWrapper(MorphInstance.dataType, write(m)));
  val ammo = AllData.ammo.map(a => addWrapper(Ammo.dataType, write(a)));
  val traits = AllData.traits.map(t => addWrapper(EPTrait.dataType, write(t)));
  val derangements = AllData.derangements.map(d => addWrapper(Derangement.dataType, write(d)));
  val disorders = AllData.disorders.map(d => addWrapper(Disorder.dataType, write(d)));
  val armour = AllData.armour.map(a => addWrapper(Armour.dataType, write(a)));
  val gear = AllData.gear.map(g => addWrapper(Gear.dataType, write(g)));
  val software = AllData.software.map(s => addWrapper(Software.dataType, write(s)));
  val data = List(
    weapons,
    morphModels,
    morphInstances,
    ammo,
    traits,
    derangements,
    disorders,
    armour,
    gear,
    software).flatten.mkString("", ";\n  ", ";\n");
>>>>>>> 66d900f69248cc4ad636174b58b0ec29e3e6fc5a

  def generate(open: Boolean): Unit = {
    val script = s"""$licenseText
$authorRef
on('ready', function() {
  $data
});
""";
    val f = File.createTempFile("ep-compendium-data", ".js");
    f.deleteOnExit();
    val w = new PrintWriter(f);
    w.append(script);
    w.flush();
    w.close();
    val size = f.length().toDouble / (1000.0 * 1000.0);
    println(s"Generated output is ${size}MB");
    if (open) {
      val p = Runtime.getRuntime.exec(Array("/Applications/Sublime Text.app/Contents/SharedSupport/bin/subl", f.getAbsolutePath));
      //val p = Runtime.getRuntime.exec(Array("C:\\Program Files\\Sublime Text 3\\sublime_text.exe", f.getAbsolutePath));
      p.waitFor();
    } else {
      println(s"Output was generated in ${f.getAbsolutePath}");
    }
  }

  private def addWrapper(dataType: String, data: String): String = {
    s"""EPCompendium.addData("${BuildInfo.version}", "${dataType}", $data)""";
  }

  private val licenseText = """
/* 
 * This material is based on *Eclipse Phase* by [Posthuman Studios](http://eclipsephase.com)
 * and is published under Creative Commons (BY-NC-SA) 3.0 [license](https://creativecommons.org/licenses/by-nc-sa/3.0/) 
 * as is the original material.
 */
""";
  private def authors: String = AllData.authors.map({ case (author, email) => s" * - [${author}](mailto:${email})" }).mkString("\n");
  private val authorRef = s"""
/*
 * This material was transcribed and collected by the following authors:
$authors
 * Its sources can be found on [Github](https://github.com/Bathtor/EPCompendium).
 */
""";
}
