package com.atguigu.chapter10

import scala.collection.mutable


object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    val q1 = new mutable.Queue[Int]
    //追加元素
    q1 += 1
    q1 += 2

    q1 ++= List(3,4,5)

    //获取元素
    println(q1(0))
    println(q1.front) //获取队列头元素

    //删除元素
    q1.dequeue() //删除队列头元素
    q1.dequeue()

    //添加元素
    q1.enqueue(6)  //def enqueue(elems: A*): Unit = this ++= elems
    q1.enqueue(9,8,7)

    //修改元素
    q1(0) = 100


    //遍历
    for (item <- q1) {
      println("item="+item)
    }
  }
}
