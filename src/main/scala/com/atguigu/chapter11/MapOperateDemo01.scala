package com.atguigu.chapter11

object MapOperateDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 需求：List(2,3,5) * 2  =>  新List(4,6,10)
      */

    val list = List(2, 3, 5)
    // def map(f: Int => B)
    //list.map(multiple)都做了什么：
    //1.将list这个集合的元素依次遍历
    //2.将各个元素传递给multiple函数 2, 3, 5 => 4, 6, 10
    //3.将得到的新Int,放入到一个新的集合中List(4, 6, 10)
    /**
      * list  map    result
      * 2              4
      * 3    * 2       6
      * 5              10
      */
    val list2 = list.map(multiple)
    println(list2)
  }

  def multiple(n: Int): Int = {
    2 * n
  }
}
