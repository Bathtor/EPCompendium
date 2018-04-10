package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object Morphs {
  implicit def int2aptv(i: Int): AptitudeValues = AptitudeValues.max(i);
  implicit def int2opt(i: Int): Option[Int] = Some(i);
  implicit def tuple2toopt(t: (Int, Int)): Option[(Int, Int)] = Some(t);
  implicit def tuple2skillmod(t: (String, Int)): SkillMod = SkillMod(t._1, None, t._2);

  val blackbird = Morph(
    model = "Blackbird",
    morphType = MorphType.Synthmorph,
    descr = "When they’re seen at all, these morphs resemble a matte gray neo-corvid with many odd, sharp angles. Blackbirds are consummate stealth morphs, designed to evade visual observation and radar during recon or infiltration. In part due to aesthetics, they’re a favorite of neo-ravens.",
    enhancements = Seq("Access Jacks", "Basic Mesh Inserts", "Cortical Stack", "Cyberbrain", "Enhanced Hearing", "Enhanced Vision", "Invisibility", "Mnemonic Augmentation", "Puppet Sock", "Reduced Signature", "Wings"),
    traits = Seq("Small Size"),
    movement = Seq("Walker 2/16", "Hopper 4/20", "Winged 8/40"),
    aptitudeMax = 30.copy(som = Some(20)),
    aptitudeBonus = AptitudeValues(coo = 5, ref = 5),
    skillBonus = Seq(("Flight" -> 10), ("Infiltration" -> 10)),
    playerDecisions = Some("+5 to one other aptitude"),
    attacks = Seq(MorphAttacks.beakAttack),
    durability = 25,
    armour = (2, 2),
    cpCost = 45,
    price = Cost.ExpensivePlus(45000),
    source = "Morph Recognition Guide");

  val list: List[Morph] = Macros.memberList[Morph];
}

object MorphAttacks {
  val beakAttack = Weapon(
    name = "Beak/Claw Attack",
    `type` = WeaponType.Unarmed,
    descr = "Blackbird's Beak/Claw Attack",
    dmgD10 = 1,
    dmgConst = 1,
    dmgType = DamageType.Kinetic,
    effect = None,
    ap = -1,
    price = Cost.Trivial, // doesn't really matter
    range = Range.Melee,
    source = "Morph Recognition Guide");
}
