name := "CapGemini_HMRC_ShoppingCart"

version := "1.0"

scalaVersion := "2.11.8"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "3.0.0-M16-SNAP6" % "test"

coverageExcludedPackages := "uk\\.hmrc\\.checkout\\.system\\.application\\..*;"