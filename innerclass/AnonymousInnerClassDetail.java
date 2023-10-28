package com.hspedu.innerclass;

public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
        System.out.println("main outer05 hashcode=" + outer05);
    }
}

class Outer05 {
    public int n1 = 99;
    public void f1() {
        //创建一个基于类的匿名内部类
        Person p = new Person() {
            public int n1 = 88;
            @Override
            public void hi() {
                //可以直接访问外部类的所有成员，包含私有的
                //如果外部类和匿名内部类的成员重名时，匿名内部类访问，默认遵循就近原则
                //如果想访问外部类的成员，则可使用（外部类.this.成员）去访问

                System.out.println("匿名内部类重写了 hi方法 n1=" + n1);
                System.out.println("外部类的  n1=" + Outer05.this.n1);
                //Outer05.this 就是调用 f1 的对象
                System.out.println("Outer05.this hashcode=" + Outer05.this);
            }
        };
        p.hi(); //动态绑定，真正的运行类型是Outer05$1

        //也可以直接调用，匿名内部类本身也是返回对象
        //class 匿名内部类 extends Person {}
        new Person(){
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi方法......");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("jack");

    }
}
class Person { //类
    public void hi() {
        System.out.println("Person hi()");
    }
    public void ok(String str) {
        System.out.println("Person ok() " + str);
    }
}

