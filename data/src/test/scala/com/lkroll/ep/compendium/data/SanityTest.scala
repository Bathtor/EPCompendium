package com.lkroll.ep.compendium.data

import org.scalatest._
import org.scalatest.funsuite._
import org.scalatest.matchers.should._
import scala.collection.mutable
import com.lkroll.ep.compendium._
import com.lkroll.ep.compendium.utils.OptionPickler._

class SanityTest extends AnyFunSuite with Matchers {

  test("All lookup names must be unique") {
    val allIds = mutable.Set.empty[String];
    val lookup = mutable.Map.empty[String, DescribedData];

    AllData.described.foreach { dd =>
      val id = dd.value.lookupName;
      if (allIds.contains(id)) {
        Console.err.println(s"Id ${id} appeared twice:");
        Console.err.println(dd.toString());
        Console.err.println(lookup(id).toString());
      }
      allIds should not contain (id);
      allIds += id;
      lookup += (id -> dd);
    }
  }

  test("All items must correctly serialise and deserialise") {
    AllData.described.foreach { dd =>
      val jsStr: String =
        try {
          write(dd);

        } catch {
          case t: Throwable => {
            Console.err.println(s"Error during write of ${dd}");
            fail(t)
            ???
          }
        };
      val ddRead =
        try {
          read[DescribedData](jsStr);
        } catch {
          case t: Throwable => {
            Console.err.println(s"Error during read of ${dd} from:\n${jsStr}");
            fail(t)
            ???
          }
        };
      ddRead should equal(dd);
    }
  }

  test("All items must correctly generate template entries") {
    AllData.described.foreach { dd =>
      try {
        val tempTitle = dd.value.templateTitle;
        tempTitle should not be (null);
        val tempSubTitle = dd.value.templateSubTitle;
        tempSubTitle should not be (null);
        val tempKV = dd.value.templateKV.map(t => s"${t._1} -> ${t._2}").mkString("\n");
        tempKV should not be (null);
        val tempDescr = dd.value.templateDescr;
        tempDescr should not be (null);
        if (tempTitle.equalsIgnoreCase("Grin")) {
          println(s"""=== $tempTitle ===
  --- $tempSubTitle ---
  $tempKV
  ---
  $tempDescr
""");
        }
      } catch {
        case t: Throwable => {
          Console.err.println(s"Error during templating of ${dd}");
          fail(t)
          ???
        }
      }
    }
  }
}
