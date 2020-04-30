package com.atguigu.chapter07.typeConvert

object Exercise02 {
  def main(args: Array[String]): Unit = {
    val s: String = "jone"
    val map = Map(1 -> 1, 2 -> 2, 3 -> 3)
    val list = List(1,2,3)

    println(classOf[String])
    println(classOf[List[Int]])
    println(classOf[Map[Int,Int]])
    println(map.getClass.getName)
    println(list.getClass.getName)
    println(s.isInstanceOf[String])
    println(s.asInstanceOf[String])
  }
}

