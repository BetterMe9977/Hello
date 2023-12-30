package com.hspedu.jdbc;


import org.junit.jupiter.api.Test;
import com.mysql.cj.jdbc.Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

// 分析java连接mysql 的5种方式
public class JdbcConn {

    //方式1
    @Test
    public void connect01() throws SQLException {
        //com.mysql.jdbc.Driver
        //com.mysql.cj.jdbc.Driver
        Driver driver = new Driver(); //创建driver对象
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        // 将用户名和密码 放到 properties 对象
        Properties properties = new Properties();
        // 说明： user 和 password 是规定好的，后面的值根据实际情况写
        properties.setProperty("user", "root"); //用户
        properties.setProperty("password", "mysqlpwd"); //密码

        Connection connect = driver.connect(url, properties);
        System.out.println(connect);
    }

    //方式2
    @Test
    public void connect02() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {
        // 使用反射加载Driver类, 动态加载，更加灵活，减少依赖
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();

        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        // 将用户名和密码 放到 properties 对象
        Properties properties = new Properties();
        // 说明： user 和 password 是规定好的，后面的值根据实际情况写
        properties.setProperty("user", "root"); //用户
        properties.setProperty("password", "mysqlpwd"); //密码

        Connection connect = driver.connect(url, properties);
        System.out.println("方式2=" + connect);
    }

    //方式3  使用DriverManager 替代 Driver 进行统一管理

    @Test
    public void connect03() throws ClassNotFoundException, InstantiationException, IllegalAccessException, SQLException {

        //使用反射加载Driver
        Class<?> aClass = Class.forName("com.mysql.cj.jdbc.Driver");
        Driver driver = (Driver)aClass.newInstance();

        //创建url 和 password
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "mysqlpwd";

        DriverManager.registerDriver(driver); //注册Driver驱动

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("方式3=" + connection);

    }

    //方式4: 使用Class.forName 自动完成注册驱动，简化代码
    // 这种方式获取连接使用最多

    @Test
    public void connect04() throws ClassNotFoundException, SQLException {

        //使用反射加载了Driver类
        //在加载Driver类时，完成注册
        Class.forName("com.mysql.cj.jdbc.Driver");

        //创建url 和 password
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "mysqlpwd";

        Connection connection = DriverManager.getConnection(url, user, password);
        System.out.println("方式4=" + connection);
    }

    //方式5 ： 在方式4的基础上改进，增加配置文件，让连接mysql更加灵活
    @Test
    public void connect05() throws IOException, ClassNotFoundException, SQLException {

        //通过Properties对象获取配置文件的信息
        Properties properties = new Properties();
        properties.load(new FileInputStream("src//mysql.properties"));
        //获取相关的值
        String user = properties.getProperty("user");
        String password = properties.getProperty("password");
        String url = properties.getProperty("url");
        String driver = properties.getProperty("driver");

        Class.forName(driver);

        Connection connection = DriverManager.getConnection(url, user, password);

        System.out.println("方式5=" + connection);

    }
}
