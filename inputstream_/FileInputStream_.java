package com.hspedu.inputstream_;

import org.junit.jupiter.api.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStream_ {
    public static void main(String[] args) {

    }

    //演示读取文件
    //单个字节读取，效率低
    //优化： read()  ->  read(byte[] b)
    @Test
    public void readFile01()  {
        String filePath = "hello.txt";
        int readDate = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据。如果没有输入可用，此方法将阻止
            //如果返回-1，表示读取完毕
           while ((readDate = fileInputStream.read()) != -1) {
               System.out.print((char)readDate); //int 转成 char 显示
           }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }


    //使用 read(byte[] b) 方法读取文件
    @Test
    public void readFile02()  {
        String filePath = "hello.txt";
        //字节数组
        byte[] buf = new byte[8]; //一次读取8个字节
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建FileInputStream对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取最多b.length字节的数据到字节数组。如果没有输入可用，此方法将阻止
            //如果返回-1，表示读取完毕
            //如果返回正常，返回实际读取的字节数
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf,0,readLen)); //int 转成 String 显示
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
