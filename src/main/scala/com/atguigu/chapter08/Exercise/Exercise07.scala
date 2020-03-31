package com.atguigu.chapter08.Exercise

/**
  * 3、设计一个Point类，其x和y坐标可以通过构造器提供。提供一个子类LabeledPoint，
  * 其构造器接受一个标签值和x,y坐标,比如:new LabeledPoint(“Black Thursday”,1929,230.07)
  */
object Exercise07 {
  def main(args: Array[String]): Unit = {
    val point = new LabelePoint("Black Thursday",1929,230.07)
    println(point)
  }
}

class Point(x: Double, y: Double) {

}

class LabelePoint(labele: String,x: Double, y: Double) extends Point(x,y) {

}
