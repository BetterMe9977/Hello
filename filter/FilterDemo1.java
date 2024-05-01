package filter;

import java.io.IOException;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

public class FilterDemo1 implements Filter {
	
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println("FilterDemo1被创建了");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("FilterDemo1被执行了");
		//放行
		chain.doFilter(request,response);
		System.out.println("FilterDemo1执行结束了");
		
	}
	
	public void destroy() {
		System.out.println("FilterDemo1被销毁了");
	}
	

}
