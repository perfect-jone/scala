package com.atguigu.chapter13

object ClosureDemo02 {
  def main(args: Array[String]): Unit = {
    /**
      * 需求：
      * dog.jpg => dog.jpg
      * cat     => cat.jpg
      */

    //闭包的好处：传入一次引用环境suffix即可多次使用
    val f = makeSuffix(".jpg")
    println(f("dog.jpg"))
    println(f("cat"))
  }

  def makeSuffix(suffix: String) = {
    (filename: String) => {
      if (filename.endsWith(suffix)) {
        filename
      } else {
        filename + suffix
      }
    }
  }
}
