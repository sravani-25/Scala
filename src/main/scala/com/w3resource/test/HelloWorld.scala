package com.w3resource.test

//Write a Scala program to print "Hello, world" and version of the Scala language.
object HelloWorld {
  def main(args: Array[String]): Unit = {
    println("HelloWorld")
    println("Scala Version :" + util.Properties.versionString)
  }
}
