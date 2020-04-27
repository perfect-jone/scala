package com.atguigu.chapter13

object ParameterInferDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 匿名函数参数类型推断：
      * 1.参数类型可以推断时，可以省略参数类型
      * 2.当传入的参数只有单个时，可以省略小括号
      * 3.当=>后面的变量只出现一次时，可以省略后面的变量，用_代替
      */

    val list = List(1, 2, 3, 4)
    list.map((n: Int) => n + 1)
    list.map((n) => n + 1)
    list.map(n => n + 1)
    val list2 = list.map(_ + 1)

    def f1(n1: Int,n2:Int):Int= {
      n1 + n2
    }

    list.reduce(f1)
    list.reduce((n1: Int,n2:Int) => n1 + n2)
    list.reduce((n1,n2) => n1 + n2)
    val list3 = list.reduce(_ + _)

    println(list2)
    println(list3)
  }
}
