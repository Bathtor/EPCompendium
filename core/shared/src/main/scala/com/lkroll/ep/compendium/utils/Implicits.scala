package com.lkroll.ep.compendium.utils

object Implicits {
  implicit def instance2Option[T](t: T): Option[T] = Some(t);
}
