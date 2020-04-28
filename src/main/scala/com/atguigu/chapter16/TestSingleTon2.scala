package com.atguigu.chapter16

object TestSingleTon2 {
  def main(args: Array[String]): Unit = {
    val singleTon1 = SingleTon2.getInstance
    val singleTon2 = SingleTon2.getInstance
    println(if (singleTon1 == singleTon2) "相等")
    println(singleTon1.hashCode())
    println(singleTon2.hashCode())
  }
}

//饿汉式
class SingleTon2 private() {}

object SingleTon2 {
  private val s: SingleTon2 = new SingleTon2

  def getInstance(): SingleTon2 = {
    s
  }
}
