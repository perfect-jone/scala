package com.atguigu.chapter17.decorator.mydecorator

import com.atguigu.chapter17.decorator.Drink

class Chocolate(obj: Drink) extends Decorator(obj: Drink) {
  super.setDescription("Chocolate")
  super.setPrice(3.0f)
}
