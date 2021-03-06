package com.lkroll.ep.compendium.utils

import enumeratum._
import io.lemonlabs.uri.Url

object OptionPickler extends upickle.AttributeTagged {
  implicit override def OptionWriter[T: Writer]: Writer[Option[T]] =
    implicitly[Writer[T]].comap[Option[T]] {
      case None    => null.asInstanceOf[T]
      case Some(x) => x
    };

  implicit override def OptionReader[T: Reader]: Reader[Option[T]] =
    implicitly[Reader[T]].mapNulls {
      case null => None
      case x    => Some(x)
    };

  trait UPickleEnum[A <: EnumEntry] { self: Enum[A] =>

    implicit val uPickleReadWriter: ReadWriter[A] =
      readwriter[String].bimap[A](x => x.entryName, str => this.withName(str));

  }

  implicit val urlReadWriter: ReadWriter[Url] = readwriter[String].bimap[Url](x => x.toString(), str => Url.parse(str));
}
