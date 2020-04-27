package com.atguigu.chapter10

import scala.collection.mutable


object QueueDemo01 {
  def main(args: Array[String]): Unit = {
    val q1 = mutable.Queue[Int]()
    //追加元素
    q1 += 1
    q1 += 2

    q1 ++= List(3,4,5)
    println(q1)

    //获取元素
    println("q1(0)="+q1(0))
    println("q1.front="+q1.front) //获取队列头元素
    println(q1)
    println("q1.head="+q1.head) //获取队列头元素
    println(q1)
    println("q1.last="+q1.last) //获取队列尾元素
    println("q1.tail="+q1.tail) //获取除了第一个以外剩余的元素
    println("q1.tail.tail="+q1.tail.tail) //获取除了前两个以外剩余的元素

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
