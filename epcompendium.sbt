enablePlugins(ScalaJSPlugin)

//scalacOptions in ThisBuild ++= Seq("-Ymacro-debug-verbose")

resolvers += "Apache" at "http://repo.maven.apache.org/maven2"

lazy val commonSettings = Seq(
  organization := "com.lkroll.ep",
  version := "0.7.0",
  scalaVersion := "2.12.4",
  libraryDependencies ++= Seq(//"org.typelevel"  %% "squants"  % "1.3.0",
  	"com.lihaoyi" %%% "scalatags" % "0.6.+",
  	"com.lihaoyi" %%% "upickle" % "0.6.4")
)

lazy val root = (project in file(".")).settings(
	commonSettings,
	EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.ManagedClasses,
	name := "EPCompendium"
).aggregate(epCompendiumCoreJVM, epCompendiumCoreJS, data)

lazy val epccore = (crossProject in file("core")).
   enablePlugins(BuildInfoPlugin).
   settings(
	commonSettings,
	name := "EPCompendium Core",
	EclipseKeys.useProjectId := true,
    EclipseKeys.eclipseOutput := Some("./etarget"),
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "com.lkroll.ep.compendium"
  ).
  jvmSettings(
    // Add JVM-specific settings here
    libraryDependencies ++= Seq(
	  	"ch.qos.logback" % "logback-classic" % "1.2.3",
	  	"com.typesafe.scala-logging" %% "scala-logging" % "3.8.0"),
    parallelExecution in Test := false,
    logBuffered in Test := false
  ).
  jsSettings(
    // Add JS-specific settings here
    libraryDependencies += "com.lkroll.roll20" %%% "roll20-api-facade" % "1.2.0-SNAPSHOT"
  )

lazy val epCompendiumCoreJVM = epccore.jvm
lazy val epCompendiumCoreJS = epccore.js

lazy val data = (project in file("data")).settings(
	commonSettings,
	libraryDependencies ++= Seq(
	  	"ch.qos.logback" % "logback-classic" % "1.2.3",
	  	"com.typesafe.scala-logging" %% "scala-logging" % "3.8.0"),
	name := "EPCompendium Data"
).dependsOn(epCompendiumCoreJVM)