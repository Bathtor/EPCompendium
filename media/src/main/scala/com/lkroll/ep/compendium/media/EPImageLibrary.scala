package com.lkroll.ep.compendium.media

import com.lkroll.ep.compendium._;

object EPImageLibrary {

  val allMedia: List[Image[ClassPathImageSource]] = MorphRecognitionGuide.list ++
    EclipsePhaseCore.list ++
    Firewall.list ++
    Gatecrashing.list ++
    Panopticon.list;

  private lazy val index: Map[String, List[Image[_]]] = {
    val builder = scala.collection.mutable.Map.empty[String, List[Image[_]]].withDefaultValue(List.empty);
    allMedia.foreach { img =>
      val cur = builder(img.key);
      builder += (img.key -> (img :: cur));
    }
    builder.toMap
  };

  def getImages(key: String): List[Image[_]] = index.getOrElse(key, List.empty);
  def getImagesForData(data: DescribedData): List[Image[_]] = {
    val key = imageKeyFromDescribed(data);
    getImages(key)
  }

}
