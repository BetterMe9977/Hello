package com.hspedu.pkg;

//注意：
//需要使用哪个类，就导入哪个类，不建议使用*导入
//import java.util.Scanner;//表示只会引入java.util 包下的 Scanner 类
//import java.util.*;//表示只会引入java.util 包下的所有类都引入（导入）

import java.util.Arrays;

public class Import01 {

    public static void main(String[] args) {
        //使用系统提供Arrays 完成数组排序
        int[] arr = {-1, 20, 2, 13, 3};
        //对其排序，传统方法是，自己编写排序（冒泡）
        //系统提供了相关的类，可以方便完成 Arrays
        Arrays.sort(arr);
        //输出排序结果
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i] + "\t");

        }

    }
}
