package com.atguigu.chapter13

object PartialFunctionDemo02 {
  def main(args: Array[String]): Unit = {
    //需求：List(1,2,3,4,"abc") + 1 ->  List(2,3,4,5)
    //将包在大括号内的一组case语句封装为函数，称为偏函数，是个trait,使用PartialFunction的匿名子类构建
    val list = List(1, 2, 3, 4, "abc", "hello")

    // 1.PartialFunction[Any, Int]表示偏函数接收类型Any，返回类型是Int
    // 2.isDefinedAt(x: Any) 如果返回true，则调用apply(v1: Any)，返回false就过滤不要
    // 3.apply构造器,对传入的值 + 1 并返回新的集合
    val partialFun = new PartialFunction[Any, Int] {

      override def isDefinedAt(x: Any) = x.isInstanceOf[Int] //起过滤作用,集合中有多少个参数，就调用多少次
      override def apply(v1: Any) = v1.asInstanceOf[Int] + 1 //留下来的部分调用该方法，留下来多少个就调用多少次
    }

    //使用偏函数的时候不能使用map，应该使用collect，collect综合了map和filter的功能
    println(list.collect(partialFun))
  }
}
