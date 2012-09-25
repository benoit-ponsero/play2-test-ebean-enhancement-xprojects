import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "b"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      // Add your project dependencies here,
    )

	val a = PlayProject("a", appVersion, appDependencies, mainLang = JAVA, path = file("modules/a"))    

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      // Add your own project settings here      
    ).dependsOn(a).aggregate(a)

}
