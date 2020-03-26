package com.atguigu.chapter06.constructor

import scala.beans.BeanProperty

object BeanProperty {
  def main(args: Array[String]): Unit = {
    val car = new Car
    car.name = "宝马"
    println(car.name)

    car.setName("奔驰")
    println(car.getName)
  }
}

class Car{
  //使用@BeanProperty注解可以快速生成属性的car.setName()和car.getName()方法，
  // 和scala底层生成属性的car.name_$eq()和car.name()不冲突，可以共存
  @BeanProperty
  var name: String = ""
}