package com.hspedu.properties_;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Properties01 {
    public static void main(String[] args) throws IOException {


        //读取mysql.properties文件，并得到 ip,user 和 pwd
        BufferedReader br = new BufferedReader(new FileReader("src/mysql.properties"));
        String line = " ";
        while ((line = br.readLine()) != null) { //循环读取
            //System.out.println(line);
            String[] split = line.split("="); //拆开
            //System.out.println(split[0] + "值是：" + split[1]);
            //如果要求指定ip值
            if("ip".equals(split[0])) {
                System.out.println(split[0] + "值是：" + split[1]);
            }


        }

        br.close();
    }
}
