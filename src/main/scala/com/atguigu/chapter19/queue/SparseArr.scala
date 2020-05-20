package com.atguigu.chapter19.queue

import scala.collection.mutable.ArrayBuffer

object SparseArr {
  def main(args: Array[String]): Unit = {
    //稀疏数组

    //原始数组
    val chessMap = Array.ofDim[Int](11, 11)
    val rowSize = 11 //行数
    val colSize = 11 //列数
    chessMap(2)(3) = 1 // 1 表示黑子
    chessMap(1)(2) = 2 // 2 表示白子
    println("---------------原始数组-----------------")
    for (item <- chessMap) {
      for (item2 <- item) {
        printf("%d\t", item2)
      }
      println()
    }

    //经过稀疏数组保存的棋盘
    val sparseArr = ArrayBuffer[Node]()
    //保存棋盘元数据：rowSize行，colSize列，0默认值暂时不用
    //sparseArr += new Node(rowSize, colSize, 0)
    val node = new Node(rowSize, colSize, 0)
    sparseArr.append(node)
    for (i <- 0 until chessMap.length) {
      for (j <- 0 until chessMap(i).length) {
        if (chessMap(i)(j) != 0) {
          val node = new Node(i, j, chessMap(i)(j))
          //sparseArr += node
          sparseArr.append(node)
        }
      }
    }

    //打印出稀疏数组
    println("---------------稀疏数组-----------------")
    for (node <- sparseArr) {
      printf("%d\t%d\t%d\n", node.row, node.col, node.value)
    }

    //稀疏数组恢复成原始数组
    val recoverRowSize = sparseArr(0).row
    val recoverColSize = sparseArr(0).col
    val recoverChessMap = Array.ofDim[Int](recoverColSize, recoverColSize)

    for (i <- 1 until sparseArr.length) {
      val node = sparseArr(i)
      recoverChessMap(node.row)(node.col) = node.value
    }

    println("---------------稀疏数组恢复成原始数组-----------------")
    for (item <- recoverChessMap) {
      for (item2 <- item) {
        printf("%d\t", item2)
      }
      println()
    }
  }
}

//定义一个类，保存棋盘的元数据和实际有效数据
class Node(val row: Int, val col: Int, val value: Int)










