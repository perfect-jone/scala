package com.atguigu.chapter06

object PropertyDemo {
  def main(args: Array[String]): Unit = {
    //创建对象的基本语法
    //val | var 对象名[: 类型] = new 类型()
    val p1 = new Painter
    println(p1.sal)
    println(p1.address )
  }
}

class Painter{
  var name: String = "jone"//给属性赋初始值，省略类型，会自动推导
  var age = 18
  var address: String = null//ok
  var sal = null//是Null类型
}