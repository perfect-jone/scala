package com.atguigu.chapter14

import java.text.SimpleDateFormat
import java.util.Date

object Recursion02 {
  def main(args: Array[String]): Unit = {

    val now = new Date()
    val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = format.format(now)
    println("执行前时间date=" + date)

    var sum = BigInt(0)
    var num = BigInt(1)
    var res = mx(num,sum)
    println(res)

    val now2 = new Date()
    val date2 = format.format(now2)
    println("执行后时间date2=" + date2)
  }
  def mx(num: BigInt, sum: BigInt): BigInt = {
    if (num <= 99999999l) mx(num + 1, sum + num) else sum
  }
}
