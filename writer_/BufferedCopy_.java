package com.hspedu.writer_;

import java.io.*;

public class BufferedCopy_ {
    public static void main(String[] args) {

        //1. BufferedReader 和 BufferedWriter 是安装字符操作
        //2. 不要操作 二进制文件（声音　视频 doc pdf 等），可能造成文件损坏
        //拷贝文件
        String srcFilePath = "Main.java";
        String destFilePath = "Main2.java";
        BufferedReader br = null;
        BufferedWriter bw = null;
        String line;

        try {
            br = new BufferedReader(new FileReader(srcFilePath));
            bw = new BufferedWriter(new FileWriter(destFilePath));

            // readLine 读取一行内容，但是没有换行
            while((line = br.readLine()) != null) {
                // 每读取一行 就写入
                bw.write(line);
                //插入一个换行
                bw.newLine();
            }
            System.out.println("拷贝完毕……");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            try {
                if (br != null) {
                    br.close(); //底层关闭的是 new FileReader(srcFilePath)
                }
                if (bw != null) {
                    bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
