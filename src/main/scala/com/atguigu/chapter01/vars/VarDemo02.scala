package com.atguigu.chapter01.vars

object VarDemo02 {
  def main(args: Array[String]): Unit = {
    var age = 10
    //如何证明age是Int类型
    //1.利用idea的提示
    //2.age.isInstanceOf[Int]
    //println(age.isInstanceOf[Int])

    //age = 13.6F  一旦类型确定之后，只能改变数值，不能改变类型（强数据类型语言，也叫静态语言）
    //println(age)

    //在声明或者定义一个变量时，可以使用var或者val来修饰，var修饰的变量可以改变，val修饰的变量不可改变
    var num = 10
    num = 30
    val sal = 10
    //println(sal)

    //scala的设计者为什么设计 var 和 val ?
    //1.在实际编程中，我们更多的需求是获取、创建一个对象后，读取该对象的属性，或者修改对象的属性值,但是很少改变这个对象本身
    // dog = new Dog() dog.age = 10  dog = new Dog() 这时，我们就可以使用val
    //2.因为val 没有线程安全问题，因此效率高，scala设计者推荐我们使用val
    //3.如果对象需要改变，则使用var

    val dog = new Dog()
    //dog = new Dog       报错，显示Reassignment to val，val重新赋值错误
    dog.age = 90
    dog.name = "小花"
  }
}

class Dog {
  //声明一个age,给了一个默认值_，即0
  var age: Int = _
  //声明一个name"
  var name: String = ""
}
