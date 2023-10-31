package com.hspedu.annotation_;

public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly() {
        System.out.println("Father fly...");
    }
}
class Son extends Father { //子类

    //1.@Override 注解放在fly 方法上，表示子类的fly方法重写了父类的fly
    //2.如果没有@Override 这个注解，还是重写了父类的fly
    //3.如果写了@Override注解，编译器会去检查该方法是否真的重写了父类的某个方法，如果真的重写，则编译通过
    //  如果没有构成重写，则编译错误。
    //4.  @Override 定义
    //   如果发现  @interface 表示一个注解类

    /*
    @Target(ElementType.METHOD)
    @Retention(RetentionPolicy.SOURCE)
    public @interface Override {
    }
     */
    @Override
    public void fly() {
        System.out.println("Son Fly...");
    }
}
