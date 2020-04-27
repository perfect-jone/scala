package com.atguigu.chapter15

object Exercise01 {
  def main(args: Array[String]): Unit = {

    def swap[A, B](tup: (A, B)) = {
      tup match {
        case (x, y) => (y, x)
        case _ => println("没有匹配到")
      }
    }

    println(swap(10, 20))
  }
}
