package com.hspedu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(AA.a);
        System.out.println(B.a);
    }
}
interface AA { //'A' -->Duplicate class found in the file
    int a = 23;//等价于 public static final int a = 23;
}
class B implements AA { //AA中没有抽象方法需要继承
}
