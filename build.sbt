name := "string-compressor"

version := "0.1"

scalaVersion := "2.12.6"

// Resolver to download the repos
resolvers += "SnowPlow Repo" at "http://maven.snplow.com/releases/"

// Dependency
libraryDependencies ++= Seq(
  "org.rogach" %% "scallop" % "3.1.2",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test"
)