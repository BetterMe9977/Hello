package jdbc.demo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import jdbc.utils.JDBCUtils;

//JDBC的CRUD操作 ---- PreparedStatement

public class JDBCUpdatePS {
	
	@Test
	//修改操作的代码实现
	public void demo2() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//获得连接
			conn = JDBCUtils.getConnection();
			//编写SQL语句
			String sql = "update actor set name = ? where id = ?";  
			//预编译SQL
			pstmt = conn.prepareStatement(sql);
			//设置参数
			pstmt.setString(1, "chiko");
			pstmt.setInt(2, 8);
			
			//执行SQL语句
			int num = pstmt.executeUpdate();
			if(num > 0) {
				System.out.println("修改用户成功！");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//释放资源
			JDBCUtils.release(pstmt,conn);
		}
		
	}

}
