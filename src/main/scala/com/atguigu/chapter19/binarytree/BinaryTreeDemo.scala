package com.atguigu.chapter19.binarytree

object BinaryTreeDemo {
  def main(args: Array[String]): Unit = {
    val root = new HeroNode(1, "德玛")
    val hero2 = new HeroNode(2, "剑圣")
    val hero3 = new HeroNode(3, "提莫")
    val hero4 = new HeroNode(4, "光辉")
    val hero5 = new HeroNode(5, "火男")
    root.left = hero2
    root.right = hero3
    hero3.left = hero5
    hero3.right = hero4
    val binaryTree = new BinaryTree
    binaryTree.root = root
    //binaryTree.preOrder()
    //binaryTree.infixOrder()
    //binaryTree.postOrder()
    //val heroNode = binaryTree.preOrderSearch(5)
    //val heroNode = binaryTree.infixOrderSearch(5)
    val heroNode = binaryTree.postOrderSearch(6)
    if (heroNode != null) {
      printf("找到,英雄信息为：no=%d name=%s", heroNode.no, heroNode.name)
    } else {
      println("找不到T^_^T")
    }
  }
}

class BinaryTree {
  var root: HeroNode = null

  //前序遍历
  def preOrder(): Unit = {
    if (root != null) {
      root.preOrder()
    } else {
      println("当前二叉树为空")
    }
  }

  //前序查找
  def preOrderSearch(no: Int): HeroNode = {
    if (root != null) {
      root.preOrderSearch(no)
    } else {
      return null
    }
  }

  //中序遍历
  def infixOrder(): Unit = {
    if (root != null) {
      root.infixOrder()
    } else {
      println("当前二叉树为空")
    }
  }

  //中序查找
  def infixOrderSearch(no: Int): HeroNode = {
    if (root != null) {
      root.infixOrderSearch(no)
    } else {
      return null
    }
  }

  //后序遍历
  def postOrder(): Unit = {
    if (root != null) {
      root.postOrder()
    } else {
      println("当前二叉树为空")
    }
  }

  //后序查找
  def postOrderSearch(no: Int): HeroNode = {
    if (root != null) {
      root.postOrderSearch(no)
    } else {
      return null
    }
  }

}

class HeroNode(hNo: Int, hName: String) {
  val no = hNo
  var name = hName
  var left: HeroNode = null
  var right: HeroNode = null

  /**
    * 前序遍历: 先输出当前节点，然后输出左子节点，最后输出右子节点
    */
  def preOrder(): Unit = {
    printf("当前节点信息为 no=%d name=%s\n", no, name)
    if (left != null) {
      left.preOrder()
    }
    if (right != null) {
      right.preOrder()
    }
  }

  //前序查找
  def preOrderSearch(no: Int): HeroNode = {
    if (no == this.no) {
      return this
    }
    var resNode: HeroNode = null
    if (left != null) {
      resNode = left.preOrderSearch(no)
    }
    if (resNode != null) {
      return resNode
    }
    if (right != null) {
      resNode = right.preOrderSearch(no)
    }
    return resNode
  }

  /**
    * 中序遍历: 先输出左子节点，然后输出当前节点，最后输出右子节点
    */
  def infixOrder(): Unit = {
    if (left != null) {
      left.infixOrder()
    }
    printf("当前节点信息为 no=%d name=%s\n", no, name)
    if (right != null) {
      right.infixOrder()
    }
  }

  //中序查找
  def infixOrderSearch(no: Int): HeroNode = {
    var resNode: HeroNode = null
    if (left != null) {
      resNode = left.infixOrderSearch(no)
    }
    if (resNode != null) {
      return resNode
    }
    if (no == this.no) {
      return this
    }
    if (right != null) {
      resNode = right.infixOrderSearch(no)
    }
    return resNode
  }

  /**
    * 后序遍历: 先输出左子节点，然后输出右子节点，最后输出当前节点
    */
  def postOrder(): Unit = {
    if (left != null) {
      left.postOrder()
    }
    if (right != null) {
      right.postOrder()
    }
    printf("当前节点信息为 no=%d name=%s\n", no, name)
  }

  //后序查找
  def postOrderSearch(no: Int): HeroNode = {
    var resNode: HeroNode = null
    if (left != null) {
      resNode = left.postOrderSearch(no)
    }
    if (resNode != null) {
      return resNode
    }
    if (right != null) {
      resNode = right.postOrderSearch(no)
    }
    if (no == this.no) {
      return this
    }
    return resNode
  }
}