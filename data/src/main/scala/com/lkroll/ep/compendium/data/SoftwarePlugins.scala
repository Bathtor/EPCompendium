package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._
import com.lkroll.common.macros.Macros

object SoftwarePlugins {

  val autodelete = Software(
    name = "Autodelete",
    descr = "Though infomorphs can voluntarily delete themselves, there are some cases where a device’s permissions may not allow it or the infomorph may be trapped on a lockbox (p. 146). To prevent capture, interrogation, or slavery, the infomorph can activate the autodelete plug-in as a Quick Action, which then attempts to delete the ego, even if it is running on a device that would not ordinarily permit it to do so. Auto-delete plug-ins may also be programmed to activate in response to certain inputs: for example, a perceived code phrase, a detected cyberbrain hack attack attempt, a designated time period, or upon failure to receive a periodic message. To successfully delete the ego on a system where deletion privileges are denied, the installer of the plug-in must make a successful Infosec Test. If the system is actively monitored, this is a Variable Opposed Infosec Test against the monitor. If only the installer succeeds, the infomorph is deleted immediately. If both the installer and monitor succeed, the infomorph is corrupted but not fully deleted. At the gamemaster’s discretion, the ego may still be treated as a gamma fork or its digital remains prodded and analyzed via Psychosurgery with a –30 modifier. If the monitor alone succeeds, the auto-deletion fails and will not work again on that device. If both fail, continue to make the test again each Action Phase until one or both succeed. Forknappers and interrogators routinely check their victims for this plug-in (p. 148), so it is usually concealed with a digital veil (below). A detected plug-in may be eliminated via standard brainhacking (p. 148). This plug-in is commonly used on forks—often without their knowledge. Some polities, in fact, legally require forks to be equipped with this plug-in.",
    price = Cost.Low,
    source = Sources.transhuman, sourcePage = 139);

  val copylock = Software(
    name = "Copylock",
    descr = "This plug-in has two uses. The first prevents an info- morph from voluntarily copying/forking itself. This also prevents the ego from resleeving into a physical morph. This is a common plug-in used on forks, indentures, or people that really don’t trust themselves. This feature can be disabled with the proper passcode used by the installer. The second use is to make it more difficult for an active infomorph to be involuntarily copied. This is a common precaution infomorphs take when running on untrusted devices against the threat of forknap- ping (p. 149). Anyone that brainhacks this infomorph and attempts to make an involuntary copy suffers a –30 penalty to the Infosec Test needed to accomplish this task (in addition to the normal –30 modifier for brainhacking). Either of these features can be disabled with the proper passcode used by the installer.",
    price = Cost.Low,
    source = Sources.transhuman, sourcePage = 139);

  val digitalVeil = Software(
    name = "Digital Veil",
    descr = "This code masks the presence of any installed plug-ins and upgrades (including itself). The character must choose which are hidden (any installed after the veil is installed are not hidden unless the veil is re-installed). Anyone attempting a standard scan on the infomorph for plug-ins and upgrades (p. 148) will fail to detect the concealed software. At the gamemaster’s discretion, an Excellent Success on the scan may pick up an anomaly to warrant deeper analysis. A more thorough and lengthy scan (an Infosec or Programming Task Action with a –30 modifier and a base time of 60 minutes) will reveal the presence of 1 plug-in or upgrade, plus 1 per 10 points of MoS. This plug-in also applies a –20 modifier to psych scans (p. 148) performed on the infomorph. It is illegal in many habitats and polities.",
    price = Cost.Expensive,
    source = Sources.transhuman, sourcePage = 139);

  val emergencyBackup = Software(
    name = "Emergency Backup",
    descr = "This plug-in automatically broadcasts a copy of the infomorph’s ego through the mesh to a predetermined secure storage site every 48 hours. This interval may be voluntarily modified, keeping in mind that ego broadcasts tend to be intentionally limited as a precaution against interception/forknapping and that such transmissions hog bandwidth. To use this upgrade, characters must either purchase backup insurance or arrange for a private server to store the backup copies of their ego. To prevent ego theft, the backup copies are transmitted using quantum cryptography (p. 254, EP). To intercept and make use of an ego backup sent in this fashion, the would-be thief must somehow gain access to one of the quantum keys used in the exchange.",
    price = Cost.Moderate,
    source = Sources.transhuman, sourcePage = 140);

  val hackingAlert = Software(
    name = "Hacking Alert",
    descr = "This plug-in launches a suite of running processes running that monitor the simulated mind-state and keep track of any lost time, inconsistencies in events, or other evidence of involuntary brainhacking or psychosurgery. If the character is mind hacked or subjected to involuntary psychosurgery, the hidden/covert intruder or psychosurgeon must make an Infosec or Psychosurgery Test at –30. Cyberbrain hackers suffer the usual –30 subversion modifier, but a hidden intruder receives their standard +30 bonus. If the test does not score an Excellent Success (MoS 30+), the victim is alerted immediately (or when they next awake). Alerted infomorphs do not receive information on what has been changed (beyond the obvious), they are only informed that their mind was involuntarily altered. Note that psychosurgery or memory hacking can be used to make a victim forget the hacking alert warnings. Unless the hacking alert plug-in is also disabled or hacked, however, it will retain a log of the warnings.",
    price = Cost.Low,
    source = Sources.transhuman, sourcePage = 140);

  val persistence = Software(
    name = "Persistence",
    descr = "This software makes it more difficult for the ego to be forcibly shut down when brainhacked. Apply an additional –10 modifier to the intruder’s Infosec Test (in addition to the standard –30 modifier for brain-hacking).",
    price = Cost.Low,
    source = Sources.transhuman, sourcePage = 140);

  val list: List[Software] = Macros.memberList[Software];
}
