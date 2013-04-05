import sbt._
import Keys._
import play.Project._

object ApplicationBuild extends Build {

  val appName         = "myFirstApp"
  val appVersion      = "1.0-SNAPSHOT"

  val appDependencies = Seq(
    // Add your project dependencies here,
    jdbc,
    anorm,
    "mysql" % "mysql-connector-java" % "5.1.18",
     "org.codehaus.jackson" % "jackson-core-asl" % "1.9.8",
     "org.codehaus.jackson" % "jackson-mapper-asl" % "1.9.8",
     "io.backchat.jerkson" % "jerkson_2.9.2" % "0.7.0"

  )

  val main = play.Project(appName, appVersion, appDependencies).settings(
    // Add your own project settings here


      resolvers += "Jerkson Repository" at "http://repo.codahale.com"
  )

}
