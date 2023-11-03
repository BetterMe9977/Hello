package com.hspedu.Stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {

        StringBuffer s = new StringBuffer("hello");
        //增
        s.append(',');
        s.append("jack");
        s.append("tom").append("100").append("true").append(10.5);
        System.out.println(s);

        //删
        /*
        删除索引为 >= start && <end 处的字符
         */
        //删除[11-14)的字符
        s.delete(11,14);
        System.out.println(s);

        //改
        //使用hi 替换索引[9,11) 的字符
        s.replace(9,11,"hi");
        System.out.println(s);

        //查找指定的字串在字符串第一次出现的索引，如果找不到返回-1
        int indexOf = s.indexOf("true");
        System.out.println(indexOf);

        //插
        //索引为9的位置插入 smile ，原来索引为9的内容自动后移
        s.insert(9,"smile");
        System.out.println(s);

        //长度
        System.out.println(s.length());
        System.out.println(s);
    }
}
