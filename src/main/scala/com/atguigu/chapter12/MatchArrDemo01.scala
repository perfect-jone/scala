package com.atguigu.chapter12

object MatchArrDemo01 {
  def main(args: Array[String]): Unit = {
    var arr = Array(10, 20)
    var result = arr match {
      case Array(x, y) => (y, x)
      case _ => "ok"
    }
    println(result)
  }
}
