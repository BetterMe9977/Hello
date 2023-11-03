package com.hspedu.Stringbuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        //1. StringBuffer 的直接父类是 AbstractStringBuilder
        //2. StringBuffer 实现了 Serializable, 即 StringBuffer 的对象可以串行化
        //3. 在父类中 AbstractStringBuilder 有属性char[] value,不是final
        //   该 value 数组存放 字符串内容，因此存放在堆中，不在常量池
        //4. StringBuffer 是一个final类，不能被继承
        //5. 因为StringBuffer 字符内容是存在char[] value ， 所以在变化（增加/删除）时，
        // 不用每次都更换地址（即不是每次创建新对象），所以比String 高效
        StringBuffer stringBuffer = new StringBuffer("hello");
    }
}
