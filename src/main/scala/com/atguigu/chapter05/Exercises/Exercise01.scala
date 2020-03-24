package com.atguigu.chapter05.Exercises

import scala.io.StdIn
import scala.util.control.Breaks._

object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入1-9之间的数字")
    val n = StdIn.readInt()

    breakable {
      while (n < 1 || n > 9) {
        println("请输入1-9之间的数字")
        val n = StdIn.readInt()
        if (n >= 1 && n <= 9) {
          print99(n)
          break
        }
      }
    }

    print99(n)
  }

  def print99(n: Int): Unit = {
    for (i <- 1 to n) {
      for (j <- 1 to i) {
        printf("%d * %d =%d\t", j, i, i * j)
      }
      println()
    }
  }
}
