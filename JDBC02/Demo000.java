import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;

public class Demo000 {
	public static void main(String[] args) {
		
		//1. 注册驱动
		//Driver driver = new Driver();
		// JDBC URL, username, and password of MySQL server
        String url = "jdbc:mysql://localhost:3306/hsp_db02";
        String user = "root";
        String password = "pwd";

        // JDBC variables for opening, closing, and managing connection
        Connection connection = null;
        Statement statement = null;
        try {
            // Opening database connection to MySQL server
            connection = DriverManager.getConnection(url, user, password);

            // Do something with the connection (e.g., execute SQL queries)
            String sql = "insert into actor values(null, 'tom', '男', '1998-11-11','100')";
            //String sql = "update actor set name = 'mike' where id = 4";   
            //String sql = "delete from actor where id = 4";
            //statement 用于执行静态SQL语句并返回其生成的结果的对象
            statement = connection.createStatement();
            int rows = statement.executeUpdate(sql); //如果是sql语句，返回的就是影响行数
            
            System.out.println("Connected to the MySQL server.");
        } catch (SQLException e) {
            System.out.println("Error connecting to the MySQL server: " + e.getMessage());
        } finally {
        	
            // Closing the connection
            if (connection != null) {
                try {
                	statement.close();
                    connection.close();
                    System.out.println("Disconnected from the MySQL server.");
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            
        }
        
	}
}
