package com.atguigu.chapter11

object ParDemo02 {
  def main(args: Array[String]): Unit = {
    val result1 = (0 to 100).map { case _ => Thread.currentThread().getName }
    val result2 = (0 to 100).par.map { case _ => Thread.currentThread().getName }
    println(result1.distinct + result1.length.toString)
    println("==========================================")
    println(result2.distinct + result2.size.toString)
  }
}
