package com.atguigu.chapter19.linkedlist

import util.control.Breaks._

object Josephu {
  def main(args: Array[String]): Unit = {
    val boyGame = new BoyGame
    boyGame.addBoy(41)
    //boyGame.showBoy()
    boyGame.countBoy(1, 3, 41)
  }
}

class BoyGame() {
  //初始化第一个小孩，类似于单向链表中的头结点，一般不动
  var first: Boy = new Boy(0)

  //增加小孩
  def addBoy(nums: Int): Unit = {
    if (nums < 1) {
      println("不能小于1")
      return
    }
    var curBoy: Boy = null
    for (n <- 1 to nums) {
      val boy = new Boy(n)
      if (n == 1) { //第一个小孩
        first = boy //first指向第一个小孩的引用
        first.next = first //第一个小孩指向自己
        curBoy = first // curBoy指向第一个小孩
      } else { //后面其他小孩
        curBoy.next = boy //当前小孩指向下一个小孩
        boy.next = first //最后一个小孩指向第一个小孩
        curBoy = boy //curBoy指向当前小孩
      }
    }
  }

  //显示小孩
  def showBoy(): Unit = {
    if (first.next == null) {
      println("没有要显示的小孩")
      return
    }
    var curBoy = first
    breakable {
      while (true) {
        printf("小孩编号 no=%d\n", curBoy.no)
        if (curBoy.next == first) {
          break()
        }
        curBoy = curBoy.next
      }
    }
  }

  //编写countBoy方法，完成游戏
  //from 从第几个小孩开始数 1
  //size 数几个小孩  3
  //nums 这场游戏中共有多少小孩 41
  def countBoy(from: Int, size: Int, nums: Int): Unit = {
    if (first.next == null || from < 1 || from > nums) {
      println("参数有误，请重新输入")
      return
    }

    /**
      * 完成游戏的思路分析->实现代码
      * 1) 在 first 前面 设计一个辅助指针（helper） , 即将 helper 指针定位到 first 前面，即helper.next == first
      * 2) 将 first 指针移动到 from 这个小孩(helper 对应移动)
      * 3) 开始数 size 个数[first 和 helper 会对应的移动]
      * 4) 删除 first 指向的这个小孩节点
      */

    //  1) 在 first 前面 设计一个辅助指针（helper） , 即将 helper 指针定位到 first 前面，即helper.next == first
    var helper = first
    breakable {
      while (true) {
        if (helper.next == first) {
          break()
        }
        helper = helper.next //让helper继续往下走
      }
    }
    //  2) 将 first 指针移动到 from 这个小孩(helper 对应移动)
    for (i <- 0 until from - 1) {
      first = first.next
      helper = helper.next
    }

    //开始数数，暗战给定的值，每数到一个小孩就出圈，直到环形链表只有一个小孩
    breakable {
      while (true) {
        if (first == helper) { //说明只有一个小孩
          break()
        }
        //  3) 开始数 size 个数[first 和 helper 会对应的移动]
        for (i <- 0 until size - 1) {
          first = first.next
          helper = helper.next
        }
        //输出出圈人的信息
        printf("出圈小孩 no=%d\n", first.no)
        //将first指向的节点删除
        first = first.next
        helper.next = first
      }
    }
    //当退出while循环后，只留下最后一个小孩
    printf("最后一个小孩 no=%d", first.no)

  }
}

//创建小孩类
class Boy(bNo: Int) {
  var no: Int = bNo
  var next: Boy = null
}
