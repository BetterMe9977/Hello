package com.hspedu.collection_;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionFor {
    public static void main(String[] args) {

        Collection col = new ArrayList();

        col.add(new CollectionIterator.Book("三国演义", "罗贯中", 10.1));
        col.add(new CollectionIterator.Book("小李飞刀", "古龙", 5.1));
        col.add(new CollectionIterator.Book("红楼梦", "曹雪芹", 34.6));

        //使用增强for
        //增强for底层仍然是迭代器iterator
        //快捷键 I
        for (Object book : col) {
            System.out.println("book=" + book);
        }
        //增强for，也可以直接在数组使用
        int[] nums = {1,8,10,90};
        for (int i : nums) {
            System.out.println("i=" + i);
        }


    }
}
