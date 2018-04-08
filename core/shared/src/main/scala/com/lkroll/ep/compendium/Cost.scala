package com.lkroll.ep.compendium

import upickle.default.{ ReadWriter => RW, macroRW }

sealed trait Cost;
object Cost {
  implicit def rw: RW[Cost] = RW.merge(
    macroRW[Trivial.type],
    macroRW[Low.type],
    macroRW[Moderate.type],
    macroRW[High.type],
    macroRW[Expensive.type],
    macroRW[ExpensivePlus]);

  @upickle.key("Trivial")
  case object Trivial extends Cost;
  @upickle.key("Low")
  case object Low extends Cost;
  @upickle.key("Moderate")
  case object Moderate extends Cost;
  @upickle.key("High")
  case object High extends Cost;
  @upickle.key("Expensive")
  case object Expensive extends Cost;
  @upickle.key("ExpensivePlus")
  case class ExpensivePlus(minimum: Int) extends Cost;
  //  object ExpensivePlus {
  //    implicit def rw: RW[ExpensivePlus] = macroRW;
  //  }
}
