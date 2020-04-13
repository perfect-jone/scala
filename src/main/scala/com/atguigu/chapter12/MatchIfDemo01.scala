package com.atguigu.chapter12

object MatchIfDemo01 {
  def main(args: Array[String]): Unit = {
    for (ch <- "+-3!") {

      var sign = 0
      var digit = 0

      //范围判断
      ch match {
        case '+' => sign = 1
        case '-' => sign = -1
        //如果case 后有条件守卫即if，那么这时的 _不表示默认匹配
        case _ if ch.toString.equals("3") => digit = 3
        case _ if (ch > 1000 || ch < 100) => println("ch > 1000 || ch < 100")
        case _ => sign = 2
      }
      println(ch + "\t" + sign + "\t" + digit)
    }
  }
}
