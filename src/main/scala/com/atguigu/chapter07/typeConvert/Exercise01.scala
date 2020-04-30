package com.atguigu.chapter07.typeConvert

import java.util

//当一个伴生对象继承了App后，可以不用写主函数
object Exercise01 extends App {

  import java.util.{HashMap => JavaHashMap}
  import scala.collection.mutable.{HashMap => ScalaHashMap, _}

  val javaHashMap = new JavaHashMap[Int, String]() //[Int,String]是scala中的泛型
  javaHashMap.put(1, "one")
  javaHashMap.put(2, "two")
  javaHashMap.put(3, "three")
  javaHashMap.put(4, "four")

  val scalaHashMap = new ScalaHashMap[Int, String]()
  //javaHashMap.keySet().toArray()将javaHashMap的key转成数组
  //key.asInstanceOf[Int]将数组类型的Key转成Int类型
  //key.asInstanceOf[Int]-> javaHashMap.get(key) 是key -> value
  // += 将 key -> value加入到scalaHashMap集合中

  for (key <- javaHashMap.keySet().toArray()) {
    scalaHashMap += key.asInstanceOf[Int] -> javaHashMap.get(key)
    //scalaHashMap += ((key.asInstanceOf[Int],javaHashMap.get(key)))
  }
  println(scalaHashMap)
}
