package com.atguigu.chapter05.myexception

object ScalaExcepitonDemo {
  def main(args: Array[String]): Unit = {
    try {
      val r = 10 / 0
    } catch {
      //1.在scala中，只有一个catch，一个catch可以有多个case，一个case匹配一种异常
      //2.=>关键符号，表示后面是对该异常对象的处理代码块
      //3.finally最终都是要执行的
      //4.scala没有编译异常，异常都是运行异常
      //5.用throw关键字，抛出一个异常对象，所有异常都是Throwable的子类，throw表达式是有类型的，就是Nothing
      case e : ArithmeticException => println("捕获了算数异常")
      case e : Exception => println("捕获了异常")
    } finally {
      println("scala finally")
    }
  }
}
