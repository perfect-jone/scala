package com.atguigu.chapter12.caseClass

object CaseClassDemo01 {
  def main(args: Array[String]): Unit = {
    println("hello")
  }
}
//当有参数的时候，用case class ，当没有参数的时候那么用case object，
//这时就没有了case class的apply和unapply方法
//意义在于区分 有参和无参

//样例类是为模式匹配而优化的类
//构造器中的每一个参数都称为val，除非它被显式的声明为var（不建议）
//在样例类对应的伴生对象中提供apply方法让我们不用new关键字就能构造出相应的对象
//提供unapply方法让模式匹配可以工作
//自动生成tostring/equals/hashCode/copy方法，同时也实现了序列化接口
abstract class Amount
//value只有读的方法，没有写的方法
case class Dollar(value: Double) extends Amount //样例类
case class Currency(value: Double,unit: String) extends Amount
case object NoAmount extends Amount
