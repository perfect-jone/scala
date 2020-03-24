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


* Shift+Shift 查找当前项目中的任何文件
* Shit+Alt+↓ 当前行和下一行切换位置
* Ctrl+Alt+T  try catch if for while快捷键
*
* psvm  java main函数快捷键
* sout  java 打印输出快捷键
* Ctrl+Alt+A  git add添加至暂存区
* Ctrl+K      git commit提交至本地版本库
* Ctrl+Shift+K  git push推送到远程库
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
