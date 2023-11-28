package com.hspedu.homework;

//发送端B

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Homework02SenderB {
    public static void main(String[] args) throws IOException {

        //1. 创建一个DatagramSocket 对象，准备在9998端口 接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2. 将需要发送的数据，封装到 DatagramPacket 对象
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题：");
        String question = scanner.next();
        byte[] data = question.getBytes();

        //封装的 DatagramPacket 对象  data内容字节数组，data.length，主机（IP），端口
        //InetAddress.getByName(" ")   // "ip地址"
        DatagramPacket packet =
                new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 8888);
        socket.send(packet);

        //3. =========接收从A端回复的信息

        // 构建一个 DatagramPacket 对象，准备接收数据
        //   UDP协议 -》 一个数据包最大 64k
        byte[] buf = new byte[1024];
        packet = new DatagramPacket(buf,buf.length);
        //   调用接收方法  将通过网络传输的 DatagramPacket 对象 填充到 packet 对象
        //当有数据包发送到 本机的9998端口，就会接收到数据
        //如果没有数据包发送到本机的9998端口，就会阻塞等待

        socket.receive(packet);

        // 把 packet 进行拆包，取出数据，并显示
        int length = packet.getLength(); //实际接收到的数据字节长度
        data = packet.getData(); //接收到数据
        String s = new String(data,0,length);
        System.out.println(s);


        //关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}
