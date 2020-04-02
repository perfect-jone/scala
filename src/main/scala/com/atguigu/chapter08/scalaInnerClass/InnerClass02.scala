package com.atguigu.chapter08.scalaInnerClass

object InnerClass02 {
  def main(args: Array[String]): Unit = {
    val father1 = new Father
    val father2 = new Father
    val son1 = new father1.Son
    val son2 = new father2.Son
    son2.info()
    son1.test(son1)
    son2.test(son1)
  }
}

class Father {


/*  class Son {
    def info(): Unit ={

      //注意是用Father.this访问一般属性和私有属性
      println(Father.this.name+"\t"+Father.this.age)
    }
  }*/
  myoutter =>   //第二种访问外部类属性的方式，给类整体起别名，推荐使用
  class Son {
    def info(): Unit ={

      //注意是用Father.this访问一般属性和私有属性
      println(myoutter.name+"\t"+myoutter.age)
    }

    //类型投影：在方法声明上，如果使用外部类#内部类的方式，表示忽略内部类的对象关系，即忽略对象的创建方式，只考虑类型
    def test(son: Father#Son): Unit ={
      println(son)
    }

  }
  var name = "马丁奥德斯基"
  private var age = 50
}
