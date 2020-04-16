package com.atguigu.chapter13

object HighOrderFunctionDemo02 {
  def main(args: Array[String]): Unit = {

    // 1.minusxy是高阶函数，因为它返回匿名函数
    // 2.返回的匿名函数是(y: Int) => x - y
    def minusxy(x: Int) = {
      (y: Int) => x - y
    }
    val res = minusxy(4)(3) //函数的柯里化
    println(res)
  }
}
