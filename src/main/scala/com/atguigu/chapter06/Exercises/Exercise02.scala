package com.atguigu.chapter06.Exercises

import scala.io.StdIn

object Exercise02 {
  def main(args: Array[String]): Unit = {
    /**
      * 3.编写一个过程countdown(n: Int),打印从n到0的数字
      * 4.编写一个for循环，计算字符串中所有字母Unicode代码的乘积
      * 5.第4个题目中不使用循环。提示：在Scaladoc中查看StringOps
      * 6.将第4题中的函数改为递归函数
      */


    countdown(12)
    println("---------------------------")
    mul("Hi")
    println("---------------------------")
    mul1("Hi")


  }

  def countdown(n: Int): Unit = {
    //所有集合都有reverse方法
    for (i <- 1 to n reverse) {
      println(i)
    }
  }

  //高阶函数的特性
  def countdown2(n: Int): Unit = {
    //所有集合都有reverse方法
    (1 to n).reverse.foreach(println)
  }

  def mul(s: String): Unit = {

    var mul = 1L
    for (item <- s) {
      mul *= item
    }
    println(mul)
  }

  def mul1(s: String): Unit = {
    var t: Long = 1L
    s.foreach(t *= _.toLong)
    println(t)
  }

  def product(s: String): Long = {
    if (s.length == 1) s.charAt(0).toLong
    else s.take(1).charAt(0).toLong * product(s.drop(1))
  }
}
