package com.hspedu.methd;

public class ThreadMethod03 {
    public static void main(String[] args) throws InterruptedException {

        MyDaemonThread myDaemonThread = new MyDaemonThread();
        //如果希望当main线程结束后，子线程自动结束
        //将子线程设置为守护线程即可
        myDaemonThread.setDaemon(true);

        myDaemonThread.start();

        for (int i = 1; i <= 10 ; i++) { //main 线程
            System.out.println("辛苦工作");
            Thread.sleep(1000);
        }
    }
}

class MyDaemonThread extends Thread {
    @Override
    public void run() {
        for (; ;) { //无限循环
            try {
                Thread.sleep(1000); //休眠50毫秒
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("老韩请谨慎吃瓜，哈哈哈……");
        }
    }
}