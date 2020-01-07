# EPCompendium
Core: [ ![Download](https://api.bintray.com/packages/lkrollcom/maven/epcompendium-core/images/download.svg) ](https://bintray.com/lkrollcom/maven/epcompendium-core/_latestVersion)
Data: [ ![Download](https://api.bintray.com/packages/lkrollcom/maven/epcompendium-data/images/download.svg) ](https://bintray.com/lkrollcom/maven/epcompendium-data/_latestVersion)


This repository contains both data models and the data to build a custom **Roll20** *Compendium* for *Eclipse Phase*.

The data models can be imported in order to use the generated data or generate custom data.

## Setup for Roll20

Information on how to setup and use this compendium with Roll20 can be found [here](https://github.com/Bathtor/EPSheet/blob/master/script/README.md) and the whole process is also described in the following video:

[![Setup Process](https://img.youtube.com/vi/tnlJzZd1yF0/0.jpg)](https://www.youtube.com/watch?v=tnlJzZd1yF0)

## Dependency

Add the bintray repository to `resolvers`:
```scala
resolvers += Resolver.bintrayRepo("lkrollcom", "maven")
```

Then add the library dependency:
```scala
libraryDependencies += "com.lkroll.ep" %% "epcompendium-core" % "5.0.0"
```
Or for ScalaJS:
```scala
libraryDependencies += "com.lkroll.ep" %%% "epcompendium-core" % "5.0.0"
```

## Licenses
The material in the `core` folder is my own work and published under MIT license.

The material in the `data` folder is based on *Eclipse Phase* by (Posthuman Studios)[http://eclipsephase.com] and is published under Creative Commons (BY-NC-SA) 3.0 (license)[https://creativecommons.org/licenses/by-nc-sa/3.0/] as is the original material.
