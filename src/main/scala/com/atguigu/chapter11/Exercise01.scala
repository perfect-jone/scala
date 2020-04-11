package com.atguigu.chapter11

import scala.collection.mutable.ArrayBuffer

object Exercise01 {
  def main(args: Array[String]): Unit = {
    //将sentence中的各个字符，通过foldLeft存放到一个ArrayBuffer中
    val sentence = "AAAAAAAAAABBBBBBBBBCCCCCCCCDDDDDDD"

    def putArr(arr: ArrayBuffer[Char],c: Char):ArrayBuffer[Char] = {
      arr += c
      //arr.append(c)
      arr
    }

    val arr = ArrayBuffer[Char]()
    sentence.foldLeft(arr)(putArr)
    println(arr)
  }
}
