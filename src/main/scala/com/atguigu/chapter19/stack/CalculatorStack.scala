package com.atguigu.chapter19.stack

import util.control.Breaks._

object CalculatorStack {
  def main(args: Array[String]): Unit = {
    /*
    思路
    1 ) 设计两个栈 , 数栈，符号栈
    2) 对 exp 进行扫描 , 一个一个的取出
    3) 当取出的字符是数时，就直接入数栈
    4) 当取出的字符是符号时
    4.1 如果当前符号栈没有数据，就直接入栈
    4.2 如果当前符号的优先级 小于等于符号栈的栈顶的符号的优先级，则取出该符号，并从数栈依次 pop 出两
        个数据，进行运算，将结果重新 puhs 到 数栈，再将当前符号 push 到符号栈
    4.3 反之，符号直接入符号栈
    5) 当整个表达式扫描完毕后，依次从数栈和符号栈取出数据，进行运行，最后在数栈中的数据就是结果.
*/
    val expression = "3+2*6-2"
    var index = 0
    var ch = ' '
    val numStack = new ArrayStack2(10)
    val operStack = new ArrayStack2(10)
    breakable {
      while (true) {
        val ch = expression.substring(index, index + 1)(0)
        if (operStack.isOper(ch)) { //如果是操作符
          if (!operStack.isEmpty()) {
            //如果当前符号的优先级 小于等于 符号栈的栈顶的符号的优先级，则取出该符号，并从数栈依次 pop 出两
            //个数据，进行运算，将结果重新 puhs 到 数栈，再将当前符号 push 到符号栈
            if (operStack.priority(ch) <= operStack.priority(operStack.stack(operStack.top))) {
              //弹出数栈的两个数据和符号栈的符号
              val oper = operStack.pop().toString.toInt
              val n1 = numStack.pop().toString.toInt
              val n2 = numStack.pop().toString.toInt
              //计算结果
              val res = numStack.cal(n1, n2, oper)
              //把计算结果入栈
              numStack.push(res)
              //把当前符号入栈
              operStack.push(ch)
            } else {
              operStack.push(ch)
            }
          } else {
            operStack.push(ch)
          }
        } else { //如果是数,直接入栈
          numStack.push(ch.toString.toInt)
        }
        //index后移
        index += 1
        if (index >= expression.length) {
          break() //终止while循环
        }
      }
    }

    //当整个表达式扫描完毕后，依次从数栈和符号栈取出数据，进行运行，最后在数栈中的数据就是结果.
    breakable {
      while (true) {
        if (operStack.isEmpty()) {
          break() // 终止while循环
        }
        //开始运算
        //弹出数栈的两个数据和符号栈的符号
        val oper = operStack.pop().toString.toInt
        val n1 = numStack.pop().toString.toInt
        val n2 = numStack.pop().toString.toInt
        //计算结果
        val calNum = numStack.cal(n1, n2, oper)
        val res = numStack.push(calNum)

      }
    }
    val res2 = numStack.pop()
    printf("表达式:%s=%d\n", expression, res2)
  }
}

class ArrayStack2(size: Int) {
  //使用数据模拟栈
  val maxSize = size
  val stack = new Array[Int](maxSize)
  var top = -1

  //栈空
  def isEmpty(): Boolean = {
    top == -1
  }

  //栈满
  def isFull(): Boolean = {
    top == maxSize - 1
  }

  //入栈
  def push(value: Int): Unit = {
    if (isFull()) {
      println("栈满")
      return
    }
    top += 1
    stack(top) = value
  }

  //出栈
  def pop(): Any = {
    if (isEmpty()) {
      return new Exception("栈空")
    }
    val value = stack(top)
    top -= 1
    return value
  }

  //遍历栈
  def list(): Unit = {
    if (isEmpty()) {
      println("栈空,没有数据")
      return
    }
    for (i <- 0 to top reverse) {
      printf("stack(%d)=%d\n", i, stack(i))
    }
  }

  //优先级的方法，数值越大，优先级越高
  def priority(oper: Int): Int = {
    if (oper == '+' || oper == '-') 0
    else if (oper == '*' || oper == '/') 1
    else -1 //不处理
  }

  //运算的方法
  def cal(n1: Int, n2: Int, oper: Int): Int = {
    oper match {
      case '+' => n1 + n2
      case '-' => n2 - n1
      case '*' => n1 * n2
      case '/' => n2 / n1
    }
  }

  //判断是否运算符
  def isOper(oper: Int): Boolean = {
    oper == '+' || oper == '-' || oper == '*' || oper == '/'
  }
}
