package com.atguigu.chapter10.tuple


object TupleDemo01 {
  def main(args: Array[String]): Unit = {

    //元祖中最大可以放22个元素,类型是Tuple4,根据元素个数的不同对应不同的元祖类型,分别是Tuple1-Tuple22

    //1.创建元组
    val tuple01 = (1, "jone", 99.99, 's')
    println(tuple01)
    /*
     *反编译后对应代码
     * Tuple4 tuple01 = new Tuple4(BoxesRunTime.boxToInteger(1), "jone", BoxesRunTime.boxToDouble(99.989999999999995D), BoxesRunTime.boxToCharacter('s'));
     *
     * */
    println("==========================================")
    //2.访问元组
    println(tuple01._1) //使用 _1访问第一个元素,从1开始

    /*  override def productElement(n: Int) = n match {
    case 0 => _1
    case 1 => _2
    case 2 => _3
    case 3 => _4
    case _ => throw new IndexOutOfBoundsException(n.toString())
 }*/
    println(tuple01.productElement(2)) //使用productElement(下标，从0开始)访问元素

    println("==========================================")
    //3.遍历元组
    for (i <- tuple01.productIterator) {
      println(i)
    }
  }
}
