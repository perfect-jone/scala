package com.atguigu.chapter11

/**
  * filter:将符合要求的数据筛选到新的集合中
  */
object FilterDemo01 {
  def main(args: Array[String]): Unit = {
    val names = List("Alice", "Bob", "Nick", "Jone")

    //def filter(p: A => Boolean): Repr = filterImpl(p, isFlipped = false)
    val newName = names.filter(startA)
    println(newName)
  }

  def startA(s: String):Boolean = {
    s.startsWith("A")
  }
}
