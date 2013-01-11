// This resolver declaration is added by default SBT 0.12.x
resolvers += Resolver.url(
  "sbt-plugin-releases", 
    new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases/")
    )(Resolver.ivyStylePatterns)

resolvers += "Typesafe Releases" at "http://repo.typesafe.com/typesafe/releases"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.1.1")

addSbtPlugin("com.github.retronym" % "sbt-onejar" % "0.8")
