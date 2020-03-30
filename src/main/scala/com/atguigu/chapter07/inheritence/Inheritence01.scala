package com.atguigu.chapter07.inheritence

object Inheritence01 {
  def main(args: Array[String]): Unit = {
    val student = new Student
    student.sayOk()
  }
}

class Person {
  //name属性在底层对应的是private String name = ""和public name()、 publice name_$eq(){}方法
  var name: String = ""

  //age属性在底层对应的是private String age = ""和public age()、 publice age_$eq(){}方法
  protected var age: Short = 0

  //name属性在底层对应的是private String sex = ""和private sex(){}、 private sex_$eq(){}方法
  private var sex: Char = '\u0000'

  //public
  def eatting01(): Unit = {
    println("eatting01")
  }

  //public,和属性一样，只有所有子类才能访问
  protected def eatting02(): Unit = {
    println("eatting02")
  }

  //private，和属性一样，只有当前类和伴生对象可以访问
  private def eatting03(): Unit = {
    println("eatting03")
  }
}

//子类继承了父类的所有属性，只是私有的属性不能直接访问，需要设置公共的set/get方法才能访问
class Student extends Person {
  def sayOk(): Unit = {
    this.name = "jone"
    this.age = 18
  }
}