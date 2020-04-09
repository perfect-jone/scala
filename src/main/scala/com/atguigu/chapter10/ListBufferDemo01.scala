package com.atguigu.chapter10

import scala.collection.mutable.ListBuffer

object ListBufferDemo01 {
  def main(args: Array[String]): Unit = {
    val lb = ListBuffer[Int]()

    //追加元素
    lb += 1
    lb.append(2)

    //获取单个元素
    println("lb0="+lb(0))

    val lb1 = new ListBuffer[Int]
    lb1 += 3
    lb1.append(4)
    lb1 -= 4
    println("lb1="+lb1)


    //将lb1集合加入到lb集合中
    lb ++= lb1
    println("lb="+lb)

    //将lb集合和lbq集合加入到lb2集合中
    val lb2 = lb ++ lb1
    println("lb2="+lb2)

    //将元素5追加到lb3集合的尾部
    val lb3 = lb :+ 5
    println("lb3="+lb3)

    //删除元素
    val lb4 = ListBuffer[Int](9,8,7,6,5)
    lb4.remove(0)
    println("lb4="+lb4)
    lb4.remove(2,2)
    println("lb4_="+lb4)

  }
}
