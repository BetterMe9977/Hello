package com.hspedu.list_;

import java.util.ArrayList;

public class ArrayListSource {
    public static void main(String[] args) {
        //解读源码

        //使用无参构造器创建ArrayList对象
        ArrayList list = new ArrayList();
        //ArrayList list = new ArrayList(8);

        //使用for循环给list集合添加 1-10 数据
        for (int i = 0; i < 10; i++) {
            list.add(i);
        }

        //使用for循环给list集合添加 11-15 数据
        for (int i = 11; i <= 15; i++) {
            list.add(i);
        }
        list.add(100);
        list.add(200);
        list.add(null);
    }
}
