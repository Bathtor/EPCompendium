package com.lkroll.ep.compendium

import utils.OptionPickler.{ReadWriter => RW, macroRW}

case class Armour(name: String,
                  descr: String,
                  accessory: Boolean = false,
                  armour: (Int, Int),
                  price: Cost,
                  source: String,
                  sourcePage: Int
) extends ChatRenderable
    with Data {
  override def templateTitle: String = name;
  override def templateSubTitle: String = if (accessory) "Armour Accessory" else "Armour";
  override def templateKV: Map[String, String] =
    price.templateKV ++
      Map("Armour" -> s"${armour._1}/${armour._2}", "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;

  def withMod(mod: ArmourMod): ModdedArmour = ModdedArmour(this, mod);

  override def described: DescribedData = DescribedData.ArmourD(this, BuildInfo.version);
}
object Armour {
  implicit def rw: RW[Armour] = macroRW;
  val dataType: String = "armour";
}

case class ArmourMod(name: String,
                     descr: String,
                     armour: (Int, Int) = (0, 0),
                     price: Cost,
                     source: String,
                     sourcePage: Int
) extends Data {
  override def templateTitle: String = name;
  override def templateSubTitle: String = "Armour Mod";
  override def templateKV: Map[String, String] =
    price.templateKV ++
      Map("Armour Value" -> s"${armour._1.asMod}/${armour._2.asMod}", "Source" -> s"$source p.${sourcePage}");
  override def templateDescr: String = descr;

  override def described = DescribedData.ArmourModD(this, BuildInfo.version);
}
object ArmourMod {
  implicit def rw: RW[ArmourMod] = macroRW;
  val dataType: String = "armourmod";
}

case class ModdedArmour(baseArmour: Armour, mod: ArmourMod) extends ChatRenderable with Data {
  def name: String = s"${baseArmour.name} with ${mod.name} Mod";
  def descr: String = s"""${baseArmour.descr}
  ---
${mod.descr}""";
  def accessory: Boolean = baseArmour.accessory;
  def armour: (Int, Int) = baseArmour.armour match {
    case (k, e) => (k + mod.armour._1, e + mod.armour._2)
  };

  override def templateTitle: String = name;
  override def templateSubTitle: String = if (accessory) "Armour Accessory with Mod" else "Armour with Mod";
  override def templateKV: Map[String, String] =
    Map("Armour" -> s"${armour._1}/${armour._2}");
  override def templateDescr: String = descr;

  override def described: DescribedData = DescribedData.ModdedArmourD(this, BuildInfo.version);
}
object ModdedArmour {
  implicit def rw: RW[ModdedArmour] = macroRW;
}
