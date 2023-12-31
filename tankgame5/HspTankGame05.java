package com.hspedu.tankgame5;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class HspTankGame05 extends JFrame {

    //定义MyPanel
    MyPanel mp = null;
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {



        HspTankGame05 hspTankGame01 = new HspTankGame05();
    }

    public HspTankGame05() {
        System.out.println("请输入选择 1: 新游戏 2: 继续上局");
        String key = scanner.next();

        mp = new MyPanel(key);
        //将mp 放入到Thread，并启动
        Thread thread = new Thread(mp);
        thread.start();
        this.add(mp); //把面板（就是游戏的绘图区域）
        this.setSize(1300,950);
        this.addKeyListener(mp);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);

        //在 JFrame 中增加相应
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                Recorder.keepRecord();
                //System.out.println("监听到关闭窗口了");
                System.exit(0);
            }
        });

    }
}
