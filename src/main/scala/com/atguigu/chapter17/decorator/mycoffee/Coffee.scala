package com.atguigu.chapter17.decorator.mycoffee

import com.atguigu.chapter17.decorator.Drink

//在Drink和单品咖啡(Decaf/Espresso/LongBlack/ShortBlack)中间做了缓冲层，
//如果Drink饮品以后下面不仅有Coffee咖啡类，还有茶、奶茶、果汁类就可以很好的扩展
class Coffee extends Drink {
  override def cost(): Float = {
    super.getPrice()
  }
}
