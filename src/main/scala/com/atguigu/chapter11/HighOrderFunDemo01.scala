package com.atguigu.chapter11

/**
  * map映射：将集合中的每一个元素通过函数映射(转换)成新的集合，其实就是将函数作为参数传给另外一个函数
  * Example:
  * def map[B](f: (A) => B):HashSet[B]
  */
object HighOrderFunDemo01 {
  def main(args: Array[String]): Unit = {

    val list = List(2, 3, 5)

    val d = test(sum _, 4)
    println(d)

    // _ 表示可以把一个函数直接赋值给一个变量，但是不执行函数
    val f1 = myPrint _ //f1类型为() => Unit
    val f2 = myPrint // 不加 _ 的类型为()，表示将myPrint执行的结果赋给f2

    f1() //函数名+括号表示执行该函数
  }

  def myPrint(): Unit = {
    println("I love coding!")
  }

  // test 高阶函数
  // f: Double => Double 函数签名 表示该函数可以接收一个Double类型的值，返回也是Double
  // n1: Double 普通参数
  // f(n1) 表示在test函数中，执行你传入的函数
  def test(f: Double => Double, n1: Double) = {
    f(n1)
  }

  def sum(d: Double): Double = {
    d * 2
  }
}
