package response.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletOutputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

/**
 * Response 响应中文处理
 */
public class ResponseDemo3 extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//使用字节流的方式输出中文：
		//test1(response);
		
		//使用字符流的方式输出
		test2(response);

	}

	//使用字符流的方式输出中文：
		private void test2(HttpServletResponse response) throws IOException, UnsupportedEncodingException {
			//设置浏览器默认打开的时候采用的字符集
			//response.setHeader("Content-type","text/html;charset=UTF-8");
			//设置中文转成字节数组字符集编码
			//response.setCharacterEncoding("utf-8");
			//简化代码
			response.setContentType("text/html;charset=UTF-8");
			response.getWriter().println("中文");
		}

	//使用字节流的方式输出中文：
	private void test1(HttpServletResponse response) throws IOException, UnsupportedEncodingException {
		//使用字节流的方式输出中文：
		ServletOutputStream outputStream = response.getOutputStream();
		//设置浏览器默认打开的时候采用的字符集
		response.setHeader("Content-type","text/html;charset=UTF-8");
		//设置中文转成字节数组字符集编码
		outputStream.write("中文".getBytes("utf-8"));
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
