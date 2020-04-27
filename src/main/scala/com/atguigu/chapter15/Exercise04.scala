package com.atguigu.chapter15

object Exercise04 {
  def main(args: Array[String]): Unit = {

    def values(f: Int => Int, min: Int, max: Int) = {
      var newList = List[(Int, Int)]()
      min to max foreach {
        x => newList = (x, f(x)) :: newList
      }
      newList
    }

    val res = values(x => x * x, 1, 5)
    println(res)
  }
}
