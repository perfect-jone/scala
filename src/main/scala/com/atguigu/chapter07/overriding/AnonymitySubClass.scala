package com.atguigu.chapter07.overriding


object AnonymitySubClass {
  def main(args: Array[String]): Unit = {

    //匿名对象，因为抽象类不能直接创建对象，所以可以使用匿名子类实现抽象类中的所有抽象属性和抽象方法
    val monster = new Monster {
      override def cry(): Unit = {
        println("Baby is crying... :(")
      }

      override var name: String = _
    }
    monster.cry()
  }
}

abstract class Monster {
  var name: String

  def cry()
}
