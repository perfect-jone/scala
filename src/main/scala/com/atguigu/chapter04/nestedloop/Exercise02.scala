package com.atguigu.chapter04.nestedloop

import scala.util.control.Breaks._

object Exercise02 {
  def main(args: Array[String]): Unit = {
    /**
      * 100以内的数求和，求出当和第一次大于20的当前数
      */
    /*    var sum = 0
        breakable{
          for(i <-1 to 100){
            sum += i
            if(sum > 20){
              println("第一次大于20的当前数是"+i)
              break()
            }
          }
        }*/

    var loop = true
    var sum = 0
    for (i <- 1 to 100 if loop == true) {
      sum += i
      if (sum > 20) {
        loop = false
        println("第一次大于20的当前数是"+i)
      }
    }
  }
}
