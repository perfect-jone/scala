package com.atguigu.chapter08.Exercise

object SingleTon {
  def main(args: Array[String]): Unit = {
    val dog = Dog
    val dog2 = Dog
    println(dog == dog2)
  }
}

//构造方法私有化，不让外界创建对象
class Dog private() {

}

//伴生对象和apply方法
object Dog {
  var sinleDog: Dog = null
  def apply(): Dog = {
    if (sinleDog == null) {
      sinleDog = new Dog()
    }
    sinleDog
  }
}
