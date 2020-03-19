package com.atguigu.chapter04.ifelse

import scala.io.StdIn
import scala.math._

object Exercise02 {
  def main(args: Array[String]): Unit = {
    println("请输入第一个参数")
    var a = StdIn.readInt()
    println("请输入第二个参数")
    var b = StdIn.readInt()
    println("请输入第三个参数")
    var c = StdIn.readInt()
    val m = b * b - 4 * a * c
    var x1 = 0.0
    var x2 = 0.0
    if (m > 0) {
      x1 = -b + sqrt(m) / 2 * a
      x1 = -b - sqrt(m) / 2 * a
      println("有两个解：x1=" + x1.formatted("%.2f") + "\tx2=" + x2.formatted("%.2f"))
    } else if (m == 0) {
      x1 = -b
      println("有一个解：x1=" + x1.formatted("%.2f"))
    }else{
      println("无解…")
    }
  }
}
