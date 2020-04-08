package com.atguigu.chapter10;

import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Iterator;

public class JavaListDemo {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 11;
        String[] names = {"jone", "Ordefsky", "Gosling"};
        //System.out.println(nums[0]+ " " + names[2]);

        ArrayList<String> list = new ArrayList<String>();

        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");
        list.add("Sunday");
        // 3种遍历方式
        System.out.println("===========1、for循环==================");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "\t");
        }
        System.out.println();

        System.out.println("===========2、增强for循环==============");
        for (String i : list) {
            System.out.print(i + "\t");
        }
        System.out.println();

        System.out.println("===========3、Iterator 迭代器==========");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+"\t");
        }
    }
}
