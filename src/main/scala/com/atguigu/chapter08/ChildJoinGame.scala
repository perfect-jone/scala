package com.atguigu.chapter08

object ChildJoinGame {
  def main(args: Array[String]): Unit = {
    val child01 = Child("蜡笔小新")
    val child02 = Child("樱桃小丸子")
    val child03 = Child("胡图图")
    Child.joinName(child01)
    Child.joinName(child02)
    Child.joinName(child03)
    Child.getTotalNum()

  }
}

class Child(inName: String) {
  var name = inName
}

object Child {
  var totalChildNum = 0

  def apply(inName: String): Child = new Child(inName)

  def joinName(child: Child): Unit = {
    printf("%s加入了游戏!\n", child.name)
    totalChildNum += 1
  }

  def getTotalNum(): Unit = {
    printf("总共有%d个小孩...:)",totalChildNum)
  }
}