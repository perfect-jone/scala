package com.atguigu.chapter11.map

object MapOperateDemo02 {
  def main(args: Array[String]): Unit = {
    /**
      * 将val names = List("Alice","Bob","Nick","Jone")所有单词转成大写
      */

    val names = List("Alice","Bob","Nick","Jone")
    val newNames =  names.map(lower2Upper)
    println(newNames)
  }

  def lower2Upper(s:String) :String ={
    s.toUpperCase()
  }
}
