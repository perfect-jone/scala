package com.atguigu.chapter13

object PartialFunctionLogogram {
  def main(args: Array[String]): Unit = {
    /**
      * 偏函数的简写形式
      */

    val list = List(1, 2, 3, 4, 2.1, 3.1, "abc", "hello")

    implicit def toInt(n: Double): Int = {
      n.toInt
    }

    // 第一种简写形式
    def partialFunction1: PartialFunction[Any, Int] = {
      case x: Int => x + 1
      case x: Double => x * 2 //调用上面写的隐式函数toInt
    }

    val list1 = list.collect(partialFunction1)
    println(list1)

    // 第二种简写形式
    //将包在大括号内的一组case语句封装为函数，使用collect方法，称为偏函数
    val list2 = list.collect {
      case x: Int => x + 1
      case x: Double => (x * 3).toInt
    }
    println(list2)
  }
}
