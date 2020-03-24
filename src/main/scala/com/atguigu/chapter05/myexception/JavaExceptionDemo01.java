package com.atguigu.chapter05.myexception;

public class JavaExceptionDemo01 {
    public static void main(String[] args) {
        try {
            int i = 0;
            int b = 10;
            int c = b / i;

        } catch(ArithmeticException ex){
            ex.printStackTrace();
        }catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("java finally");
        }
    }
}
