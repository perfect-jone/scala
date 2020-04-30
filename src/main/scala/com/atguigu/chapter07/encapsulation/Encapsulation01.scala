package com.atguigu.chapter07.encapsulation

object Encapsulation01 {
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.setName("jone")
    println(person.getName())
  }
}

//封装：属性私有化，提供公共的setter和getter方法
//注意：属性被private修饰的时候，不能使用@BeanProperty注解
class Person {
  private var name = ""
  def setName(name: String): Unit = {
    this.name = name
  }

  def getName(): String ={
    this.name
  }
}
