package jdbc.demo6;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.junit.Test;

import jdbc.utils.JDBCUtils;

public class AddBatchPS {
	
	@Test
	//批处理基本操作 --PreparedStatement
	//默认情况下MySQL的批处理没有开启，需要在url后面拼接一个参数即可
	
	public void demo1() {
		//记录开始时间
		long begin = System.currentTimeMillis();
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			//获得连接
			conn = JDBCUtils.getConnection();
			//编写SQL语句
			String sql = "insert into user values (null,?)";
			//预编译SQL
			pstmt = conn.prepareStatement(sql);
			for (int i = 1; i<=100;i++) {
				pstmt.setString(1, "name"+i);
				//添加批量处理
				pstmt.addBatch();
				//注意：容易导致内存溢出
				if(i % 10 == 0){
					//执行批处理
					pstmt.executeBatch();
					//清空批处理
					pstmt.clearBatch();
				}
				
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			JDBCUtils.release(pstmt, conn);
		}
		long end = System.currentTimeMillis();
		System.out.println(end-begin);
	}

}
