package com.atguigu.chapter12

object MatchVarDemo02 {
  def main(args: Array[String]): Unit = {

    //变量声明中的模式，match中每一个case都可以单独提取出来
    val (x, y, z) = (1, 2, 3)
    val (q, r) = BigInt(10) /% 3
    val arr = Array(1, 7, 2, 9)
    val Array(first, second, _*) = arr
    val e: Array[Int] = Array(1, 2, 3)
    println(x)
    println(q, r)
    println(first, second)
  }
}
