package com.atguigu.chapter09.implicitConversion

//自动转换：低精度-->高精度   Int --> Double
//隐式转换：高精度-->低精度   Double --> Int
object ImplicitDemo01 {
  def main(args: Array[String]): Unit = {

    //编写一个隐式函数 Double --> Int

    implicit def double2Int(d: Double):Int = {
      d.toInt
    }

    //底层编译 double2Int$1(3.5D)
    val num : Int = 3.5
    val num2 : Int = 7.99
    println(num)
    println(num2)
  }
}
