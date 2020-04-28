package com.atguigu.chapter15

object Test {
  def main(args: Array[String]): Unit = {
    println("ok")
  }
}


abstract class Amount
//value只有读的方法，没有写的方法
case class Dollar(value: Double) extends Amount //样例类
case class Currency(value: Double,unit: String) extends Amount
case object NoAmount extends Amount
