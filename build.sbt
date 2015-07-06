enablePlugins(ScalaJSPlugin)

name := "scala-js-tutorial"

version := "1.0"

scalaVersion := "2.11.7"

scalaJSStage in Global := FastOptStage

libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.8.0"
