package com.atguigu.chapter07.myabstract

object BankDemo {
  def main(args: Array[String]): Unit = {
    val account = new Account("62270015","123456" ,1000 )
    account.query("62270015", "123456")
    println()
    account.withDrawal("62270015", "123456", 100)
    println()
    account.deposit("62270015", "123456", 100)

  }
}

//编写一个Account类
class Account(inAccount: String, inPassword: String,inBalance: Double) {
  //属性
  val accountNo: String = inAccount
  var balance: Double = inBalance
  var password: String = inPassword

  //方法

  //查询
  def query(accountNo: String, password: String): Unit = {
    if (!this.password.equals(password) || !this.accountNo.equals(accountNo)) {
      println("账号或密码错误！")
      return //return有终止程序的作用，所以不能拿掉
    }
    printf("账号为%s 当前余额是%.2f", this.accountNo, this.balance)
  }

  //取款
  def withDrawal(accountNo: String, password: String, money: Double): Any = {
    if (!this.password.equals(password) || !this.accountNo.equals(accountNo)) {
      println("账号或密码错误！")
      return //return有终止程序的作用，所以不能拿掉
    }
    if (money > this.balance) {
      println("余额不足！")
      return //return有终止程序的作用，所以不能拿掉
    }
    this.balance -= money
    money
    printf("取了%.2f元,还剩%.2f元", money,this.balance )
  }

  //存款
  def deposit(accountNo: String, password: String, money: Double): Any = {
    if (!this.password.equals(password) || !this.accountNo.equals(accountNo)) {
      println("账号或密码错误！")
      return //return有终止程序的作用，所以不能拿掉
    }
    this.balance += money
    money
    printf("存了%.2f元,还剩%.2f元", money,this.balance )
  }
}
