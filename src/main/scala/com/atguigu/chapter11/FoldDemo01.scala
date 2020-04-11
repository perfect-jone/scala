package com.atguigu.chapter11

object FoldDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * fold 折叠函数 将上一步返回的值作为函数的第一个参数继续传递参与运算，直到集合中的所有元素被遍历
      * 可以把reduceLeft看成简化版的foldLeft
      */

    //折叠
    val list = List(1, 2, 3, 4)

    //函数的柯里化：把多个参数的函数等价转化成单个函数的级联
    def minus(n1: Int, n2: Int) = {
      n1 - n2
    }

    def minusCurry(n1: Int)(n2: Int) = {
      n1 - n2
    }

    println(minus(4, 3))
    println(minusCurry(4)(3))

    // 可以理解为 List(5,1,2,3,4) list.reduceLeft(minus)
    println(list.foldLeft(5)(minus)) //函数的柯里化
    val listLeft = (5 /: list) (minus) //foldLeft的简写形式 /:
    println(listLeft)

    // 可以理解为 List(5,1,2,3,4) list.reduceRight(minus)
    println(list.foldRight(5)(minus))
    val listRight = (list :\ 5) (minus) //foldRight的简写形式 :\
    println(listRight)

  }
}
