package com.atguigu.chapter08.Exercise

/**
  * 4、定义一个抽象类Shape，一个抽象方法centerPoint，以及该抽象类的子类Rectangle和Circle。
  * 为子类提供合适的构造器，并重写centerPoint方法
  */
object Exercise08 {
  def main(args: Array[String]): Unit = {
    val rectangle = new Rectangle(3, 4)
    val circle = new Circle(10)
    rectangle.perimeter()
    circle.perimeter()

  }
}

abstract class Shape {
  def perimeter() //周长
}

class Rectangle(x: Double, y: Double) extends Shape {
  override def perimeter(): Unit = {
    val s = 2 * (x + y)
    println("矩形的周长是" + s.formatted("%.2f"))
  }
}

class Circle(r: Double) extends Shape {
  override def perimeter(): Unit = {
    val s = 2 * 3.14 * r
    println("圆的周长是" + s.formatted("%.2f"))
  }
}
