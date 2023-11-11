package com.hspedu.homework;

import org.junit.jupiter.api.Test;

import java.nio.file.attribute.UserPrincipal;
import java.util.List;

public class Homework01 {
    public static void main(String[] args) {

    }

    @Test
    public void testList() {

        //这里T 指定 User
        DAO<User> dao = new DAO<>();
        dao.save("001",new User(1,10,"jack"));
        dao.save("002",new User(2,18,"king"));
        dao.save("003",new User(3,38,"smith"));

        List<User> list = dao.list();
        System.out.println("list=" + list);

        dao.update("003",new User(3,58,"milan"));
        System.out.println("==============修改后===============");
        list = dao.list();
        System.out.println("list=" + list);

        dao.delete("001"); //删除
        System.out.println("==============删除后===============");
        list = dao.list();
        System.out.println("list=" + list);

        System.out.println("id=003" + dao.get("003"));
    }
}
