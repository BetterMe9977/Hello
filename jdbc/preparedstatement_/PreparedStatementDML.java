package com.hspedu.jdbc.preparedstatement_;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;
import java.util.Scanner;

//演示 PreparedStatement 使用 dml 语句

public class PreparedStatementDML {
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
        //3.1 组织sql, sql 语句的 ? 就相当于占位符
        // 添加记录
        String sql = "insert into admin values(?,?)";
        String sql2 = "update admin set pwd = ? where name = ?";
        String sql3 = "delete from admin where name = ?";
        //3.2 preparedStatement 对象是 实现了 PreparedStatement 接口实现类的对象
        PreparedStatement preparedstatement = connection.prepareStatement(sql2);
        //3.3 给 ? 赋值
        //preparedstatement.setString(1, admin_name);
       // preparedstatement.setString(2, admin_pwd);

        preparedstatement.setString(1, admin_pwd);
        preparedstatement.setString(2, admin_name);

        preparedstatement.setString(1, admin_name);

        //4. 执行 dml 语句 使用 executeUpdate
        int rows = preparedstatement.executeUpdate();
        System.out.println(rows > 0 ? "执行成功" : "执行失败");
        //关闭连接
        preparedstatement.close();
        connection.close();
    }
}
