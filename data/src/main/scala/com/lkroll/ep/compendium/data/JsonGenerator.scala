package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium.utils.OptionPickler._
import com.lkroll.ep.compendium._
import java.io.{File, PrintWriter}

object JsonGenerator {
  val weapons = AllData.weapons.map(w => addWrapper(Weapon.dataType, write(w)));
  val weaponAccessories = AllData.weaponAccessories.map(w => addWrapper(WeaponAccessory.dataType, write(w)));
  val morphModels = AllData.morphModels.map(m => addWrapper(MorphModel.dataType, write(m)));
  val morphInstances = AllData.morphInstances.map(m => addWrapper(MorphInstance.dataType, write(m)));
  val ammo = AllData.ammo.map(a => addWrapper(Ammo.dataType, write(a)));
  val traits = AllData.traits.map(t => addWrapper(EPTrait.dataType, write(t)));
  val derangements = AllData.derangements.map(d => addWrapper(Derangement.dataType, write(d)));
  val disorders = AllData.disorders.map(d => addWrapper(Disorder.dataType, write(d)));
  val armour = AllData.armour.map(a => addWrapper(Armour.dataType, write(a)));
  val armourMods = AllData.armourMods.map(a => addWrapper(ArmourMod.dataType, write(a)));
  val gear = AllData.gear.map(g => addWrapper(Gear.dataType, write(g)));
  val augmentations = AllData.augmentations.map(g => addWrapper(Augmentation.dataType, write(g)));
  val substances = AllData.substances.map(s => addWrapper(Substance.dataType, write(s)));
  val software = AllData.software.map(s => addWrapper(Software.dataType, write(s)));
  val sleights = AllData.psiSleights.map(s => addWrapper(PsiSleight.dataType, write(s)));
  val skills = AllData.skills.map(s => addWrapper(SkillDef.dataType, write(s)));
  val data = List(
    weapons,
    weaponAccessories,
    morphModels,
    morphInstances,
    ammo,
    traits,
    derangements,
    disorders,
    armour,
    armourMods,
    gear,
    augmentations,
    substances,
    software,
    sleights,
    skills
  ).flatten.mkString("", ";\n  ", ";\n");

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
      val p = Runtime.getRuntime.exec(
        Array("/Applications/Sublime Text.app/Contents/SharedSupport/bin/subl", f.getAbsolutePath)
      );
      //val p = Runtime.getRuntime.exec(Array("C:\\Program Files\\Sublime Text 3\\sublime_text.exe", f.getAbsolutePath));
      p.waitFor();
    } else {
      println(s"Output was generated in ${f.getAbsolutePath}");
    }
  }

  private def addWrapper(dataType: String, data: String): String = {
    s"""EPCompendium.addData("${BuildInfo.version}", "${dataType}", $data)""";
  }

  private val licenseText =
    """
/* 
 * This material is based on *Eclipse Phase* by [Posthuman Studios](http://eclipsephase.com)
 * and is published under Creative Commons (BY-NC-SA) 3.0 [license](https://creativecommons.org/licenses/by-nc-sa/3.0/) 
 * as is the original material.
 */
""";
  private def authors: String =
    AllData.authors.map({ case (author, email) => s" * - [${author}](mailto:${email})" }).mkString("\n");
  private val authorRef = s"""
/*
 * This material was transcribed and collected by the following authors:
$authors
 * Its sources can be found on [Github](https://github.com/Bathtor/EPCompendium).
 */
""";
}
