package com.atguigu.chapter18.upperbounds

object UpperBounds02 {
  def main(args: Array[String]): Unit = {
    biophy(Seq(new Bird,new Bird))
    biophy(Seq(new Animal,new Animal))
    biophy(Seq(new Animal,new Bird))
    //biophy(Seq(new Earth,new Earth))

  }

  def biophy[T <: Animal](things: Seq[T]) = things.map(_.sound())
}

class Earth { //Earth 类
  def sound() { //方法
    println("hello !")
  }
}

class Animal extends Earth {
  override def sound() = { //重写了Earth的方法sound()
    println("animal sound")
  }
}

class Bird extends Animal {
  override def sound() = { //将Animal的方法重写
    println("bird sounds")
  }
}

