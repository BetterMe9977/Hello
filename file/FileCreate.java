package com.hspedu.file;

import org.junit.jupiter.api.Test;

import javax.annotation.processing.SupportedAnnotationTypes;
import java.io.File;
import java.io.IOException;

//演示创建文件
public class FileCreate {
    public static void main(String[] args) {

    }

    //方式1 new File(String pathname)
    @Test
    public void create01() {
        String filePath = "/Users/username/e/news01.txt";
        File file = new File(filePath);

        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    //方式2 new File(File parent,String child) //　根据父目录文件+子路径构建
    //news2.txt
    @Test
    public void create02() {
        File parentFile = new File("/Users/username/e");
        String fileName = "news02.txt";
        //这里的file对象，在java程序中，只是一个对象
        //只有执行了createNewFile()方法，才会真正的 在磁盘中创建该文件
        File file = new File(parentFile,fileName);

        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3 new File(String parent,String child) // 根据父目录 + 子路径构建
    @Test
    public void create03() {

        String parentPath = "/Users/username/e";
        String fileName = "news03.txt";
        File file = new File(parentPath, fileName);

        try {
            file.createNewFile();
            System.out.println("news3 创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
