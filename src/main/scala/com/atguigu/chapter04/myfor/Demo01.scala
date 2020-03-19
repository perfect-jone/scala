package com.atguigu.chapter04.myfor

object Demo01 {
  def main(args: Array[String]): Unit = {

    for (i <- 1 to 10) {
      //println(i+"\thello,jone!")
    }

    for (i <- 1 until 10) {
      //println(i+"\thello,pating!")
    }

    //循环守卫
    for (i <- 1 to 10 if i != 5) {
      //println(i+"\thello,jone!")
    }

    //引入变量
    for (i <- 1 to 8; j = 4 - i) {
      //println(j)
    }

    //循环嵌套
    for (i <- 1 to 3; j <- 1 to 3) {
      //println("i="+i+"j="+j)
    }

    //循环返回值 yield i 将每次循环得到的i放入到Vector中，并返回给res，i可以是代码块

    val res = for (i <- 1 to 10) yield {
      if (i % 2 == 0) {
        i
      } else {
        "奇数" + i
      }
    }
    //println(res)

    //scala擅长把集合中的各个数据进行处理并返回给新的函数

    //步长
    // def apply(start: Int, end: Int, step: Int): Range = new Range(start, end, step)
    for (i <- Range(1, 10, 2)) {
      //println(i)
    }
    for (i <- 1 to 10 if i % 3 == 1) {
      //println(i)
    }

    //打印1～100之间所有是9的倍数的个数及总和

    var count = 0
    var sum = 0
    for (i <- Range(1, 100, 9)) {
      count += 1
      sum += i
    }
    //println("个数是" + count + ",总数是" + sum)

    var n = 6
    for(i <- 0 to n){
      //printf("%d + %d = %d\n",i,n-i,n)
    }

    //for循环可以直接对集合进行遍历
    var list = List("hello", 10, 30, "tom")
    for (item <- list) {
      //println(item)
    }


  }
}
