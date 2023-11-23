package com.hspedu.properties_;


import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Properties3 {
    public static void main(String[] args) throws IOException {
        //使用 Properties 类来创建配置文件，修改配置文件内容

        Properties properties = new Properties();

        //创建文件
        //1. 如果该文件没有key 就是创建
        //2. 如果该文件有key 就是修改
        properties.setProperty("charset", "utf8");
        properties.setProperty("user","汤姆"); //保存的是 中文的unicode码值
        properties.setProperty("pwd","888888");

        //将k-v 存储到文件中
        properties.store(new FileOutputStream("src/mysql.properties"),null);
        System.out.println("保存配置文件成功～");

    }
}
