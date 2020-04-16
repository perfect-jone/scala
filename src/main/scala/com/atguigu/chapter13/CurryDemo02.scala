package com.atguigu.chapter13

object CurryDemo02 {
  def main(args: Array[String]): Unit = {
    //需求：编写一个柯里化函数，将两个字符串转化为小写后比较是否相等
/*
    def eq(s1: String, s2: String): Boolean = {
      s1.equals(s2)
    }*/

    implicit class TestEq(s1: String) {
      //分解为两个任务
      //checkEq函数负责比较
      //f函数负责转化大小写
      def checkEq(s2: String)(f: (String, String) => Boolean): Boolean = {
        f(s1.toLowerCase, s2.toLowerCase)
      }
    }
    val str1 = "hello"
    //println(str1.checkEq("HELLO")(eq))
    //简写形式
    //println(str1.checkEq("Hello")((s1: String, s2: String) => s1.equals(s2)))
    println(str1.checkEq("Hello")(_.equals(_)))
  }
}
