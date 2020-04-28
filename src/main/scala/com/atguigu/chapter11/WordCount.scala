package com.atguigu.chapter11

object WordCount {
  def main(args: Array[String]): Unit = {
    val arr = Array("hello tom", "hello jerry", "hello hello")
    //方式一
    //arr.flatMap(_.split(" ")).map((_,1)).groupBy(_._1).map(t=>(t._1,t._2.size))

    //arr.flatMap(_.split(” “)) //相当于是将Array中的数组进行压缩，下划线代表的是Arrary中的每个元素，并且按照” “进行切分
    val a = arr.flatMap(_.split(" "))

    //接着对map中的每个元素进行汇总计算,这里的map((_,1))相当于是将前面的Array变成元组的形式
    val b = arr.flatMap(_.split(" ")).map((_, 1))

    //接着把array进行分组,将上面的array按照key的方式进行分组
    val c = arr.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1)

    //最后将结果进行求和,其中c._1就是上面的单词作为key， value是c._2.size,即Array的大小
    val map1 = arr.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(c => (c._1, c._2.size)).toList.sortBy(_._2).reverse
    println(map1)


    //方式二
    //mapValues的用途是直接将Array的内容进行按照key相同的进行统计计算。
    // .foldLeft(0)(_+_._2) 第一个下划线表示的是的是数组中的key，意思是分别取出其中的Array集合，
    // .foldLeft(0)(_+_._2)表示将Array进行求和，后边括号中的第一个下划线表示的是处事值0，第二个下划线是表示的是元组，._2表示的是元组中的第二个值，即单词出现的次数。

    val map2 = arr.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_ + _._2)).toList.sortBy(_._2).reverse
    println(map2)
  }

  /**
    * **单词统计 **
    * *
    * val lines = List("hello tom hello jerry", "hello jerry", "hello kitty")
    * *
    * 实现1：
    * *
    *lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).mapValues(_.foldLeft(0)(_+_._2))
    * *
    * 分析：
    * *
    * （1）lines.flatMap(_.split(" ")) 将集合中的单词进行压平，其中每个元素通过" "来切分
    * *
    *lines.flatMap(_.split(" "))后为
    * res17: List[String] = List(hello, tom, hello, jerry, hello, jerry, hello, kitty)
    * *
    * （2）lines.flatMap(_.split(" ")).map((_, 1))统计每一个单词出现的次数，出现一次计数1
    * 执行后为
    * res18: List[(String, Int)] = List((hello,1), (tom,1), (hello,1), (jerry,1), (hel
    * lo,1), (jerry,1), (hello,1), (kitty,1))
    * *
    * （3）.groupBy(_._1)将集合进行分组，分组是按照集合中每一个元组如（hello，1）的第一个单词（_._1）进行分组
    * *
    * 分组后为一个map：
    * *
    * res19: scala.collection.immutable.Map[String,List[(String, Int)]] = Map(tom -> L
    * ist((tom,1)), kitty -> List((kitty,1)), jerry -> List((jerry,1), (jerry,1)), hel
    * lo -> List((hello,1), (hello,1), (hello,1), (hello,1)))
    * *
    * （4）.mapValues(_.foldLeft(0)(_+_._2)) 获取map中的所有values如 List((tom,1))，foldLeft进行统计，(0)初始化参数为0，_+_._2进行求和，第一个_在循环时可能为初始化参数和进行求和后的值
    * *
    * 执行后为：
    * res20: scala.collection.immutable.Map[String,Int] = Map(tom -> 1, kitty -> 1, je
    * rry -> 2, hello -> 4)
    * *
    * 实现2：
    * *
    *lines.flatMap(_.split(" ")).map((_, 1)).groupBy(_._1).map(t=>(t._1, t._2.size)).toList.sortBy(_._2).reverse
    */
}
