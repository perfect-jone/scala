package com.atguigu.chapter06.oop

object CreateObj {
  def main(args: Array[String]): Unit = {
    val emp = new Emp //对象emp的类型是Emp
    val emp2: Person = new Emp  //多态：子类给父类
  }
}

class Person {

}

class Emp extends Person{

}
