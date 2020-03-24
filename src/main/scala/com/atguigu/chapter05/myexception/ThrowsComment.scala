package com.atguigu.chapter05.myexception

object ThrowsComment {
  def main(args: Array[String]): Unit = {
    f()
  }

  @throws(classOf[NumberFormatException])//等同于java NumberFormatException.class
  def f() = {
    "abc".toInt
  }
}
