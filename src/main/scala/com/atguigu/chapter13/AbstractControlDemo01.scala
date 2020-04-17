package com.atguigu.chapter13

object AbstractControlDemo01 {
  def main(args: Array[String]): Unit = {
    //抽象控制：没有输入也没有输出的函数 f1: () => Unit
    //函数里面写代码块

    def myRunInThread(f1: () => Unit) = {
      new Thread {
        override def run(): Unit = {
          f1()
        }
      }.start()
    }

    myRunInThread {
      () =>
        println("干活咯！5秒完成")
        Thread.sleep(5000)
        println("干完咯！")
    }

    def myRunInThread2(f2: => Unit) = {
      new Thread {
        override def run(): Unit = {
          f2
        }
      }.start()
    }

    myRunInThread2 {
      println("干活咯！*** 5秒完成")
      Thread.sleep(5000)
      println("干完咯！***")
    }
  }
}
