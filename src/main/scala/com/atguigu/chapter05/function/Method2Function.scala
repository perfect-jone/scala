package com.atguigu.chapter05.function

/**
  * 方法和函数的关系：在面向对象编程中，称为方法；在函数式编程中，称为函数。
  * 在不同的场景下叫法不同，本质其实都是一样的，都是一段代码，为了完成某个功能。
  */
object Method2Function {
  def main(args: Array[String]): Unit = {

    //使用方法：先创建一个对象
    val dog = new Dog()
    println(dog.sum(1, 2))

    //方法转成函数
    val f1 = dog.sum _
    println("f1=" + f1)
    println("f1=" + f1(2, 3))

    //函数：求两个数的积
    val f2 = (n1: Int, n2: Int) => {
      n1 * n2
    }

    //函数使用
    println("f2=" + f2(10, 10))
  }
}

//方法：求两个数的和
class Dog {
  def sum(n1: Int, n2: Int): Int = {
    n1 + n2
  }
}
