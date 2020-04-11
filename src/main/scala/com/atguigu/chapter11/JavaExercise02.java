package com.atguigu.chapter11;

import java.util.HashMap;
import java.util.Map;

public class JavaExercise02 {
    public static void main(String[] args) {
        //使用映射集合，统计一句话中，各个字母出现的次数，并保留在Map中 HashMap<Character,Integer>()
        String sentence = "AAAAAAAAAABBBBBBBBBCCCCCCCCDDDDDDD";

        Map<Character, Integer> charCount = new HashMap<Character, Integer>();
        //将字符串类型转化成char数组
        char[] chars = sentence.toCharArray();
        for (char c : chars) {
            if (charCount.containsKey(c)) {
                //如果charCount中包含c则加1
                Integer count = charCount.get(c);
                charCount.put(c, count + 1);
            } else {
                //如果charCount中不包含c则默认为1
                charCount.put(c, 1);
            }
        }

        System.out.println(charCount);
    }
}
