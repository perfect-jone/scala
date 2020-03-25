package com.atguigu.chapter05.myexception

object ThrowDemo {
  def main(args: Array[String]): Unit = {
    try {
      val res = test()
      println(res.toString)
    } catch {
      case e: Exception => println("捕获到了异常"+ e.getMessage)
    }
  }

  def test(): Nothing = {
    throw new Exception("NO1异常")
  }
}
