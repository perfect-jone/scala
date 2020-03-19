package com.atguigu.chapter02.datetype

/**
  * 1.在scala中一切皆对象，分为两大类AnyVal(值类型)和AnyRef(引用类型)
  * 2.Any类是所有类的父类；Nothing类是所有类的子类，在开发中可以将Nothing类型的值返回给任意变量或者函数，抛出异常使用很多；Null类是所有AnyRef类的子类，只有一个值null
  * 3.在scala中仍然遵守隐式转换，即低精度的值向高精度的值自动转换
  */
object TypeDemo01 {
  def main(args: Array[String]): Unit = {
    //因为Int是一个类，因此它的一个实例，就是可以使用很多方法
    var num1: Int = 10
    println(num1.toDouble + num1.toString)
    sayHi()
    var num = 1.99
    var num2 = 2
    num2 = num.toInt
    println(num2)
  }
  def sayHi():Unit = {
    println("say Hi")
  }
}
