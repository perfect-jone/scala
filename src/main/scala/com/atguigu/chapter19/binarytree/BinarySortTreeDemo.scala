package com.atguigu.chapter19.binarytree

import scala.util.Random

object BinarySortTreeDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(7, 3, 10, 12, 5, 1, 9)
    val binarySortTree = new BinarySortTree
    for (item <- arr) {
      binarySortTree.add(new Node(item))
    }
    binarySortTree.infixOrder()
    val node = binarySortTree.infixOrderSearch(12)
    if (node != null) {
      printf("找到,节点信息为：no=%d", node.no)
    } else {
      println("找不到T^_^T")
    }
  }
}

class BinarySortTree {
  var root: Node = null

  //添加节点
  def add(node: Node): Unit = {
    if (root == null) {
      root = node
    } else {
      root.add(node)
    }
  }

  //中序遍历节点
  def infixOrder(): Unit = {
    if (root != null) {
      root.infixOrder()
    } else {
      println("当前二叉树为空")
    }
  }

  //中序查找
  def infixOrderSearch(no: Int): Node = {
    if (root != null) {
      root.infixOrderSearch(no)
    } else {
      return null
    }
  }
}

class Node(val no: Int) {
  var left: Node = null //左子节点
  var right: Node = null //右子节点

  //添加节点
  def add(node: Node): Unit = {
    if (node == null) {
      return
    }
    if (node.no < no) { //要添加的节点编号小于当前节点的编号
      if (left == null) { //当前节点的左节点为空，可以直接将要添加的节点直接挂到当前节点的左节点
        left = node
      } else { //当前节点的左节不点为空，向左递归，直到当前节点的左节点为空
        left.add(node)
      }
    } else { //要添加的节点编号大于等于当前节点的编号
      if (right == null) { //当前节点的右节点为空，可以直接将要添加的节点直接挂到当前节点的右节点
        right = node
      } else { //当前节点的右节不点为空，向右递归，直到当前节点的右节点为空
        right.add(node)
      }
    }
  }

  //中序遍历
  def infixOrder(): Unit = {
    if (left != null) {
      left.infixOrder()
    }
    printf("节点信息 no=%d\n", no)
    if (right != null) {
      right.infixOrder()
    }
  }

  //中序查找1 和2都可以
  def infixOrderSearch2(no: Int): Node = {
    var resNode: Node = null
    if (left != null) { //向左递归查找
      resNode = left.infixOrderSearch2(no)
    }
    if (resNode != null) {
      return resNode
    }
    if (no == this.no) {
      return this
    }
    if (right != null) { //向右递归查找
      resNode = right.infixOrderSearch2(no)
    }
    return resNode
  }
  //中序查找2 和1都可以
  def infixOrderSearch(no: Int): Node = {
    if (no < this.no) {
      if (left == null) {
        return null
      }else {
        return left.infixOrderSearch(no)
      }
    }else if(no == this.no) {
      return this
    }else {
      if (right == null) {
        return null
      }else {
        return right.infixOrderSearch(no)
      }
    }
  }
}
