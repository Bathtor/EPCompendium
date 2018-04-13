package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium.utils.OptionPickler._
import com.lkroll.ep.compendium._
import java.io.{ File, PrintWriter }

object JsonGenerator {
  val blades = addWrapper(Weapon.dataType, write(Blades.list));
  val kinetic = addWrapper(Weapon.dataType, write(KineticWeapons.list));
  val rail = addWrapper(Weapon.dataType, write(KineticWeapons.railguns));
  val beam = addWrapper(Weapon.dataType, write(BeamWeapons.list));
  val seekers = addWrapper(Weapon.dataType, write(Seekers.list));
  val spray = addWrapper(Weapon.dataType, write(SprayWeapons.list));
  val exotic = addWrapper(Weapon.dataType, write(ExoticWeapons.list));
  val morphs = addWrapper(MorphModel.dataType, write(Morphs.list));
  val morphExamples = addWrapper(MorphInstance.dataType, write(MorphExamples.list));
  val traits = addWrapper(EPTrait.dataType, write(Traits.list));
  val data = List(blades, kinetic, rail, beam, seekers, spray, exotic, morphs, morphExamples, traits).mkString("", ";\n  ", ";\n");

  def main(args: Array[String]): Unit = {
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
    val p = Runtime.getRuntime.exec(Array("/Applications/Sublime Text.app/Contents/SharedSupport/bin/subl", f.getAbsolutePath));
    p.waitFor();
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
  private val authorRef = """
/*
 * This material was transcribed and collected by the following authors:
 * - [Lars Kroll](mailto:bathtor@googlemail.com)
 * Its sources can be found on [Github](https://github.com/Bathtor/EPCompendium).
 */
""";
}
