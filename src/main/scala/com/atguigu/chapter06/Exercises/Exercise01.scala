package com.atguigu.chapter06.Exercises

import scala.io.StdIn

object Exercise01 {
  def main(args: Array[String]): Unit = {
    /**
      * 1.一个数字为正数，则它的signum为1；为负，则为-1；为0，则为0
      */

    /*    println("请输入一个数")
        val n = StdIn.readDouble()
        var signum = 0
        if (n > 0) {
          signum = 1
        }else if (n == 0) {
          signum = 0
        } else{
          signum = -1
        }
        println(signum)*/


    /**
      * 2.针对下列java循环编写一个scala版本
      * for (int i = 10 ; i >= 0 ; i--) System.out.println(i);
      */
    for (i <- 1 to 10 reverse) {
      println(i)
    }
  }
}
