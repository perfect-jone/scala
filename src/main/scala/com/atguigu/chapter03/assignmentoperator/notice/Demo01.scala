package com.atguigu.chapter03.assignmentoperator.notice

object Demo01 {
  def main(args: Array[String]): Unit = {
    val num = if (5 > 4) 5 else 4
    //println(num)

    val n1 = 10
    val n2 = 20
    val n3 = 30

    //求两个数的最大值
    val res2 = {
      if (n1 > n2) "最大值是" + n1 else "最大值是" + n2
    }
    //求三个数的最大值
    val res3 = {
      if (n1 > n2) {
        if (n1 > n3) "最大值是" + n1 else "最大值是" + n3
      } else {
        if (n2 > n3) "最大值是" + n2 else "最大值是" + n3
      }
    }
    println(res3)

  }
}
