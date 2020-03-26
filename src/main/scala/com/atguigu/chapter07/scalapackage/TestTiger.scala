package com.atguigu.chapter07.scalapackage.hello2
//scala中包名和源码所在的系统文件目录结构和java不一样，可以不一致，但是编译后的
//字节码文件和包名保持一致，这个工作由编译器完成
/**
  * scala包的三大作用：
  * 1.区分相同的类名
  * 2.管理众多的类
  * 3.控制访问范围
  * 4.可以对类的功能进行扩展
  * 包的本质就是分不同的文件夹来保存文件
  * 包名的命名规范：com.公司名.项目名.业务模块名，com.dhcc.snjk.user
  */
object TestTiger {
  def main(args: Array[String]): Unit = {
    //使用xh的Tiger
    val tiger01 = new com.atguigu.chapter07.scalapackage.xh.Tiger

    //使用xm的Tiger
    val tiger02 = new com.atguigu.chapter07.scalapackage.xm.Tiger

    println(tiger01+"\t"+tiger02)
  }
}

class Employee{

}