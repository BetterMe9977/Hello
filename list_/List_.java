package com.hspedu.list_;

import java.util.ArrayList;
import java.util.List;

public class List_ {
    public static void main(String[] args) {


        //List 集合类中元素有序（即添加顺序和取出顺序一致） 且可重复
        List list = new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("mary");
        list.add("hsp");
        list.add("tom");
        System.out.println("list=" + list);

        //2. List集合中每个元素都有对应索引，支持索引
        // 索引从0开始
        System.out.println(list.get(3));


    }
}
