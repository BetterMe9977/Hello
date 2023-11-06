package com.hspedu.list_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListExercise {
    public static void main(String[] args) {
        List list = new ArrayList();
        for (int i = 0; i < 12; i++) {
            list.add("hello" + i);
        }
        System.out.println("list=" + list);

        //在2号位插入一个元素“韩顺平教育”
        list.add(1,"韩顺平教育");
        System.out.println("list=" + list);

        //获得第5个元素
        System.out.println("第5个元素=" + list.get(4));

        //删除第6个元素
        list.remove(5);
        System.out.println("list=" + list);

        //修改第7个元素
        list.set(6,"三国演义");
        System.out.println("list=" + list);

        //使用迭代器遍历集合
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            Object obj = iterator.next();
            System.out.println("obj=" + obj);
        }


    }
}
