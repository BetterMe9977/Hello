package com.hspedu.syn;

//使用多线程，模拟三个窗口同时售票100张

public class SellTicket {
    public static void main(String[] args) {

        //测试
        /*
        SellTicket01 sellTicket01 = new SellTicket01();
        SellTicket01 sellTicket02 = new SellTicket01();
        SellTicket01 sellTicket03 = new SellTicket01();

        //这里会出现票数超卖
        sellTicket01.start();//启动售票线程
        sellTicket02.start();
        sellTicket03.start();
        */

        //
        /*
        System.out.println("=========使用实现接口方式===========");
        SellTicket02 sellTicket02 = new SellTicket02();
        new Thread(sellTicket02).start(); //第1个线程-窗口
        new Thread(sellTicket02).start(); //第2个线程-窗口
        new Thread(sellTicket02).start(); //第3个线程-窗口

         */

        //测试SellTicket03
        SellTicket03 sellTicket03 = new SellTicket03();
        new Thread(sellTicket03).start(); //第1个线程-窗口
        new Thread(sellTicket03).start(); //第2个线程-窗口
        new Thread(sellTicket03).start(); //第3个线程-窗口

    }
}

//实现接口方式，使用synchronized
class SellTicket03 implements Runnable {
    private int ticketNum = 100; //让多个线程共享ticketNum
    private boolean loop = true; //控制run方法变量
    Object object = new Object();

    //同步方法（静态的）的锁为当类本身
    //1. public synchronized static void m1() {} 锁是加在 SellTicket03.class
    //2. 如果在静态方法中，实现一个同步代码块
    /*
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
     */
    public synchronized static void m1() {

    }
    public static void m2() {
        synchronized (SellTicket03.class) {
            System.out.println("m2");
        }
    }
    //
    //1. public synchronized void sell() {} 是一个同步方法
    //2. 这时锁在 this 对象
    //3. 若觉得在方法加锁效率不高，可以 写 synchronized 同步代码块，互斥锁仍然在this对象

    public /* synchronized */ void sell() { //同步方法，在同一时刻，只能有一个线程来执行sell方法

        synchronized (/*this*/ object) { //object使用同一对象
            if (ticketNum <= 0) {
                System.out.println("售票结束……");
                loop = false;
                return;
            }

            //休眠50毫秒,模拟

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));
        }
    }


    @Override
    public void run() { //同步方法，在同一时刻，只能有一个线程来执行run方法
        while (loop) {

            sell(); //一个同步方法
        }
    }

}



//使用Thread方式
class SellTicket01 extends Thread {
    private static int ticketNum = 100; //让多个线程共享

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒,模拟

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));
        }
    }
}

//实现接口方式
class SellTicket02 implements Runnable {
    private int ticketNum = 100; //让多个线程共享

    @Override
    public void run() {
        while (true) {

            if (ticketNum <= 0) {
                System.out.println("售票结束");
                break;
            }

            //休眠50毫秒,模拟

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("窗口 " + Thread.currentThread().getName() + " 售出一张票"
                    + " 剩余票数=" + (--ticketNum));
        }
    }
}