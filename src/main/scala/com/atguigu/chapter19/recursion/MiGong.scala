package com.atguigu.chapter19.recursion

object MiGong {
  def main(args: Array[String]): Unit = {
    /**
      * 思路分析：
      * 1.创建一个二维数组用来保存地图
      * 2.约定元素的值 0：可以走还没有走；1：墙 ；2：可以走并且已经走过了；3：已经走过但是是死路
      * 3.递归回溯策略：下 --> 右 --> 上 --> 左
      *
      */


    //1.创建一个二维数组用来保存地图,8行7列
    val map = Array.ofDim[Int](8, 7)

    //地图的墙
    for (i <- 0 until 8) {
      map(i)(0) = 1
      map(i)(6) = 1
    }
    for (i <- 0 until 7) {
      map(0)(i) = 1
      map(7)(i) = 1
    }
    //设置挡板
    map(3)(1) = 1
    map(3)(2) = 1

    for (i <- 0 until 8) {
      for (j <- 0 until 7) {
        print(map(i)(j) + "\t")
      }
      println()
    }
    println("==============测试地图====================")
    findWay(map, 1, 1)
    for (i <- 0 until 8) {
      for (j <- 0 until 7) {
        print(map(i)(j) + "\t")
      }
      println()
    }
  }


  //使用递归回溯来找路
  //map表示地图
  //i,j表示从哪里开始出发(1,1)
  //0：可以走还没有走；1：墙 ；2：可以走并且已经走过了；3：已经走过但是是死路
  def findWay(map: Array[Array[Int]], i: Int, j: Int): Boolean = {
    if (map(6)(5) == 2) { //表示路已经找到了
      return true
    } else {
      if (map(i)(j) == 0) { //表示可以走但是还没有走
        //这里开始递归回溯
        //假定该点可以走通
        map(i)(j) = 2
        if (findWay(map, i - 1, j)) { //右找
          return true
        } else if (findWay(map, i, j + 1)) { //下找
          return true
        } else if (findWay(map, i + 1, j)) { //左找
          return true
        } else if (findWay(map, i, j - 1)) { //上找
          return true
        } else {
          //走过了，是死路
          map(i)(j) = 3
          return false
        }
      } else { //map(i)(j) != 0 ,则值为1,3（2已经走过了）
        return false
      }
    }
  }
}
