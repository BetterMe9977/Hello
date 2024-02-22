package druid;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Properties;

import javax.sql.DataSource;

import org.junit.Test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import jdbc.utils.JDBCUtils;

public class DruidDemo1 {

	@Test
	//Druid 属性文件方式配置参数
	//文件名称没有规定，属性文件中的key规定好的
	public void demo1() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//使用连接池
			//从属性文件获取
			Properties properties = new Properties();
			properties.load(new FileInputStream("src/main/java/druid.properties"));
			DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);
			//?rewriteBatchedStatements=true 
			//获得连接
			//conn = JDBCUtils.getConnection();
			conn = dataSource.getConnection();
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
