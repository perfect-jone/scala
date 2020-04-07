package com.atguigu.chapter09.selftype

object SelfTypeDemo {
  def main(args: Array[String]): Unit = {

  }
}

trait Logger {

  //明确告诉编译器，我就是Exception,相当于 trait Logger extends Exception
  //要求混入该特质的类也是Exception的子类
  this: Exception =>
  def log(): Unit = {
    println(getMessage)
  }
}

//Console不是Exception的子类
//class Console extends Logger {}

class Console extends Exception with Logger {}