package servlet.demo3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * web项目中的读取文件
 */
public class ServletDemo6 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//test1();
		//test2();
		test3();
	}
	
	/**
	 * web项目中的读取文件, 使用ServletContext方式：
	 */
	//传统方式读取文件
			private void test3() throws FileNotFoundException, IOException {
				//使用ServletContext方式：
				Properties properties = new Properties();
				
				//创建一个文件的输入流
				//InputStream is = new FileInputStream("classes/db.properties");
				//InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
				String path = this.getServletContext().getRealPath("/WEB-INF/classes/db.properties"); //绝对路径
				System.out.println(path);
				InputStream is = new FileInputStream(path);
				properties.load(is);
				
				//获取数据
				String driverClassName = properties.getProperty("driverClassName");
				String url = properties.getProperty("url");
				String username = properties.getProperty("username");
				String password = properties.getProperty("password");
				//输出到控制台
				System.out.println(driverClassName);
				System.out.println(url);
				System.out.println(username);
				System.out.println(password);
			}
	
	
		private void test2() throws FileNotFoundException, IOException {
			//使用ServletContext方式：
			Properties properties = new Properties();
			//创建一个文件的输入流
			//FileInputStream is = new FileInputStream("classes/db.properties");
			InputStream is = this.getServletContext().getResourceAsStream("/WEB-INF/classes/db.properties");
			properties.load(is);
			//获取数据
			String driverClassName = properties.getProperty("driverClassName");
			String url = properties.getProperty("url");
			String username = properties.getProperty("username");
			String password = properties.getProperty("password");
			//输出到控制台
			System.out.println(driverClassName);
			System.out.println(url);
			System.out.println(username);
			System.out.println(password);
		}
	
		/**
		 * web项目中的读取文件
		 */
	//传统方式读取文件
	private void test1() throws FileNotFoundException, IOException {
		//传统方式
		Properties properties = new Properties();
		//创建一个文件的输入流
		InputStream is = new FileInputStream("classes/db.properties");
		properties.load(is);
		//获取数据
		String driverClassName = properties.getProperty("driverClassName");
		String url = properties.getProperty("url");
		String username = properties.getProperty("username");
		String password = properties.getProperty("password");
		//输出到控制台
		System.out.println(driverClassName);
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
}
