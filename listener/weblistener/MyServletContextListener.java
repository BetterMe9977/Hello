package listener.weblistener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

//监听器
//事件源和监听器绑定：通过配置方式绑定

public class MyServletContextListener implements ServletContextListener {
	
	//监听ServletContext对象的创建
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("ServletContext对象被创建了...");
	}
	
	//监听ServletContext对象的销毁
	public void contextDestoryed(ServletContextEvent sce) {
		System.out.println("ServletContext对象被销毁了...");
	}
}
