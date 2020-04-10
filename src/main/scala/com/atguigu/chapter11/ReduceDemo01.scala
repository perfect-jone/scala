package com.atguigu.chapter11

object ReduceDemo01 {
  def main(args: Array[String]): Unit = {
    val list = List(1, 2, 3, 4, 5)
    val list2 = List(2,5,3,1,7)

    // (((1 - 2) -3) -4) -5      def reduceLeft[B >: A](op: (B, A) => B): B
    //reduceLeft运行的规则是 从左边开始执行 将得到的结果返回给第一个参数
    println(list.reduceLeft(minus))

    // 1 - (2 - (3 - (4 - 5)))   def reduceRight[B >: A](op: (A, B) => B): B
    //reduceRight运行的规则是 从右边开始执行 将得到的结果返回给第二个参数
    println(list.reduceRight(minus))

    // def reduce[A1 >: A](op: (A1, A1) => A1): A1 = reduceLeft(op)
    println(list.reduce(minus))


    println(list2.reduceLeft(min))
    println(list2.min)   //底层是reduceLeft
    println(list2.reduceLeft(max))
    println(list2.max)   //底层是reduceLeft
  }

  def minus(n1: Int, n2: Int): Int = {
    n1 - n2
  }

  //求list最小值
  def min(n1: Int, n2: Int): Int = {
    if (n1 < n2) n1 else n2
  }

  //求list最大值
  def max(n1: Int, n2: Int): Int = {
    if (n1 > n2) n1 else n2
  }
}
