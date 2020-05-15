package com.atguigu.chapter19

import scala.io.StdIn

// scala取模：%  a % b = a - a / b * b
object CicleArrayQueueDemo {
  def main(args: Array[String]): Unit = {
    var key = ""
    val queue = new CicleArrayQueue(3)
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
        case _ => println("什么都没有匹配到")
      }
    }
  }
}

class CicleArrayQueue(ArrMaxSize: Int) {
  val maxSize = ArrMaxSize
  val arr = new Array[Int](maxSize) //该数组存放数据，模拟队列
  var front = 0 //队列头元素
  var rear = 0 //队列尾元素

  //判断队列满
  def isFull(): Boolean = {
    (rear + 1) % maxSize == front
  }

  //判断队列空
  def isEmpty(): Boolean = {
    rear == front
  }

  //1.向队列中加入元素
  def addQueue(n: Int): Unit = {
    if (isFull()) {
      println("队列是满的，不能再增加数据了")
      return
    }
    arr(rear) = n
    //加入元素后，rear向后移动一位，用模的方式
    rear = (rear + 1) % maxSize
  }

  //2.从队列中取出元素
  def getQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空T^_^T")
    }
    //取出元素后，front向后移动一位
    val value = arr(front)
    front = (front + 1) % maxSize
    return value
  }

  //3.显示队列

  //队列元素个数
  def size(): Int = {
    (rear - front + maxSize) % maxSize
  }

  def showQueue(): Unit = {
    if (isEmpty()) {
      println("队列是空的，没有数据")
      return
    }
    //从front开始取，队列中有几个元素就取几个，size表示当前队列中有几个元素
    for (i <- front until front + size()) {
      printf("arr(%d)=%d\n", i % maxSize, arr(i % maxSize))
    }
  }


  //4.查看队列头元素，但不是改变队列
  def headQueue(): Any = {
    if (isEmpty()) {
      return new Exception("队列空O^_^O")
    }
    return arr(front)
  }
}



















