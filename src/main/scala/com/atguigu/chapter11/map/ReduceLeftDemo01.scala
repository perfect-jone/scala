package com.atguigu.chapter11.map

object ReduceLeftDemo01 {
  def main(args: Array[String]): Unit = {

    /**
      * 化简：将二元函数(有两个参数的函数)引用于集合中的函数
      */
    val list = List(2, 4, 6, 8, 10)

    //def reduceLeft[B >: A](@deprecatedName('f) op: (B, A) => B): B =
    val list2 = list.reduceLeft(sum)
    println(list2)
    println(list.sum) //使用集合内置的sum函数求和
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum被调用")
    n1 + n2
  }
}
