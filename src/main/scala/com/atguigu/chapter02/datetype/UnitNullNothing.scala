package com.atguigu.chapter02.datetype

object UnitNullNothing {
  def main(args: Array[String]): Unit = {
    //println("res=" + res)
    val dog: Dog = null
    //val char1: Char = null


    var a1: Float = 2.123456789.toFloat
    var a2: Int = 10 * 3.6.toInt + 6 * 1.5.toInt
    var a3: Int = (10 * 3.6 + 6 * 1.5).toInt
    var a: Char = 'a'
    var b: Int = 5
    var c: Float = 0.2f
    var res: Double = a + b + c

    println(res)


  }

  //Unit等价于java中的void，只有一个实例()

  //获取HELLO的首尾字符
  //首字符
  /*  println("HELLO"(0)) //索引法
    println("HELLO".take(1))  //take法
    println("HELLO".substring(0,1))   //截取法

    //尾字符
    println("HELLO"(4))
    println("HELLO".takeRight(1))
    println("HELLO".substring("HELLO".length-1))
    println("HELLO".reverse(0)) //反转法
    println("HELLO".reverse.take(1))*/


}

class Dog {

}
