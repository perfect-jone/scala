package com.atguigu.chapter05.fundetails

object Details08 {
  def main(args: Array[String]): Unit = {

    //f("v2") 报错
    //f(p2="v2")
    def f1(): Unit = {
      //私有方法 private final
      println("f1")
    }

    def sayOk(): Unit = {
      //private final sayOk$1()
      println("main sayOk")

      def sayOk(): Unit = {
        //private final sayOk$2()
        println("sayok sayok")
      }
    }

    //println("ok---")
  }

  def sayOk(): Unit = {
    //成员
    println("sayOk")
  }

  def f(p1: String = "jone", p2: String){
    println(p1+p2)
  }
}
