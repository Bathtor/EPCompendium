package com.lkroll.ep

package object compendium {

  implicit class ExtraInt(i: Int) {
    def d10: D10 = D10(i);
  }

  def ceilDiv(x: Int, y: Int): Int = {
    assert(x >= 0);
    assert(y > 0);
    (x + y - 1) / y;
  }
}
