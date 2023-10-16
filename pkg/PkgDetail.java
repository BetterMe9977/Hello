//package 的作用是声明当前类所在的包，需要放在类/文件的最上面
//一个类中最多只有一句package
package com.hspedu.pkg;

//import 指令放在package 的下面，在类定义前面，可以有多句且没有顺序要求

import java.util.Arrays;
import java.util.Scanner;
// ...

//类定义
public class PkgDetail {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, -1, 1};
        Arrays.sort(args);

    }
}
