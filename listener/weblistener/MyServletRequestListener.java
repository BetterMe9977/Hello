package listener.weblistener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;

//监听ServletRequest对象的创建和销毁的监听器

public class MyServletRequestListener implements ServletRequestListener {
	

	//监听ServletRequest的创建
	public void requestDestroyed(ServletRequestEvent se) {
		System.out.println("ServletRequest对象被创建");
	}
	
	//监听ServletRequest的销毁
	public void requestInitialized(ServletRequestEvent se) {
		System.out.println("ServletRequest对象被销毁");
	}

}
