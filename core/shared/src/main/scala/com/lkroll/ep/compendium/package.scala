package com.lkroll.ep

package object compendium {
  def ceilDiv(x: Int, y: Int): Int = {
    assert(x >= 0);
    assert(y > 0);
    (x + y - 1) / y;
  }
}
