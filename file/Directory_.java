package com.hspedu.file;

import org.junit.jupiter.api.Test;

import java.io.File;

public class Directory_ {
    public static void main(String[] args) {

    }
    //判断new1.txt 是否存在，如果存在就删除
    @Test
    public void m1() {

        String filePath = "news1.txt" ;
        File file = new File(filePath);
        if(file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该文件不存在……");
        }

    }

    //判断目录是否存在
    //在java编程中，目录也被当作文件
    @Test
    public void m2() {

        String filePath = "demo" ;
        File file = new File(filePath);
        if(file.exists()) {
            if (file.delete()) {
                System.out.println(filePath + "删除成功");
            } else {
                System.out.println(filePath + "删除失败");
            }
        } else {
            System.out.println("该目录不存在……");
        }

    }

    //判断目录/Users/username/demo/a/b是否存在，如果存在就提示已经存在，否则就创建
    @Test
    public void m3() {

        String directoryPath = "/Users/username/demo/a/b" ;
        File file = new File(directoryPath);
        if(file.exists()) {
            System.out.println(directoryPath + "存在……");
        } else {
            if (file.mkdirs()) {//创建根目录使用mkdir(),创建多级目录使用mkdirs()
                System.out.println(directoryPath + "创建成功……");
            } else {
                System.out.println(directoryPath + "创建失败……");
            }
        }

    }
}
