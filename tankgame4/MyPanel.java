package com.hspedu.tankgame4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Vector;

//为了监听 键盘事件，实现KeyListener
//为了panel 不停的重绘子弹，需要将 MyPanel 实现Runnable，当作一个线程使用

//绘图区域
public class MyPanel extends JPanel implements KeyListener, Runnable{
    //定义我的坦克
    Hero hero = null;
    //定义敌人坦克，放入到Vector
    Vector<EnemyTank> enemyTanks = new Vector<>();

    //定义一个Vector，用于存放炸弹
    //当子弹击中坦克时，加入一个Bomb对象到bombs
    Vector<Bomb> bombs = new Vector<>();
    int enemyTankSize = 3;

    //定义3张炸弹图片，用于显示爆炸效果
    Image image1 = null;
    Image image2 = null;
    Image image3 = null;
    public MyPanel() { //构造器

        hero = new Hero(100,100);  //初始化自己坦克
       // hero.setSpeed(5);
        //初始化敌人的坦克
        for (int i = 0; i < enemyTankSize; i++) {
            //创建一个敌人的坦克，
            EnemyTank enemyTank = new EnemyTank((100*(i + 1)), 0);
            //设置方向
            enemyTank.setDirect(2);
            //启动敌人坦克线程，让他动起来
            new Thread(enemyTank).start();
            //给该enemyTank 加入一颗子弹
            Shot shot = new Shot(enemyTank.getX() + 20,enemyTank.getY() + 60,enemyTank.getDirect());
            //加入enemyTank的Vector成员
            enemyTank.shots.add(shot);
            //启动
            new Thread(shot).start();
            //加入
            enemyTanks.add(enemyTank);

        }

        //初始化图片对象
        image1 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_1.png"));
        image2 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_2.png"));
        image3 = Toolkit.getDefaultToolkit().getImage(Panel.class.getResource("/bomb_3.png"));
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.fillRect(0,0,1000,750);//填充矩形，默认黑色

        if (hero !=null && hero.isLive) {

            //画出自己坦克--封装方法
            drawTank(hero.getX(), hero.getY(), g, hero.getDirect(), 1);
        }
        //画出hero射击的子弹
        if (hero.shot != null && hero.shot.islive == true) {
            System.out.println("子弹被绘制……");
           // g.fill3DRect(hero.shot.x,hero.shot.y,1,1,false);
            g.draw3DRect(hero.shot.x,hero.shot.y,1,1,false);
        }


/*
        //将hero的子弹集合 shots ，遍历取出绘制
        for (int i = 0; i < hero.shots.size(); i++) {
            Shot shot = hero.shots.get(i);
            if (shot != null && shot.islive == true) {
                g.draw3DRect(shot.x,shot.y,1,1,false);
            } else {//如果该shot对象已经无效，就从shots集合中拿掉
                hero.shots.remove(shot);
            }
        }

 */

        //如果bombs 集合中有对象，就画出
        for (int i = 0; i < bombs.size(); i++) {
            //取出炸弹
            Bomb bomb = bombs.get(i);
            //根据当前这个bomb对象的life值去画出对应的图片
            if (bomb.life > 6) {
                g.drawImage(image1,bomb.x,bomb.y,60,60,this);
            } else if (bomb.life > 3){
                g.drawImage(image2,bomb.x,bomb.y,60,60,this);
            } else {
                g.drawImage(image3,bomb.x,bomb.y,60,60,this);
            }
            //让炸弹的生命值减少
            bomb.lifeDown();
            //如果bomb life 为0，就从bombs 的集合中删除
            if (bomb.life == 0) {
                bombs.remove(bomb);
            }
        }
        //画出敌人坦克，遍历vector
        for (int i = 0; i < enemyTanks.size(); i++) {
            //从Vector 取出坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //判断当前坦克是否还存活
            if(enemyTank.isLive) { //当敌人坦克是存活的，才画出该坦克
                drawTank(enemyTank.getX(),enemyTank.getY(),g,enemyTank.getDirect(),0);
                //画出 enemyTank 所有子弹
                for (int j = 0; j < enemyTank.shots.size(); j++) {
                    //取出子弹
                    Shot shot = enemyTank.shots.get(j);
                    //绘制
                    if (shot.islive) { //true
                        g.draw3DRect(shot.x, shot.y, 1, 1, false);
                    } else {
                        //从Vector 移除
                        enemyTank.shots.remove(shot);
                    }
                }

            }
        }

    }


    //编写方法，画出坦克
    /*  int x,  坦克的左上角x坐标
        int y, 坦克的左上角y坐标
        Graphics g,  画笔
        int direct,  坦克方向（上下左右）
        int type， 坦克类型
     */

    public void drawTank(int x, int y, Graphics g, int direct, int type) {

        //根据不同类型坦克，设置不同颜色
        switch (type) {
            case 0 : //敌人的坦克
                g.setColor(Color.cyan);
                break;
            case 1 : //我们的坦克
                g.setColor(Color.yellow);
                break;
        }

        //根据坦克方向，来绘制对应形状坦克
        //direct 表示方向（0:向上 1:向右 2:向下 3:向左）
        switch (direct) {
            case 0 : //表示向上
                g.fill3DRect(x,y,10,60,false);//画出坦克左边轮子
                g.fill3DRect(x + 30,y,10,60,false);//画出坦克右边轮子
                g.fill3DRect(x + 10,y + 10, 20,40,false);//画出坦克盖
                g.fillOval(x + 10,y + 20, 20,20);
                g.drawLine(x + 20, y + 30, x + 20, y); //画出炮筒
                break;
            case 1 : //表示向右
                g.fill3DRect(x,y,60,10,false);//画出坦克左边轮子
                g.fill3DRect(x,y + 30,60,10,false);//画出坦克右边轮子
                g.fill3DRect(x + 10,y + 10, 40,20,false);//画出坦克盖
                g.fillOval(x + 20,y + 10, 20,20);
                g.drawLine(x + 30, y + 20, x + 60, y + 20); //画出炮筒
                break;
            case 2 : //表示向下
                g.fill3DRect(x,y,10,60,false);//画出坦克左边轮子
                g.fill3DRect(x + 30,y,10,60,false);//画出坦克右边轮子
                g.fill3DRect(x + 10,y + 10, 20,40,false);//画出坦克盖
                g.fillOval(x + 10,y + 20, 20,20);
                g.drawLine(x + 20, y + 60, x + 20, y); //画出炮筒
                break;
            case 3 : //表示向左
                g.fill3DRect(x,y,60,10,false);//画出坦克左边轮子
                g.fill3DRect(x,y + 30,60,10,false);//画出坦克右边轮子
                g.fill3DRect(x + 10,y + 10, 40,20,false);//画出坦克盖
                g.fillOval(x + 20,y + 10, 20,20);
                g.drawLine(x + 30, y + 20, x, y+20); //画出炮筒
                break;
            default:
                System.out.println("暂时没有处理");
        }
    }
/*
    //如果我们的坦克可以发射多个子弹，在判断我方子弹是否击中坦克时，
    //需要把子弹集合中所有子弹取出和敌人的所有坦克，进行判断
    public void hitEnemyTank() {

        //遍历我们的子弹
        for (int j = 0; j < hero.shots.size(); j++) {
            Shot shot = hero.shots.get(j);

        //判断是否击中了敌人坦克
        if (shot != null && hero.shot.islive) { //当前我的子弹还存活

            //遍历敌人所有坦克
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot,enemyTank);
            }

        }

    }
    */

    //判断是否击中了敌人坦克  单颗子弹
    public void hitEnemyTank() {
        if (hero.shot != null && hero.shot.islive) { //当前我的子弹还存活

            //遍历敌人所有坦克
            for (int i = 0; i < enemyTanks.size(); i++) {
                EnemyTank enemyTank = enemyTanks.get(i);
                hitTank(hero.shot, enemyTank);
            }
        }
    }



    //编写方法，判断敌人坦克是否击中我的坦克
    public void hitHero() {
        //遍历所有敌人坦克
        for (int i = 0; i < enemyTanks.size(); i++) {
            //取出敌人坦克
            EnemyTank enemyTank = enemyTanks.get(i);
            //遍历enemyTank 对象所有子弹
            for (int j = 0; j < enemyTank.shots.size(); j++) {
                //取出子弹
                Shot shot = enemyTank.shots.get(j);
                //判断 shot 是否击中我的坦克
                if(hero.isLive && shot.islive) {
                    hitTank(shot,hero);
                }
            }
        }
    }


    //编写一个方法，判断我方的子弹是否击中敌人的坦克
    //run 方法 判断我方的子弹是否击中敌人的坦克
    //将 enemyTank 改成 tank 名称
    public  void hitTank(Shot s, Tank enemyTank) {
        //判断s 击中坦克
        switch (enemyTank.getDirect()) {
            case 0: //坦克向上
            case 2://坦克向下
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 40
                && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 60) {
                    s.islive = false;
                    enemyTank.isLive = false;
                    //当我的子弹击中敌人坦克后，将enemyTank 从Vector拿掉
                    enemyTanks.remove(enemyTank);
                    //创建Bomb对象，加入到bombs集合
                    Bomb bomb = new Bomb(enemyTank.getX(), enemyTank.getY());
                    bombs.add(bomb);
                }
                break;
            case 1://坦克向右
            case 3: //坦克向左
                if (s.x > enemyTank.getX() && s.x < enemyTank.getX() + 60
                        && s.y > enemyTank.getY() && s.y < enemyTank.getY() + 40) {
                    s.islive = false;
                    enemyTank.isLive = false;
                }
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    //处理wdsa 键 按下的情况

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) { //按下W键
            //改变坦克的方向
            hero.setDirect(0);
            //修改坦克的坐标 y -= 1
            //hero.setY(hero.getY() - 1);  //在Tank写移动方法
            if (hero.getY() > 0) {
                hero.moveUp();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_D) {//按下D键
            hero.setDirect(1);
            if (hero.getX() + 60 < 1000) {
                hero.moveRight();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_S) {//按下S键
            hero.setDirect(2);
            if (hero.getY() + 60 < 750) {
                hero.moveDown();
            }
        } else if (e.getKeyCode() == KeyEvent.VK_A) {//按下A键
            if (hero.getX() > 0) {
                hero.setDirect(3);
            }
            hero.moveLeft();
        }

        //如果用户按下的是J，就发射
        if (e.getKeyCode() == KeyEvent.VK_J) {
            System.out.println("用户按下了J，开始射击");

            //判断hero的子弹是否销毁 ，发射一颗子弹
            if (hero.shot == null || !hero.shot.islive) {
                hero.shotEnemyTank();
            }

            //发射多颗子弹
            //hero.shotEnemyTank();

        }
        //让面板重绘
        this.repaint();

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() { //每隔100毫秒，重绘区域,刷新绘图区域，子弹就移动

        while (true) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
/*
            //判断是否击中了敌人坦克
            if (hero.shot != null && hero.shot.islive) { //当前我的子弹还存活

                //遍历敌人所有坦克
                for (int i = 0; i < enemyTanks.size(); i++) {
                    EnemyTank enemyTank = enemyTanks.get(i);
                    hitTank(hero.shot,enemyTank);
                }
            }

 */

            //hitEnemyTank()

            //判断是否击中了敌人坦克
            hitEnemyTank();
            //判断敌人坦克是否击中我们
            hitHero();
            this.repaint();
        }
    }
}
