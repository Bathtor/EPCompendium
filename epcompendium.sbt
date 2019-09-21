enablePlugins(ScalaJSPlugin)
import sbtcrossproject.CrossPlugin.autoImport.{CrossType, crossProject}

//scalacOptions in ThisBuild ++= Seq("-Ymacro-debug-verbose")

resolvers in ThisBuild += "Apache" at "https://repo.maven.apache.org/maven2"
resolvers in ThisBuild += Resolver.bintrayRepo("lkrollcom", "maven")

lazy val commonSettings = Seq(
  organization := "com.lkroll.ep",
  version := "6.0.0-SNAPSHOT",
  scalaVersion := "2.12.8",
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "upickle" % Dependencies.upickleV,
    "com.beachape" %%% "enumeratum" % Dependencies.enumeratumV,
    "com.lkroll.common" %%% "common-data-tools" % Dependencies.dataToolsV,
    "io.lemonlabs" %%% "scala-uri" % Dependencies.scalauriV,
    "org.scalatest" %%% "scalatest" % Dependencies.scalatestV % "test"
  ),
  bintrayOrganization := Some("lkrollcom"),
  licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name := "EPCompendium",
    skip in publish := true
  )
  .aggregate(epCompendiumCoreJVM, epCompendiumCoreJS, data, media);

lazy val epccore = crossProject(JSPlatform, JVMPlatform)
  .in(file("core"))
  .enablePlugins(BuildInfoPlugin)
  .settings(
    commonSettings,
    name := "EPCompendium Core",
    buildInfoKeys := Seq[BuildInfoKey](name, version, scalaVersion, sbtVersion),
    buildInfoPackage := "com.lkroll.ep.compendium"
  )
  .jvmSettings(
    // Add JVM-specific settings here
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % Dependencies.logbackV,
      "com.typesafe.scala-logging" %% "scala-logging" % Dependencies.scalaloggingV,
      "com.google.guava" % "guava" % Dependencies.guavaV
    ),
    parallelExecution in Test := false,
    logBuffered in Test := false
  )
  .jsSettings(
    // Add JS-specific settings here
    libraryDependencies += "com.lkroll.roll20" %%% "roll20-api-facade" % Dependencies.apiFacadeV
  );

lazy val epCompendiumCoreJVM = epccore.jvm;
lazy val epCompendiumCoreJS = epccore.js;

lazy val data = (project in file("data"))
  .settings(
    commonSettings,
    //skip in publish := true,
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % Dependencies.logbackV,
      "com.typesafe.scala-logging" %% "scala-logging" % Dependencies.scalaloggingV,
      "org.rogach" %% "scallop" % Dependencies.scallopV
    ),
    name := "EPCompendium Data"
  )
  .dependsOn(epCompendiumCoreJVM);

lazy val media = (project in file("media"))
  .settings(
    commonSettings,
    //skip in publish := true,
    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % Dependencies.scalaloggingV
    ),
    name := "EPCompendium Media"
  )
  .dependsOn(epCompendiumCoreJVM, data);
