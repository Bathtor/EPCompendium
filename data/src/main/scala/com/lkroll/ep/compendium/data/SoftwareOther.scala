package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object SoftwareOther {
  // Firewall
  val infectionScanner = Software(
    name = "Infection Scanner",
    descr = "This software, which is developed, maintained, and updated by the argonauts, scans software of all types—including files, system processes, ego backups, and infomorphs—for digital exsurgent virus infection. Scanning takes anywhere from 1 Turn (simple files) to 1 hour (infomorphs and backups), depending on the complexity of the software. See Exsurgent Virus Detection (p. 177), for details on handling scans. Note that encrypted software cannot be analyzed.\nWhile the argonaut software is free and open source, various proprietary and forked spin-offs exist with differing costs, detec-tion rates, and specializations.",
    price = Cost.None,
    source = Sources.firewall, sourcePage = 178);

  // Panopticon
  val behavioralPsych = Software(
    name = "Behavioural Psych",
    descr = "When provided with data on a particular person and their activities, this software can build a psychological profile. The larger the data set—sensor scans, mesh activity, public profile, relationship maps, location tracking, medical history, lifelogs—the deeper and more accurate the analysis. Treat this as an Academics: Psychology skill of 80 or apply a +20 modifier to a character using this software to aid a psychology or behavior-related analysis test.",
    price = Cost.High,
    source = Sources.panopticon, sourcePage = 156);

  val eventReconstruction = Software(
    name = "Event Reconstruction Software",
    descr = "The latest forensic method used by crime scene investigators, event reconstruction software takes sensor data and applies predictive algorithms to build a reconstruction of a past event. This combined data can be used to run a simulspace scenario of the event and its possible permutations. Apply a +20 modifier to Investigation Tests.",
    price = Cost.High,
    source = Sources.panopticon, sourcePage = 156);

  val kinesics = Software(
    name = "Kinesics Software",
    descr = "Kinesics software measures voice stress patterns or analyzes other sensory input to monitor for deception, hostile intent, and other emotional states. It functions with a Kinesics skill of 40 or provides a +10 modifier to a Kinesics Test made by someone using it.",
    price = Cost.Moderate,
    source = Sources.panopticon, sourcePage = 156);

  val probabilityMapping = Software(
    name = "Probability Mapping",
    descr = "Though most effective with massive data sets and quantum computers, a standard user and their muse can still benefit from using probability mapping software to predict things like traffic, peak travel times, crime rates, and other periodic and habitual events. When supplied with data on a particular person, this software can make a guess as to their likely current whereabouts, activities, and possibly even moods and other factors. ",
    price = Cost.High,
    source = Sources.panopticon, sourcePage = 156);

  val radioMotion = Software(
    name = "Radio Motion Detection",
    descr = "Technically known as variance-based radio tomographic imaging, this sensing technique can be used with any wireless radio devices. It is especially useful in urban areas, where wireless devices are everywhere. Because this system is passive, using existing signals, it does not alert the target. To detect motion in a target area, the software measures and analyzes the transmission and reception of radio signals originating on opposing sides of the target area. Variations in these signals detect movement in the area, which can be overlaid on a map of the area to pinpoint target locations. Since wireless radio signals penetrate walls and other obstructions, this can be used to identify unseen movement inside a structure, without giving away the scanning as t-rays or radar would. This method is roughly accurate to within 5 meters, −1 meter per 10 points of MoS on an Interfacing Test. Resolution is poor, with few details on the target provided.",
    price = Cost.Low,
    source = Sources.panopticon, sourcePage = 156);

  val relationshipMapping = Software(
    name = "Relationship Mapping",
    descr = "This software uses publicly available data, as well as any other information supplied, to build a relationship map marking a specific target’s known and likely associates and interactions. Aside from analyzing public profiles and online interactions, it also accesses mesh tracking logs to pinpoint incidents of physical proximity. It is useful for identifying a person’s social relationships, including friends, relatives, lovers, co-workers, conspirators, and so on. At the game-master’s discretion, this may provide a modifier for Investigation or Networking Tests.",
    price = Cost.Moderate,
    source = Sources.panopticon, sourcePage = 156);

  val list: List[Software] = Macros.memberList[Software];
}
