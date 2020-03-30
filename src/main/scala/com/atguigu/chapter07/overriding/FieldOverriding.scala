package com.atguigu.chapter07.overriding

object FieldOverriding {
  def main(args: Array[String]): Unit = {
    println("ok")
  }
}

//1.抽象属性：没有初始化的属性
//2.当一个类含有抽象属性时，则该类需要被标记为abstract
//3.对于抽象的属性，在底层不会生成对应的属性声明，而是生成两个对应的抽象方法public abstract String name()和public abstract String name_$eq()
abstract class Human {
  var name: String
}

class Women extends Human {
  //在子类中重写父类的属性，本质是实现了抽象方法，override也可以不写
 override var name: String = _
}
