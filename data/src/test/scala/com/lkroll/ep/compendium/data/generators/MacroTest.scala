package com.lkroll.ep.compendium.data.generators

import org.scalatest._
import org.scalatest.funsuite._
import org.scalatest.matchers.should._
import scala.collection.mutable
import com.lkroll.ep.compendium._
import com.lkroll.ep.compendium.utils.OptionPickler._

class MacroTest extends AnyFunSuite with Matchers {
  import ESMacroPickles._;
  val testMacro = Roll20Macro("Search", "!epcompendium-data --search ?{Search for} --name-only --rank");
  val testMacroEs = ESMacroAttributes(testMacro, false, "all");
  val macros = ESMacroExport2(List(ESMacro(testMacroEs, ESMacrobar())));

  test("ES Macros should serialise properly") {
    val ser = write(macros);
    //println(ser);
    val expected =
      """{"schema_version":2,"macros":[{"attributes":{"action":"!epcompendium-data --search ?{Search for} --name-only --rank","istokenaction":false,"name":"Search","visibleto":"all"},"macrobar":{"color":null,"name":null}}]}""";
    ser should ===(expected);
  }
}
