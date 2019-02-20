val akkaVersion = "2.4.17"
val logbackVer = "1.2.3"
val scalatestVersion = "3.0.5"

name := "rarebooks"

libraryDependencies ++= Seq(
  "com.typesafe.akka"      %% "akka-actor"       % akkaVersion,
  "com.typesafe.akka"      %% "akka-remote"      % akkaVersion,
  "com.typesafe.akka"      %% "akka-slf4j"       % akkaVersion,
  "ch.qos.logback"         %  "logback-classic"  % logbackVer,
  "com.typesafe.akka"      %% "akka-testkit"     % akkaVersion      % "test",
  "org.scalatest"          %% "scalatest"        % scalatestVersion % "test"
)

addCommandAlias("rb", "runMain com.rarebooks.library.RareBooksApp -Dakka.remote.netty.tcp.port=2551")
