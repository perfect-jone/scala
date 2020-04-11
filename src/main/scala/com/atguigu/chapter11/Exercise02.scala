package com.atguigu.chapter11

import scala.collection.mutable

object Exercise02 {
  def main(args: Array[String]): Unit = {
    //使用映射集合，统计一句话中，各个字母出现的次数，并保留在Map中 Map[Char,Int]()
    val sentence = "AAAAAAAAAABBBBBBBBBCCCCCCCCDDDDDDD"

    //使用不可变map,有序
    def charCount(map: Map[Char, Int], char: Char): Map[Char, Int] = {
      //(map.getOrElse(char, 0) + 1) 表示map集合中有char就加1，没有就是0
      map + (char -> (map.getOrElse(char, 0) + 1))
    }

    //使用可变map，无序，效率更高
    def charCount2(map: mutable.Map[Char, Int], char: Char): mutable.Map[Char, Int] = {
      //(map.getOrElse(char, 0) + 1) 表示map集合中有char就加1，没有就是0
      map += (char -> (map.getOrElse(char, 0) + 1))
    }

    //Map[Char, Int]() 匿名函数的使用
    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)

    val map3 = sentence.foldLeft(mutable.Map[Char, Int]())(charCount2)
    println(map2)
    println(map3)
  }
}
