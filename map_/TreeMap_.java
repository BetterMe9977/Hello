package com.hspedu.map_;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMap_ {
    public static void main(String[] args) {

        //使用默认的构造器每创建TreeMap , 是无序的（没有排序）
        //TreeMap treeMap = new TreeMap();
        TreeMap treeMap = new TreeMap(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //按照 k(String) 的大小排序
                //return ((String)o1).compareTo((String)o2);

                //按照 k(String) 的长度 大小排序
                return ((String)o1).length() - ((String)o2).length();
            }
        });

        treeMap.put("jack", "杰克");
        treeMap.put("tom", "汤姆");
        treeMap.put("kristina", "克瑞斯缇娜");
        treeMap.put("smith", "史密斯");
        treeMap.put("cat", "小花猫");//cat 不能加进， value 替换


        System.out.println("treeMap=" + treeMap);

    }
}
