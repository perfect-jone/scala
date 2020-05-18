package com.atguigu.chapter19.sort

import java.text.SimpleDateFormat
import java.util.Date
//8万数据用时3秒
object SelectSort {
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](80000)
    val random = new util.Random()
    for (i <- 0 until 80000) {
      arr(i) = random.nextInt(8000000)
    }

    println("排序前")
    val date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    println("排序前时间为：" + date)

    selectSort(arr)

    println("排序后")
    val date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    println("排序后时间为：" + date2)

  }

  def selectSort(arr: Array[Int]): Unit = {

    for (i <- 0 until arr.length - 1) {
      var min = arr(i) //假定第一个数是最小值
      var minIndex = i //假定最小值的下标是0
      for (j <- (i + 1) until arr.length) {
        if (arr(j) < min) { //后面的数比假定的最小值还小
          min = arr(j) //把该更小的数赋给min
          minIndex = j //把该更小的数的下标赋给min
        }
      }
      if (minIndex != i) {
        arr(minIndex) = arr(i) //把第一个数赋给更小的数
        arr(i) = min //把更小的数赋给第一个数
      }
    }

    //第一轮比较：(101,34,119,1) => (1,34,119,101)
    /*    var min = arr(0) //假定第一个数是最小值
        var minIndex = 0 //假定最小值的下标是0
        for (i <- 1 until arr.length) {
          if (arr(i) < min) { //后面的数比假定的最小值还小
            min = arr(i) //把该更小的数赋给min
            minIndex = i //把该更小的数的下标赋给min
          }
        }
        if (minIndex != 0) {
          arr(minIndex) = arr(0) //把第一个数赋给更小的数
          arr(0) = min //把更小的数赋给第一个数
        }*/
  }
}
