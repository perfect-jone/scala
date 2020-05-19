package com.atguigu.chapter19.hashtab

import scala.io.StdIn
import util.control.Breaks._

object HashTableDemo {
  def main(args: Array[String]): Unit = {
    //初始化HashTab
    val hashTab = new HashTab(7)
    var key = ""
    while (true) {
      println("add:  添加员工")
      println("list: 显示员工")
      println("find: 查找员工")
      println("exit: 退出系统")
      key = StdIn.readLine()
      key match {
        case "add" => {
          println("请输入员工编号")
          val id = StdIn.readInt()
          println("请输入员工姓名")
          val name = StdIn.readLine()
          val emp = new Emp(id, name)
          hashTab.add2(emp)
        }
        case "list" => hashTab.list()
        case "find" => {
          println("请输入要查找的员工id")
          val id = StdIn.readInt()
          hashTab.findEmpById(id)
        }
        case "exit" => System.exit(0)
        case _ => println("什么都没匹配到T^_^T")
      }
    }
  }
}

//创建哈希散列表
class HashTab(val size: Int) {
  val empLinkedListedArr = new Array[EmpLinkedList](size)
  //初始化EmpLinkedList
  for (i <- 0 until size) {
    empLinkedListedArr(i) = new EmpLinkedList
  }

  //散列函数,可以定制
  def hashFun(id: Int): Int = {
    id % size
  }

  def add(emp: Emp): Unit = {

    //empLinkedListNo表示该员工应该加入到哪条链表中的下标
    val empLinkedListNo = hashFun(emp.id)
    empLinkedListedArr(empLinkedListNo).add(emp)
  }

  def add2(emp: Emp): Unit = {

    //empLinkedListNo表示该员工应该加入到哪条链表中的下标
    val empLinkedListNo = hashFun(emp.id)
    empLinkedListedArr(empLinkedListNo).add2(emp)
  }

  def list(): Unit = {
    for (i <- 0 until size) {
      empLinkedListedArr(i).list(i)
    }
  }

  def findEmpById(id: Int): Unit = {
    val empLinkedListNo = hashFun(id)
    val emp = empLinkedListedArr(empLinkedListNo).findEmpById(id)
    if (emp != null) {
      printf(s"在第${empLinkedListNo}条链表找到 id=%d name=%s\n", emp.id, emp.name)
    } else {
      printf("没有找到id=%d的员工\n", id)
    }
  }
}

//创建员工单向链表
class EmpLinkedList {
  var head: Emp = new Emp(0, "")

  def add(emp: Emp): Unit = {
    var temp = head
    breakable {
      while (true) {
        if (temp.next == null) {
          break()
        }
        temp = temp.next
      }
    }
    temp.next = emp
  }

  def add2(emp: Emp): Unit = {

    var temp = head
    var flag = false
    breakable {
      while (true) {
        if (temp.next == null) { //已经到链表最后
          break()
        }
        if (emp.id < temp.next.id) { //找到位置，为temp的右边
          break()
        }
        if (emp.id == temp.next.id) { //相等，说明已经有了该id的员工
          flag = true
          break()
        }
        temp = temp.next
      }
    }
    if (!flag) { //说明没有重复排名
      emp.next = temp.next
      temp.next = emp
    } else { //说明已经有重复排名了
      printf("已经存在该英雄，编号是%d\n", emp.id)
    }
  }

  def list(i: Int): Unit = {
    if (head.next == null) {
      println(s"第${i}条链表为空")
      return
    }
    print(s"第${i}条链表信息：\t")
    var temp = head
    breakable {
      while (true) {
        if (temp == null) {
          break()
        }
        if (temp.id != 0) {
          printf("=> id=%d name=%s\t", temp.id, temp.name)
        }
        temp = temp.next
      }
    }
    println()
  }

  def findEmpById(id: Int): Emp = {
    if (head == null) {
      println("链表为空")
      return null
    }
    var temp = head
    breakable {
      while (true) {
        if (temp == null) {
          break()
        }
        if (temp.id == id) {
          break()
        }
        temp = temp.next
      }
    }

    return temp
  }
}

//创建员工类
class Emp(eId: Int, eName: String) {
  val id = eId
  var name = eName
  var next: Emp = null
}
