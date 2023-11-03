package com.hspedu.Stringbuffer_;

public class StringBufferExercise02 {
    public static void main(String[] args) {
     /*
     分析：
     1. 定义一个Scanner 对象，接收用户的输入    价格（String）
     2. 希望使用到 StringBuffer 的insert ，需要将 String 转成 StringBuffer
     3. 然后使用相关方法进行字符串的处理
      */
     //new Scanner
         String price = "8123564.59";
        StringBuffer sb = new StringBuffer(price);

        //实现 123564.59  找到小数点的索引，然后在该位置的前3位，插入,即可
        // int i = sb.lastIndexOf(".");
        // sb = sb.insert(i-3,",");
        //需要做一个循环处理

        for (int i = sb.lastIndexOf(".")-3; i > 0 ; i -= 3) {
            sb = sb.insert(i,",");
        }
        System.out.println(sb);

    }
}
