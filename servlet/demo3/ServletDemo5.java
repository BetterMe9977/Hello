package servlet.demo3;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletConfig
 */
public class ServletDemo5 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1.获取文件的MIME类型：
		ServletContext serveltcontext = this.getServletContext();
		String mimeType = serveltcontext.getMimeType("aa.text");
		System.out.println(mimeType);
		
		//2.获得请求路径的工程名
		String path = serveltcontext.getContextPath();
		System.out.println(path);
		
		//3.获得全局的初始化参数
		String username = serveltcontext.getInitParameter("username");
		String password = serveltcontext.getInitParameter("password");
		System.out.println(username + "      " + password);
		
		Enumeration<String> names = serveltcontext.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = serveltcontext.getInitParameter(name);
			System.out.println(name + "      " + value);
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
