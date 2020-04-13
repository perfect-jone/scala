package com.atguigu.chapter12

object MatchVarDemo01 {
  def main(args: Array[String]): Unit = {

    //模式中的变量
    val ch  = '+'
    ch match {
      case '+' => println("ok")
      case mychar => println("ok～" + mychar)
      case _ => println("ok～～")
    }

    //match是一个表达式，因此可以有返回值
    //返回值就是匹配到的代码块的最后一句话值
    val ch1  = '+'
    val res = ch1 match {
      case '+' =>{
        ch1 + " hello"
        println("world")
      }
      case _ => println("ok")
    }
    println(res)

    val n = println("nihao")
    println(n)
  }
}
