package com.hspedu.map_;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSource_ {
    public static void main(String[] args) {

        Map map = new HashMap();
        map.put("no1","hsp"); //k-v
        map.put("no2","tom");

        //
        //1. k-v最后是 HashMap$Node node = newNode(hash,key,value,null)
        //2. k-v为了方便程序员的遍历，还会创建 EntrySet 集合，该集合存放的元素的类型 Entry
        //而一个Entry对象就有k,v Entry<Entry<k,v>> 即： transient Set<Map.Entry<k,v>> entrySet;
        //3. entrySet 中，定义的类型是 Map.Entry, 但是实际上存放的还是HashMap$Node
        //这是因为  static class Node<k,v> implements Map.Entry<K,V>
        //4. 当把HashMap$Node对象 存放到 EntrySet 就方便遍历， 因为Map.Entry 提供了重要方法
        // K getKey(); V getValue()

        Set set = map.entrySet(); //HashMap$EntrySet
        System.out.println(set.getClass());
        for (Object obj : set) {
            //System.out.println(obj.getClass()); //HashMap$Node

            //为了从HashMap$Node中取出k-v
            //1. 先做一个向下转型
            Map.Entry entry = (Map.Entry) obj;
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }

        Set set1 = map.keySet();
        System.out.println(set1.getClass());
        Collection values = map.values();
        System.out.println(values.getClass());

    }
}
