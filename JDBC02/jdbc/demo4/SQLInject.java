package jdbc.demo4;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import jdbc.utils.JDBCUtils;

public class SQLInject {
	
	//SQL注入
	
	public boolean login(String id,String name) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		//定义一个变量
		boolean flag = false;
			try {
				//获得连接
				conn = JDBCUtils.getConnection();
				//完成登录功能
				//创建执行SQL语句的对象
				stmt = conn.createStatement();
				String sql = "select * from actor where id = '"+id+"' and name = '"+name+"' ";
				//执行SQL
				rs = stmt.executeQuery(sql);
				if(rs.next()) {
					//说明根据用户名和密码可以查询到这条记录
					flag = true;
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				JDBCUtils.release(rs,stmt,conn);
			}
			return flag;
	}

}
