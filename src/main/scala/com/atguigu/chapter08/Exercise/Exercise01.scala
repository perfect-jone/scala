package com.atguigu.chapter08.Exercise

/**
  * 1、编写一个Conversions对象，加入 inchesToCentimeters,gallonsToLiters 和 milesToKilometers 方法
  * 1 in = 2.54 cm;1 us gal = 3.7854 l;1 m =0.001 km
  */
object Exercise01 {
  def main(args: Array[String]): Unit = {

    val conversions = new Conversions
    conversions.inchesToCentimeters(10)
    conversions.gallonsToLiters(5)
    conversions.milesToKilometers(2000)
  }
}

class Conversions {

  def inchesToCentimeters(inches: Double): Unit = {
    val centimeters = 2.54 * inches
    printf("%.2f in = %.2f cm \n", inches, centimeters)
  }

  def gallonsToLiters(gallons: Double): Unit = {
    val liters = 3.7854 * gallons
    printf("%.2f us gal = %.2f l \n", gallons, liters)
  }

  def milesToKilometers(miles: Double): Unit = {
    val kilometers = 0.001 * miles
    printf("%.2f m = %.2f km \n", miles, kilometers)
  }
}
