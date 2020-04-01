package com.atguigu.chapter08.mixin

object MaxInDemo02 {
  def main(args: Array[String]): Unit = {
    /**
      * 理解abstract override的小技巧：
      * 当我们给某个方法增加了abstract override 后，就是明确的
      * 告诉编译器，该方法确实是重写了父特质的抽象方法，但是重写后，
      * 该方法仍然是一个抽象方法，因为没有完全实现，需要其他特质继续实现，
      * 通过混入顺序
      *
      * 当一个特质中既有抽象方法又有非抽象方法时，这种trait叫做富接口
      */

    val mother = new Mother with Daughter with Son
    //val mother2 = new Mother with Son with Daughter ×
    //val mother3 = new Mother with Son ×
    //val mother4 = new Mother with Daughter  √
    mother.run(100)
  }
}

trait Father {
  def run(time: Int)
}

trait Son extends Father {
  abstract override def run(time: Int): Unit = {
    println("i like running")
    super.run(time)
  }
}

trait Daughter extends Father {
  def run(time: Int): Unit = {
    println("i hit running")
  }
}

class Mother {

}
