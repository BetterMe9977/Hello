package servlet.demo3;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class ServletConfig
 */
public class ServletDemo4 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获得初始化参数的API
		//获得ServletConfig对象：
		ServletConfig config = this.getServletConfig();
		String username = config.getInitParameter("username");
		String password = config.getInitParameter("password");
		System.out.println(username + "      " + password);
		//2.获得所有初始化参数的名称
		Enumeration<String> names = config.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = config.getInitParameter(name);
			System.out.println(name + "      " + value);
		}
		//3.获得servlet的名称
		String servletName = config.getServletName();
		System.out.println(servletName);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
