name := """editor-cards"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

//Add Repository Path
resolvers += "Kundera" at "https://oss.sonatype.org/content/repositories/releases"
resolvers += "Riptano" at "http://mvn.riptano.com/content/repositories/public"
resolvers += "Kundera missing" at "http://kundera.googlecode.com/svn/maven2/maven-missing-resources"

libraryDependencies ++= Seq(
  cache,
  javaWs,
  "com.impetus.kundera.client" % "kundera-mongo" % "2.17"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
