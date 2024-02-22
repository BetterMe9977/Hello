package jdbc.demo6;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.Test;

import jdbc.utils.JDBCUtils;

public class AddBatch {
	
	@Test
	//批处理基本操作
	public void demo1() {
		Connection conn = null;
		Statement stmt = null;
		try {
			//获得连接
			conn = JDBCUtils.getConnection();
			//创建执行批处理对象
			stmt = conn.createStatement();
			//编写一批SQL语句
			String sql1 = "create database test1";
			String sql2 = "use test1";
			String sql3 = "create table user(id int primary key auto_increment,name varchar(20))";
			String sql4 = "insert into user values (null,'aaa')";
			String sql5 = "insert into user values (null,'bbb')";
			String sql6 = "insert into user values (null,'ccc')";
			String sql7 = "update user set name = 'hhh' where id = 2";
			String sql8 = "delete from user where id = 1";
			
			//添加到批处理
			stmt.addBatch(sql1);
			stmt.addBatch(sql2);
			stmt.addBatch(sql3);
			stmt.addBatch(sql4);
			stmt.addBatch(sql5);
			stmt.addBatch(sql6);
			stmt.addBatch(sql7);
			stmt.addBatch(sql8);
			
			//执行批处理
			stmt.executeBatch();
			System.out.println("批处理成功！");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(stmt, conn);
		}
	}

}
