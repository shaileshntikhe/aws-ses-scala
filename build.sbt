name := "aws-ses-scala"

organization := "jp.co.bizreach"

version := "0.0.1"

scalaVersion := "2.11.2"

libraryDependencies ++= Seq(
  "com.amazonaws" % "aws-java-sdk" % "1.8.10.2"
)

scalacOptions := Seq("-deprecation")
