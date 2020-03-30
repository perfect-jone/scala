package com.atguigu.chapter08

/**
  * 1.在同一个文件中，class ScalaPerson 称为伴生类，写非静态的内容；object ScalaPerson 称为伴生对象，写静态内容，两者必须同名
  * 2.class ScalaPerson编译后底层生成ScalaPerson.class， object ScalaPerson生成ScalaPerson$.class
  * 3.对于伴生对象的内容，因为是static的，所以属于类，可以用ScalaPerson$.MODULE$.sex()【属性】和ScalaPerson$.MODULE$.laugh()【方法】调用
  */
object accompanyObject {
  def main(args: Array[String]): Unit = {
    println(ScalaPerson.sex)
    ScalaPerson.laugh()
  }
}

class ScalaPerson {
  var name: String = ""
}

object ScalaPerson {
  var sex: Boolean = true

  def laugh(): Unit = {
    println("haha...:)")
  }
}

/*

  public final class ScalaPerson$ {

  //就是ScalaPerson$的一个对象
  public static final MODULE$;
  private boolean sex;

  //静态代码块，静态代码块最先执行：静态代码块->代码块->构造方法
  static {
    new ();
  }

  public boolean sex() {
    return this.sex;
  }
  public void sex_$eq(boolean x$1) {
    this.sex = x$1;
  }
  public void laugh() {
    Predef..MODULE$.println("haha...:)");
  }

  //构造器私有化，不让外界创建对象
  private ScalaPerson$() {
    MODULE$ = this;
    this.sex = true;
  }
}

*/
