enablePlugins(ScalaJSPlugin)

//scalacOptions in ThisBuild ++= Seq("-Ymacro-debug-verbose")

resolvers in ThisBuild += "Apache" at "http://repo.maven.apache.org/maven2"
resolvers in ThisBuild += Resolver.bintrayRepo("lkrollcom", "maven")

lazy val commonSettings = Seq(
  organization := "com.lkroll.ep",
  version := "2.0.0-SNAPSHOT",
  scalaVersion := "2.12.4",
  libraryDependencies ++= Seq(//"org.typelevel"  %% "squants"  % "1.3.0",
  	"com.lihaoyi" %%% "scalatags" % "0.6.+",
  	"com.lihaoyi" %%% "upickle" % "0.6.4",
    "com.beachape" %%% "enumeratum" % "1.5.13",
  	"com.lkroll.common" %%% "common-data-tools" % "1.+",
  	"org.scalatest" %%% "scalatest" % "3.0.4" % "test"),
  bintrayOrganization := Some("lkrollcom"),
  licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
)

lazy val root = (project in file(".")).settings(
	commonSettings,
	EclipseKeys.createSrc := EclipseCreateSrc.Default + EclipseCreateSrc.ManagedClasses,
	name := "EPCompendium",
	skip in publish := true,
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
	skip in publish := true,
	libraryDependencies ++= Seq(
	  	"ch.qos.logback" % "logback-classic" % "1.2.3",
	  	"com.typesafe.scala-logging" %% "scala-logging" % "3.8.0",
	  	"org.rogach" %% "scallop" % "3.1.2"),
	name := "EPCompendium Data"
).dependsOn(epCompendiumCoreJVM)