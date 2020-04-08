package com.atguigu.chapter10;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class JavaMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<Integer, String>();
        hashMap.put(1, "小明");
        hashMap.put(2, "小红");
        hashMap.put(3, "小周");
        hashMap.put(4, "小黑");
        hashMap.put(5, "小花");
        //hashMap.put(null,null); HashMap的键值对可以全为null，但必须键值对都是String类型才能遍历
        System.out.println(hashMap.entrySet());//[1=小明, 2=小红, 3=小周, 4=小黑, 5=小花]
        System.out.println(hashMap.keySet());//[1, 2, 3, 4, 5]

        //foreach循环
        /**
         * for(元素类型 t 元素变量 x : 遍历对象 obj){
         *      循环体
         * }
         */

        System.out.println("================1. 增强for循环+keySet()==================");
        for (int i : hashMap.keySet()) {
            System.out.print(hashMap.get(i) + "\t");
        }
        System.out.println();

        System.out.println("================2. 增强for循环+entrySet()==================");
        for (Map.Entry<Integer,String> entry : hashMap.entrySet()) {
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
            // Object next = iterator2.next();所有需要强转为Map.Entry<Integer,String>
            Map.Entry<Integer,String> entry = (Map.Entry<Integer,String>) iterator2.next();
            entry.getKey();
            entry.getValue();
            System.out.print(entry.getValue() + "\t");
        }

    }
}
