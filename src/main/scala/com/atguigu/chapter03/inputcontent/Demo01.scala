package com.atguigu.chapter03.inputcontent

import scala.io.StdIn

object Demo01 {
  def main(args: Array[String]): Unit = {
    println("请输入姓名")
    val name = StdIn.readLine()
    println("请输入年龄")
    val age = StdIn.readInt()
    println("请输入薪水")
    val sal = StdIn.readDouble()
    printf("用户信息为：name=%s age=%d sal=%.2f",name,age,sal)

  }
}
object Dog extends Animal {
  def sayHi(): Unit = {
    println("汪汪……")
  }
}
//Animal是特质，等价于java中的interface+abstract class
trait Animal{
  def sayHello():Unit = {
    println("Animal sayHello")
  }
}