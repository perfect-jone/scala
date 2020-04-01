package com.atguigu.chapter08.Exercise

object SingleTon {
  def main(args: Array[String]): Unit = {
    val dog = Dog
    val dog2 = Dog
    println(dog == dog2)
  }
}

class Dog private() {

}

object Dog {
  var sinleDog: Dog = null
  def apply(): Dog = {
    if (sinleDog == null) {
      sinleDog = new Dog()
    }
    sinleDog
  }
}
