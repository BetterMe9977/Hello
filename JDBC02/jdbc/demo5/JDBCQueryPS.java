package jdbc.demo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import jdbc.utils.JDBCUtils;

//JDBC的CRUD操作 --- PreparedStatement

public class JDBCQueryPS {
	
	@Test
	//查询操作的代码实现--查询一条记录
	
	public void demo5() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			
			//获得连接
			conn = JDBCUtils.getConnection();
			//编写SQL
			String sql = "select * from actor ";
			//预编译SQL
			pstmt = conn.prepareStatement(sql);
			//设置参数：
			
			//执行SQL语句 
			rs = pstmt.executeQuery(sql);
			//查询一条语句，不需要遍历， 判断就可以
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name") +" " +
			rs.getString("sex") + " " + rs.getDate("borndate") + " " + rs.getString("phone"));
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//释放资源
			JDBCUtils.release(rs, pstmt, conn);
			
		}
		
	}

}
