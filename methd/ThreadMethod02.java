package com.hspedu.methd;

public class ThreadMethod02 {
    public static void main(String[] args) throws InterruptedException {

        T2 t2 = new T2();
        t2.start();

        for (int i = 0; i <= 20; i++) {
            Thread.sleep(1000);
            System.out.println("主线程 吃了" + i + " 个包子");
            if (i == 5) {
                System.out.println("主线程 让 子线程 先吃");
                //join 线程插队
                //t2.join(); //这里相当于让t2线程先执行完毕

                Thread.yield();//不一定礼让成功（资源特别丰富，不需要礼让）
                System.out.println("子线程吃完了 主线程接着吃");
            }
        }
    }
}
class T2 extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <= 20; i++) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程 吃了" + i + " 个包子");
        }
    }
}
