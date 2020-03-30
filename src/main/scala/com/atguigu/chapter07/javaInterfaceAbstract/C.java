package com.atguigu.chapter07.javaInterfaceAbstract;

public abstract class C {
    public static void main(String[] args) {
        C c = new C(){
            //java匿名子类
            @Override
            public void sleeping() {
                System.out.println("I love sleeping!");
            }
        };
        c.sleeping();
    }

    public String name = "jone";

    //接口中既有抽象方法，也有非抽象方法，抽象方法必须用abstract修饰
    public abstract void sleeping();

    public void looking() {
        System.out.println("looking");
    }
}
