package com.atguigu.chapter05.mylazy

object LazyDemo01 {

  //使用惰性函数注意事项：
  // 1.lazy不能修饰var类型的变量，它是线程安全的
  // 2.不仅在调用函数时可以加lazy,也可以在声明变量时加lazy，表示变量值的分配也会推迟

  //重要提示:如果spark有特别大数据量的计算时，采用lazy可以大大提升性能


  def main(args: Array[String]): Unit = {
    lazy val num = 10
    lazy val  res = sum(10,20)
    println("-------------------")
    println("res="+res)//要在使用res前才执行
  }

  def sum(n1: Int, n2: Int): Int = {
    println("sum() 执行了")
    return n1 + n2
  }
}
