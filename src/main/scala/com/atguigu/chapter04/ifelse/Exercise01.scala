package com.atguigu.chapter04.ifelse

import scala.io.StdIn


object Exercise01 {
  def main(args: Array[String]): Unit = {
    println("请输入年份")
    var year = StdIn.readInt()
    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
      println(year+"是闰年")
    }else{
      println(year+"不是闰年")
    }
  }
}
