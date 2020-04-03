package com.atguigu.chapter06.constructor

object ConDemo04 {
  def main(args: Array[String]): Unit = {
    val w = new Worker("jone")
    w.name
    val w2 = new Worker2("jone2")
    w2.name
    w2.inName
    val w3 = new Worker3("jone3")
    w3.name
    w3.inName
    println("ok")
  }
}

//属性的高级部分
//主构造器的参数没有被修饰，那么inName就是局部变量
class Worker(inName: String) {
  var name = inName
}

//主构造器的参数被val修饰，那么inName就是只读属性
class Worker2(val inName: String) {
  var name = inName
}

//主构造器的参数被val修饰，那么inName就是可读写属性
class Worker3(var inName: String) {
  var name = inName
}