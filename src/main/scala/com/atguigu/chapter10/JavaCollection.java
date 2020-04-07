package com.atguigu.chapter10;

import java.util.ArrayList;

public class JavaCollection {
    public static void main(String[] args) {
        int[] nums = new int[3];
        nums[0] = 11;

        String[] names = {"jone","Ordefsky","Gosling"};
        System.out.println(nums[0]+ " " + names[2]);

        ArrayList<String> list = new ArrayList<String>();
        //"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
        //January
        //February
        //March
        //April
        //May
        //June
        //July
        //August
        //September
        //October
        //November
        //December
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        System.out.println(list);
        System.out.println(list.hashCode());
    }
}
