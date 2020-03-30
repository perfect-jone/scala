package com.atguigu.chapter07.overriding

object Override01 {
  def main(args: Array[String]): Unit = {
    val door = new Door
    println(door.s)//door.s()
    door.printInfo()
    //多态遵循动态绑定机制:
    //1.如果调用的是方法，则jvm会将该方法和对象的内存地址绑定
    //2.如果调用的是一个属性，则没有动态绑定机制，在哪里调用，就返回对应值
    val door2: Wood = new Door
    println(door2.s)//door2.s()
    door2.printInfo()
  }
}

class Wood {

  val s: String = "Hi"

  def printInfo(): Unit = {
    println("Hi,I'm wood!")
  }
}

class Door extends Wood {
  //只有被val修饰的属性才能被重写，本质是s()方法被重写
  override val s: String = "Hello"

  override def printInfo(): Unit = {
    println("Hi,I'm door!")
  }
}