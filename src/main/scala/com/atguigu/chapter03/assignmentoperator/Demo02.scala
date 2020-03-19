package com.atguigu.chapter03.assignmentoperator

object Demo02 {
  def main(args: Array[String]): Unit = {
    var a = 10
    var b = 20
    var t = a
    a = b
    b = t
    //println("a="+a+"\tb="+b)

    val res = {
      if (a > 1) "hello,ok" else 100
    }
    //println(res)

    var x = 10
    var y = 20
    /* 1.
      x = x + y
      y = x - y
      x = x - y
    */

    /* 2.
      x = x * y
      y = x / y
      x = x / y
    */

    /* 3.任意一个数与任意一个给定的值连续异或两次，值不变。
      x = x ^ y
      y = x ^ y
      x = x ^ y
    */
    println("x=" + x + "\ty=" + y)
  }
}
