package com.atguigu.chapter11

object IteratorDemo01 {
  def main(args: Array[String]): Unit = {

    //迭代器的使用
    val iterator = List(1, 2, 3, 4, 5).iterator
    println("==============方式一=================")
    //方式一
    while (iterator.hasNext) {
      println(iterator.next())
    }
    println("===============方式二================")
    //方式二
    for (item2 <- iterator) {
      println(item2)
    }
  }
}
