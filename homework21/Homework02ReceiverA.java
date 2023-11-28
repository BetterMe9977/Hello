package com.hspedu.homework;

//UDP接收端

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

@SuppressWarnings({"all"})
public class Homework02ReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个 DatagramSocket 对象，准备在8888接收数据
        DatagramSocket socket = new DatagramSocket(8888);
        //2. 构建一个 DatagramPacket 对象，准备接收数据
        //   UDP协议 -》 一个数据包最大 64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        //3. 调用接收方法  将通过网络传输的 DatagramPacket 对象 填充到 packet 对象

        System.out.println("接收端 等待接收问题 ");
        socket.receive(packet);

        //4. 把 packet 进行拆包，取出数据，并显示
        int length = packet.getLength(); //实际接收到的数据字节长度
        byte[] data = packet.getData(); //接收到数据
        String s = new String(data,0,length);
        //判断接收到的信息是什么
        String answer = "";
        if ("四大名著是哪些".equals(s)) {
            answer = "四大名著《红楼梦》《三国演义》《西游记》《水浒传》";
        } else {
            answer = "what?";
        }


        //=====回复信息给B端

        //5. 将需要发送的数据，封装到 DatagramPacket 对象
        data = answer.getBytes();

        //封装的 DatagramPacket 对象  data内容字节数组，data.length，主机（IP），端口
        //InetAddress.getByName(" ")   // "ip地址"
        packet =
                new DatagramPacket(data, data.length, InetAddress.getLocalHost(), 9998);
        socket.send(packet);


        //6. 关闭资源
        socket.close();
        System.out.println("A端退出");

    }
}
