

/**
  * 1.package com.atguigu{}表示创建了包com.atguigu,在{}中可以继续写它的子包scala,com.atguigu.scal,还可以写类，特质trait,object
  * 2.scala支持在一个文件中，可以同时创建多个包，包中有包，但建议最好不要超过3层，以及给各个包创建类,trait,object
  * 3.作用域原则：可以直接向上访问，大括号体现作用域,scala中子包直接访问父包中的内容,java访问父类需要import
  * 4.父包要访问子包时，需要import对应的类
  * 5.包名可以用相对路径也可以用绝对路径，包名冲突时可以用绝对路径解决
  * 6.包对象：包中不可以直接写方法或定义变量，为了弥补Java虚拟机的不足，scala中引入了包对象的概念
  */


package com.atguigu {

  class User {}

  object Test2 {
    def main(args: Array[String]): Unit = {
      import com.atguigu.scala.Person
      val person = new Person
      println(person.name)
    }
  }

  package scala2 {

    class User2 {}

  }

  //1.包对象：包中不可以直接写方法或定义变量，为了弥补Java虚拟机的不足，scala中引入了包对象的概念
  //2.package object scala表示创建一个包对象scala,是com.atguigu.scala包对应的包对象,和com.atguigu.scala是平级的关系
  //3.每一个包都可以有一个对象，包对象的名字和包一致
  //4.在包对象中定义的变量和方法，就可以在对应的包中使用
  package object scala {
    val name = "Bob"

    def sayHi(): Unit = {
      println("package object scala sayHi～")
    }
  }
  package scala {

    //com.atguigu.scala
    object Test {
      def main(args: Array[String]): Unit = {
        println("ok")
        //1.如果有同名的类，采用就近原则来使用内容
        //2.如果需要使用父类的包，则指定路径即可
        val user = new User
        val user2 = new com.atguigu.User
        println(user)
        println(user2)
        println("使用name=" + name)
        sayHi()
      }
    }

    class User {}

    class Person {
      val name = "Jone"
      println(name)
      sayHi()

      def paly(message: String): Unit = {
        println(this.name + " " + message)
      }
    }

  }

}

