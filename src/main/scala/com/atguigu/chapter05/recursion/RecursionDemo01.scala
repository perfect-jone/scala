package com.atguigu.chapter05.recursion

object RecursionDemo01 {
  def main(args: Array[String]): Unit = {
    test2(4)
  }

  def test(n: Int): Unit = {
    if (n > 2) {
      test(n - 1)
    }
    println("n=" + n)
  }

  def test2(n: Int): Unit = {
    if (n > 2) {
      test2(n - 1)
    } else {
      println("n=" + n)
    }
  }
}
