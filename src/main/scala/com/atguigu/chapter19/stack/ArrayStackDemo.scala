package com.atguigu.chapter19.stack

import scala.io.StdIn

object ArrayStackDemo {
  def main(args: Array[String]): Unit = {
    val arrayStack = new ArrayStack(4)
    var key = ""
    while (true) {
      println("list: 遍历栈")
      println("push: 入栈")
      println("pop:  出栈")
      println("exit: 退出栈")
      key = StdIn.readLine()
      key match {
        case "list" => arrayStack.list()
        case "push" => {
          println("请输入一个数")
          val value = StdIn.readInt()
          arrayStack.push(value)
        }
        case "pop" => {
          val res = arrayStack.pop()
          if (res.isInstanceOf[Exception]) {
            res.asInstanceOf[Exception].getMessage
          } else {
            printf("出栈的数据为%d\n", res)
          }
        }
        case "exit" => System.exit(0)
        case _ => println("什么都没有匹配到")
      }
    }
  }
}

class ArrayStack(size: Int) {
  //使用数据模拟栈
  val maxSize = size
  val stack = new Array[Int](maxSize)
  var top = -1

  //栈空
  def isEmpty(): Boolean = {
    top == -1
  }

  //栈满
  def isFull(): Boolean = {
    top == maxSize - 1
  }

  //入栈
  def push(value: Int): Unit = {
    if (isFull()) {
      println("栈满")
      return
    }
    top += 1
    stack(top) = value
  }

  //出栈
  def pop(): Any = {
    if (isEmpty()) {
      println("栈空")
      return new Exception("栈空")
    }
    val value = stack(top)
    top -= 1
    return value
  }

  //遍历栈
  def list(): Unit = {
    if (isEmpty()) {
      println("栈空,没有数据")
      return
    }
    for (i <- 0 to top reverse) {
      printf("stack(%d)=%d\n", i, stack(i))
    }
  }
}
