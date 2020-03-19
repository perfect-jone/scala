package com.atguigu.chapter02.datetype

object StrVal {
  def main(args: Array[String]): Unit = {
    var str2 : String = true + ""
    var str1 : String = 8.8 + ""
    var s = "100"
    var res = s.toInt
    println(res.isInstanceOf[Int])
  }
}
