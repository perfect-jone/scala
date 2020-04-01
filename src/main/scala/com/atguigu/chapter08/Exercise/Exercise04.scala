package com.atguigu.chapter08.Exercise

/**
  * 4、编写一个扑克牌 4 种花色的枚举,让其 toString 方法分别返回♣,♦,♥,♠，并实现一个函数,检查某张牌的花色是否为红色
  */
object Exercise04 extends App {
  println(Suits.toString())
  println(Suits.isRed(Suits.Heart))
}

object Suits extends Enumeration {
  type Suits = Value//给Value取了别名Suits
  val Spade = Value("♠")
  val Club = Value("♣")
  val Heart = Value("♥")
  val Diamond = Value("♦")

  override def toString() = Suits.values.mkString(",")

  def isRed(card: Suits) = (card == Heart || card == Diamond)

  //等价于
  /*  def isRed(card: Suits): Boolean = {
      if(card == Heart || card == Diamond) true
    }*/

}

