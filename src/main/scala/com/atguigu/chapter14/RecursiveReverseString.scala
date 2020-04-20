package com.atguigu.chapter14

object RecursiveReverseString {
  def main(args: Array[String]): Unit = {

    //字符串反转
    def reverseString(s: String): String = {
      if (s.length == 1) s
      else reverseString(s.tail) + s.head
    }

    //求n的阶乘
    def factorial(n: Int):Int = {
      if (n == 0) 1
      else n * factorial(n - 1)
    }

    val res = reverseString("abcdef")
    println(res)

    val res2 = factorial(5)
    println(res2)
  }
}
