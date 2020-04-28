package com.atguigu.chapter14

import java.text.SimpleDateFormat
import java.util.Date

object Recursion01 {
  def main(args: Array[String]): Unit = {
    //计算1-50的和，使用常规while完成
    val now = new Date()
    val format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
    val date = format.format(now)
    println("执行前时间date="+date)
    var sum =BigInt(0)
    var num =BigInt(1)
    var maxVal = BigInt(99999999l)

    while (num <= maxVal) {
      sum += num
      num += 1
    }
    println("sum=" + sum)

    val now2 = new Date()
    val date2 = format.format(now2)
    println("执行后时间date2="+date2)

    val curTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    println("curTime="+curTime)
  }
}
