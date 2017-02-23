logLevel := Level.Warn

resolvers ++= DefaultOptions.resolvers(snapshot = true)
// scoverage Plugin
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.3.5")
