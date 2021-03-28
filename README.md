# EPCompendium

- Core: [![Maven Central](https://img.shields.io/maven-central/v/com.lkroll/epcompendium-core_2.13)](https://search.maven.org/artifact/com.lkroll/epcompendium-core_2.13)
- Data: [![Maven Central](https://img.shields.io/maven-central/v/com.lkroll/epcompendium-data_2.13)](https://search.maven.org/artifact/com.lkroll/epcompendium-data_2.13)
- Media: [![Maven Central](https://img.shields.io/maven-central/v/com.lkroll/epcompendium-media_2.13)](https://search.maven.org/artifact/com.lkroll/epcompendium-media_2.13)


This repository contains both data models and the data to build a custom **Roll20** *Compendium* for *Eclipse Phase*.

The data models can be imported in order to use the generated data or generate custom data.

## Setup for Roll20

Information on how to setup and use this compendium with Roll20 can be found [here](https://github.com/Bathtor/EPSheet/blob/master/script/README.md) and the whole process is also described in the following video:

[![Setup Process](https://img.youtube.com/vi/tnlJzZd1yF0/0.jpg)](https://www.youtube.com/watch?v=tnlJzZd1yF0)

## Dependency

Then add the library dependencies (pick which ones you need):
```scala
libraryDependencies += "com.lkroll" %% "epcompendium-core" % "6.1.0"
libraryDependencies += "com.lkroll" %% "epcompendium-data" % "6.1.0"
libraryDependencies += "com.lkroll" %% "epcompendium-media" % "6.1.0"
```
Or for ScalaJS:
```scala
libraryDependencies += "com.lkroll" %%% "epcompendium-core" % "6.2.0"
libraryDependencies += "com.lkroll" %%% "epcompendium-data" % "6.1.0"
libraryDependencies += "com.lkroll" %%% "epcompendium-media" % "6.1.0"
```

## Licenses
The material in the `core` folder is my own work and published under MIT license.

The material in the `data` and `media` folders are based on *Eclipse Phase* by (Posthuman Studios)[http://eclipsephase.com] and is published under Creative Commons (BY-NC-SA) 3.0 (license)[https://creativecommons.org/licenses/by-nc-sa/3.0/] as is the original material.
