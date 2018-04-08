package com.lkroll.ep.compendium.data

import upickle.default._
import com.lkroll.ep.compendium._
import java.io.{ File, PrintWriter }

object JsonGenerator extends App {
  val blades = addWrapper(Weapon.dataType, write(Blades.list));
  val kinetic = addWrapper(Weapon.dataType, write(KineticWeapons.list));
  val data = List(blades, kinetic).mkString("", ";\n  ", ";\n");
  val script = s"""
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

  private def addWrapper(dataType: String, data: String): String = {
    s"""EPCompendium.addData("${BuildInfo.version}", "${Weapon.dataType}", $data)""";
  }
}
