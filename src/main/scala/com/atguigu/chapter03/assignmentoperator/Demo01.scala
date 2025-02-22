package com.atguigu.chapter03.assignmentoperator

object Demo01 {
  def main(args: Array[String]): Unit = {
    var n = 2
    //n <<= 2 //左移后赋值    0000 0010 ==> 0000 1000
    //n >>= 2 //右移后赋值    0000 0010 ==> 1000 0000
    //n &= 2 //按位与后赋值
    /**
      * 0000 0010
      * 0000 0010
      * &__________
      * 0000 0010
      **/

    //n ^= 2 //按位异或后赋值:有且仅有一个数为1时，才为1，其余都为0
    /**
      * 0000 0010
        0000 0010
      ^__________
        0000 0000
      */

    //n |= 2 //按位或后赋值:最少有一个数为1时，为1，其余为0
    /**
      * 0000 0010
      * 0000 0010
      * |__________
      * 0000 0010
      **/


    /**
      * 原码反码补码
      * 正数的原码反码补码都一样，0的原码反码补码都为0
      * 负数的反码：符号位不变，其余按照原码的符号位取反
      * 负数的补码：在补码的基础上加1
      *
      * -2 原码：1000 0010
      *    反码：1111 1101
      *    补码：1111 1110
      */
    println(n)
  }
}
