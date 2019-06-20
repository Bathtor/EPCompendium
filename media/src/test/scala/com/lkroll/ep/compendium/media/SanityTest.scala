package com.lkroll.ep.compendium.media

import org.scalatest._
import scala.collection.mutable
import com.lkroll.ep.compendium._
import com.lkroll.ep.compendium.utils.OptionPickler._
import io.lemonlabs.uri.Url

class SanityTest extends FunSuite with Matchers {
  test("MRG serialise") {
    testSerialise(MorphRecognitionGuide.list)
  }
  test("ECP serialise") {
    testSerialise(EclipsePhaseCore.list)
  }
  test("Firewall serialise") {
    testSerialise(Firewall.list)
  }
  test("Gatecrashing serialise") {
    testSerialise(Gatecrashing.list)
  }
  test("Panopticon serialise") {
    testSerialise(Panopticon.list)
  }
  private def testSerialise(list: List[Image[ClassPathImageSource]]): Unit = {

    implicit val urlmapper = (source: ClassPathImageSource) => {
      source.toUrl(loc => Url(scheme = "http", host = "localhost", port = 8088, path = loc))
    };

    list.foreach { image =>
      //println(s"Key: ${image.key}");
      val serdeImage = image.toSerialisable;

      val outS = write(serdeImage);
      //println(outS);
      val inD = read[SerdeImage](outS);
      serdeImage should equal(inD);
    }
  }

  test("MRG check paths") {
    testPaths(MorphRecognitionGuide.list)
  }
  test("ECP check paths") {
    testPaths(EclipsePhaseCore.list)
  }
  test("Firewall check paths") {
    testPaths(Firewall.list)
  }
  test("Gatecrashing check paths") {
    testPaths(Gatecrashing.list)
  }
  test("Panopticon check paths") {
    testPaths(Panopticon.list)
  }
  private def testPaths(list: List[Image[ClassPathImageSource]]): Unit = {

    list.foreach { image =>
      val imageData = image.source.load();
      imageData.size should not be (0);
    }
  }
}
