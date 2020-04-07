package com.atguigu.chapter10;

object ArrayDemo02 {
  def main(args: Array[String]): Unit = {
    val arr02 = Array("jone",3,99.99,'Q')
    arr02(0) = 9
    for (i <- arr02) {
      println(i)
    }


  }
}
