package com.atguigu.chapter11

/**
  * flatmap:扁平化映射，就是将集合中每个元素的子元素映射到某个函数并返回新的集合
  */
object FlatMapDemo01 {
  def main(args: Array[String]): Unit = {

    val names = List("Alice", "Bob", "Nick", "Jone")
    //对List集合中的所有元素，进行扁平化操作，即把所有元素打散
    //List("Alice", "Bob", "Nick", "Jone") =>"Alice", "Bob", "Nick", "Jone" => A l i c e B o b N i c k J o n e

    //final override def flatMap[B, That](f: A => GenTraversableOnce[B])(implicit bf: CanBuildFrom[List[A], B, That]): That
    val newNames = names.flatMap(lower2Upper)
    println(newNames)
  }

  def lower2Upper(s: String): String = {
    s.toUpperCase()
  }
}
