package com.hspedu.reflection.class_;

import com.hspedu.Cat;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import sun.reflect.generics.scope.ClassScope;

public class Class01 {
    public Class01() throws ClassNotFoundException {
    }

    public static void main(String[] args) throws ClassNotFoundException {
        //1. Class 也是类，也继承Object类
        //2. Class 类对象不是new出来的，而是系统创建的
        //1） 传统new对象
        /* ClassLoader 类

        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
        }

         */
        Cat cat = new Cat();

        //2） 反射方式
        //对于某个类的Class类对象，在内存中只有一份，因为类只加载一次
        /* ClassLoader 类

        public Class<?> loadClass(String name) throws ClassNotFoundException {
            return loadClass(name, false);
        }

         */
        Class cls1 = Class.forName("com.hspedu.Cat");

        //3. 对于某个类的Class类对象，在内存中只有一份，因为类只加载一次
        Class cls2 = Class.forName("com.hspedu.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class cls3 = Class.forName("com.hspedu.Dog");
        System.out.println(cls3.hashCode());




    }

}
