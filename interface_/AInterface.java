package com.hspedu.interface_;

public interface AInterface {
    //写属性 方法
    public int n1 = 10;
    //方法
    //在接口中，抽象方法可以省略abstract关键字
    public void hi();

    //在jdk8后，可以有默认实现方法，但是需要用default关键字修饰
    //Interface abstract methods cannot have body
    default public void ok() {
        System.out.println("ok...");
    }
    //在jdk8后，可以有静态方法
    public static void cry(){

    }


}
