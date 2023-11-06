package com.hspedu.list_;
import java.util.Iterator;
import java.util.LinkedList;


public class LinkedListCRUD {
    public static void main(String[] args) {

        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        System.out.println("linkedList=" + linkedList);

        //演示删除结点
        linkedList.remove(); // 默认删除第一个结点
        //linkedList.remove(2);
        System.out.println("linkedList=" + linkedList);

        //修改某个结点对象
        linkedList.set(1,999);
        System.out.println("linkedList=" + linkedList);

        //得到某个结点对象
        Object o = linkedList.get(0);
        System.out.println(o);
        System.out.println(linkedList.get(1));

        //LinkedList 实现了List 接口， 遍历方法
        System.out.println("=========LinkedList遍历迭代器========");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println("next=" + next);

        }

        System.out.println("=========LinkedList增强for========");
        for (Object o1 : linkedList) {
            System.out.println(o1);
        }

        System.out.println("=========LinkedList普通for========");
        for (int i = 0; i < linkedList.size(); i++) {
            System.out.println(linkedList.get(i));
        }


        //阅读源码
    }
}
