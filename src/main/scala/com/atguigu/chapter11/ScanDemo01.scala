package com.atguigu.chapter11

object ScanDemo01 {
  def main(args: Array[String]): Unit = {
    //扫描 scanLeft scan scanRight
    val list = List(1,2,3,4)
    def minus(n1: Int, n2: Int): Int = {
      n1 - n2
    }

    // List(10,1,2,3,4) 先把10保存起来 => List(10, 9, 7, 4, 0)
    val list2 = list.scanLeft(10)(minus)
    println(list2)

    //List(1,2,3,4,10) => List(8,-7,9,-6,10)
    val list3 = list.scanRight(10)(minus)
    println(list3)
  }
}
