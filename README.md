# EPCompendium

This repository contains both data models and the data to build a custom **Roll20** *Compendium* for *Eclipse Phase*.

The data models can be imported in order to use the generated data or generate custom data.

## Dependency

Add the bintray repository to `resolvers`:
```scala
resolvers += Resolver.bintrayRepo("lkrollcom", "maven")
```

Then add the library dependency:
```scala
libraryDependencies += "com.lkroll.ep" %% "epcompendium-core" % "1.1.+"
```
Or for ScalaJS:
```scala
libraryDependencies += "com.lkroll.ep" %%% "epcompendium-core" % "1.1.+"
```

## Licenses
The material in the `core` folder is my own work and published under MIT license.

The material in the `data` folder is based on *Eclipse Phase* by (Posthuman Studios)[http://eclipsephase.com] and is published under Creative Commons (BY-NC-SA) 3.0 (license)[https://creativecommons.org/licenses/by-nc-sa/3.0/] as is the original material.
