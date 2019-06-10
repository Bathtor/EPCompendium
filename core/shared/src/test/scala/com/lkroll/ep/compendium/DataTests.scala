package com.lkroll.ep.compendium

import org.scalatest._
import com.lkroll.ep.compendium.utils.OptionPickler._
import io.lemonlabs.uri.Url

class DataTests extends FunSuite with Matchers {
  import utils.Implicits.instance2Option;

  test("Data Import/Export should work") {
    val example: Data = Gear(
      name = "Shroud",
      category = "Covert and Espionage Tech",
      descr = "Also known as a privacy cloak or a “Gabby Coat,” after the designer, Kalim Ghabil, a shroud is a whole-body smart-fabric covering, similar to a burkha, designed to provide as much anonymity as possible to the wearer. Electrostatic elements randomly stiffen, mold, and relax to mask gait analysis, foot covers change shape and redistribute weight to throw biometric analysis, and the entire garment emits randomly shifting heat patterns, pheromones, and odorants and broadcasts white noise to mask sounds and conversations from eavesdropping. The person inside cannot be detected with normal vision; the shroud blocks t-ray, x-ray, and infrared scanners (note that the shroud does not hide from view like an invisibility cloak; these scanners detect the shroud’s presence quite easily, but they cannot get a reading on what is underneath). Gait analysis will also fail to recognize the shrouded person. An electrical field may be activated in the shroud’s surface to block all wireless radio signals; this cuts the wearer off from the mesh, but also defeats any attempts to wirelessly track them and silences any bugs or tracking devices they may unknowingly carry.\nShrouds are an acceptable form of personal privacy in some habitats, but are considered unusual or may even be illegal in others.",
      price = Cost.High,
      source = "Panopticon",
      sourcePage = 151);

    val outS = write(example.described);
    println(outS);
    val inD = read[DescribedData](outS);
    example should equal (inD.value);
  }

  test("ImageSources should read") {
    val image = Image(
      key = "test",
      source = UrlImageSource(Url(scheme = "http", host = "localhost", port = 8088, path = "test.png")),
      metadata = ImageMetadata(
        caption = "Test Image.",
        source = "Nowhere",
        author = "Me",
        license = "CC"));

    val serdeImage = image.toSerialisable;
    val outS = write(serdeImage);
    println(outS);
    val inD = read[SerdeImage](outS);
    serdeImage should equal (inD);
  }
}
