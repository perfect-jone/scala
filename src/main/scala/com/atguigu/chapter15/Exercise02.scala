package com.atguigu.chapter15

object Exercise02 {
  def main(args: Array[String]): Unit = {

    def swap2(arr: Array[Any]) = {
      arr match {
        case Array(first,second,rest@_*) => Array(second,first).toBuffer ++ rest.toBuffer
        case _ => arr
      }
    }

    println(swap2(Array(1,2,3,4,"hello")))
  }
}
