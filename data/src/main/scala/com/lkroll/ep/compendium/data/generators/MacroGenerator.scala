package com.lkroll.ep.compendium.data.generators

import java.io.{File, PrintWriter}
import com.lkroll.ep.compendium._
import com.lkroll.ep.compendium.data.AllData

case class Roll20Macro(name: String, content: String) {
  def toMarkdown: String = s"""
### Macro 'Import${name}'
```
$content
```
""";
}

object MacroGenerator {
  private val sep = "|";

  val weaponsData = AllData.weapons.flatten.map(_.name).sorted.mkString(sep);
  val ammoData = AllData.ammo.flatten.map(_.name).sorted.mkString(sep);
  val accessoryData = AllData.weaponAccessories.flatten.map(_.name).sorted.mkString(sep);
  val weaponWithStuff = addWeaponWithStuff(weaponsData, ammoData, accessoryData);
  val armourData = AllData.armour.flatten.map(_.name).sorted.mkString(sep);
  val armourModData = AllData.armourMods.flatten.map(_.name).sorted.mkString(sep);
  val armourWithStuff = addArmourWithStuff(armourData, armourModData);

  val morphModels = addWrapper(MorphModel.dataType, AllData.morphModels.flatten.map(_.name).sorted.mkString(sep));
  val morphInstances =
    addWrapper(MorphInstance.dataType, AllData.morphInstances.flatten.map(_.label).sorted.mkString(sep));
  val traits = addWrapper(EPTrait.dataType, AllData.traits.flatten.map(_.name).sorted.mkString(sep));
  val derangements = addWrapper(Derangement.dataType, AllData.derangements.flatten.map(_.name).sorted.mkString(sep));
  val disorders = addWrapper(Disorder.dataType, AllData.disorders.flatten.map(_.name).sorted.mkString(sep));
  val gear = addWrapper(Gear.dataType, AllData.gear.flatten.map(_.name).sorted.mkString(sep));
  val substances = addWrapper(Substance.dataType, AllData.substances.flatten.map(_.name).sorted.mkString(sep));
  val software = addWrapper(Software.dataType, AllData.software.flatten.map(_.name).sorted.mkString(sep));
  val sleights = addWrapper(PsiSleight.dataType, AllData.psiSleights.flatten.map(_.name).sorted.mkString(sep));
  val skills = addWrapper(SkillDef.dataType, AllData.skills.flatten.map(_.name).sorted.mkString(sep));
  val data: List[Roll20Macro] = List(morphModels,
                                     morphInstances,
                                     traits,
                                     derangements,
                                     disorders,
                                     armourWithStuff,
                                     gear,
                                     skills,
                                     sleights,
                                     substances,
                                     software,
                                     weaponWithStuff
  )
  val markdownData = data.map(_.toMarkdown).mkString("\n");

  def generate(open: Boolean): Unit = {
    val script = s"""
# Roll20 Macros v${BuildInfo.version}
For use with the EPCompendium Script.
$licenseText
$authorRef
## Macros
$markdownData
""";
    val f = File.createTempFile("ep-compendium-macros", ".md");
    f.deleteOnExit();
    val w = new PrintWriter(f);
    w.append(script);
    w.flush();
    w.close();
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

  private def addWrapper(dataType: String, data: String): Roll20Macro = {
    val name = dataType(0).toUpper.toString + dataType.substring(1);
    val cmd = dataType match {
      case "morphmodel"    => "morph-model"
      case "morphinstance" => "morph"
      case "skilldef"      => "skill"
      case "psisleight"    => "psi-sleight"
      case s               => s
    };
    Roll20Macro(name, s"""!epcompendium-import --${cmd} ?{Select item to import|${data}}""")
  }

  private def addWeaponWithStuff(weaponData: String, ammoData: String, accessoryData: String): Roll20Macro = {
    val name = "Weapon";
    Roll20Macro(
      name,
      s"""!epcompendium-import --weapon ?{Select weapon to import|${weaponData}} --with-accessory ?{Select weapon accessory to install|None|${accessoryData}} --with-ammo ?{Select ammo to load|None|${ammoData}}"""
    )
  }

  private def addArmourWithStuff(armourData: String, modData: String): Roll20Macro = {
    val name = "Armour";
    Roll20Macro(
      name,
      s"""!epcompendium-import --armour ?{Select armour to import|${armourData}} --with-mod ?{Select armour mod to install|None|${modData}}"""
    )
  }

  private val licenseText =
    """
## License 
This material is based on *Eclipse Phase* by [Posthuman Studios](http://eclipsephase.com)
and is published under Creative Commons (BY-NC-SA) 3.0 [license](https://creativecommons.org/licenses/by-nc-sa/3.0/) 
as is the original material.
""";
  private def authors: String =
    AllData.authors.map({ case (author, email) => s" - [${author}](mailto:${email})" }).mkString("\n");
  private val authorRef = s"""
## Authors
This material was transcribed and collected by the following authors:
$authors
Its sources can be found on [Github](https://github.com/Bathtor/EPCompendium).
""";
}
