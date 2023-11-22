package com.hspedu.transformation;

//演示把OutputStreamWriter 使用
//把FileOutputStream 字节流，转成字符流 OutputStreamWriter
//指定处理的编码 gbk/utf-8/utf8

import java.io.*;
import java.nio.charset.Charset;



public class OutputStreamWriter_ {
    public static void main(String[] args) throws IOException {

        String filePath = "hsp.txt";
        String charSet = "gbk";
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream(filePath), "gbk");
        osw.write("hi,韩顺平教育");
        osw.close();
        System.out.println("按照 " + charSet + " 保存文件成功……");


        Charset defaultCharset = Charset.defaultCharset();
        System.out.println("Default Charset: " + defaultCharset.displayName());


    }
}
