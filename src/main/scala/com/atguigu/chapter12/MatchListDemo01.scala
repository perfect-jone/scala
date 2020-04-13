package com.atguigu.chapter12

object MatchListDemo01 {
  def main(args: Array[String]): Unit = {
    val arrs = Array(List(0), List(88), List(1, 0), List(0, 0, 0), List(1, 0, 0))
    for (list <- arrs) {
      val result = list match {
        case 0 :: Nil => "0"
        case x :: Nil => x
        case x :: y :: Nil => x + " " + y
        case 0 :: tail => "0..."
        case _ => "something else"
      }
      println(result)
    }
  }
}
