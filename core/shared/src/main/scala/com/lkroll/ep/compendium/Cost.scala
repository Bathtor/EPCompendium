package com.lkroll.ep.compendium

import utils.OptionPickler.{ ReadWriter => RW, macroRW }

import scalatags.Text.all._

sealed trait Cost extends ChatRenderable {
  def text: String;
  override def templateKV: Map[String, String] = Map("Cost" -> text);
}
object Cost {
  implicit def rw: RW[Cost] = RW.merge(
    macroRW[Trivial.type],
    macroRW[Low.type],
    macroRW[Moderate.type],
    macroRW[High.type],
    macroRW[Expensive.type],
    macroRW[ExpensivePlus]);

  @upickle.key("Trivial")
  case object Trivial extends Cost {
    override def text: String = "Trivial";
  }
  @upickle.key("Low")
  case object Low extends Cost {
    override def text: String = "Low";
  }
  @upickle.key("Moderate")
  case object Moderate extends Cost {
    override def text: String = "Moderate";
  }
  @upickle.key("High")
  case object High extends Cost {
    override def text: String = "High";
  }
  @upickle.key("Expensive")
  case object Expensive extends Cost {
    override def text: String = "Expensive";
  }
  @upickle.key("ExpensivePlus")
  case class ExpensivePlus(minimum: Int) extends Cost {
    override def text: String = s"Expensive (minimum $minimum)";
  }
  //  object ExpensivePlus {
  //    implicit def rw: RW[ExpensivePlus] = macroRW;
  //  }
}
