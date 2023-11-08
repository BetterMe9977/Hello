package com.hspedu.set_;

import java.util.LinkedHashSet;

import java.util.Set;

public class LinkedHashSetSource {
    public static void main(String[] args) {

        //分析一下LinkedHashSet 的底层机制
        Set set = new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("刘",1001));
        set.add(123);
        set.add("hsp");

        System.out.println("set" + set);
        //1. LinkedHashSet 加入顺序和取出元素/数据 顺序一致
        //2. LinkedHashSet 底层维护的是 LinkedHashMap（是HashMap的子类）
        //3. LinkedHashSet 底层结构（数组table + 双向链表）
        //4. 添加第一次时候，直接将 数组table扩容到16，存放的结点类型是LinkedHashMap$Entry
        //5. 数组是 HashMap$Node[] 存放的元素/数据是  LinkedHashMap$Entry类型
        /*
        //继承关系是在内部类完成
        //HashMap.Node<K,V> 静态内部类
             static class Entry<K,V> extends HashMap.Node<K,V> {
                Entry<K,V> before, after;
                 Entry(int hash, K key, V value, Node<K,V> next) {
                super(hash, key, value, next);
                }
            }
         */
    }
}

class Customer {
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
