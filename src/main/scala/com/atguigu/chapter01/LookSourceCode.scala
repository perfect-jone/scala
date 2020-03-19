package com.atguigu.chapter01
/*
  查看源码快键键：Ctrl+B,关联源码包，根目录下的src\library\scala这个路径
 */
object LookSourceCode {
  def main(args: Array[String]): Unit = {
    var arr = new Array[Int](10)
    for (item <- arr){
      printf("item="+item)
    }
  }
}
