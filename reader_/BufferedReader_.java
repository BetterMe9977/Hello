package com.hspedu.reader_;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {
    public static void main(String[] args) throws Exception{

        String filePath = "Main.java";
        //创建bufferedReader
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取，效率高
        //说明
        //1. bufferedReader.readline() 是按行读取文件
        //2. 当返回 null 时，表示文件读取完毕
        while((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }

        //关闭流，注意：只需关闭BufferedReader，因为底层会自动地去关闭节点流
        //FileReader
        /*
        源码解读
             public void close() throws IOException {
            synchronized (lock) {
                if (in == null)
                    return;
                try {
                    in.close();  //in 就是传入的new FileReader(filePath)，关闭了
                } finally {
                    in = null;
                    cb = null;
                    }
                 }
             }
         */
        bufferedReader.close();
    }


}
