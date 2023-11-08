package com.hspedu.set_;

import java.util.HashSet;

public class HashSetIncrement {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        for (int j = 0; j <= 100 ; j++) {
            hashSet.add(j);


            for (int i = 0; i <= 12; i++) {
                hashSet.add(new A[i]);
            }
            System.out.println("hashset=" + hashSet);


//当我们向hashset增加一个元素， -》Node -》table ，就算是增加了一个
            for (int i = 0; i <= 7; i++) { //在table的某一条链表上加了7个A对象
                hashSet.add(new A[i]);
            }

            for (int i = 0; i <= 7; i++) { //在table的某一条链表上加了7个B对象
                hashSet.add(new B[i]);
            }
        }

    }
}

class B {
    private int n;

    public B(int n) {
        this.n = n;
    }
    @Override
    public int hashCode() {
        return 200;

    }
}
class A {
    private int n;

    public A(int n) {
        this.n = n;
    }

    @Override
    public int hashCode() {
        return 100;

    }
}

