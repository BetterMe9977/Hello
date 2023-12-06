package com.hspedu.reflection.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Homework02 {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException {

        //1. Class类的forName方法得到File类的class对象
        Class<?> fileCls = Class.forName("java.io.File");
        //2. 得到所有的构造器
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        //遍历输出
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File构造器=" + declaredConstructor);
        }
        //3. 指定得到 public java.io.File(java.lang.String)
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String filePath = "mynew.txt";
        Object file = declaredConstructor.newInstance(filePath); //创建File对象

        //4. 得到 createNewFile 的方法对象
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file); //创建文件，调用的是 creatNewFile

        //file 的运行类型就是 File
        System.out.println(file.getClass());
        System.out.println("创建文件成功");

    }
}
