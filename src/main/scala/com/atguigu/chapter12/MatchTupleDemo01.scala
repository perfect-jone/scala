package com.atguigu.chapter12

object MatchTupleDemo01 {
  def main(args: Array[String]): Unit = {
    val arrs = Array((0, 1), (1, 0), (10, 30), (1, 1), (1, 0, 2))
    for (tuple <- arrs) {
      val result = tuple match {
        case (0, _) => "0..."
        case (y, 0) => y
        case (x, y) => (y, x)
        case _ => "other"
      }
      println(result)
    }
  }
}
