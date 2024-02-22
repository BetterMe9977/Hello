package servlet.demo1;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//Servlet 入门程序

public class HelloServlet implements Servlet {

//	用来处理客户的请求，并且对请求做出响应的方法
	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
//		向页面输出一个HelloServlet字符串
		resp.getWriter().println("Hello Servlet...");
	}
	
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	

}
