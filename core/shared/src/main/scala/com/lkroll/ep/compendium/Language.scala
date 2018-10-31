package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ ReadWriter => RW, macroRW, UPickleEnum }

sealed trait Language;
object Language {
  implicit def rw: RW[Language] = RW.merge(
    macroRW[Other.type],
    LangName.rw);

  case object Other extends Language;

  abstract class LangName(val name: String) extends Language {
    override def toString = name;
  }
  object LangName {
    implicit val rw: RW[LangName] =
      utils.OptionPickler.readwriter[String].bimap[LangName](_.name, new DeserLang(_))

    class DeserLang(_name: String) extends LangName(_name);
  }

}
