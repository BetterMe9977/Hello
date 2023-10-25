package com.hspedu.houserent.utils;

public class Utility {



    public static char readConfirmSelection() {
        System.out.println("请输入你的选择(Y/N)，小心选择：");
        char c;
        for (; ; ) { //无限循环
            //在这里，将接收到的字符，转成了大写字母
            //y -- > Y  ，  n --> N
            String str = readkeyBoard(1, false).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'Y' ) {
                break;
            } else {
                System.out.println("选择错误，请重新输入：");
            }
        }
        return c;
    }

}




