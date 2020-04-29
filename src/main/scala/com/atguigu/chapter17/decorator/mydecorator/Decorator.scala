package com.atguigu.chapter17.decorator.mydecorator

import com.atguigu.chapter17.decorator.Drink

//主构造器obj就是被装饰的对象
class Decorator(obj: Drink) extends Drink {

  override def cost(): Float = {
    //这里使用了递归
    super.getPrice() + obj.cost()
  }

  override def getDescription(): String = {
    //这里使用了递归
    super.getDescription() + " && " + obj.getDescription()
  }
}
