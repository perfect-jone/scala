package com.atguigu.chapter10

import scala.collection.mutable.ArrayBuffer
object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {

    //ArrayBuffer是变长数组，类似于java的ArrayList
    val ab = ArrayBuffer[Any]("jone",3,2,5)
    println(ab(0))

    for (i <- ab) {
      println(i)
    }

    println(ab.length)
    println(ab.hashCode())

    ab.append("hello")
    println(ab.hashCode())

    ab(4) = "world"
    println(ab.length)

    ab.remove(4)

    //def append(elems: A*) 接收的是可变参数，每append一次,ab在底层会重新分配空间，
    // 进行扩容,ab的内存地址就会发生变化，也就成为新的ArrayBuffer
    ab.append(1,2,3)
    for (i <- ab) {
      println(i)
    }
  }
}
