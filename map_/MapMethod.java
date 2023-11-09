package com.hspedu.map_;

import java.util.HashMap;
import java.util.Map;

public class MapMethod {
    public static void main(String[] args) {

        //演示map 接口常用方法

        Map map = new HashMap();
        map.put("A",new Book("",100));
        map.put("A","a"); //替换
        map.put("B","b");
        map.put("C","c");
        map.put("D",null);
        map.put(null,"e");
        map.put("F","f");

        System.out.println("map=" + map);

        //remove: 根据key键删除映射关系
        map.remove(null);
        System.out.println("map=" + map);

        //get: 根据key键获取值
        Object val = map.get("B");
        System.out.println("val=" + val);

        //size: 获取元素个数
        System.out.println("k-v=" + map.size());

        //isEmpty: 判断个数是否为0
        System.out.println(map.isEmpty());

        //clear: 清空
        map.clear();
        System.out.println("map=" + map);

        //containskey: 查找键是否存在
        System.out.println(map.containsKey("hsp"));



    }
}

class Book {
    private String name;
    private int num;

    public Book(String name, int num) {
        this.name = name;
        this.num = num;
    }
}
