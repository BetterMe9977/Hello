package listener.weblistener;

import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {

	
	//监听HttpSession的创建
	public void sessionCreated(HttpSessionEvent se) {
		System.out.println("HttpSession对象被创建");
	}
	
	//监听HttpSession的销毁
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("HttpSession对象被销毁");
	}
}
