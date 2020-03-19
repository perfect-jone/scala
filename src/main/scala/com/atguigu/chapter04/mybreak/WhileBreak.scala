package com.atguigu.chapter04.mybreak

import scala.util.control.Breaks._

object WhileBreak {
  def main(args: Array[String]): Unit = {
    var n = 1
    //op: => Unit,breakable是一个高阶函数，能够接受函数的函数

    /**
      * def breakable(op: => Unit) {
      * try {
      * op
      * } catch {
      * case ex: BreakControl =>
      * if (ex ne breakException) throw ex
      * }
      * }
      */
    //1.op: => Unit 表示接收的参数是一个没有输入，也没有返回值的函数
    //2.即可以简单的理解可以接收一段代码块
    //3.breakable对break()抛出的异常做了处理，代码继续执行
    //4.当我们传入的是代码块时，可以将()改为{}
    /*    breakable {
          while (n <= 20) {
            n += 1
            println(n)
            if (n == 18) {
              //在scala中使用函数式的break函数中断循环
              //def break(): Nothing = { throw breakException }
              break()
            }
          }
        }
        println("ok")*/

    breakable {
      for (i <- 1 to 100) {
        println("i=" + i)
        if (i == 20) {
          break()
        }
      }
    }
  }
}
