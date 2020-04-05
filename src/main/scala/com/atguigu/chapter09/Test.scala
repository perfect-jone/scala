package com.atguigu.chapter09

object Test {
  def main(args: Array[String]): Unit = {
    // Make a list via the companion object factory
    val days = List("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
    // Make a list element-by-element
    val when = "AM" :: "PM" :: List()
    // Pattern match
    days match {
      case firstDay :: otherDays =>
        println("The first day of the week is: " + firstDay)
      case List() =>
        println("There don't seem to be any week days.")
    }
  }
}
