package com.atguigu.chapter19.linkedlist

import util.control.Breaks._

object SingleLinkedListDemo {
  def main(args: Array[String]): Unit = {
    /*   val node = new HeroNode(1, "张三", "黑子")
       val node3 = new HeroNode(3, "张三3", "黑子3")
       val node2 = new HeroNode(2, "张三2", "黑子2")
       val node4 = new HeroNode(4, "张三4", "黑子4")
       val singleLinkedList = new SingleLinkedList
       singleLinkedList.add(node)
       singleLinkedList.add(node3)
       singleLinkedList.add(node2)
       singleLinkedList.add(node4)*/
    println("===================测试增加=========================")
    val node1 = new HeroNode(1, "张三", "黑子")
    val node2 = new HeroNode(3, "张三3", "黑子3")
    val node5 = new HeroNode(2, "张三2", "黑子2")
    val node4 = new HeroNode(4, "张三4", "黑子4")
    val singleLinkedList = new SingleLinkedList
    singleLinkedList.add2(node1)
    singleLinkedList.add2(node2)
    singleLinkedList.add2(node5)
    singleLinkedList.add2(node4)

    singleLinkedList.list()
    println("===================测试修改=========================")
    val node6 = new HeroNode(2, "鲁智深", "花和尚")
    singleLinkedList.update(node6)
    singleLinkedList.list()
    println("====================测试删除==========================")
    singleLinkedList.delete(4)
    singleLinkedList.list()
  }
}

//定义单向链表管理HeroNode
class SingleLinkedList {

  //初始化头结点，头结点一般不会动
  val head = new HeroNode(0, "", "")


  //判断链表是否为空
  def isEmpty(): Unit = {
    if (head.next == null) {
      println("链表为空")
      break()
    }
  }

  //第一种方法在添加英雄时，直接添加到链表的尾部
  def add(heroNode: HeroNode): Unit = {
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
  }

  //第二种方式在添加英雄时，根据排名将英雄插入到指定位置
  //如果有这个排名，则添加失败，并给出提示
  def add2(heroNode: HeroNode): Unit = {
    //因为头结点一般不会改变，所以把head的引用赋给temp
    var temp = head
    //增加一个标记属性，默认为没有这个排名
    var flag = false
    breakable {
      while (true) {
        if (temp.next == null) { //说明已经是链表最后
          break()
        }
        if (heroNode.number < temp.next.number) {
          //从小到大，找到加入的位置，该位置就是temp的后面
          break()
        } else if (heroNode.number == temp.next.number) {
          //如果相等，说明已经有了这个排名
          flag = true
          break()
        }
        temp = temp.next //让temp继续往后走
      }
    }
    //跳出while循环后
    if (flag) {
      //说明已经有了这个排名
      printf("已经存在该英雄，编号是%d\n", heroNode.number)
    } else {
      //没有重复排名
      heroNode.next = temp.next //先将heroNode指向temp.next,即的后继是temp.next
      temp.next = heroNode //再将temp.next指向heroNode,即temp.next的后继是heroNode
    }
  }

  //修改链表，根据编号number修改
  def update(heroNode: HeroNode): Unit = {
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

  //删除链表，根据表编号number删除
  def delete(number: Int): Unit = {
    var temp = head
    var flag = false
    breakable {
      while (true) {
        isEmpty() //判断链表是否为空
        if (temp.next.number == number) { //说明找到了
          flag = true
          break()
        }
        temp = temp.next
      }
    }
    if (flag) { //可以删除
      temp.next = temp.next.next //让temp指向它后继的后继节点
    } else { //不可以删除
      printf("要删除的编号number=%d不存在！\n", number)
    }
  }

  //遍历单向链表
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
}

class HeroNode(hNumber: Int, hName: String, hNickName: String) {
  var number: Int = hNumber
  var name: String = hName
  var nickName: String = hNickName
  var next: HeroNode = null
}

