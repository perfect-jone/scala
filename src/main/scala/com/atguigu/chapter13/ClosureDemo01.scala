package com.atguigu.chapter13

object ClosureDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 闭包：一个函数与其相关的引用环境组合的一个整体
      */

    def minusxy(x: Int) = (y: Int) => (x - y)
    // 函数f就是闭包
    val f = minusxy(20)
    println("f1="+f(1))
    println("f2="+f(2))
  }
}
