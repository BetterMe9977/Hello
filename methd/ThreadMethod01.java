package com.hspedu.methd;

public class ThreadMethod01 {
    public static void main(String[] args) throws InterruptedException {
        //测试相关方法
        T t = new T();
        t.setName("hsp");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();//启动子线程

        //主线程打印 5 hi，然后中断，子线程休眠
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.println("hi " + i);
        }

        System.out.println(t.getName() + " 线程的优先级 =" + t.getPriority());
        t.interrupt();//执行这里，就会中断t线程的休眠
    }
}

class T extends Thread {
    @Override
    public void run() {
        while (true) {
            for (int i = 0; i < 100; i++) {
                //Thread.currentThread().getName()  获取当前线程的名称
                System.out.println(Thread.currentThread().getName() + "吃包子……" + i);
            }
            try {
                System.out.println(Thread.currentThread().getName() + "休眠中……");
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                //当线程执行到一个 interrupt 方法时，就会 catch 一个异常，可以加入自己的业务代码
                //InterruptedException 捕获一个中断异常
                System.out.println(Thread.currentThread().getName() + "被 interrupt 了");
            }
        }
    }
}