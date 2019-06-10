package com.lkroll.ep.compendium

package object media {
  implicit def imageKeyFromData(d: Data): String = {
    val dd = d.described;
    imageKeyFromDescribed(dd)
  }
  implicit def imageKeyFromDescribed(dd: DescribedData): String = {
    val prefix = dd.getClass.getSimpleName;
    s"${prefix}-${dd.value.lookupName}"
  }
}
