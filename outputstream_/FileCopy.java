package com.hspedu.outputstream_;

import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {
    public static void main(String[] args) {
        //完成文件拷贝
        //1. 创建文件的输入流，将文件读入到程序
        //2. 创建文件的输出流，将读取到的文件数据，写入到指定的位置

        String filePath = "test.png";
        String destfilePath = "test2.png";
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(filePath);
            fileOutputStream = new FileOutputStream(destfilePath);
            //定义一个字节数组，提高读取效率
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //读取到后，就写入到文件 通过 fileOutputStream
                //即 边读边写
                // 不用 fileOutputStream.write(buf)  方法，可能造成文件损失
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝成功～");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                //关闭输入流和输出流，释放资源
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
