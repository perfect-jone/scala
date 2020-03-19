package com.atguigu.chapter04.nestedloop

import scala.io.StdIn

object Exercise01 {
  def main(args: Array[String]): Unit = {
    var count = 0
    for (i <- 1 to 3) {
      println("请输入用户名")
      var username = StdIn.readLine()
      println("请输入密码")
      var password = StdIn.readLine()
      count += 1
      if (username == "张无忌" && password == "888") {
        println("登录成功")
      } else {
        println("你还有" + (3 - count) + "次机会")
      }
    }
  }
}
