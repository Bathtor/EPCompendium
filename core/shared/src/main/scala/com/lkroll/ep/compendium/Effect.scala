package com.lkroll.ep.compendium

import enumeratum._
import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}

sealed trait Effect {
  def text: String;
}
object Effect {
  implicit def rw: RW[Effect] =
    RW.merge(
      macroRW[SpeedMod],
      macroRW[MOAMod],
      macroRW[IniMod],
      macroRW[AptitudeMod],
      macroRW[SkillMod],
      macroRW[DurMod],
      macroRW[IgnoreWounds],
      macroRW[IgnoreTraumas],
      macroRW[LucMod],
      macroRW[DamageEffect],
      macroRW[FreeForm]
    );

  def render(l: List[Effect]) =
    l.foldLeft("")(
      (acc, e) =>
        if (acc.isEmpty()) {
          e.text
        } else {
          acc + " & " + e.text
        }
    );

  private def modToString(i: Int): String = if (i > 0) s"+$i" else i.toString;

  @upickle.implicits.key("SpeedMod")
  case class SpeedMod(mod: Int) extends Effect {
    override def text: String = s"${modToString(mod)} SPD";
  }

  @upickle.implicits.key("MOAMod")
  case class MOAMod(mod: Int) extends Effect {
    override def text: String = s"${modToString(mod)} MOA";
  }

  @upickle.implicits.key("IniMod")
  case class IniMod(mod: Int) extends Effect {
    override def text: String = s"${modToString(mod)} INI";
  }

  @upickle.implicits.key("AptitudeMod")
  case class AptitudeMod(apt: Aptitude, mod: Int) extends Effect {
    override def text: String = s"${modToString(mod)} ${apt.label}";
  }

  @upickle.implicits.key("SkillMod")
  case class SkillMod(skill: String, field: Option[String] = None, mod: Int) extends Effect {
    def text: String = field match {
      case Some(f) => s"${modToString(mod)} $skill ($f) skill"
      case None    => s"${modToString(mod)} $skill skill"
    }
  }

  @upickle.implicits.key("DurMod")
  case class DurMod(mod: Int) extends Effect {
    override def text: String = s"${modToString(mod)} DUR";
  }

  @upickle.implicits.key("IgnoreWounds")
  case class IgnoreWounds(n: Int) extends Effect {
    override def text: String = s"Ignore modifiers from $n wounds";
  }

  @upickle.implicits.key("IgnoreTraumas")
  case class IgnoreTraumas(n: Int) extends Effect {
    override def text: String = s"Ignore modifiers from $n traumas";
  }

  @upickle.implicits.key("LucMod")
  case class LucMod(mod: Int) extends Effect {
    override def text: String = s"${modToString(mod)} LUC";
  }

  @upickle.implicits.key("DamageEffect")
  case class DamageEffect(dmg: Damage, freq: Time) extends Effect {
    override def text: String = s"${dmg.dmgString}DV every ${freq.renderLong}";
  }

  @upickle.implicits.key("FreeForm")
  case class FreeForm(text: String) extends Effect;
}
