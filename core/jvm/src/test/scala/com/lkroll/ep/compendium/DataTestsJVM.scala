package com.lkroll.ep.compendium

import org.scalatest._
import com.lkroll.ep.compendium.utils.OptionPickler._
import io.lemonlabs.uri.Url

class DataTestsJVM extends FunSuite with Matchers {
  import utils.Implicits.instance2Option;
  import ClassPathImageSource._;

  test("ImageSources should work") {
    val image = Image(
      key = "test",
      source = "test.png".toCPSource,
      metadata = ImageMetadata(
        caption = "Test Image.",
        source = "Nowhere",
        author = "Me",
        license = "CC"));

    implicit val urlmapper = (source: ClassPathImageSource) => {
      source.toUrl(loc => Url(scheme = "http", host = "localhost", port = 8088, path = loc))
    };

    val serdeImage = image.toSerialisable;

    val outS = write(serdeImage);
    println(outS);
    val inD = read[SerdeImage](outS);
    serdeImage should equal (inD);
  }
}
