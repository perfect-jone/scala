package com.atguigu.chapter08

object ApplyDemo01 {
  def main(args: Array[String]): Unit = {
    val pig = Pig("小花")
    val pig02 = Pig()
    println(pig.name)
    println(pig02.name)
  }
}

class Pig(pName: String) {
  var name = pName
}

object Pig {
  def apply(pName: String): Pig = new Pig(pName)

  def apply(): Pig = new Pig("小黑")
}