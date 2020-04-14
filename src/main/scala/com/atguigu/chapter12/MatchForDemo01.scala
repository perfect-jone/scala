package com.atguigu.chapter12

object MatchForDemo01 {
  def main(args: Array[String]): Unit = {
    val map = Map("A" -> 1, "B" -> 0, "C" -> 2)
    val map2 = Map(("A", 1), ("B", 2), ("C", 3), ("D", 4))
    for ((k, v) <- map) {
      println(k + " -> " + v)
    }

    println("==============================")

    //(k, 0)表示匹配map中值是0的元素
    for ((k, 0) <- map) {
      println(k + " -> " + 0)
    }

    println("******************************")

    //使用if守卫匹配
    for ((k, v) <- map2 if v > 2) {
      println(k + " -> " + v)
    }
  }
}
