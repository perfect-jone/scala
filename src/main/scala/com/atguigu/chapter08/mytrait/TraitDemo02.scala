package com.atguigu.chapter08.mytrait

object TraitDemo02 {
  def main(args: Array[String]): Unit = {
    val sheep = new Sheep
    sheep.work()
    sheep.play()
  }
}

trait Trait02 {

  //抽象方法
  def work()

  //具体方法
    def play(): Unit ={
      println("I like play games!")
    }
}

class Sheep extends Trait02 {
  override def work(): Unit = {
    println("Sheep make milk!")
  }
}
