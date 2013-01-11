name := "MongoDB test"

version := "0.0"

scalaVersion := "2.9.2"

mainClass := Some("mongo.HelloWorld")

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/releases/"

seq(com.github.retronym.SbtOneJar.oneJarSettings: _*)

libraryDependencies ++= Seq(
  "org.mongodb" %% "casbah" % "2.4.1"
  )
