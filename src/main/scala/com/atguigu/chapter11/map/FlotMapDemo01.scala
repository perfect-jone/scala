package com.atguigu.chapter11.map

object FlotMapDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * fold 折叠函数 将上一步返回的值作为函数的第一个参数继续传递参与运算，知道集合中的所有元素被遍历
      * 可以把reduceLeft看成简化版的foldLeft
      */

    //折叠
    val list = List(1,2,3,4)
    def minus(n1: Int, n2: Int): Int = {
      n1 - n2
    }

    // 可以理解为 List(5,1,2,3,4) list.reduceLeft(minus)
    println(list.foldLeft(5)(minus)) //函数的柯里化

    // 可以理解为 List(5,1,2,3,4) list.reduceRight(minus)
    println(list.foldRight(5)(minus))
  }
}
