package com.atguigu.chapter19.queue

import scala.io.StdIn

object ArrayQueueDemo {
  def main(args: Array[String]): Unit = {
    var key = ""
    val queue = new ArrayQueue(3)
    while (true) {
      println("show: 表示显示队列")
      println("add:  表示增加数据到队列")
      println("get:  从队列中取出数据")
      println("head: 查看队列头元素")
      println("exit: 表示退出队列")
      key = StdIn.readLine()
      key match {
        case "show" => queue.showQueue()
        case "add" => {
          println("请输入一个数")
          val value = StdIn.readInt()
          queue.addQueue(value)
        }
        case "get" => {
          val res = queue.getQueue()
          if (res.isInstanceOf[Exception]) {
            println(res.asInstanceOf[Exception].getMessage)
          } else {
            println(s"取出数据是：$res")
          }
        }
        case "head" => {
          val head = queue.headQueue()
          if (head.isInstanceOf[Exception]) {
            println(head.asInstanceOf[Exception].getMessage)
          } else {
            println(s"头元素为：$head")
          }
        }
        case "exit" => System.exit(0)
      }
    }
  }
}

class ArrayQueue(ArrMaxSize: Int) {
  val maxSize = ArrMaxSize
  val arr = new Array[Int](maxSize) //该数组存放数据，模拟队列
  var front = -1 //队列头，不包含数据
  var rear = -1 //队列尾，包含数据
  //判断数组是否空
  def isEmpty(): Boolean = {
    front == rear
  }

  //判断数组是否满
  def isFull(): Boolean = {
    rear == maxSize - 1
  }

  //1.显示队列
  def showQueue(): Unit = {
    //判断数组是否空
    if (isEmpty()) {
      println("队列是空的，没有数据")
      return
    }
    for (i <- front + 1 to rear) {
      printf("arr[%d]=%d\n", i, arr(i))
    }
  }

  //2.增加数据到队列
  def addQueue(n: Int): Unit = {
    //判断数组是否满
    if (isFull()) {
      println("队列是满的，不能再增加数据了")
      return
    }
    rear += 1
    arr(rear) = n
  }

  //3.从队列中取出数据
  def getQueue(): Any = {
    //判断数组是否空
    if (isEmpty()) {
      return new Exception("队列空T^_^T")
    }
    front += 1
    arr(front)
  }

  //4.查看队列头元素，但不是改变队列
  def headQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空O^_^O")
    }
    return arr(front + 1)
  }

  /**
    * 5.分析问题：
    * 1）没有考虑数据空间的复用
    * 2）可以将数据通过取模的方式，将数组当成一个环形队列处理
    * 3）运用算法
    * */
}
