package com.lkroll.ep.compendium

import utils.OptionPickler.{ReadWriter => RW, macroRW}

sealed trait Cost extends ChatRenderable {
  def text: String;
  def range: (Int, Int);
  def average: Int;
  override def templateKV: Map[String, String] = Map("Cost" -> text);

  def increment: Cost;
  def decrement: Cost;
}
object Cost {
  implicit def rw: RW[Cost] =
    RW.merge(macroRW[None.type],
             macroRW[Trivial.type],
             macroRW[Low.type],
             macroRW[Moderate.type],
             macroRW[High.type],
             macroRW[Expensive.type],
             macroRW[ExpensivePlus]);

  @upickle.implicits.key("None")
  case object None extends Cost {
    override def text: String = "None";
    override def range: (Int, Int) = (0, 0);
    override def average: Int = 0;
    override def increment: Cost = Trivial;
    override def decrement: Cost = None;
  }

  @upickle.implicits.key("Trivial")
  case object Trivial extends Cost {
    override def text: String = "Trivial";
    override def range: (Int, Int) = (1, 99);
    override def average: Int = 50;
    override def increment: Cost = Low;
    override def decrement: Cost = None;
  }
  @upickle.implicits.key("Low")
  case object Low extends Cost {
    override def text: String = "Low";
    override def range: (Int, Int) = (100, 499);
    override def average: Int = 250;
    override def increment: Cost = Moderate;
    override def decrement: Cost = Trivial;
  }
  @upickle.implicits.key("Moderate")
  case object Moderate extends Cost {
    override def text: String = "Moderate";
    override def range: (Int, Int) = (500, 1499);
    override def average: Int = 1000;
    override def increment: Cost = High;
    override def decrement: Cost = Low;
  }
  @upickle.implicits.key("High")
  case object High extends Cost {
    override def text: String = "High";
    override def range: (Int, Int) = (1500, 9999);
    override def average: Int = 5000;
    override def increment: Cost = Expensive;
    override def decrement: Cost = Moderate;
  }
  @upickle.implicits.key("Expensive")
  case object Expensive extends Cost {
    override def text: String = "Expensive";
    override def range: (Int, Int) = (10000, 30000);
    override def average: Int = 20000;
    override def increment: Cost = ExpensivePlus(30000);
    override def decrement: Cost = High;
  }
  @upickle.implicits.key("ExpensivePlus")
  case class ExpensivePlus(minimum: Int) extends Cost {
    override def text: String = s"Expensive (minimum $minimum)";
    override def range: (Int, Int) = (30000, Int.MaxValue);
    override def average: Int = Int.MaxValue;
    override def increment: Cost = ExpensivePlus(minimum + 5000);
    override def decrement: Cost = if (minimum < 25000) Expensive else ExpensivePlus(minimum - 5000);
  }
}
