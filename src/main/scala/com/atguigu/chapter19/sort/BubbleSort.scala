package com.atguigu.chapter19.sort

import java.text.SimpleDateFormat
import java.util.Date
//8万数据用时10秒

object BubbleSort {
  def main(args: Array[String]): Unit = {

    val random = new util.Random()
    val arr = new Array[Int](80000)
    for (i <- 0 until 80000) {
      arr(i) = random.nextInt(8000000)
    }
    println("排序前")
    val date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    println("排序前时间为："+ date)

    bubbleSort(arr)

    println("排序后")
    //println(arr.mkString(" "))
    val date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    println("排序后时间为："+ date2)
  }
  def bubbleSort(arr: Array[Int]):Unit = {
    for (i <- 0 until arr.length) {
      for (j <- 0 until arr.length - i - 1) {
        if (arr(j) > arr(j + 1)) {
          var tmp = arr(j)
          arr(j) = arr(j + 1)
          arr(j + 1) = tmp
        }
      }
    }
  }
}
