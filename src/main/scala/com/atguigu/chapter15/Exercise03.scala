package com.atguigu.chapter15

object Exercise03 {
  def main(args: Array[String]): Unit = {

    val lists = List(Some(1),Some(3),None,Some(10),None)
    def mySum(list: List[Option[Int]]) = list.map(_.getOrElse(0)).sum
    println(mySum(lists))
  }
}
