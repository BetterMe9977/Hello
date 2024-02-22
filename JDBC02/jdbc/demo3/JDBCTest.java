package jdbc.demo3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import jdbc.utils.JDBCUtils;

public class JDBCTest {
	
	@Test
	//测试使用工具类 查询操作
	public void demo1() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
		
			
			//获得连接
			conn = JDBCUtils.getConnection();
			//执行操作：
			//创建执行SQL语句对象：
			stmt = conn.createStatement();
			//编写SQL语句			
			 String sql = "select * from actor";
			//执行SQL语句
			rs = stmt.executeQuery(sql);
			//遍历结果集
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") +" " +
			rs.getString("sex") + " " + rs.getDate("borndate") + " " + rs.getString("phone"));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//释放资源
			JDBCUtils.release(rs, stmt, conn);
		
		}
	}

}
