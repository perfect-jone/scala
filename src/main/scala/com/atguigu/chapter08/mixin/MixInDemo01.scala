package com.atguigu.chapter08.mixin

object MixInDemo01 {
  def main(args: Array[String]): Unit = {
    //在不修改类的定义基础上，让下面两个类使用trait中的方法,动态混入
    val b = new OracleDB with Operate3
    b.insert(100)
    val l = new MySQL with  Operate3
    l.insert(200)

    val l_ = new MySQL_ with Operate3 {
      override def say(): Unit = {
        println("say")
      }
    }
    l_.insert(300)
    l_.say()
  }
}

trait Operate3 {
  def insert(id: Int): Unit = {
    println("插入数据=" + id)
  }
}

class OracleDB {}

abstract class MySQL {

}

//如果一个抽象类中有抽象方法，如何动态混入trait
abstract class MySQL_ {
  def say()
}

