package com.lkroll.ep.compendium.data

import org.rogach.scallop._

class Conf(_args: Seq[String]) extends ScallopConf(_args) {
  val script = opt[Boolean](descr = "Generate the API script that imports values into EPCompendium.");
  val macros = opt[Boolean](descr = "Generate Roll20 macros to be able to import with dropdown menues.");
  val open = opt[Boolean](descr = "Open output in Sublime Text");
  requireOne(script, macros);
  dependsOnAny(open, List(script, macros));
  verify()
}

object Main {
  def main(args: Array[String]) {
    val conf = new Conf(args);
    if (conf.script()) {
      JsonGenerator.generate(conf.open());
    } else if (conf.macros()) {
      MacroGenerator.generate(conf.open());
    } else {
      ???
    }
  }
}
