package com.atguigu.chapter05.fundetails

object Details13 {
  def main(args: Array[String]): Unit = {
    //等价于def f1 = "venassa"
    def f1() = {
      "venassa"
    }
    println(f1)
    //println(sum2(10, 20, 30, 40, 50))
  }

  def sum1(args: Int*): Int = {
    println(args.length)
    //遍历
    var sum = 0
    for (item <- args) {
      sum += item
    }
    sum
  }

  def sum2(n1: Int, args: Int*): Int = {
    println(args.length)
    //遍历
    var sum = n1
    for (item <- args) {
      sum += item
    }
    sum
  }
}
