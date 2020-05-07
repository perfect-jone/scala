package com.atguigu.chapter18.upperbounds

import java.lang
import Predef._

object UpperBounds01 {
  def main(args: Array[String]): Unit = {
    val compareComm1 = new CompareComm(Integer.valueOf(10),Integer.valueOf(20))
    val compareComm11 = new CompareComm[Integer](100,200)
    val compareComm2 = new CompareComm(java.lang.Float.valueOf(10.1f),java.lang.Float.valueOf(20.1f))
    //java的Float继承了Comparable接口，实现了compareTo方法，scala的Float并没有继承Comparable接口
    //implicit def float2Float(x: Float)  = java.lang.Float.valueOf(x) 把scala的Float转换成java的Float
    val compareComm22 = new CompareComm[java.lang.Float](100.1f,200.1f)
    println(compareComm1.greater)
    println(compareComm11.greater)
    println(compareComm2.greater)
    println(compareComm22.greater)

  }
}

//[T <: Comparable[T]]表示Comparable是T的上界
class CompareComm[T <: Comparable[T]](obj1: T, obj2: T) {
  def greater = if (obj1.compareTo(obj2) > 0 ) obj1 else obj2
}
