package sevelet.lifecycle;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//Servlet的生命周期

public class ServletDemo00 implements Servlet {
	
	//Servlet对象被实例化的时候init方法就会执行，而且执行一次
	@Override
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("ServletDemo00初始化了～");
		
	}
	
	//任何一次请求都会执行service方法，可以执行多次
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("ServletDemo00执行了～");
		
	}

	//Servlet从服务器中移除或者服务器关闭的时候销毁Servlet，执行一次
	@Override
	public void destroy() {
		System.out.println("ServletDemo00被销毁了");
		
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

	
}
