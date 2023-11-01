package com.hspedu.throws_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsDetail {
    public static void main(String[] args) {
        f2();
    }
    public static void f2() /*throws ArithmeticException*/{
        //1.对于编译异常，程序必须处理，比如 try-catch 或者 throws
        //2.对于运行异常，程序中如果没有处理，默认就是throws的方式处理

        int n1 = 10;
        int n2 = 0;
        double res = n1 / n2;
    }

    public static void f1() throws FileNotFoundException{
        //1.因为f3() 方法抛出一个编译异常
        //2.这时，要去f1 必须处理这个编译异常
        //3. 解决方法：1）  f1() throws FileNotFoundException
        //           2）   try-catch-finally
        f3();  //Unhandled exception: java.io.FileNotFoundException
    }
    public static void f3() throws FileNotFoundException {
        //'FileInputStream' used without 'try'-with-resources statement
        FileInputStream fis = new FileInputStream("d://aa.txt");
    }

    public static void f4() {
        //f5() 没有出错 是因为
        //f5() 抛出的 ArithmeticException 是运行异常RuntimeException
        //java中不要求进行显示处理，因为有默认处理机制f4() throws ArithmeticException
       f5();
    }
    public static void f5() throws ArithmeticException {

    }
}

class Father { //父类
    public void method() throws RuntimeException {

    }
}

class son extends Father { //子类
    //3.子类重写父类的方法时，对抛出异常的规定：子类重写的方法，所抛出的异常类型
    //要么和父类抛出的异常一致，要么为父类抛出的异常类型的子类型

    @Override
    public void method() throws NullPointerException {

    }
    //4.在 throws 过程中，如果有方法 try-catch，就相当于处理异常，可以不必throws
}

