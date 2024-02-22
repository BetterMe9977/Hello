package jdbc.demo5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import jdbc.utils.JDBCUtils;

//JDBC的CRUD操作--- PreparedStatement

public class JDBCInsertPS {
	
	@Test
	//保存操作的代码实现
	public void demo1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			
			//获得连接
			conn = JDBCUtils.getConnection();
			
			//编写SQL语句：				
			String sql = "insert into actor values(null,?,?,?,?)";
			
			//预编译SQL
			pstmt = conn.prepareStatement(sql);
			//设置参数 (null, 'jack', '男', '1998-11-11','100')
			pstmt.setString(1, "mary");
			pstmt.setString(2, "女");
			pstmt.setString(3, "1998-11-11");
			pstmt.setString(4, "122");
			
			//执行SQL
			//执行SQL语句
			int num = pstmt.executeUpdate();
			if(num > 0) {
				System.out.println("保存用户成功！");
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			//释放资源
			JDBCUtils.release(pstmt,conn);
		}
		
	}

}
