package com.atguigu.chapter08.mixin

//声明对象时混入
object AddTraits02 {
  def main(args: Array[String]): Unit = {
    //声明对象时混入:class FF extends EE with CC with DD
    //把class FF extends EE with CC with DD当做一个整体
    //EE
    //AA
    //BB
    //CC
    //DD
    //FF
    val ff = new FF

    println("=============================")

    //构建对象时混入:
    //先创建val kk = new KK这个对象
    //EE
    //KK
    //AA
    //BB
    //CC
    //DD
    val kk = new KK with CC with DD
  }
}

trait AA {
  println("AA")
}

trait BB extends AA {
  println("BB")
}

trait CC extends BB {
  println("CC")
}

trait DD extends BB {
  println("DD")
}

class EE {
  println("EE")
}

class FF extends EE with CC with DD {
  println("FF")
}

class KK extends EE {
  println("KK")
}
