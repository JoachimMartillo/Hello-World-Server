name := "scala-ping-pong-server"

version := "1.0"
scalaVersion := "2.12.2"
libraryDependencies ++= Seq(
  "com.typesafe.akka" %% "akka-http" % "10.0.9"
)
enablePlugins(JavaAppPackaging)
