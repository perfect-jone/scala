package com.atguigu.chapter12

object MatchDemo01 {
  def main(args: Array[String]): Unit = {
    val oper = '#'
    val n1 = 20
    val n2 = 10
    var res = 0

    //1.match（类似于java switch） 和 case是关键字
    //2.表示如果匹配成功，则执行 => 后面的代码块
    //3.如果一个都没有匹配到，则执行 case _ 后面的代码块
    oper match {
      case '+' => res = n1 + n2
      case '-' => res = n1 - n2
      case '*' => res = n1 * n2
      case '/' => res = n1 / n2
      case _ => println("oper error")
    }
    println(res)
  }
}
