package com.atguigu.chapter06.constructor;

public class JavaDemo {
    public static void main(String[] args) {

    }
}

class AAA{
    public AAA(){
        //调用AAA(String name)
        this("AAA");
        System.out.println("AAA()");
    }
    public AAA(String name){
        super();
    }
}
