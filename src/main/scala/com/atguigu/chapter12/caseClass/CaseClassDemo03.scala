package com.atguigu.chapter12.caseClass

object CaseClassDemo03 {
  def main(args: Array[String]): Unit = {

    val amt = Currency3(100.0,"RMB") //使用了apply方法

    //使用copy方法创建相同的对象
    val amt2 = amt.copy()
    println(amt.hashCode()+" vs "+amt2.hashCode()) //使用hashCode方法

    //copy可以改变参数
    val amt3 = amt.copy(88.88,"$")
    println(amt3) //重写了toString方法
  }
}

abstract class Amount3
//value只有读的方法，没有写的方法
case class Dollar3(value: Double) extends Amount3 //样例类
case class Currency3(value: Double,unit: String) extends Amount3
case object NoAmount3 extends Amount3
