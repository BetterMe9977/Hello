package com.hspedu.map_;

import java.util.HashMap;

public class HashMapSource2 {
    public static void main(String[] args) {
        HashMap hashMap = new HashMap();
        for (int i = 1; i <= 12; i++) {
            hashMap.put(new A[i], "hello");

        }

        System.out.println("hashMap=" + hashMap);
    }
}
class A {
    private int num;

    public A(int num) {
        this.num = num;
    }

    //所有的A对象的hashcode 都是100
    @Override
    public int hashCode() {
        return 100;
    }

    @Override
    public String toString() {
        return "\nA{" +
                "num=" + num +
                '}';
    }
}
