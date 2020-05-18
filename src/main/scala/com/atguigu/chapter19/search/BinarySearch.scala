package com.atguigu.chapter19.search

import scala.collection.mutable.ArrayBuffer
import scala.util.control.Breaks._

object BinarySearch {
  def main(args: Array[String]): Unit = {
    val arr = Array(1, 2, 3, 3, 3, 3, 3, 5, 9)
    /*    val index = binarySearch(arr, 0, arr.length - 1, 3)
        if (index != -1) {
          println("查找值的下标为：" + index)
        }
        else {
          println("该数组没有查找值")
        }*/
    var arrRes = binarySearch2(arr, 0, arr.length - 1, 3)
    arrRes = arrRes.sortBy((x: Int) => x)
    if (arrRes.length != 0) {
      for (index <- arrRes) {
        println("查找值的下标为：" + index)
      }
    }
    else {
      println("该数组没有查找值")
    }
  }

  /**
    * 二分查找思路：
    * 1.找到中间值
    * 2.将中间值和查找值比较，值存在返回对应下标，不存在返回-1
    * 【1,2,3】
    * 2.1  查找值 < 中间值  说明要找的值在中间值的左边，应该向左递归
    * 2.2  查找值 > 中间值  说明要找的值在中间值的左边，应该向右递归
    * 2.3  查找值 = 中间值  说明找到了
    */

  /**
    *
    * @param arr
    * @param left    数组左边下标，从0开始
    * @param right   数组右边小标，从arr.length - 1开始
    * @param findVal 要查找的值
    * @return 值存在返回对应下标，不存在返回-1
    */
  def binarySearch(arr: Array[Int], left: Int, right: Int, findVal: Int): Int = {
    var midIndex = (left + right) / 2 //中间值下标
    var midVal = arr(midIndex) //中间值
    //如果数组中没有找到查找值
    if (left > right) {
      return -1
    }
    //如果数组中可以找到查找值
    if (findVal < midVal) {
      binarySearch(arr, left, midIndex - 1, findVal)
    }
    else if (findVal > midVal) {
      binarySearch(arr, midIndex + 1, right, findVal)
    }
    else {
      return midIndex
    }
  }

  //binarySearch2函数是binarySearch的补充，可以打印出所有重复值的下标
  def binarySearch2(arr: Array[Int], left: Int, right: Int, findVal: Int): ArrayBuffer[Int] = {
    var midIndex = (left + right) / 2 //中间值下标
    var midVal = arr(midIndex) //中间值
    //如果数组中没有找到查找值
    if (left > right) {
      return ArrayBuffer()
    }
    //如果数组中可以找到查找值
    if (findVal < midVal) {
      binarySearch2(arr, left, midIndex - 1, findVal)
    }
    else if (findVal > midVal) {
      binarySearch2(arr, midIndex + 1, right, findVal)
    }
    else {
      //定义一个可变数组用来存放所有与查找值相等的下标
      val arrayBuffer = new ArrayBuffer[Int]()


      //midIndex查找值作为基准向左扫描
      var temp = midIndex - 1
      breakable {
        while (true) {
          if (temp < 0 || arr(temp) != findVal) {
            break() //说明找过了后并没有重复的值
          }
          if (arr(temp) == findVal) {
            arrayBuffer.append(temp)
          }
          temp -= 1 //temp继续向左移
        }
      }

      //将基准值下标加入到可变数组中
      arrayBuffer.append(midIndex)

      //midIndex查找值作为基准向右扫描
      temp = midIndex + 1
      breakable {
        while (true) {
          if (temp > arr.length - 1 || arr(temp) != findVal) {
            break() //说明找过了后并没有重复的值
          }
          if (arr(temp) == findVal) {
            arrayBuffer.append(temp)
          }
          temp += 1 //temp继续向右移
        }
      }
      return arrayBuffer
    }
  }
}
