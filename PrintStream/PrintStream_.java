package com.hspedu.PrintStream;

import java.io.IOException;
import java.io.PrintStream;

//演示PrintStream（字节打印流/输出流）
public class PrintStream_ {
    public static void main(String[] args) throws IOException {

        PrintStream out = System.out;
        //在默认情况下，PrintStream 输出数据的位置是 标准输出，即显示器
        /*
            public void print(String s) {
               if (s == null) {
                 s = "null";
               }
                write(s);
            }
         */
        out.print("john,hello");
        //因为print底层使用的是write，所以我们可以直接调用write进行打印/输出
        out.write("韩顺平，你好".getBytes());

        out.close();

        //修改打印流输出的位置/设备
        //1. 输出修改成到"f1.txt"
        //2. "hello,韩顺平教育～" 就会输出到f1.txt
        //3. 源码
        /*
            public static void setOut(PrintStream out) {
                checkIO();
                setOut0(out); //native 方法，修改了out
            }
         */
        System.setOut(new PrintStream("f1.txt"));
        System.out.println("hello,韩顺平教育～");

    }
}
