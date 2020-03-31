package com.atguigu.chapter08.mytrait

object TraitDemo01 {
  def main(args: Array[String]): Unit = {
    val c = new C
    val e = new E
    c.getConnect()
    e.getConnect()
  }
}

class A {}

class B extends A {}
class C extends A with Trait01 {
  override def getConnect(): Unit = {
    println("连接Mysql代码")
  }
}

class D {}

class E extends D with Trait01 {
  override def getConnect(): Unit = {
    println("连接Oracle代码")
  }
}
class F extends D {}

trait Trait01{
  def getConnect()//抽象方法
}