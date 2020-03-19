package com.atguigu.chapter04.ifelse

object Demo01 {
  def main(args: Array[String]): Unit = {
    val res = if (5 > 4) {
      println("5>4")
      9 + 6
      println("hello")
      "yes"
      println("world")
      1
    } else {
      println("5<4")
      8
    }
    println(res)
  }
}
