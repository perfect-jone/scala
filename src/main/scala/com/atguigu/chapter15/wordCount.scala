package com.atguigu.chapter15

object wordCount {
  def main(args: Array[String]): Unit = {

    val lines = List("Monday is busy and Sunday is free", "He is a good boy and is busy boy", "He like Sunday and hit Monday")

    //扁平化，按空格切割
    //val res1 = lines.flatMap((s: String) => s.split(" "))
    val res1 = lines.flatMap(_.split(" "))
    println("res1=" + res1)

    //转换成对偶
    //val res2 = res1.map((s: String) => (s, 1))
    val res2 = res1.map((_, 1))
    println("res2=" + res2)

    //分组
    //val res3 = res2.groupBy((x:(String,Int)) => x._1)
    val res3 = res2.groupBy(_._1)
    println("res3=" + res3)

    //求和
    //val res4 = res3.map((x:(String,List[(String,Int)])) => (x._1,x._2.size))
    val res4 = res3.map(x => (x._1, x._2.size))
    println("res4=" + res4)

    //排序
    //val res5 = res4.toList.sortBy((x: (String, Int)) => x._2).reverse
    val res5 = res4.toList.sortBy(_._2).reverse
    println("res5="+res5)


    //一步到位
    val res6 = lines.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).map(x => (x._1,x._2.size)).toList.sortBy(_._2).reverse
    println("res6="+res6)

  }
}
