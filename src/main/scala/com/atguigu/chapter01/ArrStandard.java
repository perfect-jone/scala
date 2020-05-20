package com.atguigu.chapter01;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 初始序列：    [89,97,67.92,00,45,88,99]
 * 参考输出序列：[1945,1967,1988,1989,1992,1997,1999,2000]
 */
public class ArrStandard {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("89");
        list.add("97");
        list.add("67.92");
        list.add("00");
        list.add("45");
        list.add("88");
        list.add("99");
        //初始序列
        System.out.println("初始序列:\t" + list);

        //拿到67.92后根据"."来分割，得到67 和 92,list集合中删除67.92，加入67和92
        String[] split = list.get(2).split("\\.");
        list.remove(2);
        list.add(split[0]);
        list.add(split[1]);

        //创建一个新集合newList，用来存放处理后的数据
        ArrayList<String> newList = new ArrayList<String>();
        for (String i : list) {
            String year = "";
            if (i == "00") { //如果是00年，则将20和00拼接成年份
                year = "20" + i;
                newList.add(year);
            } else {  //否则就是20世纪出生的，将19和i 拼接成年份
                year = "19" + i;
                newList.add(year);
            }
        }
        //对newList中的数据进行升序排序
        Collections.sort(newList);
        //参考输出序列
        System.out.println("参考输出序列:\t" + newList);
    }
}
