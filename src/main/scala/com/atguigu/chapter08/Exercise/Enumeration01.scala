package com.atguigu.chapter08.Exercise

object Enumeration01 {
  def main(args: Array[String]): Unit = {
    Weekday.showAll
    println(Weekday.toString())
    println(Weekday.isWeekend(Weekday.Mon))
  }
}

object Weekday extends Enumeration {
  type Weekday = Value  //给Value取个别名Weekday
/*  val Mon = Value("1")
  val Tue = Value("2")
  val Wed = Value("3")
  val Thu = Value("4")
  val Fri = Value("5")
  val Sat = Value("6")
  val Sun = Value("7")*/
  val Mon,Tue,Wed,Thu,Fri,Sat,Sun = Value

  override def toString() = values.mkString(",")

  def showAll = values.foreach(println)

  def isWeekend(day: Weekday) = (day == Sat || day == Sun)
}
