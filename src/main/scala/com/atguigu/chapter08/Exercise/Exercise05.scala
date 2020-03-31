package com.atguigu.chapter08.Exercise

/**
  * 1、扩展如下的BankAccount类，新类CheckingAccount对每次存款和取款都收取1美元的手续费
  * class BankAccount(initialBalance:Double){
  * private var balance = initialBalance
  * def deposit(amount:Double) = { balance += amount; balance}
  * def withdraw(amount:Double) = {balance -= amount; balance}
  * }
  */
object Exercise05 {
  def main(args: Array[String]): Unit = {
    val account = new CheckingAccount(99.36)
    val a = account.deposit(100.00)
    val b = account.withdraw(100.00)
    println(a)
    println(b)

  }
}

class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def deposit(amount: Double) = {
    balance += amount;
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount;
    balance
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  override def deposit(amount: Double) = {
    super.deposit(amount - 1)
  }

  override def withdraw(amount: Double) = {
    super.withdraw(amount + 1)
  }
}
