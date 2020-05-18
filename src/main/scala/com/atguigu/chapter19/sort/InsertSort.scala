package com.atguigu.chapter19.sort

import java.text.SimpleDateFormat
import java.util.Date
//8万数据用时1秒
object InsertSort {
  def main(args: Array[String]): Unit = {

    val arr = new Array[Int](80000)
    val random = new util.Random()
    for (i <- 0 until 80000) {
      arr(i) = random.nextInt(8000000)
    }
    println("排序前")
    val date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    println("排序前时间：" + date)

    insertSort(arr)
    println("排序后")
    val date2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date())
    println("排序后时间" + date2)

    /*  val arr = Array(104, 34, 109, 1)
        var insertVal = arr(1)
        var insertIndex = 1 - 1 //表示有序表的最后这个元素的下标
        //(104, 34, 109, 1) => (34,104),109,1
        while (insertIndex >= 0 && arr(insertIndex) > insertVal) {
          arr(insertIndex + 1) = arr(insertIndex)
          insertIndex -= 1
        }
        arr(insertIndex + 1) = insertVal
        println(arr.mkString(" "))*/
  }

  def insertSort(arr: Array[Int]): Unit = {
    for (i <- 1 until arr.length) {
      var insertVal = arr(i)
      var insertIndex = i - 1 //表示有序表的最后这个元素的下标
      while (insertIndex >= 0 && arr(insertIndex) > insertVal) {
        arr(insertIndex + 1) = arr(insertIndex)
        insertIndex -= 1
      }
      arr(insertIndex + 1) = insertVal
    }
  }
}
