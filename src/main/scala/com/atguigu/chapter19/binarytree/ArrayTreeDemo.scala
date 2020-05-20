package com.atguigu.chapter19.binarytree

object ArrayTreeDemo {
  def main(args: Array[String]): Unit = {
    /**
      * 数组存储方式和树的存储方式可以相互转换
      * 顺序存储二叉树的特点:
      *  1.顺序二叉树通常只考虑完全二叉树
      *  2.第n个元素的左子节点为 2 * n + 1
      *  3.第n个元素的右子节点为 2 * n + 2
      *  4.第n个元素的父节点为 (n-1) / 2
      */
    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    val arrayTree = new ArrayTree(arr)
    println("前序遍历")
    arrayTree.preOrder()
    println("中序遍历")
    arrayTree.infixOrder()
    println("后序遍历")
    arrayTree.postOrder()

  }
}

class ArrayTree(val arr: Array[Int]) {
  //对preOrder进行重载
  def preOrder(): Unit = {
    preOrder(0)
    println()
  }

  //前序遍历
  def preOrder(index: Int): Unit = {
    if (arr == null || arr.length == 0) {
      println("数组不能为空")
      return
    }
    print(arr(index) + "\t")
    //向左进行递归
    if (index * 2 + 1 < arr.length) {
      preOrder(index * 2 + 1)
    }
    //向右进行递归
    if (index * 2 + 2 < arr.length) {
      preOrder(index * 2 + 2)
    }
  }

  //对infixOrder进行重载
  def infixOrder(): Unit = {
    infixOrder(0)
    println()
  }

  //中序遍历
  def infixOrder(index: Int): Unit = {
    if (arr == null || arr.length == 0) {
      println("数组不能为空")
      return
    }
    //向左进行递归
    if (index * 2 + 1 < arr.length) {
      infixOrder(index * 2 + 1)
    }
    print(+arr(index) + "\t")
    //向右进行递归
    if (index * 2 + 2 < arr.length) {
      infixOrder(index * 2 + 2)
    }
  }

  //对postOrder进行重载
  def postOrder(): Unit = {
    postOrder(0)
    println()
  }

  //中序遍历
  def postOrder(index: Int): Unit = {
    if (arr == null || arr.length == 0) {
      println("数组不能为空")
      return
    }
    //向左进行递归
    if (index * 2 + 1 < arr.length) {
      postOrder(index * 2 + 1)
    }
    //向右进行递归
    if (index * 2 + 2 < arr.length) {
      postOrder(index * 2 + 2)
    }
    print(arr(index) + "\t")
  }
}
