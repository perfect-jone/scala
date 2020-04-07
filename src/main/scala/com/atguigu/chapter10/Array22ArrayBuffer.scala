package com.atguigu.chapter10

import scala.collection.mutable.ArrayBuffer
object Array22ArrayBuffer {
  def main(args: Array[String]): Unit = {
    val ab = ArrayBuffer[Int]()
    ab.append(1,2,3)
    println(ab)

    //将变长数组转为定长数组，ab本身没有任何变化
    val newArr = ab.toArray
    println(newArr)

    //将定长数组转为变长数组，newArr本身没有任何变化
    val newBuf = newArr.toBuffer
    newBuf.append(123)
    println(newBuf)
  }
}
