import sbt._

object Dependencies {
  lazy val cats = "org.typelevel" %% "cats-core" % "1.6.0"
  lazy val refined = "eu.timepit" %% "refined" % "0.9.4"
  lazy val typesafeConfig = "com.typesafe" % "config" % "1.3.3"
  lazy val scalatest = "org.scalatest" %% "scalatest" % "3.0.7"
  lazy val scalacheck = "org.scalacheck" %% "scalacheck" % "1.14.0"
  lazy val discipline = "org.typelevel" %% "discipline" % "0.11.0"
  lazy val kindProjector = "org.spire-math"  % "kind-projector" % "0.9.9" cross CrossVersion.binary
}
