package com.hspedu.threaduse;

public class Thread01 {
    public static void main(String[] args) throws InterruptedException {

        //创建一个Cat对象，可以当作线程使用
        Cat cat = new Cat();
        cat.start(); //启动线程 -> 最终会执行Cat的run方法
        //cat.run();//run方法是一个普通方法，没有真正启动一个线程，会把run方法执行完毕，才向下执行
        //当main线程启动一个子线程 Thread-0，主线程不会阻塞，会继续执行
        //这时主线程和子线程交替执行

        System.out.println("主线程继续执行" + Thread.currentThread().getName());
        for (int i = 0; i < 10; i++) {
            System.out.println("主线程 i= " + i);
            //让主线程休眠
            Thread.sleep(1000);

        }
    }
}

//1. 当一个类继承了 Thread 类，该类就可以当作线程使用
//2. 会重写run方法，写上自己的业务代码
//3. run方法 是 Thread 类实现了 Runnable 接口的run方法
/*
@Override
    public void run() {
        Runnable task = holder.task;
        if (task != null) {
            Object bindings = scopedValueBindings();
            runWith(bindings, task);
        }
    }
 */

class Cat extends Thread {

    int times = 0;
    @Override
    public void run() { //重写run方法，写上自己的业务逻辑

        while (true) {
            //该线程每隔1秒 在控制台输出“喵喵，我是小猫咪”
            System.out.println("喵喵，我是小猫咪" + (++times) + " 线程名=" + Thread.currentThread().getName());
            //让该线程休眠1秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 80) {
                break; //当times = 80 退出while循环，线程退出
            }
        }
    }
}
