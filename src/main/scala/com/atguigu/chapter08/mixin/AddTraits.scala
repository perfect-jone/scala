package com.atguigu.chapter08.mixin

//构建对象时混入
//混入多个特质，也叫叠加特质.
object AddTraits {
  def main(args: Array[String]): Unit = {
    //当创建一个动态混入对象时：
    //scala在叠加特质的时候，会从左到右执行，先执行完父类的，再执行DB4，然后再执行File4
    //Operate4...
    //Data4...
    //DB4...
    //File4...
   // val mysql = new MySQL4 with DB4 with File4
    //println(mysql)

    //当执行一个动态混入对象的方法时：
    //1.顺序是从右到左执行;2.当执行到super时，指的是左边的特质，即DB4;3.如果左边再找不到特质，则super就是父特质
    //向文件
    //向数据库
    //插入数据=100

    //mysql.insert(100)

    //练习题

    //结果
    //Operate4...
    //Data4...
    //File4...
    //DB4...
    val mysql2 = new MySQL4 with File4 with DB4
    println(mysql2)

    //结果
    //向数据库
    //向文件
    //插入数据=200
    mysql2.insert(200)

  }
}

trait Operate4 {
  println("Operate4...")

  def insert(id: Int)
}

trait Data4 extends Operate4 {
  println("Data4...")

  override def insert(id: Int): Unit = {
    println("插入数据=" + id)
  }
}

trait DB4 extends Data4 {
  println("DB4...")

  override def insert(id: Int): Unit = {
    println("向数据库")
    super.insert(id)
  }
}

trait File4 extends Data4 {
  println("File4...")

  override def insert(id: Int): Unit = {
    println("向文件")
    super.insert(id) //这里super在动态混入时，不一定是父类

    //如果希望调用Data4的insert方法，可以如下指定
    //super[Data4].insert(id)
  }
}

class MySQL4 {}

