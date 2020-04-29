package com.atguigu.chapter17.decorator

import com.atguigu.chapter17.decorator.mycoffee.LongBlack
import com.atguigu.chapter17.decorator.mydecorator.{Chocolate, Milk}

object DrinkBar {
  def main(args: Array[String]): Unit = {
    var longBlack: Drink = new LongBlack

    longBlack = new Milk(longBlack)
    longBlack = new Milk(longBlack)
    longBlack = new Chocolate(longBlack)

    println("总价是：" + longBlack.cost() + "元")
    println(longBlack.getDescription())
  }
}
