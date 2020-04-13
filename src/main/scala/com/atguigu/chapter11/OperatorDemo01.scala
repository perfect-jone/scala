package com.atguigu.chapter11

object OperatorDemo01 {
  def main(args: Array[String]): Unit = {
    val n1 = 1
    val n2 = 2
    val r1 = n1 + n2
    val r2 = n1.+(n2) //中置操作符:对操作符进行重载

    val monster = new Monster
    monster + 10
    monster.+(10)
    println(monster.money)

    monster ++

    monster.++
    println(monster.money)

    !monster
    println(monster.money)
  }
}

class Monster {
  var money: Int = 0

  //中置操作符
  def +(n: Int): Unit = {
    this.money += n
  }

  //后置操作符
  def ++(): Unit = {
    this.money += 1
  }

  //前置操作符: + - ! ~
  def unary_!(): Unit ={
    this.money = - this.money
  }
}
