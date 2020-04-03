package com.atguigu.chapter08.implicitConversion

object ImplicitDetails {
  def main(args: Array[String]): Unit = {
    //隐式转换不能有二义性
    //隐式转换不能嵌套使用

    implicit def f1(d: Double): Int = {
      d.toInt
     // val num3: Int = 4.9 嵌套使用 f1$1(4.9),就会形成递归调用
    }

    val num2: Int = 3.5
  }
}


