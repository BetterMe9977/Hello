package com.hspedu.object_;

public class Equals01 {
    public static void main(String[] args) {
        A a = new A();
        A b = a;
        A c = b;
        System.out.println(a == c);
        System.out.println(b == c);

        B bObj = a;
        System.out.println(bObj == c);
        //判断引用类型，判断的是地址是否相等，即判定是不是同一个对象

        int num1 = 10;
        double num2 = 10.0;
        System.out.println(num1 == num2); //基本数据类型，判断值是否相等

       //equals 方法，源码怎么查看
        //equals 是 Object类中的方法，只能判断引用类型，默认判断的是地址是否相等
        //从源码中可以看到，子类中往往重写该方法，用于判断内容是否相等
        "hello".equals("abc");
        Integer integer1 = new Integer(1000);
        Integer integer2 = new Integer(1000);
        System.out.println(integer1 == integer2); //判断引用类型
        System.out.println(integer1.equals(integer2));//判断值

        String str1 = new String("hspedu");
        String str2 = new String("hspedu");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));


    }
}

class B {

}
class A extends B{

}
