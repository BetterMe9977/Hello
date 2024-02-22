package response.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  设置响应的状态码
 * 使用状态码和Location头完成重定向
 */
public class ResponseDemo1 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//设置响应的状态码
		//response.setStatus(404);
		
		//完成重定向1
		//response.setStatus(302);
		//设置相应头
		//response.setHeader("Location","/web01/ResponseDemo2");
		
		//完成重定向2
		//response.sendRedirect("/web01/ResponseDemo2");
		
		//定时刷新
		response.setContentType("text/html;charset=UTF-8");
		response.getWriter().println("5秒以后页面跳转！");
		response.setHeader("Refresh", "5;url=/web01/ResponseDemo2");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
