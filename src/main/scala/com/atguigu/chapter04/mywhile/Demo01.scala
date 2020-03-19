package com.atguigu.chapter04.mywhile

object Demo01 {
  def main(args: Array[String]): Unit = {
    var i = 0
/*    while (i < 10) {
      //println("hello" + i)
      i += 1
    }*/

    do{
      println("hello" + i)
      i += 1
    }while(i < 10)
  }
}
