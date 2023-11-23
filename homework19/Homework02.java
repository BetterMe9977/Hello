package com.hspedu.homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Homework02 {
    public static void main(String[] args) {
        String filePath = "story.txt";
        BufferedReader br = null;
        String line = "";
        int lineNum = 0;
        try {
             br = new BufferedReader(new FileReader(filePath));
             while ((line = br.readLine()) != null) { //循环读取
                 System.out.println(++lineNum + line);
             }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {


            try {
                if (br != null) {
                    br.close();
                }
            }catch (IOException e) {
                    e.printStackTrace();

            }
        }
    }
}
