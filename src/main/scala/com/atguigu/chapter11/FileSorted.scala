package com.atguigu.chapter11

import scala.collection.SortedMap
import scala.io.Source


object FileSorted {
  def main(args: Array[String]): Unit = {

    val source = Source.fromFile("E:\\1.txt")
    val tokens = source.mkString.split("\\s+") //一个或多个空格
    var map = SortedMap[String, Int]() //根据键 字典排序
    for (key <- tokens) {
      map += (key -> (map.getOrElse(key, 0) + 1))
    }

    //for ((k, v) <- map) println(k + " -> " + v)
    //println(map.map(f => (f._1,f._2)).toList.sortBy(_._2).reverse)
    println(map)
  }
}
