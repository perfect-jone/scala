package com.atguigu.chapter10

import scala.collection.mutable

object HashMapDemo01 {
  def main(args: Array[String]): Unit = {
    /**
      * Map是一个散列表（数组+链表），存储内容为kv键值对（key-value）映射
      * Java中的HashMap是无序不重复的,key是唯一的,value可以重复
      * Scala中的Map和Java类似，Scala中不可变的Map是有序的,可变的Map是无序的
      */

    //map对键值对的类型不做限制，支持Any
    //在底层，每对key-value是Tuple2类型，遍历用productIterator()方法，获取key用 ._1方法，获取value用 ._2方法
    val map = Map("lee" -> 30, "pan" -> 20, "jone" -> "西安", 1 -> 4)
    println("map="+map)
    //构建可变Map
    val map2 = mutable.Map("lee" -> 30, "pan" -> 20, "jone" -> "西安", 1 -> 4)
    println("map2"+map2) //无序

    //创建可变对偶元组Map
    val map4 = mutable.Map(("lee", 30), ("pan", 20), ("jone", "西安"), (1, 4))
    println("map4"+map4)

    //创建空的HashMap
    val map3 = mutable.HashMap[Int, String]()
    println("map3"+map3)
  }
}
