package cookie;

import jakarta.servlet.ServletException;
import java.sql.Date;
import java.time.LocalDate;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import utils.CookieUtils;

import java.io.IOException;
import java.sql.Date;

/**
 * 记录用户上次访问时间的Servlet
 */
public class VisitServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/**
		 * 用户访问Servlet
		 * 如果是第一次访问：您好，欢迎来到本网站
		 * 		记录当前访问时间，存到Cookie，回写到浏览器
		 * 如果不是第一次访问：从Cookie中获得上次时间，显示到页面
		 * 		记录当前访问时间，存到Cookie，回写到浏览器
		 */
		//判断是否是第一次访问：从指定的Cookie的数组中获得指定名称的Cookie
		//获得从浏览器带来的所有Cookie
		Cookie[] cookies = request.getCookies();
		//从数组中查找指定名称的Cookie
		Cookie cookie = CookieUtils.findCookie(cookies,"lastVisit");
		//判断是否是第一次访问
		if(cookie == null) {
			//是第一次访问，页面显示内容
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>您好，欢迎来到本站</h1>");		
		} else { 
			//不是第一次访问
			//获得cookie中的上次访问时间，显示到页面
			String value = cookie.getValue();
			//页面显示内容
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("<h1>您好，您的上次访问时间是:" + value + "</h1>");
		}
		//记录当前时间存到Cookie，回写到浏览器
		//Date d = new Date();
		//Cookie c = new Cookie("lastVisit",d.toLocaleString());
		LocalDate currentDate = LocalDate.now();
		Cookie c = new Cookie("lastVisit",currentDate.toString());
		
		//给Cookie设置有效路径
		c.setPath("/web03_cookie");
		//给Cookie设置有效时长
		c.setMaxAge(60*60); //设置有效时长为1小时
		//回写到浏览器
		response.addCookie(c);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
