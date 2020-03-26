package com.atguigu.chapter06

object Scientist {
  def main(args: Array[String]): Unit = {
    val scientist = new Scientist01("爱因斯坦", 88)
  }
}

/**
  * 对象创建的流程分析：
  * 1.加载类的信息：属性信息和方法信息
  * 2.在内存中（堆）开辟空间，开辟多大的空间取决于属性有多大
  * 3.先使用用父类的主构造器，再使用父类的辅助构造器对属性进行初始化
  * 4.使用主构造器对属性进行初始化[name:String,age:90]
  * 5.使用辅助构造器对属性再次初始化[name:爱因斯坦,age:88]
  * 6.将开辟的对象的内存地址赋给scientist这个引用
  */
class Scientist01 {
  var age: Short = 90 //特别注意：年龄最大一百多岁，因此使用Short类型比用Int类型可以省2个字节
  var name: String = ""

  def this(n: String, a: Short) {
    this
    this.name = n
    this.age = a
  }
}