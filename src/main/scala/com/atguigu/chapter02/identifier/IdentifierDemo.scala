package com.atguigu.chapter02.identifier

object IdentifierDemo {
  def main(args: Array[String]): Unit = {

    //标识符也可以是操作符，但前提必须首尾字符都是操作符,++ ==> $plus$plus
    val ++ = "hello,world!"
    //println(++)

    val -+ = 90
    //println(-+)

    //39个关键字也可以做标识符，但前提必须加反引号(Esc下面那个按键)
    var `true` = "true"
    var `def` = "def"
    var Int = "int"//预定义标识符，不是关键字，但是不推荐使用
    var _ = "jack"//不能使用 _ 作为标识符，因为有很多其他的作用
    //println(`def`)
    //println(_)


    //包命名规范和java一样：com.公司名.项目名.模块名
    //scala的关键字有39个
    /**
      * package,import,class,object,trait,extends,with,type,forSome,private,protected,abstract,sealed,final,implicit
      * lazy,override,try,catch,finally,throw,if,else,match,case,do,while,for,return,yield,def,val,var,this,super,new,true,false,null
      */
  }
}
