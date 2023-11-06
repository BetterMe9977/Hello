package com.hspedu.list_;




public class LinkedList {
    public static void main(String[] args) {
        //模拟一个简单的双向链表

        Node jack = new Node("jack");
        Node tom = new Node("tom");
        Node hsp = new Node("老韩");

        //连接三个结点，形成双向链表
        jack.next = tom;
        tom.next = hsp;

        hsp.pre = tom;
        tom.pre = jack;

        Node first = jack; //让first引用指向jack，就是双向链表的头结点
        Node last = hsp; //让last引用指向hsp，就是双向链表的尾结点

        //演示 从头到尾遍历
        System.out.println("=========从头到尾遍历========");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }

        //演示从尾到头的遍历
        System.out.println("=========从尾到头遍历========");
        while (true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }

        //演示双向链表添加数据的便利性
        //要求在tom和老韩之间插一个对象 smith
        Node smith = new Node("smith");

        smith.next = hsp;
        smith.pre = tom;
        tom.next = smith;
        hsp.pre = smith;

         first = jack; //让first引用 重新指向jack，就是双向链表的头结点

        //演示 从头到尾遍历
        System.out.println("=========添加后再次从头到尾遍历========");
        while (true) {
            if (first == null) {
                break;
            }
            //输出first信息
            System.out.println(first);
            first = first.next;
        }


        last = hsp; //让last引用 重新再次指向hsp，就是双向链表的尾结点
        //演示从尾到头的遍历
        System.out.println("=========添加后再次从尾到头遍历========");
        while (true) {
            if (last == null) {
                break;
            }
            //输出last信息
            System.out.println(last);
            last = last.pre;
        }

    }

}

//定义一个Node类， Node 对象表示一个双向链表的一个结点
class Node {
    public Object item; //真正存放数据的地方
    public Node next; //指向后一个结点
    public Node pre; //指向前一个结点

    public Node(Object name) {
        this.item = name;
    }

    @Override
    public String toString() {
        return "Node name=" + item;
    }

}
