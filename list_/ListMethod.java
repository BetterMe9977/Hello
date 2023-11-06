package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        // void add(int index, Object ele): 在index位置插入ele元素
        //在index = 1 的位置插入一个对象
        //前面没有索引，默认加在最后
        list.add(1,"韩顺平");
        System.out.println("list=" + list);

        //boolean addAll(int index,Collection eles): 从index位置开始，将else中所有的元素添加进来
        List list2 = new ArrayList();
        list2.add("jack");
        list2.add("tom");
        list.addAll(1,list2);
        System.out.println("list=" + list);

        //0bject get(int index): 获取指定index位置的元素

        // int indexOf(Object obj): 返回obj在集合中首次出现的位置

        System.out.println(list.indexOf("tom"));

        // int lastIndexOf(Object obj): 返回obj在集合中末次出现的位置
        list.add("韩顺平");
        System.out.println("list=" + list);
        System.out.println(list.lastIndexOf("韩顺平"));

        //0bject remove(int index): 移除指定index位置的元素，并返回此元素
        list.remove(0);
        System.out.println("list=" + list);

        //0bject set(int index, Object else): 设置指定index位置的元素，相当于替换
        list.set(1,"玛丽");
        System.out.println("list=" + list);

        //List subList(int fromIndex,int toIndex): 返回从fromIndex 到 toIndex 位置的子集合
        //返回的子集合 fromIndex <= subList < toIndex
        List list1 = list.subList(0, 2);
        System.out.println("list" + list1);


    }
}
