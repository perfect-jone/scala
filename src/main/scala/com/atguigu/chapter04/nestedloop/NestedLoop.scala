package com.atguigu.chapter04.nestedloop

import scala.io.StdIn

object NestedLoop {
  def main(args: Array[String]): Unit = {
    /**
      * 1.统计三个班成绩情况，每个班5人，求各个班和所有班的平均分，成绩从键盘输入
      * 2.统计三个班及格人数
      * 3.打印出九九乘法表
      */

    /*//1.classNum表示班级个数,stuNum表示学生个数,classScore表示各个班级总分,totalScore表示所有班总分,score表示学生成绩
    val classNum = 3
    val stuNum = 5
    var score = 0.0
    var classScore = 0.0
    //班级总分
    var totalScore = 0.0 //所有班级总分
    for (i <- 1 to classNum) {
      //先将classScore清零
      classScore = 0.0
      for (j <- 1 to stuNum) {
        printf("请输入第%d班级的第%d个学生的成绩", i, j)
        score = StdIn.readDouble()
        classScore += score
      }
      totalScore += classScore
      printf("第%d班级的平均分为%.2f\n", i, classScore / stuNum)
    }
    printf("所有班级的平均分为%.2f", totalScore / (classNum * stuNum))
*/

    //3.打印出九九乘法表

    for (i <- 1 to 9) { //确定行数
      for (j <- 1 to i) {
        //确定列数
        printf("%d * %d = %d\t", j, i, i * j)
      }
      println()
    }
  }
}
