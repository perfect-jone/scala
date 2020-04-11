package com.atguigu.chapter11

object ZipDemo01 {
  def main(args: Array[String]): Unit = {
    //拉链：本质是两个集合的合并操作，合并后每个元素是一个对偶元组
    val list1 = List(1, 2, 3)
    val list2 = List(4, 5, 6)
    val list3 = list1.zip(list2)
    val list4 = list2.zip(list1)
    println(list3) //List((1,4), (2,5), (3,6)) list3的类型是List[(Int,Int)]
    println(list4) //List((4,1), (5,2), (6,3))

    //遍历List中的元素
    for (item <- list3) {
      println(item)
    }

    ////遍历List中的对偶元组的数据
    for (item <- list3) {
      println(item._1 + "\t" +item._2)
    }
  }
}
