package jdbc.demo2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

//JDBC的CRUD操作

public class JDBCQuery {
	
	@Test
	//查询操作的代码实现 --查询多条记录
	
	public void demo4() {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			//注册驱动
			Class.forName("com.mysql.cj.jdbc.Driver");
			//获得连接
			conn = DriverManager.getConnection("jdbc:mysql:///hsp_db02","root","pwd");
			//执行操作：
			//创建执行SQL语句对象：
			stmt = conn.createStatement();
			//编写SQL语句
			//String sql = "insert into actor values(null, 'jack', '男', '1998-11-11','100')";
			//String sql = "update actor set name = 'mike' where id = 8";   
            //String sql = "delete from actor where id = 6";
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
			if(rs != null) {
				try {
					stmt.close();
				} catch(SQLException e) {
					e.printStackTrace();
				} 
				rs = null;
			}
			if(stmt != null) {
				try {
					stmt.close();
				} catch(SQLException e) {
					e.printStackTrace();
				} 
				stmt = null;
			}
			if(conn != null) {
				try {
					conn.close();
			} catch(SQLException e) {
				e.printStackTrace();
			} 
			conn = null;
			}
		}
		
	}

}
