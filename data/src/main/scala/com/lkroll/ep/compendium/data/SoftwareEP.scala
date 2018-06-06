package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object SoftwareEP {

  val arIllusions = Software(
    name = "AR Illusions",
    descr = "These databases of AR clips can be used to create realistic illusions in someone’s entoptic display. see Augmented Reality Illusions, EP p. 259.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 331);

  val encryption = Software(
    name = "Encryption",
    descr = "Crypto software generates key pairs, encrypts messages using public keys, and decrypts with secret keys. See Encryption, EP p. 253.",
    price = Cost.Low,
    source = Sources.ep, sourcePage = 331);

  val exploit = Software(
    name = "Exploits",
    descr = "Exploits are hacker tools that take advantage of known vulnerabilities in other software. They are required for intrusion attempts (EP p. 254).",
    price = Cost.High,
    source = Sources.ep, sourcePage = 331);

  val fiRecognition = Software(
    name = "Facial/Image Recognition",
    descr = "This program can be used to take an image and run a pattern-matching search among public archives. Similar version of this program exist for other biometrics: gait recognition, vocal recognition, etc.",
    price = Cost.Low,
    source = Sources.ep, sourcePage = 331);

  val firewall = Software(
    name = "Firewall",
    descr = "This program protects a device from hostile intrusion. Every system comes with a standard version of this software by default.",
    price = Cost.Low,
    source = Sources.ep, sourcePage = 331);

  val sniffer = Software(
    name = "Sniffer",
    descr = "Sniffer programs collect all of the transmission that pass to, from, or through the device they are running on. See Sniffing, EP p. 252.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 331);

  val spoof = Software(
    name = "Spoof",
    descr = "Spoof is a hacker tool used to fake commands and transmissions, making them seem as if they came from another source. See Spoofing Authentication, EP p. 255.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 331);

  val tacticalNetworks = Software(
    name = "Tactical Networks",
    descr = "These programs allow people in the same squad to share tactical data in real-time. See Tactical Networks, EP p. 205.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 331);

  val tracking = Software(
    name = "Tracking",
    descr = "This software is used to track people by their presence online. See Scanning, Tracking, and Monitoring, EP p. 251.",
    price = Cost.Moderate,
    source = Sources.ep, sourcePage = 331);

  val xp = Software(
    name = "XP",
    descr = "Experience playback recordings are clips of someone else’s experiences. Depending on the content, some XP (porn, snuff, crime, etc.) may be restricted in certain jurisdictions. Some XP clips are intentionally modified so that their emotive tracks are more intense, giving the viewer a greater thrill.\nCost ranges from Low to High",
    price = Cost.Low,
    source = Sources.ep, sourcePage = 331);

  // Scorchers
  val bedlam = Software(
    name = "Bedlam",
    descr = "Bedlam programs assault the ego with traumatic mental input, inflicting mental stress. Victims are overwhelmed with horrific, monstrous, sanity-ripping sensory and emotional input. Each attack inflicts 1d10 SV.",
    price = Cost.High,
    source = Sources.ep, sourcePage = 332);

  val cauterizer = Software(
    name = "Cauterizer",
    descr = "This scorch program rips into the ego with destructive neurofeedback routines. Each attack with a cauterizer inflicts 1d10 + 5 DV on the target ego. This damage is reflected as digitized neurological damage.",
    price = Cost.High,
    source = Sources.ep, sourcePage = 332);

  val nightmare = Software(
    name = "Nightmare",
    descr = "Nightmare programs trigger anxiety and panic attacks within the victim by stimulating the neural circuitry representing the amygdala and hippocampus. The target ego must make a WIL × 2 Test. If they succeed, they are shaken but otherwise unaffected, suffering a –10 modifier to all actions until the end of the next Action Turn. If they fail, they suffers 1d10 ÷ 2 stress damage and are overcome with panic. This causes them either to blindly flee, have a nervous breakdown, or cower in frozen shock (gamemaster’s discretion). This panic episode lasts for 1 Action Turn per 10 points of MoF.",
    price = Cost.High,
    source = Sources.ep, sourcePage = 332);

  val shutter = Software(
    name = "Shutter",
    descr = "Shutters target the victim’s sensory cortices, inflicting a –30 modifier to one chosen sense. Double this modifier if the attacking hacker scored an Excellent Success. This modifier reduces at the rate of 10 points per Action Turn.",
    price = Cost.High,
    source = Sources.ep, sourcePage = 332);

  val spasm = Software(
    name = "Spasm",
    descr = "Spasm programs are design to incapacitate the ego with excruciating pain. Affected targets must immediately make a WIL × 2 Test. If they fail, they immediately convulse, are disabled, and writhe in agony for 1 Action Turns per 10 full points of MoF. If they succeed, they still suffer a –30 modifier to all actions, which reduces at the rate of 10 points per Action Turn. Due to the nature of the delivery, pain tolerance of any sort has no effect.",
    price = Cost.High,
    source = Sources.ep, sourcePage = 332);

  // skillsoft
  val skillsoft = Software(
    name = "Standard Skillsoft",
    descr = "These programs provide the character with a rating of up to 40 in a single Active skill.",
    price = Cost.High,
    source = Sources.ep, sourcePage = 332);

  val list: List[Software] = Macros.memberList[Software];
}
