import sbt._

class TraumaProject(info: ProjectInfo) extends ParentProject(info) {
  lazy val util =  project("trauma-util",  "trauma-util",  new TraumaUtilProject(_)        )
  lazy val model = project("trauma-model", "trauma-model", new TraumaModelProject(_), util )
  lazy val core =  project("trauma-core",  "trauma-core",  new TraumaCoreProject(_),  model)

  abstract class TraumaBaseProject(info: ProjectInfo) extends DefaultProject(info) {
    override def compileOptions = super.compileOptions ++ Seq(Unchecked, Deprecation)
    val specs = "org.scala-tools.testing" %% "specs" % "1.6.5" % "test"
  }

  class TraumaUtilProject(info: ProjectInfo) extends TraumaBaseProject(info)
  class TraumaModelProject(info: ProjectInfo) extends TraumaBaseProject(info)
  class TraumaCoreProject(info: ProjectInfo) extends TraumaBaseProject(info)
}
