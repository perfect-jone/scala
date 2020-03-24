package com.atguigu.chapter06


object Cat {
  def main(args: Array[String]): Unit = {
    val cat = new Cat
    //在scala底层,cat.name 其实就是cat.name_$eq(),对应的是java中的setter方法
    cat.name = "小白"
    cat.age = 8
    cat.color = "白色"
    ////在scala底层,cat.name 其实就是cat.name(),对应的是java中的getter方法
    println("ok")
    printf("小猫的信息如下：%s %d %s",cat.name,cat.age,cat.color)
  }
}

class Cat {
  //在scala底层，属性被private修饰
  var name: String = ""
  var age: Int = _
  var color: String = ""
}

/*
public class Cat
{
  private String name = "";
  private int age;
  private String color = "";

  public static void main(String[] paramArrayOfString)
  {
    Cat..MODULE$.main(paramArrayOfString);
  }

  public String name()
  {
    return this.name; }
  public void name_$eq(String x$1) { this.name = x$1; }
  public int age() { return this.age; }
  public void age_$eq(int x$1) { this.age = x$1; }
  public String color() { return this.color; }
  public void color_$eq(String x$1) { this.color = x$1; }

}





public final class Cat$
{
  public static final  MODULE$;

  static
  {
    new ();
  }

  public void main(String[] args)
  {
    Cat cat = new Cat();

    cat.name_$eq("小白");
    cat.age_$eq(8);
    cat.color_$eq("白色");
    Predef..MODULE$.printf("小猫的信息如下：%s %d %s", Predef..MODULE$.genericWrapArray(new Object[] { cat.name(), BoxesRunTime.boxToInteger(cat.age()), cat.color() }));
  }

  private Cat$() {
    MODULE$ = this;
  }
}
 */