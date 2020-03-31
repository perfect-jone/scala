package com.atguigu.chapter08.Exercise

/**
  * 2、定义一个 Point 类和一个伴生对象,使得我们可以不用 new 而直接用 Point(3,4)来构造 Point 实例 apply 方法的使用
  */
object Exercise02 {
  def main(args: Array[String]): Unit = {
    val point = Point01(3, 4)
  }
}

class Point01(n1: Int, n2: Int) {

}

object Point01 {
  def apply(n1: Int, n2: Int): Point01 = new Point01(n1, n2)
}