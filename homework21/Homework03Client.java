package com.hspedu.homework;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class Homework03Client {
    public static void main(String[] args) throws Exception {

        //1. 接收用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名");
        String downLoadFileName = scanner.next();

        //2. 客户端连接服务器，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        //3. 获取和Socket相关的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downLoadFileName.getBytes());
        //设置写入结束的标志
        socket.shutdownOutput();

        //4. 读取服务端返回的文件
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());

        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //5. 得到一个输出流，准备将bytes内容写入到磁盘
        String filePath = downLoadFileName + "1.mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        //6. 关闭相关的资源
        bos.close();
        bis.close();
        outputStream.close();
        socket.close();

        System.out.println("客户端下载完毕，正确退出……");

    }
}
