package servlet.demo2;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//Servlet 入门程序

public class ServletDemo1 extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 如果是get请求就会执行doGet的代码
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 如果是post请求就会执行doPost请求
		resp.getWriter().println("ServletDemo1...");
	}
	
//	用来处理客户的请求，并且对请求做出响应的方法
//	@Override
//	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//	}


	
	
	

}
