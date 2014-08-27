organization := "scaladownunder"

name := "myfirstapp"

scalaVersion := "2.11.2"

val AkkaVersion = "2.3.5"
val SprayVersion = "1.3.1"
val slickVersion = "2.1.0"

resolvers += "spray" at "http://repo.spray.io/"

libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-actor" % AkkaVersion,
  "com.typesafe.akka" %% "akka-cluster" % AkkaVersion,
  "com.typesafe.akka" %% "akka-remote" % AkkaVersion,
  "com.typesafe.akka" %% "akka-testkit" % AkkaVersion % "test",
  "org.scalaz" %% "scalaz-core" % "7.1.0",
  "com.chuusai" %% "shapeless" % "2.0.0",
  "io.spray" %% "spray-can" % SprayVersion,
  "io.spray" %% "spray-routing" % SprayVersion,
  "io.spray" %% "spray-client" % SprayVersion,
  "io.spray" %%  "spray-json" % "1.2.6",
  "com.google.guava" % "guava" % "17.0",
  "joda-time" % "joda-time" % "2.4",
  "org.joda" % "joda-convert" % "1.2",
  "com.typesafe.slick" %% "slick" % slickVersion,
  "com.github.tototoshi" %% "slick-joda-mapper" % "1.2.0",
  "mysql" % "mysql-connector-java" % "5.1.32",
  "ch.qos.logback" % "logback-classic" % "1.0.9",
  "org.slf4j" % "slf4j-api" % "1.7.2",
  "org.scalatest" %% "scalatest" % "2.2.2",
  "junit" % "junit" % "4.11" % "test",
  "org.mockito" % "mockito-all" % "1.9.5" % "test" 
)








