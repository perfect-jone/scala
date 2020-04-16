package com.atguigu.chapter13

object PartialFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 偏函数：Partial Function
      *
      */

    //需求：List(1,2,3,4,"abc") + 1 ->  List(2,3,4,5)
    val list = List(1, 2, 3, 4, "abc","hello")

    // 方法一：传统做法：1.filter  2.Any->Int   3.map
    def isInt(n: Any): Boolean = {
      n.isInstanceOf[Int]
    }

    def asInt(n: Any): Int = {
      n.asInstanceOf[Int]
    }

    def sum(n: Int): Int = {
      n + 1
    }

    val list2 = list.filter(isInt).map(asInt).map(sum)
    println(list2)

    //方法二：模式匹配，引出偏函数
    //虽然使用模式匹配比较简单，但是不够完美
    def add(n: Any): Any = {
      n match {
        case x: Int => x + 1
        case _ =>
      }
    }

    val list3 = list.map(add)
    println(list3) //List(2, 3, 4, 5, (), ())
  }
}
