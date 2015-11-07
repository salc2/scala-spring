lazy val root = (project in file(".")).
  settings(
    name := "scala-spring",
    version := "1.0",
    scalaVersion := "2.11.7"
  )


libraryDependencies ++= Seq(
  "org.springframework.boot" % "spring-boot-starter-web" % "1.2.5.RELEASE"
)
