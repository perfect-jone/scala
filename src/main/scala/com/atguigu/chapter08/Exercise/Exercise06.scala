package com.atguigu.chapter08.Exercise

/**
  * 2、扩展前一个练习的BankAccount类，新类SavingsAccount每个月都有利息产生(earnMonthlyInterest方法被调用)，
  *    并且有每月三次免手续费的存款或取款。在earnMonthlyInterest方法中重置交易计数。
  */
object Exercise06 {
  def main(args: Array[String]): Unit = {
    val account = new SavingsAccount(99.99)
    account.earnMonthlyInterest()
    account.deposit(100)
    account.deposit(100)
    account.deposit(100)

    println(account.deposit(100))
  }
}

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance: Double){
  private var num:Int = _

  def earnMonthlyInterest()={
    num = 3
    super.deposit(1)
  }

  override def deposit(amount: Double): Double = {
    num -= 1
    if(num < 0) super.deposit(amount - 1) else super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    num -= 1
    if (num < 0) super.withdraw(amount + 1) else super.withdraw(amount)
  }
}