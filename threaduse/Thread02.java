package com.hspedu.threaduse;

public class Thread02 {
    public static void main(String[] args) {

        Dog dog = new Dog();
        //dog.start;  //这里不能调用start
        //创建了Thread对象，把dog对象（实现Runnable），放入Thread
        Thread thread = new Thread(dog);
        thread.start();


        Tiger tiger = new Tiger();
        ThreadProxy threadProxy = new ThreadProxy(tiger);
        threadProxy.start();

    }
}


class Animal{}
class Tiger extends Animal implements Runnable {

    @Override
    public void run() {
        System.out.println("老虎嗷嗷叫");
    }
}
//线程代理类,模拟极简的Thread 类
class ThreadProxy implements Runnable {
    private Runnable target = null; //属性，类型是 Runnable
    @Override
    public void run() {
        if (target != null) {
            target.run(); //动态绑定
        }
    }

    public ThreadProxy(Runnable target) {
        this.target = target;
    }

    public void start() {
        start0();//在Thread中真正实现多线程的方法
    }
    public void start0() {
        run();
    }
}
class Dog implements Runnable {

    int count = 0;
    @Override
    public void run() {
        while (true) {
            System.out.println("小狗汪汪叫 hi" + (++count) + Thread.currentThread().getName());

            //休眠1秒
            try {
                Thread.sleep(1000);//Unhandled exception: java.lang.InterruptedException
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (count == 10) {
                break;
            }
        }
    }
}