package com.hspedu.reader_;


import org.junit.jupiter.api.Test;

import java.io.FileReader;
import java.io.IOException;

public class FileReader_ {
    public static void main(String[] args) {

    }

    //单个字符读取文件
    @Test
    public void readFile01(){

        String filePath = "story.txt";
        FileReader fileReader = null;
        int data = 0;
        //1. 创建一个FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read,单个字符读取
            while((data = fileReader.read()) != -1 ) {
                System.out.print((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


    @Test
    public void readFile02(){
        System.out.println("-----readFile02 方式-----");
        String filePath = "story.txt";
        FileReader fileReader = null;
        int readLen = 0;
        char[] buf = new char[8];
        //1. 创建一个FileReader 对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取 使用read(buf)，返回的是实际读取到的字符
            //如果返回-1，说明到文件结束
            while((readLen = fileReader.read(buf)) != -1 ) {
                System.out.print(new String(buf,0,readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }

        }

    }
}





