package com.atguigu.chapter16

object TestSingleTon {
  def main(args: Array[String]): Unit = {
    val singleTon1 = SingleTon.getInstance
    val singleTon2 = SingleTon.getInstance
    println(if (singleTon1 == singleTon2) "相等")
    println(singleTon1.hashCode())
    println(singleTon2.hashCode())
  }
}


//懒汉式
class SingleTon private() {}

object SingleTon {
  private var s: SingleTon = null

  def getInstance(): SingleTon = {
    if (s == null) {
      s = new SingleTon
    }
    s
  }
}