package com.atguigu.chapter10

object ListDemo01 {
  /**
    * scala中的List和java中的List不一样,在java中List是一个接口，真正存放数据的是ArrayList
    * scala的List可以直接存放数据，就是一个object，默认情况下的List是不可变的,属于Seq序列下的LinearSeq
    */
  def main(args: Array[String]): Unit = {
    //默认情况下List是 scala.collection.immutable.List包下,这个包在package object scala{}包对象下声明了，所以可以直接使用
    //如果需要使用可变的List，可以使用ListBuffer
    val list = List(1, 2, 3,"hello")
    val list2 = Nil //空集合
    for (i <- list) {
      println(i)
    }
    println(list)
    println(list2)
    println("============访问元素====================")

    //访问元素
    println(list(0))

    println("============追加元素====================")
    //追加元素：3中方式
    //向列表中增加元素，会返回新的列表/集合对象
    //注意：本身的集合还是不可变集合，并没有改变
    val list3 = List(1,2)
    val list4 = list3 :+ 3 //使用 :+ 在列表的最后增加数据
    println("list4="+list4)  //list4=List(1, 2, 3)

    val list5 = 4 +: list3 //使用 +: 在列表的最前面增加数据
    println("list5="+list5)  //list5=List(4, 1, 2)

    // ：：符号表示向集合中 新建集合添加元素
    val list6 = List(6,7)
    //把8,9元素和list6集合从右向左依次放进Nil空集合中
    val list7 = 8 :: 9 :: list6 :: Nil
    println("list7="+list7)  //list7=List(8, 9, List(6, 7))

    // :::表示将集合中的每一个元素加入到空集合中去
    val list8 = 8 :: 9 :: list6 ::: Nil
    println("list8="+list8)  //list8=List(8, 9, 6, 7)

  }
}
