package com.atguigu.chapter13

object FunctionParameterDemo01 {
  def main(args: Array[String]): Unit = {
    def plus(n: Int) = n + 3

    // plus(_) 表示从集合中遍历出来的一个元素传递给plus的n
    // plus 表示将每次遍历出来的元素传给plus的n
    // plus _ 表示把函数引用传递过去
    val res = List(1, 2, 3).map(plus) // f:Int => B
    println(res)
    println(res.mkString("\t"))
    // plus函数的类型是 <function1>
    println(plus _)
  }
}
