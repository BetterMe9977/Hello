package com.hspedu.map_;

import java.util.*;

public class MapFor {
    public static void main(String[] args) {


        Map map = new HashMap();
        map.put("A",new Book("",100));
        map.put("A","a"); //替换
        map.put("B","b");
        map.put("C","c");
        map.put("D",null);
        map.put(null,"e");
        map.put("F","f");

        //先取出所有的key 通过key 取出对应的value
        Set keySet = map.keySet();

        //1) 增强for
        System.out.println("===========================");
        for (Object key : keySet) {
            System.out.println(key + "-" + map.get(key));
        }
        //2）迭代器
        System.out.println("===========================");
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            System.out.println(key + "-" + map.get(key));
        }

        //所有的value取出
        Collection values = map.values();
        //这里可以使用所有的Collections 使用的遍历方法
        //1） 增强for
        System.out.println("=======取出所有的value======");
        for (Object value : values) {
            System.out.println(value);
        }

        //2) 迭代器
        System.out.println("=======迭代器取出所有的value======");
        Iterator iterator1 = values.iterator();
        while (iterator1.hasNext()) {
            Object value = iterator1.next();
            System.out.println(value);
        }

        //通过EntrySet来获取k-v
        Set entrySet = map.entrySet(); //EntrySet<Map.Entry<k,v>>
        //1) 增强for
        System.out.println("======使用EntrySet的增强for========");
        for (Object entry : entrySet) {
            //将entry转成Map.Entry
           Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

        //2）迭代器
        System.out.println("======使用EntrySet的迭代器========");
        Iterator iterator2 = entrySet.iterator();
        while (iterator2.hasNext()) {
            Object entry = iterator2.next();
            //System.out.println(entry.getClass()); //HashMap$Node 实现 Map.Entry(getKey,getValue)

            //向下转型Map.Entry
            Map.Entry m = (Map.Entry) entry;
            System.out.println(m.getKey() + "-" + m.getValue());
        }

    }



}
