package com.atguigu.chapter05.fundetails

object Details {
  def main(args: Array[String]): Unit = {
    val tiger = new Tiger

    val tiger2 = test01(10,tiger)
    println(tiger2.name)
    println(tiger.name)
    println(tiger.hashCode()+ "\t"+tiger2.hashCode())
  }
  //2.形参列表和返回值列表的数据类型可以是任意类型，值类型和引用类型
  def test01(n1: Int, tiger: Tiger): Tiger = {
    println("n1=" + n1)
    tiger.name = "jack"
    return tiger
  }
}

class Tiger {
  var name = ""
}
