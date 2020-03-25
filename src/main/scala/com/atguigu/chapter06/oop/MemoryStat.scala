package com.atguigu.chapter06.oop

object MemoryStat {
  def main(args: Array[String]): Unit = {
    val p1 = new Programmer
    p1.name = "jone"
    p1.age = 18
    val p2 = p1
    println(p1 == p2)
    p1.name = "pating"
    println(p1.hashCode() + "\t" + p2.hashCode())
  }
}

class Programmer {
  var name = ""
  var age: Int = _
}