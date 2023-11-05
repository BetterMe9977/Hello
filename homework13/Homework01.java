package com.hspedu.homework;

public class Homework01 {
    public static void main(String[] args) {

        //测试


        String str = "abcdef";
        System.out.println("====交换前====");
        System.out.println(str);
        try {
            str = reverse(str, 1, 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("====交换后====");
        System.out.println(str);

    }
        /*
        将“abcdef” 反转为 “aedcbf”
        编写方法 public static String reverse(String str, int start, int end) 搞定

         */

    public static String reverse(String str, int start, int end) {

        //ArrayIndexOutOfBoundsException
        //1）先写出正确情况，再取反
        //  这样写思路清晰

        if (! (str != null && start >= 0 && end >start && end < str.length())) {
            throw new RuntimeException("参数不正确");
        }
        char[] chars = str.toCharArray();
        char temp = ' ';
        for (int i = start, j = end; i < j; i++, j--) {
            temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
        }
        //使用chars 重新构建一个String 返回即可
        return new String(chars);
    }

}
