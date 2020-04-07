package com.atguigu.chapter10

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

//scala集合和java集合互换
object ArrayBuffer2JavaList {
  def main(args: Array[String]): Unit = {

    // scala的ArrayBuffer 转成 java的List
    val arr = ArrayBuffer("1", "2", "3")
    println(arr)

    /*implicit def bufferAsJavaList[A](b : scala.collection.mutable.Buffer[A]) : java.util.List[A] = { /* compiled code */ }*/
    import scala.collection.JavaConversions.bufferAsJavaList
    val javaArr = new ProcessBuilder(arr)

    /*    public ProcessBuilder(List<String> command) {
      if (command == null)
          throw new NullPointerException();
      this.command = command;
  }*/
    val javaList = javaArr.command()
    println(javaList)


    //  java的List 转成 scala的ArrayBuffer
    /*implicit def asScalaBuffer[A](l : java.util.List[A]) : scala.collection.mutable.Buffer[A] = { /* compiled code */ }*/
    import scala.collection.JavaConversions.asScalaBuffer
    val scalaArr: mutable.Buffer[String] = javaList
    scalaArr.append("4")
    println(scalaArr)

  }
}
