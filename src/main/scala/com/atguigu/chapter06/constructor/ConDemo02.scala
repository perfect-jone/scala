package com.atguigu.chapter06.constructor

object ConDemo02 {
  def main(args: Array[String]): Unit = {
    val a = new A("jone")
  }
}

//先调用父类的主构造器，在调用子类的主构造器，最后调用子类的辅助构造器
//B后面的小括号被省略了
class B{
  println("父类的主构造器")
}

class A extends B{
  println("子类的主构造器")
  def this(name: String){
    this
    println("子类的辅助构造器")
  }
}