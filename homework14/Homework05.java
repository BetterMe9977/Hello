package com.hspedu.homework;

import java.util.Comparator;
import java.util.TreeSet;

public class Homework05 {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet();

        treeSet.add(new Person()); //ClassCastException
        treeSet.add(new Person()); //加不进； 返回0
        treeSet.add(new Person()); //
        treeSet.add(new Person()); //
        treeSet.add(new Person()); //

        System.out.println(treeSet);
    }
}

class Person implements Comparable {

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}