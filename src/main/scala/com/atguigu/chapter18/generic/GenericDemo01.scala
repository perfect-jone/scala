package com.atguigu.chapter18.generic

object GenericDemo01 {


  /**
    * 请设计一个EnglishClass (英语班级类)，在创建EnglishClass的一个实例时，需要指定[ 班级开班季节(spring,autumn,summer,winter)、班级名称、班级类型]
    * 开班季节只能是指定的，班级名称为String, 班级类型是(字符串类型 "高级班", "初级班"..) 或者是 Int 类型(1, 2, 3 等)
    * 请使用泛型来完成本案例.
    *
    */

  def main(args: Array[String]): Unit = {

    val class01 = new EnglishClass[SeasonEnum.SeasonEnum, String, String](SeasonEnum.spring, "scala班", "senior高级班")
    println(class01.classSeason + "\t" + class01.className + "\t" + class01.classType)

  }
}

//用val修饰变量，该变量就变成了该类的一个可读属性
class EnglishClass[A, B, C](val classSeason: A, val className: B, val classType: C)

//用样例类，里面有toSring方法，所以不用val修饰属性
//case class EnglishClass[A, B, C](classSeason: A, className: B, classType: C)

object SeasonEnum extends Enumeration {
  type SeasonEnum = Value
  val spring, autumn, summer, winter = Value

}






