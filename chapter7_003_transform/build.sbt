val akkaVersion = "2.5.21"

scalaVersion := "2.12.8"

name := "catalogLoader"

libraryDependencies ++= Seq(
  "com.typesafe.akka"      %% "akka-actor"       % akkaVersion,
  "com.typesafe.akka"      %% "akka-stream"      % akkaVersion
)
