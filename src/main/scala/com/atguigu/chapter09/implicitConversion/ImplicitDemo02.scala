package com.atguigu.chapter09.implicitConversion

object ImplicitDemo02 {

    //隐式函数
  implicit def addDelete(mysql: MySQL): DB = {
    new DB
  }
  def main(args: Array[String]): Unit = {

  }
    val mySQL = new MySQL
    mySQL.insert()
    mySQL.delete()  //addDelete$1(mySQL).delete()
}

class MySQL {
  def insert(): Unit ={
    println("insert")
  }
}

class DB {
  def delete(): Unit ={
    println("delete")
  }
}
