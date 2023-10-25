package com.hspedu.static_;

public class StaticDetail {
    public static void main(String[] args) {
        B b = new B();

        //Non-static field 'n1' cannot be referenced from a static context
        //System.out.println(B.n1);
        System.out.println(B.n2);

        //静态变量是类加载的时候就创建了，
        //即便没有创建对象实例，也可以通过 类名.类变量名 来访问
        System.out.println(C.address);
    }
}

class B {
    public int n1 = 100;
    public static int n2 = 200;
}

class C {
    public static String address = "北京";
}

