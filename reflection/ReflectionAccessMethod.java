package com.hspedu.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

//演示通过反射调用方法
public class ReflectionAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {

        //1. 得到Boss类对应的Class对象
        Class<?> bossClass = Class.forName("com.hspedu.reflection.Boss");
        //2. 创建对象
        Object o = bossClass.newInstance();
        //3. 调用public 的hi方法
        Method hi = bossClass.getMethod("hi",String.class);
        hi.invoke(o,"你好");
        //3.1 得到hi方法对象
        Method hi1 = bossClass.getDeclaredMethod("hi",String.class);
        //3.2 调用
        hi1.invoke(o,"hello");

        //4. 调用private static 方法
        //4.1 得到say方法对象
        Method say = bossClass.getDeclaredMethod("say",int.class,String.class,char.class);
        //4.2 因为say方法是private，需要使用爆破
        say.setAccessible(true);
        System.out.println(say.invoke(o,100,"tom", '男'));
        //4.3 因为say方法是static的，还可以使用这样调用，传入null
        System.out.println(say.invoke(null,100,"tom", '男'));

        //5. 在反射中，如果方法有返回值，统一返回Object, 但是他的运行类型和方法定义的返回类型一致
        Object reVal = say.invoke(null,300, "lucy", '女'); //统一用Object接收
        System.out.println("reVal 的运行类型=" + reVal.getClass()); //String

    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    public static String say(int n, String s, char c) { //静态方法
        return n + " " + s + " " + c;
    }

    public void hi(String s) { //普通public方法
        System.out.println("hi " + s);
    }
}
