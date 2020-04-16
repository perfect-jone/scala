package com.atguigu.chapter13

object HighOrderFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    def test(f1: Double => Double, f2: Double => Int, n1: Double) = {
      f1(f2(n1))
    }

    def sum(d: Double): Double = {
      d + d
    }

    def mod(d: Double): Int = {
      d.toInt % 2
    }

    val res = test(sum, mod, 7.0)
    println(res)
  }
}
