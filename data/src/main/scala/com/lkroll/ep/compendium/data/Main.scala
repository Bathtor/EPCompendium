package com.lkroll.ep.compendium.data

import org.rogach.scallop._

class Conf(_args: Seq[String]) extends ScallopConf(_args) {
  val script = opt[Boolean](descr = "Generate the API script that imports values into EPCompendium.");
  val macros = opt[Boolean](descr = "Generate Roll20 macros to be able to import with dropdown menus.");
  val esmacros = opt[Boolean](descr = "Generate Roll20 Enhancement Suite importable macros.");
  val open = opt[Boolean](descr = "Open output in Sublime Text");
  requireOne(script, macros, esmacros);
  dependsOnAny(open, List(script, macros, esmacros));
  verify()
}

object Main {
  def main(args: Array[String]): Unit = {
    val conf = new Conf(args.toIndexedSeq);
    if (conf.script()) {
      generators.JsonGenerator.generate(conf.open());
    } else if (conf.macros()) {
      generators.MacroGenerator.generate(conf.open());
    } else if (conf.esmacros()) {
      generators.Roll20ESMacros.generate(conf.open());
    } else {
      ???
    }
  }
}
