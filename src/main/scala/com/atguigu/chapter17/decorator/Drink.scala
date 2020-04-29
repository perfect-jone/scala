package com.atguigu.chapter17.decorator

//Drink表示饮品，是一个抽象类
abstract class Drink {
  var description: String = ""
  var price: Float = 0.0f

  def setPrice(price: Float): Unit = {
    this.price = price
  }

  def getPrice(): Float = {
    this.price
  }

  def setDescription(description: String): Unit = {
    this.description = description
  }

  def getDescription(): String = {
    this.description + " 价格是：" + this.price + "元"
  }

  //将计算成本的方法设计成抽象方法
  def cost(): Float
}
