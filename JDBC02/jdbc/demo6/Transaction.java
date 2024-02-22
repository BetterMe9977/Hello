package jdbc.demo6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.junit.Test;

import jdbc.utils.JDBCUtils;



public class Transaction {
	
	
	@Test
	
	public void demo1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			
			//获得连接
			conn = JDBCUtils.getConnection();
			//开启事务
			conn.setAutoCommit(false);
			//编写SQL语句
			String sql = "update account set money = money + ? where name = ?";
			//预编译SQL
			pstmt = conn.prepareStatement(sql);
			//设置参数
			//用aaa账号给bbb账号转1000元
			pstmt.setDouble(1, -1000);
			pstmt.setString(2, "aaa");
			//执行SQL：扣除aaa账号1000元
			pstmt.executeUpdate();
			
			int i = 1/0; //会出现异常
			
			//给bbb账号加1000
			pstmt.setDouble(1, 1000);
			pstmt.setString(2, "");
			pstmt.executeUpdate();
			
			//提交事务
			conn.commit();
		} catch(Exception e) {
			//回滚事务
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
	
		}
		
}
