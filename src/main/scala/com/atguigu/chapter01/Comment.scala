package com.atguigu.chapter01

object Comment {
  /**
    *使用scaladoc -d d:/Comment.scala可以生成对应的文档说明
    * @param args
    */
  def main(args: Array[String]): Unit = {
    println("hello world")
  }

    /**
    * @deprecated 过期
    * @example
    * 输入n1 = 10 n2 = 20 return 30
    * @param n1
    * @param n2
    * @return
    */
  def sum(n1: Int, n2: Int): Int = {
    return n1 + n2
  }
}
