package jdbc.datasource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



import org.junit.Test;

import jdbc.utils.JDBCUtils;

public class DataSourceDemo1 {
	
	//测试自定义连接池
	@Test
	public void demo1() {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MyDataSource datasource = null;
		try {
			//获得连接
			//conn = JDBCUtils.getConnection();
			
			//从连接池中获得连接
			datasource = new MyDataSource();
			conn = datasource.getConnection();
			//编写SQL
			String sql = "select * from user";
			//预编译SQL
			pstmt = conn.prepareStatement(sql);
			//设置参数
			//执行SQL
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("id") + " " + rs.getString("name"));
			}
			
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			JDBCUtils.release(rs, pstmt, conn);  //conn的close改写为归还，而不是销毁
//			if(rs != null) {
//				try {
//					rs.close();
//				} catch(SQLException e) {
//					e.printStackTrace();
//				}
//			}
//			if(pstmt != null) {
//				try {
//					pstmt.close();
//				} catch(SQLException e) {
//					e.printStackTrace();
//				}
//			}
			//归还连接
			//datasource.addBack(conn);
		}
	}
}
