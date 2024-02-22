package request.demo1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *  Request接收中文数据
 */
public class RequestDemo3 extends HttpServlet {
	
	//演示get方式处理中文乱码
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收数据
		/**
		 *产生乱码的原因：
		 *get方式提交的数据在请求行的url后面，在地址栏上已经进行了一次URL编码了
		 *解决方案：
		 *将存入到request缓冲区中的值以ISO-8859-1的方式获取到，以UTF-8的方式进行解码
		 *String encode = URLEncode.encode(name,"ISO-8859-1");
		 *String decode = URLDecode.decode(encode,"UTF-8");
		 *System.out.println("姓名：" + decode);
		 */
		/**
		 * 用String的构造方法
		 *String value = new String(name.getBytes("ISO-8859-1"),"UTF-8");	 
		 *System.out.println("姓名：" + value);
		 */
		String name = request.getParameter("name");
		System.out.println("姓名：" + name);
	}

	/**
	 *演示post方式处理中文乱码
	 *
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//接收数据
		/**
		 *产生乱码的原因：
		 *post方式提交的数据在请求体中，request对象接收到数据后，放入request缓冲区中，
		 *缓冲区编码默认ISO-8859-1的方式，不支持中文
		 *解决方案：
		 *将request缓冲区中编码修改成UTF-8的方式
		 *request.setCharacterEncoding("UTF-8");
		 *
		 */
		String name = request.getParameter("name");
		System.out.println("姓名：" + name);
	}

}
