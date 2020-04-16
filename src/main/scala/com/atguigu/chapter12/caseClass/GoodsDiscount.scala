package com.atguigu.chapter12.caseClass

object GoodsDiscount {
  def main(args: Array[String]): Unit = {
    val sale = Bundle("艺术作品", 10, Book("齐白石的虾", 40), Bundle("文学作品", 20, Book("《活着》", 80), Book("《围城》", 30)))

    //使用case语句得到 "齐白石的虾"
    val res = sale match {
      //  _,_,Book(desc,_),_*  表示 匹配Bundle(description: String, price: Double, item: Item*)
      // _ 均表示忽略 _* 表示所有
      case Bundle(_, _, Book(description, _), _*) => description
    }

    val res2 = sale match {
      // art@Book(_, _) @ 表示将嵌套的值绑定到变量art，art表示Book对象的名字，
      case Bundle(_, _, art2@Book(_, _), rest2@_*) => (art2, rest2)
    }
    println(res2)

    val res3 = sale match {
      // 不用_*绑定剩余Item到Bundle,去掉了最外层的WrappedArray
      case Bundle(_, _, art3@Book(_, _), rest3@_) => (art3, rest3)
    }
    println(res3)
    println(price(sale))
  }

  def price(item: Item): Double = {
    item match {
      case Book(_, price) => price
      // items.map(price _).sum 表示 将items集合遍历，然后逐个调用price方法，之后将所有拿到的price进行sum操作
      case Bundle(_, discount, items@_*) => items.map(price _).sum - discount
    }
  }
}

abstract class Item

case class Book(description: String, price: Double) extends Item

// Item是Book和Bundle的父类，因为item: Item*中的item可以为Book或Bundle的一个或多个对象
case class Bundle(description: String, price: Double, item: Item*) extends Item

