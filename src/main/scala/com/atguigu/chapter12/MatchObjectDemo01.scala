package com.atguigu.chapter12
import scala.math._
object MatchObjectDemo01 {
  def main(args: Array[String]): Unit = {

    //模式匹配使用
    /** 输出：
      * apply方法被调用
      * unapply方法被调用，z的值是36.0
      * 6.0
      */

    //Square(6.0)会先调用apply方法
    val number: Double = Square(6.0)
    number match {

      // 当匹配到 case Square(n)时， 调用 Square 的  unapply(z: Double): Option[Double] 方法，z的值就是number的值
      // 如果 Some(sqrt(z)) 返回的值是Some(6),则表示匹配成功，同时将 6 赋给 n
      case Square(n) => println(n)
      case _ => println("nothing matched")
    }
  }
}

object Square {

  //apply方法和unapply方法本质就是一个构造器

  //unapply方法： 对象提取器
  //如果case后面的对象提取方法的参数为多个时，则会默认使用 unapplySeq()方法
  def unapply(z: Double): Option[Double] = {
    println("unapply方法被调用，z的值是" + z)
    Some(sqrt(z))
  }

  def apply(z: Double): Double = {
    println("apply方法被调用")
    z * z
  }

}