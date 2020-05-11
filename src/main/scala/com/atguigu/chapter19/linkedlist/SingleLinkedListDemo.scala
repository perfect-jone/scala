package com.atguigu.chapter19.linkedlist

import util.control.Breaks._

object SingleLinkedListDemo {
  def main(args: Array[String]): Unit = {
    val node = new HeroNode(1, "张三", "黑子")
    val node2 = new HeroNode(2, "张三2", "黑子2")
    val node3 = new HeroNode(3, "张三3", "黑子3")
    val singleLinkedList = new SingleLinkedList
    singleLinkedList.add(node)
    singleLinkedList.add(node2)
    singleLinkedList.add(node3)
    singleLinkedList.list()
  }
}

//定义单向链表管理HeroNode
class SingleLinkedList {

  //初始化头结点，头结点一般不会动
  val head = new HeroNode(0, "", "")

  //添加节点
  def add(heroNode: HeroNode): Unit = {
    //因为头结点一般不会改变，所以把head的引用赋给temp
    var temp = head

    breakable {
      while (true) {
        if (temp.next == null) { //说明已经是链表最后
          break() //跳出循环
        }
        temp = temp.next //如果没有到链表最后,表示temp指向下一个节点
      }
    }
    temp.next = heroNode //退出循环后，temp就是链表的最后
  }

  //遍历单向链表
  def list(): Unit = {
    //判断当天链表是否为空
    if (head.next == null) {
      println("链表为空")
      return
    }
    var temp = head.next
    while (true) {
      if (temp == null) {
        return
      }
      printf("节点信息为：number=%d name=%s nickName=%s\n",
        temp.number, temp.name, temp.nickName)
      temp = temp.next
    }
  }
}

class HeroNode(hNumber: Int, hName: String, hNickName: String) {
  var number: Int = hNumber
  var name: String = hName
  var nickName: String = hNickName
  var next: HeroNode = null
}

