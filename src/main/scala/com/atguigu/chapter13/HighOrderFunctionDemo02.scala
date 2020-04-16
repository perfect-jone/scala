package com.atguigu.chapter13

object HighOrderFunctionDemo02 {
  def main(args: Array[String]): Unit = {

    // 1.minusxy是高阶函数，因为它返回匿名函数
    // 2.返回的匿名函数是(y: Int) => x - y
    def minusxy(x: Int) = {
      (y: Int) => x - y
    }
    val res = minusxy(4)(3) //函数的柯里化
    //比如有这么个需求：某个公司有200人，需要筛选出年龄在20到30之间的员工，（表名：emp；字段：id,name,age,sex,phoneNumber...),则就可以建立一个数据对象:
    //select id,name,age,sex,phoneNumber from emp where age <= 30 and age >= 20
    println(res)
  }
}
