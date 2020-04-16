package com.atguigu.chapter12.caseClass

object SealedCaseClassDemo01 {
  def main(args: Array[String]): Unit = {

  }
}

//密封类
abstract sealed class Amount1

case class Dollar1(value: Double) extends Amount1 //样例类
case class Currency1(value: Double,unit: String) extends Amount1
case object NoAmount1 extends Amount1
