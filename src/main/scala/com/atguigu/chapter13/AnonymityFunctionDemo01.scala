package com.atguigu.chapter13

object AnonymityFunctionDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * 匿名函数 ：Anonymity[ˌænəˈnɪməti]  Function
      * 没有名字的函数就是匿名函数
      */

    //  (n : Int) => 3 * n 就是匿名函数
    //  (n : Int) 是形参列表; => 表示后面是函数体; 3 * n 是函数体
    //  triple是指向匿名函数的变量
    val triple = (n : Int) => 3 * n
    println(triple(3))

    val double = (n: Double) =>{
      n + n
      println(n)
    }
  }
}
