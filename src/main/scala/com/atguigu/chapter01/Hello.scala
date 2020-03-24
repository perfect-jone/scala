package com.atguigu.chapter01

/*
* 常用快捷键：
* Ctrl+X  剪切
* Ctrl+D  复制当前行到下一行
* Ctrl+Y  删除
* Ctrl+Alt+L  格式化
* Ctrl+Shift+F10  运行代码
* Ctrl+F12  查看当前类的所有方法
* Ctrl+P  查看方法提示
* Ctrl+Shift+Enter  自动补全
* Crrl+W  选择当前光标位置单词并扩大
* Crrl+Shift+W  选择当前光标位置单词并
* Shift+Shift 查找当前项目中的任何文件
* psvm  java main函数快捷键
*/

object Hello {
  def main(args: Array[String]): Unit = {
    //println("\"hello\"")  //常用五种转义字符：\t \n \r \" \\
    var str1: String = "hello"
    var str2: String = "world"
    //println(str1 + str2)

    var name: String = "jone"
    var age: Int = 28
    var sal: Float = 7070.173f
    var height: Double = 57.57
    var nums: Long = 10000l
    //printf("姓名是%s 年龄是%d 工资是%.3f 身高是%.2f 人数是%d", name, age, sal, height, nums)
    //println(s"个人信息如下:\n姓名$name\n年龄$age\n工资$sal")
    //println(s"个人信息如下:\n姓名${name + "pating"}\n年龄${age - 10}\n工资${sal * 10}")

  }
}
