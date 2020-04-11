package com.atguigu.chapter11

object Exercise02 {
  def main(args: Array[String]): Unit = {
    //使用映射集合，统计一句话中，各个字母出现的次数，并保留在Map中 Map[Char,Int]()
    val sentence = "AAAAAAAAAABBBBBBBBBCCCCCCCCDDDDDDD"

    def charCount(map: Map[Char, Int], char: Char): Map[Char, Int] = {
      //(map.getOrElse(char, 0) + 1) 表示map集合中有char就加1，没有就是0
      map + (char -> (map.getOrElse(char, 0) + 1))
    }

    //Map[Char, Int]() 匿名函数的使用
    val map2 = sentence.foldLeft(Map[Char, Int]())(charCount)
    println(map2)
  }
}
