package com.hspedu.set_;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_ {
    public static void main(String[] args) {

        //无参构造器创造treeSet 时候仍是无序的
        //希望添加的元素，按照字符串大小来排序
        //使用TreeSet 提供的一个构造器，可以传入一个比较器（匿名内部类）
        //并指定排序规则
       // TreeSet treeSet = new TreeSet();
        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                //return ((String)o1).compareTo((String)o2);
                return ((String)o1).length() - ((String)o2).length();
            }
        });


        //添加数据
        treeSet.add("jack");
        treeSet.add("mary");// length()相同，不执行
        treeSet.add("tom");
        treeSet.add("sp");
        treeSet.add("o");
        treeSet.add("smith");
        treeSet.add("abc"); // length()相同，不执行


        System.out.println("treeSet=" + treeSet);
    }
}
