package com.atguigu.chapter12

object MatchTypeDemo01 {
  def main(args: Array[String]): Unit = {
    val a = 5
    val obj = if (a == 1) 1
    else if (a == 2) "2"
    else if (a == 3) BigInt(3)
    else if (a == 4) BigDecimal(4.4)
    else if (a == 5) Map((1,"world"))
    else if (a == 6) Map(("hello",1),("hello2",2))
    else if (a == 7) Array(1, 2, 3)
    else if (a == 8) Array("aa", 1)
    else if (a == 9) Array("aa", "bb")

    val result = obj match {
      case a: Int => a
      case b: String => "对象是个字符串"
      case c: Map[String, Int] => "对象是个String,Int的集合"
      case d: Map[Int, String] => "对象是个Int,String的集合"
      case e: Array[Int] => "对象是一个Int数组"
      case f: Array[String] => "对象是一个String数组"
      case g: Array[Any] => "对象是一个Any数组"
      case _ => "啥也不是"
    }
    println(result)
  }
}
