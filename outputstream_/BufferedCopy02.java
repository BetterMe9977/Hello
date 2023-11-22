package com.hspedu.outputstream_;

import java.io.*;

//演示使用 BufferedOutputStream 和 BufferedInputStream 使用
//使用它们完成二进制文件拷贝
//字节流可以操作二进制文件，也可以操作文本文件
public class BufferedCopy02 {
    public static void main(String[] args) {

        //拷贝图片文件
        String srcFilePath = "test.png";
        String destFilePath = "hsp.png";

        //拷贝视频文件
        //String srcFilePath = "a.mov";
        //String destFilePath = "a2.mov";

        //拷贝文本文件
        //String srcFilePath = "Main.java";
        //String destFilePath = "hsp.java";

        //创建BufferedOutStream 对象 和 BufferedInputStream对象
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        try {
            // FileInputStream 是 InputStream 子类
            bis = new BufferedInputStream(new FileInputStream(srcFilePath));
            bos = new BufferedOutputStream(new FileOutputStream(destFilePath));

            //循环读文件， 并写入到destFilePath
            byte[] buff = new byte[1024];
            int readLen = 0;
            //当返回-1时，表示文件读取完毕
            while ((readLen = bis.read(buff)) != -1) {
                bos.write(buff,0,readLen);
            }

            System.out.println("文件拷贝完毕……");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //关闭外层处理流即可，底层回去关闭节点流
            try {
                if (bis != null) {
                    bis.close();
                }
                if (bos != null) {
                    bos.close();
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
