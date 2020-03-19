package com.atguigu.chapter03.arithmeticoperator


object Exercise {
  def main(args: Array[String]): Unit = {
    /**
      * 假如还有97天放假，问：还有XX个星期XX天
      */
    val days = 97
    val weekday = 97 /7
    val day = 97 % 7
    printf("统计结果是:%d个星期零%d天",weekday,day)

  }
}
