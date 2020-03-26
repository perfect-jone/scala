package com.atguigu.chapter07.javapackage;

/**
 * java包的三大作用：
 * 1.区分相同的类名
 * 2.管理众多的类
 * 3.控制访问范围
 * 包的本质就是分不同的文件夹来保存文件
 */
public class TestTiger {
    public static void main(String[] args) {
        com.atguigu.chapter07.javapackage.xm.Tiger tiger01 = new com.atguigu.chapter07.javapackage.xm.Tiger();
        com.atguigu.chapter07.javapackage.xh.Tiger tiger02 = new com.atguigu.chapter07.javapackage.xh.Tiger();
        System.out.println("tiger01="+tiger01+"\ttiger02="+tiger02);
    }
}
