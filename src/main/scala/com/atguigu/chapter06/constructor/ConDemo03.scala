package com.atguigu.chapter06.constructor

object ConDemo03 {
  def main(args: Array[String]): Unit = {
    val cat = new Cat()
    cat.showInfo()
  }
}

//定义一个Cat类,默认Cat()主构造器
class Cat() {
  var name: String = ""
  var age: Int = 3

  //辅助构造器1
  def this(name: String) {
    this //调用主构造器，必须放在第一行
    this.name = name
  }

  //辅助构造器2
  def this(name: String, age: Int) {
    this
    this.name = name
    this.age = age
  }

  //辅助构造器3
  def this(age: Int) {
    this("匿名") //调用主构造器，因为辅助构造器1调用了主构造器
    this.age = age
  }

  def showInfo(): Unit = {
    println("cat信息如下：")
    println("name=" + this.name)
    println("age=" + this.age)
  }
}
