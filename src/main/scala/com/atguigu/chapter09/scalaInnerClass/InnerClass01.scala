package com.atguigu.chapter09.scalaInnerClass

import com.atguigu.chapter09.scalaInnerClass

object InnerClass01 {
  def main(args: Array[String]): Unit = {


    //创建外部类
    val scalaOuterClass = new ScalaOuterClass

    //创建成员内部类对象，内部类实例和外部对象关联
    val scalaInnerClass = new scalaOuterClass.ScalaInnerClass

    //创建静态内部类
    val scalaStaticInnerClass = new ScalaOuterClass.ScalaStaticInnerClass

  }
}

class ScalaOuterClass { //外部类

  class ScalaInnerClass {
    //成员内部类

  }

}

object ScalaOuterClass {

  //伴生对象

  class ScalaStaticInnerClass {
    //静态内部类

  }

}


