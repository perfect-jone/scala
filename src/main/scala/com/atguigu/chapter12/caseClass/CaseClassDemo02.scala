package com.atguigu.chapter12.caseClass

object CaseClassDemo02 {
  def main(args: Array[String]): Unit = {
    val arr = Array(Dollar(99.99), Currency(99.99, "RMB"), NoAmount)
    for (item <- arr) {
      val result = item match {

        //调用Dollar的unapply方法
        case Dollar(v) => "$" + v
        case Currency(v, u) => v + "" + u
        case NoAmount => ""
      }
      println(item + ":" + result)
    }
  }
}
