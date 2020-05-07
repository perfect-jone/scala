package com.atguigu.chapter18.generic

object GenericDemo02 {
  def main(args: Array[String]): Unit = {
    //定义一个函数，可以获取各种类型的 List 的中间index的值
    //使用泛型完成
    val list1 = List("hello1","hello2","hello3")
    val list2 = List(1,2,3)
    val list3 = List("hello1",8,"hello2")
    println(midList[String](list1))
    println(midList[Int](list2))
    println(midList[Any](list3))

  }

  def midList[A](l: List[A]): A = {
    l(l.length / 2)
  }
}
