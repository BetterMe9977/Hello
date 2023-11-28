package com.hspedu.udp;

//UDP接收端

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1. 创建一个 DatagramSocket 对象，准备在9999接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2. 构建一个 DatagramPacket 对象，准备接收数据
        //   UDP协议 -》 一个数据包最大 64k
        byte[] buf = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);
        //3. 调用接收方法  将通过网络传输的 DatagramPacket 对象 填充到 packet 对象
        //当有数据包发送到 本机的9999端口，就会接收到数据
        //如果没有数据包发送到本机的9999端口，就会阻塞等待
        System.out.println("接收端A 等待接收数据……");
        socket.receive(packet);

        //4. 把 packet 进行拆包，取出数据，并显示
        int length = packet.getLength(); //实际接收到的数据字节长度
        byte[] data = packet.getData(); //接收到数据
        String s = new String(data,0,length);
        System.out.println(s);


        //=====回复信息给B端

        //5. 将需要发送的数据，封装到 DatagramPacket 对象
        data = "好的，明天见".getBytes();

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
