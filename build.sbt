ThisBuild / scalaVersion     := "2.13.2"
ThisBuild / version          := "0.1.0-SNAPSHOT"
ThisBuild / organization     := "acme"
ThisBuild / organizationName := "acme"

lazy val root = (project in file("."))
  .settings(
    name := "acme-scala",
    libraryDependencies ++= Seq(
      "org.slf4j" % "slf4j-api" % "1.7.30",
      "ch.qos.logback" % "logback-classic" % "1.2.3"
    )
  )
