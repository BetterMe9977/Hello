package com.hspedu.jdbc.statement_;

// 演示statement 的注入问题

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;
import java.util.Scanner;

public class Statement_ {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        //让用户输入管理员名和密码
        System.out.println("请输入管理员的名字：");
        //scanner.next()  当接收到空格或者‘ 就表示结束，这里使用scanner.nextLine()
        String admin_name = scanner.nextLine();
        System.out.println("请输入管理员的密码：");
        String admin_pwd = scanner.nextLine();

        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src//mysql.properties"));


        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        //1. 注册驱动
        Class.forName(driver);

        //2. 得到连接
        Connection connection = DriverManager.getConnection(url, user, password);

        //3. 得到Statement
        Statement statement = connection.createStatement();

        //4. 组织sql
        String sql = "select name, pwd from admin where name = '"
               + admin_name + "' and pwd = '" + admin_pwd + "'";
        //执行给定的SQL语句，该语句返回单个ResultSet对象
        ResultSet resultSet = statement.executeQuery(sql);

        if (resultSet.next()) { //查询到一条记录，则说明管理员存在
            System.out.println("恭喜，登录成功");
        } else {
            System.out.println("对不起，登录失败");
        }

        //关闭连接
        resultSet.close();
        statement.close();
        connection.close();
    }
}
