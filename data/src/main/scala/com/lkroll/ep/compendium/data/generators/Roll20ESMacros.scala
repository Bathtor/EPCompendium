package com.lkroll.ep.compendium.data.generators

//import upickle.default._
import com.lkroll.ep.compendium.utils.OptionPickler._
import ujson.Js
import ujson.Value.InvalidData
import java.io.{File, PrintWriter}

object Roll20ESMacros {
  import ESMacroPickles._;

  val searchMacro = roll20ToES(
    Roll20Macro(name = "Search", content = "!epcompendium-data --search ?{Search for} --name-only --rank")
  );
  val randomDerangementMacro = roll20ToES(
    Roll20Macro(name = "RandomDerangement",
                content = "!epcompendium-import --derangement * --duration [[floor(1d10/2)]]")
  );
  val apiMacro = roll20ToES(
    Roll20Macro(name = "ImportApiText", content = "!epcompendium-import --from-sheet"),
    true
  );
  lazy val esData = searchMacro :: randomDerangementMacro :: MacroGenerator.data.map(m => roll20ToES(m));
  lazy val esMacros = ESMacroExport2(esData);

  private def roll20ToES(m: Roll20Macro, isTokenAction: Boolean = false): ESMacro = {
    ESMacro(ESMacroAttributes(m, isTokenAction, "all"), ESMacrobar())
  }

  def generate(open: Boolean): Unit = {
    val script: String = write(esMacros);
    val f = File.createTempFile("ep-compendium-macros", ".json");
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
}

case class ESMacroAttributes(roll20Macro: Roll20Macro, isTokenAction: Boolean, visibleTo: String)
case class ESMacrobar(color: Option[String] = None, name: Option[String] = None)
case class ESMacro(attributes: ESMacroAttributes, macrobar: ESMacrobar)
case class ESMacroExport2(macros: List[ESMacro]) {
  val schemaVersion = 2;
}

object ESMacroPickles {
  implicit val attributeReadWrite: ReadWriter[ESMacroAttributes] =
    readwriter[Map[String, Js.Value]].bimap[ESMacroAttributes](
      (attr: ESMacroAttributes) => {
        Map(
          "action" -> attr.roll20Macro.content,
          "istokenaction" -> attr.isTokenAction,
          "name" -> attr.roll20Macro.name,
          "visibleto" -> attr.visibleTo
        )
      },
      (rawMap: Map[String, Js.Value]) => {
        val action: String = rawMap("action").str;
        val isTokenAction: Boolean = rawMap("istokenaction").bool;
        val name: String = rawMap("name").str;
        val visibleTo: String = rawMap("visibleto").str;
        val roll20Macro = Roll20Macro(name, action);
        ESMacroAttributes(roll20Macro, isTokenAction, visibleTo)
      }
    );

  implicit val macrobarReadWrite: ReadWriter[ESMacrobar] =
    readwriter[Map[String, Js.Value]].bimap[ESMacrobar](
      (macrobar: ESMacrobar) => {
        Map(
          "color" -> macrobar.color.map(Js.Str(_)).getOrElse(Js.Null),
          "name" -> macrobar.name.map(Js.Str(_)).getOrElse(Js.Null)
        )
      },
      (rawMap: Map[String, Js.Value]) => {
        val color = rawMap
          .get("color")
          .flatMap(_ match {
            case Js.Str(s) => Some(s)
            case Js.Null   => None
            case v         => throw new InvalidData(v, "Expected Str or Null")
          });
        val name = rawMap
          .get("name")
          .flatMap(_ match {
            case Js.Str(s) => Some(s)
            case Js.Null   => None
            case v         => throw new InvalidData(v, "Expected Str or Null")
          });
        ESMacrobar(color, name)
      }
    );

  implicit val macroReadWrite: ReadWriter[ESMacro] =
    readwriter[Map[String, Js.Value]].bimap[ESMacro](
      (esm: ESMacro) => {
        Map(
          "attributes" -> attributeReadWrite.write(ujson.Value, esm.attributes),
          "macrobar" -> macrobarReadWrite.write(ujson.Value, esm.macrobar)
        )
      },
      (rawMap: Map[String, Js.Value]) => {
        val attributes: ESMacroAttributes = read(rawMap("attributes").obj)(attributeReadWrite);
        val macrobar: ESMacrobar = read(rawMap("macrobar").obj)(macrobarReadWrite);
        ESMacro(attributes, macrobar)
      }
    );

  implicit val macroExportReadWrite: ReadWriter[ESMacroExport2] =
    readwriter[Js.Obj].bimap[ESMacroExport2](
      (esm: ESMacroExport2) => {
        Js.Obj(
          "schema_version" -> Js.Num(esm.schemaVersion),
          "macros" -> Js.Arr(esm.macros.map(m => macroReadWrite.write(ujson.Value, m)): _*)
        )
      },
      (raw: Js.Obj) => {
        val schemaVersion: Int = raw("attributes").num.toInt;
        assert(schemaVersion == 2, "Can only unpickle schema_version=2!");
        val macros: List[ESMacro] = raw("macros").arr.map(m => read(m)(macroReadWrite)).toList;
        ESMacroExport2(macros)
      }
    );
}
