name := "ApacheFlinkFoundation"

version := "0.1"

scalaVersion := "2.12.7"


// https://mvnrepository.com/artifact/org.apache.flink/flink-scala
libraryDependencies += "org.apache.flink" %% "flink-scala" % "1.9.1"

// https://mvnrepository.com/artifact/org.apache.flink/flink-streaming-scala
libraryDependencies += "org.apache.flink" %% "flink-streaming-scala" % "1.9.1"

// https://mvnrepository.com/artifact/org.apache.flink/flink-core
libraryDependencies += "org.apache.flink" % "flink-core" % "1.9.1"

// https://mvnrepository.com/artifact/org.apache.flink/flink-test-utils
libraryDependencies += "org.apache.flink" %% "flink-test-utils" % "1.9.1" % Test

// https://mvnrepository.com/artifact/org.apache.flink/flink-tests
libraryDependencies += "org.apache.flink" % "flink-tests" % "1.9.1" % Test

// https://mvnrepository.com/artifact/ch.qos.logback/logback-classic
libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.3"

// https://mvnrepository.com/artifact/com.typesafe.scala-logging/scala-logging
libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.2"

// https://mvnrepository.com/artifact/org.apache.flink/flink-runtime-web
libraryDependencies += "org.apache.flink" %% "flink-runtime-web" % "1.9.1"







