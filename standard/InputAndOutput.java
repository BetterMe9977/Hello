package com.hspedu.standard;
import java.util.Scanner;
public class InputAndOutput {
    public static void main(String[] args) {
        //System 类的 public final static InputStream in = null;
        //System.in 编译类型是 InputStream
        //System.in 运行类型是 BufferedInputStream
        //System.in 是标准输入 即键盘
        System.out.println(System.in.getClass());

        //
        //1. public final static PrintStream out = null;
        //2. 编译类型是 PrintStream
        //3. 运行类型是 PrintStream
        //4. System.out 是 标准输出 即显示器
        System.out.println(System.out.getClass());

        System.out.println("hello,world");

        Scanner scanner = new Scanner(System.in);
        System.out.println("输入内容");
        String next = scanner.next();
        System.out.println("next=" + next);

    }
}
