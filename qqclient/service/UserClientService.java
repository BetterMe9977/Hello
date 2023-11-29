package com.hspedu.qqclient.service;

import com.hspedu.qqcommon.Message;
import com.hspedu.qqcommon.MessageType;
import com.hspedu.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


//该类完成用户登陆验证和用户注册等功能
public class UserClientService {

    //因为可能在其他地方使用user信息，因此做出成员属性
    private User u = new User();
    //因为Socket在其他地方也可能使用，因此做出属性
    private Socket socket;
    //根据 userId 和 pwd 到服务器验证该用户是否合法
    public boolean checkUser(String userId, String pwd) {
        boolean b = false;
        //创建User对象
        u.setUserId(userId);
        u.setPasswd(pwd);
        //连接到服务端，发送u对象

        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            //得到ObjectOutputStream对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u); //发送User对象

            //读取从服务器回复的Message对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) { //登陆ok


                //创建一个和服务器端保持通信的线程 -> 创建一个类 ClientConnectServerThread
                ClientConnectServerThread clientConnectServerThread =
                        new ClientConnectServerThread(socket);
                //启动客户端的线程
                clientConnectServerThread.start();
                //为了后面客户端的扩展，将线程放入到集合中管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServerThread);

                b = true;

            } else {
                //如果登陆失败，不能启动和服务器通信的线程，关闭socket
                socket.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return b;

    }

    //向服务器请求在线用户列表
    public void onlineFriendList() {

        //发送Message，类型MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());

        //发送给服务器

        try {
            /*  // 从管理集合的线程中，通过userId 得到这个线程
            ObjectOutputStream oos  = new ObjectOutputStream
                    (ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
            */

            // 从管理集合的线程中，通过userId 得到这个线程对象
            ClientConnectServerThread clientConnectServerThread =
                    ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId());
            //通过这个线程得到关联的 socket
            Socket socket = clientConnectServerThread.getSocket();

            //得到线程的Socket 对应的 ObjectOutputStream  对象
           ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
           oos.writeObject(message); //发送一个 Message 对象，想服务端要求在线用户列表
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //编写方法，退出客户端，并给服务器端发送一个退出系统的message对象
    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId());

        //发送message
        try {
            //ObjectOutputStream oos  = new ObjectOutputStream(socket.getOutputStream());
            //客户端多个socket
            ObjectOutputStream oos  =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(u.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println(u.getUserId() + " 退出系统 ");
            System.exit(0); //结束进程
        } catch (IOException e) {
            e.printStackTrace();

        }

    }
}
