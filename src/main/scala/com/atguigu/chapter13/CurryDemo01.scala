package com.atguigu.chapter13

object CurryDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 函数的柯里化：
      * 函数编程中，接受多个参数的函数都可以转化为接受单个参数的函数，这个转化过程就叫柯里化
      */

    //需求：编写一个函数，接收两个参数，返回这两个函数的乘积

    //常规方式
    def mutil(n1: Int, n2: Int): Int = {
      n1 * n2
    }

    //闭包方式
    def mutil2(n1: Int) = (n2: Int) => n1 * n2

    //柯里化方式
    def mutil3(n1: Int)(n2: Int) = n1 * n2

    println(mutil(2, 4))
    println(mutil2(2)(4))
    println(mutil3(2)(4))
  }
}
