package com.atguigu.chapter10

import scala.collection.mutable

object HashMapDemo02 {
  def main(args: Array[String]): Unit = {
    //取值

    //1.使用map(key)
    val map = mutable.Map(("alice", 30), ("pan", 20), ("jone", "西安"), ("A", 1), (1, 2))
    val value1 = map("pan")
    println("value1=" + value1)
    //println(map(2)) //key不存在就会报错:key not found

    //2.map.contains
    if (map.contains("Ordersky")) {
      println(map("Ordersky"))
    } else {
      println("key不存在：）")
    }

    //3.使用map.get(key).get
    //通过map.get(key)这样的调用返回一个Option对象，要么是Some(值)，要么是None;Some是Option的子类
    val value2 = map.get("alice")
    println(value2) //Some(30)
    println(value2.get) //如果key不存在也会报错

    //4.使用getOrElse()
    println(map.getOrElse("alice", "默认的值"))

    //1.如果确定Map里面有这个key，则应当使用map(key),速度快
    //2.如果不能确定是否有key，而且有不同的业务逻辑，使用map.contains判断
    //3.如果只是简单的希望得到一个值，使用map.getOrElse("ip","127.0.0.1")

    //修改、添加、删除

    //修改和添加(insert or update)：map是可变的，才能修改，否则报错；如果key存在就更新，否则就添加

    map("alice") = 100
    map("bob") = 200
    map.update("jone", 26)

    //增加单个元素和多个元素
    map += ("A" -> 100) //如果key存在就更新
    map += ("B" -> 2, "C" -> 3)

    //删除
    map -= ("alice", 1)
    map -= (2, 3, 4) //key不存在也不会报错

    println(map.size)


    println(map)
    println("======================================")

    //Map的遍历
    val map2 = mutable.Map((1, "one"), (2, "two"), (3, "three"), (4, "four"), (5, "five"))
    for ((k, v) <- map2) println(k + "is mapped to" + v)
    for (k <- map2.keys) println(k)
    for (v <- map2.values) println(v)
    for (item <- map2) println(item + " key=" + item._1 + " value=" + item._2) //Tuple2
  }
}
