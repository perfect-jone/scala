package com.atguigu.chapter07.typeConvert

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val s = "jone"
    println(classOf[String])
    println(s.getClass.getName)
    println(s.isInstanceOf[String])
    println(s.asInstanceOf[String])
  }
}

