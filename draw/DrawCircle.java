package com.hspedu.draw;

import javax.swing.*;
import java.awt.*;

public class DrawCircle extends JFrame{ //JFrame对应窗口，可以理解成一个画框
    //定义一个画板
    private MyPanel mp = null;
    public static void main(String[] args) {
        new DrawCircle();
    }

    public DrawCircle() {
        //初始化画板
        mp = new MyPanel();
        //把面板放入到窗口（画框）
        this.add(mp);
        //设置窗口的大小
        this.setSize(500,400);
        //当点击窗口的❌ 程序退出
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true); //可以显示
    }
}
//在面板上画出圆
//1.先定义一个MyPanel，继承JPanel，画图形，就在面板上画
class MyPanel extends JPanel {

    //1.MyPanel 对象就是一个画板
    //2.Graphics g 把g理解成一支画笔
    //3. Graphics 提供了很多绘图方法
    @Override
    public void paint(Graphics g) {  //绘图方法
         super.paint(g); //调用父类的方法完成初始化
        System.out.println("paint 方法被调用了");
        //画出一个圆形
        g.drawOval(10,10,100,100);

        //演示绘制不同图形
        //画直线drawLine(int x1,int y1,int x2,int y2)
        g.drawLine(10,10,100,100);

        //画矩形边框 drawRect(int NBSPx,int NBSPy,int NBSPwidth,int NBSPheihth)
        g.drawRect(10,10,100,100);

        //画椭圆边框drawOval(int NBSPx,int NBSPy,int NBSPwidth,int NBSPheihth)
        g.drawOval(10,10,100,150);

        //填充矩形 fillRectint(int NBSPx,int NBSPy,int NBSPwidth,int NBSPheihth)
        //设置画笔的演示
        g.setColor(Color.BLUE);
        g.fillRect(10,10,100,50);

        //填充椭圆fillOval(int NBSPx,int NBSPy,int NBSPwidth,int NBSPheihth)
        g.setColor(Color.red);
        g.fillOval(50,50,200,50);

        //画图片 drawImage(Image NBSPimg, int NBSPx, int NBSPy,...)
        //1. 获取图片资源,/bg.png 表示在该项目的根目录去获取 bg.png图片436 × 312
        //Image image = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bg.png"));
        //g.drawImage(image,100,100,436,312,this);

        //画字符串drawString(StringNBSPstr,intNBSPx,intNBSPy)  // 写字
        //给画笔设置颜色和字体
        g.setColor(Color.red);
        g.setFont(new Font("隶书",Font.BOLD,50));
        g.drawString("北京你好",100,200);







    }

}