package com.hspedu.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {

        //exit 退出当前程序

        System.out.println("ok1");
        //1. exit(0) 表示程序退出
        //2. 0 表示一个状态，正常的状态
       // System.exit(0);
        System.out.println("ok2");

        //arraycopy: 复制数组元素，比较适合底层调用
        // 一般使用Array.copyOf 完成复制数组
        int[] src = {1,2,3};
        int[] dest = new int[3]; // dest 当前是{0,0,0}
        System.arraycopy(src,0,dest,0,src.length);
        System.out.println("dest=" + Arrays.toString(dest));

        //currentTimeMillis : 返回当前时间距离1970-1-1 的毫秒数
        System.out.println(System.currentTimeMillis());

    }
}
