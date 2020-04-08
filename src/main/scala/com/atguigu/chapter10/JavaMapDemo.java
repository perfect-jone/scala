package com.atguigu.chapter10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class JavaMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "小明");
        hashMap.put(2, "小红");
        hashMap.put(3, "小周");
        hashMap.put(4, "小黑");
        hashMap.put(5, "小花");

        System.out.println("================1. 增强for循环+keySet()==================");
        for (int i : hashMap.keySet()) {
            System.out.print(hashMap.get(i) + "\t");
        }
        System.out.println();

        System.out.println("================2. 增强for循环+entrySet()==================");
        for (Map.Entry entry : hashMap.entrySet()) {
            System.out.print(entry.getValue() + "\t");
        }
        System.out.println();

        System.out.println("================3. Iterator+keySet()==================");
        Iterator iterator = hashMap.keySet().iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = hashMap.get(key);
            System.out.print(value + "\t");
        }
        System.out.println();

        System.out.println("================4. itorator+entrySet()==================");
        Iterator iterator2 = hashMap.entrySet().iterator();
        while (iterator2.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator2.next();
            entry.getKey();
            entry.getValue();
            System.out.print(entry.getValue() + "\t");
        }

    }
}
