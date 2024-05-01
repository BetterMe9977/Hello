package filter;

import java.io.IOException;
import java.util.Enumeration;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

//FilterConfig

public class FilterDemo4 implements Filter{
	

	public void init(FilterConfig filterConfig) throws ServletException {
		//获得过滤器的名称
		String filterName = filterConfig.getFilterName();
		System.out.println(filterName);
		//获得初始化参数
		String username = filterConfig.getInitParameter("username");
		String password = filterConfig.getInitParameter("password");
		System.out.println(username);
		System.out.println(password);
		//获得所有初始化参数的名称
		Enumeration<String> names = filterConfig.getInitParameterNames();
		while(names.hasMoreElements()) {
			String name = names.nextElement();
			String value = filterConfig.getInitParameter(name);
			System.out.println(name + " " + value);
		}
		
	}
	
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		
	}
	
	public void destroy() {
		System.out.println("FilterDemo4被销毁了");
	}
	

}
