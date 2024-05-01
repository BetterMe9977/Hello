package utils;

import jakarta.servlet.http.Cookie;

//查找指定名称Cookie的工具类

public class CookieUtils {
	public static Cookie findCookie(Cookie[] cookies, String name) {
		if(cookies == null) {
			//浏览器中没有任何Cookie
			return null;
		} else {
			for(Cookie cookie : cookies) {
				//判断Cookie数组中的每个cookie的名称与给定名称是否一致
				if(name.equals(cookie.getName())) {
					//直接返回
					return cookie;
				}
			}
			//浏览器携带有cookie，但没有指定的
			return null;
		}
	}

}
