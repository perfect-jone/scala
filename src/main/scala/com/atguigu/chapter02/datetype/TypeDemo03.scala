package com.atguigu.chapter02.datetype

object TypeDemo03 {
  def main(args: Array[String]): Unit = {
    //println("Int范围是：" + Int.MaxValue + "～～" + Int.MinValue)
    var i = 99999999
    var j: Float = 1.1F
    var k: Float = 1.123456789F//小数点后7位
    var l: Double = 2.123456789123456789//小数点后15位
    //println(k+":"+l)

    var a1: Char = 107
    //println(a1+10+'b')
    println(Long.MinValue+"～"+Long.MinValue)
  }
}
