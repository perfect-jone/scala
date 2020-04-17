package com.atguigu.chapter13

object AbstractControlApp {
  def main(args: Array[String]): Unit = {

    var x = 10

    //until后面小括号和大括号都是匿名函数condition: => Boolean和 block: => Unit
    until(x > 0) {
      x -= 1
      println("until x=" + x)
    }

    def until(condition: => Boolean)(block: => Unit): Unit = {
      if (condition) {
        block
        //递归调用until
        until(condition)(block)
      }
    }
  }
}
