package com.atguigu.chapter17.decorator.mydecorator

import com.atguigu.chapter17.decorator.Drink

class Soy(obj: Drink) extends Decorator(obj: Drink) {
  super.setDescription("Soy")
  super.setPrice(1.5f)
}
