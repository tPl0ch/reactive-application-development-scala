val akkaVersion = "2.4.17"
val scalatestVersion = "3.0.5"

name := "common"

organization := "com.rarebooks"

libraryDependencies ++= Seq(
  "com.typesafe.akka"        %% "akka-actor"                % akkaVersion,
  "org.scala-lang.modules"   %% "scala-parser-combinators"  % "1.0.5",
  "com.typesafe.akka"        %% "akka-testkit"              % akkaVersion      % "test",
  "org.scalatest"            %% "scalatest"                 % scalatestVersion % "test"
)
