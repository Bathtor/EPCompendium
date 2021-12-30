enablePlugins(ScalaJSPlugin)
import sbtcrossproject.CrossPlugin.autoImport.{CrossType, crossProject}

ThisBuild / organization := "com.lkroll"

ThisBuild / version := "6.1.1"

ThisBuild / scalaVersion := "2.13.7"
ThisBuild / crossScalaVersions := Seq("2.12.13", "2.13.7")

ThisBuild / licenses ++= Seq(
  "MIT" -> url("http://opensource.org/licenses/MIT"),
  "Creative Commons (BY-NC-SA) 3.0" -> url("https://creativecommons.org/licenses/by-nc-sa/3.0/")
)

ThisBuild / homepage := Some(url("https://github.com/Bathtor/EPCompendium"))
ThisBuild / scmInfo := Some(
                ScmInfo(url("https://github.com/Bathtor/EPCompendium"),
                            "git@github.com:Bathtor/EPCompendium.git"))
ThisBuild / developers := List(Developer(id = "lkroll",
                             name = "Lars Kroll",
                             email = "bathtor@googlemail.com",
                             url = url("https://github.com/Bathtor")))
publishMavenStyle := true

// Add sonatype repository settings
sonatypeCredentialHost := "s01.oss.sonatype.org"
sonatypeRepository := "https://s01.oss.sonatype.org/service/local"
ThisBuild / publishTo := sonatypePublishToBundle.value

lazy val commonSettings = Seq(
  resolvers += Resolver.sonatypeRepo("release"),
  libraryDependencies ++= Seq(
    "com.lihaoyi" %%% "upickle" % Dependencies.upickleV,
    "com.beachape" %%% "enumeratum" % Dependencies.enumeratumV,
    "com.lkroll" %%% "common-data-tools" % Dependencies.dataToolsV,
    "io.lemonlabs" %%% "scala-uri" % Dependencies.scalauriV,
    "org.scalatest" %%% "scalatest" % Dependencies.scalatestV % "test"
  ),
  scalacOptions ++= Seq(
    "-deprecation",
    "-feature",
    "-language:implicitConversions",
    //"-Xfatal-warnings",
    //"-Ymacro-debug-verbose"
  )
)

lazy val root = (project in file("."))
  .settings(
    commonSettings,
    name := "EPCompendium",
    publish / skip := true
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
    //libraryDependencies += "com.lkroll.roll20" %%% "roll20-api-facade" % Dependencies.apiFacadeV
    libraryDependencies += "com.outr" %%% "scribe" % Dependencies.scribeV
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
    libraryDependencies ++= Seq(
      "com.typesafe.scala-logging" %% "scala-logging" % Dependencies.scalaloggingV
    ),
    name := "EPCompendium Media"
  )
  .dependsOn(epCompendiumCoreJVM, data);
