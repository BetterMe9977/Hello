package com.hspedu.jdbc.utils;
import java.io.FileInputStream;
import java.sql.*;
import java.io.IOException;
import java.util.Properties;
//这是一个工具类，完成mysql的连接和关闭资源
public class JDBCUtils {

    //定义相关的属性（4个），只需要一份，做出static
    private static String user; // 用户名
    private static String password; // 密码
    private static String url;  // url
    private static String driver; // 驱动

    //在static代码块中去初始化
    static {

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("src//mysql.properties"));
            //读取相关属性值
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            url = properties.getProperty("url");
            driver = properties.getProperty("driver");
        } catch (IOException e) {
            //1. 将编译已成转成 运行异常
            //2. 调用者可以选择捕获该异常，也可以选择默认处理该异常，比较方便
           throw new RuntimeException(e);
        }

    }

    //编写方法，连接数据库，返回Connection
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            //1. 将编译异常转成 运行异常
            //2. 调用者可以选择捕获该异常，也可以选择默认处理该异常
            throw new RuntimeException(e);
        }
    }

    //关闭相关资源
    /*
        1. ResultSet 结果集
        2. Statement 或者 PreparedStatement
        3. Connection
        4. 如果需要关闭资源，就传入对象，否则传入null
     */
    public static void close(ResultSet set, Statement statement, Connection connection) {

        //判断是否为null
        try {
            if(set != null) {
                set.close();
            }
            if(statement != null) {
                statement.close();
            }
            if(connection != null) {
                connection.close();
            }
        } catch (SQLException e) {
            //将编译异常转成运行异常抛出
            throw new RuntimeException(e);
        }

    }
}
