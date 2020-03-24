package com.atguigu.chapter06

object PropertyDemo {
  def main(args: Array[String]): Unit = {
    val p1 = new Person
    println(p1.sal)
    println(p1.address )
  }
}

class Person{
  var name: String = "jone"//给属性赋初始值，省略类型，会自动推导
  var age = 18
  var address: String = null//ok
  var sal = null//是Null类型
}