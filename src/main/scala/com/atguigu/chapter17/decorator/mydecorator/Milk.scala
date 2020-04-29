package com.atguigu.chapter17.decorator.mydecorator

import com.atguigu.chapter17.decorator.Drink

class Milk(obj: Drink) extends Decorator(obj: Drink) {
  super.setDescription("Milk")
  super.setPrice(1.5f)
}
