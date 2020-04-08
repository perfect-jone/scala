package com.atguigu.chapter10

import scala.collection.mutable.ArrayBuffer

object ArrayBufferDemo01 {
  def main(args: Array[String]): Unit = {

    //ArrayBuffer是变长数组，类似于java的ArrayList
    val ab = ArrayBuffer[Any](1,2,3)
    println(ab(0)) //1

    ab(1) = 0 //(1,0,3)
    println(ab)

    println(ab.length) //3

    ab.remove(0) //(0,3)
    println(ab)

    //def append(elems: A*) 接收的是可变参数，每append一次,ab在底层会重新分配空间，
    // 进行扩容,ab的内存地址就会发生变化，也就成为新的ArrayBuffer
    ab.append(4) //(0,3,4)
    println(ab)
    ab += 5 //(0,3,4,5)
    println(ab)
    println(ab.take(1)) //0


  }
}
