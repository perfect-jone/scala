package com.atguigu.chapter06.constructor

/**
  * scala构造方法注意事项和细节：
  * 1.scala构造器的作用是完成对新对象的初始化，构造器没有返回值
  * 2.主构造器的声明直接放置于类名之后
  * 3.主构造器会执行类定义中的所有语句
  * 4.如果主构造器无参数，小括号可以省略，构建对象时调用的构造方法的小括号也可以省略
  * 5.辅助构造器名称名称为this，多个辅助构造器通过不同参数列表进行区分，底层就是构造器重载
  * 6.辅助构造器必须在第一行显式调用主构造器，可以直接也可以是间接
  *
  */
object ConDemo01 {

  def main(args: Array[String]): Unit = {
    val p1 = new Person("jone", 18)
    val p2 = new Person("tom")
    println(p1)
    println(p2)
  }
}

//创建Person对象的同时初始化对象的age属性和name属性
class Person(inName: String, inAge: Int) {
  var name = inName
  var age = inAge

  //重写toString方法，便于输出对象的信息
  override def toString: String = {
    "name=" + this.name + "\tage=" + this.age
  }

  def this(name: String) {
    //辅助构造器必须在第一行显式调用主构造器
    this("jack",10)
    this.name = name//重新赋值
  }
}

