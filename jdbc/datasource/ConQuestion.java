package com.hspedu.jdbc.datasource;

import com.hspedu.jdbc.utils.JDBCUtils;
import org.junit.jupiter.api.Test;

import java.sql.Connection;

public class ConQuestion {

    //代码 连接mysql 5000次
    @Test
    public void testCon() {

        //连接-关闭 connection 会耗用多久
        long start = System.currentTimeMillis();
        System.out.println("开始连接……");
        for (int i = 0; i < 5000; i++) {
            //使用传统的jdbc方式得到连接
            Connection connection = JDBCUtils.getConnection();
            //.......
            // too many connections
            //关闭
            JDBCUtils.close(null,null,connection);
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方式5000次 耗时=" + (end - start)); //传统方式5000次 耗时=48524
    }
}
