package com.atguigu.chapter07.visibility

import scala.beans._
import scala.collection.mutable._  //表示将该包的所有内容引入，等价*
object Details {
  def main(args: Array[String]): Unit = {
      //
  }
}

class User {
  import scala.beans.BeanProperty //包可以在一个文件的任意位置引入
  @BeanProperty
  var name: String = ""

  def test(): Unit ={
    //如果不想要某个包中的全部的类，而是其中几个类，可以使用选择器{}
    import scala.collection.mutable.{HashMap,HashSet}
    val map = new HashMap()
    val set = new HashSet
  }

  def test2(): Unit = {
    //如果引入的多个包中含有相同的类，那么可以将不需要的类进行区分，这个就是重命名
    import scala.collection.mutable._
    import java.util.{HashMap=>JavaHashMap,List}
    val map = new HashMap()//scala中的HashMap
    val map1 = new JavaHashMap()//java中HashMap的别名
  }

}

class Dog {
 // @BeanProperty 会报错，import scala.beans.BeanProperty作用域仅限于User类
  var name: String = ""
}