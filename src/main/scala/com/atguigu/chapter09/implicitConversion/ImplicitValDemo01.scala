package com.atguigu.chapter09.implicitConversion

object ImplicitValDemo01 {
  def main(args: Array[String]): Unit = {
    implicit val str1: String = "jone"//隐式值
    //implicit val str2: String = "Gosling"//隐式值
    //implicit val age: Int = 10

    //底层就是hell$1(str1)
/*    def hello(implicit name: String): Unit = { //name是隐式参数
      println(name)
    }
    hello*/

    println("==============================")

    //当同时有隐式值和默认值时，隐式值优先级高
    //当有两个隐式值时会报错
    def hello1(implicit name: String = "Ordersky"): Unit = { //name是隐式参数
      println(name)
    }
    hello1

  }
}
