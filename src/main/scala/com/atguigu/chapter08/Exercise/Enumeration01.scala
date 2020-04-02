package com.atguigu.chapter08.Exercise

object Enumeration01 {
  def main(args: Array[String]): Unit = {
    Weekday.showAll
    println(Weekday.toString())
    println(Weekday.isWeekend(Weekday.Sat))
  }
}

object Weekday extends Enumeration {
  type Weekday = Value  //给Value取个别名Weekday
  val Mon = Value("1")
  val Tue = Value("2")
  val Wed = Value("3")
  val Thu = Value("4")
  val Fri = Value("5")
  val Sat = Value("6")
  val Sun = Value("7")

  override def toString() = Weekday.values.mkString(",")

  def showAll = this.values.foreach(println)

  def isWeekend(day: Weekday) = (day == Sat || day == Sun)
}
