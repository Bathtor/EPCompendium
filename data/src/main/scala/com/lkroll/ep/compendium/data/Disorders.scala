package com.lkroll.ep.compendium.data

import com.lkroll.ep.compendium._

object Disorders {

  val addiction = Disorder(
    name = "Addiction",
    descr = "Addiction as a disorder can refer to any sort of addictive behavior focused toward a particular behavior or substance, to the point where the user is unable to function without the addiction but is also severely impaired due to the effects of the addiction. It is marked by a desire on the part of the subject to seek help or reduce the use of the addicting substance/act, but also by the subject spending large amounts of time in pursuit of their addiction to the exclusion of other activities. This is a step up from the Addiction negative trait on p. 148 – this is much more of a crippling behavior that compensates for spending time away from the addiction. Addictions are typically related to the trauma that caused the disorder (VR or drug addictions are encouraged).",
    gameEffect = "The addict functions in only two states: under the influence of their addiction or in withdrawal. Additionally, they spend large amounts of time away from their other responsibilities in pursuit of their addiction.",
    source = Sources.ep,
    sourcePage = 211);

  val atavism = Disorder(
    name = "Atavism",
    descr = "Atavism is a disorder that mainly affects uplifts. It results in them regressing to an earlier un- or partially uplifted state. They may exhibit behaviors more closely in line with their more animalistic forbears, or they may lose some of their uplift benefits such as the ability for abstract reasoning or speech.",
    gameEffect = "The player and gamemaster should discuss how much of the uplift’s nature is lost and adjust game penalties accordingly. It is important to note that other uplifts view atavistic uplifts with something akin to horror and will usually have nothing to do with them.",
    source = Sources.ep,
    sourcePage = 212);

  val adhd = Disorder(
    name = "Attention Deficit Hyperactivity Disorder (ADHD)",
    descr = "This disorder manifests as a marked inability to focus on any one task for an extended period of time, and also an inability to notice details in most situations. Sufferers may find themselves starting multiple tasks, beginning a new one after only a cursory attempt at the prior task. ADHD suffers may also have a manic edge that manifests as confidence in their ability to get a given job done, even though they will quickly lose all interest in it.",
    gameEffect = "Perception and related skill penalties. Increased difficulty modifiers to task actions, particularly as the action drags on.",
    source = Sources.ep,
    sourcePage = 212);

  val autophagy = Disorder(
    name = "Autophagy",
    descr = "This is a disorder that usually only occurs among uplifted octopi. It is a form of anxiety disorder characterized by self-cannibalism of the limbs. Subjects afflicted with autophagy will, under stress, begin to consume their limbs if at all possible, causing themselves potentially serious harm.",
    gameEffect = "Anytime an uplifted octopus with this disorder is placed in a stressful situation they must make a successful WIL × 3 Test or begin to consume one of their limbs.",
    source = Sources.ep,
    sourcePage = 212);

  val bipolar = Disorder(
    name = "Bipolar Disorder",
    descr = "Bipolar disorder is also called manic depression. It is similar to depression except for the fact that the periods of depression are interrupted by brief (a matter of days at most) periods of mania where the subject feels inexplicably “up” about everything with heightened energy and a general disregard for consequences. The depressive stages are similar in all ways to depression. The manic stages are dangerous since the subject will take risks, spend wildly, and generally engage in behavior without much in the way of forethought or potential long term consequences.",
    gameEffect = "Similar to depression, but when manic the character must make a WIL × 3 Test to not do some action that may be potentially risky. They will also try to convince others to go along with the idea.",
    source = Sources.ep,
    sourcePage = 212);

  val bodyDysmorphia = Disorder(
    name = "Body Dysmorphia",
    descr = "Subjects afflicted with this disorder believe that they are so unspeakably hideous that they are unable to interact with others or function normally for fear of ridicule and humiliation at their appearance. They tend to be very secretive and reluctant to seek help because they are afraid others will think them vain— or they may feel too embarrassed to do so. Ironically, BDD is often misunderstood as a vanity-driven obsession, whereas it is quite the opposite; people with BDD believe themselves to be irrevocably ugly or defective. A similar disorder, gender identity disorder, where the patient is upset with their entire sexual biology, often precipitates BDD-like feelings. Gender identity disorder is directed specifically at external sexually dimorphic features, which are in constant conflict with the patient’s internal psychiatric gender.",
    gameEffect = "Because of the nature of Eclipse Phase and the ability to swap out and modify a body, this is a fairly common disorder. It is sug- gested that characters with this suffer increased or prolonged resleeving penalties since they are unable to fully adjust to the reality of their new morph.",
    source = Sources.ep,
    sourcePage = 212);

  val borderline = Disorder(
    name = "Borderline Personality Disorder",
    descr = "This disorder is marked by a general inability to fully experience one’s self any longer. Emotional states are variable and often marked by extremes and acting out. Simply put, the subject feels like they are losing their sense of self and seeks constant reassurance from others around them, yet is not fully able to act in an appropriate way. They may also engage in impulsive behaviors in an attempt to experience some sort of feeling. In extreme cases, there may be suicidal thoughts or attempts.",
    gameEffect = "The character needs to be around others and will not be left alone, however they also are not quite able to relate to others in a normal way and may also take risks or make impulsive decisions.",
    source = Sources.ep,
    sourcePage = 212);

  val depression = Disorder(
    name = "Depression",
    descr = "Clinical depression is characterized by intense feelings of hopelessness and worthlessness. Subjects usually report feeling as though nothing they do matters and no one would care anyway, so they are disinclined to attempt much in the way of anything. The character is depressed and finds it difficult to be motivated to do much of anything. Even simple acts such as eating and bathing can seem to be monumental tasks.",
    gameEffect = "Depressives often lack the will to take any sort of action, often to the point of requiring a WIL × 3 Test to engage in sustained activity.",
    source = Sources.ep,
    sourcePage = 212);

  val fugue = Disorder(
    name = "Fugue",
    descr = "The character enters into a fugue state where they display little attention to external stimuli. They will still function physiologically but refrain from speaking and stare off into the distance, unable to focus on events around them. Unlike catatonia, a person in a fugue state will walk around if lead about by a helper, but is otherwise unresponsive. The fugue state is usually a persistent state, but it can be an occasional state that is triggered by some sort of external stimuli similar to the original trauma that triggered the disorder.",
    gameEffect = "Characters in a fugue state are totally non-responsive to most stimuli around them. They will not even defend themselves if attacked and will usually attempt to curl into a fetal position if physically assaulted.",
    source = Sources.ep,
    sourcePage = 213);

  val gad = Disorder(
    name = "General Anxiety Disorder (GAD)",
    descr = "GAD results in severe feelings of anxiety about nearly everything the character comes into contact with. Even simple tasks represent the potential for failure on a catastrophic scale and should be avoided or minimized. Additionally, negative outcomes for any action are always assumed to be the only possible outcomes.",
    gameEffect = "A character with GAD will be almost entirely useless unless convinced otherwise, and then only for a short period of time. Another character can attempt to use a relevant social skill to coax the GAD character into doing what is required of them. If the character with the disorder fails at the task, however, all future attempts to coax them will suffer a cumulative –10 penalty.",
    source = Sources.ep,
    sourcePage = 213);

  val hypochondria = Disorder(
    name = "Hypochondria",
    descr = "Hypochondriacs suffer from a delusion that they are sick in ways that they are not. They will create disorders that they believe they suffer from, usually to get the attention of others. Often hypochondriacs will inflict harm on themselves or even ingest substances that will aid in producing symptoms similar to the disorder they believe they have. These attempts to simulate symptoms can and will cause actual harm to hypochondriacs.",
    gameEffect = "A subject that is hypo- chondriac will often behave as though they are under the effects of some other disorder or physical malady. This can be consistent over time or can be different and ever changing. They will react with hostility to claims that they are faking or not actually ill.",
    source = Sources.ep,
    sourcePage = 213);

  val impulseControl = Disorder(
    name = "Impulse Control Disorder",
    descr = "Subjects have a certain act or belief that they must engage in a certain activity that comes into their mind. This can be kleptomania, pyromania, sexual exhibitionism, etc. They feel a sense of building anxiety whenever they are prevented from engaging in this behavior for an extended period (usually several times a day to weekly, depending on the impulse) and will often attempt to engage in this behavior at inconvenient or inappropriate times. This is different from OCD in the sense that OCD is usually a single contained behavior that must be engaged in to reduce anxiety. Impulse control disorder is a variety of behaviors and can be virtually any sort of highly inappropriate action.",
    gameEffect = "Similar to OCD, if the character doesn’t engage in the behavior they will grow increasingly disturbed and suffer penalties to all actions until they are able to engage in the compulsion that alleviates their anxiety.",
    source = Sources.ep,
    sourcePage = 213);

  val insomnia = Disorder(
    name = "Insomnia",
    descr = "Insomniacs find themselves unable to sleep, or unable to sleep for an extended period of time. This is most often due to anxiety about their lives or as a result of depression and the accompanying negative thought patterns. This is not the sort of sleeplessness that is brought about as a result of normal stress but rather a near total inability to find rest in sleep when it is desired. Insomniacs may find themselves nodding off at inopportune times, but never for long, and never enough to gain any restful sleep. As a result, they are frequently lethargic and inattentive as their lack of sleep robs them of their edge and eventually any semblance of alertness. Additionally, insomniacs are frequently irritable due to being on edge and unable to rest.",
    gameEffect = "Due to the lack of meaningful sleep, insomniacs should suffer from blanket penalties to perception-related tasks or anything requiring concentration or prolonged fine motor abilities.",
    source = Sources.ep,
    sourcePage = 213);

  val megalomania = Disorder(
    name = "Megalomania",
    descr = "A megalomaniac believes themselves to be the single most important person in the universe. Nothing is more important than the megalomaniac and everything around them must be done according to their whim. Failure to comply with the dictates of a megalomaniac can often result in rages or actual physical assaults by the subject.",
    gameEffect = "A character that has megalomania will demand attention and has difficulty in nearly any social situation. Additionally, they may be provoked to violence if they think they are being slighted.",
    source = Sources.ep,
    sourcePage = 213);

  val mpd = Disorder(
    name = "Multiple Personality Disorder",
    descr = "This is the development of a separate, distinct personality from the original or control personality. The personalities may or may not be aware of each other and “conscious” during the actions of the other personality. Usually there is some sort of trigger that results in the emergence of the non-control personality. Most subjects have only a single extra personality, but it is not unheard of to have several personalities. It is important to note that these are distinct individual personalities and not just crude caricatures of the Dr. Jekyll/Mr. Hyde sort. Each personality sees itself as a distinct person with their own wants, needs, and motivations. Additionally, they are usually unaware of the experiences of the others, though there is some basic information sharing (such as language and core skill sets).",
    gameEffect = "When the player is under the effects of another personality, they should be treated as an NPC. In some rare cases the player and the gamemaster can work out the second personality and allow the player to roleplay this. This does not however constitute an entire new character that can be “turned on” at will.",
    source = Sources.ep,
    sourcePage = 214);

  val ocd = Disorder(
    name = "Obsessive Compulsive Disorder (OCD)",
    descr = "Subjects with OCD are marked by intrusive or inappropriate thoughts or impulses that cause acute anxiety if a particular obsession or compulsion is not engaged in to alleviate them. These obsessions and compulsions can be nearly any sort of behavior that must be immediately engaged in to keep the rising anxiety at bay. Players and gamemasters are encouraged to come up with a behavior that is suitable. Examples of common behaviors include repetitive tics (touching every finger of each hand to another part of the body, tapping the right foot twenty times), pathological behaviors such as gambling or eating, or a mental ritual that must be completed (reciting a book passage).",
    gameEffect = "If the character doesn’t engage in the behavior they will grow increasingly disturbed and suffer penalties to all actions until they are able to engage in the compulsion that alleviates their anxiety.",
    source = Sources.ep,
    sourcePage = 214);

  val ptsd = Disorder(
    name = "Post Traumatic Stress Disorder (PTSD)",
    descr = "PTSD occurs as a result of being exposed to either a single incident or a series of incidents where the sufferer had their own life, or saw the lives of others, threatened with death. These incidents are often marked by an inability on the part of the victim, either real or perceived, to do anything to alter the outcomes. As a result, they develop an acute anxiety and fixation on these incidents to the point where they lose sleep, become irritated or easily angered, or are depressed over feelings that they lack control in their own lives.",
    gameEffect = "Penalties to task actions, also treat situations similar to the initial episodes that caused the disorder as a phobia.",
    source = Sources.ep,
    sourcePage = 214);

  val schizophrenia = Disorder(
    name = "Schizophrenia",
    descr = "While schizophrenia is generally acknowledged as a genetic disorder that has an onset in early adulthood, it also seems to develop in a number of egos that undergo frequent morph changes. It has been theorized that this is due to some sort of repetitive error in the download process. Regardless, it remains a rare, yet persistent danger of dying and being brought back. Schizophrenia is a psychotic disorder where the subject loses their ability to discern reality from unreality. This can involve delusions, hallucinations (often in support of the delusions), and fragmented or disorganized speech. The subject will not be aware of these behaviors and will perceive themselves as functioning normally, often to the point of becoming paranoid that others are somehow involved in a grand deception.",
    gameEffect = "Schizophrenia represents a total break from reality. A character that is schizo- phrenic may see and hear things and act on those delusions and hallucinations while seeing attempts by their friends to stop or explain to them as part of a wider conspiracy. Adding to this is the difficulty of communicating coherently. Characters that have become schizophrenic are only marginally functional and only for short periods of time until they have the disorder treated.",
    source = Sources.ep,
    sourcePage = 214);

  val list: List[Disorder] = Macros.memberList[Disorder];
}
