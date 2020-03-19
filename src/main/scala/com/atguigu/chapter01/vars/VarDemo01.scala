package com.atguigu.chapter01.vars

/**
  * 声明变量的基本语法：
  * var | val 变量名[：变量类型] = 值
  */
object VarDemo01 {
  def main(args: Array[String]): Unit = {
    //编译器，动态的（逃逸分析）
    var age: Int = 10
    var sal: Double = 10.9
    var isPass: Boolean = true
    //在scala中，小数默认为Double类型,整数默认为Int类型
    var score: Float = 10.8f
    println(s"${age}\t${isPass}")
  }
}
