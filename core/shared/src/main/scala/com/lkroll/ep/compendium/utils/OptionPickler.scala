package com.lkroll.ep.compendium.utils

import enumeratum._

object OptionPickler extends upickle.AttributeTagged {
  override implicit def OptionWriter[T: Writer]: Writer[Option[T]] =
    implicitly[Writer[T]].comap[Option[T]] {
      case None    => null.asInstanceOf[T]
      case Some(x) => x
    };

  override implicit def OptionReader[T: Reader]: Reader[Option[T]] =
    implicitly[Reader[T]].mapNulls{
      case null => None
      case x    => Some(x)
    };

  trait UPickleEnum[A <: EnumEntry] { self: Enum[A] =>

    implicit val uPickleReadWriter: ReadWriter[A] = readwriter[String].bimap[A](
      x => x.entryName,
      str => this.withName(str));

  }
}
