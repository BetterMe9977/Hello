package com.hspedu.writer_;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
    public static void main(String[] args) {
        String filePath = "note.txt";
        //创建 FileWriter 对象
        FileWriter fileWriter = null;
        char[] chars = {'a', 'b', 'c'};
        try {
            fileWriter = new FileWriter(filePath); //默认是覆盖写入
            //write(int): 写入单个字符
            fileWriter.write('H');
            //write(char[]): 写入指定数组
            fileWriter.write(chars);
            //write(char[],off,len): 写入指定数组的指定部分
            fileWriter.write("韩顺平教育".toCharArray(),0,3);
            //write(String): 写入整个字符串
            fileWriter.write(" 你好北京～");
            fileWriter.write(" 风雨之后，定见彩虹～");
            //write(String,off,len): 写入字符串的指定部分
            fileWriter.write("上海天津",0,2);
            //在数据量大的情况下，可以使用循环操作
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //对于FileWrite，一定要关闭流，或者flush才能真正把数据写入到文件
            try {
                //fileWriter.flush();
                //关闭文件流，等价 flush() + 关闭
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
