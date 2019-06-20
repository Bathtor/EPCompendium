package com.lkroll.ep

package object compendium {

  implicit class ExtraInt(i: Int) {
    def d10: D10 = D10(i);
    def asMod: String =
      if (i == 0) {
        "0"
      } else if (i > 0) {
        s"+$i"
      } else {
        i.toString()
      };
  }

  implicit class ExtraFloat(f: Float) {
    def asFactor: String =
      if (f == 1.0f) {
        "–"
      } else if (f > 1.0f) {
        s"+${(f - 1.0f).asPercent}"
      } else {
        s"-${(1.0f - f).asPercent}"
      }
    def asPercent: String = s"${(f * 100.0f).toInt}%";
  }

  def ceilDiv(x: Int, y: Int): Int = {
    assert(x >= 0);
    assert(y > 0);
    (x + y - 1) / y;
  }
}
