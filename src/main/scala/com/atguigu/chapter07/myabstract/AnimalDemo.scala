package com.atguigu.chapter07.myabstract

/**
  * 1.抽象类不能被实例化 //val anmial = new Anmial
  * 2.抽象类不一定要包含abstract方法，也可以没有abstract方法 //def laugh(): Unit = {}
  * 3.一旦类包含了抽象属性或者抽象方法时，则这个类也必须声明为abstract  //abstract class Anmial{}
  * 4.抽象方法不能有方法体，不能用abstract修饰  //def cry()
  * 5.如果一个类继承了一个抽象类，则必须实现它的所有抽象属性和抽象方法,或者自己也声明为abstract类
  * 6.抽象属性和抽象方法不能用private/final来修饰，因为和重写相违背
  * 7.子类重写抽象方法不需要override，写上也不会报错
  * 8.抽象类中可以有实现的方法
  **/
object AnmialDemo {
  def main(args: Array[String]): Unit = {
    val animal = new Animal {
      var name: String = _
      override var age: Int = _

      override def cry(): Unit = {
        println("cry")
      }
    }
    animal.cry()
  }
}

abstract class Animal {
  var name: String //抽象字段
  var age: Int//抽象字段
  var color: String = "black" //普通字段

  def cry() //抽象方法，用abstract修饰运行会报错

  //可以有实现的方法
  def laugh(): Unit = {
    println("laugh")
  }
}

class Dog extends Animal {
  override var name: String = _
  override var age: Int = _

  override def cry(): Unit = {
    println("cry")
  }
}
