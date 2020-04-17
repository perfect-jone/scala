package com.atguigu.chapter14

object RecuriveListMax {
  def main(args: Array[String]): Unit = {
    //使用递归求list中的最大值
    val res = max(List(1,2,3,4,5,6))
    List(1,2,3,4,5,6).max
    println(res)
  }

  def max(list: List[Int]): Int = {
    if (list.isEmpty) throw new java.util.NoSuchElementException
    if (list.size == 1)  list.head
    else if(list.head > max(list.tail)) list.head
    else max(list.tail)
  }
}
