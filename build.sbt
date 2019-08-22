lazy val root = (project in file("."))
  .enablePlugins(JavaAgent)
  .settings(
    ThisBuild / organization := "com.example",
    ThisBuild / scalaVersion := "2.11.12",
    name := "kamon-logback-issue-24",
    compileOrder := CompileOrder.JavaThenScala,
    javaAgents += "io.kamon" % "kanela-agent" % "1.0.1" % "runtime;dist;test",
    libraryDependencies ++= Seq(
      "ch.qos.logback" % "logback-classic" % "1.2.3",
      "io.kamon" %% "kamon-core" % "2.0.0",
      "io.kamon" %% "kamon-logback" % "2.0.0",
      "junit" % "junit" % "4.12" % "test",
      "com.novocode" % "junit-interface" % "0.11" % "test->default",
      "org.powermock" % "powermock-module-junit4" % "1.6.6" % "test",
      "org.powermock" % "powermock-api-easymock" % "1.6.6" % "test",
      "org.easymock" % "easymock" % "3.4" % "test"
    )
  )
