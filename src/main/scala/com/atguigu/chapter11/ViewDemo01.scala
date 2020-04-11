package com.atguigu.chapter11

object ViewDemo01 {
  def main(args: Array[String]): Unit = {

    def eq(n :Int): Boolean = {
      n.toString.equals(n.toString.reverse)
    }

    //没有使用view，常规方式
    val viewSquares1 = (1 to 100).filter(eq)
    println(viewSquares1)

    //Stream的懒加载特性，使用view,用到的时候再计算
    //程序中对集合进行map,faltmap,reduce,fold,scan等，并不希望立即执行，而是在使用到结果时才执行，则可以使用view来优化
    val viewSquares2 = (1 to 100).view.filter(eq)
    println(viewSquares2)
    //遍历
    for (item <- viewSquares2) {
      print("item="+item+"\t")
    }
  }
}
