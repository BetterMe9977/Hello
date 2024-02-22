package jdbc.demo4;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.utils.JDBCUtils;

public class SQLInject2 {
	
	//SQL注入
	
	public boolean login(String id,String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//定义一个变量
		boolean flag = false;
			try {
				//获得连接
				conn = JDBCUtils.getConnection();
				
				//编写SQL语句：				
				String sql = "select * from actor where id = ? and name = ?";
				
				//预编译SQL
				pstmt = conn.prepareStatement(sql);
				//设置参数
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				//执行SQL
				rs = pstmt.executeQuery();
				if(rs.next()) {
					//说明根据用户名和密码可以查询到这条记录
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtils.release(rs,pstmt,conn);
			}
			return flag;
	}

}
