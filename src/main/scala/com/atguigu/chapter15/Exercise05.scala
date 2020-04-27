package com.atguigu.chapter15

object Exercise05 {
  def main(args: Array[String]): Unit = {

    def factorial(n: Int) = 1 to n reduceLeft(_ * _)
    println(factorial(5))
  }
}
