package com.atguigu.chapter03.arithmeticoperator

object Demo01 {
  def main(args: Array[String]): Unit = {
    var r1: Int = 10 / 3  //3
    var r2: Double = 10 / 3 //3.0
    var r3: Double = 10.0 / 3 //3.33333……
    /*  println(r1)
        println(r2)
        println(r3)
        println(r3.formatted("%.2f"))*/

    //取余/模 的运算规则一样：a % b = a - a/b * b  取余 向0靠近  取模向负无穷靠近
    /*println(10 % 3)
    println(10 % -3) // 10 % -3 = 10 - (-3) * (-3) = 1
    println(-10 % 3) // -10 - (-3) * 3 = -1
    println(-10 % -3)// -10 - 3 * (-3) = -1*/

    // scala中没有++ 和 --，使用 += 1 和 -= 1
    var n1 = 10
    n1 += 1
    n1 -= 1
    //    println(n1)
  }
}
