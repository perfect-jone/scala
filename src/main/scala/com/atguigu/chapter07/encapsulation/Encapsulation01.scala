package com.atguigu.chapter07.encapsulation

object Encapsulation01 {
  def main(args: Array[String]): Unit = {
    val person = new Person
    person.setName("jone")
    println(person.getName())
  }
}

class Person {
  private var name = ""

  def setName(name: String): Unit = {
    this.name = name
  }

  def getName(): String ={
    this.name
  }
}
