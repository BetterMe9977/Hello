package com.hspedu.stringbuilder_;

public class StringBuilder01 {
    public static void main(String[] args) {
        //1. StringBuilder 的直接父类是 AbstractStringBuilder
        //2. StringBuilder 实现了 Serializable, 即 StringBuilder 的对象可以串行化
        //    (对象可以网络传输，可以保存到文件)
        //3. StringBuilder 对象字符序列仍然在父类中 AbstractStringBuilder 有属性char[] value,
        // 不是final ，该 value 数组存放 字符串内容，因此存放在堆中，不在常量池
        //4. StringBuffer 是一个final类，不能被继承
        //5. StringBuilder  的方法 没有做互斥的处理，即没有synchronized 关键字，
        //   因此在单线程的情况下使用StringBuilder
        StringBuilder stringBuilder = new StringBuilder();
    }
}
