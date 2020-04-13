package com.atguigu.chapter11

object ParDemo01 {
  def main(args: Array[String]): Unit = {

    // parallel 并行计算
    (1 to 5).foreach(println(_))

    //输出的结果是无序的，说明是将println任务分配给不同给的cpu
    (1 to 5).par.foreach(println(_))

    val list = List(1, 2, 3, 4, 5)
    list.par.map(println(_))
  }
}
