package jdbc.demo1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//JDBC的入门程序

public class Testjdbc {
	
	public static void main(String[] args) throws Exception{
		//1. 加载驱动
		//Class.forName("com.mysql.jdbc.Driver");
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//2. 获得连接
		 Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hsp_db02", "root", "pwd");
		
		//3. 基本操作：执行SQL
		//3.1 获得执行SQL语句的对象
		 Statement statement = conn.createStatement();
		//3.2 编写SQL语句
		 String sql = "insert into actor values(null, 'tom', '男', '1998-11-11','100')";
         //String sql = "update actor set name = 'mike' where id = 4";   
		//3.3 执行SQL
		 int row = statement.executeUpdate(sql);
		
		 System.out.println("Connected to the MySQL server.");
		 System.out.println(row > 0 ? "成功" : "失败");

		//释放资源
		
		 statement.close();
		 conn.close();
	}
	

}