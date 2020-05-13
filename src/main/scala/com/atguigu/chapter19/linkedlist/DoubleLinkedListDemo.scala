package com.atguigu.chapter19.linkedlist

import scala.util.control.Breaks.{break, breakable}

object DoubleLinkedListDemo {
  def main(args: Array[String]): Unit = {
    val node1 = new HeroNode2(1, "张三", "黑子")
    val node3 = new HeroNode2(3, "张三3", "黑子3")
    val node2 = new HeroNode2(2, "张三2", "黑子2")
    val node4 = new HeroNode2(4, "张三4", "黑子4")
    val doubleLinkedList = new DoubleLinkedList

    println("===================测试增加=========================")
    doubleLinkedList.add(node1)
    doubleLinkedList.add(node3)
    doubleLinkedList.add(node2)
    doubleLinkedList.add(node4)
    doubleLinkedList.list()
    println("===================测试修改=========================")
    val node5 = new HeroNode2(3, "张三丰", "易经经")
    doubleLinkedList.update(node5)
    doubleLinkedList.list()
    println("====================测试删除==========================")
    doubleLinkedList.delete(3)
    doubleLinkedList.delete(2)
    doubleLinkedList.delete(4)
    doubleLinkedList.list()
    println("=================继续测试增加=========================")
    doubleLinkedList.add(node3)
    doubleLinkedList.list()
  }
}

class DoubleLinkedList {

  // 添加 > 遍历 > 修改 > 删除
  //初始化头结点，头结点一般不会动
  val head = new HeroNode2(0, "", "")

  //判断链表是否为空
  def isEmpty(): Unit = {
    if (head.next == null) {
      println("链表为空")
      break()
    }
  }

  //第一种方法在添加英雄时，直接添加到链表的尾部
  def add(heroNode: HeroNode2): Unit = {
    //因为头结点一般不会改变，所以把head的引用赋给temp
    var temp = head
    breakable {
      while (true) {
        if (temp.next == null) {
          //说明已经是链表最后
          break()
        }
        temp = temp.next //如果没有到链表最后,表示temp指向下一个节点
      }
    }
    temp.next = heroNode //退出循环后，temp就是链表的最后
    heroNode.previous = temp
  }

  //遍历双向链表
  def list(): Unit = {
    isEmpty() //判断当前链表是否为空
    var temp = head.next
    breakable {
      while (true) {
        //此处不能写temp.next == null 如果这样写，最后一个节点就遍历不到了
        if (temp == null) {
          break()
        }
        printf("节点信息为：number=%d name=%s nickName=%s\n",
          temp.number, temp.name, temp.nickName)
        //表示temp指向下一个节点,如果到了最后一个节点，则执行temp = temp.next后temp == null
        temp = temp.next
      }
    }
  }

  //修改双向链表，根据编号number修改
  def update(heroNode: HeroNode2): Unit = {
    var temp = head.next
    var flag = false
    isEmpty() //判断链表是否为空
    breakable {
      while (true) {
        //判断是否到链表最后
        if (temp.next == null) {
          break()
        }
        if (temp.number == heroNode.number) {
          flag = true
          break()
        }
        temp = temp.next //让temp继续指向下一个节点
      }
    }
    if (flag) { //说明找到了
      temp.name = heroNode.name
      temp.nickName = heroNode.nickName
    } else { //说明没找到
      printf("链表里没有编号为%d的英雄", heroNode.number)
    }
  }

  //删除双向链表，实现自我删除，根据表编号number删除
  def delete(number: Int): Unit = {
    var temp = head.next
    var flag = false
    breakable {
      while (true) {
        isEmpty() //判断链表是否为空
        if (temp.number == number) { //说明找到了
          flag = true
          break()
        }
        temp = temp.next
      }
    }
    if (flag) { //可以删除
      temp.previous.next = temp.next
      if (temp.next != null) {
        temp.next.previous = temp.previous
      }
    } else { //不可以删除
      printf("要删除的编号number=%d不存在！\n", number)
    }
  }
}

class HeroNode2(hNumber: Int, hName: String, hNickName: String) {
  var number: Int = hNumber
  var name: String = hName
  var nickName: String = hNickName
  var previous: HeroNode2 = null //前继节点
  var next: HeroNode2 = null //后继节点
}

