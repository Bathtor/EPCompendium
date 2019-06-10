package com.lkroll.ep.compendium

import io.lemonlabs.uri.Url
import com.google.common.io.Resources

final case class ClassPathImageSource(location: String) extends ImageSource {
  def toUrl(mapper: String => Url): UrlImageSource = new UrlImageSource(mapper(location));

  def load(): ImageData = {
    val byteArray = Resources.toByteArray(Resources.getResource(this.getClass, "/" + location));
    ImageData(byteArray)
  }
}
object ClassPathImageSource {
  implicit def fromString(s: String): ClassPathImageSource = ClassPathImageSource(s);

  implicit class StringExt(s: String) {
    def toCPSource: ClassPathImageSource = ClassPathImageSource(s);
  }
}

case class ImageData(raw: Array[Byte]) {
  def size: Int = raw.size;
}
