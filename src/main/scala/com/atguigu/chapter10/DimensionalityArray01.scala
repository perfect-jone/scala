package com.atguigu.chapter10

object DimensionalityArray01 {
  def main(args: Array[String]): Unit = {

    //3表示3个一维数组，4表示每个一维数组中有4个元素
    val arrs = Array.ofDim[Double](3,4)
    arrs(0)(0) = 1.1
    arrs(0)(1) = 1.2
    arrs(0)(2) = 1.3
    arrs(0)(3) = 1.4


    arrs(1)(0) = 2.1
    arrs(1)(1) = 2.2
    arrs(1)(2) = 2.3
    arrs(1)(3) = 2.4

    arrs(2)(0) = 3.1
    arrs(2)(1) = 3.2
    arrs(2)(2) = 3.3
    arrs(2)(3) = 3.4

    for (items <- arrs) {
      for (item <- items) {
        print(item+"\t")
      }
      println()
    }
  }
}
