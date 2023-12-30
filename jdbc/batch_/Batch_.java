package com.hspedu.jdbc.batch_;

import com.hspedu.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;


// 演示java的批处理
public class Batch_ {

    // 传统方法，添加5000条数据到admin2
    @Test
    public void noBatch() throws Exception {

        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis(); //开始时间

        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            preparedStatement.executeUpdate();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统的方式 耗时=" + (end- start)); //传统的方式 耗时=728
        //关闭连接
        JDBCUtils.close(null, preparedStatement, connection);

    }

    //使用批量方式添加数据
    @Test
    public void batch() throws Exception {

        Connection connection = JDBCUtils.getConnection();
        String sql = "insert into admin2 values(null, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        System.out.println("开始执行");
        long start = System.currentTimeMillis(); //开始时间

        for (int i = 0; i < 5000; i++) {
            preparedStatement.setString(1, "jack" + i);
            preparedStatement.setString(2, "666");
            //将sql语句加入到批处理包中
            preparedStatement.addBatch();
            //当有1000条记录时，再批量执行
            if ((i + 1) % 1000 == 0) { //满1000条sql
                preparedStatement.executeBatch();
                //清空
                preparedStatement.clearBatch();

            }
        }
        long end = System.currentTimeMillis();
        System.out.println("批量方式 耗时=" + (end- start)); // 批量方式 耗时=61
        //关闭连接
        JDBCUtils.close(null, preparedStatement, connection);

    }
}




