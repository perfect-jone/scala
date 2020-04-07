package com.atguigu.chapter10;

object ArrayDemo01 {
  def main(args: Array[String]): Unit = {
    val arr01 = new Array[Any](4)
    val length = arr01.length
    arr01(0) = "jone"
    arr01(1) = 10
    arr01(2) = true
    arr01(3) = 99.99
    arr01(3) = 'T'
    for (i <- arr01) {
      println(i)
    }
    println(length)
  }
}
