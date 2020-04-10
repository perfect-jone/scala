package com.atguigu.chapter10

import scala.collection.mutable

object SetDemo01 {
  def main(args: Array[String]): Unit = {
    val set = Set(1, 2, 3, 4)
    println(set)

    val set2 = mutable.Set(1,2,"hello","world")
    set2 += 3
    set2 -= 4//key不存在也不会报错
    println(set2)
    for (i <- set2) {
      print(i+"\t")
    }
    println()
    println("====================================================")

    val set3 = mutable.Set(1,3,6,9)//无序不重复
    println(set3)
    println(set3.min+"\t"+set3.max+"\t"+set3.sum+"\t"+(set3.sum.toDouble/set3.size.toDouble))
    println(set3.head+"\t"+set3.last+"\t"+set3.tail)

    val list = mutable.ListBuffer(1,3,6,9,9)//有序重复
    println(list.min+"\t"+list.max+"\t"+list.sum+"\t"+(list.sum.toDouble/list.size.toDouble))
    println(list.head+"\t"+list.last+"\t"+list.tail)

  }
}
