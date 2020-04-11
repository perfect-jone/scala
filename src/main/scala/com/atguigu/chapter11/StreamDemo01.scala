package com.atguigu.chapter11

object StreamDemo01 {
  def main(args: Array[String]): Unit = {
    //stream 流 这个集合可以存放无穷多个数据，但是这个无穷多个元素并不会一次性生产出来
    //而是需要多大的区间，就会动态的生产，末尾元素遵循lazy规则，即要是用结果才计算的
    def numsForm(n:BigInt):Stream[BigInt] = n #:: numsForm(n + 1)
    val stream1 = numsForm(1)
    println(stream1)
    println(stream1.head)
    println(stream1.tail)

    def multi(x: BigInt):BigInt={
      x * x
    }
    println(numsForm(6).map(multi))
  }
}
