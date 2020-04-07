package com.atguigu.chapter09.implicitConversion

object ImplicitClassDemo {
  def main(args: Array[String]): Unit = {

    //构造参数有且只有一个，必须被定义在类、伴生对象或者包对象中，即不能是顶级的
    implicit class DB1(var m: MySQL1) {
      def addSuddix(): String = {
        m + "\tscala"
      }
    }

    val mySQL = new MySQL1
    mySQL.sayOk
    mySQL.addSuddix()
    println(mySQL.addSuddix()) //DB1$1(mySQL).addSuddix()

  }
}

class MySQL1 {
  def sayOk: Unit = {
    println("ok")
  }
}
