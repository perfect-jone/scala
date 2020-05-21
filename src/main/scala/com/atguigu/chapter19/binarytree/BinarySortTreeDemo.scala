package com.atguigu.chapter19.binarytree

/**
  * BST(Binary Sort Tree)二叉排序树：
  * 1.添加节点
  * 2.遍历节点
  * 3.查找节点
  * 4.查找父节点
  * 5.删除节点
  */

object BinarySortTreeDemo {
  def main(args: Array[String]): Unit = {
    val arr = Array(7, 3, 10, 12, 5, 1, 9, 2)
    val binarySortTree = new BinarySortTree
    for (item <- arr) {
      binarySortTree.add(new Node(item))
    }
    println("排序前O^_^O")
    binarySortTree.infixOrder()
    /*    val node = binarySortTree.infixOrderSearch(12)
        if (node != null) {
          printf("找到,节点信息为：no=%d", node.no)
        } else {
          println("找不到T^_^T")
        }*/

    /*    val node = binarySortTree.searchParent(2)
        if (node != null) {
          printf("找到,父节点信息为：no=%d", node.no)
        } else {
          println("找不到T^_^T")
        }*/
    println("排序后O^_^O")
    //    binarySortTree.delete(2)
    //    binarySortTree.delete(5)
    //    binarySortTree.delete(9)
    //    binarySortTree.delete(12)
    binarySortTree.delete(3)
    binarySortTree.delete(7)
    binarySortTree.delete(10)
    binarySortTree.infixOrder()

  }
}

class BinarySortTree {
  var root: Node = null

  //1.添加节点
  def add(node: Node): Unit = {
    if (root == null) {
      root = node
    } else {
      root.add(node)
    }
  }

  //2.中序遍历节点
  def infixOrder(): Unit = {
    if (root != null) {
      root.infixOrder()
    } else {
      println("当前二叉树为空")
    }
  }

  //3.中序查找
  def search(no: Int): Node = {
    if (root != null) {
      root.search(no)
    } else {
      return null
    }
  }

  //4.查找父节点
  def searchParent(no: Int): Node = {
    if (root != null) {
      return root.searchParent(no)
    } else {
      return null
    }
  }


  //5.删除节点
  //1.先删除叶子节点(当前节点的左子节点和右子节点都为空)
  //2.删除只有一个子节点的节点
  //3.删除有两个节点的节点
  def delete(no: Int): Unit = {
    if (root == null) {
      return
    }
    //查找要删除的节点
    val targetNode = search(no)
    if (targetNode == null) { //说明要删除的叶子节点不存在
      return
    }
    //查找要删除节点的父节点
    val parentNode = searchParent(no)
    if (parentNode == null) { //说明是根节点
      root = null
      return
    }

    //删除节点
    if (targetNode.left == null && targetNode.right == null) { //1.删除叶子节点
      if (parentNode.left != null && parentNode.left.no == no) { //如果要删除的节点在父节点的左边
        parentNode.left = null
      } else { //如果要删除的节点在父节点的右边
        parentNode.right = null
      }
    } else if (targetNode.left != null && targetNode.right != null) { //2.删除有两个节点的节点
      /**
        * 思路分析：
        * 比如要删除根节点7
        * 1.找到当前根节点右子树的最小值9   (或当前根节点的左子树的最大值5)
        * 2.删除9并返回   (或删除5并返回)
        * 3.将当前根节点置换成9  (或将当前根节点置换成5)
        */
      val minNo = deleteRightTreeMin(targetNode.right)
      targetNode.no = minNo
    } else { //3.删除只有一个子节点的节点
      if (targetNode.left != null) { //当前节点只有左节点
        if (parentNode.left.no == no) { //当前节点是父节点的左节点
          parentNode.left = targetNode.left
        } else { //当前节点是父节点的右节点
          parentNode.right = targetNode.left
        }
      } else { //当前节点只有右节点
        if (parentNode.left.no == no) { //当前节点是父节点的左节点
          parentNode.left = targetNode.right
        } else { //当前节点是父节点的右节点
          parentNode.right = targetNode.right
        }
      }
    }
  }

  //删除某个节点右子树的最小值的节点
  def deleteRightTreeMin(node: Node): Int = {
    var target = node
    while (target.left != null) {
      target = target.left //只要target不为空，就不停的往左边走，直到为空则退出循环
    }
    //退出while循环的target就是最小值
    val minNo = target.no
    delete(minNo)
    return minNo
  }
}

class Node(var no: Int) {
  var left: Node = null //左子节点
  var right: Node = null //右子节点

  //1.添加节点
  def add(node: Node): Unit = {
    if (node == null) { //要增加的节点不能为空
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

  //2.中序遍历
  def infixOrder(): Unit = {
    if (left != null) {
      left.infixOrder()
    }
    printf("节点信息 no=%d\n", no)
    if (right != null) {
      right.infixOrder()
    }
  }

  //中序查找
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

  //3.中序查找 思路清晰，推荐使用下面这个
  def search(no: Int): Node = {
    if (no < this.no) { //查找值 < 当前值
      if (left == null) { //为空说明左边没有找到该值
        return null
      } else { //向左递归查找
        return left.search(no)
      }
    } else if (no == this.no) { //查找值 = 当前值，返回当前值
      return this
    } else { //查找值 > 当前值
      if (right == null) { //为空说明右边边没有找到该值
        return null
      } else { //向右递归查找
        return right.search(no)
      }
    }
  }

  //4.查找父节点
  def searchParent(no: Int): Node = {
    //判断当前节点的左节点或者父节点是否是这个值，如果是则返回当前节点
    if ((left != null && left.no == no) || (right != null && right.no == no)) {
      return this
    } else {
      if (left != null && no < this.no) { //向左递归查找
        return left.searchParent(no)
      } else if (right != null && no > this.no) { //向右递归查找
        return right.searchParent(no)
      } else {
        return null
      }
    }
  }
}
