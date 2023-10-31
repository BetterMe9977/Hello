package com.hspedu.annotation_;



public class Deprecated {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

//1.Deprecated 修饰某个元素，表示该元素已经过时
//2. 即不再推荐使用，但是仍然可以使用
//3.源码
//4.可以修饰 方法，类，字段，包，参数等等
//5.可以做版本升级的过度使用
/*
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, MODULE, PARAMETER, TYPE})
public @interface Deprecated {
}
 */
@java.lang.Deprecated
class A {
    @java.lang.Deprecated
    public int n1 = 10;
    @java.lang.Deprecated
    public void hi() {

    }
}