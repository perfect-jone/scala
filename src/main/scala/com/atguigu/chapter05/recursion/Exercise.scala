package com.atguigu.chapter05.recursion

object Exercise {
  def main(args: Array[String]): Unit = {
    //println(fibonacci(7))
    //println(f(2))
    println(peach(1))
  }

  /**
    *1.斐波那契数列:1,1,2,3,5,8,13…，给出一个整数n，求它的斐波那契数是多少？
    */

  def fibonacci(n: Int): Int = {
    if (n == 1 || n == 2) {
      1
    } else {
      fibonacci(n - 1) + fibonacci(n - 2)
    }
  }

  /**
    * 2.已知f(1)=3;f(n)=2*f(n-1)+1;求f(n)？
    */

  def f(n: Int): Int = {
    if (n == 1) {
      3
    } else {
      2 * f(n - 1) + 1
    }
  }

  /**
    * 3.猴子吃桃：有一堆桃子，猴子第一天吃了其中的一半，然后再多吃一个，以后每天都这样。当到第十天的时候，发现只有一个桃子。求当初共有多少桃子？
    * 思路：day = 10,n = 1;
    * day = 9,n = (day10[1] + 1) * 2 = 4;
    * day = 8,n= (day9[4] + 1) * 2 = 10
    */
  def peach(day: Int): Int = {
    if (day == 10) {
      1
    } else {
      (peach(day + 1) + 1) * 2
    }
  }

}
