package com.hspedu.outputstream_;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;


public class ObjectOutputStream_ {
    public static void main(String[] args) throws Exception {

        //序列化后，保存的文件格式，不是纯文本，而是按照他的格式保存
        String filePath = "data.dat";

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath));

        //序列化数据到 data.dat
        oos.writeInt(100); //底层自动装箱 int -> Integer (实现了 Serializable)
        //序列化具备可继承性，如果某类已经实现了序列化，则它的所有子类也已经默认实现了序列化
        //Integer 的 父类 Number 实现了Serializable
        oos.writeBoolean(true); //boolean -> Boolean (实现了Serializable)
        oos.writeChar('a'); //char -> Character (实现了 Serializable)
        oos.writeDouble(9.5);//double -> Double (实现了 Serializable)
        oos.writeUTF("韩顺平教育");//String
        //保存一个dog对象
        oos.writeObject(new Dog("旺财", 10));

        oos.close();
        System.out.println("数据保存完毕(序列化形式)");
    }
}

