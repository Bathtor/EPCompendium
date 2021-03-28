package com.lkroll.ep.compendium.utils

import org.scalatest._
import org.scalatest.funsuite._
import org.scalatest.matchers.should._

class VersionTests extends AnyFunSuite with Matchers {
  test("Version comparison should work") {
    val v1s = "1.0.0";
    val v2s = "0.12.0";
    val v1 = SemanticVersion.fromString(v1s).get;
    val v2 = SemanticVersion.fromString(v2s).get;
    val v0 = SemanticVersion(0, 0, 0, false)

    v1 should be > v2;
    v1 should be >= v2;
    v2 should not be >(v1);
    v2 should not be >=(v1);
    (v1 - v1) shouldEqual v0;
    (v2 - v2) shouldEqual v0;
    (v1 - v2) should be > v0;
    (v2 - v1) should be < v0;
  }
}
