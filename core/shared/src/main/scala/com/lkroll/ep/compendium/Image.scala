package com.lkroll.ep.compendium

import utils.OptionPickler.{ReadWriter => RW, macroRW, UPickleEnum}
import io.lemonlabs.uri.Url

case class ImageRef(key: String) {}
object ImageRef {
  implicit def rw: RW[ImageRef] = macroRW;
}

final case class Image[+S <: ImageSource](key: String, source: S, metadata: ImageMetadata) {
  def ref(): ImageRef = ImageRef(key);
  def mapSource[T <: ImageSource](mapper: S => T): Image[T] = this.copy(source = mapper(source));

  def toSerialisable[T <: SerdeImageSource](implicit mapper: S => T): SerdeImage = SerdeImage(mapper(source), metadata);
}
final case class SerdeImage(source: SerdeImageSource, metadata: ImageMetadata) {
  def toImage(key: String): Image[SerdeImageSource] = Image(key, source, metadata);
}
object SerdeImage {
  implicit def rw: RW[SerdeImage] = macroRW;
}

trait ImageSource;
sealed trait SerdeImageSource extends ImageSource {}
object SerdeImageSource {
  implicit def rw: RW[SerdeImageSource] = RW.merge(macroRW[UrlImageSource]);

}

case class ImageMetadata(caption: String,
                         source: Option[String] = None,
                         author: Option[String] = None,
                         license: Option[String] = None)
object ImageMetadata {
  implicit def rw: RW[ImageMetadata] = macroRW;
}

trait ImageLibrary {
  def resolve[S <: ImageSource](ref: ImageRef): Option[Image[S]];
  def resolveSerde(ref: ImageRef): Option[SerdeImage];
}

@upickle.implicits.key("UrlSource")
final case class UrlImageSource(url: Url) extends SerdeImageSource {}
object UrlImageSource {
  implicit def rw: RW[UrlImageSource] = macroRW;
}
