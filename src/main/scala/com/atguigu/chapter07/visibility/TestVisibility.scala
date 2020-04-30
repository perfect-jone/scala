package com.atguigu.chapter07.visibility

/**
  * 1.当属性访问权限为默认时，从底层看属性是private，但是可以在任何地方使用，因为提供了xxx()和xxx_$eq()方法
  * 2.当方法访问权限为默认时，默认为publicb访问权限
  * 3.private为私有权限，只在类的内部和伴生对象中可用
  * 4.protected为受保护权限，scala中受保护权限比java中更严格，只能所有子类可以访问，同包不可以访问
  * 5.scala中没有public关键字,即不能用public显式的修饰属性和方法
  * 6.包访问权限，可以扩大访问范围
  */
object TestVisibility {
  def main(args: Array[String]): Unit = {
    val physicist = new Physicist
    //physicist.age 被private修饰，只在类的内部和伴生对象中可用
    //physicist.sal 被protected修饰，只能在所有子类、类的内部和伴生对象中可用
    physicist.showInfo()
    Physicist.test(physicist)

    val engineer = new Engineer
    println(engineer.name)
  }
}

object Physicist{
  def test(physicist: Physicist): Unit ={
    //在伴生对象中，可以访问physicist.name和physicist.age

    //private为私有权限，只在类的内部和伴生对象中可用
    println(physicist.name+"\t"+physicist.age+"\t"+physicist.sal)
  }
}

/**
  * 1.当一个类中出现了object和class同名时,class Physicist为伴生类，object Physicist为伴生对象
  * 2.因为Martin ordersky将static拿掉，于是设计了伴生类和伴生对象的概念
  * 3.伴生类：写非静态内容；伴生对象：写静态内容
  *
  */
class Physicist{
  var name: String = "Martin ordesky"
  private var age: Short = 50
  protected var sal: Double = 9999.99

  def showInfo(): Unit ={

    //private为私有权限，只在类的内部和伴生对象中可用
    println(name+"\t"+age+"\t"+sal)
  }
}

class Engineer{
  //增加一个包访问权限
  //private[visibility]仍然是私有的，扩大了访问的范围
  private[visibility] val name = "James Gosling"
}
