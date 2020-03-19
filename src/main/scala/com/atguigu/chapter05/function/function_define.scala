package com.atguigu.chapter05.function

object function_define {
  /**
    * 基本语法
    * def 函数名([参数名： 参数类型,…]) [:返回值类型] = {
    * 语句…
    * }
    */
  def main(args: Array[String]): Unit = {
    println(sum3(2, 3))
  }

  def sum1(n1: Int, n2: Int): Unit = {
    n1 + n2
  }

  def sum2(n1: Int, n2: Int) = {
    n1 + n2
  }

  def sum3(n1: Int, n2: Int)  {
    n1 + n2
  }
}
