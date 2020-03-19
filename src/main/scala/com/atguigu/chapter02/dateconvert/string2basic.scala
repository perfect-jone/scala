package com.atguigu.chapter02.dateconvert

object string2basic {
  def main(args: Array[String]): Unit = {
    val s = "hello"
    val s2 = "10"
    val s3 = 10
    //println(s2.toInt)
    println(s3.toString)

    //"12.5"转成Int，在scala中，不是对小数后的数据进行截取，而是会抛出异常
    val s1 = "12.5"
    println(s1.toDouble)
  }
}
