package com.hspedu.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;

public class PreparedStatement_ {
    public static void main(String[] args) throws Exception {

        //
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

        //3. 得到PreparedStatement
        //3.1 组织sql  sql 语句的 ? 就相当于占位符
        String sql = "select name, pwd from admin where name = ? and pwd = ?";

        //3.2 preparedStatement 对象是 实现了 PreparedStatement 接口实现类的对象
        PreparedStatement preparedstatement = connection.prepareStatement(sql);
        //3.3 给 ? 赋值
        preparedstatement.setString(1, admin_name);
        preparedstatement.setString(2, admin_pwd);

        //4. 执行 select 语句使用 executeQuery
        // 如果执行的是dml(update, insert, delete) executeUpdate()
        // 这里执行 executeQuery() ，不再填写 sql
        ResultSet resultSet = preparedstatement.executeQuery();

        if (resultSet.next()) { //查询到一条记录，则说明管理员存在
            System.out.println("恭喜，登录成功");
        } else {
            System.out.println("对不起，登录失败");
        }

        //关闭连接
        resultSet.close();
        preparedstatement.close();
        connection.close();
    }
}
