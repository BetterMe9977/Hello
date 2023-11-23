package com.hspedu.PrintStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriter_ {
    public static void main(String[] args) throws IOException {

        PrintWriter printWriter1 = new PrintWriter(System.out);
        printWriter1.print("hi，北京你好……");
        printWriter1.close();

        PrintWriter printWriter = new PrintWriter(new FileWriter("f2.txt"));
        printWriter.print("hi，北京你好");

        printWriter.close(); //flush(把数据写入）+ close

    }
}
